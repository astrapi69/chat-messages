package io.github.astrapi69.chat.messages.mapper;

import io.github.astrapi69.chat.messages.viewmodel.ChatMessage;
import io.github.astrapi69.chat.messages.jpa.entity.ChatMessages;
import org.springframework.stereotype.Component;

import de.alpharogroup.bean.mapper.AbstractGenericMapper;

@Component
public class ChatMessagesMapper extends AbstractGenericMapper<ChatMessages, ChatMessage>
{
}
