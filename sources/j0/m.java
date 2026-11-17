package j0;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final String eablkybsjg(CharSequence charSequence, long j13) {
        return charSequence.subSequence(l.draadjrbmk(j13), l.gtknphoqwx(j13)).toString();
    }

    public static final long iobyxmoadg(int i13) {
        return zoijcleaow(i13, i13);
    }

    public static final long ppxfxbqfkf(long j13, int i13, int i14) {
        int iAgtfadlqog = l.agtfadlqog(j13);
        if (iAgtfadlqog < i13) {
            iAgtfadlqog = i13;
        }
        if (iAgtfadlqog > i14) {
            iAgtfadlqog = i14;
        }
        int iDxjokdxxww = l.dxjokdxxww(j13);
        if (iDxjokdxxww >= i13) {
            i13 = iDxjokdxxww;
        }
        if (i13 <= i14) {
            i14 = i13;
        }
        return (iAgtfadlqog == l.agtfadlqog(j13) && i14 == l.dxjokdxxww(j13)) ? j13 : zoijcleaow(iAgtfadlqog, i14);
    }

    private static final long wkgbmnqykc(int i13, int i14) {
        if (!(i13 >= 0 && i14 >= 0)) {
            q0.iobyxmoadg.iobyxmoadg("start and end cannot be negative. [start: " + i13 + ", end: " + i14 + ']');
        }
        return (((long) i14) & 4294967295L) | (((long) i13) << 32);
    }

    public static final long zoijcleaow(int i13, int i14) {
        return l.ppxfxbqfkf(wkgbmnqykc(i13, i14));
    }
}
