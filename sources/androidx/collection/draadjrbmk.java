package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final long f4258iobyxmoadg;

    private /* synthetic */ draadjrbmk(long j13) {
        this.f4258iobyxmoadg = j13;
    }

    public static final int eablkybsjg(long j13) {
        return (int) (j13 >> 32);
    }

    public static final int gxszxtbevo(long j13) {
        return (int) (j13 & 4294967295L);
    }

    public static final /* synthetic */ draadjrbmk iobyxmoadg(long j13) {
        return new draadjrbmk(j13);
    }

    public static int lqeggnwhkg(long j13) {
        return Long.hashCode(j13);
    }

    public static String nufgyqmvbu(long j13) {
        return '(' + eablkybsjg(j13) + ", " + gxszxtbevo(j13) + ')';
    }

    public static long ppxfxbqfkf(long j13) {
        return j13;
    }

    public static boolean wkgbmnqykc(long j13, Object obj) {
        return (obj instanceof draadjrbmk) && j13 == ((draadjrbmk) obj).dxjokdxxww();
    }

    public static long zoijcleaow(int i13, int i14) {
        return ppxfxbqfkf((((long) i14) & 4294967295L) | (((long) i13) << 32));
    }

    public final /* synthetic */ long dxjokdxxww() {
        return this.f4258iobyxmoadg;
    }

    public boolean equals(Object obj) {
        return wkgbmnqykc(this.f4258iobyxmoadg, obj);
    }

    public int hashCode() {
        return lqeggnwhkg(this.f4258iobyxmoadg);
    }

    public String toString() {
        return nufgyqmvbu(this.f4258iobyxmoadg);
    }
}
