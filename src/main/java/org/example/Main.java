package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        String original="madam";
        StringBuilder sb=new StringBuilder(original);
//        sb.append(original);
//        sb.append("hello");


      String  reversed =sb.reverse().toString();
      if(original.equals(reversed)){
          System.out.println(original+ " is a palindrome");
      }else{
          System.out.println(original+ " is not a palindrome");

      }

    }
}