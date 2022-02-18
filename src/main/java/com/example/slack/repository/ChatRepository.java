package com.example.slack.repository;

import com.example.slack.model.Chat;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ChatRepository extends CrudRepository<Chat, Long> {

    List<Chat> findAllByRoomId(Long roomId);
}
