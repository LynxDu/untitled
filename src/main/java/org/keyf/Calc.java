package org.keyf;

public class Calc {

    public int summ(int a, int b){
        int res;
        res = a + b;
        System.out.printf("%d + %d = %d\n",a,b,res);
        return res;
    }

    public int sub(int a, int b){
        int res;
        res = a - b;
        System.out.printf("%d - %d = %d\n",a,b,res);
        return res;
    }

    public double divide(int a, int b) {
        double result;
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено");
        } else {
            result = Double.valueOf(a)/Double.valueOf(b);
            System.out.printf("%d / %d = %.02f\n",a,b,result);
        }
        return result;
    }



    public int mul(int a, int b){
        int res;
        res = a * b;
        System.out.printf("%d * %d = %d\n",a,b,res);
        return res;
    }
}
