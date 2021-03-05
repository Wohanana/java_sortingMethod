public class quickSort {
    public static void quickSort(int[] nums,int left,int right){
        if(left>=right) return;
        int temp;
        int i=left;
        int x=nums[left];
        for(int j=left+1;j<=right;j++){
            if(nums[j]<=x){
                i=i+1;
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        temp=nums[i];
        nums[i]=nums[left];
        nums[left]=temp;
        quickSort(nums,left,i-1);
        quickSort(nums,i+1,right);
    }
    public static void main(String[] args) {
        int[] myArray = {12,3,42,32,14,8};
        quickSort(myArray,0, myArray.length-1);
        for(int tmp:myArray){
            System.out.println(tmp);
        }
    }
}
