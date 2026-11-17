package r70;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f81982iobyxmoadg;

        public iobyxmoadg(List filtersSections) {
            zdlpuopuiu.btonecajqb(filtersSections, "filtersSections");
            this.f81982iobyxmoadg = filtersSections;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f81982iobyxmoadg, ((iobyxmoadg) obj).f81982iobyxmoadg);
        }

        public int hashCode() {
            return this.f81982iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f81982iobyxmoadg;
        }

        public String toString() {
            return "FiltersSectionChanged(filtersSections=" + this.f81982iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f81983iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            this.f81983iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f81983iobyxmoadg == ((ppxfxbqfkf) obj).f81983iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f81983iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f81983iobyxmoadg;
        }

        public String toString() {
            return "Loader(isVisible=" + this.f81983iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f81984iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f81985zoijcleaow;

        public zoijcleaow(List filterValues, int i13) {
            zdlpuopuiu.btonecajqb(filterValues, "filterValues");
            this.f81984iobyxmoadg = filterValues;
            this.f81985zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f81984iobyxmoadg, zoijcleaowVar.f81984iobyxmoadg) && this.f81985zoijcleaow == zoijcleaowVar.f81985zoijcleaow;
        }

        public int hashCode() {
            return (this.f81984iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f81985zoijcleaow);
        }

        public final int iobyxmoadg() {
            return this.f81985zoijcleaow;
        }

        public String toString() {
            return "InfoUpdated(filterValues=" + this.f81984iobyxmoadg + ", amountProducts=" + this.f81985zoijcleaow + ")";
        }

        public final List zoijcleaow() {
            return this.f81984iobyxmoadg;
        }
    }
}
