package one;

public class Main {
        public static void main(String[] args) {
            StringOperation toUpperCase = str -> str.toUpperCase();

            System.out.println(toUpperCase.apply("hello world"));
        }
    }

