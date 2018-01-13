import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn=new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int data[][] = new int[rows][cols];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                data[i][j] = scn.nextInt();
            }
        }
        for (int j=0;j<cols;j++){
            for (int i=0;i<rows;i++){
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
