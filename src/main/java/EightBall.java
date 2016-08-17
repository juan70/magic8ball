import java.util.Random;


/**
 * Very simple implementation of a Magic 8-Ball. The answers given by the ball
 * are taken from the corresponding
 * <a href="https://en.wikipedia.org/wiki/Magic_8-ball">Wikipedia article</a>.
 *
 * @author juan70
 */
public class EightBall {

    /**
     * List of possible answers given by the 8-ball.
     */
    private final String[] ANSWERS = {
        "It is certain",
        "It is decidedly so",
        "Without a doubt",
        "Yes, definitely",
        "You may rely on it",
        "As I see it, yes",
        "Most likely",
        "Outlook good",
        "Yes",
        "Signs point to yes",
        "Reply hazy try again",
        "Ask again later",
        "Better not tell you now",
        "Cannot predict now",
        "Concentrate and ask again",
        "Don't count on it",
        "My reply is no",
        "My sources say no",
        "Outlook not so good",
        "Very doubtful"
    };

    /**
     * List of arbitrary answers for the case where the question is empty.
     */
    private final String[] ANSWERSEMPTY = {
        "Sorry, could you repeat, please?",
        "Sorry, could you be more specific, please?",
        "Sorry, I couldn't hear your question. Would you mind repeating it?"
    };


    /**
     * Sole constructor.
     */
    public EightBall() {}


    /**
     * The question asked by the user is stored here.
     */
    private String question = "";


    /**
     * Store the question typed by the user.
     *
     * @param  quest  The text of the question.
     */
    public void setQuestion(String quest) {
        question = quest.trim();
    }

    /**
     * Return the question as it has been stored previously by the setter.
     *
     * @return  The text of the question.
     */
    public String getQuestion() {
        return question;
    }


    /**
     * Compute and return an answer.
     *
     * @return  An answer randomly chosen among the list of possible answers.
     */
    public String getAnswer() {
        Random rnd = new Random();

        if (getQuestion() == null || getQuestion().isEmpty()) {
            return ANSWERSEMPTY[rnd.nextInt(ANSWERSEMPTY.length)];
        } else {
            return ANSWERS[rnd.nextInt(ANSWERS.length)];
        }
    }
}

