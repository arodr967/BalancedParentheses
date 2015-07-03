/*
File name: BalancedParentheses.java
Determine if a string has balanced parentheses.
 */
package balancedparentheses;
import java.util.Stack; 
//*********PROPERTY OF ALICIA RODRIGUEZ**********
public class BalancedParentheses {
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    /**
     * Method that reads in a text stream from standard input and uses a stack to 
     * determine whether its parentheses are properly balanced.
     * For example, your program should print true for [()]{}[{[()()]()}] and false for {[(])}.
     * @param s String of characters
     * @return true or false if parentheses are balanced
     */
    public static boolean balancedParentheses(String s) {
        Stack<Character> parenthesis = new Stack<>(); //singular parentheses
//*********PROPERTY OF ALICIA RODRIGUEZ**********
        int i = 0;
//*********PROPERTY OF ALICIA RODRIGUEZ**********
        while (i < s.length()) {
            char c = s.charAt(i);
//*********PROPERTY OF ALICIA RODRIGUEZ**********
            if (c == '(' || c == '{' || c == '[') {
                parenthesis.push(c);//*********PROPERTY OF ALICIA RODRIGUEZ**********
            } else {
                if (parenthesis.isEmpty()) {
                    return false;
                } else {
                    char cPop = parenthesis.pop();
                    if (!(cPop == '(' && c == ')') && !(cPop == '{' && c == '}')
                            && !(cPop == '[' && c == ']')) {
                        return false;
                    }//*********PROPERTY OF ALICIA RODRIGUEZ**********
                }
            }//*********PROPERTY OF ALICIA RODRIGUEZ**********
            i++; //increment index                 
        } //end of String

        return parenthesis.isEmpty();
    }//*********PROPERTY OF ALICIA RODRIGUEZ**********
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    public static void main(String[] args) {
        String beTrue = "[()]{}[{[()()]()}]";
        String beFalse = "{[(])}";
        System.out.println("True? " + balancedParentheses(beTrue));
        System.out.println("False? " + balancedParentheses(beFalse));
    }//*********PROPERTY OF ALICIA RODRIGUEZ**********
//*********PROPERTY OF ALICIA RODRIGUEZ**********
}//end of BalancedParentheses class definition
//*********PROPERTY OF ALICIA RODRIGUEZ**********
