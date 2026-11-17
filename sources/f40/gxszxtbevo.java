package f40;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.ui.model.MainTab;

/* JADX INFO: loaded from: classes4.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f32779iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f32779iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f32779iobyxmoadg == ((iobyxmoadg) obj).f32779iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f32779iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f32779iobyxmoadg;
        }

        public String toString() {
            return "ChangeVisible(isVisible=" + this.f32779iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final MainTab f32780iobyxmoadg;

        public zoijcleaow(MainTab tab) {
            zdlpuopuiu.btonecajqb(tab, "tab");
            this.f32780iobyxmoadg = tab;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f32780iobyxmoadg == ((zoijcleaow) obj).f32780iobyxmoadg;
        }

        public int hashCode() {
            return this.f32780iobyxmoadg.hashCode();
        }

        public final MainTab iobyxmoadg() {
            return this.f32780iobyxmoadg;
        }

        public String toString() {
            return "SelectTab(tab=" + this.f32780iobyxmoadg + ")";
        }
    }
}
