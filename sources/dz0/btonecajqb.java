package dz0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;

/* JADX INFO: loaded from: classes5.dex */
public interface btonecajqb {

    public static abstract class iobyxmoadg {

        /* JADX INFO: renamed from: dz0.btonecajqb$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0620iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final C0620iobyxmoadg f29970iobyxmoadg = new C0620iobyxmoadg();

            private C0620iobyxmoadg() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0620iobyxmoadg);
            }

            public int hashCode() {
                return 121868639;
            }

            public String toString() {
                return "BasketOrder";
            }
        }

        public static final class ppxfxbqfkf extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f29971iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ppxfxbqfkf(String orderId) {
                super(null);
                zdlpuopuiu.btonecajqb(orderId, "orderId");
                this.f29971iobyxmoadg = orderId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f29971iobyxmoadg, ((ppxfxbqfkf) obj).f29971iobyxmoadg);
            }

            public int hashCode() {
                return this.f29971iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f29971iobyxmoadg;
            }

            public String toString() {
                return "OrderChange(orderId=" + this.f29971iobyxmoadg + ")";
            }
        }

        public static final class wkgbmnqykc extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f29972iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public wkgbmnqykc(String orderId) {
                super(null);
                zdlpuopuiu.btonecajqb(orderId, "orderId");
                this.f29972iobyxmoadg = orderId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f29972iobyxmoadg, ((wkgbmnqykc) obj).f29972iobyxmoadg);
            }

            public int hashCode() {
                return this.f29972iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f29972iobyxmoadg;
            }

            public String toString() {
                return "OrderEdit(orderId=" + this.f29972iobyxmoadg + ")";
            }
        }

        public static final class zoijcleaow extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final zoijcleaow f29973iobyxmoadg = new zoijcleaow();

            private zoijcleaow() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof zoijcleaow);
            }

            public int hashCode() {
                return 1101509321;
            }

            public String toString() {
                return "Cart";
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    sj.lqeggnwhkg iobyxmoadg();

    Object ppxfxbqfkf(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar);

    sj.lqeggnwhkg zoijcleaow();
}
