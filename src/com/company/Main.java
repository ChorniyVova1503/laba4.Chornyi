package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arc=0;
        System.out.println("№1.Дан массив из целых чисел A(n), где n=1,25. Необходимо поменять местами");
        System.out.println("№2.Дан массив из целых чисел B(n), где n=1,25. Необходимо упорядочить массив по возрастанию.");
        System.out.println("№3.Дан массив из целых чисел С(n), где n=1,20. Необходимо найти среднее значение и вывести его на.");
        System.out.println("№4.Дан массив из целых чисел D(n), где n=1,30. Посчитайте сумму четных");
        System.out.println("№5.Напишите программу, выводящую на консоль таблицу 3х5 случайных элементов (a(i,j)< 10.");
        System.out.println("№6.Измените программу 1 так, чтобы она выводила на консоль еще и максимальный элемент") ;
        System.out.println("№7.Даны 5 строк s1, s2, s3, s4 и s5, на основе условия: если строка s4 равна строке s5") ;
        arc=scan.nextByte();
        switch (arc){
            case 1:
                m1();
                break;
            case 2:
                m2();
                break;
            case 3:
                m3();
                break;
            case 4:
                m4();
                break;
            case 5:
                m5();break;
            case 7:
                m7();
                break;

        }
    }



    public static void m1(){
        int n=25;
        int A[] = new int[n];

        Rand(A,n);
        print(A,n);
        int min=A[1];
        int max=0;
        int minIndex=0;
        int maxIndex=0;

        for (int i = 0; i < n; i++) {
            if(A[i]>max) {
                max=A[i];
                maxIndex = i;
            }
            if(A[i]<min){
                min=A[i];
                minIndex=i;
            }

        }
        System.out.println("min="+A[minIndex]+" max ="+A[maxIndex]);
        int temp=0;

        temp=A[maxIndex];
        A[maxIndex]=A[minIndex];
        A[minIndex]=temp;
        print(A,n);
        maxX(max);

    }

    public static void m2(){
        int n = 25;
        int[] B= new int[n];
        Rand(B,n);
        System.out.println("Начальный массив:");
        print(B,n);
        int temp=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < i; j++) {
                if(B[i]>B[i+1]) {
                    temp = B[i];
                    B[i]=B[i+1];
                    B[i+1]=temp;
                }
            }

        }

        print(B,n);
    }

    public static void m3(){
        int n=20;
        int[] C=new int[n];
        Rand(C,n);
        print(C,n);
        double summ=0;
        double result=0;

        for (int i = 0; i <n ; i++) {
            summ=summ+C[i];
        }
        result=summ/n;
        System.out.println("Srednee= "+ result);
    }

    public static void m4(){
        int n =30;
        int[] D=new int[n];
        Rand(D,n);
        print(D,n);
        int chet=0;
        int nechet=0;

        for (int i = 0; i < n; i++) {
            if(D[i]%2==0)
                chet++;
        }
        nechet=n-chet;
        System.out.println("chet= "+ chet+" nechet = "+ nechet);
    }

    public static void m5(){
        int n=15;
        int[] array= new int[n];
        Rand(array,n);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+ " ");
            if ((i+1)%5==0){
                System.out.println();
                System.out.println("\t");
            }
        }

    }

    public static void maxX(int max){
        System.out.println(" max="+max);
    }

    public static void m7() {
        Scanner scan = new Scanner(System.in);
        String a1=new String();
        String a2=new String();
        String a3=new String();
        String a4=new String();
        String a5=new String();

        System.out.println(" Заполните 5 строк");
        a1=scan.next();
        a2=scan.next();
        a3=scan.next();
        a4=scan.next();
        a5=scan.next();

        if (a4.equals(a5))
            a1 = a1.concat(a2);
        else
            a1 = a1.concat(a3);;

        System.out.println("result="+a1);

    }

    public static int[] Rand(int[] array ,int n){
        Random rand =new Random();
        for (int i = 0; i < n; i++) {
            array[i]=rand.nextInt(100);
        }
        return array;
    }

    public static void print(int[] array ,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }

}
