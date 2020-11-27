package io.github.astrapi69.chat.messages.controller;

import io.github.astrapi69.chat.messages.viewmodel.ChatMessage;
import io.github.astrapi69.chat.messages.config.ApplicationConfiguration;
import io.github.astrapi69.chat.messages.jpa.entity.ChatMessages;
import io.github.astrapi69.chat.messages.mapper.ChatMessagesMapper;
import io.github.astrapi69.chat.messages.service.ChatMessagesService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApplicationConfiguration.REST_VERSION + ChatMessagesController.REST_PATH)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ChatMessagesController
{
	public static final String REST_PATH = "/templates";
	ChatMessagesService chatMessagesService;
	ChatMessagesMapper mapper;

	@RequestMapping(method = RequestMethod.POST)
	public ChatMessage newTemplate() {
		ChatMessages entity = chatMessagesService.save(ChatMessages.builder()
			.name("foo").build());
		return mapper.toDto(entity);
	}
}
