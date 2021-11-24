package com.company;

public class Main {

    public static void main(String[] args) {
        int mk1 = 45;
        int mk2 = 55;
        int mk3 = 66;
        int total = mk1+mk2+mk3;
        double avg = total/3;
        String grd;

        if (avg >= 50){
            grd = "pass";
        }else
            grd = "fail";

        System.out.println("Total "+total);
        System.out.println("Average "+avg);
        System.out.println("Grade "+grd);


    }
}
