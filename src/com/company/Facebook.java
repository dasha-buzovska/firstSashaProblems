package com.company;

class Facebook {

    static String compressNumber(int number) {
        if (number < 1000) {
            return "" + number;
        } else if (number >= 1000 && number < 10000) {
            return getStringNumber(number,1000,"K");
        } else if (number >=10000 && number < 1000000) {
            return (int)Math.floor(number/1000) + "K";
        } else if (number >=1000000 && number < 1000000000) {
            return getStringNumber(number, 1000000, "M");
        } else{
            return getStringNumber(number, 100000000, "B");
        }
    }

    private static String getStringNumber(int number, int order, String letter) {
        if (Math.floor(number/(order/10))%10 == 0) {
            return (int)Math.floor(number/(order/10))/10 + letter;
        } else {
            return Math.floor(number/(order/10))/10 + letter;
        }
    }

    static String toOrdinary(int number) {
        int lastItem = number%10;
        int lastTwoItems = number%100;
        if (lastItem == 1 && lastTwoItems != 11) {
            return number + "st";
        } else if (lastItem == 2 && lastTwoItems != 12) {
            return number + "nd";
        } else if (lastItem == 3 && lastTwoItems != 13) {
            return number + "rd";
        } else {
            return number + "th";
        }
    }
}
