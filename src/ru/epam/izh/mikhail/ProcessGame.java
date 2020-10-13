package ru.epam.izh.mikhail;

import java.util.Objects;

public class ProcessGame {


    public static void main(String[] args) {
        int countMatches = 20;

        ViewConsole.sayCount(countMatches);

       while (countMatches>1){

           int b = LogicComp.stepComp();


           ViewConsole.sayComp(b);
           countMatches = countMatches - b;
           ViewConsole.sayCount(countMatches);

           int a = ViewConsole.sayUser();
           countMatches = countMatches - a;


       }



    }
}

