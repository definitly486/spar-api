package b61;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f15372iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f15373zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String phone, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(phone, "phone");
            this.f15372iobyxmoadg = phone;
            this.f15373zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f15372iobyxmoadg, eablkybsjgVar.f15372iobyxmoadg) && this.f15373zoijcleaow == eablkybsjgVar.f15373zoijcleaow;
        }

        public int hashCode() {
            return (this.f15372iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f15373zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f15373zoijcleaow;
        }

        public String toString() {
            return "PhoneChange(phone=" + this.f15372iobyxmoadg + ", error=" + this.f15373zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f15372iobyxmoadg;
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f15374iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f15375zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String firstName, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(firstName, "firstName");
            this.f15374iobyxmoadg = firstName;
            this.f15375zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f15374iobyxmoadg, iobyxmoadgVar.f15374iobyxmoadg) && this.f15375zoijcleaow == iobyxmoadgVar.f15375zoijcleaow;
        }

        public int hashCode() {
            return (this.f15374iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f15375zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f15375zoijcleaow;
        }

        public String toString() {
            return "FirstNameChange(firstName=" + this.f15374iobyxmoadg + ", error=" + this.f15375zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f15374iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f15376iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f15377zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String lastName, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(lastName, "lastName");
            this.f15376iobyxmoadg = lastName;
            this.f15377zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f15376iobyxmoadg, ppxfxbqfkfVar.f15376iobyxmoadg) && this.f15377zoijcleaow == ppxfxbqfkfVar.f15377zoijcleaow;
        }

        public int hashCode() {
            return (this.f15376iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f15377zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f15377zoijcleaow;
        }

        public String toString() {
            return "LastNameChange(lastName=" + this.f15376iobyxmoadg + ", error=" + this.f15377zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f15376iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f15378iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            super(null);
            this.f15378iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f15378iobyxmoadg == ((wkgbmnqykc) obj).f15378iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f15378iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f15378iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f15378iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f15379eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final boolean f15380gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f15381iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f15382ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f15383wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f15384zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String firstName, boolean z13, String lastName, boolean z14, String phone, boolean z15) {
            super(null);
            zdlpuopuiu.btonecajqb(firstName, "firstName");
            zdlpuopuiu.btonecajqb(lastName, "lastName");
            zdlpuopuiu.btonecajqb(phone, "phone");
            this.f15381iobyxmoadg = firstName;
            this.f15384zoijcleaow = z13;
            this.f15382ppxfxbqfkf = lastName;
            this.f15383wkgbmnqykc = z14;
            this.f15379eablkybsjg = phone;
            this.f15380gxszxtbevo = z15;
        }

        public final String eablkybsjg() {
            return this.f15379eablkybsjg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f15381iobyxmoadg, zoijcleaowVar.f15381iobyxmoadg) && this.f15384zoijcleaow == zoijcleaowVar.f15384zoijcleaow && zdlpuopuiu.eablkybsjg(this.f15382ppxfxbqfkf, zoijcleaowVar.f15382ppxfxbqfkf) && this.f15383wkgbmnqykc == zoijcleaowVar.f15383wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f15379eablkybsjg, zoijcleaowVar.f15379eablkybsjg) && this.f15380gxszxtbevo == zoijcleaowVar.f15380gxszxtbevo;
        }

        public final boolean gxszxtbevo() {
            return this.f15380gxszxtbevo;
        }

        public int hashCode() {
            return (((((((((this.f15381iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f15384zoijcleaow)) * 31) + this.f15382ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f15383wkgbmnqykc)) * 31) + this.f15379eablkybsjg.hashCode()) * 31) + Boolean.hashCode(this.f15380gxszxtbevo);
        }

        public final String iobyxmoadg() {
            return this.f15381iobyxmoadg;
        }

        public final String ppxfxbqfkf() {
            return this.f15382ppxfxbqfkf;
        }

        public String toString() {
            return "InfoUpdated(firstName=" + this.f15381iobyxmoadg + ", firstNameError=" + this.f15384zoijcleaow + ", lastName=" + this.f15382ppxfxbqfkf + ", lastNameError=" + this.f15383wkgbmnqykc + ", phone=" + this.f15379eablkybsjg + ", phoneError=" + this.f15380gxszxtbevo + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f15383wkgbmnqykc;
        }

        public final boolean zoijcleaow() {
            return this.f15384zoijcleaow;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
