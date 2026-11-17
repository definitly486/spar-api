package jb1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f51056eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f51057gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f51058iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f51059ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f51060wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f51061zoijcleaow;

    public nufgyqmvbu(String str, String text, String promoCode, String shareMsg, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(promoCode, "promoCode");
        zdlpuopuiu.btonecajqb(shareMsg, "shareMsg");
        this.f51058iobyxmoadg = str;
        this.f51061zoijcleaow = text;
        this.f51059ppxfxbqfkf = promoCode;
        this.f51060wkgbmnqykc = shareMsg;
        this.f51056eablkybsjg = z13;
        this.f51057gxszxtbevo = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f51058iobyxmoadg, nufgyqmvbuVar.f51058iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f51061zoijcleaow, nufgyqmvbuVar.f51061zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f51059ppxfxbqfkf, nufgyqmvbuVar.f51059ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f51060wkgbmnqykc, nufgyqmvbuVar.f51060wkgbmnqykc) && this.f51056eablkybsjg == nufgyqmvbuVar.f51056eablkybsjg && this.f51057gxszxtbevo == nufgyqmvbuVar.f51057gxszxtbevo;
    }

    public int hashCode() {
        String str = this.f51058iobyxmoadg;
        return ((((((((((str == null ? 0 : str.hashCode()) * 31) + this.f51061zoijcleaow.hashCode()) * 31) + this.f51059ppxfxbqfkf.hashCode()) * 31) + this.f51060wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f51056eablkybsjg)) * 31) + Boolean.hashCode(this.f51057gxszxtbevo);
    }

    public final String iobyxmoadg() {
        return this.f51058iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f51061zoijcleaow;
    }

    public String toString() {
        return "Model(image=" + this.f51058iobyxmoadg + ", text=" + this.f51061zoijcleaow + ", promoCode=" + this.f51059ppxfxbqfkf + ", shareMsg=" + this.f51060wkgbmnqykc + ", isPromoAvailable=" + this.f51056eablkybsjg + ", isLoading=" + this.f51057gxszxtbevo + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f51057gxszxtbevo;
    }

    public final String zoijcleaow() {
        return this.f51059ppxfxbqfkf;
    }
}
