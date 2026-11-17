package m91;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import k21.ojitshcjhn;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu implements b21.ppxfxbqfkf {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final int f66617istkbnxepw = 0;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final ojitshcjhn f66618cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final String f66619esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f66620iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f66621jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final zoijcleaow f66622lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final String f66623pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f66624yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f66625zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final iobyxmoadg f66626zynmafqrjb;

    public nufgyqmvbu(String id2, String str, int i13, String str2, ojitshcjhn navigationLink, String reference, zoijcleaow badge, String itemId, iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(navigationLink, "navigationLink");
        zdlpuopuiu.btonecajqb(reference, "reference");
        zdlpuopuiu.btonecajqb(badge, "badge");
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        this.f66625zdlpuopuiu = id2;
        this.f66624yggfygwlhe = str;
        this.f66621jyumaefscl = i13;
        this.f66620iwizpuwonk = str2;
        this.f66618cqumvgiudr = navigationLink;
        this.f66619esjtqupxsv = reference;
        this.f66622lereixgezr = badge;
        this.f66623pmvmpeiblj = itemId;
        this.f66626zynmafqrjb = iobyxmoadgVar;
    }

    public final String btonecajqb() {
        return this.f66619esjtqupxsv;
    }

    public final ojitshcjhn dxjokdxxww() {
        return this.f66618cqumvgiudr;
    }

    public final iobyxmoadg eablkybsjg() {
        return this.f66626zynmafqrjb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f66625zdlpuopuiu, nufgyqmvbuVar.f66625zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f66624yggfygwlhe, nufgyqmvbuVar.f66624yggfygwlhe) && this.f66621jyumaefscl == nufgyqmvbuVar.f66621jyumaefscl && zdlpuopuiu.eablkybsjg(this.f66620iwizpuwonk, nufgyqmvbuVar.f66620iwizpuwonk) && this.f66618cqumvgiudr == nufgyqmvbuVar.f66618cqumvgiudr && zdlpuopuiu.eablkybsjg(this.f66619esjtqupxsv, nufgyqmvbuVar.f66619esjtqupxsv) && zdlpuopuiu.eablkybsjg(this.f66622lereixgezr, nufgyqmvbuVar.f66622lereixgezr) && zdlpuopuiu.eablkybsjg(this.f66623pmvmpeiblj, nufgyqmvbuVar.f66623pmvmpeiblj) && zdlpuopuiu.eablkybsjg(this.f66626zynmafqrjb, nufgyqmvbuVar.f66626zynmafqrjb);
    }

    public final String getId() {
        return this.f66625zdlpuopuiu;
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f66623pmvmpeiblj;
    }

    public final String gtknphoqwx() {
        return this.f66620iwizpuwonk;
    }

    public int hashCode() {
        int iHashCode = this.f66625zdlpuopuiu.hashCode() * 31;
        String str = this.f66624yggfygwlhe;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f66621jyumaefscl)) * 31;
        String str2 = this.f66620iwizpuwonk;
        int iHashCode3 = (((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f66618cqumvgiudr.hashCode()) * 31) + this.f66619esjtqupxsv.hashCode()) * 31) + this.f66622lereixgezr.hashCode()) * 31) + this.f66623pmvmpeiblj.hashCode()) * 31;
        iobyxmoadg iobyxmoadgVar = this.f66626zynmafqrjb;
        return iHashCode3 + (iobyxmoadgVar != null ? iobyxmoadgVar.hashCode() : 0);
    }

    public final nufgyqmvbu iobyxmoadg(String id2, String str, int i13, String str2, ojitshcjhn navigationLink, String reference, zoijcleaow badge, String itemId, iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(navigationLink, "navigationLink");
        zdlpuopuiu.btonecajqb(reference, "reference");
        zdlpuopuiu.btonecajqb(badge, "badge");
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        return new nufgyqmvbu(id2, str, i13, str2, navigationLink, reference, badge, itemId, iobyxmoadgVar);
    }

    public final zoijcleaow lqeggnwhkg() {
        return this.f66622lereixgezr;
    }

    public final String nufgyqmvbu() {
        return this.f66624yggfygwlhe;
    }

    public String toString() {
        return "FeatureUiModel(id=" + this.f66625zdlpuopuiu + ", imageUrl=" + this.f66624yggfygwlhe + ", sort=" + this.f66621jyumaefscl + ", title=" + this.f66620iwizpuwonk + ", navigationLink=" + this.f66618cqumvgiudr + ", reference=" + this.f66619esjtqupxsv + ", badge=" + this.f66622lereixgezr + ", itemId=" + this.f66623pmvmpeiblj + ", analyticsData=" + this.f66626zynmafqrjb + ")";
    }

    public /* synthetic */ nufgyqmvbu(String str, String str2, int i13, String str3, ojitshcjhn ojitshcjhnVar, String str4, zoijcleaow zoijcleaowVar, String str5, iobyxmoadg iobyxmoadgVar, int i14, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, i13, str3, ojitshcjhnVar, str4, zoijcleaowVar, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? str : str5, iobyxmoadgVar);
    }
}
