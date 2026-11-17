package p70;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {

    public static final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f75875iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f75876zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String phone, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(phone, "phone");
            this.f75875iobyxmoadg = phone;
            this.f75876zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f75875iobyxmoadg, eablkybsjgVar.f75875iobyxmoadg) && this.f75876zoijcleaow == eablkybsjgVar.f75876zoijcleaow;
        }

        public int hashCode() {
            return (this.f75875iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f75876zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f75876zoijcleaow;
        }

        public String toString() {
            return "PhoneChange(phone=" + this.f75875iobyxmoadg + ", error=" + this.f75876zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f75875iobyxmoadg;
        }
    }

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f75877iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f75878zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String firstName, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(firstName, "firstName");
            this.f75877iobyxmoadg = firstName;
            this.f75878zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f75877iobyxmoadg, iobyxmoadgVar.f75877iobyxmoadg) && this.f75878zoijcleaow == iobyxmoadgVar.f75878zoijcleaow;
        }

        public int hashCode() {
            return (this.f75877iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f75878zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f75878zoijcleaow;
        }

        public String toString() {
            return "FirstNameChange(firstName=" + this.f75877iobyxmoadg + ", error=" + this.f75878zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f75877iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f75879iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f75880zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String lastName, boolean z13) {
            super(null);
            zdlpuopuiu.btonecajqb(lastName, "lastName");
            this.f75879iobyxmoadg = lastName;
            this.f75880zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f75879iobyxmoadg, ppxfxbqfkfVar.f75879iobyxmoadg) && this.f75880zoijcleaow == ppxfxbqfkfVar.f75880zoijcleaow;
        }

        public int hashCode() {
            return (this.f75879iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f75880zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f75880zoijcleaow;
        }

        public String toString() {
            return "LastNameChange(lastName=" + this.f75879iobyxmoadg + ", error=" + this.f75880zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f75879iobyxmoadg;
        }
    }

    public static final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f75881iobyxmoadg;

        public wkgbmnqykc(boolean z13) {
            super(null);
            this.f75881iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && this.f75881iobyxmoadg == ((wkgbmnqykc) obj).f75881iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f75881iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f75881iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f75881iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f75882eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final boolean f75883gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f75884iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f75885ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f75886wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f75887zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String firstName, boolean z13, String lastName, boolean z14, String phone, boolean z15) {
            super(null);
            zdlpuopuiu.btonecajqb(firstName, "firstName");
            zdlpuopuiu.btonecajqb(lastName, "lastName");
            zdlpuopuiu.btonecajqb(phone, "phone");
            this.f75884iobyxmoadg = firstName;
            this.f75887zoijcleaow = z13;
            this.f75885ppxfxbqfkf = lastName;
            this.f75886wkgbmnqykc = z14;
            this.f75882eablkybsjg = phone;
            this.f75883gxszxtbevo = z15;
        }

        public final String eablkybsjg() {
            return this.f75882eablkybsjg;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f75884iobyxmoadg, zoijcleaowVar.f75884iobyxmoadg) && this.f75887zoijcleaow == zoijcleaowVar.f75887zoijcleaow && zdlpuopuiu.eablkybsjg(this.f75885ppxfxbqfkf, zoijcleaowVar.f75885ppxfxbqfkf) && this.f75886wkgbmnqykc == zoijcleaowVar.f75886wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f75882eablkybsjg, zoijcleaowVar.f75882eablkybsjg) && this.f75883gxszxtbevo == zoijcleaowVar.f75883gxszxtbevo;
        }

        public final boolean gxszxtbevo() {
            return this.f75883gxszxtbevo;
        }

        public int hashCode() {
            return (((((((((this.f75884iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f75887zoijcleaow)) * 31) + this.f75885ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f75886wkgbmnqykc)) * 31) + this.f75882eablkybsjg.hashCode()) * 31) + Boolean.hashCode(this.f75883gxszxtbevo);
        }

        public final String iobyxmoadg() {
            return this.f75884iobyxmoadg;
        }

        public final String ppxfxbqfkf() {
            return this.f75885ppxfxbqfkf;
        }

        public String toString() {
            return "InfoUpdated(firstName=" + this.f75884iobyxmoadg + ", firstNameError=" + this.f75887zoijcleaow + ", lastName=" + this.f75885ppxfxbqfkf + ", lastNameError=" + this.f75886wkgbmnqykc + ", phone=" + this.f75882eablkybsjg + ", phoneError=" + this.f75883gxszxtbevo + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f75886wkgbmnqykc;
        }

        public final boolean zoijcleaow() {
            return this.f75887zoijcleaow;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
