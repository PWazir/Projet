import fr.ema.apo.sudoku.view.*;

/**
 * Created by Yohann on 04/12/2016.
 */
public class Sudoku extends SudokuApplication {
    @Override
    public ISudoku createSudoku(IController pController) {
        return new Grille(pController);
    }
    public static void main(String[] args) {
        launch(args);
    }
}