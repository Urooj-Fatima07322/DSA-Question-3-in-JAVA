public class reverseAnArray {
    void reverse(int len,int array[]){
        int start=0;
        int end=len-1;
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String [] args){
        int array[]={4,2,7,8,1,2,5};
        int len=array.length;
        new reverseAnArray().reverse(len, array);
        for (int i=0;i<len; i++){
            System.out.println(array[i]+" ");
        }
    }
}
