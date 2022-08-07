package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = false;
        if (!name.isEmpty()) {
            int first = name.codePointAt(0);
            if (isLowerLatinLetter(first)) {
                for (int i = 1; i < name.length(); i++) {
                    int code = name.codePointAt(i);
                    if (isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code)) {
                        result = true;
                    }

                }
            }
        }
        return result;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return Character.isUpperCase(code);
    }

    public static boolean isLowerLatinLetter(int code) {

        return !isSpecialSymbol(code) && !isUpperLatinLetter(code) && !Character.isDigit(code);
    }
}
