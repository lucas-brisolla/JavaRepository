package java.footballgame.test;

import java.footballgame.main.Result;
import java.footballgame.main.Teams;

public class Game {
    public static void main(String[] args) {
        int scoreboard;
        Teams time1 = new Teams();
        time1.name = "Liverpool";
        time1.power = 10;

        Teams time2 = new Teams();
        time2.name = "Manchester United";
        time2.power = 9;

        System.out.println(time1);
        System.out.println(time2);

//        Result result = new Result;
//        System.out.println(result);
    }
}
