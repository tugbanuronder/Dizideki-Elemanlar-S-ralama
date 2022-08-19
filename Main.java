import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static void sort(int[] arr){

        int min;
        for(int i=0 ; i < arr.length-1 ; i++){

            for(int j=i+1 ; j < arr.length ; j++) {

                if (arr[j] < arr[i]) {

                    min = arr[i];
                    arr[i]=arr[j];
                    arr[j]=min;
                }
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

       Scanner input= new Scanner(System.in);

       System.out.print("Dizinin boyutunu n : ");
       int n=input.nextInt();

       int[] arr= new int[n];
       int counter=0;

       System.out.println("Dizinin elemanlarını giriniz : ");

        for(int i=1 ; i <= n ; i++){

            System.out.print(i + ". elemanı : ");
            int eleman=input.nextInt();

            arr[counter++]=eleman;

        }

        sort(arr);

    }
}