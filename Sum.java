public class Sum {
    public static void main(String[] args) {
        // check if atleast one arguement is being provided
         if(args.length < 1){
            System.out.println("Enter atleast one integer!");
         }
         else {
            int sum = 0; 
            for(String arg: args){
                
                try {
                    int num = Integer.parseInt(arg);
                    sum += num ;
                }

                catch(NumberFormatException e) {
                    // ignore arguments that are not integer
                }
            }
            System.out.println("The sum of the element is : " +sum);
         }
    }
}