
//Class Square
// all classes are probably in a package named 
// something like: 
//package com.foo.monopoly.domain; 
public class Square {

    private String name;
    private Square nextSquare;
    private int index;

    public Square(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public void setNextSquare(Square s) {
        nextSquare = s;
    }

    public Square getNextSquare() {
        return nextSquare;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }
}
