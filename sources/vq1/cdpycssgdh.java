package vq1;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class cdpycssgdh {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yadqdtsiqt f117697eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f117698iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f117699ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f117700wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f117701zoijcleaow;

    public cdpycssgdh(List stickers, List hints, List shopTypes, List shopServices, yadqdtsiqt yadqdtsiqtVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(stickers, "stickers");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hints, "hints");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shopTypes, "shopTypes");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shopServices, "shopServices");
        this.f117698iobyxmoadg = stickers;
        this.f117701zoijcleaow = hints;
        this.f117699ppxfxbqfkf = shopTypes;
        this.f117700wkgbmnqykc = shopServices;
        this.f117697eablkybsjg = yadqdtsiqtVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdpycssgdh)) {
            return false;
        }
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117698iobyxmoadg, cdpycssgdhVar.f117698iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117701zoijcleaow, cdpycssgdhVar.f117701zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117699ppxfxbqfkf, cdpycssgdhVar.f117699ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117700wkgbmnqykc, cdpycssgdhVar.f117700wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117697eablkybsjg, cdpycssgdhVar.f117697eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((((((this.f117698iobyxmoadg.hashCode() * 31) + this.f117701zoijcleaow.hashCode()) * 31) + this.f117699ppxfxbqfkf.hashCode()) * 31) + this.f117700wkgbmnqykc.hashCode()) * 31;
        yadqdtsiqt yadqdtsiqtVar = this.f117697eablkybsjg;
        return iHashCode + (yadqdtsiqtVar == null ? 0 : yadqdtsiqtVar.hashCode());
    }

    public final yadqdtsiqt iobyxmoadg() {
        return this.f117697eablkybsjg;
    }

    public String toString() {
        return "SpecialBannerDetailsReferences(stickers=" + this.f117698iobyxmoadg + ", hints=" + this.f117701zoijcleaow + ", shopTypes=" + this.f117699ppxfxbqfkf + ", shopServices=" + this.f117700wkgbmnqykc + ", evropolis=" + this.f117697eablkybsjg + ")";
    }

    public final List zoijcleaow() {
        return this.f117700wkgbmnqykc;
    }

    public /* synthetic */ cdpycssgdh(List list, List list2, List list3, List list4, yadqdtsiqt yadqdtsiqtVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? hg.jyumaefscl.wflxmlrfwp() : list, (i13 & 2) != 0 ? hg.jyumaefscl.wflxmlrfwp() : list2, (i13 & 4) != 0 ? hg.jyumaefscl.wflxmlrfwp() : list3, (i13 & 8) != 0 ? hg.jyumaefscl.wflxmlrfwp() : list4, (i13 & 16) != 0 ? null : yadqdtsiqtVar);
    }
}
