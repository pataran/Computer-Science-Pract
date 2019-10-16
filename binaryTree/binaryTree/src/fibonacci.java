/**
 * Created by gandolfo on 4/12/2019.
 */
public class fibonacci {

    public void fib(int num){
        int total = 0;

        for(int i = 0; i < num - 1; i++){


            if(total == 0){

                total =  ((num - i)  * (num - i - 1));

            }else{

                total *= num - i - 1;
            }


        }
        System.out.println(total);

    }

    public int jesusFactorial(int num){

        int fact = 1;

        for(int i = 1; i <= 5; i++){
              fact *=i;

        }

        return fact;

    }


    public int easyfactorial(int n)
    {
        int res = 1, i;
        for (i=2; i<=n; i++)
            res *= i;
        return res;
    }

    public int recursiveFactorial(int num){

        if(num == 0){
            return 1;
        }

        return num * recursiveFactorial(num -1);

    }

}
