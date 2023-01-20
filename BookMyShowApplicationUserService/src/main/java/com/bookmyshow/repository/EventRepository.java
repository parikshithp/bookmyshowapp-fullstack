package com.bookmyshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmyshow.entity.Event;

public interface EventRepository extends JpaRepository<Event,Integer> {

}
