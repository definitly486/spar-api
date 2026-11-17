package i;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f41569wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f41570iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f41571ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f41572zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ ppxfxbqfkf(String str, long j13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str, j13, i13);
    }

    public abstract long btonecajqb(float f13, float f14, float f15, float f16, ppxfxbqfkf ppxfxbqfkfVar);

    public abstract float dxjokdxxww(float f13, float f14, float f15);

    public final long eablkybsjg() {
        return this.f41572zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        if (this.f41571ppxfxbqfkf == ppxfxbqfkfVar.f41571ppxfxbqfkf && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f41570iobyxmoadg, ppxfxbqfkfVar.f41570iobyxmoadg)) {
            return zoijcleaow.eablkybsjg(this.f41572zoijcleaow, ppxfxbqfkfVar.f41572zoijcleaow);
        }
        return false;
    }

    public final String gxszxtbevo() {
        return this.f41570iobyxmoadg;
    }

    public int hashCode() {
        return (((this.f41570iobyxmoadg.hashCode() * 31) + zoijcleaow.lqeggnwhkg(this.f41572zoijcleaow)) * 31) + this.f41571ppxfxbqfkf;
    }

    public final int iobyxmoadg() {
        return zoijcleaow.gxszxtbevo(this.f41572zoijcleaow);
    }

    public boolean lqeggnwhkg() {
        return false;
    }

    public abstract long nufgyqmvbu(float f13, float f14, float f15);

    public abstract float ppxfxbqfkf(int i13);

    public String toString() {
        return this.f41570iobyxmoadg + " (id=" + this.f41571ppxfxbqfkf + ", model=" + ((Object) zoijcleaow.nufgyqmvbu(this.f41572zoijcleaow)) + ')';
    }

    public abstract float wkgbmnqykc(int i13);

    public final int zoijcleaow() {
        return this.f41571ppxfxbqfkf;
    }

    private ppxfxbqfkf(String str, long j13, int i13) {
        this.f41570iobyxmoadg = str;
        this.f41572zoijcleaow = j13;
        this.f41571ppxfxbqfkf = i13;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i13 < -1 || i13 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}
