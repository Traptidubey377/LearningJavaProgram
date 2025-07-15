package ex_01_Java_Basic;

public class Lab010_logical_operator {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a);

        boolean b = true;
        System.out.println(!!b);  //not gate

        boolean c = true || false;  //or gate
        System.out.println(c);

        boolean d = true && false;  // And gate
        System.out.println(d);

        int balaji_salery = 12;
        System.out.println(!(balaji_salery > 10 || balaji_salery < 5 ));
    }
}
