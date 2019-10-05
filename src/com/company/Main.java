package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                User user = new User();
                System.out.println("Как вас зовут?");
                user.setName(scanner.nextLine());
                System.out.println("Сколько вам лет?");
                user.setAge(scanner.nextInt());
            } catch (IllegalNameLengthException inle){
                inle.printStackTrace();
            } catch (IllegalAgeException iae) {
                iae.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
