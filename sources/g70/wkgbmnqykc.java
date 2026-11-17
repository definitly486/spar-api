package g70;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f36565iobyxmoadg;

        public iobyxmoadg(List excludes) {
            zdlpuopuiu.btonecajqb(excludes, "excludes");
            this.f36565iobyxmoadg = excludes;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f36565iobyxmoadg, ((iobyxmoadg) obj).f36565iobyxmoadg);
        }

        public int hashCode() {
            return this.f36565iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f36565iobyxmoadg;
        }

        public String toString() {
            return "Any(excludes=" + this.f36565iobyxmoadg + ")";
        }

        public /* synthetic */ iobyxmoadg(List list, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? jyumaefscl.wflxmlrfwp() : list);
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f36566iobyxmoadg;

        public zoijcleaow(List keys) {
            zdlpuopuiu.btonecajqb(keys, "keys");
            this.f36566iobyxmoadg = keys;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f36566iobyxmoadg, ((zoijcleaow) obj).f36566iobyxmoadg);
        }

        public int hashCode() {
            return this.f36566iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f36566iobyxmoadg;
        }

        public String toString() {
            return "Selected(keys=" + this.f36566iobyxmoadg + ")";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String key) {
            this(jyumaefscl.eablkybsjg(key));
            zdlpuopuiu.btonecajqb(key, "key");
        }
    }
}
