package com.company;

public class Main {

    public static void main(String[] args) {
        estimateAverage(true, true, 100, 100, 100);
        estimateAverage(true, true, 70, 70, 70);
        estimateAverage(true, true, 70, 70, 50);
        estimateAverage(false, true, 70, 70, 90);
        estimateAverage(true, false, 70, 70, 50);
        estimateAverage(false, false, 70, 70, 50);
        estimateAverage(true, true, 60, 60, 60);
    }

    public static void estimateAverage(boolean visa1, boolean visa2, double visa1Score, double visa2Score,
                                       double finalExam) {
        if (visa1 && visa2) {

            double termScore = (visa1Score + visa2Score) / 2 * 0.4 + finalExam * 0.6;

            if (termScore < 60) {
                System.out.println("Notunuz düşük, dersi tekrar ediniz! Notunuz " + termScore);

            } else if (termScore >= 60) {
                System.out.println("Tebrikler dersi geçtiniz! notunuz " + termScore);
            }

        } else {
            System.out.println("Devamsızlıktan kaldınız");

        }


    }
}
