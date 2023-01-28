import Colors.AnsiColor;

public class Main {
    public static void main(String[] args) {

        // Test functions
        AnsiColor.showProcess(150);
        AnsiColor.showProcess(500, 10);

        AnsiColor.showProcess("this is process :)");
        AnsiColor.showProcess(30, "this is another process :)");
        AnsiColor.showProcess(30, 120, "this is another another process :)");

        AnsiColor.processLine();
        AnsiColor.processLine("this is process line :)");
        AnsiColor.processLine(100, "another process line");

        System.out.println(AnsiColor.FOREGROUND_BRIGHT_RED + "This is red color" + AnsiColor.RESET_COLOR);
        System.out.println(AnsiColor.FOREGROUND_BRIGHT_BLUE96 + "written by " + AnsiColor.TEXT_BOLD + "Mohsen Gholami | iMohsen02");

    }
}
