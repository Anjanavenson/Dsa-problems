import java.util.Arrays;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Integer a[]={44,66,99,77,33,22,55};
        int smallest=a[0];
        int largest=a[0];
        for(int i=1; i<a.length;i++){
            if (a[i]>largest){
                largest=a[i];
            }else if (a[i]<smallest){
                smallest=a[i];
            }
        }
        //int n=a.length;
        //Arrays.sort(a);
        System.out.println("Smallest no is: "+smallest);
        //int b[]={44,66,99,77,33,22,55};
        //Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Largest no is: "+largest);
    }
}
