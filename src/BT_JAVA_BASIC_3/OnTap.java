package BT_JAVA_BASIC_3;

public class OnTap {

    public static void hamThamSoN(int n){
        int number = 100;
        if (number == n) {
            System.out.println(" n= number");


        } else if (n<number) {
            System.out.println(" n < number");


        }else {
            System.out.println(" n > number");

        }

    }


    public static void main(String[] args) {
        int a = 12;
        int b = 24;
        int c = 34;

        System.out.println("(a>b):" + (a>b));
        System.out.println("(a<b):" + (a<b));
        System.out.println("(b==c):" + (b==c));


        boolean kq1  = (c==a) && (a<b);
        boolean kq2 = (a>b) || (b<c);
        System.out.println("(c==a)&&(a<b):" +kq1 );
        System.out.println("(a>b)||(b<c):" +kq2 );

        hamThamSoN(100);
        hamThamSoN(44);
        hamThamSoN(111);

    }



}
