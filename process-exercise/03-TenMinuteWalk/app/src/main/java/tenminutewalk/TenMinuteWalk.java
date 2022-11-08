package tenminutewalk;

import java.util.Hashtable;

public class TenMinuteWalk {
    public static boolean valid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        Hashtable<Character, Integer> loc = new Hashtable<Character, Integer>();

        for (int i = 0; i < walk.length; i++) {
            if (loc.get(walk[i]) == null) {
                loc.put(walk[i], 0);
            }
            loc.put(walk[i], loc.get(walk[i]) + 1);
        }
        if (loc.get('s') == loc.get('n') && loc.get('e') == loc.get('w')) {
            return true;
        } else {
            return false;
        }
    }
}
