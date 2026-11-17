package v40;

/* JADX INFO: loaded from: classes4.dex */
public final class cqumvgiudr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f115960iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f115961zoijcleaow;

    public /* synthetic */ cqumvgiudr(float f13, float f14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, f14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqumvgiudr)) {
            return false;
        }
        cqumvgiudr cqumvgiudrVar = (cqumvgiudr) obj;
        return w0.nufgyqmvbu.dxjokdxxww(this.f115960iobyxmoadg, cqumvgiudrVar.f115960iobyxmoadg) && w0.nufgyqmvbu.dxjokdxxww(this.f115961zoijcleaow, cqumvgiudrVar.f115961zoijcleaow);
    }

    public int hashCode() {
        return (w0.nufgyqmvbu.btonecajqb(this.f115960iobyxmoadg) * 31) + w0.nufgyqmvbu.btonecajqb(this.f115961zoijcleaow);
    }

    public final float iobyxmoadg() {
        return this.f115961zoijcleaow;
    }

    public String toString() {
        return "LocalWindowInsets(top=" + w0.nufgyqmvbu.gtknphoqwx(this.f115960iobyxmoadg) + ", bottom=" + w0.nufgyqmvbu.gtknphoqwx(this.f115961zoijcleaow) + ")";
    }

    public final float zoijcleaow() {
        return this.f115960iobyxmoadg;
    }

    private cqumvgiudr(float f13, float f14) {
        this.f115960iobyxmoadg = f13;
        this.f115961zoijcleaow = f14;
    }
}
