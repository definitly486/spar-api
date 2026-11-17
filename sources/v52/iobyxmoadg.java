package v52;

import c52.vdvldrhtss;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final vdvldrhtss.zoijcleaow f116116eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f116117iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final y52.iobyxmoadg f116118ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f116119wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f116120zoijcleaow;

    public iobyxmoadg(String title, String date, y52.iobyxmoadg bannerType, List info, vdvldrhtss.zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(date, "date");
        zdlpuopuiu.btonecajqb(bannerType, "bannerType");
        zdlpuopuiu.btonecajqb(info, "info");
        this.f116117iobyxmoadg = title;
        this.f116120zoijcleaow = date;
        this.f116118ppxfxbqfkf = bannerType;
        this.f116119wkgbmnqykc = info;
        this.f116116eablkybsjg = zoijcleaowVar;
    }

    public final String eablkybsjg() {
        return this.f116117iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f116117iobyxmoadg, iobyxmoadgVar.f116117iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f116120zoijcleaow, iobyxmoadgVar.f116120zoijcleaow) && this.f116118ppxfxbqfkf == iobyxmoadgVar.f116118ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f116119wkgbmnqykc, iobyxmoadgVar.f116119wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f116116eablkybsjg, iobyxmoadgVar.f116116eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((((((this.f116117iobyxmoadg.hashCode() * 31) + this.f116120zoijcleaow.hashCode()) * 31) + this.f116118ppxfxbqfkf.hashCode()) * 31) + this.f116119wkgbmnqykc.hashCode()) * 31;
        vdvldrhtss.zoijcleaow zoijcleaowVar = this.f116116eablkybsjg;
        return iHashCode + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode());
    }

    public final y52.iobyxmoadg iobyxmoadg() {
        return this.f116118ppxfxbqfkf;
    }

    public final List ppxfxbqfkf() {
        return this.f116119wkgbmnqykc;
    }

    public String toString() {
        return "SpecialBannerLoyaltyProgramLevelUiModel(title=" + this.f116117iobyxmoadg + ", date=" + this.f116120zoijcleaow + ", bannerType=" + this.f116118ppxfxbqfkf + ", info=" + this.f116119wkgbmnqykc + ", progress=" + this.f116116eablkybsjg + ")";
    }

    public final vdvldrhtss.zoijcleaow wkgbmnqykc() {
        return this.f116116eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f116120zoijcleaow;
    }
}
