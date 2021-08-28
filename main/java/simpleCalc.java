package main.java;

public class simpleCalc {
    public static int add(String numbers){
        if(numbers.equals(""))
            return 0;
        else if(numbers.contains(",")){
            String[] num = numbers.split(",");
            int ans = 0;
            for(int i=0; i<num.length; i++){
                ans+=Integer.parseInt(num[i]);
            }

            return ans;
        }

        return 0;
    }
}