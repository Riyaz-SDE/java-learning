/**
 * static means this method belongs to main and not an object of main class 
 * shadowing is way of creating two variable on same name
 * function overloading  is function with same name with (different number of argument or  type of argument)
 */
class Main{
    static String x = "x will going to shadowed";
    public static void main(String[] args){
        String x = "x was shadowed now";
        getX();
        System.out.println(x);
        variableOfArguments(1,2,3,4,5);
    }
    static void getX(){
        System.out.println(x);
    }

    static void variableOfArguments(int ...nums){
        int i = 1;
        for(int num: nums){
            System.out.println("argumen-"+ i + " : "+num);
            i++;
        }
    }
}