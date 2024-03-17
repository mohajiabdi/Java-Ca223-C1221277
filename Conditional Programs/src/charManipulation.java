public class charManipulation {
    public static void main(String[] args) {
        //System.out.println('a' +1);
        //System.out.println('a' + '1');
        //System.out.println('a' + 'a');
       // System.out.println('m' + "ali");

        char ch = (char)('0'+ Math.random()*('z'- 'a' + 1));
        System.out.println("The generated Letter is " + ch);

        if (('a'<= ch && ch<='z') || ('A'<=ch && ch<='Z') || ('0'<=ch && ch<='9')) {
            System.out.println(ch + " is a Digit or letter");
        }else{
            System.out.println(ch + " is not a Digit or letter");
        }
        System.out.println("\n");
        if('a'<= ch && ch<='z'){
            int upperCase = ((int)ch -32);

            System.out.println("'"+ch+"'"+" is Lowercase Letter and Its Uppercase is "+"'"+(char)upperCase+"'");
        }else if('A'<=ch && ch<='Z'){
            int lowerCase = ((int)ch +32);
            System.out.println();
            System.out.println("'"+ch+"'"+" is Uppercase and Its Lowercase is "+"'"+(char)lowerCase+"'");
        }else if('0'<=ch && ch<='9'){
            System.out.println("'"+ch+"'"+" is Digit");
        } else{
            System.out.println("Its not a valid Letter!!!");
        }

    }
}
