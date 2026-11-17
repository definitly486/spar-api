package h61;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.promo.Promotion;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final eablkybsjg f39726iobyxmoadg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }
    }

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Promotion.PromotionItem f39727iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Promotion.PromotionItem promotion) {
            super(null);
            zdlpuopuiu.btonecajqb(promotion, "promotion");
            this.f39727iobyxmoadg = promotion;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39727iobyxmoadg, ((iobyxmoadg) obj).f39727iobyxmoadg);
        }

        public int hashCode() {
            return this.f39727iobyxmoadg.hashCode();
        }

        public final Promotion.PromotionItem iobyxmoadg() {
            return this.f39727iobyxmoadg;
        }

        public String toString() {
            return "OnActivateClicked(promotion=" + this.f39727iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Promotion.PromotionItem f39728iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Promotion.PromotionItem promotion) {
            super(null);
            zdlpuopuiu.btonecajqb(promotion, "promotion");
            this.f39728iobyxmoadg = promotion;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f39728iobyxmoadg, ((ppxfxbqfkf) obj).f39728iobyxmoadg);
        }

        public int hashCode() {
            return this.f39728iobyxmoadg.hashCode();
        }

        public final Promotion.PromotionItem iobyxmoadg() {
            return this.f39728iobyxmoadg;
        }

        public String toString() {
            return "OnPromoItemClicked(promotion=" + this.f39728iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: h61.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static final class C0918wkgbmnqykc extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C0918wkgbmnqykc f39729iobyxmoadg = new C0918wkgbmnqykc();

        private C0918wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final zoijcleaow f39730iobyxmoadg = new zoijcleaow();

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
