/**
 * Classe Question
 */
package freeparserwiki.fpw.questions;

import java.util.ArrayList;
import freeparserwiki.fpw.parser.Type;
import freeparserwiki.fpw.reponse.Reponse;

public abstract class Question {
    private Type type;
    private String question;
    private ArrayList<Reponse> ensembleReponsePossibles;
    private int nombreReponsesCorrects;

    public Question(final Type t, final String s) {
        this.type = t;
        this.question = s;
        this.ensembleReponsePossibles = new ArrayList<Reponse>();
        this.nombreReponsesCorrects = 0;
    }

    public final Type getType() {
        return this.type;
    }

    public final ArrayList<Reponse> getListeReponses() {
        return this.ensembleReponsePossibles;
    }

    public final int getNbReponsesCorrects() {
        return this.nombreReponsesCorrects;
    }

    public final int getNbReponses() {
        return ensembleReponsePossibles.size();
    }

    public final void addResponse(final Reponse r) {
        this.getListeReponses().add(r);
        if (r.isCorrect()) {
            nombreReponsesCorrects++;
        }
    }

    public final String getQuestion() {
        return question;
    }

    public abstract boolean isValide();
}
