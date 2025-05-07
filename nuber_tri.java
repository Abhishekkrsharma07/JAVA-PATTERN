//  public class numbertri {
//     static void numTriangle(int n){
//         for(int i=1;i<n;i++){
//             for(int j=1;j<=i+1;j++){
//                 System.out.print(j+"");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]){
//         int n=4;
//         numTriangle(n);
//     }
// }
// public class Solution {
//     public static void nTriangle(int n) {
//         // Write your code 
//         for(int i=0;i<n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j +" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         int n=3;
//         nTriangle(n);

//     }
    
// }
public class nuber_tri {
    public static void nTriangle(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int n = 3;
        nTriangle(n);
    }
}

