package pu1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.bottomsheet.additional_info.AdditionalInfoUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final boolean f77345btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final boolean f77346dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f77347eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final st0.wkgbmnqykc f77348gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f77349iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final AdditionalInfoUiModel f77350lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f77351nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f77352ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f77353wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f77354zoijcleaow;

    public lqeggnwhkg(boolean z13, boolean z14, String actionBarTitle, boolean z15, List contentBlocks, st0.wkgbmnqykc wkgbmnqykcVar, AdditionalInfoUiModel additionalInfoUiModel, boolean z16, boolean z17, boolean z18) {
        zdlpuopuiu.btonecajqb(actionBarTitle, "actionBarTitle");
        zdlpuopuiu.btonecajqb(contentBlocks, "contentBlocks");
        this.f77349iobyxmoadg = z13;
        this.f77354zoijcleaow = z14;
        this.f77352ppxfxbqfkf = actionBarTitle;
        this.f77353wkgbmnqykc = z15;
        this.f77347eablkybsjg = contentBlocks;
        this.f77348gxszxtbevo = wkgbmnqykcVar;
        this.f77350lqeggnwhkg = additionalInfoUiModel;
        this.f77351nufgyqmvbu = z16;
        this.f77346dxjokdxxww = z17;
        this.f77345btonecajqb = z18;
    }

    public final boolean btonecajqb() {
        return this.f77351nufgyqmvbu;
    }

    public final boolean dxjokdxxww() {
        return this.f77354zoijcleaow;
    }

    public final st0.wkgbmnqykc eablkybsjg() {
        return this.f77348gxszxtbevo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f77349iobyxmoadg == lqeggnwhkgVar.f77349iobyxmoadg && this.f77354zoijcleaow == lqeggnwhkgVar.f77354zoijcleaow && zdlpuopuiu.eablkybsjg(this.f77352ppxfxbqfkf, lqeggnwhkgVar.f77352ppxfxbqfkf) && this.f77353wkgbmnqykc == lqeggnwhkgVar.f77353wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f77347eablkybsjg, lqeggnwhkgVar.f77347eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f77348gxszxtbevo, lqeggnwhkgVar.f77348gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f77350lqeggnwhkg, lqeggnwhkgVar.f77350lqeggnwhkg) && this.f77351nufgyqmvbu == lqeggnwhkgVar.f77351nufgyqmvbu && this.f77346dxjokdxxww == lqeggnwhkgVar.f77346dxjokdxxww && this.f77345btonecajqb == lqeggnwhkgVar.f77345btonecajqb;
    }

    public final boolean gxszxtbevo() {
        return this.f77345btonecajqb;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.f77349iobyxmoadg) * 31) + Boolean.hashCode(this.f77354zoijcleaow)) * 31) + this.f77352ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f77353wkgbmnqykc)) * 31) + this.f77347eablkybsjg.hashCode()) * 31;
        st0.wkgbmnqykc wkgbmnqykcVar = this.f77348gxszxtbevo;
        int iHashCode2 = (iHashCode + (wkgbmnqykcVar == null ? 0 : wkgbmnqykcVar.hashCode())) * 31;
        AdditionalInfoUiModel additionalInfoUiModel = this.f77350lqeggnwhkg;
        return ((((((iHashCode2 + (additionalInfoUiModel != null ? additionalInfoUiModel.hashCode() : 0)) * 31) + Boolean.hashCode(this.f77351nufgyqmvbu)) * 31) + Boolean.hashCode(this.f77346dxjokdxxww)) * 31) + Boolean.hashCode(this.f77345btonecajqb);
    }

    public final String iobyxmoadg() {
        return this.f77352ppxfxbqfkf;
    }

    public final boolean lqeggnwhkg() {
        return this.f77353wkgbmnqykc;
    }

    public final boolean nufgyqmvbu() {
        return this.f77349iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f77346dxjokdxxww;
    }

    public String toString() {
        return "Model(isLoading=" + this.f77349iobyxmoadg + ", isNeededShowSkeleton=" + this.f77354zoijcleaow + ", actionBarTitle=" + this.f77352ppxfxbqfkf + ", isBtnSettingsVisible=" + this.f77353wkgbmnqykc + ", contentBlocks=" + this.f77347eablkybsjg + ", totalPrice=" + this.f77348gxszxtbevo + ", additionalInfoBottomSheet=" + this.f77350lqeggnwhkg + ", isOpenSettingsBottomSheet=" + this.f77351nufgyqmvbu + ", autoRenewalEnabled=" + this.f77346dxjokdxxww + ", isAutoRenewalClickable=" + this.f77345btonecajqb + ")";
    }

    public final List wkgbmnqykc() {
        return this.f77347eablkybsjg;
    }

    public final AdditionalInfoUiModel zoijcleaow() {
        return this.f77350lqeggnwhkg;
    }
}
