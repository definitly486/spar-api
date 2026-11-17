package dz0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.Warning;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f29979iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f29979iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f29979iobyxmoadg, ((iobyxmoadg) obj).f29979iobyxmoadg);
        }

        public int hashCode() {
            return this.f29979iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f29979iobyxmoadg;
        }

        public String toString() {
            return "ErrorEvent(error=" + this.f29979iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Warning f29980iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Warning warning) {
            super(null);
            zdlpuopuiu.btonecajqb(warning, "warning");
            this.f29980iobyxmoadg = warning;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f29980iobyxmoadg, ((ppxfxbqfkf) obj).f29980iobyxmoadg);
        }

        public int hashCode() {
            return this.f29980iobyxmoadg.hashCode();
        }

        public final Warning iobyxmoadg() {
            return this.f29980iobyxmoadg;
        }

        public String toString() {
            return "WarningEvent(warning=" + this.f29980iobyxmoadg + ")";
        }
    }

    public static abstract class zoijcleaow extends eablkybsjg {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ eablkybsjg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private eablkybsjg() {
    }
}
