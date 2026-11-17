package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class p20 extends b60 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final i10 f58031iobyxmoadg;

    public p20(i10 bannerData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bannerData, "bannerData");
        this.f58031iobyxmoadg = bannerData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p20) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58031iobyxmoadg, ((p20) obj).f58031iobyxmoadg);
    }

    public final int hashCode() {
        return this.f58031iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "OnHelperBannerClickedEvent(bannerData=" + this.f58031iobyxmoadg + ")";
    }
}
