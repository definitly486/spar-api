package l00;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.Warning;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f61226iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f61226iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f61226iobyxmoadg, ((iobyxmoadg) obj).f61226iobyxmoadg);
        }

        public int hashCode() {
            return this.f61226iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f61226iobyxmoadg;
        }

        public String toString() {
            return "ErrorEvent(error=" + this.f61226iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Warning f61227iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Warning warning) {
            super(null);
            zdlpuopuiu.btonecajqb(warning, "warning");
            this.f61227iobyxmoadg = warning;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f61227iobyxmoadg, ((ppxfxbqfkf) obj).f61227iobyxmoadg);
        }

        public int hashCode() {
            return this.f61227iobyxmoadg.hashCode();
        }

        public final Warning iobyxmoadg() {
            return this.f61227iobyxmoadg;
        }

        public String toString() {
            return "WarningEvent(warning=" + this.f61227iobyxmoadg + ")";
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
