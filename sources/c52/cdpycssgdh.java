package c52;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class cdpycssgdh {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yadqdtsiqt f18778eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f18779iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f18780ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f18781wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f18782zoijcleaow;

    public cdpycssgdh(List stickers, List hints, List shopTypes, List shopServices, yadqdtsiqt yadqdtsiqtVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(stickers, "stickers");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hints, "hints");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shopTypes, "shopTypes");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shopServices, "shopServices");
        this.f18779iobyxmoadg = stickers;
        this.f18782zoijcleaow = hints;
        this.f18780ppxfxbqfkf = shopTypes;
        this.f18781wkgbmnqykc = shopServices;
        this.f18778eablkybsjg = yadqdtsiqtVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdpycssgdh)) {
            return false;
        }
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18779iobyxmoadg, cdpycssgdhVar.f18779iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18782zoijcleaow, cdpycssgdhVar.f18782zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18780ppxfxbqfkf, cdpycssgdhVar.f18780ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18781wkgbmnqykc, cdpycssgdhVar.f18781wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18778eablkybsjg, cdpycssgdhVar.f18778eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((((((this.f18779iobyxmoadg.hashCode() * 31) + this.f18782zoijcleaow.hashCode()) * 31) + this.f18780ppxfxbqfkf.hashCode()) * 31) + this.f18781wkgbmnqykc.hashCode()) * 31;
        yadqdtsiqt yadqdtsiqtVar = this.f18778eablkybsjg;
        return iHashCode + (yadqdtsiqtVar == null ? 0 : yadqdtsiqtVar.hashCode());
    }

    public final yadqdtsiqt iobyxmoadg() {
        return this.f18778eablkybsjg;
    }

    public String toString() {
        return "SpecialBannerDetailsReferences(stickers=" + this.f18779iobyxmoadg + ", hints=" + this.f18782zoijcleaow + ", shopTypes=" + this.f18780ppxfxbqfkf + ", shopServices=" + this.f18781wkgbmnqykc + ", evropolis=" + this.f18778eablkybsjg + ")";
    }

    public final List zoijcleaow() {
        return this.f18781wkgbmnqykc;
    }

    public /* synthetic */ cdpycssgdh(List list, List list2, List list3, List list4, yadqdtsiqt yadqdtsiqtVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? hg.jyumaefscl.wflxmlrfwp() : list, (i13 & 2) != 0 ? hg.jyumaefscl.wflxmlrfwp() : list2, (i13 & 4) != 0 ? hg.jyumaefscl.wflxmlrfwp() : list3, (i13 & 8) != 0 ? hg.jyumaefscl.wflxmlrfwp() : list4, (i13 & 16) != 0 ? null : yadqdtsiqtVar);
    }
}
