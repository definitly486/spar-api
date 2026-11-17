package ru.myspar.proloyalty.promo_collection.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.components.promo_collection.api.models.PromoCollectionItem;

/* JADX INFO: loaded from: classes6.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f99493iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -759056233;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.promo_collection.impl.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2381zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PromoCollectionItem f99494iobyxmoadg;

        public C2381zoijcleaow(PromoCollectionItem promoCollectionItem) {
            zdlpuopuiu.btonecajqb(promoCollectionItem, "promoCollectionItem");
            this.f99494iobyxmoadg = promoCollectionItem;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2381zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f99494iobyxmoadg, ((C2381zoijcleaow) obj).f99494iobyxmoadg);
        }

        public int hashCode() {
            return this.f99494iobyxmoadg.hashCode();
        }

        public final PromoCollectionItem iobyxmoadg() {
            return this.f99494iobyxmoadg;
        }

        public String toString() {
            return "OnPromoCollectionItemClicked(promoCollectionItem=" + this.f99494iobyxmoadg + ")";
        }
    }
}
