/*插入排序
   定义函数insertSort(int[] array)
   for(i=1 i<array.length i++){
        int temp = array[i]
            j=i-1
        while (j>=0 && temp<array[j]){
            array[j+1] = array[j]
            j--
        }
        array[j+1] = temp
   }
*/
public class insertSort {
    public static int[] insertSort(int[] array){
        for(int i=1;i<array.length;i++){
            int temp=array[i];
            int j=i-1;
            while(j>=0 && temp<array[j]){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=temp;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] myArray = {12,3,42,32,14,8};
        int[] myArray2 = insertSort(myArray);
        for(int i=0;i<myArray2.length;i++){
            System.out.println(myArray2[i]+";");
        }
    }
}
