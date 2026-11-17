package ru.myspar.auth.impl.presentation.registration;

import java.util.Date;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class btonecajqb extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84697iobyxmoadg;

        public btonecajqb(String str) {
            super(null);
            this.f84697iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof btonecajqb) && zdlpuopuiu.eablkybsjg(this.f84697iobyxmoadg, ((btonecajqb) obj).f84697iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f84697iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f84697iobyxmoadg;
        }

        public String toString() {
            return "ShowPromoNotValid(errorMessage=" + this.f84697iobyxmoadg + ")";
        }
    }

    public static final class dxjokdxxww extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final dxjokdxxww f84698iobyxmoadg = new dxjokdxxww();

        private dxjokdxxww() {
            super(null);
        }
    }

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84699iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String smsCode) {
            super(null);
            zdlpuopuiu.btonecajqb(smsCode, "smsCode");
            this.f84699iobyxmoadg = smsCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f84699iobyxmoadg, ((eablkybsjg) obj).f84699iobyxmoadg);
        }

        public int hashCode() {
            return this.f84699iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f84699iobyxmoadg;
        }

        public String toString() {
            return "SetSmsCode(smsCode=" + this.f84699iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f84700iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f84700iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f84700iobyxmoadg, ((gxszxtbevo) obj).f84700iobyxmoadg);
        }

        public int hashCode() {
            return this.f84700iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f84700iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f84700iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f84701iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class lqeggnwhkg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f84702iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }
    }

    public static final class nufgyqmvbu extends wkgbmnqykc {
        public abstract CharSequence iobyxmoadg();
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Date f84703iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Date selectedDate) {
            super(null);
            zdlpuopuiu.btonecajqb(selectedDate, "selectedDate");
            this.f84703iobyxmoadg = selectedDate;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f84703iobyxmoadg, ((ppxfxbqfkf) obj).f84703iobyxmoadg);
        }

        public int hashCode() {
            return this.f84703iobyxmoadg.hashCode();
        }

        public final Date iobyxmoadg() {
            return this.f84703iobyxmoadg;
        }

        public String toString() {
            return "OnBirthClicked(selectedDate=" + this.f84703iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.auth.impl.presentation.registration.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1917wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1917wkgbmnqykc f84704iobyxmoadg = new C1917wkgbmnqykc();

        private C1917wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f84705iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String email) {
            super(null);
            zdlpuopuiu.btonecajqb(email, "email");
            this.f84705iobyxmoadg = email;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f84705iobyxmoadg, ((zoijcleaow) obj).f84705iobyxmoadg);
        }

        public int hashCode() {
            return this.f84705iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f84705iobyxmoadg;
        }

        public String toString() {
            return "NavigateToMainScreen(email=" + this.f84705iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
