package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
/*2.У колі стоять N осіб, пронумерованих від 1 до N. Під час ведення рахунку
по колу викреслюється кожна друга людина, доки залишиться одна.
Скласти дві програми, що моделюють процес. Одна із програм
повинна використовувати клас ArrayList, а друга – LinkedList. Яка з
двох програм працює швидше? Чому?*/


//   ArrayList  - будет работать дольше (для данной задачи), потому как сдвигает элементы коллекции (требуеться больше операций)
//   LinkedList  - быстрее (для данной задачи), не двигает элементы коллекции а просто менят им ссылку (требуеться меньше операций)

        System.out.println("ArrayList");

        Random random = new Random();

        int n = 5;

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {

            numbers.add(i);


        }

        while (numbers.size() > 1) {


            System.out.println(numbers);

            numbers.remove(0);

            System.out.println(numbers);

            numbers.add(numbers.get(0));

            System.out.println(numbers);

            numbers.remove(0);


        }
        System.out.println(numbers.size() + " " + numbers.get(0));


        System.out.println("LinkedList");

        LinkedList<Integer> newNumbers = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            newNumbers.add(i);

        }

        while (newNumbers.size() > 1) {

            System.out.println(newNumbers);

            newNumbers.remove(0);

            System.out.println(newNumbers);

            newNumbers.add(newNumbers.get(0));

            System.out.println(newNumbers);

            newNumbers.remove(0);

            System.out.println(newNumbers);




        }
        System.out.println(newNumbers.size() + " " + newNumbers.get(0));

    }

    }







