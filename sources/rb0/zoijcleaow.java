package rb0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import w30.ppxfxbqfkf;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final boolean f82484cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final boolean f82485esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final iobyxmoadg f82486iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f82487jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final float f82488lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f82489yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f82490zdlpuopuiu;

    public zoijcleaow(String itemId, String icon, String pic, iobyxmoadg shopServiceType, boolean z13, boolean z14, float f13) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(icon, "icon");
        zdlpuopuiu.btonecajqb(pic, "pic");
        zdlpuopuiu.btonecajqb(shopServiceType, "shopServiceType");
        this.f82490zdlpuopuiu = itemId;
        this.f82489yggfygwlhe = icon;
        this.f82487jyumaefscl = pic;
        this.f82486iwizpuwonk = shopServiceType;
        this.f82484cqumvgiudr = z13;
        this.f82485esjtqupxsv = z14;
        this.f82488lereixgezr = f13;
    }

    public static /* synthetic */ zoijcleaow wkgbmnqykc(zoijcleaow zoijcleaowVar, String str, String str2, String str3, iobyxmoadg iobyxmoadgVar, boolean z13, boolean z14, float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = zoijcleaowVar.f82490zdlpuopuiu;
        }
        if ((i13 & 2) != 0) {
            str2 = zoijcleaowVar.f82489yggfygwlhe;
        }
        String str4 = str2;
        if ((i13 & 4) != 0) {
            str3 = zoijcleaowVar.f82487jyumaefscl;
        }
        String str5 = str3;
        if ((i13 & 8) != 0) {
            iobyxmoadgVar = zoijcleaowVar.f82486iwizpuwonk;
        }
        iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar;
        if ((i13 & 16) != 0) {
            z13 = zoijcleaowVar.f82484cqumvgiudr;
        }
        boolean z15 = z13;
        if ((i13 & 32) != 0) {
            z14 = zoijcleaowVar.f82485esjtqupxsv;
        }
        boolean z16 = z14;
        if ((i13 & 64) != 0) {
            f13 = zoijcleaowVar.f82488lereixgezr;
        }
        return zoijcleaowVar.iobyxmoadg(str, str4, str5, iobyxmoadgVar2, z15, z16, f13);
    }

    public final boolean btonecajqb() {
        return this.f82484cqumvgiudr;
    }

    public final boolean dxjokdxxww() {
        return this.f82485esjtqupxsv;
    }

    public final float eablkybsjg() {
        return this.f82488lereixgezr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f82490zdlpuopuiu, zoijcleaowVar.f82490zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f82489yggfygwlhe, zoijcleaowVar.f82489yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f82487jyumaefscl, zoijcleaowVar.f82487jyumaefscl) && this.f82486iwizpuwonk == zoijcleaowVar.f82486iwizpuwonk && this.f82484cqumvgiudr == zoijcleaowVar.f82484cqumvgiudr && this.f82485esjtqupxsv == zoijcleaowVar.f82485esjtqupxsv && Float.compare(this.f82488lereixgezr, zoijcleaowVar.f82488lereixgezr) == 0;
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f82490zdlpuopuiu;
    }

    public int hashCode() {
        return (((((((((((this.f82490zdlpuopuiu.hashCode() * 31) + this.f82489yggfygwlhe.hashCode()) * 31) + this.f82487jyumaefscl.hashCode()) * 31) + this.f82486iwizpuwonk.hashCode()) * 31) + Boolean.hashCode(this.f82484cqumvgiudr)) * 31) + Boolean.hashCode(this.f82485esjtqupxsv)) * 31) + Float.hashCode(this.f82488lereixgezr);
    }

    public final zoijcleaow iobyxmoadg(String itemId, String icon, String pic, iobyxmoadg shopServiceType, boolean z13, boolean z14, float f13) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(icon, "icon");
        zdlpuopuiu.btonecajqb(pic, "pic");
        zdlpuopuiu.btonecajqb(shopServiceType, "shopServiceType");
        return new zoijcleaow(itemId, icon, pic, shopServiceType, z13, z14, f13);
    }

    public final String lqeggnwhkg() {
        return this.f82487jyumaefscl;
    }

    public final iobyxmoadg nufgyqmvbu() {
        return this.f82486iwizpuwonk;
    }

    public String toString() {
        return "ShopServiceUiModel(itemId=" + this.f82490zdlpuopuiu + ", icon=" + this.f82489yggfygwlhe + ", pic=" + this.f82487jyumaefscl + ", shopServiceType=" + this.f82486iwizpuwonk + ", isChecked=" + this.f82484cqumvgiudr + ", isBlueMarkerColor=" + this.f82485esjtqupxsv + ", flexGrow=" + this.f82488lereixgezr + ")";
    }

    public /* synthetic */ zoijcleaow(String str, String str2, String str3, iobyxmoadg iobyxmoadgVar, boolean z13, boolean z14, float f13, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, str3, (i13 & 8) != 0 ? iobyxmoadg.f82477cqumvgiudr : iobyxmoadgVar, z13, (i13 & 32) != 0 ? false : z14, (i13 & 64) != 0 ? 1.0f : f13);
    }
}
