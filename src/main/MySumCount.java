package main;

public class MySumCount extends Thread {
    private int startIndex;
    private int stopIndex;

    private int[] arr;

    private long resultSum;

    public long getResultSum() {
        return resultSum;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < stopIndex ; i++) {
            resultSum += arr[i];
        }
    }
}
