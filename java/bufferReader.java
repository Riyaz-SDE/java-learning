import java.io.*;
class input{
    public static void main(String[] args)
     throws IOException
    {
        BufferedReader bfn = new BufferedReader(
            new InputStreamReader(System.in));

        // String reading internally
        System.out.println("Entere String : ");
        String str = bfn.readLine();

        // Integer reading internally
        System.out.println("Entere Integer : ");
        int it = Integer.parseInt(bfn.readLine());

        // Printing String
        System.out.println("Entered String : " + str);

        // Printing Integer
        System.out.println("Entered Integer : " + it);
    }
}