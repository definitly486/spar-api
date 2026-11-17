package r70;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsModel;
import ru.myspar.core.domain.models.product.FilterSection;

/* JADX INFO: loaded from: classes4.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f81978iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -781257488;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f81979iobyxmoadg;

        public ppxfxbqfkf(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f81979iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f81979iobyxmoadg, ((ppxfxbqfkf) obj).f81979iobyxmoadg);
        }

        public int hashCode() {
            return this.f81979iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f81979iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f81979iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final FilterSection f81980iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ColorsModel f81981zoijcleaow;

        public zoijcleaow(FilterSection filterSection, ColorsModel colorsModel) {
            zdlpuopuiu.btonecajqb(filterSection, "filterSection");
            this.f81980iobyxmoadg = filterSection;
            this.f81981zoijcleaow = colorsModel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f81980iobyxmoadg, zoijcleaowVar.f81980iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f81981zoijcleaow, zoijcleaowVar.f81981zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f81980iobyxmoadg.hashCode() * 31;
            ColorsModel colorsModel = this.f81981zoijcleaow;
            return iHashCode + (colorsModel == null ? 0 : colorsModel.hashCode());
        }

        public final ColorsModel iobyxmoadg() {
            return this.f81981zoijcleaow;
        }

        public String toString() {
            return "NavigateToFiltersAllScreen(filterSection=" + this.f81980iobyxmoadg + ", colorsModel=" + this.f81981zoijcleaow + ")";
        }

        public final FilterSection zoijcleaow() {
            return this.f81980iobyxmoadg;
        }
    }
}
