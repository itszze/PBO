package Praktikum.PraktikumPBO.sesi2;

public class Logika {

    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        boolean test = false;

        //demonstrasi &&
        test = (i > 10) && (j++ > 9);
        System.out.println(i); //0
        System.out.println(j); //10
        System.out.println(test); //false

        //demonstrasi &
        test = (i > 10) & (j++ > 9);
        System.out.println(i); //0
        System.out.println(j); //11
        System.out.println(test); //false
    }
}
