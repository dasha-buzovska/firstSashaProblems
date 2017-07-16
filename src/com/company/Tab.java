package com.company;
/*Розробити і скомпілювати программу Tab.java що б при запуску (в консолі java Tab)
видавалася табуляція функції 2cos(x)+cos(2x) на проміжку від 0 до 5 включно, з кроком 0.5. у такому вигляді:
Function f(x)=2cos(x)+cos(2x) have values:
for x=0,0 values is: 3
і так далі.*/

public class Tab {

    public static void main(String[] args) {
        double x = 0;
        System.out.println("Function f(x)=2cos(x)+cos(2x) have values:");
        while (x <= 5) {
	        double function = Math.round((2*Math.cos(x) + Math.cos(2*x))*100.0)/100.0;
            System.out.println("for x=" + x + " values is: " + function);
            x+=0.5;
        }
    }
}
