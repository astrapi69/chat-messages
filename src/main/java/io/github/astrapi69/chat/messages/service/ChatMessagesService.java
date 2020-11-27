package io.github.astrapi69.chat.messages.service;

import org.springframework.stereotype.Service;

import io.github.astrapi69.chat.messages.jpa.entity.ChatMessages;
import io.github.astrapi69.chat.messages.jpa.repository.ChatMessagesRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ChatMessagesService
{
	ChatMessagesRepository repository;

	public ChatMessages save(ChatMessages chatMessages)
	{
		return repository.save(chatMessages);
	}

}
