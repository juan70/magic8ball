import java.util.Scanner;


/**
 * Not much to say here. Just a command line interface for the 8-Ball.
 *
 * @author juan70
 *
 */
public class MainCLI {
    /**
     * The text the user has to type to leave the program and return to the
     * shell.
     */
    private final String QUIT = "quit";


    /**
     * Sole constructor.
     */
    public MainCLI() {}


    /**
     * A bit of information about the program.
     *
     * @return An short informational text.
     */
    private String banner() {
        return "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-"
               + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-"
               + "\n"
               + "Welcome. Your fortune-teller will answer all your questions."
               + "\n"
               + "Type \"" + QUIT + "\" at any moment to leave."
               + "\n"
               + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-"
               + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-";
    }


    /**
     * The program's entry point.
     * Very simple mechanism:
     * <ol>
     * <li>The program prompts the user.</li>
     * <li>The user types a question, or "quit" to leave.</li>
     * <li>The program answers the question... Well, gives an answer...</li>
     * <li>Start again at point 1.</li>
     * </ol>
     *
     * @param  args  Arguments on the command line. Not used.
     */
    public static void main(String[] args) {
        EightBall eb = new EightBall();
        MainCLI cli = new MainCLI();
        Scanner stdin = new Scanner(System.in);

        System.out.println(cli.banner());

        while (true) {
            System.out.print("Please ask your question: ");
            eb.setQuestion(stdin.nextLine());
            if (eb.getQuestion().toLowerCase().equals(cli.QUIT)) {
                break;
            }

            System.out.println("I tell you that: " + eb.getAnswer());
            System.out.println();
        }
    }
}

