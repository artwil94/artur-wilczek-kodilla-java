package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int identifier;
    private final String name;
    private final char sex;
    private final LocalDate birthDate;
    private final  int postsQuantity;

    public ForumUser(final int identifier,final  String name,final  char sex,final LocalDate birthDate, final int postsQuantity) {
        this.identifier = identifier;
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postsQuantity = postsQuantity;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }
}
