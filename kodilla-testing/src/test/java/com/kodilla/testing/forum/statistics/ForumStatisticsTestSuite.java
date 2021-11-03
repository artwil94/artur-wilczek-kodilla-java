package com.kodilla.testing.forum.statistics;



import com.kodilla.testing.forum.ForumStatistics;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;



public class ForumStatisticsTestSuite {

    @Test // posts=0
     void testCalculateAdvStatistics(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("User1");
        usersNames.add("User2");
        usersNames.add("User3");
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(15);
        when(statisticsMock.postsCount()).thenReturn(0);



        //When
         ForumStatistics forumStatistics = new ForumStatistics();
         forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
       assertEquals(0, forumStatistics.getAvgPostsPerUsers());
       assertEquals(5, forumStatistics.getAvgCommentsPerUsers());
       assertEquals(0, forumStatistics.getAvgCommentsPerPosts());

    }

    @Test // posts=1000
    void testCalculateAdvStatisticsThousand(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("User1");
        usersNames.add("User2");
        usersNames.add("User3");
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(15);
        when(statisticsMock.postsCount()).thenReturn(1000);



        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(333.333, forumStatistics.getAvgPostsPerUsers(),0.001);
        assertEquals(5, forumStatistics.getAvgCommentsPerUsers());
        assertEquals(0.015, forumStatistics.getAvgCommentsPerPosts());

    }

    @Test // comments = 0
    void testCalculateAdvStatisticsCommentsZero(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("User1");
        usersNames.add("User2");
        usersNames.add("User3");
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(10);



        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(3.33, forumStatistics.getAvgPostsPerUsers(),0.01);
        assertEquals(0, forumStatistics.getAvgCommentsPerUsers());
        assertEquals(0, forumStatistics.getAvgCommentsPerPosts());

    }

    @Test // comments < posts
    void testCalculateAdvStatisticsCommentsLessThanPosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("User1");
        usersNames.add("User2");
        usersNames.add("User3");
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(15);



        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(5, forumStatistics.getAvgPostsPerUsers());
        assertEquals(1.66, forumStatistics.getAvgCommentsPerUsers(),0.01);
        assertEquals(0.33, forumStatistics.getAvgCommentsPerPosts(),0.01);

    }
    @Test // comments > posts
    void testCalculateAdvStatisticsCommentsMoreThanPosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("User1");
        usersNames.add("User2");
        usersNames.add("User3");
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(15);
        when(statisticsMock.postsCount()).thenReturn(5);



        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1.66, forumStatistics.getAvgPostsPerUsers(),0.01);
        assertEquals(5, forumStatistics.getAvgCommentsPerUsers());
        assertEquals(3, forumStatistics.getAvgCommentsPerPosts());

    }

    @Test // Users=0
    void testCalculateAdvStatisticUsersZero(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        //usersNames.add("User1");
       // usersNames.add("User2");
        //usersNames.add("User3");
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(15);
        when(statisticsMock.postsCount()).thenReturn(5);



        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getAvgPostsPerUsers());
        assertEquals(0, forumStatistics.getAvgCommentsPerUsers());
        assertEquals(3, forumStatistics.getAvgCommentsPerPosts());

    }
    @Test // Users=100
    void testCalculateAdvStatisticUsersHundred(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        String txt ="User";
        for (int i=0;i<100;i++){

            usersNames.add(txt+ i);
        }


        //usersNames.add("User1");
        // usersNames.add("User2");
        //usersNames.add("User3");
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(20);
        when(statisticsMock.postsCount()).thenReturn(200);



        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(2, forumStatistics.getAvgPostsPerUsers());
        assertEquals(0.2, forumStatistics.getAvgCommentsPerUsers());
        assertEquals(0.1, forumStatistics.getAvgCommentsPerPosts());

    }
}

