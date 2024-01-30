import java.time.LocalDate;

public class localdate {

  public static void main(String args[]) {
    LocalDate date = LocalDate.now();

    System.out.println(date);
    LocalDate Yesterday = date.minusDays(1);
    LocalDate Tomorrow = date.plusDays(1);
    System.out.println(Yesterday);
    System.out.println(Tomorrow);
  }
}
