package vq1;

import java.util.List;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;

/* JADX INFO: loaded from: classes6.dex */
public final class istkbnxepw {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final boolean f117798dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ylkuphrtab f117799eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final lmojexxdyd f117800gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f117801iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f117802lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final cdpycssgdh f117803nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f117804ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ColorsModel f117805wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f117806zoijcleaow;

    public istkbnxepw(String id2, String title, boolean z13, ColorsModel colorsModel, ylkuphrtab promoButton, lmojexxdyd popup, List items, cdpycssgdh refs, boolean z14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoButton, "promoButton");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(popup, "popup");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "items");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(refs, "refs");
        this.f117801iobyxmoadg = id2;
        this.f117806zoijcleaow = title;
        this.f117804ppxfxbqfkf = z13;
        this.f117805wkgbmnqykc = colorsModel;
        this.f117799eablkybsjg = promoButton;
        this.f117800gxszxtbevo = popup;
        this.f117802lqeggnwhkg = items;
        this.f117803nufgyqmvbu = refs;
        this.f117798dxjokdxxww = z14;
    }

    public final boolean dxjokdxxww() {
        return this.f117798dxjokdxxww;
    }

    public final ylkuphrtab eablkybsjg() {
        return this.f117799eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof istkbnxepw)) {
            return false;
        }
        istkbnxepw istkbnxepwVar = (istkbnxepw) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117801iobyxmoadg, istkbnxepwVar.f117801iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117806zoijcleaow, istkbnxepwVar.f117806zoijcleaow) && this.f117804ppxfxbqfkf == istkbnxepwVar.f117804ppxfxbqfkf && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117805wkgbmnqykc, istkbnxepwVar.f117805wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117799eablkybsjg, istkbnxepwVar.f117799eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117800gxszxtbevo, istkbnxepwVar.f117800gxszxtbevo) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117802lqeggnwhkg, istkbnxepwVar.f117802lqeggnwhkg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117803nufgyqmvbu, istkbnxepwVar.f117803nufgyqmvbu) && this.f117798dxjokdxxww == istkbnxepwVar.f117798dxjokdxxww;
    }

    public final cdpycssgdh gxszxtbevo() {
        return this.f117803nufgyqmvbu;
    }

    public int hashCode() {
        int iHashCode = ((((this.f117801iobyxmoadg.hashCode() * 31) + this.f117806zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f117804ppxfxbqfkf)) * 31;
        ColorsModel colorsModel = this.f117805wkgbmnqykc;
        return ((((((((((iHashCode + (colorsModel == null ? 0 : colorsModel.hashCode())) * 31) + this.f117799eablkybsjg.hashCode()) * 31) + this.f117800gxszxtbevo.hashCode()) * 31) + this.f117802lqeggnwhkg.hashCode()) * 31) + this.f117803nufgyqmvbu.hashCode()) * 31) + Boolean.hashCode(this.f117798dxjokdxxww);
    }

    public final ColorsModel iobyxmoadg() {
        return this.f117805wkgbmnqykc;
    }

    public final String lqeggnwhkg() {
        return this.f117806zoijcleaow;
    }

    public final boolean nufgyqmvbu() {
        return this.f117804ppxfxbqfkf;
    }

    public final List ppxfxbqfkf() {
        return this.f117802lqeggnwhkg;
    }

    public String toString() {
        return "SpecialBannerDetails(id=" + this.f117801iobyxmoadg + ", title=" + this.f117806zoijcleaow + ", isAdult=" + this.f117804ppxfxbqfkf + ", colorsModel=" + this.f117805wkgbmnqykc + ", promoButton=" + this.f117799eablkybsjg + ", popup=" + this.f117800gxszxtbevo + ", items=" + this.f117802lqeggnwhkg + ", refs=" + this.f117803nufgyqmvbu + ", isNeededPainting=" + this.f117798dxjokdxxww + ")";
    }

    public final lmojexxdyd wkgbmnqykc() {
        return this.f117800gxszxtbevo;
    }

    public final String zoijcleaow() {
        return this.f117801iobyxmoadg;
    }
}
