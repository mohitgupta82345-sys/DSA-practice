import java.util.Scanner;

class count_posi_neg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int count = 0;
        int neg =0;

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }
         for (int i = 0; i < 5; i++) {
            if (arr[i] < 0) {
                neg++;
            }
        }

        System.out.println("positive Numbers = " + count);
        System.out.println("negative Numbers = " + neg);
    }
}