package dj0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f29028eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f29029gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f29030iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f29031lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final iobyxmoadg f29032nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f29033ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f29034wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f29035zoijcleaow;

    public wkgbmnqykc(String orderId, String orderIdFormatted, boolean z13, boolean z14, String str, boolean z15, boolean z16, iobyxmoadg orderInfoList) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        zdlpuopuiu.btonecajqb(orderIdFormatted, "orderIdFormatted");
        zdlpuopuiu.btonecajqb(orderInfoList, "orderInfoList");
        this.f29030iobyxmoadg = orderId;
        this.f29035zoijcleaow = orderIdFormatted;
        this.f29033ppxfxbqfkf = z13;
        this.f29034wkgbmnqykc = z14;
        this.f29028eablkybsjg = str;
        this.f29029gxszxtbevo = z15;
        this.f29031lqeggnwhkg = z16;
        this.f29032nufgyqmvbu = orderInfoList;
    }

    public final boolean eablkybsjg() {
        return this.f29029gxszxtbevo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f29030iobyxmoadg, wkgbmnqykcVar.f29030iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f29035zoijcleaow, wkgbmnqykcVar.f29035zoijcleaow) && this.f29033ppxfxbqfkf == wkgbmnqykcVar.f29033ppxfxbqfkf && this.f29034wkgbmnqykc == wkgbmnqykcVar.f29034wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f29028eablkybsjg, wkgbmnqykcVar.f29028eablkybsjg) && this.f29029gxszxtbevo == wkgbmnqykcVar.f29029gxszxtbevo && this.f29031lqeggnwhkg == wkgbmnqykcVar.f29031lqeggnwhkg && zdlpuopuiu.eablkybsjg(this.f29032nufgyqmvbu, wkgbmnqykcVar.f29032nufgyqmvbu);
    }

    public final boolean gxszxtbevo() {
        return this.f29031lqeggnwhkg;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f29030iobyxmoadg.hashCode() * 31) + this.f29035zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f29033ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f29034wkgbmnqykc)) * 31;
        String str = this.f29028eablkybsjg;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f29029gxszxtbevo)) * 31) + Boolean.hashCode(this.f29031lqeggnwhkg)) * 31) + this.f29032nufgyqmvbu.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f29030iobyxmoadg;
    }

    public final boolean lqeggnwhkg() {
        return this.f29033ppxfxbqfkf;
    }

    public final boolean nufgyqmvbu() {
        return this.f29034wkgbmnqykc;
    }

    public final iobyxmoadg ppxfxbqfkf() {
        return this.f29032nufgyqmvbu;
    }

    public String toString() {
        return "OrderUIModel(orderId=" + this.f29030iobyxmoadg + ", orderIdFormatted=" + this.f29035zoijcleaow + ", isHasPhone=" + this.f29033ppxfxbqfkf + ", isPhoneButtonVisible=" + this.f29034wkgbmnqykc + ", phone=" + this.f29028eablkybsjg + ", withProductReplacement=" + this.f29029gxszxtbevo + ", isBtnQrCodeVisible=" + this.f29031lqeggnwhkg + ", orderInfoList=" + this.f29032nufgyqmvbu + ")";
    }

    public final String wkgbmnqykc() {
        return this.f29028eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f29035zoijcleaow;
    }
}
