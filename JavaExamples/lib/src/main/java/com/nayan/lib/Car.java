package com.nayan.lib;
public class Car{
    //fields - states - attributes: store data
    int year;
    int speed;
    //Methods - functionalities -  behavior: perform operations
    void accelerate(){
        speed+=10;
        System.out.println("Your speed now: "+speed);
    }
    void brake(){
        speed-=5;
        System.out.println("Your speed now: "+speed);
    }
    //constructor
    public Car(int carSpeed, int carYear){
        year=carYear;
        speed=carSpeed;

    }



}