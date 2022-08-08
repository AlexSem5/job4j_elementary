package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = !name.isEmpty() && isLowerLatinLetter(name.codePointAt(0));
            if (result) {
                for (int i = 1; i < name.length(); i++) {
                    int code = name.codePointAt(i);
                    if (!(isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code) || Character.isDigit(code))) {
                        result = false;
                        break;
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
