package entity;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private int id;
    private List<Figure> figures;

    public Team(int id, ArrayList<Figure> figures) {
        this.id = id;
        this.figures = figures;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }

    @Override
    public String toString() {
        return "entity.Team{" +
                "id=" + id +
                ", figures=" + figures +
                '}';
    }
}
