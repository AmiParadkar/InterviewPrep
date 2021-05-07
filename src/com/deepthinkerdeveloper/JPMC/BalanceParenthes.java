package com.deepthinkerdeveloper.JPMC;

import java.util.*;


public class BalanceParenthes{

//    public  static boolean isBalanced(String str){
//        boolean balance = false;
//        Map<String, Integer> mapBraces = new HashMap<>();
//        Charcter[] chArrary = str.toCharArray();
//        chArrary.forEach(ch -> {
//            if (ch == "(" || ch == "[" || ch == "{") {
//                if (mapBraces.get(ch) != null) {
//                    mapBraces.put(ch, mapBraces.get(ch) + 1);
//                } else
//                    mapBraces.put(ch, 1);
//
//            } else if (ch == ")" || ch == "]" || ch == "}") {
//                if (mapBraces.get(ch) != null) {
//                    mapBraces.put(ch, mapBraces.get(ch) + 1);
//                } else
//                    mapBraces.put(ch, 1);
//            }
//
//        });
//        if(mapBraces.get("(") == mapBraces.get(")")
//                    && mapBraces.get("[") == mapBraces.get("]")
//                    && mapBraces.get("{") == mapBraces.get("}")){
//            balance = true;
//        }
//
//
//        return balance;
//    }

    public static boolean isBalanceWithStack(String str){
        Stack bracketsStack = new Stack();
        boolean balanced  = false;
        String[] sampleBraces = {"(", "[", "{", ")", "]", "}"};
        String[] chArray = str.split("") ;//toCharArray();

        for(String s: chArray){
            final boolean b = s.equals("(") || s.equals("[") || s.equals("{");
            final boolean b1 = s.equals(")") || s.equals("]") || s.equals("}");
            if(bracketsStack.empty()){
                if(b){
                    bracketsStack.push(s);
                } else {
                    if (!b1) {
                        continue;
                    }
                    balanced = false;
                    break;
                }
            } else {
                if(bracketsStack.peek().equals("(") && s.equals(")")){
                    bracketsStack.pop();
                    balanced = true;
                } else if(bracketsStack.peek().equals("[") && s.equals("]")){
                    bracketsStack.pop();
                    balanced = true;
                }else if(bracketsStack.peek().equals("{") && s.equals("}")){
                    bracketsStack.pop();
                    balanced = true;
                }else if (b) {
                    bracketsStack.push(s);
                } else if(b1){
                    balanced = false;
                }
            }
        }

        return balanced;
                 
    }

    public static void main (String args[]){
        String str = "([{]})";
        System.out.println(BalanceParenthes.isBalanceWithStack(str));
    }
}
