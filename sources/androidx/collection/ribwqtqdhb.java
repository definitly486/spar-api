package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class ribwqtqdhb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final long[] f4359iobyxmoadg = {-9187201950435737345L, -1};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final dsvhmnatus f4360zoijcleaow = new dsvhmnatus(0);

    public static final int eablkybsjg(int i13) {
        if (i13 == 7) {
            return 8;
        }
        return i13 + ((i13 - 1) / 7);
    }

    public static final int iobyxmoadg(int i13) {
        if (i13 == 7) {
            return 6;
        }
        return i13 - (i13 / 8);
    }

    public static final int ppxfxbqfkf(int i13) {
        if (i13 == 0) {
            return 6;
        }
        return (i13 * 2) + 1;
    }

    public static final int wkgbmnqykc(int i13) {
        if (i13 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i13);
        }
        return 0;
    }

    public static final dsvhmnatus zoijcleaow() {
        return new dsvhmnatus(0, 1, null);
    }
}
