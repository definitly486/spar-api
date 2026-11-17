package ru.myspar.catalog.impl.search;

/* JADX INFO: loaded from: classes4.dex */
public final class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gg.vdvldrhtss f85441iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f85442ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y00.iobyxmoadg f85443zoijcleaow;

    public ojitshcjhn(gg.vdvldrhtss isLoggedIn, y00.iobyxmoadg iobyxmoadgVar, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isLoggedIn, "isLoggedIn");
        this.f85441iobyxmoadg = isLoggedIn;
        this.f85443zoijcleaow = iobyxmoadgVar;
        this.f85442ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojitshcjhn)) {
            return false;
        }
        ojitshcjhn ojitshcjhnVar = (ojitshcjhn) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85441iobyxmoadg, ojitshcjhnVar.f85441iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85443zoijcleaow, ojitshcjhnVar.f85443zoijcleaow) && this.f85442ppxfxbqfkf == ojitshcjhnVar.f85442ppxfxbqfkf;
    }

    public int hashCode() {
        int iHashCode = this.f85441iobyxmoadg.hashCode() * 31;
        y00.iobyxmoadg iobyxmoadgVar = this.f85443zoijcleaow;
        return ((iHashCode + (iobyxmoadgVar == null ? 0 : iobyxmoadgVar.hashCode())) * 31) + Boolean.hashCode(this.f85442ppxfxbqfkf);
    }

    public final gg.vdvldrhtss iobyxmoadg() {
        return this.f85441iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f85442ppxfxbqfkf;
    }

    public String toString() {
        return "FlowModel(isLoggedIn=" + this.f85441iobyxmoadg + ", deliveryData=" + this.f85443zoijcleaow + ", isScreenVisible=" + this.f85442ppxfxbqfkf + ")";
    }

    public final y00.iobyxmoadg zoijcleaow() {
        return this.f85443zoijcleaow;
    }
}
