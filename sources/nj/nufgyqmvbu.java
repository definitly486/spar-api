package nj;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final nufgyqmvbu f70175iobyxmoadg = new nufgyqmvbu();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final long f70176zoijcleaow = System.nanoTime();

    private nufgyqmvbu() {
    }

    private final long ppxfxbqfkf() {
        return System.nanoTime() - f70176zoijcleaow;
    }

    public final long iobyxmoadg(long j13, long j14) {
        return lqeggnwhkg.ppxfxbqfkf(j13, j14, wkgbmnqykc.NANOSECONDS);
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    public long zoijcleaow() {
        return dxjokdxxww.iobyxmoadg.iobyxmoadg(ppxfxbqfkf());
    }
}
