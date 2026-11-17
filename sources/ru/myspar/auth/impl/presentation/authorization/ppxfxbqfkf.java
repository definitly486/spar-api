package ru.myspar.auth.impl.presentation.authorization;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {

    public static final class eablkybsjg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f84556iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return 1202541634;
        }

        public String toString() {
            return "OnDialogRegisterClick";
        }
    }

    public static final class gxszxtbevo extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f84557iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 665731996;
        }

        public String toString() {
            return "OnLegalInfoClick";
        }
    }

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f84558iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1145180966;
        }

        public String toString() {
            return "OnBackClick";
        }
    }

    public static final class lqeggnwhkg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f84559iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(tzroggbefp phoneNumber) {
            super(null);
            zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
            this.f84559iobyxmoadg = phoneNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f84559iobyxmoadg, ((lqeggnwhkg) obj).f84559iobyxmoadg);
        }

        public int hashCode() {
            return this.f84559iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f84559iobyxmoadg;
        }

        public String toString() {
            return "OnPhoneNumberChanged(phoneNumber=" + this.f84559iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.auth.impl.presentation.authorization.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C1912ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1912ppxfxbqfkf f84560iobyxmoadg = new C1912ppxfxbqfkf();

        private C1912ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1912ppxfxbqfkf);
        }

        public int hashCode() {
            return 98113766;
        }

        public String toString() {
            return "OnContinueClick";
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final wkgbmnqykc f84561iobyxmoadg = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 773711371;
        }

        public String toString() {
            return "OnDialogCancelClick";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f84562iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f84562iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f84562iobyxmoadg == ((zoijcleaow) obj).f84562iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f84562iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f84562iobyxmoadg;
        }

        public String toString() {
            return "OnCheckboxChanged(isChecked=" + this.f84562iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
