package org.example.rpg;

public class RpgMain {
    public static void main(String[] args) {
        Monster shrek=new Troll("dev", 400, 40);
        Monster derek=new Werewolf("alfa",300,70);

        printResult(shrek);
        printResult(derek);
    }
    private static void printResult (Monster monster){
        System.out.println("attack result of: "+ monster.getName()+":"+ monster.attack());
    }
}
