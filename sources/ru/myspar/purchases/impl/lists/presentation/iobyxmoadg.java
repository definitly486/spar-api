package ru.myspar.purchases.impl.lists.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.purchases.impl.lists.presentation.model.PurchaseListUiModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {

    public static final class eablkybsjg extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102537iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String id2) {
            super(null);
            zdlpuopuiu.btonecajqb(id2, "id");
            this.f102537iobyxmoadg = id2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f102537iobyxmoadg, ((eablkybsjg) obj).f102537iobyxmoadg);
        }

        public int hashCode() {
            return this.f102537iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102537iobyxmoadg;
        }

        public String toString() {
            return "OnPurchaseListDeleteConfirmed(id=" + this.f102537iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f102538iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return 1375108645;
        }

        public String toString() {
            return "UpdatePurchaseLists";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.lists.presentation.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2479iobyxmoadg extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2479iobyxmoadg f102539iobyxmoadg = new C2479iobyxmoadg();

        private C2479iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2479iobyxmoadg);
        }

        public int hashCode() {
            return 163514043;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class ppxfxbqfkf extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PurchaseListUiModel f102540iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(PurchaseListUiModel item) {
            super(null);
            zdlpuopuiu.btonecajqb(item, "item");
            this.f102540iobyxmoadg = item;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f102540iobyxmoadg, ((ppxfxbqfkf) obj).f102540iobyxmoadg);
        }

        public int hashCode() {
            return this.f102540iobyxmoadg.hashCode();
        }

        public final PurchaseListUiModel iobyxmoadg() {
            return this.f102540iobyxmoadg;
        }

        public String toString() {
            return "OnPurchaseListClicked(item=" + this.f102540iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102541iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String id2) {
            super(null);
            zdlpuopuiu.btonecajqb(id2, "id");
            this.f102541iobyxmoadg = id2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f102541iobyxmoadg, ((wkgbmnqykc) obj).f102541iobyxmoadg);
        }

        public int hashCode() {
            return this.f102541iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102541iobyxmoadg;
        }

        public String toString() {
            return "OnPurchaseListDeleteClicked(id=" + this.f102541iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f102542iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -924166626;
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
