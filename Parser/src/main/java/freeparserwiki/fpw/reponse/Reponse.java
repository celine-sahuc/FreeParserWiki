/**
 * Classe reponse
 */
package freeparserwiki.fpw.reponse;

public class Reponse {
    private String reponse;
    private boolean correct;
    private String feedback;

    public final String getReponse() {
        return reponse;
    }
    public final void setReponse(final String uneReponse) {
        this.reponse = uneReponse;
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
    public final void setCorrect(final boolean estCorrect) {
        this.correct = estCorrect;
    }
}
