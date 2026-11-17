package q91;

import b21.ppxfxbqfkf;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final boolean f78345cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final boolean f78346esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final iobyxmoadg f78347iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f78348jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final float f78349lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f78350yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f78351zdlpuopuiu;

    public zoijcleaow(String itemId, String icon, String pic, iobyxmoadg shopServiceType, boolean z13, boolean z14, float f13) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(icon, "icon");
        zdlpuopuiu.btonecajqb(pic, "pic");
        zdlpuopuiu.btonecajqb(shopServiceType, "shopServiceType");
        this.f78351zdlpuopuiu = itemId;
        this.f78350yggfygwlhe = icon;
        this.f78348jyumaefscl = pic;
        this.f78347iwizpuwonk = shopServiceType;
        this.f78345cqumvgiudr = z13;
        this.f78346esjtqupxsv = z14;
        this.f78349lereixgezr = f13;
    }

    public static /* synthetic */ zoijcleaow wkgbmnqykc(zoijcleaow zoijcleaowVar, String str, String str2, String str3, iobyxmoadg iobyxmoadgVar, boolean z13, boolean z14, float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = zoijcleaowVar.f78351zdlpuopuiu;
        }
        if ((i13 & 2) != 0) {
            str2 = zoijcleaowVar.f78350yggfygwlhe;
        }
        String str4 = str2;
        if ((i13 & 4) != 0) {
            str3 = zoijcleaowVar.f78348jyumaefscl;
        }
        String str5 = str3;
        if ((i13 & 8) != 0) {
            iobyxmoadgVar = zoijcleaowVar.f78347iwizpuwonk;
        }
        iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar;
        if ((i13 & 16) != 0) {
            z13 = zoijcleaowVar.f78345cqumvgiudr;
        }
        boolean z15 = z13;
        if ((i13 & 32) != 0) {
            z14 = zoijcleaowVar.f78346esjtqupxsv;
        }
        boolean z16 = z14;
        if ((i13 & 64) != 0) {
            f13 = zoijcleaowVar.f78349lereixgezr;
        }
        return zoijcleaowVar.iobyxmoadg(str, str4, str5, iobyxmoadgVar2, z15, z16, f13);
    }

    public final boolean btonecajqb() {
        return this.f78345cqumvgiudr;
    }

    public final boolean dxjokdxxww() {
        return this.f78346esjtqupxsv;
    }

    public final float eablkybsjg() {
        return this.f78349lereixgezr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f78351zdlpuopuiu, zoijcleaowVar.f78351zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f78350yggfygwlhe, zoijcleaowVar.f78350yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f78348jyumaefscl, zoijcleaowVar.f78348jyumaefscl) && this.f78347iwizpuwonk == zoijcleaowVar.f78347iwizpuwonk && this.f78345cqumvgiudr == zoijcleaowVar.f78345cqumvgiudr && this.f78346esjtqupxsv == zoijcleaowVar.f78346esjtqupxsv && Float.compare(this.f78349lereixgezr, zoijcleaowVar.f78349lereixgezr) == 0;
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f78351zdlpuopuiu;
    }

    public int hashCode() {
        return (((((((((((this.f78351zdlpuopuiu.hashCode() * 31) + this.f78350yggfygwlhe.hashCode()) * 31) + this.f78348jyumaefscl.hashCode()) * 31) + this.f78347iwizpuwonk.hashCode()) * 31) + Boolean.hashCode(this.f78345cqumvgiudr)) * 31) + Boolean.hashCode(this.f78346esjtqupxsv)) * 31) + Float.hashCode(this.f78349lereixgezr);
    }

    public final zoijcleaow iobyxmoadg(String itemId, String icon, String pic, iobyxmoadg shopServiceType, boolean z13, boolean z14, float f13) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(icon, "icon");
        zdlpuopuiu.btonecajqb(pic, "pic");
        zdlpuopuiu.btonecajqb(shopServiceType, "shopServiceType");
        return new zoijcleaow(itemId, icon, pic, shopServiceType, z13, z14, f13);
    }

    public final String lqeggnwhkg() {
        return this.f78348jyumaefscl;
    }

    public final iobyxmoadg nufgyqmvbu() {
        return this.f78347iwizpuwonk;
    }

    public String toString() {
        return "ShopServiceUiModel(itemId=" + this.f78351zdlpuopuiu + ", icon=" + this.f78350yggfygwlhe + ", pic=" + this.f78348jyumaefscl + ", shopServiceType=" + this.f78347iwizpuwonk + ", isChecked=" + this.f78345cqumvgiudr + ", isBlueMarkerColor=" + this.f78346esjtqupxsv + ", flexGrow=" + this.f78349lereixgezr + ")";
    }

    public /* synthetic */ zoijcleaow(String str, String str2, String str3, iobyxmoadg iobyxmoadgVar, boolean z13, boolean z14, float f13, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, str3, (i13 & 8) != 0 ? iobyxmoadg.f78338cqumvgiudr : iobyxmoadgVar, z13, (i13 & 32) != 0 ? false : z14, (i13 & 64) != 0 ? 1.0f : f13);
    }
}
