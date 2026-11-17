package sr1;

import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f108480eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f108481gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f108482iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f108483ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ojitshcjhn f108484wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f108485zoijcleaow;

    public zoijcleaow(int i13, int i14, String image, ojitshcjhn navlink, String reference, String adv) {
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(navlink, "navlink");
        zdlpuopuiu.btonecajqb(reference, "reference");
        zdlpuopuiu.btonecajqb(adv, "adv");
        this.f108482iobyxmoadg = i13;
        this.f108485zoijcleaow = i14;
        this.f108483ppxfxbqfkf = image;
        this.f108484wkgbmnqykc = navlink;
        this.f108480eablkybsjg = reference;
        this.f108481gxszxtbevo = adv;
    }

    public final String eablkybsjg() {
        return this.f108480eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f108482iobyxmoadg == zoijcleaowVar.f108482iobyxmoadg && this.f108485zoijcleaow == zoijcleaowVar.f108485zoijcleaow && zdlpuopuiu.eablkybsjg(this.f108483ppxfxbqfkf, zoijcleaowVar.f108483ppxfxbqfkf) && this.f108484wkgbmnqykc == zoijcleaowVar.f108484wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f108480eablkybsjg, zoijcleaowVar.f108480eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f108481gxszxtbevo, zoijcleaowVar.f108481gxszxtbevo);
    }

    public final int gxszxtbevo() {
        return this.f108485zoijcleaow;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f108482iobyxmoadg) * 31) + Integer.hashCode(this.f108485zoijcleaow)) * 31) + this.f108483ppxfxbqfkf.hashCode()) * 31) + this.f108484wkgbmnqykc.hashCode()) * 31) + this.f108480eablkybsjg.hashCode()) * 31) + this.f108481gxszxtbevo.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f108481gxszxtbevo;
    }

    public final ojitshcjhn ppxfxbqfkf() {
        return this.f108484wkgbmnqykc;
    }

    public String toString() {
        return "BannerSpecialBannerUiModel(onScreenIndex=" + this.f108482iobyxmoadg + ", sort=" + this.f108485zoijcleaow + ", image=" + this.f108483ppxfxbqfkf + ", navlink=" + this.f108484wkgbmnqykc + ", reference=" + this.f108480eablkybsjg + ", adv=" + this.f108481gxszxtbevo + ")";
    }

    public final int wkgbmnqykc() {
        return this.f108482iobyxmoadg;
    }

    public final String zoijcleaow() {
        return this.f108483ppxfxbqfkf;
    }
}
