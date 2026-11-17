package g2;

import hg.tzroggbefp;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f35842iobyxmoadg;

        public iobyxmoadg(String name) {
            zdlpuopuiu.btonecajqb(name, "name");
            this.f35842iobyxmoadg = name;
        }

        public boolean equals(Object obj) {
            if (obj instanceof iobyxmoadg) {
                return zdlpuopuiu.eablkybsjg(this.f35842iobyxmoadg, ((iobyxmoadg) obj).f35842iobyxmoadg);
            }
            return false;
        }

        public int hashCode() {
            return this.f35842iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f35842iobyxmoadg;
        }

        public String toString() {
            return this.f35842iobyxmoadg;
        }
    }

    public static final class zoijcleaow {
    }

    public abstract Map iobyxmoadg();

    public final g2.iobyxmoadg ppxfxbqfkf() {
        return new g2.iobyxmoadg(tzroggbefp.iwizpuwonk(iobyxmoadg()), false);
    }

    public final wkgbmnqykc wkgbmnqykc() {
        return new g2.iobyxmoadg(tzroggbefp.iwizpuwonk(iobyxmoadg()), true);
    }

    public abstract Object zoijcleaow(iobyxmoadg iobyxmoadgVar);
}
