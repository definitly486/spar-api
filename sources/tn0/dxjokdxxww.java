package tn0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.l;
import java.util.Date;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.core.ui.compose.components.text_fields.text_field_with_error_state.InputError;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final boolean f111073btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final boolean f111074draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final lr0.zoijcleaow f111075dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final InputError f111076eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final boolean f111077gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final tzroggbefp f111078gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f111079iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final InputError f111080lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Date f111081nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final InputError f111082ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final boolean f111083wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final tzroggbefp f111084wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tzroggbefp f111085zoijcleaow;

    public dxjokdxxww(boolean z13, tzroggbefp email, InputError inputError, tzroggbefp firstName, InputError inputError2, tzroggbefp lastName, InputError inputError3, Date date, lr0.zoijcleaow gender, boolean z14, boolean z15, boolean z16, boolean z17) {
        zdlpuopuiu.btonecajqb(email, "email");
        zdlpuopuiu.btonecajqb(firstName, "firstName");
        zdlpuopuiu.btonecajqb(lastName, "lastName");
        zdlpuopuiu.btonecajqb(gender, "gender");
        this.f111079iobyxmoadg = z13;
        this.f111085zoijcleaow = email;
        this.f111082ppxfxbqfkf = inputError;
        this.f111084wkgbmnqykc = firstName;
        this.f111076eablkybsjg = inputError2;
        this.f111078gxszxtbevo = lastName;
        this.f111080lqeggnwhkg = inputError3;
        this.f111081nufgyqmvbu = date;
        this.f111075dxjokdxxww = gender;
        this.f111073btonecajqb = z14;
        this.f111077gtknphoqwx = z15;
        this.f111074draadjrbmk = z16;
        this.f111083wflxmlrfwp = z17;
    }

    public final boolean btonecajqb() {
        return this.f111077gtknphoqwx;
    }

    public final boolean draadjrbmk() {
        return this.f111083wflxmlrfwp;
    }

    public final boolean dxjokdxxww() {
        return this.f111074draadjrbmk;
    }

    public final InputError eablkybsjg() {
        return this.f111076eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return this.f111079iobyxmoadg == dxjokdxxwwVar.f111079iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f111085zoijcleaow, dxjokdxxwwVar.f111085zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f111082ppxfxbqfkf, dxjokdxxwwVar.f111082ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f111084wkgbmnqykc, dxjokdxxwwVar.f111084wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f111076eablkybsjg, dxjokdxxwwVar.f111076eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f111078gxszxtbevo, dxjokdxxwwVar.f111078gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f111080lqeggnwhkg, dxjokdxxwwVar.f111080lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f111081nufgyqmvbu, dxjokdxxwwVar.f111081nufgyqmvbu) && this.f111075dxjokdxxww == dxjokdxxwwVar.f111075dxjokdxxww && this.f111073btonecajqb == dxjokdxxwwVar.f111073btonecajqb && this.f111077gtknphoqwx == dxjokdxxwwVar.f111077gtknphoqwx && this.f111074draadjrbmk == dxjokdxxwwVar.f111074draadjrbmk && this.f111083wflxmlrfwp == dxjokdxxwwVar.f111083wflxmlrfwp;
    }

    public final boolean gtknphoqwx() {
        return this.f111079iobyxmoadg;
    }

    public final lr0.zoijcleaow gxszxtbevo() {
        return this.f111075dxjokdxxww;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f111079iobyxmoadg) * 31) + this.f111085zoijcleaow.hashCode()) * 31;
        InputError inputError = this.f111082ppxfxbqfkf;
        int iHashCode2 = (((iHashCode + (inputError == null ? 0 : inputError.hashCode())) * 31) + this.f111084wkgbmnqykc.hashCode()) * 31;
        InputError inputError2 = this.f111076eablkybsjg;
        int iHashCode3 = (((iHashCode2 + (inputError2 == null ? 0 : inputError2.hashCode())) * 31) + this.f111078gxszxtbevo.hashCode()) * 31;
        InputError inputError3 = this.f111080lqeggnwhkg;
        int iHashCode4 = (iHashCode3 + (inputError3 == null ? 0 : inputError3.hashCode())) * 31;
        Date date = this.f111081nufgyqmvbu;
        return ((((((((((iHashCode4 + (date != null ? date.hashCode() : 0)) * 31) + this.f111075dxjokdxxww.hashCode()) * 31) + Boolean.hashCode(this.f111073btonecajqb)) * 31) + Boolean.hashCode(this.f111077gtknphoqwx)) * 31) + Boolean.hashCode(this.f111074draadjrbmk)) * 31) + Boolean.hashCode(this.f111083wflxmlrfwp);
    }

    public final Date iobyxmoadg() {
        return this.f111081nufgyqmvbu;
    }

    public final tzroggbefp lqeggnwhkg() {
        return this.f111078gxszxtbevo;
    }

    public final InputError nufgyqmvbu() {
        return this.f111080lqeggnwhkg;
    }

    public final InputError ppxfxbqfkf() {
        return this.f111082ppxfxbqfkf;
    }

    public String toString() {
        return "Model(isLoading=" + this.f111079iobyxmoadg + ", email=" + this.f111085zoijcleaow + ", emailError=" + this.f111082ppxfxbqfkf + ", firstName=" + this.f111084wkgbmnqykc + ", firstNameError=" + this.f111076eablkybsjg + ", lastName=" + this.f111078gxszxtbevo + ", lastNameError=" + this.f111080lqeggnwhkg + ", dateOfBirth=" + this.f111081nufgyqmvbu + ", gender=" + this.f111075dxjokdxxww + ", isSharePromoChecked=" + this.f111073btonecajqb + ", isAcceptPrivacyPolicyChecked=" + this.f111077gtknphoqwx + ", showExitDialog=" + this.f111074draadjrbmk + ", isRegisterButtonEnabled=" + this.f111083wflxmlrfwp + ")";
    }

    public final boolean wflxmlrfwp() {
        return this.f111073btonecajqb;
    }

    public final tzroggbefp wkgbmnqykc() {
        return this.f111084wkgbmnqykc;
    }

    public final tzroggbefp zoijcleaow() {
        return this.f111085zoijcleaow;
    }

    public /* synthetic */ dxjokdxxww(boolean z13, tzroggbefp tzroggbefpVar, InputError inputError, tzroggbefp tzroggbefpVar2, InputError inputError2, tzroggbefp tzroggbefpVar3, InputError inputError3, Date date, lr0.zoijcleaow zoijcleaowVar, boolean z14, boolean z15, boolean z16, boolean z17, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null) : tzroggbefpVar, (i13 & 4) != 0 ? null : inputError, (i13 & 8) != 0 ? new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null) : tzroggbefpVar2, (i13 & 16) != 0 ? null : inputError2, (i13 & 32) != 0 ? new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null) : tzroggbefpVar3, (i13 & 64) != 0 ? null : inputError3, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? date : null, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? lr0.zoijcleaow.NONE : zoijcleaowVar, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z14, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z15, (i13 & 2048) != 0 ? false : z16, (i13 & 4096) == 0 ? z17 : false);
    }
}
