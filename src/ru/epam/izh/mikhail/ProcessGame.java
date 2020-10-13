package ru.epam.izh.mikhail;

import java.util.Objects;
import java.util.Random;

public class ProcessGame {
    static int countMatches = 20;
    static int stepComp;

    static void count (){
        ViewConsole.sayCount(countMatches);
    }

    public static void main(String[] args) {
        LogicComp logicComp = new LogicComp();

        count();

        while (countMatches>1){

            if (countMatches > 12){
                stepComp = logicComp.stepRandom();
            }else {
                stepComp = logicComp.stepLogic(1,2);
            }

            ViewConsole.sayComp(stepComp);
            countMatches -=stepComp;
            count();

            if (countMatches <= 1){
                ViewConsole.sayWinner();
                break;
            }

            int stepUser = ViewConsole.sayUser();
            countMatches -= stepUser;
            count();
        }

    }
}

