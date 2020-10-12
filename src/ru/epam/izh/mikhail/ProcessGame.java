package ru.epam.izh.mikhail;

public class ProcessGame {


    public static void main(String[] args) {




        ViewConsole viewConsole = new ViewConsole();

        viewConsole.sayCount();
        viewConsole.sayComp();
        viewConsole.sayUser();
        viewConsole.setCountMatches(viewConsole.getCountMatches()- viewConsole.getPutUser());
        viewConsole.sayCount();



    }
}

