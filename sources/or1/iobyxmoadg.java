package or1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import vq1.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final vdvldrhtss.zoijcleaow f74125eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f74126iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final rr1.iobyxmoadg f74127ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f74128wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f74129zoijcleaow;

    public iobyxmoadg(String title, String date, rr1.iobyxmoadg bannerType, List info, vdvldrhtss.zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(date, "date");
        zdlpuopuiu.btonecajqb(bannerType, "bannerType");
        zdlpuopuiu.btonecajqb(info, "info");
        this.f74126iobyxmoadg = title;
        this.f74129zoijcleaow = date;
        this.f74127ppxfxbqfkf = bannerType;
        this.f74128wkgbmnqykc = info;
        this.f74125eablkybsjg = zoijcleaowVar;
    }

    public final String eablkybsjg() {
        return this.f74126iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f74126iobyxmoadg, iobyxmoadgVar.f74126iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f74129zoijcleaow, iobyxmoadgVar.f74129zoijcleaow) && this.f74127ppxfxbqfkf == iobyxmoadgVar.f74127ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f74128wkgbmnqykc, iobyxmoadgVar.f74128wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f74125eablkybsjg, iobyxmoadgVar.f74125eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((((((this.f74126iobyxmoadg.hashCode() * 31) + this.f74129zoijcleaow.hashCode()) * 31) + this.f74127ppxfxbqfkf.hashCode()) * 31) + this.f74128wkgbmnqykc.hashCode()) * 31;
        vdvldrhtss.zoijcleaow zoijcleaowVar = this.f74125eablkybsjg;
        return iHashCode + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode());
    }

    public final rr1.iobyxmoadg iobyxmoadg() {
        return this.f74127ppxfxbqfkf;
    }

    public final List ppxfxbqfkf() {
        return this.f74128wkgbmnqykc;
    }

    public String toString() {
        return "SpecialBannerLoyaltyProgramLevelUiModel(title=" + this.f74126iobyxmoadg + ", date=" + this.f74129zoijcleaow + ", bannerType=" + this.f74127ppxfxbqfkf + ", info=" + this.f74128wkgbmnqykc + ", progress=" + this.f74125eablkybsjg + ")";
    }

    public final vdvldrhtss.zoijcleaow wkgbmnqykc() {
        return this.f74125eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f74129zoijcleaow;
    }
}
