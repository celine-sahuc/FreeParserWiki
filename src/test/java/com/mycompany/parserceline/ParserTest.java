/**
 *
 */
package com.mycompany.parserceline;

import java.util.ArrayList;
import mycompany.parserceline.Parser;
import static org.junit.Assert.*;

import mycompany.parserceline.Question;
import mycompany.parserceline.Reponse;
import mycompany.parserceline.Type;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author 21003139
 *
 */
public class ParserTest {

    private Parser p;
    private Question q;
    private ArrayList<Reponse> r;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        p = new Parser();
        r = new ArrayList<Reponse>();
    }

    @Test
    public void testTypeSingle() {
        String question = "{Comment ça va? |type=\"()\"} + The correct answer.- Distractor.- Distractor. - Distractor.";
        q = p.parserFonction(question);
        assertEquals(q.getType(), Type.SINGLE);
    }

    @Test
    public void testQuestion() {
        String question = "{Comment ça va? |type=\"()\"} + The correct answer.- Distractor.- Distractor. - Distractor.";
        q = p.parserFonction(question);
        assertEquals(q.getTexteQuestion(), "Comment ça va? ");
    }

    @Test
    public void testSingle() {
        String question = "{Comment ça va? |type=\"()\"} + The correct answer.- Distractor.- Distractor. - Distractor.";
        q = p.parserFonction(question);
        assertEquals(q.getNbReponsesCorrects(), 1);
    }

    @Test
    public void testReponseSingle() {
        String question = "{Comment ça va? |type=\"()\"} + The correct answer.- Distractor.- Distractor. - Distractor.";
        q = p.parserFonction(question);
        r = q.getListeReponses();
        assertEquals(r.get(0).getReponse(), " + The correct answer");
        assertEquals(r.get(1).getReponse(), "- Distractor");
        assertEquals(r.get(2).getReponse(), "- Distractor");
    }

    @Test
    public void testReponseCorrecteSingle() {
        String question = "{Comment ça va? |type=\"()\"} + The correct answer.- Distractor.- Distractor. - Distractor.";
        q = p.parserFonction(question);
        r = q.getListeReponses();
        assertEquals(r.get(0).isCorrect(), true);
        assertEquals(r.get(1).isCorrect(), false);
        assertEquals(r.get(2).isCorrect(), false);
    }

    @Test
    public void testTypeMultiple() {
        String question = "{Comment ça va? |type=\"[]\"} + Correct answer.- Incorrect answer.+ Correct answer.- Incorrect answer.";
        q = p.parserFonction(question);
        assertEquals(q.getType(), Type.MULTIPLE);
    }

    @Test
    public void testQuestionMultiple() {
        String question = "{Comment ça va? |type=\"[]\"} + Correct answer.- Incorrect answer.+ Correct answer.- Incorrect answer.";
        q = p.parserFonction(question);
        assertEquals(q.getTexteQuestion(), "Comment ça va? ");
    }

    @Test
    public void testNbReponseMultiple() {
        String question = "{Comment ça va? |type=\"[]\"} + Correct answer.- Incorrect answer.+ Correct answer.- Incorrect answer.";
        q = p.parserFonction(question);

        assertEquals(q.getNbReponsesCorrects(), 2);
    }

    @Test
    public void testReponseMultiple() {
        String question = "{Comment ça va? |type=\"[]\"} + Correct answer.- Incorrect answer.+ Correct answer.- Incorrect answer.";
        q = p.parserFonction(question);
        r = q.getListeReponses();
        assertEquals(r.get(0).getReponse(), " + Correct answer");
        assertEquals(r.get(1).getReponse(), "- Incorrect answer");
        assertEquals(r.get(2).getReponse(), "+ Correct answer");
        assertEquals(r.get(3).getReponse(), "- Incorrect answer");
    }

    @Test
    public void testReponseCorrecteMultiple() {
        String question = "{Comment ça va? |type=\"[]\"} + Correct answer.- Incorrect answer.+ Correct answer.- Incorrect answer.";
        q = p.parserFonction(question);
        r = q.getListeReponses();
        assertEquals(r.get(0).isCorrect(), true);
        assertEquals(r.get(1).isCorrect(), false);
        assertEquals(r.get(2).isCorrect(), true);
        assertEquals(r.get(3).isCorrect(), false);
    }

}
