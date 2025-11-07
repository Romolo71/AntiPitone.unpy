package convertitore;
import java.io.*;
import java.util.ArrayList;

/**
 * Classe per leggere il file e restituire un'array di stringhe da poi convertire in token
 */
public class Lettore {
    private String nomeProgramma;
    private final String estensione = ".unpy";
    private ArrayList<String> lineeClodice;

    /**
     *
     * @param nomeFile il nome del file deve contenere l'estensione e non tutto il percorso del file perché
     *                 poi verrà controllato il nome e aggiunto src/scriptCodici/ prima del nome per avere il percorso
     *                 giusto
     */
    public Lettore(String nomeFile) {
        this.nomeProgramma = nomeFile;
        this.lineeClodice = new ArrayList<>();
    }

    /**
     * @param nome inserito il nome del file in questione che va controllato se ha l'estensione giusta
     */
    private void sistemaNomeFile(String nome) {

    }
}
