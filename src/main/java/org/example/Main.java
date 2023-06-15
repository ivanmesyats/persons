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

        for (int i = 1; i < n+1; i++) {

            numbers.add(i);


        }

        while (numbers.size()  > 1) {


            System.out.println(numbers);

            numbers.remove(1);

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

        System.out.println("extra implementation");

        int size2 = 5;
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();

        for (int i=1 ; i <= size2; i++){
            numbers2.add(i);
        }

        System.out.println(numbers2);

        while (numbers2.size() > 1) {
            for (int i = 0; i < numbers2.size() - 1; i++) {
                //System.out.println(numbers.get(j));
                System.out.println(numbers2.remove(i + 1));
            }
            System.out.println(numbers2);
        }


    }

    }








