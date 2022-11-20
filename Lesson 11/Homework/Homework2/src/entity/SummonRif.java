package entity;

import java.util.ArrayList;
import java.util.List;

public class SummonRif {
    private List<Team> teams;

    public SummonRif(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "entity.SummonRif{" +
                "teams=" + teams +
                '}';
    }
}
