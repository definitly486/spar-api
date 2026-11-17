package l90;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f61926iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f61927iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f61927iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f61927iobyxmoadg, ((ppxfxbqfkf) obj).f61927iobyxmoadg);
        }

        public int hashCode() {
            return this.f61927iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f61927iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f61927iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f61928iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String email) {
            super(null);
            zdlpuopuiu.btonecajqb(email, "email");
            this.f61928iobyxmoadg = email;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f61928iobyxmoadg, ((zoijcleaow) obj).f61928iobyxmoadg);
        }

        public int hashCode() {
            return this.f61928iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f61928iobyxmoadg;
        }

        public String toString() {
            return "EchecksEnabled(email=" + this.f61928iobyxmoadg + ")";
        }
    }

    public /* synthetic */ eablkybsjg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
