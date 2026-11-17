package k21;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.ui.model.MainTab;

/* JADX INFO: loaded from: classes5.dex */
public interface kcexrzcfyt {

    public static final class iobyxmoadg implements kcexrzcfyt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f53469iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f53469iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f53469iobyxmoadg == ((iobyxmoadg) obj).f53469iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f53469iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f53469iobyxmoadg;
        }

        public String toString() {
            return "ChangeVisible(isVisible=" + this.f53469iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements kcexrzcfyt {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final MainTab f53470iobyxmoadg;

        public zoijcleaow(MainTab tab) {
            zdlpuopuiu.btonecajqb(tab, "tab");
            this.f53470iobyxmoadg = tab;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f53470iobyxmoadg == ((zoijcleaow) obj).f53470iobyxmoadg;
        }

        public int hashCode() {
            return this.f53470iobyxmoadg.hashCode();
        }

        public final MainTab iobyxmoadg() {
            return this.f53470iobyxmoadg;
        }

        public String toString() {
            return "SelectTab(tab=" + this.f53470iobyxmoadg + ")";
        }
    }
}
