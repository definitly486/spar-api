package tp0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final boolean f111151agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final List f111152btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final boolean f111153draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final String f111154dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f111155eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final ColorsUiModel f111156gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final zoijcleaow f111157gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f111158iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final iobyxmoadg f111159lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f111160nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final boolean f111161ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final mz0.ppxfxbqfkf f111162ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final boolean f111163rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final m91.wkgbmnqykc f111164wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f111165wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f111166zoijcleaow;

    public enum iobyxmoadg {
        BRAND,
        DEFAULT;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f111167iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public enum zoijcleaow {
        GLOBAL,
        CATEGORY;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f111171iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public rgvfuqvkyq(boolean z13, boolean z14, mz0.ppxfxbqfkf selectedSort, List products, String description, zoijcleaow searchHint, iobyxmoadg headerType, String headerTitle, String str, List catalogSections, ColorsUiModel colorsModel, boolean z15, m91.wkgbmnqykc wkgbmnqykcVar, boolean z16, boolean z17, boolean z18) {
        zdlpuopuiu.btonecajqb(selectedSort, "selectedSort");
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(description, "description");
        zdlpuopuiu.btonecajqb(searchHint, "searchHint");
        zdlpuopuiu.btonecajqb(headerType, "headerType");
        zdlpuopuiu.btonecajqb(headerTitle, "headerTitle");
        zdlpuopuiu.btonecajqb(catalogSections, "catalogSections");
        zdlpuopuiu.btonecajqb(colorsModel, "colorsModel");
        this.f111158iobyxmoadg = z13;
        this.f111166zoijcleaow = z14;
        this.f111162ppxfxbqfkf = selectedSort;
        this.f111165wkgbmnqykc = products;
        this.f111155eablkybsjg = description;
        this.f111157gxszxtbevo = searchHint;
        this.f111159lqeggnwhkg = headerType;
        this.f111160nufgyqmvbu = headerTitle;
        this.f111154dxjokdxxww = str;
        this.f111152btonecajqb = catalogSections;
        this.f111156gtknphoqwx = colorsModel;
        this.f111153draadjrbmk = z15;
        this.f111164wflxmlrfwp = wkgbmnqykcVar;
        this.f111151agtfadlqog = z16;
        this.f111161ojitshcjhn = z17;
        this.f111163rgvfuqvkyq = z18;
    }

    public final boolean agtfadlqog() {
        return this.f111153draadjrbmk;
    }

    public final boolean btonecajqb() {
        return this.f111151agtfadlqog;
    }

    public final boolean draadjrbmk() {
        return this.f111166zoijcleaow;
    }

    public final mz0.ppxfxbqfkf dxjokdxxww() {
        return this.f111162ppxfxbqfkf;
    }

    public final String eablkybsjg() {
        return this.f111154dxjokdxxww;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgvfuqvkyq)) {
            return false;
        }
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
        return this.f111158iobyxmoadg == rgvfuqvkyqVar.f111158iobyxmoadg && this.f111166zoijcleaow == rgvfuqvkyqVar.f111166zoijcleaow && this.f111162ppxfxbqfkf == rgvfuqvkyqVar.f111162ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f111165wkgbmnqykc, rgvfuqvkyqVar.f111165wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f111155eablkybsjg, rgvfuqvkyqVar.f111155eablkybsjg) && this.f111157gxszxtbevo == rgvfuqvkyqVar.f111157gxszxtbevo && this.f111159lqeggnwhkg == rgvfuqvkyqVar.f111159lqeggnwhkg && zdlpuopuiu.eablkybsjg(this.f111160nufgyqmvbu, rgvfuqvkyqVar.f111160nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f111154dxjokdxxww, rgvfuqvkyqVar.f111154dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f111152btonecajqb, rgvfuqvkyqVar.f111152btonecajqb) && zdlpuopuiu.eablkybsjg(this.f111156gtknphoqwx, rgvfuqvkyqVar.f111156gtknphoqwx) && this.f111153draadjrbmk == rgvfuqvkyqVar.f111153draadjrbmk && zdlpuopuiu.eablkybsjg(this.f111164wflxmlrfwp, rgvfuqvkyqVar.f111164wflxmlrfwp) && this.f111151agtfadlqog == rgvfuqvkyqVar.f111151agtfadlqog && this.f111161ojitshcjhn == rgvfuqvkyqVar.f111161ojitshcjhn && this.f111163rgvfuqvkyq == rgvfuqvkyqVar.f111163rgvfuqvkyq;
    }

    public final boolean gtknphoqwx() {
        return this.f111163rgvfuqvkyq;
    }

    public final String gxszxtbevo() {
        return this.f111160nufgyqmvbu;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((Boolean.hashCode(this.f111158iobyxmoadg) * 31) + Boolean.hashCode(this.f111166zoijcleaow)) * 31) + this.f111162ppxfxbqfkf.hashCode()) * 31) + this.f111165wkgbmnqykc.hashCode()) * 31) + this.f111155eablkybsjg.hashCode()) * 31) + this.f111157gxszxtbevo.hashCode()) * 31) + this.f111159lqeggnwhkg.hashCode()) * 31) + this.f111160nufgyqmvbu.hashCode()) * 31;
        String str = this.f111154dxjokdxxww;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f111152btonecajqb.hashCode()) * 31) + this.f111156gtknphoqwx.hashCode()) * 31) + Boolean.hashCode(this.f111153draadjrbmk)) * 31;
        m91.wkgbmnqykc wkgbmnqykcVar = this.f111164wflxmlrfwp;
        return ((((((iHashCode2 + (wkgbmnqykcVar != null ? wkgbmnqykcVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.f111151agtfadlqog)) * 31) + Boolean.hashCode(this.f111161ojitshcjhn)) * 31) + Boolean.hashCode(this.f111163rgvfuqvkyq);
    }

    public final m91.wkgbmnqykc iobyxmoadg() {
        return this.f111164wflxmlrfwp;
    }

    public final iobyxmoadg lqeggnwhkg() {
        return this.f111159lqeggnwhkg;
    }

    public final List nufgyqmvbu() {
        return this.f111165wkgbmnqykc;
    }

    public final boolean ojitshcjhn() {
        return this.f111161ojitshcjhn;
    }

    public final ColorsUiModel ppxfxbqfkf() {
        return this.f111156gtknphoqwx;
    }

    public String toString() {
        return "Model(isGridType=" + this.f111158iobyxmoadg + ", isGridEnabled=" + this.f111166zoijcleaow + ", selectedSort=" + this.f111162ppxfxbqfkf + ", products=" + this.f111165wkgbmnqykc + ", description=" + this.f111155eablkybsjg + ", searchHint=" + this.f111157gxszxtbevo + ", headerType=" + this.f111159lqeggnwhkg + ", headerTitle=" + this.f111160nufgyqmvbu + ", headerImageTitle=" + this.f111154dxjokdxxww + ", catalogSections=" + this.f111152btonecajqb + ", colorsModel=" + this.f111156gtknphoqwx + ", isInitialLoading=" + this.f111153draadjrbmk + ", bannerGroupUiModel=" + this.f111164wflxmlrfwp + ", isEditOrderMode=" + this.f111151agtfadlqog + ", isSwipeToRefreshLoading=" + this.f111161ojitshcjhn + ", isFullScreenLoading=" + this.f111163rgvfuqvkyq + ")";
    }

    public final boolean wflxmlrfwp() {
        return this.f111158iobyxmoadg;
    }

    public final String wkgbmnqykc() {
        return this.f111155eablkybsjg;
    }

    public final List zoijcleaow() {
        return this.f111152btonecajqb;
    }

    public /* synthetic */ rgvfuqvkyq(boolean z13, boolean z14, mz0.ppxfxbqfkf ppxfxbqfkfVar, List list, String str, zoijcleaow zoijcleaowVar, iobyxmoadg iobyxmoadgVar, String str2, String str3, List list2, ColorsUiModel colorsUiModel, boolean z15, m91.wkgbmnqykc wkgbmnqykcVar, boolean z16, boolean z17, boolean z18, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? true : z14, ppxfxbqfkfVar, (i13 & 8) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 16) != 0 ? "" : str, (i13 & 32) != 0 ? zoijcleaow.GLOBAL : zoijcleaowVar, (i13 & 64) != 0 ? iobyxmoadg.DEFAULT : iobyxmoadgVar, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "" : str2, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : str3, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? jyumaefscl.wflxmlrfwp() : list2, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? new ColorsUiModel.AttributesRes(0, 0, 0, 0, 0, 31, null) : colorsUiModel, (i13 & 2048) != 0 ? true : z15, (i13 & 4096) != 0 ? null : wkgbmnqykcVar, (i13 & 8192) != 0 ? false : z16, (i13 & 16384) != 0 ? false : z17, (i13 & 32768) != 0 ? false : z18);
    }
}
