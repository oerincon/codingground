public class HelloWorld{

    public static void main(String []args){
        StringBuilder result = new StringBuilder();
        
        if (args.length != 1) {
            System.out.println ("One and only one argument is needed");
            return;
        }
        
        for (int i = args[0].length() - 1; i >= 0; --i) {
            result.append (args[0].charAt(i));
        }
        
        System.out.println (result);
    }
}
