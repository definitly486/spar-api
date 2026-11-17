package ru.myspar.proloyalty.loyalty_program.impl.presentation.categories_detail;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.loyalty_program.impl.presentation.categories_detail.bottomsheet.CategoriesSheetArgs;

/* JADX INFO: loaded from: classes5.dex */
public interface nufgyqmvbu {

    public static final class iobyxmoadg implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f97709iobyxmoadg;

        public iobyxmoadg(Throwable message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f97709iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f97709iobyxmoadg, ((iobyxmoadg) obj).f97709iobyxmoadg);
        }

        public int hashCode() {
            return this.f97709iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f97709iobyxmoadg;
        }

        public String toString() {
            return "ShowError(message=" + this.f97709iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CategoriesSheetArgs f97710iobyxmoadg;

        public zoijcleaow(CategoriesSheetArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.f97710iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f97710iobyxmoadg, ((zoijcleaow) obj).f97710iobyxmoadg);
        }

        public int hashCode() {
            return this.f97710iobyxmoadg.hashCode();
        }

        public final CategoriesSheetArgs iobyxmoadg() {
            return this.f97710iobyxmoadg;
        }

        public String toString() {
            return "ShowInfo(args=" + this.f97710iobyxmoadg + ")";
        }
    }
}
