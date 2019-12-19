package com.company.AType;

import java.util.Scanner;

public class TooLong71A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        String InputText ;
        String arr[] = new String[100];

        for(int i = 0;i <= n ; i++){
            InputText = scanner.nextLine();
            if(InputText.length()>10){
                System.out.print(InputText.charAt(0));
                System.out.print(InputText.length()-2);
                System.out.println(InputText.charAt(InputText.length()-1));
            }else{
                System.out.println(InputText);
            }
        }


    }
}
