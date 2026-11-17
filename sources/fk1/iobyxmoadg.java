package fk1;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import sj.lqeggnwhkg;

/* JADX INFO: loaded from: classes6.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: fk1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC0752iobyxmoadg {

        /* JADX INFO: renamed from: fk1.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0753iobyxmoadg implements InterfaceC0752iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f34296iobyxmoadg;

            public C0753iobyxmoadg(String purchaseListId) {
                zdlpuopuiu.btonecajqb(purchaseListId, "purchaseListId");
                this.f34296iobyxmoadg = purchaseListId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0753iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f34296iobyxmoadg, ((C0753iobyxmoadg) obj).f34296iobyxmoadg);
            }

            public int hashCode() {
                return this.f34296iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f34296iobyxmoadg;
            }

            public String toString() {
                return "AddNewProductToList(purchaseListId=" + this.f34296iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: fk1.iobyxmoadg$iobyxmoadg$ppxfxbqfkf */
        public static final class ppxfxbqfkf implements InterfaceC0752iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final ppxfxbqfkf f34297iobyxmoadg = new ppxfxbqfkf();

            private ppxfxbqfkf() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ppxfxbqfkf);
            }

            public int hashCode() {
                return -636885799;
            }

            public String toString() {
                return "DeleteProductFromList";
            }
        }

        /* JADX INFO: renamed from: fk1.iobyxmoadg$iobyxmoadg$zoijcleaow */
        public static final class zoijcleaow implements InterfaceC0752iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final zoijcleaow f34298iobyxmoadg = new zoijcleaow();

            private zoijcleaow() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof zoijcleaow);
            }

            public int hashCode() {
                return 1404617456;
            }

            public String toString() {
                return "CreateNewPurchaseList";
            }
        }
    }

    lqeggnwhkg eablkybsjg();

    Object ppxfxbqfkf(gxszxtbevo gxszxtbevoVar);

    Object wkgbmnqykc(String str, gxszxtbevo gxszxtbevoVar);

    Object zoijcleaow(gxszxtbevo gxszxtbevoVar);
}
