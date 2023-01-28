package Colors;

import java.util.Random;

/** @author <span style="font-family: Times New Roman; color: #FFA400">iMohsen02 - Mohsen Gholami<br> Computer engineering student of Yazd State University located in Yazd province in Iran - programmer - graphic designer - typist - teacher - computer lover :)</span><hr>
 * <span style="color: white">Telegram:</span>&nbsp;&nbsp;                                   <a href="http://T.me/iMohsen02">Mohsen.Telegram(uswrname: @iMohsen02)</a><br><hr>
 * <span style="color: white">Instagram:</span>&nbsp;                                        <a href="https://www.instagram.com/imohsen02?r=nametag">Mohsen.Instagram(uswrname: @iMohsen02)</a><hr>
 * <span style="color: white">WhatsApp:</span>&nbsp;                                         <a href="https://wa.me/qr/DG3BZ5DH2CZBP1">Mohsen.WhatsApp(Personal Number)</a><hr>
 * <span style="color: white">E-mail:</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;       <a href="mailto:imohsen2002@gmail.com">Mohsen.Email(iMohsen2002@gmail.com)</a><hr>
 * <span style="color: white">Twitter:</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                   <a href="https://twitter.com/iMohsen02?s=09">Mohsen.Twitter(username: @iMohsen02)</a><hr>
 * <span style="color: white">LinkedIn:</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                             <a href="https://www.linkedin.com/in/mohsen-gholami-a29594216">Mohsen.LinkedIn(Mohsen Gholmai)</a><hr>
 * <span style="font-family: Times New Roman; color: white">Enjoy Color :)</span>
 * @since <span style="font-family: Times New Roman; color: #FFA400">Monday, DEY 2, 1400 AP - 23 Dec 2021 - Mashhad, Khorasan Razavi Province, Iran(IR)</span>
 *
 */
public class AnsiColor {

    private static final int LIMIT_COLOR = 255;

    private static int sleepTime = 25;


    //Text style [bold - underline - reserved - italic ]
    public static final String TEXT_BOLD        = "\033[1m";
    public static final String TEXT_UNDERLINE   = "\033[4m";
    public static final String TEXT_REVERSED    = "\033[7m";
    public static final String TEXT_ITALIC      = "\033[3m";


    //Text - foreground color
    public static final String FOREGROUND_BRIGHT_BLACK   = "\u001b[30m";
    public static final String FOREGROUND_BRIGHT_RED     = "\u001b[31m";
    public static final String FOREGROUND_BRIGHT_GREEN   = "\u001b[32m";
    public static final String FOREGROUND_BRIGHT_YELLOW  = "\u001b[33m";
    public static final String FOREGROUND_BRIGHT_BLUE    = "\u001b[34m";
    public static final String FOREGROUND_BRIGHT_MAGENTA = "\u001b[35m";

    public static final String FOREGROUND_GRAY90        = "\033[90m";
    public static final String FOREGROUND_RED91         = "\033[91m";
    public static final String FOREGROUND_GREEN92       = "\033[92m";
    public static final String FOREGROUND_YELLOW93      = "\033[93m";
    public static final String FOREGROUND_BLUE94        = "\033[94m";
    public static final String FOREGROUND_PINK95        = "\033[95m";
    public static final String FOREGROUND_BRIGHT_BLUE96 = "\033[96m";
    public static final String FOREGROUND_WHITE         = "\033[97m";


    //Text - background color
    public static final String BACKGROUND_BRIGHT_BLACK      = "\u001b[30;40m";
    public static final String BACKGROUND_BRIGHT_RED        = "\u001b[30;41m";
    public static final String BACKGROUND_BRIGHT_GREEN      = "\u001b[30;42m";
    public static final String BACKGROUND_BRIGHT_YELLOW     = "\u001b[30;43m";
    public static final String BACKGROUND_BRIGHT_BLUE       = "\u001b[30;44m";
    public static final String BACKGROUND_BRIGHT_MAGENTA    = "\u001b[30;45m";
    public static final String BACKGROUND_BRIGHT_CYAN       = "\u001b[30;46m";
    public static final String BACKGROUND_BRIGHT_WHITE      = "\u001b[30;47m";

    public static final String BACKGROUND_GRAY100        = "\033[100m";
    public static final String BACKGROUND_RED101         = "\033[101m";
    public static final String BACKGROUND_GREEN102       = "\033[102m";
    public static final String BACKGROUND_YELLOW103      = "\033[103m";
    public static final String BACKGROUND_BLUE104        = "\033[104m";
    public static final String BACKGROUND_PINK105        = "\033[105m";
    public static final String BACKGROUND_BRIGHT_BLUE106 = "\033[106m";
    public static final String BACKGROUND_WHITE          = "\033[107m";

    //Reset Style
    public static final String RESET_COLOR = "\u001b[0m";
    
    private static void process(long millisecondSleep, int percent, String processText) {
        for (int i = 0; i <= percent; i++) {
            System.out.print(processText);
            System.out.print(foreRandColor() + i + "%");

            try {
                Thread.sleep(millisecondSleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r" + "");
        }
        System.out.print(RESET_COLOR);
    }

    /**
     * Print and show a process is perfuming.
     * @param millisecondSleep
     *          thread sleep {@code millisecondSleep} millisecond per percent
     * @param percent
     *          max percent
     * @param processText
     *          print {@code processText} before process
     */
    public static void showProcess(long millisecondSleep, int percent, String processText) {
        process(millisecondSleep, percent, processText + "\t");
    }

    /**
     * Print and show a process is perfuming. Print {@code processText} before process which is default null.
     * @param millisecondSleep
     *          thread sleep {@code millisecondSleep} millisecond per percent
     * @param percent
     *          max percent
     */
    public static void showProcess(long millisecondSleep, int percent) {
        showProcess(millisecondSleep, percent, "");
    }

    /**
     * Print and show a process is perfuming up to 100%.print {@code processText} before process which is default null.
     * @param millisecondSleep
     *          thread sleep {@code millisecondSleep} millisecond per percent
     */
    public static void showProcess(long millisecondSleep) {
        showProcess(millisecondSleep, 100, "");
    }

    /**
     * Print and show a process is perfuming. Print {@code processText} before process which is default null. Thread sleep 25 milliseconds per percent.
     * @param percent
     *          max percent
     */
    public static void showProcess(int percent) {
        showProcess(25, percent, "");
    }

    /**
     * Print and show a process is perfuming up to 100%. Thread sleep 25 milliseconds per percent.
     * @param processText
     *          print {@code processText} before process
     */
    public static void showProcess(String processText) {
        showProcess(25, 100, processText + "\t");
    }

    /**
     * Print and show a process is perfuming up to 100%.
     * @param millisecondSleep
     *          thread sleep {@code millisecondSleep} millisecond per percent
     * @param processText
     *          print {@code processText} before process
     */
    public static void showProcess(int millisecondSleep, String processText) {
        showProcess(millisecondSleep, 100, processText + "\t");
    }

    /**
     * Print and show a process is perfuming up to 100%. Print {@code processText} before process which is default null. Thread sleep 25 milliseconds per percent.
     */
    public static void showProcess() {
        showProcess(25, 100, "");
    }

    /**
     * Make random foreground color.
     * @return
     *          new random foreground color
     */
    public static String foreRandColor() {
        return "\u001b[38;5;" + new Random().nextInt(LIMIT_COLOR) + "m";
    }

    /**
     * Make new foreground color via specified index.
     * @param rnd
     *          number of color
     * @return
     *          a new foreground color generated via specified index
     */
    public static String foreColor(int rnd) {
        return "\u001b[38;5;" + rnd + "m";
    }

    /**
     * Make new background color via specified index
     * @param code
     *          index of color
     * @return
     *          a new background color generated via specified index
     */
    public static String backColor(int code) {
        return "\u001b[38;5;" + code + "m\033[7m";
    }

    /**
     * Make random background color.
     * @return
     *          new random background color
     */
    public static String backRandColor() {
        return "\u001b[38;5;" + new Random().nextInt(LIMIT_COLOR) + "m\033[7m";
    }

    /**
     * Print and show process line is performing up to 100%
     * @param millisecondSleep
     *          thread sleep {@code millisecondSleep} millisecond per percent
     * @param processText
     *          print {@code processText} before process
     */
    public static void processLine(int millisecondSleep, String processText) {
        Random r = new Random();
        for (int i = 0; i <= 100; i++) {
            int randNum = r.nextInt(LIMIT_COLOR);
            System.out.print(foreColor(randNum) + processText + ": " + AnsiColor.RESET_COLOR);

            if (i < 49) {
                for (int j = 0; j < i; j++)
                    System.out.print(backColor(randNum) + " " + AnsiColor.RESET_COLOR);
                for (int j = 0; j < 49 - i; j++)
                    System.out.print(" ");

                System.out.print(i + "%");
            }
            if (i >= 49) {
                for (int j = 0; j < 49; j++)
                    System.out.print(backColor(randNum) + " " + AnsiColor.RESET_COLOR);

                if (i == 49)
                    System.out.print(backColor(randNum) + foreColor(randNum) + "4" + AnsiColor.RESET_COLOR + "9%");
                if (i == 50)
                    System.out.print(backColor(randNum) + foreColor(randNum) + "50" + AnsiColor.RESET_COLOR + "%");
                if (i >= 51)
                    System.out.print(backColor(randNum) + foreColor(randNum) + i + "%" + AnsiColor.RESET_COLOR);
                for (int j = 52; j < i; j++)
                    System.out.print(backColor(randNum) + " " + AnsiColor.RESET_COLOR);

            }

            try {
                Thread.sleep(millisecondSleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r");
        }
        System.out.print("\r" + "");
    }

    /**
     * Print and show process line is performing up to 100%. thread sleep 50 milliseconds per percent. And before process line "Loading" will print
     */
    public static void processLine() {
        processLine(50, "Loading");
    }

    /**
     * Print and show process line is performing up to 100%. And before process line "Loading" will print
     * @param millisecondSleep
     *          thread sleep {@code millisecondSleep} millisecond per percent
     */
    public static void processLine(int millisecondSleep) {
        processLine(millisecondSleep, "Loading");
    }

    /**
     * Print and show process line is performing up to 100%. And before process line "Loading" will print
     * @param processText
     *          print {@code processText} before process
     */
    public static void processLine(String processText) {
        processLine(50, processText);
    }

    /**
     * set the sleep time per percent
     * @param sleepTime sleep time per percent
     */
    public static void setSleepTime(int sleepTime) {
        AnsiColor.sleepTime = sleepTime;
    }
}
