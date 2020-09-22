package com.company;

public class Main {

    public static void main(String[] args) {

        Bulldog bulldog = new Bulldog("Brown", "shorthair", 30);
        Foxhound foxhound = new Foxhound("black", "longthair", 10);
        bulldog.display();
        foxhound.display();

    }
}

class Dog {

    private String color, typeofwool;
    public String getColor()
    {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeofwool()
    {
        return typeofwool;
    }

    public void setTypeofwool(String typeofwool) {
        this.typeofwool = typeofwool;
    }

    public Dog (String color, String typeofwool)
    {
        this.color = color;
        this.typeofwool = typeofwool;
    }
    public void display()
    {
        System.out.println("Color " + color + "Type of wool " + typeofwool);
    }
}

class Bulldog extends Dog {
    private int weight;

    public Bulldog(String color, String typeofwool, int weight)
    {
        super(color, typeofwool);
        this.weight = weight;
    }

    public void display()
    {
        System.out.println("Color " + getColor() + " type of wool " + getTypeofwool() + "weight " + weight);
    }
}

class Foxhound extends Dog {
    private int speed;

    public Foxhound(String color, String typeofwool, int speed)
    {
        super(color, typeofwool);
        this.speed = speed;
    }

    public void display()
    {
        System.out.println("Color " + getColor() + " type of wool " + getTypeofwool() + "speed " + speed);
    }
}