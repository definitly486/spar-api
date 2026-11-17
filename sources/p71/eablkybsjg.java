package p71;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f75912iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f75913iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f75913iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f75913iobyxmoadg, ((ppxfxbqfkf) obj).f75913iobyxmoadg);
        }

        public int hashCode() {
            return this.f75913iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f75913iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f75913iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f75914iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String email) {
            super(null);
            zdlpuopuiu.btonecajqb(email, "email");
            this.f75914iobyxmoadg = email;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f75914iobyxmoadg, ((zoijcleaow) obj).f75914iobyxmoadg);
        }

        public int hashCode() {
            return this.f75914iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f75914iobyxmoadg;
        }

        public String toString() {
            return "EchecksEnabled(email=" + this.f75914iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
