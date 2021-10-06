package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String add, PoemDecorator poemDecorator){

        String text = poemDecorator.decorate(add);
        System.out.println(text);
    }
}
