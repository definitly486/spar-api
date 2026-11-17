package e31;

/* JADX INFO: loaded from: classes5.dex */
public final class jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f30353iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f30354zoijcleaow;

    public /* synthetic */ jyumaefscl(float f13, float f14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, f14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyumaefscl)) {
            return false;
        }
        jyumaefscl jyumaefsclVar = (jyumaefscl) obj;
        return w0.nufgyqmvbu.dxjokdxxww(this.f30353iobyxmoadg, jyumaefsclVar.f30353iobyxmoadg) && w0.nufgyqmvbu.dxjokdxxww(this.f30354zoijcleaow, jyumaefsclVar.f30354zoijcleaow);
    }

    public int hashCode() {
        return (w0.nufgyqmvbu.btonecajqb(this.f30353iobyxmoadg) * 31) + w0.nufgyqmvbu.btonecajqb(this.f30354zoijcleaow);
    }

    public final float iobyxmoadg() {
        return this.f30354zoijcleaow;
    }

    public String toString() {
        return "LocalWindowInsets(top=" + w0.nufgyqmvbu.gtknphoqwx(this.f30353iobyxmoadg) + ", bottom=" + w0.nufgyqmvbu.gtknphoqwx(this.f30354zoijcleaow) + ")";
    }

    public final float zoijcleaow() {
        return this.f30353iobyxmoadg;
    }

    private jyumaefscl(float f13, float f14) {
        this.f30353iobyxmoadg = f13;
        this.f30354zoijcleaow = f14;
    }
}
