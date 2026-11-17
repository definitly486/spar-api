package zy1;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import sj.iozdgvuglv;

/* JADX INFO: loaded from: classes6.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: zy1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC3365iobyxmoadg {

        /* JADX INFO: renamed from: zy1.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C3366iobyxmoadg implements InterfaceC3365iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f131593iobyxmoadg;

            public C3366iobyxmoadg(String purchaseListId) {
                zdlpuopuiu.btonecajqb(purchaseListId, "purchaseListId");
                this.f131593iobyxmoadg = purchaseListId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3366iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f131593iobyxmoadg, ((C3366iobyxmoadg) obj).f131593iobyxmoadg);
            }

            public int hashCode() {
                return this.f131593iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f131593iobyxmoadg;
            }

            public String toString() {
                return "AddNewProductToList(purchaseListId=" + this.f131593iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: zy1.iobyxmoadg$iobyxmoadg$ppxfxbqfkf */
        public static final class ppxfxbqfkf implements InterfaceC3365iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final ppxfxbqfkf f131594iobyxmoadg = new ppxfxbqfkf();

            private ppxfxbqfkf() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ppxfxbqfkf);
            }

            public int hashCode() {
                return 1262543900;
            }

            public String toString() {
                return "DeleteProductFromList";
            }
        }

        /* JADX INFO: renamed from: zy1.iobyxmoadg$iobyxmoadg$zoijcleaow */
        public static final class zoijcleaow implements InterfaceC3365iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final zoijcleaow f131595iobyxmoadg = new zoijcleaow();

            private zoijcleaow() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof zoijcleaow);
            }

            public int hashCode() {
                return -990920141;
            }

            public String toString() {
                return "CreateNewPurchaseList";
            }
        }
    }

    iozdgvuglv eablkybsjg();

    Object ppxfxbqfkf(gxszxtbevo gxszxtbevoVar);

    Object wkgbmnqykc(String str, gxszxtbevo gxszxtbevoVar);

    Object zoijcleaow(gxszxtbevo gxszxtbevoVar);
}
