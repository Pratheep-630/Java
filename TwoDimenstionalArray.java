public class TwoDimenstionalArray{
    public static void main(String []args){
        int[] numbers={1,2,3,4};
        int[][]nums={
            {1,2,3,4},
            {5,6,7,8},
            {1,3,6,8}
         };
        for (int row =0;row<nums.length;row++){
          for(int col=0; col<nums [row].length;col++){
            System.out.println("numbers:"+nums[row][col]);
          }  
          System.out.println();
        }
        nums[0][0]=1200;
        System.out.println("after updating....");
        System.out.println(nums[0][0]);
    }
}