package ru.myspar.proloyalty.purchases.impl.list_details.presentation;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class eablkybsjg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99734iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String message) {
            super(null);
            zdlpuopuiu.btonecajqb(message, "message");
            this.f99734iobyxmoadg = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f99734iobyxmoadg, ((eablkybsjg) obj).f99734iobyxmoadg);
        }

        public int hashCode() {
            return this.f99734iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99734iobyxmoadg;
        }

        public String toString() {
            return "ShowMessageLimitAddedProduct(message=" + this.f99734iobyxmoadg + ")";
        }
    }

    public static final class gxszxtbevo extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f99735iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -832644045;
        }

        public String toString() {
            return "ShowMessageProductNotAvailable";
        }
    }

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final int f99736ppxfxbqfkf = HintDialogAnalyticsInfo.f93885iwizpuwonk;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final HintUiModel f99737iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final HintDialogAnalyticsInfo f99738zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
            super(null);
            zdlpuopuiu.btonecajqb(hint, "hint");
            zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
            this.f99737iobyxmoadg = hint;
            this.f99738zoijcleaow = analyticsInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f99737iobyxmoadg, iobyxmoadgVar.f99737iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99738zoijcleaow, iobyxmoadgVar.f99738zoijcleaow);
        }

        public int hashCode() {
            return (this.f99737iobyxmoadg.hashCode() * 31) + this.f99738zoijcleaow.hashCode();
        }

        public final HintDialogAnalyticsInfo iobyxmoadg() {
            return this.f99738zoijcleaow;
        }

        public String toString() {
            return "OnHintClicked(hint=" + this.f99737iobyxmoadg + ", analyticsInfo=" + this.f99738zoijcleaow + ")";
        }

        public final HintUiModel zoijcleaow() {
            return this.f99737iobyxmoadg;
        }
    }

    public static final class lqeggnwhkg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final lqeggnwhkg f99739iobyxmoadg = new lqeggnwhkg();

        private lqeggnwhkg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof lqeggnwhkg);
        }

        public int hashCode() {
            return 1992701920;
        }

        public String toString() {
            return "ShowMessageSuccessAddedProduct";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.list_details.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2392ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99740iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final gk1.iobyxmoadg f99741zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2392ppxfxbqfkf(String productId, gk1.iobyxmoadg section) {
            super(null);
            zdlpuopuiu.btonecajqb(productId, "productId");
            zdlpuopuiu.btonecajqb(section, "section");
            this.f99740iobyxmoadg = productId;
            this.f99741zoijcleaow = section;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2392ppxfxbqfkf)) {
                return false;
            }
            C2392ppxfxbqfkf c2392ppxfxbqfkf = (C2392ppxfxbqfkf) obj;
            return zdlpuopuiu.eablkybsjg(this.f99740iobyxmoadg, c2392ppxfxbqfkf.f99740iobyxmoadg) && this.f99741zoijcleaow == c2392ppxfxbqfkf.f99741zoijcleaow;
        }

        public int hashCode() {
            return (this.f99740iobyxmoadg.hashCode() * 31) + this.f99741zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99740iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogConfirmDeleteProductFromList(productId=" + this.f99740iobyxmoadg + ", section=" + this.f99741zoijcleaow + ")";
        }

        public final gk1.iobyxmoadg zoijcleaow() {
            return this.f99741zoijcleaow;
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f99742iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f99742iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f99742iobyxmoadg, ((wkgbmnqykc) obj).f99742iobyxmoadg);
        }

        public int hashCode() {
            return this.f99742iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f99742iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f99742iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final gk1.iobyxmoadg f99743iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(gk1.iobyxmoadg section) {
            super(null);
            zdlpuopuiu.btonecajqb(section, "section");
            this.f99743iobyxmoadg = section;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f99743iobyxmoadg == ((zoijcleaow) obj).f99743iobyxmoadg;
        }

        public int hashCode() {
            return this.f99743iobyxmoadg.hashCode();
        }

        public final gk1.iobyxmoadg iobyxmoadg() {
            return this.f99743iobyxmoadg;
        }

        public String toString() {
            return "ShowDialogActionsWithAllProducts(section=" + this.f99743iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
