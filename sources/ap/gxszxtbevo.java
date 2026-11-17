package ap;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f14038iobyxmoadg;

        public eablkybsjg(boolean z13) {
            super(null);
            this.f14038iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f14038iobyxmoadg == ((eablkybsjg) obj).f14038iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f14038iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f14038iobyxmoadg;
        }

        public String toString() {
            return "PhoneNumberErrorChanged(needShowError=" + this.f14038iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ap.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    public static final class C0213gxszxtbevo extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f14039iobyxmoadg;

        public C0213gxszxtbevo(boolean z13) {
            super(null);
            this.f14039iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0213gxszxtbevo) && this.f14039iobyxmoadg == ((C0213gxszxtbevo) obj).f14039iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f14039iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f14039iobyxmoadg;
        }

        public String toString() {
            return "ShowAuthErrorDialog(isVisible=" + this.f14039iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f14040iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            super(null);
            this.f14040iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f14040iobyxmoadg == ((iobyxmoadg) obj).f14040iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f14040iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f14040iobyxmoadg;
        }

        public String toString() {
            return "AgreementErrorChanged(needShowError=" + this.f14040iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f14041iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            super(null);
            this.f14041iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f14041iobyxmoadg == ((ppxfxbqfkf) obj).f14041iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f14041iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f14041iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f14041iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final tzroggbefp f14042iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tzroggbefp phoneNumber) {
            super(null);
            zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
            this.f14042iobyxmoadg = phoneNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f14042iobyxmoadg, ((wkgbmnqykc) obj).f14042iobyxmoadg);
        }

        public int hashCode() {
            return this.f14042iobyxmoadg.hashCode();
        }

        public final tzroggbefp iobyxmoadg() {
            return this.f14042iobyxmoadg;
        }

        public String toString() {
            return "PhoneNumberChanged(phoneNumber=" + this.f14042iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f14043iobyxmoadg;

        public zoijcleaow(boolean z13) {
            super(null);
            this.f14043iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f14043iobyxmoadg == ((zoijcleaow) obj).f14043iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f14043iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f14043iobyxmoadg;
        }

        public String toString() {
            return "CheckboxChanged(isChecked=" + this.f14043iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
