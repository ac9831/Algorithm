/**
 * Created by gunjunLee on 2016-08-13.
 */
public class QuickSort {

    private static int MAX = 100;
    private int buf[] = new int[MAX];

    public int[] getBuf(){
        return buf;
    }

    public static void main(String[] args){
        QuickSort qs = new QuickSort();

        qs.MakeRandomNumber();
        qs.DisplayBuffer();

        qs.QuickSort(qs.getBuf(), 0, MAX-1);

        System.out.println(" ");

        qs.DisplayBuffer();
    }

    public void MakeRandomNumber(){
        int i = 0;
        int Num;

        while(i < MAX){
            Num = (int)(Math.random() * 100) + 1;
            if(IsNumber(Num, i)){
                buf[i] = Num;
                i++;
            }
        }
    }

    public boolean IsNumber(int num, int index){
        for(int i=0;i<index;i++){
            if(buf[i] == num){
                return false;
            }
        }
        return true;
    }

    public void QuickSort(int data[], int left, int right) {
        if (data == null || data.length == 0)
            return;

        if (left >= right)
            return;

        // pick the pivot
        int middle = left + (right - left) / 2;
        int pivot = data[middle];

        // make left < pivot and right > pivot
        int i = left, j = right;
        while (i <= j) {
            while (data[i] < pivot) {
                i++;
            }

            while (data[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (left < j)
            QuickSort(data, left, j);

        if (right > i)
            QuickSort(data, i, right);

    }

    public void DisplayBuffer(){

        for(int i=0;i<MAX;i++){
            if(i % 10 == 0)
                System.out.println(" ");

            System.out.print(buf[i] + " ");
        }

    }



}
