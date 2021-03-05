import java.util.ArrayList;
import java.util.Scanner;
public class Main1 {
            Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Problem1 st1 = new Problem1("hi", "123");
        Problem1 st2 = new Problem1("hi2", "1235");
        Problem1 st3 = new Problem1("hello","1234");
        Scanner input = new Scanner(System.in);

        ArrayList<Problem1> list = new ArrayList<Problem1>();

        list.add(st1);
        list.add(st2);
        list.add(st3);



        for(Problem1 var : list) {
            System.out.println(var.getName());
        }

        System.out.println("검색할 학생 이름을 입력해주세요");

        while(true) {
            String var = input.next();
            for(Problem1 var2 : list) {
                if(var.equals(var2.getName())){
                    System.out.println(var2.getNo());
                    break;
                } else {
                    System.out.println("없는 학생 이름");
                    continue;
                }
            }
        }
    }
}
