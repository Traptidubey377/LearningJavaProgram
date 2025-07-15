package ex_01_Java_Basic;

public class Lab006_char_Literal {
    public static void main(String[] args) {
        char C1 = 'a';   // A to z,a-z, !@#$%^&*()_+
        char C2 = 'B';
        char C3 = '@';
        char C4 = '_';
        char C5 = '9';
        char C6 = '(';

        //ESCAPe char
         char new_line = '\n';
         char tab_line = '\t';
         char back_space = '\b';
         char carriage_return= '\r';

        System.out.println("TraptiDubey");
        System.out.println("Trapti"+new_line+"Dubey");
        System.out.println("Trapti"+tab_line+"Dubey");
        System.out.println("Trapti"+back_space+"Dubey");
        System.out.println("Trapti"+carriage_return+"Dubey");

        System.out.println("Hi, this is first line"+new_line+"This is second line \n This is third line");

    }
}
