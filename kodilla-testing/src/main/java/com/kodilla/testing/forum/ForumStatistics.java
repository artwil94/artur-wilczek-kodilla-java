package com.kodilla.testing.forum;

import com.kodilla.testing.forum.statistics.Statistics;

public class ForumStatistics {

    private int quantityUsers;
    private int quantityPosts;
    private int quantityComments;
    private double avgPostsPerUsers;
    private double avgCommentsPerUsers;
    private double avgCommentsPerPosts;




    public void calculateAdvStatistics(Statistics statistics){
        quantityUsers = statistics.usersNames().size();
        quantityPosts = statistics.postsCount();
        quantityComments = statistics.commentsCount();
        if(quantityUsers == 0) {
            avgPostsPerUsers = 0;
            avgCommentsPerUsers = 0;
        } else {
            avgPostsPerUsers = (double)quantityPosts / quantityUsers ;
            avgCommentsPerUsers = (double) quantityComments / quantityUsers;
        }

        if (quantityPosts == 0) {
            avgCommentsPerPosts = 0;
        } else {
            avgCommentsPerPosts = (double) quantityComments / quantityPosts;
        }
    }

    public int getQuantityUsers(){
        return quantityUsers;
    }

    public int getQuantityPosts() {
        return quantityPosts;
    }

    public int getQuantityComments() {
        return quantityComments;
    }

    public double getAvgPostsPerUsers() {
        return avgPostsPerUsers;
    }

    public double getAvgCommentsPerUsers() {
        return avgCommentsPerUsers;
    }

    public double getAvgCommentsPerPosts() {
        return avgCommentsPerPosts;
    }

    public void showStatistics(){
        System.out.println("Quantity Users: " + quantityUsers);
        System.out.println("Quantity Posts: " + quantityPosts);
        System.out.println("Quantity Comments: " + quantityComments);
        System.out.println("Average Quantity Of Posts Per User: " + avgPostsPerUsers);
        System.out.println("Average Quantity Of Comments Per User: " + avgCommentsPerUsers);
        System.out.println("Average Quantity Of Comments Per Post: " + avgCommentsPerPosts);
    }


}
