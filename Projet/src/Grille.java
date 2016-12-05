import fr.ema.apo.sudoku.view.*;

/**
 * Created by Yohann on 05/12/2016.
 */
public class Grille implements IGrille, ISudoku {
    private Case [][] grille;

    public Grille(IController pController) {
        grille = new Case[][];
        initialiser();

    }

    public Integer getValue(Position position) // doit renvoyer la valeur d’une case ou null si elle est
    {
        return null;
    }

    // vide
    public Statut getStatut(Position position) // doit renvoyer le statut d’une case
    {
        return null;
    }


    @Override
    public IGrille generer() {
        return null;
    }

    @Override
    public boolean possible(Position position, Integer integer) {
        return false;
    }

    @Override
    public Position suggerer() {
        return null;
    }

    @Override
    public boolean setValue(Position position, Integer intg) {
        grille[position.getX()][position.getY()].set(intg);
        return false;
    }

    @Override
    public int restant(Integer integer) {
        return 0;
    }
}