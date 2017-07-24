package com.company;

class Facebook {

    static String compressNumber(int number) {
        if (number < 1e3) {
            return "" + number;
        } else if (number < 1e6) {
            return getStringNumber(number, (int) 1e3, "K");
        } else if (number < 1e9) {
            return getStringNumber(number, (int) 1e6, "M");
        } else {
            return getStringNumber(number, (int) 1e9, "B");
        }
    }

    private static String getStringNumber(int number, int order, String letter) {
        if (number >= order*10 || number%order < order/10) {
            return (int) Math.floor(number/order) + letter;
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
