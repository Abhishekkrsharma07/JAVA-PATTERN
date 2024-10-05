public class sqstar {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;n<i;j++){                               // if j=i it will print star.
                System.out.print("*");                          //if  j=n or any value it will print square.
            }
            System.out.println();
        }
    }
    
}