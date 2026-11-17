package e81;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.evropolis.api.model.EvropolisGift;

/* JADX INFO: loaded from: classes5.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f30932iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f30932iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f30932iobyxmoadg == ((iobyxmoadg) obj).f30932iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f30932iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f30932iobyxmoadg;
        }

        public String toString() {
            return "LoadingStateChanged(isLoading=" + this.f30932iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final EvropolisGift.Tab.zoijcleaow f30933iobyxmoadg;

        public zoijcleaow(EvropolisGift.Tab.zoijcleaow tabType) {
            zdlpuopuiu.btonecajqb(tabType, "tabType");
            this.f30933iobyxmoadg = tabType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f30933iobyxmoadg == ((zoijcleaow) obj).f30933iobyxmoadg;
        }

        public int hashCode() {
            return this.f30933iobyxmoadg.hashCode();
        }

        public final EvropolisGift.Tab.zoijcleaow iobyxmoadg() {
            return this.f30933iobyxmoadg;
        }

        public String toString() {
            return "TabChanged(tabType=" + this.f30933iobyxmoadg + ")";
        }
    }
}
