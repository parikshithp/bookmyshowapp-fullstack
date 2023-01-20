package com.bookmyshow.controller;


import java.util.List;
import java.util.stream.Collectors;

import com.bookmyshow.Dto.EventCreateDto;
import com.bookmyshow.Dto.EventResponseDto;
import com.bookmyshow.entity.AppUser;
import com.bookmyshow.entity.Event;
import com.bookmyshow.repository.EventRepository;
import com.bookmyshow.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class EventController {
    @Autowired
    EventRepository eventrepository;
    @Autowired
    UserRepository userRepository;

    @PostMapping(value = "/api/events", consumes = { "application/json" })
    public ResponseEntity<?> postTodo(@RequestBody EventCreateDto eventcreatedto) {

        Event event = new Event();
        event.setEventname(eventcreatedto.getEventname());
        event.setPrice(eventcreatedto.getPrice());
        event.setQuantity(eventcreatedto.getQuantity());

        SecurityContext securityContext = SecurityContextHolder.getContext();
        Authentication authentication = securityContext.getAuthentication();
        org.springframework.security.core.userdetails.User user = (org.springframework.security.core.userdetails.User) authentication.getPrincipal();

        AppUser userEntity=userRepository.findByUserName(user.getUsername());
        event.setUser(userEntity);

        event = eventrepository.save(event);

        EventResponseDto eventResponseDto = new EventResponseDto();
        eventResponseDto.setEventid(event.getEventid());
        eventResponseDto.setEventname(event.getEventname());
        eventResponseDto.setPrice(event.getPrice());
        eventResponseDto.setQuantity(event.getQuantity());
        return ResponseEntity.status(HttpStatus.CREATED).body(eventResponseDto);

    }
      @GetMapping(value="/api/getallevents")
      public ResponseEntity<?> getAllEvents(){
	      List<Event> events=eventrepository.findAll();
	      List<EventResponseDto> eventResponseDtos=events
	    		  .stream()
                  .map(event -> new EventResponseDto(event.getEventid(),event.getEventname(),event.getPrice(),event.getQuantity()))
                  .collect(Collectors.toList());
		  return ResponseEntity.status(HttpStatus.OK).body(eventResponseDtos);
    	  
      }
}