package ru.myspar.purchases.impl.specific.presentation;

import gg.pmvmpeiblj;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticElement;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class eablkybsjg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102598iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement.ProductItemElement f102599zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String article, AnalyticElement.ProductItemElement productItemElement) {
            super(null);
            zdlpuopuiu.btonecajqb(article, "article");
            zdlpuopuiu.btonecajqb(productItemElement, "productItemElement");
            this.f102598iobyxmoadg = article;
            this.f102599zoijcleaow = productItemElement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f102598iobyxmoadg, eablkybsjgVar.f102598iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f102599zoijcleaow, eablkybsjgVar.f102599zoijcleaow);
        }

        public int hashCode() {
            return (this.f102598iobyxmoadg.hashCode() * 31) + this.f102599zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f102598iobyxmoadg;
        }

        public String toString() {
            return "OnProductClicked(article=" + this.f102598iobyxmoadg + ", productItemElement=" + this.f102599zoijcleaow + ")";
        }

        public final AnalyticElement.ProductItemElement zoijcleaow() {
            return this.f102599zoijcleaow;
        }
    }

    public static final class gxszxtbevo extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final gxszxtbevo f102600iobyxmoadg = new gxszxtbevo();

        private gxszxtbevo() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof gxszxtbevo);
        }

        public int hashCode() {
            return -1333902781;
        }

        public String toString() {
            return "OnRepeatPurchaseClicked";
        }
    }

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final qy1.iobyxmoadg.zoijcleaow f102601iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(qy1.iobyxmoadg.zoijcleaow params) {
            super(null);
            zdlpuopuiu.btonecajqb(params, "params");
            this.f102601iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f102601iobyxmoadg, ((iobyxmoadg) obj).f102601iobyxmoadg);
        }

        public int hashCode() {
            return this.f102601iobyxmoadg.hashCode();
        }

        public final qy1.iobyxmoadg.zoijcleaow iobyxmoadg() {
            return this.f102601iobyxmoadg;
        }

        public String toString() {
            return "OnAddToCartClicked(params=" + this.f102601iobyxmoadg + ")";
        }
    }

    public static final class lqeggnwhkg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f102602iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f102603zoijcleaow;

        public /* synthetic */ lqeggnwhkg(String str, int i13, gtknphoqwx gtknphoqwxVar) {
            this(str, i13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof lqeggnwhkg)) {
                return false;
            }
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            return zdlpuopuiu.eablkybsjg(this.f102602iobyxmoadg, lqeggnwhkgVar.f102602iobyxmoadg) && this.f102603zoijcleaow == lqeggnwhkgVar.f102603zoijcleaow;
        }

        public int hashCode() {
            return (this.f102602iobyxmoadg.hashCode() * 31) + pmvmpeiblj.wkgbmnqykc(this.f102603zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f102602iobyxmoadg;
        }

        public String toString() {
            return "OnSetRatingClicked(article=" + this.f102602iobyxmoadg + ", rating=" + pmvmpeiblj.eablkybsjg(this.f102603zoijcleaow) + ")";
        }

        public final int zoijcleaow() {
            return this.f102603zoijcleaow;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private lqeggnwhkg(String article, int i13) {
            super(null);
            zdlpuopuiu.btonecajqb(article, "article");
            this.f102602iobyxmoadg = article;
            this.f102603zoijcleaow = i13;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.specific.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2481ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2481ppxfxbqfkf f102604iobyxmoadg = new C2481ppxfxbqfkf();

        private C2481ppxfxbqfkf() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2481ppxfxbqfkf);
        }

        public int hashCode() {
            return 681273528;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final qy1.iobyxmoadg f102605iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(qy1.iobyxmoadg params) {
            super(null);
            zdlpuopuiu.btonecajqb(params, "params");
            this.f102605iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f102605iobyxmoadg, ((wkgbmnqykc) obj).f102605iobyxmoadg);
        }

        public int hashCode() {
            return this.f102605iobyxmoadg.hashCode();
        }

        public final qy1.iobyxmoadg iobyxmoadg() {
            return this.f102605iobyxmoadg;
        }

        public String toString() {
            return "OnCleaningCartButtonClicked(params=" + this.f102605iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final qy1.iobyxmoadg f102606iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(qy1.iobyxmoadg params) {
            super(null);
            zdlpuopuiu.btonecajqb(params, "params");
            this.f102606iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f102606iobyxmoadg, ((zoijcleaow) obj).f102606iobyxmoadg);
        }

        public int hashCode() {
            return this.f102606iobyxmoadg.hashCode();
        }

        public final qy1.iobyxmoadg iobyxmoadg() {
            return this.f102606iobyxmoadg;
        }

        public String toString() {
            return "OnAvailableOnlyForPickupDialogConfirmed(params=" + this.f102606iobyxmoadg + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
