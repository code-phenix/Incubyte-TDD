package src;

public class Calculator {

    //base case
    // String of integer

    //Input: "", "1", "1,5"
    //Output: 0, 1, 6
    protected int add(String number){
        //solving the initing base case that is empty

        //intput : "" output : 0
        if(number==null|| number.isEmpty()){
            return 0;
        }

    //solving one or more integer in a String.
        //split the String with the comma as delimmitter

        //Allow the add method to handle new lines between numbers (instead of commas).
//The following input is valid: "1\n2,3" (will return 6)
//    The following input is invalid: "1,\n"


        String num[]=number.split("[\n,]");
//        we can use the multiple Delimetter Also , like [,?//n?/n]
        //variable for storing the sum of values in String
        int sum=0;
        //case 1:
            //if input has one number (ie) input : "1" output: 1
            if(num.length==1)
                return Integer.parseInt(num[0]);

            for(String iter:num){
                if( iter.contains("\\n") || iter.contains("\n")){
                    String temp[]=iter.split("\\\\n");
                    for(String tempNumber:temp){
                        sum+=Integer.parseInt(tempNumber);
                    }
                    continue;
                }
                sum+=Integer.parseInt(iter);
            }

            return sum;

    }

}
