/**
 * SkillBuilder3 is a class for completing
 *  Skill Builder 3 in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder3
{
    //remove this before submitting!!!!
    public static void main(String[] args){
        //long num = (long)
        //System.out.println(sumOfDivisorsUsingWhile(args[0]));

    }
    public static String repeat(String s, int numOfTimesToRepeat)
    {
        String result = "";
        // TODO: replace this line with your code

        for (int count = 0; count != numOfTimesToRepeat; count += 1){
            result = result + s;
        }
        return result;
    }
    public static String leftRightTriangle(int height)
    {
        String str = "";
        for (int count = 1; count <= height; count += 1){
            str = str + repeat("*", count) + "\n";
        }
        // TODO: replace this line with your code
        return str;
    }

    public static String rightRightTriangle(int height)
    {
        String str = "";
        // TODO: replace this line with your code
        for (int count = 1; count <= height; count += 1){
            str = str + repeat(" ", (height-count)) + repeat("*", count) + "\n";
        }
        return str;
    }

    public static String circle(int radius)
    {
        String str = "";
        for (int count = 1; count <= (2*radius -1); count += 1){
            int x = (int) Math.sqrt(radius*radius - Math.pow(Math.abs(radius - count), 2));
            str = str + repeat(" ", (radius - x)) + repeat("*", 2*x)
                    +  "\n";
            //repeat(" ", (radius - x)) +
        }
        // TODO: replace this line with your code
        return str;
    }

    public static long sumOfDivisors(long number) {
        long sum = 0;
        for (int count = 1; count < number;count += 1){
            if (number % count == 0){
                sum += count;
            }
        }
        // TODO: replace this line with your code
        return sum;
    }

    public static boolean isPerfect(long number){
        return sumOfDivisors(number) == number;
    }

    public static long sumOfDivisorsUsingWhile(long number){
        long sum = 0;
        int count = 1;
        while (count < number){
            if (number % count == 0){
                sum += count;
            }
            count += 1;
        }
        // TODO: replace this line with your code
        return sum;
    }
}
