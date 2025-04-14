import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamIJ {
    public static void main (String[] args) {
        System.out.println("Hello from  ParallelStream");

        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();

        for(int i=1; i<=size; i++){
            nums.add(ran.nextInt(100));
        }

        // System.out.println(nums);

        long startSeq1 = System.currentTimeMillis();
        int sum1 = nums.stream()
                .map(n -> {
                    try {
                        Thread.sleep(1);
                    }
                    catch(Exception e) {

                    }
                    return n *2;
                })
                .reduce(0,(c,e) -> c+e );
        long endSeq1 = System.currentTimeMillis();

        long startSeq2 = System.currentTimeMillis();
        int sum2 = nums.stream()
                        .map(n -> {
                            try {
                                Thread.sleep(1);
                            }
                            catch(Exception e) {

                            }
                            return n *2;
                        })
                        .mapToInt(n -> n)
                        .sum();
        long endSeq2 = System.currentTimeMillis();

        long startSeq3 = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                        .map(n -> {
                            try {
                                Thread.sleep(1);
                            }
                            catch(Exception e) {

                            }
                            return n *2;
                        })
                        .mapToInt(n -> n)
                        .sum();
        long endSeq3 = System.currentTimeMillis();

        System.out.println(sum1 + " : " + sum2 + " ; " + sum3);
        System.out.println("Seq1 : " + (endSeq1 - startSeq1));
        System.out.println("Seq2 : " + (endSeq2 - startSeq2));
        System.out.println("Seq3 Parallel: " + (endSeq3 - startSeq3));
        /* Method MapToInt */
    }
}
