public class Countingarrays {
    public static void main(String[] args) {
        int a[] = {44, 66, 99, 77, 33, 22, 55};
        int n=55;
        int count=0;
        for(int i=0; i<a.length; i++) {
            for (int j=1; j<a.length; j++) {
                if (a[i] + a[j] == n) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}