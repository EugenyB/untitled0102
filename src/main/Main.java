package main;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        new TimeBomb().start();
//        new Thread(new TimeBomb2()).start();
        int[] myArr = new int[1000];
        Random rnd = new Random();
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = rnd.nextInt(1000);
        }
        MySumCount mySumCount1 = new MySumCount();
        MySumCount mySumCount2 = new MySumCount();
        mySumCount1.setArr(myArr);
        mySumCount2.setArr(myArr);
        mySumCount1.setStartIndex(0);
        mySumCount1.setStopIndex(500);
        mySumCount2.setStartIndex(500);
        mySumCount2.setStopIndex(1000);
        mySumCount1.start();
        mySumCount2.start();
        try {
            mySumCount1.join();
            mySumCount2.join();
            long result = mySumCount1.getResultSum() + mySumCount2.getResultSum();
            System.out.println("result = " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
