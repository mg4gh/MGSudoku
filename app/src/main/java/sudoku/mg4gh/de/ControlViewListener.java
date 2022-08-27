package sudoku.mg4gh.de;

public interface ControlViewListener {

    public void newGameRequested(int dimension, GameLevel gameLevel);

    public void undoRequested();

    public void repaintRequested();

    public void initCandidatesRequested();

    public void clearMarkerRequested();

    public void showCandidatesRequested(boolean show);

}
