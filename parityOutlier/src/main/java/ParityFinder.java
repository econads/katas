import java.util.stream.Stream;

public class ParityFinder {

    public static int find(int[] integers) {
        Integer beforeLast = null;
        Integer last = null;
        for (int integer : integers) {
            int thisOver = integer % 2;
            if (last != null) {
                int lastOver = last % 2;
                int beforeLastOver = beforeLast % 2;
                if (thisOver != lastOver) {
                    Integer foundYa = last;
                    if (beforeLastOver == lastOver) {
                        foundYa = integer;
                    }
                    return foundYa;
                }
            }
            beforeLast = last;
            last = integer;
        }
        throw new IllegalStateException("Should have returned by now");
    }

}
