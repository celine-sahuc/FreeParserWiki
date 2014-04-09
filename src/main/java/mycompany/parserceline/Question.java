package mycompany.parserceline;

import java.util.ArrayList;

public class Question {
    private Type type;
    private ArrayList<Reponse> ensembleReponsePossibles;
    private int nombreReponsesCorrects;
    private String texteQuestion;

    public Question(final Type t, final ArrayList<Reponse> r,
            final int nb, final String tq) {
        this.type = t;
        this.ensembleReponsePossibles = r;
        this.nombreReponsesCorrects = nb;
        this.texteQuestion = tq;
    }

    public final Type getType() {
        return this.type;
    }

    public final String getTexteQuestion() {
        return this.texteQuestion;
    }

    public final ArrayList<Reponse> getListeReponses() {
        return this.ensembleReponsePossibles;
    }

    public final int getNbReponsesCorrects() {
        return this.nombreReponsesCorrects;
    }

}
