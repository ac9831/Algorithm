import java.util.Scanner;

/**
 * Created by gunjunLee on 2016-08-16.
 */
public class ChangeCoin {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int coinNum = scan.nextInt();
        int change = scan.nextInt();

        int coinValues[] = new int[change+1];
        int count[] = new int[change+1];
        int coin[] = new int[change+1];

        for(int i=1;i<=coinNum;i++){
            coinValues[i] = scan.nextInt();
        }

        count[coinValues[0]] = 1;
        coin[coinValues[0]] = 0;
        for(int i=coinValues[0];i<=change;i++){
            count[i] = count[i-coinValues[0]] + 1;
            coin[i] = 0;
        }

        for(int i=1;i<coinNum;i++){
            for(int j=1;j<=change;j++){
                if(coinValues[i] <= j){
                    if(count[j] > count[j-coinValues[i]] + 1){
                        count[j] = count[j-coinValues[i]] + 1;
                        coin[j] = i;
                    }
                }
            }
        }

        System.out.println("사용한 코인의 합 : " + count[change]);

        int i=change;
        int a = 10;
        do{
            System.out.print(coinValues[coin[i]] + " ");
            i -= coinValues[coin[i]];
            a--;
        }while(i > 0 && a > 0);


    }

}
