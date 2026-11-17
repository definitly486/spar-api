package j90;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f50880iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f50881iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String email) {
            super(null);
            zdlpuopuiu.btonecajqb(email, "email");
            this.f50881iobyxmoadg = email;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f50881iobyxmoadg, ((ppxfxbqfkf) obj).f50881iobyxmoadg);
        }

        public int hashCode() {
            return this.f50881iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f50881iobyxmoadg;
        }

        public String toString() {
            return "SuccessDialog(email=" + this.f50881iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f50882iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable throwable) {
            super(null);
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f50882iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f50882iobyxmoadg, ((zoijcleaow) obj).f50882iobyxmoadg);
        }

        public int hashCode() {
            return this.f50882iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f50882iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(throwable=" + this.f50882iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
