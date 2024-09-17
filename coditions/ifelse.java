// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int age = 19;
        String output = "";
        int fund = 0;
        if(age < 18 ){
            output += "You are minor";
            String day = "monday";
            printDay(day);
            
        }else if(age >50){
            output += "You are too old";
            String day = "not";
            printDay(day);
        }else{
            output += "eligible";
            String day = "wednesday";
            printDay(day);
        }
        System.out.println(output);
    }
    static void printDay(String day){
        switch(day){
            case "monday":
                System.out.println("This is monday");
                break;
            case "tuesday":
                System.out.println("This is tuesday");
                break;
            case "wednesday":
                System.out.println("This is wednesday");
                break;
            default:
                System.out.println("This is not valid day");
        }
    }
}