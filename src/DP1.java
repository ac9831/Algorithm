import java.util.Scanner;

/**
 * Created by gunjunLee on 2016-08-16.
 */
public class DP1 {



    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int money = scan.nextInt();
        int company = scan.nextInt();

        int mapValue[][] = new int[company][money];
        int result[][] = new int[company][money];
        int tempValue[][] = new int[company][money];
        int z;

        for(int i=0;i<money;i++){
            z = scan.nextInt();
            for(int j=0;j<company;j++){
                mapValue[j][z-1] = scan.nextInt();
            }
        }


        for(int i=1;i<company;i++){
            for(int j=0;j<money;j++){
                for(int k=0;k<=j;k++){
                    if(tempValue[i-1][j-k] + mapValue[i][k] > tempValue[i][j]){
                        tempValue[i][j] = tempValue[i-1][j-k] + mapValue[i][k];
                        result[i][j] = k+1;
                    }
                }
            }
        }

        int tempMoney = money-1;
        int outResult[] = new int[company];

        for(int i=company-1;i > 0;i--){
            outResult[i] = result[i][tempMoney];
            tempMoney -= outResult[i];
        }

        for(int i=0;i<company;i++){
            System.out.print(outResult[i] + " ");
        }

        System.out.println();
        System.out.println(tempValue[company-1][money-1]);


    }
}
