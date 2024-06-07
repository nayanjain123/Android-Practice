package com.nayan.lib;
public class MyClass {
    public static void main(String[] args) {

        //object is an instance of class
        //class is a template or blueprint

        //ClassName object = new className();
        Car redCar = new Car(100,2023);
        redCar.accelerate();
        redCar.accelerate();
        redCar.brake();
    }}

//access modifiers - public protected default private in OOP in classes
//encapsulation - getters and setters
//inheritance - superclass and subclass - super keyword - parent n child - this key  word
//overriding - always override methods of superclass
//polymorphism
//abstraction - abstract class - interface(implements)

public int getYear(){
    return year;
}
public int setYear(int newYear){
    year=newYear;
}
// alt+insert


/*
        System.out.println(addNumbers(3.2, 6));

        //sayHello();


        // a method is a block of code that performs a specific task - define out of main method
        //types- user defined and standard library
        //syntax
        //returnType methodName(){
        // <method body>}


        //multi dimensional array - array of arrays

//        dataType[][] arrayName=new dataType[rows][columns];
        //initialize
        int[][] myMatrix=new int[3][3];

        //store
        myMatrix[0][0]=1;
        myMatrix[0][1]=2;
        myMatrix[0][2]=3;

        myMatrix[1][0]=4;
        myMatrix[1][1]=5;
        myMatrix[1][2]=6;

        myMatrix[2][0]=7;
        myMatrix[2][1]=8;
        myMatrix[2][2]=9;
        //access and print
        System.out.println(myMatrix[2][0]);

        //arrays
        //syntax - dataType[] arrayName= new dataType[arraysize];
        int[] numbers= new int[5];//array of integers that can hold 5 elelmets
        //storing in array
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
        numbers[4]=50;
        //access and print
        System.out.println("Array at index 0:"+numbers[0]);
        //for each loop
        //for(dataType element:collection){
            //code to be executed for each element in collection
        //}
        for(int num:numbers){
            System.out.println(num);
        }



        for(int i=0;i<10;i++){
            if(i==4){
                continue;//skips that iteration. if used break it will break the entire loop.
            }
            System.out.println(i);
        }



        int number = 1;
        while(number<=5){
            //code to be executed repeatedly
            //as long as the condition is true
            System.out.println(number);
            number++;
        }



        public class Exercise {
    public int daysOfMonth() {
        String monthName = "May";
        int number_Of_DaysInMonth = 0;

        switch (monthName) {
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                number_Of_DaysInMonth = 31;
                break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                number_Of_DaysInMonth = 30;
                break;
            default:
                number_Of_DaysInMonth = 29;
                break;
        }

        // Write your additional code here if needed

        return number_Of_DaysInMonth;
    }
}

        //switch statement
        int dayofWeek=6;

        switch(dayofWeek){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("days between 1 to 7 only");
                break;
        }

        public boolean checkPositive(){
            int x = 99;
            int pos=0;
            // Write your conditional Statement Here
            if(x>=1){
                pos=1;
                // Use    return true; for returning if the condition is true;
            }
        }

        //if statement
        int age=70;
        if (age>=18&&age<=59){
            System.out.println("You are an adult");
        } else if (age>=60) {
            System.out.println("You are senior citizen");

        } else{
            System.out.print("You are a minor.");
        }

        //Strings - String class
        //Strings - String class
        //Strings - String class
        String sayHello= "Hi ";

        //Concatenate
        String myFriends="my friends";
        System.out.println(sayHello+myFriends);
        int length=myFriends.length();
        System.out.println(length);


        //Arithmetic Operators + - * / %
        //Comparison Operators == != < > <= >=
        //Logical Operators && || !




        //byte:-128-->127
        byte x = 100;
        //short:-32768-->32767
        short y = 10000;
        //int:-2147483648-->2147483647
        int z = 769049356;
        //long:-9223372036854775808-->9223372036854775807
        long a = 7305727561L;
        //float: Add 'F' or 'f' - store with 2 precision
        float pi=3.14f;
        //double:store with higher precision
        double pi2=3.14159;
        //boolean: t or f
        boolean isRaining=true;
        isRaining=false;
        //char holds only one single number, symbol or letter
        //char myChar = 'A';
        char myNumber = '7';
        char mySymbol = '$';

        //type casting is process to convert a value from one data type to another
        //implicit type casting - occurs when a value of a smaller data type is assigned to a variable of larger data type
        int numInt=10;
        double numDouble=numInt; // converts to 10.0
        // explicit type casting - occurs when a value of larger data type is converted to a smaller data type manually or when there is possibility of data loss
        double pinew=3.14;
        int numPI = (int) pinew;//there will be data loss - 3.14-->3
        //System.out.print(numPI);
        //type casting b/w diff datatypes
        int myInt=5;
        char myChar = (char) (myInt + 'A');
        System.out.print(myChar);




        int age = 20;
        age=4;
        String name = "Nayan";
    //java output
        System.out.print("Hello world!, I am "+name+" and I am "+age+" years old.");*/
   /* }

    //static void sayHello(){//return types - int void double boolean etc.
    //System.out.println("Hello");
    static int addNumbers(int x, int y) {
        return x + y;

    }

    static double addNumbers(double x, double y) {
        return x + y;
    }*/
