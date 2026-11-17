package c61;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f19079iobyxmoadg;

        public iobyxmoadg(List filtersSections) {
            zdlpuopuiu.btonecajqb(filtersSections, "filtersSections");
            this.f19079iobyxmoadg = filtersSections;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f19079iobyxmoadg, ((iobyxmoadg) obj).f19079iobyxmoadg);
        }

        public int hashCode() {
            return this.f19079iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f19079iobyxmoadg;
        }

        public String toString() {
            return "FiltersSectionChanged(filtersSections=" + this.f19079iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f19080iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            this.f19080iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f19080iobyxmoadg == ((ppxfxbqfkf) obj).f19080iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f19080iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f19080iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f19080iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f19081iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f19082zoijcleaow;

        public zoijcleaow(List filterValues, int i13) {
            zdlpuopuiu.btonecajqb(filterValues, "filterValues");
            this.f19081iobyxmoadg = filterValues;
            this.f19082zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f19081iobyxmoadg, zoijcleaowVar.f19081iobyxmoadg) && this.f19082zoijcleaow == zoijcleaowVar.f19082zoijcleaow;
        }

        public int hashCode() {
            return (this.f19081iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f19082zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f19082zoijcleaow;
        }

        public String toString() {
            return "InfoUpdated(filterValues=" + this.f19081iobyxmoadg + ", amountProducts=" + this.f19082zoijcleaow + ")";
        }

        public final List zoijcleaow() {
            return this.f19081iobyxmoadg;
        }
    }
}
