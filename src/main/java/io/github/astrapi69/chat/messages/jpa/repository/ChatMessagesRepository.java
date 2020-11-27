package io.github.astrapi69.chat.messages.jpa.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.astrapi69.chat.messages.jpa.entity.ChatMessages;

public interface ChatMessagesRepository extends JpaRepository<ChatMessages, UUID>
{
}
