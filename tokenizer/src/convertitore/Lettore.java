package convertitore;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Classe per leggere il file e restituire un'array di stringhe da poi convertire in token
 */
public class Lettore {
    private String nomeProgramma;
    private final String estensione = ".unpy";
    private ArrayList<String> lineeClodice;

    /**
     * @param nomeFile il nome del file deve contenere l'estensione e non tutto il percorso del file perché
     *                 poi verrà controllato il nome e aggiunto src/scriptCodici/ prima del nome per avere il percorso
     *                 giusto
     */
    public Lettore(String nomeFile) {
        this.nomeProgramma = nomeFile;
        this.lineeClodice = new ArrayList<>();
    }

    public String run() {
        //todo
        return null;
    }

    /**
     * Il metodo controlla se l,estensione è corretta, ovvero .unpy salvato nell'attributo estensione:String,
     * nel caso lo fosse, sistema il nome e aggiunge il pezzo del percorso src/scriptCodici/ in modo che sia leggibile
     *
     * @param nome inserito il nome del file in questione che va controllato se ha l'estensione giusta
     */
    private void sistemaNomeFile(String nome) {
        //todo se cercaEstensione non trova l'estensione la aggiunge invece se ne trova una diversa scatta un'eccezione

        //todo se controllaPathNomeFile trova una path prima del nome del file la rimuove
    }

    /**
     * TODO SPIEGAZIONE METODO COME FUNZIONA E ALTRO
     */
    private void controllaEstensione() {
        //todo cercare se la sottostringa estensione si trova dentro al nome del file

        //todo oltre ad aver controllato bisogna anche aggiungere l'estensione se manca
    }

    /**
     * TODO SPIEGAZIONE METODO COME FUNZIONA E ALTRO
     */
    private boolean controllaPathNomeFile() {

    }
}
