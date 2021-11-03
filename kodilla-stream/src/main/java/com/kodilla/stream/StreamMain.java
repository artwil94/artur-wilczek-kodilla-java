package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum  forum = new Forum();

        Map<Integer, ForumUser> usersMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().getYear()<2001)
                .filter(forumUser -> forumUser.getPostsQuantity()>=1)
                .collect(Collectors.toMap(ForumUser::getIdentifier, forumUser -> forumUser));

        System.out.println("# elements: " + usersMap.size());
        usersMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue().getName())
                .forEach(System.out::println);
    }
}



    /*public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);
    }
}
*/


    /*public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
*/

/*public class StreamMain {

        public static void main(String[] args) {
            BookDirectory theBookDirectory = new BookDirectory();
            List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                    .filter(book -> book.getYearOfPublication() > 2005)
                    .collect(Collectors.toList());

            System.out.println("# elements: " + theResultListOfBooks.size());
            theResultListOfBooks.stream()
                    .forEach(System.out::println);
        }
    }
*/


    /*
    public static void main(String[] args) {
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length()>11)
                .map(s -> s.substring(0,s.indexOf(' ')+2)+ ".")
                .filter(s-> s.substring(0,1).equals("M"))
                .forEach(System.out::println);
    }
}
*/

/* import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String text = "Beautiful text";
        poemBeautifier.beautify("ABC", (add)-> add + text + add);
        poemBeautifier.beautify("XYZ", (add)-> add + text + add);
        poemBeautifier.beautify(" ", (add)-> text.toUpperCase());

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }

}


    /*
    public static void main(String[] args) {
        /*ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
    }
} */