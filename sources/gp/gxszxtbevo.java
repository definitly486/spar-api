package gp;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f38136iobyxmoadg;

        public eablkybsjg(boolean z13) {
            super(null);
            this.f38136iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && this.f38136iobyxmoadg == ((eablkybsjg) obj).f38136iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f38136iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f38136iobyxmoadg;
        }

        public String toString() {
            return "PhoneNumberErrorVisibilityChanged(isVisible=" + this.f38136iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f38137iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String email) {
            super(null);
            zdlpuopuiu.btonecajqb(email, "email");
            this.f38137iobyxmoadg = email;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f38137iobyxmoadg, ((iobyxmoadg) obj).f38137iobyxmoadg);
        }

        public int hashCode() {
            return this.f38137iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f38137iobyxmoadg;
        }

        public String toString() {
            return "EmailChanged(email=" + this.f38137iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f38138iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            super(null);
            this.f38138iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f38138iobyxmoadg == ((ppxfxbqfkf) obj).f38138iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f38138iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f38138iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f38138iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f38139iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String phone) {
            super(null);
            zdlpuopuiu.btonecajqb(phone, "phone");
            this.f38139iobyxmoadg = phone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f38139iobyxmoadg, ((wkgbmnqykc) obj).f38139iobyxmoadg);
        }

        public int hashCode() {
            return this.f38139iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f38139iobyxmoadg;
        }

        public String toString() {
            return "PhoneChanged(phone=" + this.f38139iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final t10.ppxfxbqfkf f38140iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(t10.ppxfxbqfkf emailError) {
            super(null);
            zdlpuopuiu.btonecajqb(emailError, "emailError");
            this.f38140iobyxmoadg = emailError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f38140iobyxmoadg == ((zoijcleaow) obj).f38140iobyxmoadg;
        }

        public int hashCode() {
            return this.f38140iobyxmoadg.hashCode();
        }

        public final t10.ppxfxbqfkf iobyxmoadg() {
            return this.f38140iobyxmoadg;
        }

        public String toString() {
            return "EmailErrorChanged(emailError=" + this.f38140iobyxmoadg + ")";
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
