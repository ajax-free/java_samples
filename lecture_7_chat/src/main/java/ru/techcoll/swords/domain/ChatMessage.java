package ru.techcoll.swords.domain;

/**
 * Сообщение в чат от пользователя
 */
public class ChatMessage {

    /**
     * Имя пользователя.
     */
    private String name;

    /**
     * Сообщение от пользователя
     */
    private String text;

    public ChatMessage() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
