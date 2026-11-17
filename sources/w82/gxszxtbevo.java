package w82;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.bottomsheet.additional_info.AdditionalInfoUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final boolean f119008btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final boolean f119009dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f119010eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final yu.wkgbmnqykc f119011gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f119012iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final AdditionalInfoUiModel f119013lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f119014nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f119015ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f119016wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f119017zoijcleaow;

    public gxszxtbevo(boolean z13, boolean z14, String actionBarTitle, boolean z15, List contentBlocks, yu.wkgbmnqykc wkgbmnqykcVar, AdditionalInfoUiModel additionalInfoUiModel, boolean z16, boolean z17, boolean z18) {
        zdlpuopuiu.btonecajqb(actionBarTitle, "actionBarTitle");
        zdlpuopuiu.btonecajqb(contentBlocks, "contentBlocks");
        this.f119012iobyxmoadg = z13;
        this.f119017zoijcleaow = z14;
        this.f119015ppxfxbqfkf = actionBarTitle;
        this.f119016wkgbmnqykc = z15;
        this.f119010eablkybsjg = contentBlocks;
        this.f119011gxszxtbevo = wkgbmnqykcVar;
        this.f119013lqeggnwhkg = additionalInfoUiModel;
        this.f119014nufgyqmvbu = z16;
        this.f119009dxjokdxxww = z17;
        this.f119008btonecajqb = z18;
    }

    public final boolean btonecajqb() {
        return this.f119014nufgyqmvbu;
    }

    public final boolean dxjokdxxww() {
        return this.f119017zoijcleaow;
    }

    public final yu.wkgbmnqykc eablkybsjg() {
        return this.f119011gxszxtbevo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f119012iobyxmoadg == gxszxtbevoVar.f119012iobyxmoadg && this.f119017zoijcleaow == gxszxtbevoVar.f119017zoijcleaow && zdlpuopuiu.eablkybsjg(this.f119015ppxfxbqfkf, gxszxtbevoVar.f119015ppxfxbqfkf) && this.f119016wkgbmnqykc == gxszxtbevoVar.f119016wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f119010eablkybsjg, gxszxtbevoVar.f119010eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f119011gxszxtbevo, gxszxtbevoVar.f119011gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f119013lqeggnwhkg, gxszxtbevoVar.f119013lqeggnwhkg) && this.f119014nufgyqmvbu == gxszxtbevoVar.f119014nufgyqmvbu && this.f119009dxjokdxxww == gxszxtbevoVar.f119009dxjokdxxww && this.f119008btonecajqb == gxszxtbevoVar.f119008btonecajqb;
    }

    public final boolean gxszxtbevo() {
        return this.f119008btonecajqb;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.f119012iobyxmoadg) * 31) + Boolean.hashCode(this.f119017zoijcleaow)) * 31) + this.f119015ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f119016wkgbmnqykc)) * 31) + this.f119010eablkybsjg.hashCode()) * 31;
        yu.wkgbmnqykc wkgbmnqykcVar = this.f119011gxszxtbevo;
        int iHashCode2 = (iHashCode + (wkgbmnqykcVar == null ? 0 : wkgbmnqykcVar.hashCode())) * 31;
        AdditionalInfoUiModel additionalInfoUiModel = this.f119013lqeggnwhkg;
        return ((((((iHashCode2 + (additionalInfoUiModel != null ? additionalInfoUiModel.hashCode() : 0)) * 31) + Boolean.hashCode(this.f119014nufgyqmvbu)) * 31) + Boolean.hashCode(this.f119009dxjokdxxww)) * 31) + Boolean.hashCode(this.f119008btonecajqb);
    }

    public final String iobyxmoadg() {
        return this.f119015ppxfxbqfkf;
    }

    public final boolean lqeggnwhkg() {
        return this.f119016wkgbmnqykc;
    }

    public final boolean nufgyqmvbu() {
        return this.f119012iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f119009dxjokdxxww;
    }

    public String toString() {
        return "Model(isLoading=" + this.f119012iobyxmoadg + ", isNeededShowSkeleton=" + this.f119017zoijcleaow + ", actionBarTitle=" + this.f119015ppxfxbqfkf + ", isBtnSettingsVisible=" + this.f119016wkgbmnqykc + ", contentBlocks=" + this.f119010eablkybsjg + ", totalPrice=" + this.f119011gxszxtbevo + ", additionalInfoBottomSheet=" + this.f119013lqeggnwhkg + ", isOpenSettingsBottomSheet=" + this.f119014nufgyqmvbu + ", autoRenewalEnabled=" + this.f119009dxjokdxxww + ", isAutoRenewalClickable=" + this.f119008btonecajqb + ")";
    }

    public final List wkgbmnqykc() {
        return this.f119010eablkybsjg;
    }

    public final AdditionalInfoUiModel zoijcleaow() {
        return this.f119013lqeggnwhkg;
    }
}
