package com.deepthinkerdeveloper.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    public class Sock {

        // Complete the sockMerchant function below.
        static int sockMerchant(int n, int[] ar) {
            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
            int val = 0;
            while(n > 0){
                if(map.containsKey(ar[n-1])){
                    val = map.get(ar[n-1])+1;
                    map.replace(ar[n-1],val);
                } else {
                    map.put(ar[n-1],1);
                }
                n--;
            }
            int total = 0;
            for(Integer num : map.keySet()){
                if(map.get(num) >= 2 ) {
                    total = total + (int) Math.floor(map.get(num) / 2);
                }
            }
            return total;

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            int n = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            int[] ar = new int[n];
//
//            String[] arItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int i = 0; i < n; i++) {
//                int arItem = Integer.parseInt(arItems[i]);
//                ar[i] = arItem;
//            }
            int n = 9;
            int ar[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};
            int result = sockMerchant(n, ar);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//
//            bufferedWriter.close();
//
//            scanner.close();
        }


}
