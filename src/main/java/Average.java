
public class Average {
    /*
     * Now that we can get the sum of all numbers in an array, we could also figure out how to get the average of an
     * array. The return type of this method double, so a decimal value is expected (as is common in averages).
     *
     * Part of the challenge is that the method receives an array of ints, which do not produce decimal values
     * even in operations where they should! (eg: 3/2=1 if 3 is of type int.)
     *
     * So, before you divide the sum of all numbers by the amount of numbers in order to produce the average,
     * you'll need do convert the sum to type double. How can we do that?
     *
     * @param nums an array to be manipulated.
     * @return the average of all the values of nums.
     */
    public double getAvg(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        return (double) sum/nums.length;
    }
}
