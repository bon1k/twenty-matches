package ru.epam.izh.mikhail;

public class ProcessGame {
    static int countMatches = 20;
    static int stepComp;
    static int stepUser;

    static void count (){
        ViewConsole.sayCount(countMatches);
    }

    public static void main(String[] args) throws InterruptedException {
        LogicComp logicComp = new LogicComp();

        count();

        while (countMatches > 1){


            if (countMatches >= 12){
                stepComp = logicComp.stepRandom();
            }else {
                stepComp = logicComp.stepLogic(stepUser, countMatches);
            }
            ViewConsole.sayComp(stepComp);
            countMatches -=stepComp;
            Thread.sleep(2000);
            if (countMatches == 1){
                ViewConsole.sayWinner();
                break;
            }
            count();

            stepUser = ViewConsole.sayUser();
            countMatches -= stepUser;
            Thread.sleep(2000);
            count();
        }
    }
}

