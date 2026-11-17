package nd0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f69757eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f69758gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f69759iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f69760ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f69761wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f69762zoijcleaow;

    public nufgyqmvbu(String str, String text, String promoCode, String shareMsg, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(promoCode, "promoCode");
        zdlpuopuiu.btonecajqb(shareMsg, "shareMsg");
        this.f69759iobyxmoadg = str;
        this.f69762zoijcleaow = text;
        this.f69760ppxfxbqfkf = promoCode;
        this.f69761wkgbmnqykc = shareMsg;
        this.f69757eablkybsjg = z13;
        this.f69758gxszxtbevo = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f69759iobyxmoadg, nufgyqmvbuVar.f69759iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f69762zoijcleaow, nufgyqmvbuVar.f69762zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f69760ppxfxbqfkf, nufgyqmvbuVar.f69760ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f69761wkgbmnqykc, nufgyqmvbuVar.f69761wkgbmnqykc) && this.f69757eablkybsjg == nufgyqmvbuVar.f69757eablkybsjg && this.f69758gxszxtbevo == nufgyqmvbuVar.f69758gxszxtbevo;
    }

    public int hashCode() {
        String str = this.f69759iobyxmoadg;
        return ((((((((((str == null ? 0 : str.hashCode()) * 31) + this.f69762zoijcleaow.hashCode()) * 31) + this.f69760ppxfxbqfkf.hashCode()) * 31) + this.f69761wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f69757eablkybsjg)) * 31) + Boolean.hashCode(this.f69758gxszxtbevo);
    }

    public final String iobyxmoadg() {
        return this.f69759iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f69762zoijcleaow;
    }

    public String toString() {
        return "Model(image=" + this.f69759iobyxmoadg + ", text=" + this.f69762zoijcleaow + ", promoCode=" + this.f69760ppxfxbqfkf + ", shareMsg=" + this.f69761wkgbmnqykc + ", isPromoAvailable=" + this.f69757eablkybsjg + ", isLoading=" + this.f69758gxszxtbevo + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f69758gxszxtbevo;
    }

    public final String zoijcleaow() {
        return this.f69760ppxfxbqfkf;
    }
}
