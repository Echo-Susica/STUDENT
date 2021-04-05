import java.util.ArrayList;
import java.util.Random;

public class Student{
    public static ArrayList<Question> getArray(int n) {

        ArrayList<Question> Array = new ArrayList<Question>();
        Question Q1 = new Question();
        Random rand = new Random();
        for(int i = 0;i < n;i ++){

            int r1 = Q1.getNum1();
            r1 = rand.nextInt(100) + 1;
            int r2 = Q1.getNum2();
            r2 = rand.nextInt(100) + 1;
            int r3 = rand.nextInt(10) + 1;
            int op = rand.nextInt(4);

            switch (op) {
                case 0:
                    String sign1 = Q1.getSign();
                    sign1 = "+";
                    System.out.println(r1 + "+" + r2 + "=");
                    break;
                case 1:
                    String sign2 = Q1.getSign();
                    sign2 = "-";
                    System.out.println(r1 + "-" + r2 + "=");
                    break;
                case 2:
                    String sign3 = Q1.getSign();
                    sign3 = "*";
                    System.out.println(r1 + "*" + r2 + "=");
                    break;
                case 3:
                    if (r1 % r2 == 0) {
                        String sign4 = Q1.getSign();
                        sign4 = "/";
                        System.out.println(r1 + "/" + r2 + "=");
                    }
                    else{
                        if(r1/r2 != 0) {
                            String sign4 = Q1.getSign();
                            sign4 = "/";
                            System.out.println((r1 / r2 * r3) + "/" + (r1 /r2) + "=");
                        }
                        else {
                            String sign4 = Q1.getSign();
                            sign4 = "/";
                            System.out.println((r2 / r1 * r3) + "/" + (r2 /r1)+ "=");
                        }
                    }
                    break;
            }
            Array.add(Q1);

        }
        return Array;
    }

}
