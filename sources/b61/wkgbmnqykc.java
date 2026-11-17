package b61;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f15404iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f15405iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f15406iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String lastName) {
            super(null);
            zdlpuopuiu.btonecajqb(lastName, "lastName");
            this.f15406iobyxmoadg = lastName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f15406iobyxmoadg, ((ppxfxbqfkf) obj).f15406iobyxmoadg);
        }

        public int hashCode() {
            return this.f15406iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f15406iobyxmoadg;
        }

        public String toString() {
            return "OnLastNameChanged(lastName=" + this.f15406iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: b61.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C0260wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f15407iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0260wkgbmnqykc(String phoneNumber) {
            super(null);
            zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
            this.f15407iobyxmoadg = phoneNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0260wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f15407iobyxmoadg, ((C0260wkgbmnqykc) obj).f15407iobyxmoadg);
        }

        public int hashCode() {
            return this.f15407iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f15407iobyxmoadg;
        }

        public String toString() {
            return "OnPhoneChanged(phoneNumber=" + this.f15407iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f15408iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String firstName) {
            super(null);
            zdlpuopuiu.btonecajqb(firstName, "firstName");
            this.f15408iobyxmoadg = firstName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f15408iobyxmoadg, ((zoijcleaow) obj).f15408iobyxmoadg);
        }

        public int hashCode() {
            return this.f15408iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f15408iobyxmoadg;
        }

        public String toString() {
            return "OnFirstNameChanged(firstName=" + this.f15408iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
