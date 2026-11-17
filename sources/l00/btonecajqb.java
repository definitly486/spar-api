package l00;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;

/* JADX INFO: loaded from: classes4.dex */
public interface btonecajqb {

    public static abstract class iobyxmoadg {

        /* JADX INFO: renamed from: l00.btonecajqb$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1234iobyxmoadg extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final C1234iobyxmoadg f61217iobyxmoadg = new C1234iobyxmoadg();

            private C1234iobyxmoadg() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1234iobyxmoadg);
            }

            public int hashCode() {
                return -162093252;
            }

            public String toString() {
                return "BasketOrder";
            }
        }

        public static final class ppxfxbqfkf extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f61218iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ppxfxbqfkf(String orderId) {
                super(null);
                zdlpuopuiu.btonecajqb(orderId, "orderId");
                this.f61218iobyxmoadg = orderId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f61218iobyxmoadg, ((ppxfxbqfkf) obj).f61218iobyxmoadg);
            }

            public int hashCode() {
                return this.f61218iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f61218iobyxmoadg;
            }

            public String toString() {
                return "OrderChange(orderId=" + this.f61218iobyxmoadg + ")";
            }
        }

        public static final class wkgbmnqykc extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f61219iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public wkgbmnqykc(String orderId) {
                super(null);
                zdlpuopuiu.btonecajqb(orderId, "orderId");
                this.f61219iobyxmoadg = orderId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f61219iobyxmoadg, ((wkgbmnqykc) obj).f61219iobyxmoadg);
            }

            public int hashCode() {
                return this.f61219iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f61219iobyxmoadg;
            }

            public String toString() {
                return "OrderEdit(orderId=" + this.f61219iobyxmoadg + ")";
            }
        }

        public static final class zoijcleaow extends iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final zoijcleaow f61220iobyxmoadg = new zoijcleaow();

            private zoijcleaow() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof zoijcleaow);
            }

            public int hashCode() {
                return -1855009908;
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
