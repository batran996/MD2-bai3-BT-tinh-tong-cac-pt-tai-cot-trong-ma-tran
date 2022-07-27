import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        ///////////khai bao dòng và cột
        int dong,cot;
        System.out.println("nhập vào số dòng ma trận");
        dong = scanner.nextInt();
        System.out.println("nhập vào số cột của ma trận");
        cot = scanner.nextInt();
        ////khai báo ma trận///////
        int[][] array = new int[dong][cot];
        System.out.println("nhập các phần tử ma trận");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("array["+(i+1)+"]["+(j+1)+"] = ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("nhập cột bạn muốn tính tổng");
        cot = scanner.nextInt();
        int tong = 0;
        for (int i = cot; i < array.length ;) {
            for (int j = 0; j < array.length; j++) {
                 tong += array[cot][j];
            }
        }
        System.out.println(" tổng các phần tử ở cột "+ cot +" là: "+ tong);


    }
}