package np;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wflxmlrfwp {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final int f70490dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f70491eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f70492gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f70493iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f70494lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final int f70495nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f70496ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f70497wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f70498zoijcleaow;

    public wflxmlrfwp(String phoneNumber, String smsCode, boolean z13, boolean z14, boolean z15, String smsRepeatRequestHintText, boolean z16, int i13, int i14) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(smsCode, "smsCode");
        zdlpuopuiu.btonecajqb(smsRepeatRequestHintText, "smsRepeatRequestHintText");
        this.f70493iobyxmoadg = phoneNumber;
        this.f70498zoijcleaow = smsCode;
        this.f70496ppxfxbqfkf = z13;
        this.f70497wkgbmnqykc = z14;
        this.f70491eablkybsjg = z15;
        this.f70492gxszxtbevo = smsRepeatRequestHintText;
        this.f70494lqeggnwhkg = z16;
        this.f70495nufgyqmvbu = i13;
        this.f70490dxjokdxxww = i14;
    }

    public final boolean eablkybsjg() {
        return this.f70496ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wflxmlrfwp)) {
            return false;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
        return zdlpuopuiu.eablkybsjg(this.f70493iobyxmoadg, wflxmlrfwpVar.f70493iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f70498zoijcleaow, wflxmlrfwpVar.f70498zoijcleaow) && this.f70496ppxfxbqfkf == wflxmlrfwpVar.f70496ppxfxbqfkf && this.f70497wkgbmnqykc == wflxmlrfwpVar.f70497wkgbmnqykc && this.f70491eablkybsjg == wflxmlrfwpVar.f70491eablkybsjg && zdlpuopuiu.eablkybsjg(this.f70492gxszxtbevo, wflxmlrfwpVar.f70492gxszxtbevo) && this.f70494lqeggnwhkg == wflxmlrfwpVar.f70494lqeggnwhkg && this.f70495nufgyqmvbu == wflxmlrfwpVar.f70495nufgyqmvbu && this.f70490dxjokdxxww == wflxmlrfwpVar.f70490dxjokdxxww;
    }

    public final boolean gxszxtbevo() {
        return this.f70491eablkybsjg;
    }

    public int hashCode() {
        return (((((((((((((((this.f70493iobyxmoadg.hashCode() * 31) + this.f70498zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f70496ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f70497wkgbmnqykc)) * 31) + Boolean.hashCode(this.f70491eablkybsjg)) * 31) + this.f70492gxszxtbevo.hashCode()) * 31) + Boolean.hashCode(this.f70494lqeggnwhkg)) * 31) + Integer.hashCode(this.f70495nufgyqmvbu)) * 31) + Integer.hashCode(this.f70490dxjokdxxww);
    }

    public final int iobyxmoadg() {
        return this.f70495nufgyqmvbu;
    }

    public final String lqeggnwhkg() {
        return this.f70492gxszxtbevo;
    }

    public final boolean nufgyqmvbu() {
        return this.f70494lqeggnwhkg;
    }

    public final String ppxfxbqfkf() {
        return this.f70493iobyxmoadg;
    }

    public String toString() {
        return "Model(phoneNumber=" + this.f70493iobyxmoadg + ", smsCode=" + this.f70498zoijcleaow + ", smsFieldIsVisible=" + this.f70496ppxfxbqfkf + ", smsErrorIsVisible=" + this.f70497wkgbmnqykc + ", smsRepeatHintIsVisible=" + this.f70491eablkybsjg + ", smsRepeatRequestHintText=" + this.f70492gxszxtbevo + ", smsRepeatRequestIsVisible=" + this.f70494lqeggnwhkg + ", buttonTitleRes=" + this.f70495nufgyqmvbu + ", hintRes=" + this.f70490dxjokdxxww + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f70497wkgbmnqykc;
    }

    public final int zoijcleaow() {
        return this.f70490dxjokdxxww;
    }

    public /* synthetic */ wflxmlrfwp(String str, String str2, boolean z13, boolean z14, boolean z15, String str3, boolean z16, int i13, int i14, int i15, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? "" : str2, (i15 & 4) != 0 ? false : z13, (i15 & 8) != 0 ? false : z14, (i15 & 16) != 0 ? false : z15, (i15 & 32) == 0 ? str3 : "", (i15 & 64) != 0 ? false : z16, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 0 : i13, (i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? i14 : 0);
    }
}
