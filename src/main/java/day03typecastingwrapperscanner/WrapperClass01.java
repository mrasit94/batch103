package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        byte primitiveByte = 12;
        //primitiveByte. yazildiginda java size method vermez//
        Byte wrapperByte = 12;
        //wrapperByte. yazildiginda () method verir.

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        //


        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        //primitiveler nasil wrapper yapilir

        float f1 = 12.99F;
        Float wrapperF1 = f1;

        //wrapperlar nasil primitivelere cevirilir.

        Character w1 = 's';
        char primitiveW1 = w1;



    }
}
