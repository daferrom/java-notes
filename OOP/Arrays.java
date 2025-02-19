public class Arrays {
    public static void main(String args[]) {
        // Array declaration //
        int nums[] = { 3, 7, 2, 4 };

        // Update a value
        nums[1] = 6;

        System.out.println(nums[0]); // Expected output 3
        System.out.println(nums[1]); // Expected output 6
        System.out.println(nums[2]); // Expected output 2

        // Array other way of declaration //
        // It fills all the fields with 0 //
        int nums2[] = new int[4];

        System.out.println(nums2[0]);// Expected output 0

        // Array reasigment examples
        nums2[0] = 4;
        nums2[1] = 8;
        nums2[2] = 3;
        nums2[3]= 9;

        
        System.out.println(nums2[0]); // expected output 4

        for(int i=0; i<4;i++){
            System.out.println("Element of nums2 Array: "+  nums2[i]);
        }

    }
}
