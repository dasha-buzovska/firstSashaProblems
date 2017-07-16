package com.company;

class Facebook {

    static String compressNumber(int number) {
        System.out.print(number + " => ");
        if (number < 1000) {
            return ""+ number;
        } else if (number >= 1000 && number < 10000) {
            if (Math.floor(number/100)%10 == 0) {
                return (int)Math.floor(number/1000) + "K";
            } else {
                return Math.floor(number/100)/10 + "K";
            }
        } else if (number >=10000 && number < 1000000) {
            return (int)Math.floor(number/1000) + "K";
        }else if (number >=1000000 && number < 1000000000) {
            if (Math.floor(number / 100000) % 10 == 0) {
                return (int) Math.floor(number / 1000000) + "M";
            } else {
                return Math.floor(number / 100000) / 10 + "M";
            }
        }else{
            if (Math.floor(number/100000000)%10 == 0) {
                return (int)Math.floor(number/1000000000) + "B";
            } else {
                return Math.floor(number/100000000)/10 + "B";
            }
        }
    }

    static String toOrdinary(int number) {
        int lastItem = number%10;
        int lastTwoItemes = number%100;
        if (lastItem == 1 && lastTwoItemes != 11) {
            return number + "st";
        } else if (lastItem == 2 && lastTwoItemes != 12) {
            return number + "nd";
        } else if (lastItem == 3 && lastTwoItemes != 13) {
            return number + "rd";
        } else {
            return number + "th";
        }
    }
}
