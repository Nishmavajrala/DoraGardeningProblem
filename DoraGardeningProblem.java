import java.util.Scanner;

public class MangoTreeIdentification {
    public static void main(String... aaa) {
        Scanner sc = new Scanner(System.in);
        int rowValue, columnValue, treeNumber;
        rowValue = sc.nextInt();
        columnValue = sc.nextInt();
        treeNumber = sc.nextInt();
        int[][] Array =new int[rowValue][columnValue];
        for(int i=0;i<rowValue;i++)
        {
            for(int j=0;j<columnValue;j++)
            {
                if(i==0|| j==0||j==columnValue-1)
                {
                    Array[i][j]=1;
                }
                else
                    Array[i][j]=0;
            }
        }
        int temp=0;
        for(int i=0;i<rowValue;i++)
        {
            for(int j=0;j<columnValue;j++)
            {
                temp++;
                if(temp==treeNumber)
                {
                    if(Array[i][j]==1)
                    {
                        System.out.println("Mango");
                    }
                    else
                    {
                        System.out.println("Not mango");
                    }
                    break;
                }
            }
        }
    }
}