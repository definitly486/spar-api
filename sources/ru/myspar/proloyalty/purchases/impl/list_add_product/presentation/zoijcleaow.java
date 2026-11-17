package ru.myspar.proloyalty.purchases.impl.list_add_product.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f99693iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.list_add_product.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2391zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99694iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2391zoijcleaow(String purchaseListId) {
            super(null);
            zdlpuopuiu.btonecajqb(purchaseListId, "purchaseListId");
            this.f99694iobyxmoadg = purchaseListId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2391zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f99694iobyxmoadg, ((C2391zoijcleaow) obj).f99694iobyxmoadg);
        }

        public int hashCode() {
            return this.f99694iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99694iobyxmoadg;
        }

        public String toString() {
            return "OnPurchaseListClicked(purchaseListId=" + this.f99694iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
