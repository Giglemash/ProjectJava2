package Lesson_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Stats<T extends Number, String> {
    private T[] nums;

    public Stats(T[] nums) {
        this.nums = nums;
    }

    public double avg() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }

        return sum/nums.length;
    }

    public boolean sameAvg(Stats<?,?> another) {
        return Math.abs(this.avg() - another.avg()) < 0.0001;
    }
}

class StartDemo {
    public static void main(String[] args) {


        Integer inums1[] = {1,2,3,4,5};
//        Integer inums2[] = {1,2,3,4,5};
//
   //     ArrayList<String> al1 = new ArrayList<>();
//        ArrayList<Integer> al2 = new ArrayList<>();
//
//        HashMap<Integer, ArrayList<String>> hm = new HashMap<>();
//
//
//        //Double dnums[] = {1.0,2.0,3.0,4.0,5.0};
//        String snums[] = {"Str1", "str2"};
//
        Stats<Integer, String> iob1 = new Stats<>(inums1);


     //   Stats<String> iob2 = new Stats<>(snums);
      //  System.out.println(iob1.sameAvg(iob2));

    //    Double dnums[] = {1.0,2.0,3.0,4.0,5.0};

//        Stats<Integer> iob = new Stats<>(inums);
//        System.out.println(iob.avg());
//
//        Stats<Double> dob = new Stats<>(dnums);
//        System.out.println(dob.avg());
    }
}
