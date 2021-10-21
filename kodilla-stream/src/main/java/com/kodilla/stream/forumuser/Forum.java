package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.ArrayList;

public final class Forum {

    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum(){
        theUsersList.add(new ForumUser(1,"admin1",'M', LocalDate.of(1990, Month.JANUARY,8),10));
        theUsersList.add(new ForumUser(2,"admin2",'F', LocalDate.of(2005, Month.AUGUST,3),5));
        theUsersList.add(new ForumUser(3,"admin3",'M', LocalDate.of(1981, Month.JANUARY,8),2));
        theUsersList.add(new ForumUser(4,"admin4",'F', LocalDate.of(1994, Month.MARCH,4),30));
        theUsersList.add(new ForumUser(5,"admin5",'M', LocalDate.of(2006, Month.FEBRUARY,6),1));
        theUsersList.add(new ForumUser(6,"admin6",'F', LocalDate.of(1992, Month.JANUARY,7),20));

    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUsersList);
    }
}
