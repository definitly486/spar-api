package aa0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.evropolis.api.model.EvropolisGift;

/* JADX INFO: loaded from: classes4.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f1213iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f1213iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f1213iobyxmoadg == ((iobyxmoadg) obj).f1213iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f1213iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f1213iobyxmoadg;
        }

        public String toString() {
            return "LoadingStateChanged(isLoading=" + this.f1213iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final EvropolisGift.Tab.zoijcleaow f1214iobyxmoadg;

        public zoijcleaow(EvropolisGift.Tab.zoijcleaow tabType) {
            zdlpuopuiu.btonecajqb(tabType, "tabType");
            this.f1214iobyxmoadg = tabType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f1214iobyxmoadg == ((zoijcleaow) obj).f1214iobyxmoadg;
        }

        public int hashCode() {
            return this.f1214iobyxmoadg.hashCode();
        }

        public final EvropolisGift.Tab.zoijcleaow iobyxmoadg() {
            return this.f1214iobyxmoadg;
        }

        public String toString() {
            return "TabChanged(tabType=" + this.f1214iobyxmoadg + ")";
        }
    }
}
