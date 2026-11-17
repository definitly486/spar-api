package ru.myspar.proloyalty.purchases.impl.lists.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.purchases.impl.lists.presentation.model.PurchaseListUiModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {

    public static final class eablkybsjg extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99823iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String id2) {
            super(null);
            zdlpuopuiu.btonecajqb(id2, "id");
            this.f99823iobyxmoadg = id2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f99823iobyxmoadg, ((eablkybsjg) obj).f99823iobyxmoadg);
        }

        public int hashCode() {
            return this.f99823iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99823iobyxmoadg;
        }

        public String toString() {
            return "OnPurchaseListDeleteConfirmed(id=" + this.f99823iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f99824iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 973893922;
        }

        public String toString() {
            return "UpdatePurchaseLists";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.lists.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2397iobyxmoadg extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2397iobyxmoadg f99825iobyxmoadg = new C2397iobyxmoadg();

        private C2397iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2397iobyxmoadg);
        }

        public int hashCode() {
            return -367903880;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class ppxfxbqfkf extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListUiModel f99826iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(PurchaseListUiModel item) {
            super(null);
            zdlpuopuiu.btonecajqb(item, "item");
            this.f99826iobyxmoadg = item;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f99826iobyxmoadg, ((ppxfxbqfkf) obj).f99826iobyxmoadg);
        }

        public int hashCode() {
            return this.f99826iobyxmoadg.hashCode();
        }

        public final PurchaseListUiModel iobyxmoadg() {
            return this.f99826iobyxmoadg;
        }

        public String toString() {
            return "OnPurchaseListClicked(item=" + this.f99826iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99827iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String id2) {
            super(null);
            zdlpuopuiu.btonecajqb(id2, "id");
            this.f99827iobyxmoadg = id2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f99827iobyxmoadg, ((wkgbmnqykc) obj).f99827iobyxmoadg);
        }

        public int hashCode() {
            return this.f99827iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99827iobyxmoadg;
        }

        public String toString() {
            return "OnPurchaseListDeleteClicked(id=" + this.f99827iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f99828iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -22773093;
        }

        public String toString() {
            return "OnCreateNewPurchaseList";
        }
    }

    public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private iobyxmoadg() {
    }
}
