package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("______  _________ ______  ________________       _________ ________ ______ __\n" +
                "___  / / /__  __ \\___   |/  /___  ____/__ |     / /__  __ \\___  __ \\___  //_/\n" +
                "__  /_/ / _  / / /__  /|_/ / __  __/   __ | /| / / _  / / /__  /_/ /__  ,<   \n" +
                "_  __  /  / /_/ / _  /  / /  _  /___   __ |/ |/ /  / /_/ / _  _, _/ _  /| |  \n" +
                "/_/ /_/   \\____/  /_/  /_/   /_____/   ____/|__/   \\____/  /_/ |_|  /_/ |_|  \n" +
                "       ______  __________________   _______  __                              \n" +
                "       ___   |/  /___  ____/___  | / /__  / / /                              \n" +
                "       __  /|_/ / __  __/   __   |/ / _  / / /                               \n" +
                "       _  /  / /  _  /___   _  /|  /  / /_/ /                                \n" +
                "       /_/  /_/   /_____/   /_/ |_/   \\____/                     ");
        System.out.println("-----------------------------------------------------");
        System.out.println("You can add up to 10 tasks!");
        int pocet_ukolu = 0;
        String[] tasks = new String[10];
        while (true) {
            System.out.println("You have " + pocet_ukolu + "/10!");
            for (int i = 0; i < pocet_ukolu; i++) {
                System.out.println("#" + i + " - " + tasks[i]);
            }
            System.out.println("-----------------------------------------------------");
            System.out.println("1) Manage tasks");
            System.out.println("2) Exit");
            System.out.print("> ");
            int volba = 0;
            try{
                volba = sc.nextInt();
            }
            catch (Exception e){
                System.out.println("chybně zadaný vstup zadej číslo ");
            }
            if (volba == 2) {
                return;
            }
            if (volba == 1) {
                //while (volba != 4){
                System.out.println("-----------------------------------------------------");
                System.out.println("Tasks management");
                System.out.println("-----------------------------------------------------");
                System.out.println("1) Create a new task");
                System.out.println("2) Update a task");
                System.out.println("3) Destroy a task");
                System.out.println("4) Back to main menu");
                System.out.print("> ");
                volba = sc.nextInt();
                sc.nextLine();
                if (volba == 1) {
                    if (pocet_ukolu >= 10) {
                        System.out.println("nelze zadat více nez 10 úkolů");
                    } else {
                        System.out.print("> ");
                        String newtask = sc.nextLine();
                        tasks[pocet_ukolu] = newtask;
                        pocet_ukolu++;
                    }
                }
                if (volba == 2) {
                    for (int i = 0; i < pocet_ukolu; i++) {
                        System.out.println("#" + i + " - " + tasks[i]);
                    }
                    System.out.print("> ");
                    int volba2 = sc.nextInt();
                    sc.nextLine();
                    if (volba2 < pocet_ukolu) {
                        System.out.println("change task: " + tasks[volba2]);
                        System.out.print("> ");
                        String newtask = sc.nextLine();
                        tasks[volba2] = newtask;
                    }
                }
                if (volba == 3){
                    for (int i = 0; i < pocet_ukolu; i++) {
                        System.out.println("#" + i + " - " + tasks[i]);
                    }
                    System.out.print("> ");
                    int volba2 = sc.nextInt();
                    sc.nextLine();
                    if (volba2 < pocet_ukolu) {
                        System.out.println("delete tasks: " + tasks[volba2]);
                        for (int i = volba2; i < pocet_ukolu -1; i++) {
                            tasks[i] = tasks[i+1];
                            pocet_ukolu--;
                        }
                    }
                }
                //}
            }
        }
    }
}
