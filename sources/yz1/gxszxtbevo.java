package yz1;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f126892eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final tzroggbefp f126893gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f126894iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f126895lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f126896nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f126897ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Integer f126898wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f126899zoijcleaow;

    public gxszxtbevo(String article, String imageUrl, String productName, Integer num, int i13, tzroggbefp review, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        zdlpuopuiu.btonecajqb(productName, "productName");
        zdlpuopuiu.btonecajqb(review, "review");
        this.f126894iobyxmoadg = article;
        this.f126899zoijcleaow = imageUrl;
        this.f126897ppxfxbqfkf = productName;
        this.f126898wkgbmnqykc = num;
        this.f126892eablkybsjg = i13;
        this.f126893gxszxtbevo = review;
        this.f126895lqeggnwhkg = z13;
        this.f126896nufgyqmvbu = z14;
    }

    public final tzroggbefp eablkybsjg() {
        return this.f126893gxszxtbevo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f126894iobyxmoadg, gxszxtbevoVar.f126894iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f126899zoijcleaow, gxszxtbevoVar.f126899zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f126897ppxfxbqfkf, gxszxtbevoVar.f126897ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f126898wkgbmnqykc, gxszxtbevoVar.f126898wkgbmnqykc) && this.f126892eablkybsjg == gxszxtbevoVar.f126892eablkybsjg && zdlpuopuiu.eablkybsjg(this.f126893gxszxtbevo, gxszxtbevoVar.f126893gxszxtbevo) && this.f126895lqeggnwhkg == gxszxtbevoVar.f126895lqeggnwhkg && this.f126896nufgyqmvbu == gxszxtbevoVar.f126896nufgyqmvbu;
    }

    public final int gxszxtbevo() {
        return this.f126892eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = ((((this.f126894iobyxmoadg.hashCode() * 31) + this.f126899zoijcleaow.hashCode()) * 31) + this.f126897ppxfxbqfkf.hashCode()) * 31;
        Integer num = this.f126898wkgbmnqykc;
        return ((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.f126892eablkybsjg)) * 31) + this.f126893gxszxtbevo.hashCode()) * 31) + Boolean.hashCode(this.f126895lqeggnwhkg)) * 31) + Boolean.hashCode(this.f126896nufgyqmvbu);
    }

    public final String iobyxmoadg() {
        return this.f126894iobyxmoadg;
    }

    public final boolean lqeggnwhkg() {
        return this.f126896nufgyqmvbu;
    }

    public final boolean nufgyqmvbu() {
        return this.f126895lqeggnwhkg;
    }

    public final String ppxfxbqfkf() {
        return this.f126899zoijcleaow;
    }

    public String toString() {
        return "Model(article=" + this.f126894iobyxmoadg + ", imageUrl=" + this.f126899zoijcleaow + ", productName=" + this.f126897ppxfxbqfkf + ", bonusQuantity=" + this.f126898wkgbmnqykc + ", starsQuantity=" + this.f126892eablkybsjg + ", review=" + this.f126893gxszxtbevo + ", isOnSendButtonEnabled=" + this.f126895lqeggnwhkg + ", isLoading=" + this.f126896nufgyqmvbu + ")";
    }

    public final String wkgbmnqykc() {
        return this.f126897ppxfxbqfkf;
    }

    public final Integer zoijcleaow() {
        return this.f126898wkgbmnqykc;
    }
}
