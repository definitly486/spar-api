package yr1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import vq1.pmvmpeiblj;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements gz0.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final boolean f126301cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f126302cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final String f126303esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final String f126304iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final boolean f126305istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f126306iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f126307jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final String f126308lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final String f126309pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final pmvmpeiblj f126310yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f126311yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f126312zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final String f126313zynmafqrjb;

    public iobyxmoadg(String itemId, String additionalFieldHint, String userName, String phone, String email, String additionalField, String orderNumber, String str, String str2, boolean z13, boolean z14, pmvmpeiblj selectedOrderType, String str3) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(additionalFieldHint, "additionalFieldHint");
        zdlpuopuiu.btonecajqb(userName, "userName");
        zdlpuopuiu.btonecajqb(phone, "phone");
        zdlpuopuiu.btonecajqb(email, "email");
        zdlpuopuiu.btonecajqb(additionalField, "additionalField");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(selectedOrderType, "selectedOrderType");
        this.f126312zdlpuopuiu = itemId;
        this.f126311yggfygwlhe = additionalFieldHint;
        this.f126307jyumaefscl = userName;
        this.f126306iwizpuwonk = phone;
        this.f126302cqumvgiudr = email;
        this.f126303esjtqupxsv = additionalField;
        this.f126308lereixgezr = orderNumber;
        this.f126309pmvmpeiblj = str;
        this.f126313zynmafqrjb = str2;
        this.f126305istkbnxepw = z13;
        this.f126301cdpycssgdh = z14;
        this.f126310yadqdtsiqt = selectedOrderType;
        this.f126304iozdgvuglv = str3;
    }

    private final boolean yggfygwlhe() {
        return this.f126310yadqdtsiqt == pmvmpeiblj.ONLINE && this.f126308lereixgezr.length() > 0;
    }

    private final boolean zdlpuopuiu() {
        return (this.f126310yadqdtsiqt != pmvmpeiblj.IN_STORE || this.f126313zynmafqrjb == null || this.f126304iozdgvuglv == null) ? false : true;
    }

    public final String btonecajqb() {
        return this.f126313zynmafqrjb;
    }

    public final boolean draadjrbmk() {
        return this.f126301cdpycssgdh;
    }

    public final String dxjokdxxww() {
        return this.f126302cqumvgiudr;
    }

    public final String eablkybsjg() {
        return this.f126303esjtqupxsv;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f126312zdlpuopuiu, iobyxmoadgVar.f126312zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f126311yggfygwlhe, iobyxmoadgVar.f126311yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f126307jyumaefscl, iobyxmoadgVar.f126307jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f126306iwizpuwonk, iobyxmoadgVar.f126306iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f126302cqumvgiudr, iobyxmoadgVar.f126302cqumvgiudr) && zdlpuopuiu.eablkybsjg(this.f126303esjtqupxsv, iobyxmoadgVar.f126303esjtqupxsv) && zdlpuopuiu.eablkybsjg(this.f126308lereixgezr, iobyxmoadgVar.f126308lereixgezr) && zdlpuopuiu.eablkybsjg(this.f126309pmvmpeiblj, iobyxmoadgVar.f126309pmvmpeiblj) && zdlpuopuiu.eablkybsjg(this.f126313zynmafqrjb, iobyxmoadgVar.f126313zynmafqrjb) && this.f126305istkbnxepw == iobyxmoadgVar.f126305istkbnxepw && this.f126301cdpycssgdh == iobyxmoadgVar.f126301cdpycssgdh && this.f126310yadqdtsiqt == iobyxmoadgVar.f126310yadqdtsiqt && zdlpuopuiu.eablkybsjg(this.f126304iozdgvuglv, iobyxmoadgVar.f126304iozdgvuglv);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f126312zdlpuopuiu;
    }

    public final String gtknphoqwx() {
        return this.f126309pmvmpeiblj;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.f126312zdlpuopuiu.hashCode() * 31) + this.f126311yggfygwlhe.hashCode()) * 31) + this.f126307jyumaefscl.hashCode()) * 31) + this.f126306iwizpuwonk.hashCode()) * 31) + this.f126302cqumvgiudr.hashCode()) * 31) + this.f126303esjtqupxsv.hashCode()) * 31) + this.f126308lereixgezr.hashCode()) * 31;
        String str = this.f126309pmvmpeiblj;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f126313zynmafqrjb;
        int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.f126305istkbnxepw)) * 31) + Boolean.hashCode(this.f126301cdpycssgdh)) * 31) + this.f126310yadqdtsiqt.hashCode()) * 31;
        String str3 = this.f126304iozdgvuglv;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final iobyxmoadg iobyxmoadg(String itemId, String additionalFieldHint, String userName, String phone, String email, String additionalField, String orderNumber, String str, String str2, boolean z13, boolean z14, pmvmpeiblj selectedOrderType, String str3) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(additionalFieldHint, "additionalFieldHint");
        zdlpuopuiu.btonecajqb(userName, "userName");
        zdlpuopuiu.btonecajqb(phone, "phone");
        zdlpuopuiu.btonecajqb(email, "email");
        zdlpuopuiu.btonecajqb(additionalField, "additionalField");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(selectedOrderType, "selectedOrderType");
        return new iobyxmoadg(itemId, additionalFieldHint, userName, phone, email, additionalField, orderNumber, str, str2, z13, z14, selectedOrderType, str3);
    }

    public final boolean kcexrzcfyt() {
        return this.f126305istkbnxepw;
    }

    public final String lqeggnwhkg() {
        return this.f126311yggfygwlhe;
    }

    public final boolean nufgyqmvbu() {
        return this.f126307jyumaefscl.length() > 0 && this.f126306iwizpuwonk.length() > 0 && this.f126302cqumvgiudr.length() > 0 && this.f126303esjtqupxsv.length() > 0 && (zdlpuopuiu() || yggfygwlhe());
    }

    public final String ojitshcjhn() {
        return this.f126306iwizpuwonk;
    }

    public final String oxmwwwfdhm() {
        return this.f126307jyumaefscl;
    }

    public final String rgvfuqvkyq() {
        return this.f126304iozdgvuglv;
    }

    public String toString() {
        return "FormUiModel(itemId=" + this.f126312zdlpuopuiu + ", additionalFieldHint=" + this.f126311yggfygwlhe + ", userName=" + this.f126307jyumaefscl + ", phone=" + this.f126306iwizpuwonk + ", email=" + this.f126302cqumvgiudr + ", additionalField=" + this.f126303esjtqupxsv + ", orderNumber=" + this.f126308lereixgezr + ", filename=" + this.f126309pmvmpeiblj + ", file=" + this.f126313zynmafqrjb + ", isButtonEnabled=" + this.f126305istkbnxepw + ", groupOrderTypeVisible=" + this.f126301cdpycssgdh + ", selectedOrderType=" + this.f126310yadqdtsiqt + ", receiptDate=" + this.f126304iozdgvuglv + ")";
    }

    public final pmvmpeiblj vdvldrhtss() {
        return this.f126310yadqdtsiqt;
    }

    public final String wflxmlrfwp() {
        return this.f126308lereixgezr;
    }

    public /* synthetic */ iobyxmoadg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z13, boolean z14, pmvmpeiblj pmvmpeibljVar, String str10, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? "" : str5, (i13 & 32) != 0 ? "" : str6, (i13 & 64) != 0 ? "" : str7, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str8, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : str9, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z13, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z14, (i13 & 2048) != 0 ? pmvmpeiblj.NONE : pmvmpeibljVar, (i13 & 4096) != 0 ? null : str10);
    }
}
