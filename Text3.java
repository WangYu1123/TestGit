package com.wangyu.text.day17.text3;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Text3 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        Date_ date_ = new Date_();
        Date date1 = date_.getDate("2024-2-2");
    }
}
