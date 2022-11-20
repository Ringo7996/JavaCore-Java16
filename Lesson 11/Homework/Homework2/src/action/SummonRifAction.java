package action;

import entity.SummonRif;
import entity.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class SummonRifAction {
    private ArrayList<Team> teams = new ArrayList<>();

    public SummonRif inputSummonRif(Scanner scanner){
        System.out.println("Nhập thông tin 2 team cho trận đấu:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Nhập thông tin cho team thứ "+(i+1)+": ");
            TeamAction teamAction = new TeamAction();
            Team team = teamAction.inputTeam(scanner);
            teams.add(team);
        }

        SummonRif summonRif = new SummonRif(teams);
        return summonRif;
    }
}
