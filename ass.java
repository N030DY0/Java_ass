import java.util.Scanner;

public class ass{
    public static void main(String[] args) {
        /* Bello Victor Temitope */
        /* 2300515, 23CD010149 */
        Scanner input = new Scanner(System.in);
        double mean, total_num, part_1, part_2 ,part_3;
        Double[] numbers={2.0,5.0,5.0,9.0,4.0,7.0,0.0,9.0,6.0,11.0,12.0};


         /*No. 1*/
        /*For the Nigerian flag */
        for(int j=0;j<4;j++){
            System.out.println("****====****");
        }/*End of the single loop*/
        System.out.println("End of single loop");
        System.out.println();
        int width=12;
        int height=4;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(j<width/3){
                    System.out.print("*");
                }else if (j<2*width/3) {
                    System.out.print("=");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }/*End of nested loop*/
        System.out.println();

        /*N0. 2 */
        int rows=13;
        int starsperrow=6;
        int totalstars=30;
        int starsinlastrow=totalstars-(starsperrow*(rows-1));
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < (i<rows-1? starsperrow:starsinlastrow); j++) {
                System.out.print("*");   
            }
            for (int j = 0; j < rows; j++) {
                System.out.print("=");
            }
            System.out.println();
        }/* End of single loop */
        System.out.println("End of single loop");
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < starsperrow; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 30; j++) {
                if(i%2==0){
                    System.out.print("=");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        /*No. 3 */
        /*For The Standard deviation */ 
        total_num=0;
        part_1=0;
        for(Double number:numbers){
            total_num=total_num+number;
        }
        mean=total_num/numbers.length; 
        for(Double number:numbers){
            part_1+=Math.pow(number-mean,2);
        }
        /*Median */
        double n=numbers.length;
        /*For sorting */
        for (int i = 0; i < n-1; i++){
            for (int j = i+1; j < n; j++) {
                if(numbers[i]>numbers[j]){
                    double temp = numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        /*Caculating the median */
        double median;
        if(n % 2==0){
            median=(numbers[(int) (n/2-1)]+numbers[(int) (n/2)])/2.0;

        }else{
            median=numbers[(int) (n/2)];
        }
        part_2=part_1/numbers.length;
        part_3=Math.sqrt(part_2);
        System.out.printf("The sd is %.2f",part_3);
        System.out.print("\n");
        System.out.println("The median is"+median); 
        System.out.println();

        /*No. 4*/
        int[]num=new int[10];
        System.out.println("You can only input "+num.length+" numbers");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter your values for NO."+(i+1)+": ");
            num[i]=input.nextInt();
            // System.out.print("\n");
            System.out.println(num[i]);
        }
        System.out.println("The elements you entered are:");
        for (int i = 0; i <=9; i=i+1) {
            System.out.print(num[i]+", ");
        }
        System.out.println();

        /*Question No. 5 */
        System.out.print("\n");
        Scanner scanner =new Scanner(System.in);
        int[][]array_1 = new int[10][10];
        for(int i=0; i<2;i++){
            for(int j=0; j<10; j++){
                System.out.println("Enter your value for row = "+ (i+1) +" col = " + (j+1));
                array_1[i][j]=scanner.nextInt();
            }
        }
        System.out.println("The elements you entered are:");
                for(int i=0;i<=1;i=i+1){//i=i+1 means increament
                    for(int j=0;j<=9;j++){
                        System.out.print(array_1[i][j]+", ");
                    }
                    System.out.print("\n");
                }
    }
}
  /* Bello Victor Temitope */
 /* 2300515, 23CD010149 */