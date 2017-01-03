import java.util.Scanner;

/**
 * Created by gunjunLee on 2016-08-13.
 */
public class MoneySlide {



    public static void main(String[] args){
        int MAXIMUM = 100000000;
        int MAX_ELEMENTS = 10000;


        int workingSet, T;
        int targetMoney, availableMoney;

        Scanner scan = new Scanner(System.in);

        T = scan.nextInt();

        workingSet = 0;

        while(workingSet < T){
            int solutions[] = new int[MAX_ELEMENTS+1];
            targetMoney = scan.nextInt();
            availableMoney = scan.nextInt();

            solutions[0] = 1;

            for(int i=1;i<=availableMoney;i++){
                for(int j=i;j<=targetMoney;j++){
                    solutions[j] = (solutions[j] + solutions[j-i]) %MAXIMUM;
                    System.out.println("solution[" + j + "]: " + solutions[j]);
                }
            }
            System.out.println(solutions[targetMoney]);
            workingSet++;

        }



    }

}
