package y2;

/* JADX INFO: loaded from: classes.dex */
public abstract class iozdgvuglv {
    public static int iobyxmoadg(int i13, int i14) {
        for (int i15 = 1; i15 <= 2; i15++) {
            int i16 = (i13 + i15) % 3;
            if (zoijcleaow(i16, i14)) {
                return i16;
            }
        }
        return i13;
    }

    public static boolean zoijcleaow(int i13, int i14) {
        if (i13 == 0) {
            return true;
        }
        if (i13 != 1) {
            return i13 == 2 && (i14 & 2) != 0;
        }
        return (i14 & 1) != 0;
    }
}
