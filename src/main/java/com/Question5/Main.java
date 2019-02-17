package com.Question5;

public class Main {

    public static void main(String[] args) {
        System.out.println("Программа печатает числа от 1 до 1000 кратные 3, не кратные 5, сумма цифр которых меньше 10");
        printNumbers(1000,3,5,10);
    }

    public static void printNumbers(int a,int b,int c,int d){
        int sum,j;
        for (int i=1;i<a;i++){
            sum=0;
            if ((i%b==0)&&!(i%c==0)){
                j=i;
                while ((j/10)>0) {
                    sum = sum + j % 10;
                    j=j/10;
                }
                sum=sum+j;
                if (sum<d)
                System.out.println(i);
            }
        }
    }
}
