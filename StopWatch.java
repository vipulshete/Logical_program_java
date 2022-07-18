package com.bridgelab.logical;
import java.util.Scanner;
public class StopWatch {

	public static void main(String[] args) {

		double startTime, stopTime;
        System.out.print("Enter 1 to start");
        Scanner sc=new Scanner(System.in);
        sc.nextInt();
        startTime = System.currentTimeMillis();
        System.out.println("Start time "+ startTime);
        System.out.println("Enter 2 To Stop");
        sc.nextInt();
        stopTime = System.currentTimeMillis();
        System.out.println("Stop time "+ stopTime);
        double timeElapsed =(stopTime-startTime)/1000;
        System.out.println("Time elapsed in milliseconds : 1"+ timeElapsed);

	}

}
