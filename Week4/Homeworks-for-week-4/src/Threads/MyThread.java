package Threads;

import java.util.ArrayList;

public class MyThread extends Thread {

    private final ArrayList<Integer> arrayListWith2500;
    private final ArrayList<Integer> evenNumbers = new ArrayList<>();
    private final ArrayList<Integer> oddNumbers = new ArrayList<>();

    public MyThread(ArrayList<Integer> arrayListWith2500) {
        this.arrayListWith2500 = arrayListWith2500;
    }

    @Override
    public void run(){
        for (Integer integer : this.arrayListWith2500) {
            if (integer % 2 == 0) {
                evenNumbers.add(integer);
            }else{
                oddNumbers.add(integer);
            }
        }
    }

    public ArrayList<Integer> getEvenNumbers() {
        return evenNumbers;
    }

    public ArrayList<Integer> getOddNumbers() {
        return oddNumbers;
    }
}
