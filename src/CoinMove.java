import java.util.*;

/**
 * Created by gunjunLee on 2016-08-12.
 */
public class CoinMove {

    public static void main(String[] args){
        int testCase, p, totalBeans, averBeans, num_pocket;
        int pocket[] = new int[33000];
        Scanner scan = new Scanner(System.in);
        int num_Moves = 0;


        testCase = scan.nextInt();

        for(int i=0;i<testCase;i++){
            num_Moves = 0;
            totalBeans = 0;

            num_pocket = scan.nextInt();

            for(int j=0;j<num_pocket;j++){
                pocket[j] = scan.nextInt();
                totalBeans = totalBeans + pocket[j];
            }

            if((totalBeans % num_pocket) == 1){
                num_Moves = -1;
            }else{
                averBeans = totalBeans / num_pocket;

                for(int j =0;j<num_pocket;j++){
                    if(pocket[j] < averBeans){
                        num_Moves = num_Moves + (averBeans - pocket[j]);
                        System.out.println("pocket[" + j + "]의 이동 횟수 : " + (averBeans - pocket[j]));
                    }
                }
            }

            System.out.println("누적 이동 횟수 : " + num_Moves);

        }


    }
}
