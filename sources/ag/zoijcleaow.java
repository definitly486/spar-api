package ag;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {
    private static int iobyxmoadg(int i13) {
        if (i13 < 3) {
            return i13 + 1;
        }
        if (i13 < 1073741824) {
            return (int) ((i13 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static LinkedHashMap zoijcleaow(int i13) {
        return new LinkedHashMap(iobyxmoadg(i13));
    }
}
