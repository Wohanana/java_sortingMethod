/*傻瓜排序，从小到大依次排列
    定义函数foolSort(int[] list);返回值为数组
    for (i=0 i<list.length i++)
        for (j=i+1 j<list.length j++)
            if list[j]<list[i]:
                temp = list[i]
                list[i] = list[j]
                list[j] = temp
*/
public class foolSort {
    public static int[] foolSort(int[] array){
        int temp;
        for(int i=0;i<array.length;i++){
            for(int j=i;j< array.length;j++){
                if(array[j]<array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] myArray = {12,3,42,32,14,8};
        int[] myArray2 = foolSort(myArray);
        for(int i=0;i<myArray2.length;i++){
            System.out.println(myArray2[i]+";");
        }
    }
    
}
