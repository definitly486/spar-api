package n71;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f69316iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f69317iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(String email) {
            super(null);
            zdlpuopuiu.btonecajqb(email, "email");
            this.f69317iobyxmoadg = email;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f69317iobyxmoadg, ((ppxfxbqfkf) obj).f69317iobyxmoadg);
        }

        public int hashCode() {
            return this.f69317iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f69317iobyxmoadg;
        }

        public String toString() {
            return "SuccessDialog(email=" + this.f69317iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f69318iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Throwable throwable) {
            super(null);
            zdlpuopuiu.btonecajqb(throwable, "throwable");
            this.f69318iobyxmoadg = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f69318iobyxmoadg, ((zoijcleaow) obj).f69318iobyxmoadg);
        }

        public int hashCode() {
            return this.f69318iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f69318iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(throwable=" + this.f69318iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
