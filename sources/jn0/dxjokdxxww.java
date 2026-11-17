package jn0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.l;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f51816eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f51817gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f51818iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f51819lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f51820nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f51821ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f51822wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tzroggbefp f51823zoijcleaow;

    public dxjokdxxww(String phoneNumber, tzroggbefp smsCode, boolean z13, boolean z14, String timerValue, boolean z15, boolean z16, boolean z17) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(smsCode, "smsCode");
        zdlpuopuiu.btonecajqb(timerValue, "timerValue");
        this.f51818iobyxmoadg = phoneNumber;
        this.f51823zoijcleaow = smsCode;
        this.f51821ppxfxbqfkf = z13;
        this.f51822wkgbmnqykc = z14;
        this.f51816eablkybsjg = timerValue;
        this.f51817gxszxtbevo = z15;
        this.f51819lqeggnwhkg = z16;
        this.f51820nufgyqmvbu = z17;
    }

    public final boolean dxjokdxxww() {
        return this.f51817gxszxtbevo;
    }

    public final boolean eablkybsjg() {
        return this.f51822wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f51818iobyxmoadg, dxjokdxxwwVar.f51818iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f51823zoijcleaow, dxjokdxxwwVar.f51823zoijcleaow) && this.f51821ppxfxbqfkf == dxjokdxxwwVar.f51821ppxfxbqfkf && this.f51822wkgbmnqykc == dxjokdxxwwVar.f51822wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f51816eablkybsjg, dxjokdxxwwVar.f51816eablkybsjg) && this.f51817gxszxtbevo == dxjokdxxwwVar.f51817gxszxtbevo && this.f51819lqeggnwhkg == dxjokdxxwwVar.f51819lqeggnwhkg && this.f51820nufgyqmvbu == dxjokdxxwwVar.f51820nufgyqmvbu;
    }

    public final String gxszxtbevo() {
        return this.f51816eablkybsjg;
    }

    public int hashCode() {
        return (((((((((((((this.f51818iobyxmoadg.hashCode() * 31) + this.f51823zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f51821ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f51822wkgbmnqykc)) * 31) + this.f51816eablkybsjg.hashCode()) * 31) + Boolean.hashCode(this.f51817gxszxtbevo)) * 31) + Boolean.hashCode(this.f51819lqeggnwhkg)) * 31) + Boolean.hashCode(this.f51820nufgyqmvbu);
    }

    public final dxjokdxxww iobyxmoadg(String phoneNumber, tzroggbefp smsCode, boolean z13, boolean z14, String timerValue, boolean z15, boolean z16, boolean z17) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(smsCode, "smsCode");
        zdlpuopuiu.btonecajqb(timerValue, "timerValue");
        return new dxjokdxxww(phoneNumber, smsCode, z13, z14, timerValue, z15, z16, z17);
    }

    public final boolean lqeggnwhkg() {
        return this.f51819lqeggnwhkg;
    }

    public final boolean nufgyqmvbu() {
        return this.f51820nufgyqmvbu;
    }

    public final String ppxfxbqfkf() {
        return this.f51818iobyxmoadg;
    }

    public String toString() {
        return "Model(phoneNumber=" + this.f51818iobyxmoadg + ", smsCode=" + this.f51823zoijcleaow + ", isSmsInputEnabled=" + this.f51821ppxfxbqfkf + ", smsInputError=" + this.f51822wkgbmnqykc + ", timerValue=" + this.f51816eablkybsjg + ", isResendSmsButtonEnabled=" + this.f51817gxszxtbevo + ", isAcceptButtonEnabled=" + this.f51819lqeggnwhkg + ", isLoading=" + this.f51820nufgyqmvbu + ")";
    }

    public final tzroggbefp wkgbmnqykc() {
        return this.f51823zoijcleaow;
    }

    public /* synthetic */ dxjokdxxww(String str, tzroggbefp tzroggbefpVar, boolean z13, boolean z14, String str2, boolean z15, boolean z16, boolean z17, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null) : tzroggbefpVar, (i13 & 4) != 0 ? true : z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) == 0 ? str2 : "", (i13 & 32) != 0 ? false : z15, (i13 & 64) != 0 ? false : z16, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? z17 : false);
    }
}
