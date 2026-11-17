package sj1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.purchases.impl.lists.presentation.model.PurchaseListUiModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f107182iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String id2) {
            super(null);
            zdlpuopuiu.btonecajqb(id2, "id");
            this.f107182iobyxmoadg = id2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f107182iobyxmoadg, ((eablkybsjg) obj).f107182iobyxmoadg);
        }

        public int hashCode() {
            return this.f107182iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f107182iobyxmoadg;
        }

        public String toString() {
            return "OnPurchaseListDeleteConfirmed(id=" + this.f107182iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f107183iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 1423505026;
        }

        public String toString() {
            return "UpdatePurchaseLists";
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f107184iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 612780248;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListUiModel f107185iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(PurchaseListUiModel item) {
            super(null);
            zdlpuopuiu.btonecajqb(item, "item");
            this.f107185iobyxmoadg = item;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f107185iobyxmoadg, ((ppxfxbqfkf) obj).f107185iobyxmoadg);
        }

        public int hashCode() {
            return this.f107185iobyxmoadg.hashCode();
        }

        public final PurchaseListUiModel iobyxmoadg() {
            return this.f107185iobyxmoadg;
        }

        public String toString() {
            return "OnPurchaseListClicked(item=" + this.f107185iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: sj1.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2631wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f107186iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2631wkgbmnqykc(String id2) {
            super(null);
            zdlpuopuiu.btonecajqb(id2, "id");
            this.f107186iobyxmoadg = id2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2631wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f107186iobyxmoadg, ((C2631wkgbmnqykc) obj).f107186iobyxmoadg);
        }

        public int hashCode() {
            return this.f107186iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f107186iobyxmoadg;
        }

        public String toString() {
            return "OnPurchaseListDeleteClicked(id=" + this.f107186iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f107187iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1891299244;
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
