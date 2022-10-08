import java.util.Scanner;

public class Main {
    static boolean isThere(int[] arr,int value){
    for (int i:
            arr) {
        if(i==value) return true;
    }
    return false;
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dizi boyutunu giriniz : ");
        int n = in.nextInt();
        int[] dizi = new int[n];
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i + 1) + ". eleman sayısını giriniz : ");
            dizi[i] = in.nextInt();
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int k = i + 1; k < dizi.length; k++) {
                int temp = 0;
                if (dizi[i] > dizi[k]) {
                    temp = dizi[i];
                    dizi[i] = dizi[k];
                    dizi[k] = temp;
                }
            }
        }
        System.out.print("Dizi :");
        for (int c :
                dizi) {
            System.out.print(" " + c);
        }
        System.out.println();
        int c=0;
        while (n!=c){
            int i=0;
            while (dizi[c]==dizi[c+1]){
                    c++;
                    i++;
                if(c==(n-1)) break;
            }
                System.out.println(dizi[c] + " sayısı "+ (i+1) +" kere tekrar edildi.");

            c++;
            if(c==(n-1)){
                System.out.println(dizi[c] + " sayısı "+ 1 +" kere tekrar edildi.");
                break;
            }
        }
    }
}