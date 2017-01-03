package interview;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by gunjunLee on 2016-11-30.
 */
public class LinkedListNth {

    public static void main(String[] args){

        LinkedList<String> lists = new LinkedList<>();
        lists.add("1");
        lists.add("2");
        lists.add("a");
        lists.add("X");


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0;i<=lists.size()-n;i++){
            lists.pop();
        }
        System.out.println(lists.peek());

    }

}
