import java.util.ArrayList;
import java.util.Random;

public class Student{
    public static ArrayList<Question> getArray(int n) {


        ArrayList<Question> Array = new ArrayList<Question>();
        Random rand = new Random();
        for (int i = 0;i < 10;i ++){
            Question Q1 = new Question();

            int r1 = rand.nextInt(99) + 1;
            Q1.setNum1(r1);
            int r2 = rand.nextInt(99) + 1;
            Q1.setNum1(r2);
            int r3 = rand.nextInt(10) + 1;
            int op = rand.nextInt(4);

            switch (op) {
                case 0:

                    String sign1 = "+";
                    Q1.setSign(sign1);
                    System.out.println(r1 + "+" + r2 + "=");
                    int res1 = r1 + r2;
                    Q1.setRes(res1);
                    break;
                case 1:
                    String sign2 = "-";
                    Q1.setSign(sign2);
                    System.out.println(r1 + "-" + r2 + "=");
                    int res2 = r1 - r2;
                    Q1.setRes(res2);
                    break;
                case 2:
                    String sign3 = "*";
                    Q1.setSign(sign3);
                    System.out.println(r1 + "*" + r2 + "=");
                    int res3 = r1 * r2;
                    Q1.setRes(res3);
                    break;
                case 3:
                    if (r1 % r2 == 0) {
                        String sign4 = "/";
                        Q1.setSign(sign4);
                        System.out.println(r1 + "/" + r2 + "=");
                        int res4 = r1 / r2;
                        Q1.setRes(res4);
                    }
                    else{
                        if(r1/r2 != 0) {
                            String sign4 = "/";
                            Q1.setSign(sign4);
                            System.out.println((r1 / r2 * r3) + "/" + (r1 /r2) + "=");
                            int res4 = (r1 /r2 *r3)/ (r1 /r2);
                            Q1.setRes(res4);
                        }
                        else {
                            String sign4 = "/";
                            Q1.setSign(sign4);
                            System.out.println((r2 / r1 * r3) + "/" + (r2 /r1)+ "=");
                            int res4 = (r2 /r1 *r3)/ (r2 /r1);
                            Q1.setRes(res4);
                        }
                    }
                    break;
            }
            Array.add(Q1);

        }
        return Array;
    }

}
