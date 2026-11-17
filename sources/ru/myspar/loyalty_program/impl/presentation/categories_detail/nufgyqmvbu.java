package ru.myspar.loyalty_program.impl.presentation.categories_detail;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.loyalty_program.impl.presentation.categories_detail.bottomsheet.CategoriesSheetArgs;

/* JADX INFO: loaded from: classes4.dex */
public interface nufgyqmvbu {

    public static final class iobyxmoadg implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f90099iobyxmoadg;

        public iobyxmoadg(Throwable message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.f90099iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f90099iobyxmoadg, ((iobyxmoadg) obj).f90099iobyxmoadg);
        }

        public int hashCode() {
            return this.f90099iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f90099iobyxmoadg;
        }

        public String toString() {
            return "ShowError(message=" + this.f90099iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final CategoriesSheetArgs f90100iobyxmoadg;

        public zoijcleaow(CategoriesSheetArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            this.f90100iobyxmoadg = args;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f90100iobyxmoadg, ((zoijcleaow) obj).f90100iobyxmoadg);
        }

        public int hashCode() {
            return this.f90100iobyxmoadg.hashCode();
        }

        public final CategoriesSheetArgs iobyxmoadg() {
            return this.f90100iobyxmoadg;
        }

        public String toString() {
            return "ShowInfo(args=" + this.f90100iobyxmoadg + ")";
        }
    }
}
