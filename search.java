public class search {
    static void hellow(int [] arr, int num){

        boolean found=false;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("found the value at:"+ i);
                break;
            }
            if (!found) {
                System.out.println("Value is not in the array");
            }
        }
    }

    public static void main(String args []){
        int [] arr={2,4,6,8,7,89,69};
        int num=69;
        hellow(arr, num);
    }
}
