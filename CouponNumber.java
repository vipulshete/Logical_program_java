package com.bridgelab.logical;
import java.util.Scanner;

public class CouponNumber {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number of coupons to be generated:");
        int n = scr.nextInt();

        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        int max = 100000000;

        for (int i = 0; i < n; i++) {
            int random = (int) (Math.random() * max);
            StringBuilder sb = new StringBuilder();
            while (random > 0) {
                sb.append(chars[random % chars.length]);
                random /= chars.length;
            }
            String couponCode = sb.toString();
            System.out.println("Coupon Code: " + couponCode);
        }

	}
}
