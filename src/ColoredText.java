// AnsiCode.java - Interface defining ANSI escape codes
interface AnsiCode {
    String RESET = "\u001B[0m";
    String BLACK = "\u001B[30m";
    String RED = "\u001B[31m";
    String GREEN = "\u001B[32m";
    String YELLOW = "\u001B[33m";
    String BLUE = "\u001B[34m";
    String MAGENTA = "\u001B[35m";
    String CYAN = "\u001B[36m";
    String WHITE = "\u001B[37m";
}
public class ColoredText implements AnsiCode {
    private String text;

    public ColoredText(String text) {
        this.text = text;
    }

    public void printInColor(String colorCode) {
        System.out.println(colorCode + text + RESET);
    }

    public static void main(String[] args) {
        ColoredText redText = new ColoredText("This is red text!");
        ColoredText greenText = new ColoredText("This is green text!");

        redText.printInColor(RED);
        greenText.printInColor(GREEN);
    }
}
