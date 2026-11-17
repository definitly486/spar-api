package my1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.purchases.impl.lists.presentation.model.PurchaseListUiModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f68171iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String id2) {
            super(null);
            zdlpuopuiu.btonecajqb(id2, "id");
            this.f68171iobyxmoadg = id2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f68171iobyxmoadg, ((eablkybsjg) obj).f68171iobyxmoadg);
        }

        public int hashCode() {
            return this.f68171iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f68171iobyxmoadg;
        }

        public String toString() {
            return "OnPurchaseListDeleteConfirmed(id=" + this.f68171iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f68172iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 1040540677;
        }

        public String toString() {
            return "UpdatePurchaseLists";
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f68173iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1290261659;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListUiModel f68174iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(PurchaseListUiModel item) {
            super(null);
            zdlpuopuiu.btonecajqb(item, "item");
            this.f68174iobyxmoadg = item;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f68174iobyxmoadg, ((ppxfxbqfkf) obj).f68174iobyxmoadg);
        }

        public int hashCode() {
            return this.f68174iobyxmoadg.hashCode();
        }

        public final PurchaseListUiModel iobyxmoadg() {
            return this.f68174iobyxmoadg;
        }

        public String toString() {
            return "OnPurchaseListClicked(item=" + this.f68174iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: my1.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C1466wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f68175iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1466wkgbmnqykc(String id2) {
            super(null);
            zdlpuopuiu.btonecajqb(id2, "id");
            this.f68175iobyxmoadg = id2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1466wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f68175iobyxmoadg, ((C1466wkgbmnqykc) obj).f68175iobyxmoadg);
        }

        public int hashCode() {
            return this.f68175iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f68175iobyxmoadg;
        }

        public String toString() {
            return "OnPurchaseListDeleteClicked(id=" + this.f68175iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f68176iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -413138359;
        }

        public String toString() {
            return "OnCreateNewPurchaseListClicked";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
