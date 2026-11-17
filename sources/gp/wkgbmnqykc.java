package gp;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f38158iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }
    }

    public static final class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f38159iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(String phoneNumber) {
            super(null);
            zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
            this.f38159iobyxmoadg = phoneNumber;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f38159iobyxmoadg, ((gxszxtbevo) obj).f38159iobyxmoadg);
        }

        public int hashCode() {
            return this.f38159iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f38159iobyxmoadg;
        }

        public String toString() {
            return "OnPhoneChanged(phoneNumber=" + this.f38159iobyxmoadg + ")";
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f38160iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f38161iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: gp.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C0866wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f38162iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0866wkgbmnqykc(String email) {
            super(null);
            zdlpuopuiu.btonecajqb(email, "email");
            this.f38162iobyxmoadg = email;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0866wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f38162iobyxmoadg, ((C0866wkgbmnqykc) obj).f38162iobyxmoadg);
        }

        public int hashCode() {
            return this.f38162iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f38162iobyxmoadg;
        }

        public String toString() {
            return "OnEmailChanged(email=" + this.f38162iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f38163iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
