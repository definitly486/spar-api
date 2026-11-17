package p70;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f75907iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f75908iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f75909iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String lastName) {
            super(null);
            zdlpuopuiu.btonecajqb(lastName, "lastName");
            this.f75909iobyxmoadg = lastName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f75909iobyxmoadg, ((ppxfxbqfkf) obj).f75909iobyxmoadg);
        }

        public int hashCode() {
            return this.f75909iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f75909iobyxmoadg;
        }

        public String toString() {
            return "OnLastNameChanged(lastName=" + this.f75909iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: p70.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1671wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f75910iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1671wkgbmnqykc(String phoneNumber) {
            super(null);
            zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
            this.f75910iobyxmoadg = phoneNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1671wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f75910iobyxmoadg, ((C1671wkgbmnqykc) obj).f75910iobyxmoadg);
        }

        public int hashCode() {
            return this.f75910iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f75910iobyxmoadg;
        }

        public String toString() {
            return "OnPhoneChanged(phoneNumber=" + this.f75910iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f75911iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String firstName) {
            super(null);
            zdlpuopuiu.btonecajqb(firstName, "firstName");
            this.f75911iobyxmoadg = firstName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f75911iobyxmoadg, ((zoijcleaow) obj).f75911iobyxmoadg);
        }

        public int hashCode() {
            return this.f75911iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f75911iobyxmoadg;
        }

        public String toString() {
            return "OnFirstNameChanged(firstName=" + this.f75911iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
