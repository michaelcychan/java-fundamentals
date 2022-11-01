import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Clock {
  public static final String GREEN = "\033[0;32m";   // GREEN

  public static final String RESET = "\033[0m";  // Text Reset

  public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE Underline

  public static void main(String[] args) {
    LocalDateTime dateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
    String formattedTime = dateTime.format(formatter);
    System.out.printf("The current "  + GREEN + "time" + RESET + " is " + WHITE_UNDERLINED + "%s" + RESET + ".\n", formattedTime);
  }
}
