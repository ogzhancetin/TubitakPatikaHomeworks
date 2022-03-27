package Threads;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            if (i < 2500) {
                list1.add(i);
            }else if (i<5000){
                list2.add(i);
            }else if(i<7500){
                list3.add(i);
            }else{
                list4.add(i);
            }
        }

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        MyThread t1 = new MyThread(list1);
        MyThread t2 = new MyThread(list2);
        MyThread t3 = new MyThread(list3);
        MyThread t4 = new MyThread(list4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        evenNumbers.addAll(t1.getEvenNumbers());
        evenNumbers.addAll(t2.getEvenNumbers());
        evenNumbers.addAll(t3.getEvenNumbers());
        evenNumbers.addAll(t4.getEvenNumbers());

        oddNumbers.addAll(t1.getOddNumbers());
        oddNumbers.addAll(t2.getOddNumbers());
        oddNumbers.addAll(t3.getOddNumbers());
        oddNumbers.addAll(t4.getOddNumbers());

        System.out.println(oddNumbers.size());
        System.out.println(evenNumbers.size());

        evenNumbers.forEach(integer -> System.out.print(integer.toString()+" "));
        System.out.println();
        oddNumbers.forEach(integer -> System.out.print(integer.toString()+" "));

    }
}
