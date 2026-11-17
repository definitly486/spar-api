package s71;

import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f105646eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f105647iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f105648ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ojitshcjhn f105649wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f105650zoijcleaow;

    public iobyxmoadg(String title, String str, String str2, ojitshcjhn navlink, String str3) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(navlink, "navlink");
        this.f105647iobyxmoadg = title;
        this.f105650zoijcleaow = str;
        this.f105648ppxfxbqfkf = str2;
        this.f105649wkgbmnqykc = navlink;
        this.f105646eablkybsjg = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f105647iobyxmoadg, iobyxmoadgVar.f105647iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f105650zoijcleaow, iobyxmoadgVar.f105650zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f105648ppxfxbqfkf, iobyxmoadgVar.f105648ppxfxbqfkf) && this.f105649wkgbmnqykc == iobyxmoadgVar.f105649wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f105646eablkybsjg, iobyxmoadgVar.f105646eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = this.f105647iobyxmoadg.hashCode() * 31;
        String str = this.f105650zoijcleaow;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f105648ppxfxbqfkf;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f105649wkgbmnqykc.hashCode()) * 31;
        String str3 = this.f105646eablkybsjg;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final ojitshcjhn iobyxmoadg() {
        return this.f105649wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f105647iobyxmoadg;
    }

    public String toString() {
        return "ButtonDataSpecialBannerUiModel(title=" + this.f105647iobyxmoadg + ", colorButton=" + this.f105650zoijcleaow + ", colorText=" + this.f105648ppxfxbqfkf + ", navlink=" + this.f105649wkgbmnqykc + ", reference=" + this.f105646eablkybsjg + ")";
    }

    public final String zoijcleaow() {
        return this.f105646eablkybsjg;
    }
}
