public class HourHandandMinuteHand {
  public static void main(String args[]) {

    int h = 8;
    int min = 6;

    double angle = (30 * h) - (5.5 * min);

    if (angle >= 180) {
      angle = angle - 360;
    }
    System.out.print(Math.abs(angle));
  }
}
