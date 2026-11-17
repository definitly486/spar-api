package ru.myspar.purchases.impl.list_add_product.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow {

    public static final class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f102401iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.list_add_product.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2473zoijcleaow extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102402iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2473zoijcleaow(String purchaseListId) {
            super(null);
            zdlpuopuiu.btonecajqb(purchaseListId, "purchaseListId");
            this.f102402iobyxmoadg = purchaseListId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2473zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f102402iobyxmoadg, ((C2473zoijcleaow) obj).f102402iobyxmoadg);
        }

        public int hashCode() {
            return this.f102402iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102402iobyxmoadg;
        }

        public String toString() {
            return "OnPurchaseListClicked(purchaseListId=" + this.f102402iobyxmoadg + ")";
        }
    }

    public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private zoijcleaow() {
    }
}
