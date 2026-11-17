package nb0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo implements w30.ppxfxbqfkf {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final int f69518istkbnxepw = 0;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final f40.zoijcleaow f69519cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final String f69520esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f69521iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f69522jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final zoijcleaow f69523lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final String f69524pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f69525yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f69526zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final iobyxmoadg f69527zynmafqrjb;

    public gxszxtbevo(String id2, String str, int i13, String str2, f40.zoijcleaow navigationLink, String reference, zoijcleaow badge, String itemId, iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(navigationLink, "navigationLink");
        zdlpuopuiu.btonecajqb(reference, "reference");
        zdlpuopuiu.btonecajqb(badge, "badge");
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        this.f69526zdlpuopuiu = id2;
        this.f69525yggfygwlhe = str;
        this.f69522jyumaefscl = i13;
        this.f69521iwizpuwonk = str2;
        this.f69519cqumvgiudr = navigationLink;
        this.f69520esjtqupxsv = reference;
        this.f69523lereixgezr = badge;
        this.f69524pmvmpeiblj = itemId;
        this.f69527zynmafqrjb = iobyxmoadgVar;
    }

    public final String btonecajqb() {
        return this.f69520esjtqupxsv;
    }

    public final f40.zoijcleaow dxjokdxxww() {
        return this.f69519cqumvgiudr;
    }

    public final iobyxmoadg eablkybsjg() {
        return this.f69527zynmafqrjb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f69526zdlpuopuiu, gxszxtbevoVar.f69526zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f69525yggfygwlhe, gxszxtbevoVar.f69525yggfygwlhe) && this.f69522jyumaefscl == gxszxtbevoVar.f69522jyumaefscl && zdlpuopuiu.eablkybsjg(this.f69521iwizpuwonk, gxszxtbevoVar.f69521iwizpuwonk) && this.f69519cqumvgiudr == gxszxtbevoVar.f69519cqumvgiudr && zdlpuopuiu.eablkybsjg(this.f69520esjtqupxsv, gxszxtbevoVar.f69520esjtqupxsv) && zdlpuopuiu.eablkybsjg(this.f69523lereixgezr, gxszxtbevoVar.f69523lereixgezr) && zdlpuopuiu.eablkybsjg(this.f69524pmvmpeiblj, gxszxtbevoVar.f69524pmvmpeiblj) && zdlpuopuiu.eablkybsjg(this.f69527zynmafqrjb, gxszxtbevoVar.f69527zynmafqrjb);
    }

    public final String getId() {
        return this.f69526zdlpuopuiu;
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f69524pmvmpeiblj;
    }

    public final String gtknphoqwx() {
        return this.f69521iwizpuwonk;
    }

    public int hashCode() {
        int iHashCode = this.f69526zdlpuopuiu.hashCode() * 31;
        String str = this.f69525yggfygwlhe;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f69522jyumaefscl)) * 31;
        String str2 = this.f69521iwizpuwonk;
        int iHashCode3 = (((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f69519cqumvgiudr.hashCode()) * 31) + this.f69520esjtqupxsv.hashCode()) * 31) + this.f69523lereixgezr.hashCode()) * 31) + this.f69524pmvmpeiblj.hashCode()) * 31;
        iobyxmoadg iobyxmoadgVar = this.f69527zynmafqrjb;
        return iHashCode3 + (iobyxmoadgVar != null ? iobyxmoadgVar.hashCode() : 0);
    }

    public final gxszxtbevo iobyxmoadg(String id2, String str, int i13, String str2, f40.zoijcleaow navigationLink, String reference, zoijcleaow badge, String itemId, iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(navigationLink, "navigationLink");
        zdlpuopuiu.btonecajqb(reference, "reference");
        zdlpuopuiu.btonecajqb(badge, "badge");
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        return new gxszxtbevo(id2, str, i13, str2, navigationLink, reference, badge, itemId, iobyxmoadgVar);
    }

    public final zoijcleaow lqeggnwhkg() {
        return this.f69523lereixgezr;
    }

    public final String nufgyqmvbu() {
        return this.f69525yggfygwlhe;
    }

    public String toString() {
        return "FeatureUiModel(id=" + this.f69526zdlpuopuiu + ", imageUrl=" + this.f69525yggfygwlhe + ", sort=" + this.f69522jyumaefscl + ", title=" + this.f69521iwizpuwonk + ", navigationLink=" + this.f69519cqumvgiudr + ", reference=" + this.f69520esjtqupxsv + ", badge=" + this.f69523lereixgezr + ", itemId=" + this.f69524pmvmpeiblj + ", analyticsData=" + this.f69527zynmafqrjb + ")";
    }

    public /* synthetic */ gxszxtbevo(String str, String str2, int i13, String str3, f40.zoijcleaow zoijcleaowVar, String str4, zoijcleaow zoijcleaowVar2, String str5, iobyxmoadg iobyxmoadgVar, int i14, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, i13, str3, zoijcleaowVar, str4, zoijcleaowVar2, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? str : str5, iobyxmoadgVar);
    }
}
