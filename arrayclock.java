import java.util.Scanner;

public class arrayclock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the row value : ");
        int row = sc.nextInt();
        System.out.print("enter the col value : ");
        int col = sc.nextInt();
        int tmp = 0;
        int a[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("enter values : ");
                a[i][j] = sc.nextInt();
            }
        }
        tmp=row;
        row=col;
        col=tmp;
        for(int i=row-1;i>=0;i--){
            for(int j=0;j<col;j++){
            System.out.print(a[j][i]+" ");
            }
            System.out.println("");
        }

    }
}