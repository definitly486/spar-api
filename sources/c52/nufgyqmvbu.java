package c52;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18957iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18958zoijcleaow;

    public nufgyqmvbu(int i13, jpowsppfya type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        this.f18957iobyxmoadg = i13;
        this.f18958zoijcleaow = type;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f18957iobyxmoadg == nufgyqmvbuVar.f18957iobyxmoadg && this.f18958zoijcleaow == nufgyqmvbuVar.f18958zoijcleaow;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f18957iobyxmoadg) * 31) + this.f18958zoijcleaow.hashCode();
    }

    public int iobyxmoadg() {
        return this.f18957iobyxmoadg;
    }

    public String toString() {
        return "Divider(index=" + this.f18957iobyxmoadg + ", type=" + this.f18958zoijcleaow + ")";
    }
}
