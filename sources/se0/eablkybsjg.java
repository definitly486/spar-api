package se0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.components.loyalty_program.api.models.LoyaltyCategory;

/* JADX INFO: loaded from: classes4.dex */
public interface eablkybsjg {

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f106050iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f106050iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f106050iobyxmoadg == ((iobyxmoadg) obj).f106050iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f106050iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f106050iobyxmoadg;
        }

        public String toString() {
            return "NavigateBack(isUserConfirmCategories=" + this.f106050iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LoyaltyCategory f106051iobyxmoadg;

        public ppxfxbqfkf(LoyaltyCategory category) {
            zdlpuopuiu.btonecajqb(category, "category");
            this.f106051iobyxmoadg = category;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f106051iobyxmoadg, ((ppxfxbqfkf) obj).f106051iobyxmoadg);
        }

        public int hashCode() {
            return this.f106051iobyxmoadg.hashCode();
        }

        public final LoyaltyCategory iobyxmoadg() {
            return this.f106051iobyxmoadg;
        }

        public String toString() {
            return "ShowCategoryInfo(category=" + this.f106051iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f106052iobyxmoadg;

        public zoijcleaow(Throwable error) {
            zdlpuopuiu.btonecajqb(error, "error");
            this.f106052iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f106052iobyxmoadg, ((zoijcleaow) obj).f106052iobyxmoadg);
        }

        public int hashCode() {
            return this.f106052iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f106052iobyxmoadg;
        }

        public String toString() {
            return "ShowBaseError(error=" + this.f106052iobyxmoadg + ")";
        }
    }
}
