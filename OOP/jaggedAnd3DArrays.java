public class jaggedAnd3DArrays {
    public static void main(String[] args) {
        // The inner dimension of the nested arrays are not specified
        int nums[][] = new int [3][]; // jagged array

        nums[0] = new int[3]; // it specifies the array size on the parent array first index position
        nums[1] = new int[4]; // it specifies the array size on the parent array second index position
        nums[2] = new int[2]; // it specifies the array size in the parent array third position


        for(int i=0;i<nums.length;i++)
        {
            for(int j=0; j<nums[i].length;j++)
            {
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int n[]: nums)
        {
            for(int m:n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
