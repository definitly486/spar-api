package ydmasvzmpa;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f124599iobyxmoadg;

    private /* synthetic */ ppxfxbqfkf(long j13) {
        this.f124599iobyxmoadg = j13;
    }

    public static int eablkybsjg(long j13) {
        return Long.hashCode(j13);
    }

    public static String gxszxtbevo(long j13) {
        return "GridItemSpan(packedValue=" + j13 + ')';
    }

    public static final /* synthetic */ ppxfxbqfkf iobyxmoadg(long j13) {
        return new ppxfxbqfkf(j13);
    }

    public static boolean ppxfxbqfkf(long j13, Object obj) {
        return (obj instanceof ppxfxbqfkf) && j13 == ((ppxfxbqfkf) obj).lqeggnwhkg();
    }

    public static final int wkgbmnqykc(long j13) {
        return (int) j13;
    }

    public static long zoijcleaow(long j13) {
        return j13;
    }

    public boolean equals(Object obj) {
        return ppxfxbqfkf(this.f124599iobyxmoadg, obj);
    }

    public int hashCode() {
        return eablkybsjg(this.f124599iobyxmoadg);
    }

    public final /* synthetic */ long lqeggnwhkg() {
        return this.f124599iobyxmoadg;
    }

    public String toString() {
        return gxszxtbevo(this.f124599iobyxmoadg);
    }
}
