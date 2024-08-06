
class riyaz{
    public static Boolean isOdd(int num){
        if(num%2 == 0){
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        int input = 92;
        Boolean answer = isOdd(input);
        String answerString = (answer) ? "yes":"No";
        System.out.println(answerString);
        if(answer){
            System.out.println("working yes");
        }
        System.out.println("working");
    }
}
