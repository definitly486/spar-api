package v51;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f116113iobyxmoadg;

        public iobyxmoadg(List excludes) {
            zdlpuopuiu.btonecajqb(excludes, "excludes");
            this.f116113iobyxmoadg = excludes;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f116113iobyxmoadg, ((iobyxmoadg) obj).f116113iobyxmoadg);
        }

        public int hashCode() {
            return this.f116113iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f116113iobyxmoadg;
        }

        public String toString() {
            return "Any(excludes=" + this.f116113iobyxmoadg + ")";
        }

        public /* synthetic */ iobyxmoadg(List list, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? jyumaefscl.wflxmlrfwp() : list);
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f116114iobyxmoadg;

        public zoijcleaow(List keys) {
            zdlpuopuiu.btonecajqb(keys, "keys");
            this.f116114iobyxmoadg = keys;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f116114iobyxmoadg, ((zoijcleaow) obj).f116114iobyxmoadg);
        }

        public int hashCode() {
            return this.f116114iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f116114iobyxmoadg;
        }

        public String toString() {
            return "Selected(keys=" + this.f116114iobyxmoadg + ")";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String key) {
            this(jyumaefscl.eablkybsjg(key));
            zdlpuopuiu.btonecajqb(key, "key");
        }
    }
}
