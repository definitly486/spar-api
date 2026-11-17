package vq1;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117877iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117878zoijcleaow;

    public nufgyqmvbu(int i13, jpowsppfya type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        this.f117877iobyxmoadg = i13;
        this.f117878zoijcleaow = type;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f117877iobyxmoadg == nufgyqmvbuVar.f117877iobyxmoadg && this.f117878zoijcleaow == nufgyqmvbuVar.f117878zoijcleaow;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f117877iobyxmoadg) * 31) + this.f117878zoijcleaow.hashCode();
    }

    public int iobyxmoadg() {
        return this.f117877iobyxmoadg;
    }

    public String toString() {
        return "Divider(index=" + this.f117877iobyxmoadg + ", type=" + this.f117878zoijcleaow + ")";
    }
}
