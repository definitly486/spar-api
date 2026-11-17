package f62;

import c52.pmvmpeiblj;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements o00.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final boolean f33010cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f33011cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final String f33012esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final String f33013iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final boolean f33014istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f33015iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f33016jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final String f33017lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final String f33018pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final pmvmpeiblj f33019yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f33020yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f33021zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final String f33022zynmafqrjb;

    public iobyxmoadg(String itemId, String additionalFieldHint, String userName, String phone, String email, String additionalField, String orderNumber, String str, String str2, boolean z13, boolean z14, pmvmpeiblj selectedOrderType, String str3) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(additionalFieldHint, "additionalFieldHint");
        zdlpuopuiu.btonecajqb(userName, "userName");
        zdlpuopuiu.btonecajqb(phone, "phone");
        zdlpuopuiu.btonecajqb(email, "email");
        zdlpuopuiu.btonecajqb(additionalField, "additionalField");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(selectedOrderType, "selectedOrderType");
        this.f33021zdlpuopuiu = itemId;
        this.f33020yggfygwlhe = additionalFieldHint;
        this.f33016jyumaefscl = userName;
        this.f33015iwizpuwonk = phone;
        this.f33011cqumvgiudr = email;
        this.f33012esjtqupxsv = additionalField;
        this.f33017lereixgezr = orderNumber;
        this.f33018pmvmpeiblj = str;
        this.f33022zynmafqrjb = str2;
        this.f33014istkbnxepw = z13;
        this.f33010cdpycssgdh = z14;
        this.f33019yadqdtsiqt = selectedOrderType;
        this.f33013iozdgvuglv = str3;
    }

    private final boolean yggfygwlhe() {
        return this.f33019yadqdtsiqt == pmvmpeiblj.ONLINE && this.f33017lereixgezr.length() > 0;
    }

    private final boolean zdlpuopuiu() {
        return (this.f33019yadqdtsiqt != pmvmpeiblj.IN_STORE || this.f33022zynmafqrjb == null || this.f33013iozdgvuglv == null) ? false : true;
    }

    public final String btonecajqb() {
        return this.f33022zynmafqrjb;
    }

    public final boolean draadjrbmk() {
        return this.f33010cdpycssgdh;
    }

    public final String dxjokdxxww() {
        return this.f33011cqumvgiudr;
    }

    public final String eablkybsjg() {
        return this.f33012esjtqupxsv;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f33021zdlpuopuiu, iobyxmoadgVar.f33021zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f33020yggfygwlhe, iobyxmoadgVar.f33020yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f33016jyumaefscl, iobyxmoadgVar.f33016jyumaefscl) && zdlpuopuiu.eablkybsjg(this.f33015iwizpuwonk, iobyxmoadgVar.f33015iwizpuwonk) && zdlpuopuiu.eablkybsjg(this.f33011cqumvgiudr, iobyxmoadgVar.f33011cqumvgiudr) && zdlpuopuiu.eablkybsjg(this.f33012esjtqupxsv, iobyxmoadgVar.f33012esjtqupxsv) && zdlpuopuiu.eablkybsjg(this.f33017lereixgezr, iobyxmoadgVar.f33017lereixgezr) && zdlpuopuiu.eablkybsjg(this.f33018pmvmpeiblj, iobyxmoadgVar.f33018pmvmpeiblj) && zdlpuopuiu.eablkybsjg(this.f33022zynmafqrjb, iobyxmoadgVar.f33022zynmafqrjb) && this.f33014istkbnxepw == iobyxmoadgVar.f33014istkbnxepw && this.f33010cdpycssgdh == iobyxmoadgVar.f33010cdpycssgdh && this.f33019yadqdtsiqt == iobyxmoadgVar.f33019yadqdtsiqt && zdlpuopuiu.eablkybsjg(this.f33013iozdgvuglv, iobyxmoadgVar.f33013iozdgvuglv);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f33021zdlpuopuiu;
    }

    public final String gtknphoqwx() {
        return this.f33018pmvmpeiblj;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.f33021zdlpuopuiu.hashCode() * 31) + this.f33020yggfygwlhe.hashCode()) * 31) + this.f33016jyumaefscl.hashCode()) * 31) + this.f33015iwizpuwonk.hashCode()) * 31) + this.f33011cqumvgiudr.hashCode()) * 31) + this.f33012esjtqupxsv.hashCode()) * 31) + this.f33017lereixgezr.hashCode()) * 31;
        String str = this.f33018pmvmpeiblj;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f33022zynmafqrjb;
        int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.f33014istkbnxepw)) * 31) + Boolean.hashCode(this.f33010cdpycssgdh)) * 31) + this.f33019yadqdtsiqt.hashCode()) * 31;
        String str3 = this.f33013iozdgvuglv;
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
        return this.f33014istkbnxepw;
    }

    public final String lqeggnwhkg() {
        return this.f33020yggfygwlhe;
    }

    public final boolean nufgyqmvbu() {
        return this.f33016jyumaefscl.length() > 0 && this.f33015iwizpuwonk.length() > 0 && this.f33011cqumvgiudr.length() > 0 && this.f33012esjtqupxsv.length() > 0 && (zdlpuopuiu() || yggfygwlhe());
    }

    public final String ojitshcjhn() {
        return this.f33015iwizpuwonk;
    }

    public final String oxmwwwfdhm() {
        return this.f33016jyumaefscl;
    }

    public final String rgvfuqvkyq() {
        return this.f33013iozdgvuglv;
    }

    public String toString() {
        return "FormUiModel(itemId=" + this.f33021zdlpuopuiu + ", additionalFieldHint=" + this.f33020yggfygwlhe + ", userName=" + this.f33016jyumaefscl + ", phone=" + this.f33015iwizpuwonk + ", email=" + this.f33011cqumvgiudr + ", additionalField=" + this.f33012esjtqupxsv + ", orderNumber=" + this.f33017lereixgezr + ", filename=" + this.f33018pmvmpeiblj + ", file=" + this.f33022zynmafqrjb + ", isButtonEnabled=" + this.f33014istkbnxepw + ", groupOrderTypeVisible=" + this.f33010cdpycssgdh + ", selectedOrderType=" + this.f33019yadqdtsiqt + ", receiptDate=" + this.f33013iozdgvuglv + ")";
    }

    public final pmvmpeiblj vdvldrhtss() {
        return this.f33019yadqdtsiqt;
    }

    public final String wflxmlrfwp() {
        return this.f33017lereixgezr;
    }

    public /* synthetic */ iobyxmoadg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z13, boolean z14, pmvmpeiblj pmvmpeibljVar, String str10, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? "" : str5, (i13 & 32) != 0 ? "" : str6, (i13 & 64) != 0 ? "" : str7, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str8, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : str9, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z13, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z14, (i13 & 2048) != 0 ? pmvmpeiblj.NONE : pmvmpeibljVar, (i13 & 4096) != 0 ? null : str10);
    }
}
