package c52;

import java.util.List;
import ru.myspar.core.domain.models.ColorsModel;

/* JADX INFO: loaded from: classes6.dex */
public final class istkbnxepw {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final boolean f18879dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ylkuphrtab f18880eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final lmojexxdyd f18881gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f18882iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f18883lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final cdpycssgdh f18884nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f18885ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ColorsModel f18886wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f18887zoijcleaow;

    public istkbnxepw(String id2, String title, boolean z13, ColorsModel colorsModel, ylkuphrtab promoButton, lmojexxdyd popup, List items, cdpycssgdh refs, boolean z14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promoButton, "promoButton");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(popup, "popup");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "items");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(refs, "refs");
        this.f18882iobyxmoadg = id2;
        this.f18887zoijcleaow = title;
        this.f18885ppxfxbqfkf = z13;
        this.f18886wkgbmnqykc = colorsModel;
        this.f18880eablkybsjg = promoButton;
        this.f18881gxszxtbevo = popup;
        this.f18883lqeggnwhkg = items;
        this.f18884nufgyqmvbu = refs;
        this.f18879dxjokdxxww = z14;
    }

    public final boolean dxjokdxxww() {
        return this.f18879dxjokdxxww;
    }

    public final ylkuphrtab eablkybsjg() {
        return this.f18880eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof istkbnxepw)) {
            return false;
        }
        istkbnxepw istkbnxepwVar = (istkbnxepw) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18882iobyxmoadg, istkbnxepwVar.f18882iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18887zoijcleaow, istkbnxepwVar.f18887zoijcleaow) && this.f18885ppxfxbqfkf == istkbnxepwVar.f18885ppxfxbqfkf && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18886wkgbmnqykc, istkbnxepwVar.f18886wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18880eablkybsjg, istkbnxepwVar.f18880eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18881gxszxtbevo, istkbnxepwVar.f18881gxszxtbevo) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18883lqeggnwhkg, istkbnxepwVar.f18883lqeggnwhkg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18884nufgyqmvbu, istkbnxepwVar.f18884nufgyqmvbu) && this.f18879dxjokdxxww == istkbnxepwVar.f18879dxjokdxxww;
    }

    public final cdpycssgdh gxszxtbevo() {
        return this.f18884nufgyqmvbu;
    }

    public int hashCode() {
        int iHashCode = ((((this.f18882iobyxmoadg.hashCode() * 31) + this.f18887zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f18885ppxfxbqfkf)) * 31;
        ColorsModel colorsModel = this.f18886wkgbmnqykc;
        return ((((((((((iHashCode + (colorsModel == null ? 0 : colorsModel.hashCode())) * 31) + this.f18880eablkybsjg.hashCode()) * 31) + this.f18881gxszxtbevo.hashCode()) * 31) + this.f18883lqeggnwhkg.hashCode()) * 31) + this.f18884nufgyqmvbu.hashCode()) * 31) + Boolean.hashCode(this.f18879dxjokdxxww);
    }

    public final ColorsModel iobyxmoadg() {
        return this.f18886wkgbmnqykc;
    }

    public final String lqeggnwhkg() {
        return this.f18887zoijcleaow;
    }

    public final boolean nufgyqmvbu() {
        return this.f18885ppxfxbqfkf;
    }

    public final List ppxfxbqfkf() {
        return this.f18883lqeggnwhkg;
    }

    public String toString() {
        return "SpecialBannerDetails(id=" + this.f18882iobyxmoadg + ", title=" + this.f18887zoijcleaow + ", isAdult=" + this.f18885ppxfxbqfkf + ", colorsModel=" + this.f18886wkgbmnqykc + ", promoButton=" + this.f18880eablkybsjg + ", popup=" + this.f18881gxszxtbevo + ", items=" + this.f18883lqeggnwhkg + ", refs=" + this.f18884nufgyqmvbu + ", isNeededPainting=" + this.f18879dxjokdxxww + ")";
    }

    public final lmojexxdyd wkgbmnqykc() {
        return this.f18881gxszxtbevo;
    }

    public final String zoijcleaow() {
        return this.f18882iobyxmoadg;
    }
}
