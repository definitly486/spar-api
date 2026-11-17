package w70;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.promo.Promotion;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f118980iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Promotion.PromotionItem f118981iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Promotion.PromotionItem promotion) {
            super(null);
            zdlpuopuiu.btonecajqb(promotion, "promotion");
            this.f118981iobyxmoadg = promotion;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118981iobyxmoadg, ((iobyxmoadg) obj).f118981iobyxmoadg);
        }

        public int hashCode() {
            return this.f118981iobyxmoadg.hashCode();
        }

        public final Promotion.PromotionItem iobyxmoadg() {
            return this.f118981iobyxmoadg;
        }

        public String toString() {
            return "OnActivateClicked(promotion=" + this.f118981iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Promotion.PromotionItem f118982iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Promotion.PromotionItem promotion) {
            super(null);
            zdlpuopuiu.btonecajqb(promotion, "promotion");
            this.f118982iobyxmoadg = promotion;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f118982iobyxmoadg, ((ppxfxbqfkf) obj).f118982iobyxmoadg);
        }

        public int hashCode() {
            return this.f118982iobyxmoadg.hashCode();
        }

        public final Promotion.PromotionItem iobyxmoadg() {
            return this.f118982iobyxmoadg;
        }

        public String toString() {
            return "OnPromoItemClicked(promotion=" + this.f118982iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: w70.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C2967wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C2967wkgbmnqykc f118983iobyxmoadg = new C2967wkgbmnqykc();

        private C2967wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f118984iobyxmoadg = new zoijcleaow();

        private zoijcleaow() {
            super(null);
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
