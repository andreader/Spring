package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    @Override
    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    @Override
    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return "Второй аргумент ноль, на ноль делить нельзя";
        } else {
            float result = num1 / num2;
            return num1 + " / " + num2 + " = " + result;
        }
    }
}
