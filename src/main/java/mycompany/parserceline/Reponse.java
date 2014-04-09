package mycompany.parserceline;

public class Reponse {
    private String reponse;
    private boolean correct;
    private String feedback;

    public Reponse(final String r, final boolean c, final String f) {
        this.reponse = r;
        this.correct = c;
        this.feedback = f;

    }

    public Reponse(final String r, final boolean c) {
        this.reponse = r;
        this.correct = c;
        this.feedback = null;

    }

    public final String getReponse() {
        return this.reponse;
    }

    public final void setReponse(final String laReponse) {
        this.reponse = laReponse;
    }

    public final String getFeedback() {
        return feedback;
    }

    public final void setFeedback(final String unFeedback) {
        this.feedback = unFeedback;
    }

    public final boolean isCorrect() {
        return correct;
    }

    public final void setCorrect(final boolean co) {
        this.correct = co;
    }

    public final void afficher() {
        System.out.println(this.reponse);
        System.out.println(this.correct);
        System.out.println(this.feedback);

    }

}
