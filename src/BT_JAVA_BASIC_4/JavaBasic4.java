package BT_JAVA_BASIC_4;

public class JavaBasic4 {

    public static void main(String[] args) {
        int soChan [] = new int[26];
        int index =0;

        for (int i = 0; i<=50; i++){
            if(i%2==0){
               soChan[index] = i;
               index++;
            }
        }

        System.out.println("Các số chẵn từ 0 đến 50:");
        for(int i: soChan){
            System.out.println(i);
        }
    }

}
