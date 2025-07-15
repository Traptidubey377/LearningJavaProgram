package ex_01_Java_Basic;

import java.sql.SQLOutput;

public class Lab008_unery_operator {
    public static void main(String[] args){
        // unery operator
         int a = +10;
         //int a  = 10 ; optional

        int b = -100;
        int result = a+b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);

        System.out.println(10==10); //compares the values
        System.out.println(!(10>20));
    }
}
