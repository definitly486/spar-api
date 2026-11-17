package z52;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f129171eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f129172gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f129173iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f129174ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final f40.zoijcleaow f129175wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f129176zoijcleaow;

    public zoijcleaow(int i13, int i14, String image, f40.zoijcleaow navlink, String reference, String adv) {
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(navlink, "navlink");
        zdlpuopuiu.btonecajqb(reference, "reference");
        zdlpuopuiu.btonecajqb(adv, "adv");
        this.f129173iobyxmoadg = i13;
        this.f129176zoijcleaow = i14;
        this.f129174ppxfxbqfkf = image;
        this.f129175wkgbmnqykc = navlink;
        this.f129171eablkybsjg = reference;
        this.f129172gxszxtbevo = adv;
    }

    public final String eablkybsjg() {
        return this.f129171eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f129173iobyxmoadg == zoijcleaowVar.f129173iobyxmoadg && this.f129176zoijcleaow == zoijcleaowVar.f129176zoijcleaow && zdlpuopuiu.eablkybsjg(this.f129174ppxfxbqfkf, zoijcleaowVar.f129174ppxfxbqfkf) && this.f129175wkgbmnqykc == zoijcleaowVar.f129175wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f129171eablkybsjg, zoijcleaowVar.f129171eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f129172gxszxtbevo, zoijcleaowVar.f129172gxszxtbevo);
    }

    public final int gxszxtbevo() {
        return this.f129176zoijcleaow;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f129173iobyxmoadg) * 31) + Integer.hashCode(this.f129176zoijcleaow)) * 31) + this.f129174ppxfxbqfkf.hashCode()) * 31) + this.f129175wkgbmnqykc.hashCode()) * 31) + this.f129171eablkybsjg.hashCode()) * 31) + this.f129172gxszxtbevo.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f129172gxszxtbevo;
    }

    public final f40.zoijcleaow ppxfxbqfkf() {
        return this.f129175wkgbmnqykc;
    }

    public String toString() {
        return "BannerSpecialBannerUiModel(onScreenIndex=" + this.f129173iobyxmoadg + ", sort=" + this.f129176zoijcleaow + ", image=" + this.f129174ppxfxbqfkf + ", navlink=" + this.f129175wkgbmnqykc + ", reference=" + this.f129171eablkybsjg + ", adv=" + this.f129172gxszxtbevo + ")";
    }

    public final int wkgbmnqykc() {
        return this.f129173iobyxmoadg;
    }

    public final String zoijcleaow() {
        return this.f129174ppxfxbqfkf;
    }
}
