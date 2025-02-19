class MultidimensionalArrays {
    public static void main(String[] args) {
        // An array of array(s)
        int arrX = 3;
        int arrY = 4;

        int nums[][] = new int[arrX][arrY];
        int random = 0  ;

        for(int i =0; i<arrX; i++)
        {
            for(int j=0;j<arrY;j++)
            {
                nums[i][j] = (int)(Math.random() * 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // Anoter way to iterate over an array
        for(int n[] : nums)
            {
                for(int m: n)
                {
                    System.out.print(m + " Hi ");

                }
                System.out.println();
            }
    }
}