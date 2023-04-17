package com.example.multithread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.*;

@SpringBootApplication
public class MultithreadApplication {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        HelloWorldPrinter hwp = new HelloWorldPrinter();
//
//        hwp.run();
//        Thread t1 = new Thread(hwp);
//        t1.start();

//        Executor executor = Executors.newFixedThreadPool(20);
        ExecutorService executor = Executors.newFixedThreadPool(2);

//       for(int i=1;i<=100;i++) {
//           NumberPrinter np = new NumberPrinter(i);
////           Thread t = new Thread(np);
////           t.start();
//           executor.execute(np);
//       }
        RandomNumberGenerator rng = new RandomNumberGenerator();
        Future<Integer> i = executor.submit(rng);
        Future<Integer> j = executor.submit(rng);
        System.out.println("i is "+i.get());
        System.out.println("j is "+j.get());
        System.out.println(i.get()+j.get());

        SpringApplication.run(MultithreadApplication.class, args);
    }

}
