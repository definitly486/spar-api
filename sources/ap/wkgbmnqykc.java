package ap;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f14056iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -2139502377;
        }

        public String toString() {
            return "OnDialogRegisterClick";
        }
    }

    public static final class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f14057iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 1404470759;
        }

        public String toString() {
            return "OnLegalInfoClick";
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f14058iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1085911557;
        }

        public String toString() {
            return "OnBackClick";
        }
    }

    public static final class lqeggnwhkg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f14059iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(tzroggbefp phoneNumber) {
            super(null);
            zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
            this.f14059iobyxmoadg = phoneNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f14059iobyxmoadg, ((lqeggnwhkg) obj).f14059iobyxmoadg);
        }

        public int hashCode() {
            return this.f14059iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f14059iobyxmoadg;
        }

        public String toString() {
            return "OnPhoneNumberChanged(phoneNumber=" + this.f14059iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f14060iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1679171269;
        }

        public String toString() {
            return "OnContinueClick";
        }
    }

    /* JADX INFO: renamed from: ap.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C0215wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0215wkgbmnqykc f14061iobyxmoadg = new C0215wkgbmnqykc();

        private C0215wkgbmnqykc() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0215wkgbmnqykc);
        }

        public int hashCode() {
            return 1127775200;
        }

        public String toString() {
            return "OnDialogCancelClick";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f14062iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f14062iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f14062iobyxmoadg == ((zoijcleaow) obj).f14062iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f14062iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f14062iobyxmoadg;
        }

        public String toString() {
            return "OnCheckboxChanged(isChecked=" + this.f14062iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
