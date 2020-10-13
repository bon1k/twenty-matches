package ru.epam.izh.mikhail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class ViewConsole {

    public static void sayCount(int getCountMatches) {
        System.out.println("На столе осталось " + getCountMatches +" спичек");
    }

    public static void sayComp(int getPutComp) {
        System.out.println(" - Компьютер взял спичек = " + getPutComp);
    }

    public static int sayUser() {
        int stepUser = 0;
        System.out.print(" - Ваш ход. Введите кол-во спичек: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            stepUser = Integer.parseInt(bufferedReader.readLine());


        } catch (IOException e) {
            e.printStackTrace();
        }
        return stepUser;

    }
}




