package ru.myspar.proloyalty.purchases.impl.specific.presentation;

import gg.pmvmpeiblj;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {

    public static final class eablkybsjg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f99883iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof eablkybsjg);
        }

        public int hashCode() {
            return -1324742720;
        }

        public String toString() {
            return "OnRepeatPurchaseClicked";
        }
    }

    public static final class gxszxtbevo extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99884iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f99885zoijcleaow;

        public /* synthetic */ gxszxtbevo(String str, int i13, gtknphoqwx gtknphoqwxVar) {
            this(str, i13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof gxszxtbevo)) {
                return false;
            }
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            return zdlpuopuiu.eablkybsjg(this.f99884iobyxmoadg, gxszxtbevoVar.f99884iobyxmoadg) && this.f99885zoijcleaow == gxszxtbevoVar.f99885zoijcleaow;
        }

        public int hashCode() {
            return (this.f99884iobyxmoadg.hashCode() * 31) + pmvmpeiblj.wkgbmnqykc(this.f99885zoijcleaow);
        }

        public final String iobyxmoadg() {
            return this.f99884iobyxmoadg;
        }

        public String toString() {
            return "OnSetRatingClicked(article=" + this.f99884iobyxmoadg + ", rating=" + pmvmpeiblj.eablkybsjg(this.f99885zoijcleaow) + ")";
        }

        public final int zoijcleaow() {
            return this.f99885zoijcleaow;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private gxszxtbevo(String article, int i13) {
            super(null);
            zdlpuopuiu.btonecajqb(article, "article");
            this.f99884iobyxmoadg = article;
            this.f99885zoijcleaow = i13;
        }
    }

    public static final class iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final wj1.iobyxmoadg.zoijcleaow f99886iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(wj1.iobyxmoadg.zoijcleaow params) {
            super(null);
            zdlpuopuiu.btonecajqb(params, "params");
            this.f99886iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99886iobyxmoadg, ((iobyxmoadg) obj).f99886iobyxmoadg);
        }

        public int hashCode() {
            return this.f99886iobyxmoadg.hashCode();
        }

        public final wj1.iobyxmoadg.zoijcleaow iobyxmoadg() {
            return this.f99886iobyxmoadg;
        }

        public String toString() {
            return "OnAddToCartClicked(params=" + this.f99886iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.purchases.impl.specific.presentation.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C2399ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final wj1.iobyxmoadg f99887iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2399ppxfxbqfkf(wj1.iobyxmoadg params) {
            super(null);
            zdlpuopuiu.btonecajqb(params, "params");
            this.f99887iobyxmoadg = params;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2399ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f99887iobyxmoadg, ((C2399ppxfxbqfkf) obj).f99887iobyxmoadg);
        }

        public int hashCode() {
            return this.f99887iobyxmoadg.hashCode();
        }

        public final wj1.iobyxmoadg iobyxmoadg() {
            return this.f99887iobyxmoadg;
        }

        public String toString() {
            return "OnCleaningCartButtonClicked(params=" + this.f99887iobyxmoadg + ")";
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f99888iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AnalyticElement.ProductItemElement f99889zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String article, AnalyticElement.ProductItemElement productItemElement) {
            super(null);
            zdlpuopuiu.btonecajqb(article, "article");
            zdlpuopuiu.btonecajqb(productItemElement, "productItemElement");
            this.f99888iobyxmoadg = article;
            this.f99889zoijcleaow = productItemElement;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof wkgbmnqykc)) {
                return false;
            }
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
            return zdlpuopuiu.eablkybsjg(this.f99888iobyxmoadg, wkgbmnqykcVar.f99888iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f99889zoijcleaow, wkgbmnqykcVar.f99889zoijcleaow);
        }

        public int hashCode() {
            return (this.f99888iobyxmoadg.hashCode() * 31) + this.f99889zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f99888iobyxmoadg;
        }

        public String toString() {
            return "OnProductClicked(article=" + this.f99888iobyxmoadg + ", productItemElement=" + this.f99889zoijcleaow + ")";
        }

        public final AnalyticElement.ProductItemElement zoijcleaow() {
            return this.f99889zoijcleaow;
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f99890iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 1731950197;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
