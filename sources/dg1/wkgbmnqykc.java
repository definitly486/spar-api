package dg1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final String f28142dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f28143eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f28144gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f28145iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f28146lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final iobyxmoadg f28147nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f28148ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f28149wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f28150zoijcleaow;

    public wkgbmnqykc(String orderId, String orderIdFormatted, boolean z13, boolean z14, String str, boolean z15, boolean z16, iobyxmoadg orderInfoList, String npsUrl) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        zdlpuopuiu.btonecajqb(orderIdFormatted, "orderIdFormatted");
        zdlpuopuiu.btonecajqb(orderInfoList, "orderInfoList");
        zdlpuopuiu.btonecajqb(npsUrl, "npsUrl");
        this.f28145iobyxmoadg = orderId;
        this.f28150zoijcleaow = orderIdFormatted;
        this.f28148ppxfxbqfkf = z13;
        this.f28149wkgbmnqykc = z14;
        this.f28143eablkybsjg = str;
        this.f28144gxszxtbevo = z15;
        this.f28146lqeggnwhkg = z16;
        this.f28147nufgyqmvbu = orderInfoList;
        this.f28142dxjokdxxww = npsUrl;
    }

    public final boolean dxjokdxxww() {
        return this.f28149wkgbmnqykc;
    }

    public final String eablkybsjg() {
        return this.f28143eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f28145iobyxmoadg, wkgbmnqykcVar.f28145iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f28150zoijcleaow, wkgbmnqykcVar.f28150zoijcleaow) && this.f28148ppxfxbqfkf == wkgbmnqykcVar.f28148ppxfxbqfkf && this.f28149wkgbmnqykc == wkgbmnqykcVar.f28149wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f28143eablkybsjg, wkgbmnqykcVar.f28143eablkybsjg) && this.f28144gxszxtbevo == wkgbmnqykcVar.f28144gxszxtbevo && this.f28146lqeggnwhkg == wkgbmnqykcVar.f28146lqeggnwhkg && zdlpuopuiu.eablkybsjg(this.f28147nufgyqmvbu, wkgbmnqykcVar.f28147nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f28142dxjokdxxww, wkgbmnqykcVar.f28142dxjokdxxww);
    }

    public final boolean gxszxtbevo() {
        return this.f28144gxszxtbevo;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f28145iobyxmoadg.hashCode() * 31) + this.f28150zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f28148ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f28149wkgbmnqykc)) * 31;
        String str = this.f28143eablkybsjg;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f28144gxszxtbevo)) * 31) + Boolean.hashCode(this.f28146lqeggnwhkg)) * 31) + this.f28147nufgyqmvbu.hashCode()) * 31) + this.f28142dxjokdxxww.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f28142dxjokdxxww;
    }

    public final boolean lqeggnwhkg() {
        return this.f28146lqeggnwhkg;
    }

    public final boolean nufgyqmvbu() {
        return this.f28148ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f28150zoijcleaow;
    }

    public String toString() {
        return "OrderUIModel(orderId=" + this.f28145iobyxmoadg + ", orderIdFormatted=" + this.f28150zoijcleaow + ", isHasPhone=" + this.f28148ppxfxbqfkf + ", isPhoneButtonVisible=" + this.f28149wkgbmnqykc + ", phone=" + this.f28143eablkybsjg + ", withProductReplacement=" + this.f28144gxszxtbevo + ", isBtnQrCodeVisible=" + this.f28146lqeggnwhkg + ", orderInfoList=" + this.f28147nufgyqmvbu + ", npsUrl=" + this.f28142dxjokdxxww + ")";
    }

    public final iobyxmoadg wkgbmnqykc() {
        return this.f28147nufgyqmvbu;
    }

    public final String zoijcleaow() {
        return this.f28145iobyxmoadg;
    }
}
