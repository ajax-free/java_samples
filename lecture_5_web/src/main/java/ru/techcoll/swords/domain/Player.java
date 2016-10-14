package ru.techcoll.swords.domain;

import javax.validation.constraints.NotNull;

public class Player {

    @NotNull
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String email;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("Player #%d {name=%s, email=%s", id, name, email);
    }

}
