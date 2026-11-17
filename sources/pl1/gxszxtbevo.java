package pl1;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f76938eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final tzroggbefp f76939gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f76940iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f76941lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f76942nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f76943ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Integer f76944wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f76945zoijcleaow;

    public gxszxtbevo(String article, String imageUrl, String productName, Integer num, int i13, tzroggbefp review, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        zdlpuopuiu.btonecajqb(productName, "productName");
        zdlpuopuiu.btonecajqb(review, "review");
        this.f76940iobyxmoadg = article;
        this.f76945zoijcleaow = imageUrl;
        this.f76943ppxfxbqfkf = productName;
        this.f76944wkgbmnqykc = num;
        this.f76938eablkybsjg = i13;
        this.f76939gxszxtbevo = review;
        this.f76941lqeggnwhkg = z13;
        this.f76942nufgyqmvbu = z14;
    }

    public final tzroggbefp eablkybsjg() {
        return this.f76939gxszxtbevo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f76940iobyxmoadg, gxszxtbevoVar.f76940iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f76945zoijcleaow, gxszxtbevoVar.f76945zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f76943ppxfxbqfkf, gxszxtbevoVar.f76943ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f76944wkgbmnqykc, gxszxtbevoVar.f76944wkgbmnqykc) && this.f76938eablkybsjg == gxszxtbevoVar.f76938eablkybsjg && zdlpuopuiu.eablkybsjg(this.f76939gxszxtbevo, gxszxtbevoVar.f76939gxszxtbevo) && this.f76941lqeggnwhkg == gxszxtbevoVar.f76941lqeggnwhkg && this.f76942nufgyqmvbu == gxszxtbevoVar.f76942nufgyqmvbu;
    }

    public final int gxszxtbevo() {
        return this.f76938eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = ((((this.f76940iobyxmoadg.hashCode() * 31) + this.f76945zoijcleaow.hashCode()) * 31) + this.f76943ppxfxbqfkf.hashCode()) * 31;
        Integer num = this.f76944wkgbmnqykc;
        return ((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.f76938eablkybsjg)) * 31) + this.f76939gxszxtbevo.hashCode()) * 31) + Boolean.hashCode(this.f76941lqeggnwhkg)) * 31) + Boolean.hashCode(this.f76942nufgyqmvbu);
    }

    public final String iobyxmoadg() {
        return this.f76940iobyxmoadg;
    }

    public final boolean lqeggnwhkg() {
        return this.f76942nufgyqmvbu;
    }

    public final boolean nufgyqmvbu() {
        return this.f76941lqeggnwhkg;
    }

    public final String ppxfxbqfkf() {
        return this.f76945zoijcleaow;
    }

    public String toString() {
        return "Model(article=" + this.f76940iobyxmoadg + ", imageUrl=" + this.f76945zoijcleaow + ", productName=" + this.f76943ppxfxbqfkf + ", bonusQuantity=" + this.f76944wkgbmnqykc + ", starsQuantity=" + this.f76938eablkybsjg + ", review=" + this.f76939gxszxtbevo + ", isOnSendButtonEnabled=" + this.f76941lqeggnwhkg + ", isLoading=" + this.f76942nufgyqmvbu + ")";
    }

    public final String wkgbmnqykc() {
        return this.f76943ppxfxbqfkf;
    }

    public final Integer zoijcleaow() {
        return this.f76944wkgbmnqykc;
    }
}
