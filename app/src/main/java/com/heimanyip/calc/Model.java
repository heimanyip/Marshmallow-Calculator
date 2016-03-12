package com.heimanyip.calc;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Model {

    public BigDecimal calculate(BigDecimal number1, BigDecimal number2, String operator) {
        switch (operator) {

            case "+":
                return number1.add(number2).round(new MathContext(53));
            case "-":
                return number1.subtract(number2).round(new MathContext(53));
            case "×":
                return number1.multiply(number2).round(new MathContext(53));
            case "÷":
                if (number2.stripTrailingZeros().equals(BigDecimal.ZERO))
                    return BigDecimal.ZERO;

                return number1.divide(number2, 52, RoundingMode.HALF_UP).round(new MathContext(53));
        }

        System.out.println("Unknown operator - " + operator);
        return new BigDecimal(0);
    }

    public BigDecimal invert(BigDecimal number){
        return number.multiply(new BigDecimal(-1)).round(new MathContext(53));
    }

    public BigDecimal sqrt(BigDecimal number) {
        BigDecimal x = new BigDecimal(Math.sqrt(number.doubleValue()));
        return x.add(new BigDecimal(number.subtract(x.multiply(x)).doubleValue() / (x.doubleValue() * 2.0))).round(new MathContext(53));
    }

}