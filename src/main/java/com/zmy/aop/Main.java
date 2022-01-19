package com.zmy.aop;

/**
 * @Author: MengyaoZeng
 * @Telephone: 18573903136
 * @Email: 343722243@qq.com
 * @Description:
 * @Date: Created in 21:36 2022/1/19
 */
public class Main {
    public static void main(String[] args) {
        MyCalculatorImpl myCalculator = new MyCalculatorImpl();
        MyCalculator calculator = (MyCalculator) CalculatorProxy.getInstance(myCalculator);
        int add = calculator.add(3, 4);
        System.out.println("add = " + add);
    }
}
