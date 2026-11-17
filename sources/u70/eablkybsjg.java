package u70;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: u70.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C2794eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2794eablkybsjg f112899iobyxmoadg = new C2794eablkybsjg();

        private C2794eablkybsjg() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f112900iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f112901iobyxmoadg;

        public ppxfxbqfkf(String str) {
            super(null);
            this.f112901iobyxmoadg = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f112901iobyxmoadg, ((ppxfxbqfkf) obj).f112901iobyxmoadg);
        }

        public int hashCode() {
            String str = this.f112901iobyxmoadg;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f112901iobyxmoadg;
        }

        public String toString() {
            return "ShowEmailTakenSnackbar(error=" + this.f112901iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f112902iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String email) {
            super(null);
            zdlpuopuiu.btonecajqb(email, "email");
            this.f112902iobyxmoadg = email;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f112902iobyxmoadg, ((wkgbmnqykc) obj).f112902iobyxmoadg);
        }

        public int hashCode() {
            return this.f112902iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f112902iobyxmoadg;
        }

        public String toString() {
            return "ShowEmailVerifyDialog(email=" + this.f112902iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f112903iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f112903iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f112903iobyxmoadg, ((zoijcleaow) obj).f112903iobyxmoadg);
        }

        public int hashCode() {
            return this.f112903iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f112903iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f112903iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
