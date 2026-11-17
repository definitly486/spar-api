package ru.myspar.proloyalty.auth.impl.presentation.registration;

import java.util.Date;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public interface ppxfxbqfkf {

    public static final class btonecajqb implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f92653iobyxmoadg;

        public btonecajqb(tzroggbefp lastName) {
            zdlpuopuiu.btonecajqb(lastName, "lastName");
            this.f92653iobyxmoadg = lastName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f92653iobyxmoadg, ((btonecajqb) obj).f92653iobyxmoadg);
        }

        public int hashCode() {
            return this.f92653iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f92653iobyxmoadg;
        }

        public String toString() {
            return "OnLastNameChanged(lastName=" + this.f92653iobyxmoadg + ")";
        }
    }

    public static final class draadjrbmk implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final draadjrbmk f92654iobyxmoadg = new draadjrbmk();

        private draadjrbmk() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof draadjrbmk);
        }

        public int hashCode() {
            return -1128121641;
        }

        public String toString() {
            return "OnRegisterClick";
        }
    }

    public static final class dxjokdxxww implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final lr0.zoijcleaow f92655iobyxmoadg;

        public dxjokdxxww(lr0.zoijcleaow gender) {
            zdlpuopuiu.btonecajqb(gender, "gender");
            this.f92655iobyxmoadg = gender;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof dxjokdxxww) && this.f92655iobyxmoadg == ((dxjokdxxww) obj).f92655iobyxmoadg;
        }

        public int hashCode() {
            return this.f92655iobyxmoadg.hashCode();
        }

        public final lr0.zoijcleaow iobyxmoadg() {
            return this.f92655iobyxmoadg;
        }

        public String toString() {
            return "OnGenderSelected(gender=" + this.f92655iobyxmoadg + ")";
        }
    }

    public static final class eablkybsjg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f92656iobyxmoadg;

        public eablkybsjg(tzroggbefp email) {
            zdlpuopuiu.btonecajqb(email, "email");
            this.f92656iobyxmoadg = email;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f92656iobyxmoadg, ((eablkybsjg) obj).f92656iobyxmoadg);
        }

        public int hashCode() {
            return this.f92656iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f92656iobyxmoadg;
        }

        public String toString() {
            return "OnEmailChanged(email=" + this.f92656iobyxmoadg + ")";
        }
    }

    public static final class gtknphoqwx implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f92657iobyxmoadg;

        public gtknphoqwx(boolean z13) {
            this.f92657iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gtknphoqwx) && this.f92657iobyxmoadg == ((gtknphoqwx) obj).f92657iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f92657iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f92657iobyxmoadg;
        }

        public String toString() {
            return "OnPolicyAcceptChecked(isChecked=" + this.f92657iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f92658iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 1352004865;
        }

        public String toString() {
            return "OnExitDialogFinishClick";
        }
    }

    public static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f92659iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -936495055;
        }

        public String toString() {
            return "OnAboutPrivatePolicyClicked";
        }
    }

    public static final class lqeggnwhkg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f92660iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 1360677371;
        }

        public String toString() {
            return "OnExitDialogStayClick";
        }
    }

    public static final class nufgyqmvbu implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f92661iobyxmoadg;

        public nufgyqmvbu(tzroggbefp firstName) {
            zdlpuopuiu.btonecajqb(firstName, "firstName");
            this.f92661iobyxmoadg = firstName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f92661iobyxmoadg, ((nufgyqmvbu) obj).f92661iobyxmoadg);
        }

        public int hashCode() {
            return this.f92661iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f92661iobyxmoadg;
        }

        public String toString() {
            return "OnFirstNameChanged(firstName=" + this.f92661iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.auth.impl.presentation.registration.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2157ppxfxbqfkf implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Date f92662iobyxmoadg;

        public C2157ppxfxbqfkf(Date selectedDate) {
            zdlpuopuiu.btonecajqb(selectedDate, "selectedDate");
            this.f92662iobyxmoadg = selectedDate;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2157ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f92662iobyxmoadg, ((C2157ppxfxbqfkf) obj).f92662iobyxmoadg);
        }

        public int hashCode() {
            return this.f92662iobyxmoadg.hashCode();
        }

        public final Date iobyxmoadg() {
            return this.f92662iobyxmoadg;
        }

        public String toString() {
            return "OnBirthDateSelected(selectedDate=" + this.f92662iobyxmoadg + ")";
        }
    }

    public static final class wflxmlrfwp implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f92663iobyxmoadg;

        public wflxmlrfwp(boolean z13) {
            this.f92663iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wflxmlrfwp) && this.f92663iobyxmoadg == ((wflxmlrfwp) obj).f92663iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f92663iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f92663iobyxmoadg;
        }

        public String toString() {
            return "OnSharePromoChecked(isChecked=" + this.f92663iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f92664iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -1415378562;
        }

        public String toString() {
            return "OnCloseClick";
        }
    }

    public static final class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f92665iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1047592216;
        }

        public String toString() {
            return "OnBirthDateClicked";
        }
    }
}
