package main.java;

public class simpleCalc {
    public static int add(String numbers) throws Exception{
        if(numbers.equals(""))
            return 0;
        else if(numbers.contains(",") || numbers.contains("\n")){
            return helper(numbers);
        }

        return Integer.parseInt(numbers);
    }

    private static int helper(String str) throws Exception{
        
        String deli = ",|\n";
        String[] nums = str.split(deli);
        char[] arr;
        int ans=0;
        String neg = "";

        if(nums[0].contains("//")){
            arr = nums[0].toCharArray();
            deli += "|" + arr[2];

            for(int i=1; i<nums.length; i++){
                String[] stringDeli = nums[i].split(deli);

				for(int j=0; j<stringDeli.length;j++)
                {
                    if(Integer.parseInt(stringDeli[j]) < 0)
						neg += stringDeli[j];
                    else
					    ans += Integer.parseInt(stringDeli[j]);
                }
            }
        } else {
            for(int i=0; i<nums.length; i++){
                if(Integer.parseInt(nums[i]) < 0)
                    neg += nums[i];
                else
                    ans += Integer.parseInt(nums[i]);
            }
        }

        if(!neg.equals(""))
            throw new Exception("Negatives number(s) detected"+neg);

        return ans;
    }
}