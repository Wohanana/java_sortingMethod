/*冒泡排序
    相邻比较
*/
public class bubbleSort {
    public static int[] bubbleSort(int[] array){
        int len=array.length;
        for(int j=len-1;j>0;j--){
            for(int i=0;i<j;i++){
                if(array[i+1]<array[i]){
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] myArray = {12,3,42,32,14,8,1};
        int[] myArray2=bubbleSort(myArray);
        for(int i:myArray2){
            System.out.println(i+";");
        }
    }
}
