package in0;

import java.util.Date;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.core.ui.compose.components.text_fields.text_field_with_error_state.InputError;
import ru.myspar.proloyalty.user.domain.model.TokenInfo;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class btonecajqb implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f45005iobyxmoadg;

        public btonecajqb(boolean z13) {
            this.f45005iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && this.f45005iobyxmoadg == ((btonecajqb) obj).f45005iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f45005iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f45005iobyxmoadg;
        }

        public String toString() {
            return "ShowExitDialog(showExitDialog=" + this.f45005iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f45006iobyxmoadg;

        public dxjokdxxww(boolean z13) {
            this.f45006iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && this.f45006iobyxmoadg == ((dxjokdxxww) obj).f45006iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f45006iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f45006iobyxmoadg;
        }

        public String toString() {
            return "SharePromoChecked(promo=" + this.f45006iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final lr0.zoijcleaow f45007iobyxmoadg;

        public eablkybsjg(lr0.zoijcleaow gender) {
            zdlpuopuiu.btonecajqb(gender, "gender");
            this.f45007iobyxmoadg = gender;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f45007iobyxmoadg == ((eablkybsjg) obj).f45007iobyxmoadg;
        }

        public int hashCode() {
            return this.f45007iobyxmoadg.hashCode();
        }

        public final lr0.zoijcleaow iobyxmoadg() {
            return this.f45007iobyxmoadg;
        }

        public String toString() {
            return "GenderChanged(gender=" + this.f45007iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final TokenInfo f45008iobyxmoadg;

        public gtknphoqwx(TokenInfo tokenInfo) {
            zdlpuopuiu.btonecajqb(tokenInfo, "tokenInfo");
            this.f45008iobyxmoadg = tokenInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && zdlpuopuiu.eablkybsjg(this.f45008iobyxmoadg, ((gtknphoqwx) obj).f45008iobyxmoadg);
        }

        public int hashCode() {
            return this.f45008iobyxmoadg.hashCode();
        }

        public final TokenInfo iobyxmoadg() {
            return this.f45008iobyxmoadg;
        }

        public String toString() {
            return "UpdateTokenInfo(tokenInfo=" + this.f45008iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: in0.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C1043gxszxtbevo implements gxszxtbevo {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f45009ppxfxbqfkf = InputError.f95345zdlpuopuiu;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f45010iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final InputError f45011zoijcleaow;

        public C1043gxszxtbevo(tzroggbefp lastName, InputError inputError) {
            zdlpuopuiu.btonecajqb(lastName, "lastName");
            this.f45010iobyxmoadg = lastName;
            this.f45011zoijcleaow = inputError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1043gxszxtbevo)) {
                return false;
            }
            C1043gxszxtbevo c1043gxszxtbevo = (C1043gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f45010iobyxmoadg, c1043gxszxtbevo.f45010iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f45011zoijcleaow, c1043gxszxtbevo.f45011zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f45010iobyxmoadg.hashCode() * 31;
            InputError inputError = this.f45011zoijcleaow;
            return iHashCode + (inputError == null ? 0 : inputError.hashCode());
        }

        public final InputError iobyxmoadg() {
            return this.f45011zoijcleaow;
        }

        public String toString() {
            return "LastNameChanged(lastName=" + this.f45010iobyxmoadg + ", error=" + this.f45011zoijcleaow + ")";
        }

        public final tzroggbefp zoijcleaow() {
            return this.f45010iobyxmoadg;
        }
    }

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Date f45012iobyxmoadg;

        public iobyxmoadg(Date date) {
            zdlpuopuiu.btonecajqb(date, "date");
            this.f45012iobyxmoadg = date;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f45012iobyxmoadg, ((iobyxmoadg) obj).f45012iobyxmoadg);
        }

        public int hashCode() {
            return this.f45012iobyxmoadg.hashCode();
        }

        public final Date iobyxmoadg() {
            return this.f45012iobyxmoadg;
        }

        public String toString() {
            return "BirthDateChanged(date=" + this.f45012iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f45013iobyxmoadg;

        public lqeggnwhkg(boolean z13) {
            this.f45013iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && this.f45013iobyxmoadg == ((lqeggnwhkg) obj).f45013iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f45013iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f45013iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f45013iobyxmoadg + ")";
        }
    }

    public static final class nufgyqmvbu implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f45014iobyxmoadg;

        public nufgyqmvbu(boolean z13) {
            this.f45014iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && this.f45014iobyxmoadg == ((nufgyqmvbu) obj).f45014iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f45014iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f45014iobyxmoadg;
        }

        public String toString() {
            return "PolicyAcceptChecked(isPolicyAccepted=" + this.f45014iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f45015zoijcleaow = InputError.f95345zdlpuopuiu;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final InputError f45016iobyxmoadg;

        public ppxfxbqfkf(InputError error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f45016iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f45016iobyxmoadg, ((ppxfxbqfkf) obj).f45016iobyxmoadg);
        }

        public int hashCode() {
            return this.f45016iobyxmoadg.hashCode();
        }

        public final InputError iobyxmoadg() {
            return this.f45016iobyxmoadg;
        }

        public String toString() {
            return "EmailExistsError(error=" + this.f45016iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements gxszxtbevo {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f45017ppxfxbqfkf = InputError.f95345zdlpuopuiu;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f45018iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final InputError f45019zoijcleaow;

        public wkgbmnqykc(tzroggbefp firstName, InputError inputError) {
            zdlpuopuiu.btonecajqb(firstName, "firstName");
            this.f45018iobyxmoadg = firstName;
            this.f45019zoijcleaow = inputError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f45018iobyxmoadg, wkgbmnqykcVar.f45018iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f45019zoijcleaow, wkgbmnqykcVar.f45019zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f45018iobyxmoadg.hashCode() * 31;
            InputError inputError = this.f45019zoijcleaow;
            return iHashCode + (inputError == null ? 0 : inputError.hashCode());
        }

        public final InputError iobyxmoadg() {
            return this.f45019zoijcleaow;
        }

        public String toString() {
            return "FirstNameChanged(firstName=" + this.f45018iobyxmoadg + ", error=" + this.f45019zoijcleaow + ")";
        }

        public final tzroggbefp zoijcleaow() {
            return this.f45018iobyxmoadg;
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f45020ppxfxbqfkf = InputError.f95345zdlpuopuiu;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f45021iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final InputError f45022zoijcleaow;

        public zoijcleaow(tzroggbefp email, InputError inputError) {
            zdlpuopuiu.btonecajqb(email, "email");
            this.f45021iobyxmoadg = email;
            this.f45022zoijcleaow = inputError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f45021iobyxmoadg, zoijcleaowVar.f45021iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f45022zoijcleaow, zoijcleaowVar.f45022zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f45021iobyxmoadg.hashCode() * 31;
            InputError inputError = this.f45022zoijcleaow;
            return iHashCode + (inputError == null ? 0 : inputError.hashCode());
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f45021iobyxmoadg;
        }

        public String toString() {
            return "EmailChanged(email=" + this.f45021iobyxmoadg + ", error=" + this.f45022zoijcleaow + ")";
        }

        public final InputError zoijcleaow() {
            return this.f45022zoijcleaow;
        }
    }
}
