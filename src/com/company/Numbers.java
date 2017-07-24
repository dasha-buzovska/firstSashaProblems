package com.company;

class Numbers {
    
    //рахую суму римскьх чисел
    static String sum(String expression) {
        String left = "", right = "";
        int i = 0;
        while (expression.charAt(i) != '+') {
            left = left.concat(Character.toString(expression.charAt(i)));
            i++;
        }
        right = expression.substring(i + 1, expression.length());
        return arabicToRoman(romanToArabic(left) + romanToArabic(right));
    }

    static String arabicToRoman(int number) {
        String result = "";
        if (number == 0) {
            return "The number zero does not have its own Roman numeral, " +
                    "but the word nulla was used by medieval scholars in lieu of 0.";
        }
        int ones = number%10;
        int decimals = (number%100 - ones)/10;
        int hundreds = (number%1000 - decimals - ones)/100;
        //int thousands = (number%10000 - hundreds - decimals - ones)/1000;
        result += createConstruction("C", "D", "M", hundreds);
        result += createConstruction("X", "L", "C", decimals);
        result += createConstruction("I", "V", "X", ones);

        return result;
    }

    private static String createNumber (int x, String order) {
        String result = "";
        for (int i = 0; i < x; i++) {
            result = result.concat(order);
        }
        return result;
    }

    private static String createConstruction (String from1to3, String five, String tens, int number) {
        String result = "";
        if (number == 0) {
            return result;
        }
        int fifths = number / 5;
        int withoutFifths = number % 5;
        if (fifths == 1) {
            if (withoutFifths != 4) {
                result += five;
                result += createNumber(withoutFifths, from1to3);
            } else {
                result += from1to3 + tens;
            }
        } else if (withoutFifths >= 1 && withoutFifths <= 3) {
            result += createNumber(withoutFifths, from1to3);
        } else {
            result += from1to3 + five;
        }
        return result;
    }

    private static int calculateByOrder(String number, int step) {
        int result = 0;
        for (int i = step; i <= 9 * step; i += step) {
            //проблема в тому, що коли воно перевіряє чи міститься в цьому IV оце V, то присвоює значення 5 і катастрофа
            if (number.contains(arabicToRoman(i))) {
                result = i;
            }
        }
        return result;
    }

    static int romanToArabic(String number) {
        //гавнокод:)
        int result = 0;
        if (number.length() > 1 && number.substring(number.length() - 2, number.length()).equals("IV")) {
            result += -1;
        }
        result += calculateByOrder(number, 1);
        result += calculateByOrder(number, 10);
        result += calculateByOrder(number, 100);
        return result;
    }
}
