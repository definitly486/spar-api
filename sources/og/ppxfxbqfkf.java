package og;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf {
    private static final int iobyxmoadg(int i13, int i14, int i15) {
        return ppxfxbqfkf(ppxfxbqfkf(i13, i15) - ppxfxbqfkf(i14, i15), i15);
    }

    private static final int ppxfxbqfkf(int i13, int i14) {
        int i15 = i13 % i14;
        return i15 >= 0 ? i15 : i15 + i14;
    }

    public static final int zoijcleaow(int i13, int i14, int i15) {
        if (i15 > 0) {
            return i13 >= i14 ? i14 : i14 - iobyxmoadg(i14, i13, i15);
        }
        if (i15 < 0) {
            return i13 <= i14 ? i14 : i14 + iobyxmoadg(i13, i14, -i15);
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
