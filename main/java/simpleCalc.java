package main.java;

public class simpleCalc {
    public static int add(String numbers){
        if(numbers.equals(""))
            return 0;
        else if(numbers.contains(",") || numbers.contains("\n")){

            String[] num = numbers.split(",|\n");
            int ans = 0;

            for(int i=0; i<num.length; i++){
                ans+=Integer.parseInt(num[i]);
            }

            return ans;
        }

        return 0;
    }
}