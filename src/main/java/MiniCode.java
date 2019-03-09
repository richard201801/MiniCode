public class MiniCode {

    public void printStage1(){
        for(int i=1;i<=100;i++){
            if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    public void printStage2(){
        for(int i=1;i<=100;i++){

         if((canDivisibleBy3(i)||isInclude3(i))&&!canDivisibleBy15OrInclude3or5(i))
             System.out.println("Fizz");
         else if((canDivisibleBy5(i)||isInclude5(i))&&!canDivisibleBy15OrInclude3or5(i))
             System.out.println("Buzz");
         else if(canDivisibleBy15OrInclude3or5(i))
             System.out.println("FizzBuzz");

            else
                System.out.println(i);
        }
    }

    private boolean canDivisibleBy3(int i){
        return canBeDivisible(i,3);
    }

    private boolean isInclude3(int i){
        return isIncludeNumber(i,3);
    }

    private boolean canDivisibleBy5(int i){
        if (i%5==0)
            return true;
        else if(String.valueOf(i).contains("5"))
            return true;
        else
            return false;
    }

    private boolean isInclude5(int i){
        return isIncludeNumber(i,5);
    }

    private boolean canDivisibleBy15OrInclude3or5(int i){
        if(canBeDivisible(i,15))
            return true;
        else if(isIncludeNumber(i,3)&&isIncludeNumber(i,5))
            return true;
        else
            return false;
    }

    private boolean canBeDivisible(int i,int a){
        if(i%a==0)
            return true;
        else
            return false;
    }

    private boolean isIncludeNumber(int i,int b){
        String strNum=String.valueOf(i);
        String strB=String.valueOf(b);
        if(strNum.contains(strB))
            return true;
        else
            return false;
    }
}
