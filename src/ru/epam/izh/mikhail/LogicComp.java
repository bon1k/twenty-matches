package ru.epam.izh.mikhail;

import java.util.Random;

public class LogicComp {

    public int stepRandom(){
        Random random = new Random();
        int randomStepComp = random.nextInt(3)+1;
        return randomStepComp;
    }

    public int stepLogic(int stepUser, int countMatches){
        if (countMatches == 4){
            return 3;
        }
        if (countMatches == 3){
            return 2;
        }
        if (countMatches == 2){
            return 1;
        }
        int logic = 4-stepUser;

        return logic;
    }
}
