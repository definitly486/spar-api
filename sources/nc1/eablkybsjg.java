package nc1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.components.loyalty_program.api.models.LoyaltyCategory;

/* JADX INFO: loaded from: classes5.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f69662iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f69662iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f69662iobyxmoadg == ((iobyxmoadg) obj).f69662iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f69662iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f69662iobyxmoadg;
        }

        public String toString() {
            return "NavigateBack(isUserConfirmCategories=" + this.f69662iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LoyaltyCategory f69663iobyxmoadg;

        public ppxfxbqfkf(LoyaltyCategory category) {
            zdlpuopuiu.btonecajqb(category, "category");
            this.f69663iobyxmoadg = category;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f69663iobyxmoadg, ((ppxfxbqfkf) obj).f69663iobyxmoadg);
        }

        public int hashCode() {
            return this.f69663iobyxmoadg.hashCode();
        }

        public final LoyaltyCategory iobyxmoadg() {
            return this.f69663iobyxmoadg;
        }

        public String toString() {
            return "ShowCategoryInfo(category=" + this.f69663iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f69664iobyxmoadg;

        public zoijcleaow(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f69664iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f69664iobyxmoadg, ((zoijcleaow) obj).f69664iobyxmoadg);
        }

        public int hashCode() {
            return this.f69664iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f69664iobyxmoadg;
        }

        public String toString() {
            return "ShowBaseError(error=" + this.f69664iobyxmoadg + ")";
        }
    }
}
