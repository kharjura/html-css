import java.util.ArrayList;
import java.util.List;

public class BallArrangement {
    static int g = 1, y = 1, r = 1;
    static List<String> arrangements = new ArrayList<>();

    public static void main(String[] args) {
        arrangeBalls("", g, y, r);
        for (String arrangement : arrangements) {
            System.out.println(arrangement);
        }
        System.out.println("Total Arrangements: " + arrangements.size());
    }

    static void arrangeBalls(String current, int g, int y, int r) {
        if (g == 0 && y == 0 && r == 0) {
            arrangements.add(current);
            return;
        }
        if (g > 0 && (current.isEmpty() || current.charAt(current.length() - 1) != 'G')) {
            arrangeBalls(current + 'G', g - 1, y, r);
        }
        if (y > 0 && (current.isEmpty() || current.charAt(current.length() - 1) != 'Y')) {
            arrangeBalls(current + 'Y', g, y - 1, r);
        }
        if (r > 0 && (current.isEmpty() || current.charAt(current.length() - 1) != 'R')) {
            arrangeBalls(current + 'R', g, y, r - 1);
        }
    }
}
