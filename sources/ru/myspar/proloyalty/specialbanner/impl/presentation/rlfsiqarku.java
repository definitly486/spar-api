package ru.myspar.proloyalty.specialbanner.impl.presentation;

import java.util.List;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class rlfsiqarku {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f101480eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f101481gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f101482iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f101483lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final fs1.zoijcleaow f101484ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ColorsUiModel f101485wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f101486zoijcleaow;

    public rlfsiqarku(String id2, String title, fs1.zoijcleaow popup, ColorsUiModel colorsUiModel, boolean z13, List items, boolean z14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(popup, "popup");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "items");
        this.f101482iobyxmoadg = id2;
        this.f101486zoijcleaow = title;
        this.f101484ppxfxbqfkf = popup;
        this.f101485wkgbmnqykc = colorsUiModel;
        this.f101480eablkybsjg = z13;
        this.f101481gxszxtbevo = items;
        this.f101483lqeggnwhkg = z14;
    }

    public static /* synthetic */ rlfsiqarku zoijcleaow(rlfsiqarku rlfsiqarkuVar, String str, String str2, fs1.zoijcleaow zoijcleaowVar, ColorsUiModel colorsUiModel, boolean z13, List list, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = rlfsiqarkuVar.f101482iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            str2 = rlfsiqarkuVar.f101486zoijcleaow;
        }
        String str3 = str2;
        if ((i13 & 4) != 0) {
            zoijcleaowVar = rlfsiqarkuVar.f101484ppxfxbqfkf;
        }
        fs1.zoijcleaow zoijcleaowVar2 = zoijcleaowVar;
        if ((i13 & 8) != 0) {
            colorsUiModel = rlfsiqarkuVar.f101485wkgbmnqykc;
        }
        ColorsUiModel colorsUiModel2 = colorsUiModel;
        if ((i13 & 16) != 0) {
            z13 = rlfsiqarkuVar.f101480eablkybsjg;
        }
        boolean z15 = z13;
        if ((i13 & 32) != 0) {
            list = rlfsiqarkuVar.f101481gxszxtbevo;
        }
        List list2 = list;
        if ((i13 & 64) != 0) {
            z14 = rlfsiqarkuVar.f101483lqeggnwhkg;
        }
        return rlfsiqarkuVar.iobyxmoadg(str, str3, zoijcleaowVar2, colorsUiModel2, z15, list2, z14);
    }

    public final boolean dxjokdxxww() {
        return this.f101480eablkybsjg;
    }

    public final List eablkybsjg() {
        return this.f101481gxszxtbevo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlfsiqarku)) {
            return false;
        }
        rlfsiqarku rlfsiqarkuVar = (rlfsiqarku) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101482iobyxmoadg, rlfsiqarkuVar.f101482iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101486zoijcleaow, rlfsiqarkuVar.f101486zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101484ppxfxbqfkf, rlfsiqarkuVar.f101484ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101485wkgbmnqykc, rlfsiqarkuVar.f101485wkgbmnqykc) && this.f101480eablkybsjg == rlfsiqarkuVar.f101480eablkybsjg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101481gxszxtbevo, rlfsiqarkuVar.f101481gxszxtbevo) && this.f101483lqeggnwhkg == rlfsiqarkuVar.f101483lqeggnwhkg;
    }

    public final fs1.zoijcleaow gxszxtbevo() {
        return this.f101484ppxfxbqfkf;
    }

    public int hashCode() {
        int iHashCode = ((((this.f101482iobyxmoadg.hashCode() * 31) + this.f101486zoijcleaow.hashCode()) * 31) + this.f101484ppxfxbqfkf.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f101485wkgbmnqykc;
        return ((((((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f101480eablkybsjg)) * 31) + this.f101481gxszxtbevo.hashCode()) * 31) + Boolean.hashCode(this.f101483lqeggnwhkg);
    }

    public final rlfsiqarku iobyxmoadg(String id2, String title, fs1.zoijcleaow popup, ColorsUiModel colorsUiModel, boolean z13, List items, boolean z14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(popup, "popup");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "items");
        return new rlfsiqarku(id2, title, popup, colorsUiModel, z13, items, z14);
    }

    public final String lqeggnwhkg() {
        return this.f101486zoijcleaow;
    }

    public final boolean nufgyqmvbu() {
        return this.f101483lqeggnwhkg;
    }

    public final ColorsUiModel ppxfxbqfkf() {
        return this.f101485wkgbmnqykc;
    }

    public String toString() {
        return "Model(id=" + this.f101482iobyxmoadg + ", title=" + this.f101486zoijcleaow + ", popup=" + this.f101484ppxfxbqfkf + ", colorsModel=" + this.f101485wkgbmnqykc + ", isNeededPainting=" + this.f101480eablkybsjg + ", items=" + this.f101481gxszxtbevo + ", isFullScreenLoading=" + this.f101483lqeggnwhkg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f101482iobyxmoadg;
    }

    public /* synthetic */ rlfsiqarku(String str, String str2, fs1.zoijcleaow zoijcleaowVar, ColorsUiModel colorsUiModel, boolean z13, List list, boolean z14, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) == 0 ? str2 : "", (i13 & 4) != 0 ? new fs1.zoijcleaow(null, null, null, 7, null) : zoijcleaowVar, (i13 & 8) != 0 ? null : colorsUiModel, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? hg.jyumaefscl.wflxmlrfwp() : list, (i13 & 64) == 0 ? z14 : false);
    }
}
