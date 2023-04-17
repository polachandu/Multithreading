package com.example.multithread;

public class NumberPrinter implements Runnable{

    private int numberPrinter;

    public NumberPrinter(int numberPrinter){
        this.numberPrinter = numberPrinter;
    }
    @Override
    public void run() {

            System.out.println(numberPrinter +" created by "+ Thread.currentThread().getName());

    }
}
