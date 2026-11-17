package ikoacuggdj;

/* JADX INFO: loaded from: classes.dex */
public final class vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f44919iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final h.jztzpxfvev f44920zoijcleaow;

    public /* synthetic */ vdvldrhtss(float f13, h.jztzpxfvev jztzpxfvevVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, jztzpxfvevVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdvldrhtss)) {
            return false;
        }
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
        return w0.nufgyqmvbu.dxjokdxxww(this.f44919iobyxmoadg, vdvldrhtssVar.f44919iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f44920zoijcleaow, vdvldrhtssVar.f44920zoijcleaow);
    }

    public int hashCode() {
        return (w0.nufgyqmvbu.btonecajqb(this.f44919iobyxmoadg) * 31) + this.f44920zoijcleaow.hashCode();
    }

    public final h.jztzpxfvev iobyxmoadg() {
        return this.f44920zoijcleaow;
    }

    public String toString() {
        return "BorderStroke(width=" + ((Object) w0.nufgyqmvbu.gtknphoqwx(this.f44919iobyxmoadg)) + ", brush=" + this.f44920zoijcleaow + ')';
    }

    public final float zoijcleaow() {
        return this.f44919iobyxmoadg;
    }

    private vdvldrhtss(float f13, h.jztzpxfvev jztzpxfvevVar) {
        this.f44919iobyxmoadg = f13;
        this.f44920zoijcleaow = jztzpxfvevVar;
    }
}
