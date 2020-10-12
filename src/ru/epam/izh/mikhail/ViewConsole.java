package ru.epam.izh.mikhail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;

public class ViewConsole {
    private int countMatches = 20;
    private int putComp;
    private int putUser;

    public void sayCount() {
        System.out.println("На столе осталось "+ countMatches +" спичек");
    }
    public void sayComp() {
        System.out.println(" - Компьютер взял спичек = " + putComp);
    }
    public void sayUser() {
        System.out.print(" - Ваш ход. Введите кол-во спичек: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            putUser = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ViewConsole() {
    }

    public ViewConsole(int countMatches, int putComp, int putUser) {
        this.countMatches = countMatches;
        this.putComp = putComp;
        this.putUser = putUser;
    }

    public int getCountMatches() {
        return countMatches;
    }

    public void setCountMatches(int countMatches) {
        this.countMatches = countMatches;
    }

    public int getPutComp() {
        return putComp;
    }

    public void setPutComp(int putComp) {
        this.putComp = putComp;
    }

    public int getPutUser() {
        return putUser;
    }

    public void setPutUser(int putUser) {
        this.putUser = putUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViewConsole that = (ViewConsole) o;
        return getCountMatches() == that.getCountMatches() &&
                getPutComp() == that.getPutComp() &&
                getPutUser() == that.getPutUser();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountMatches(), getPutComp(), getPutUser());
    }

    @Override
    public String toString() {
        return "ViewConsole{" +
                "countMatches=" + countMatches +
                ", putComp=" + putComp +
                ", putUser=" + putUser +
                '}';
    }
}




