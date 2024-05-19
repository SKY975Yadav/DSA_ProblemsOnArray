import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int [] ar = {2,0,23,4,0,34,0,232,13};
        moveZerosToEnd(ar);
        System.out.println(Arrays.toString(ar));
    }
    public static void moveZerosToEnd(int [] ar){
        int count = 0;
        for (int i=0;i<ar.length;i++){
            if (ar[i]!=0){
                Main.swap(ar,i,count);
                count++;
            }
        }
    }
}
