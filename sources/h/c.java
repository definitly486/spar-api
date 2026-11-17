package h;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f38871iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f38872ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f38873zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f38870wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final c f38869eablkybsjg = new c(0, 0, 0.0f, 7, null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final c iobyxmoadg() {
            return c.f38869eablkybsjg;
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ c(long j13, long j14, float f13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(j13, j14, f13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return oipsdeybqn.ojitshcjhn(this.f38871iobyxmoadg, cVar.f38871iobyxmoadg) && g.eablkybsjg.btonecajqb(this.f38873zoijcleaow, cVar.f38873zoijcleaow) && this.f38872ppxfxbqfkf == cVar.f38872ppxfxbqfkf;
    }

    public int hashCode() {
        return (((oipsdeybqn.yggfygwlhe(this.f38871iobyxmoadg) * 31) + g.eablkybsjg.ojitshcjhn(this.f38873zoijcleaow)) * 31) + Float.hashCode(this.f38872ppxfxbqfkf);
    }

    public final long ppxfxbqfkf() {
        return this.f38871iobyxmoadg;
    }

    public String toString() {
        return "Shadow(color=" + ((Object) oipsdeybqn.jyumaefscl(this.f38871iobyxmoadg)) + ", offset=" + ((Object) g.eablkybsjg.kcexrzcfyt(this.f38873zoijcleaow)) + ", blurRadius=" + this.f38872ppxfxbqfkf + ')';
    }

    public final long wkgbmnqykc() {
        return this.f38873zoijcleaow;
    }

    public final float zoijcleaow() {
        return this.f38872ppxfxbqfkf;
    }

    private c(long j13, long j14, float f13) {
        this.f38871iobyxmoadg = j13;
        this.f38873zoijcleaow = j14;
        this.f38872ppxfxbqfkf = f13;
    }

    public /* synthetic */ c(long j13, long j14, float f13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? bfopjjpdmp.ppxfxbqfkf(4278190080L) : j13, (i13 & 2) != 0 ? g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf() : j14, (i13 & 4) != 0 ? 0.0f : f13, null);
    }
}
