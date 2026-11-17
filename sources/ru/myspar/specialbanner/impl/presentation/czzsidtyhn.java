package ru.myspar.specialbanner.impl.presentation;

import java.util.List;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class czzsidtyhn {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f104057eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f104058gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f104059iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f104060lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final m62.zoijcleaow f104061ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ColorsUiModel f104062wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f104063zoijcleaow;

    public czzsidtyhn(String id2, String title, m62.zoijcleaow popup, ColorsUiModel colorsUiModel, boolean z13, List items, boolean z14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(popup, "popup");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "items");
        this.f104059iobyxmoadg = id2;
        this.f104063zoijcleaow = title;
        this.f104061ppxfxbqfkf = popup;
        this.f104062wkgbmnqykc = colorsUiModel;
        this.f104057eablkybsjg = z13;
        this.f104058gxszxtbevo = items;
        this.f104060lqeggnwhkg = z14;
    }

    public static /* synthetic */ czzsidtyhn zoijcleaow(czzsidtyhn czzsidtyhnVar, String str, String str2, m62.zoijcleaow zoijcleaowVar, ColorsUiModel colorsUiModel, boolean z13, List list, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = czzsidtyhnVar.f104059iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            str2 = czzsidtyhnVar.f104063zoijcleaow;
        }
        String str3 = str2;
        if ((i13 & 4) != 0) {
            zoijcleaowVar = czzsidtyhnVar.f104061ppxfxbqfkf;
        }
        m62.zoijcleaow zoijcleaowVar2 = zoijcleaowVar;
        if ((i13 & 8) != 0) {
            colorsUiModel = czzsidtyhnVar.f104062wkgbmnqykc;
        }
        ColorsUiModel colorsUiModel2 = colorsUiModel;
        if ((i13 & 16) != 0) {
            z13 = czzsidtyhnVar.f104057eablkybsjg;
        }
        boolean z15 = z13;
        if ((i13 & 32) != 0) {
            list = czzsidtyhnVar.f104058gxszxtbevo;
        }
        List list2 = list;
        if ((i13 & 64) != 0) {
            z14 = czzsidtyhnVar.f104060lqeggnwhkg;
        }
        return czzsidtyhnVar.iobyxmoadg(str, str3, zoijcleaowVar2, colorsUiModel2, z15, list2, z14);
    }

    public final boolean dxjokdxxww() {
        return this.f104057eablkybsjg;
    }

    public final List eablkybsjg() {
        return this.f104058gxszxtbevo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czzsidtyhn)) {
            return false;
        }
        czzsidtyhn czzsidtyhnVar = (czzsidtyhn) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104059iobyxmoadg, czzsidtyhnVar.f104059iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104063zoijcleaow, czzsidtyhnVar.f104063zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104061ppxfxbqfkf, czzsidtyhnVar.f104061ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104062wkgbmnqykc, czzsidtyhnVar.f104062wkgbmnqykc) && this.f104057eablkybsjg == czzsidtyhnVar.f104057eablkybsjg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104058gxszxtbevo, czzsidtyhnVar.f104058gxszxtbevo) && this.f104060lqeggnwhkg == czzsidtyhnVar.f104060lqeggnwhkg;
    }

    public final m62.zoijcleaow gxszxtbevo() {
        return this.f104061ppxfxbqfkf;
    }

    public int hashCode() {
        int iHashCode = ((((this.f104059iobyxmoadg.hashCode() * 31) + this.f104063zoijcleaow.hashCode()) * 31) + this.f104061ppxfxbqfkf.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.f104062wkgbmnqykc;
        return ((((((iHashCode + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + Boolean.hashCode(this.f104057eablkybsjg)) * 31) + this.f104058gxszxtbevo.hashCode()) * 31) + Boolean.hashCode(this.f104060lqeggnwhkg);
    }

    public final czzsidtyhn iobyxmoadg(String id2, String title, m62.zoijcleaow popup, ColorsUiModel colorsUiModel, boolean z13, List items, boolean z14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(popup, "popup");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(items, "items");
        return new czzsidtyhn(id2, title, popup, colorsUiModel, z13, items, z14);
    }

    public final String lqeggnwhkg() {
        return this.f104063zoijcleaow;
    }

    public final boolean nufgyqmvbu() {
        return this.f104060lqeggnwhkg;
    }

    public final ColorsUiModel ppxfxbqfkf() {
        return this.f104062wkgbmnqykc;
    }

    public String toString() {
        return "Model(id=" + this.f104059iobyxmoadg + ", title=" + this.f104063zoijcleaow + ", popup=" + this.f104061ppxfxbqfkf + ", colorsModel=" + this.f104062wkgbmnqykc + ", isNeededPainting=" + this.f104057eablkybsjg + ", items=" + this.f104058gxszxtbevo + ", isFullScreenLoading=" + this.f104060lqeggnwhkg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f104059iobyxmoadg;
    }

    public /* synthetic */ czzsidtyhn(String str, String str2, m62.zoijcleaow zoijcleaowVar, ColorsUiModel colorsUiModel, boolean z13, List list, boolean z14, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) == 0 ? str2 : "", (i13 & 4) != 0 ? new m62.zoijcleaow(null, null, null, 7, null) : zoijcleaowVar, (i13 & 8) != 0 ? null : colorsUiModel, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? hg.jyumaefscl.wflxmlrfwp() : list, (i13 & 64) == 0 ? z14 : false);
    }
}
