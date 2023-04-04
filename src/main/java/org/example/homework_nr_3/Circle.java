package org.example.homework_nr_3;

    class Circle {
    int Radius;

    public Circle(int radius) {
        Radius = radius;
    }

    public void calculateArea(){
        double Square = Math.PI * (Radius * Radius);
        System.out.println("Square: " + Square);
    }

    public static void main(String[] args) {
        Circle a = new Circle(5);
        a.calculateArea();


    }

}

