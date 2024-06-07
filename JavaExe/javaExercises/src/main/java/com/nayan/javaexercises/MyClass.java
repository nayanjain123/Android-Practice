package com.nayan.javaexercises;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = input.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter "+i+"th element for first array: ");
            array[i]=input.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=array[i];
        }
        System.out.println((float)sum/size);

        }
    }

        /*
        //Ex-9
        int[][] mat1= {{1,2,1},{2,1,3},{3,2,1}};
        int[][] mat2= {{2,1,2},{3,2,1},{1,3,2}};
        int[][] mat3=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat3[i][j]=mat1[i][j]+mat2[i][j];
                System.out.println(mat3[i][j]);
            }
        }

        //Ex-8
        int x,s;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int num=input.nextInt();
        s=num+4-1;
        for(int i=0;i<=num;i++){

            for(x=s;x!=0;x--){
                System.out.print(" ");}

            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }

            System.out.println();
            s--;
            }

        //Ex-7
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sizes of the array: ");
        int size = input.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter "+i+"th element for first array: ");
            array[i]=input.nextInt();
        }
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<size;i++) {
            if (array[i] % 2 == 0) {
                evencount+=1;
            }
            else{
                oddcount+=1;
            }
        }
        System.out.print("Evencount:"+evencount+"Oddcount:"+oddcount);
        //Ex-6
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sizes of the array: ");
        int size = input.nextInt();
        int[] first_array=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter "+i+"th element for first array: ");
            first_array[i]=input.nextInt();
        }
        int[] second_array=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter "+i+"th element for second array: ");
            second_array[i]=input.nextInt();
        }
        int[] prod_arr=new int[size];
        System.out.println("The product array is: ");
        for(int i=0;i<size;i++){
            prod_arr[i]=first_array[i]*second_array[i];
            System.out.println(prod_arr[i]);
        }
        //Ex-5
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = input.nextLine();
        char[] ch=str.toCharArray();
        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            rev=rev+ch[i];

        }
        System.out.print(rev);//Ex-4

        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String ip_str = input.nextLine();
        count(ip_str);

        }
    public static void count(String x){
        char[] ch= x.toCharArray();
        int letter=0,space=0, num=0, others=0;
        for(int i=0;i<x.length();i++){
            if(Character.isLetter(ch[i])){
                letter+=1;
            }
            else if(Character.isSpaceChar(ch[i])){
                space+=1;
            }
            else if(Character.isDigit(ch[i])){
                num+=1;
            }
            else{
                others+=1;
            }
        }
System.out.println("Letters: "+letter);
        System.out.println("Spaces: "+space);System.out.println("Numbers: "+num);System.out.println("Others: "+others);













        //Ex-2
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius of the circle (r) :");
        double r=input.nextDouble();
        double perimeter=2*Math.PI*r;
        double area=Math.PI*r*r;
        System.out.println("The Perimeter of the circle: "+perimeter);
        System.out.println("The Area of the circle: "+area);



        //Ex-1
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Dividend (A) :");
        int a=input.nextInt();
        System.out.println("Enter the Divisor (B) :");
        int b=input.nextInt();
        System.out.println("The Quotient of A/B is: "+a/b);
        System.out.println("The Reminder of A/B is: "+a%b);*/

