package com.campusdual.classroom;

public class Exercise {

    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
        try {
            return dividend / divisor;
        } catch (ArithmeticException e) {
            throw new DivisionByZeroException("División entre o, error");
        }

    }

    public static void main(String[] args) {
        try {
            int result = Exercise.divisionWithCustomException(3, 0);
            System.out.println("resultado" + result);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finalizando programa");
        }
    }
}
