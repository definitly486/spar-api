package c61;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import ru.myspar.proloyalty.core.domain.models.product.FilterSection;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f19075iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -105663341;
        }

        public String toString() {
            return "Back";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f19076iobyxmoadg;

        public ppxfxbqfkf(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f19076iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f19076iobyxmoadg, ((ppxfxbqfkf) obj).f19076iobyxmoadg);
        }

        public int hashCode() {
            return this.f19076iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f19076iobyxmoadg;
        }

        public String toString() {
            return "ProcessError(error=" + this.f19076iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final FilterSection f19077iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ColorsModel f19078zoijcleaow;

        public zoijcleaow(FilterSection filterSection, ColorsModel colorsModel) {
            zdlpuopuiu.btonecajqb(filterSection, "filterSection");
            this.f19077iobyxmoadg = filterSection;
            this.f19078zoijcleaow = colorsModel;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f19077iobyxmoadg, zoijcleaowVar.f19077iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f19078zoijcleaow, zoijcleaowVar.f19078zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f19077iobyxmoadg.hashCode() * 31;
            ColorsModel colorsModel = this.f19078zoijcleaow;
            return iHashCode + (colorsModel == null ? 0 : colorsModel.hashCode());
        }

        public final ColorsModel iobyxmoadg() {
            return this.f19078zoijcleaow;
        }

        public String toString() {
            return "NavigateToFiltersAllScreen(filterSection=" + this.f19077iobyxmoadg + ", colorsModel=" + this.f19078zoijcleaow + ")";
        }

        public final FilterSection zoijcleaow() {
            return this.f19077iobyxmoadg;
        }
    }
}
