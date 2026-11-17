package ru.myspar.promo_collection.impl.presentation;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.components.promo_collection.api.models.PromoCollectionItem;

/* JADX INFO: loaded from: classes6.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f102201iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1231968972;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    /* JADX INFO: renamed from: ru.myspar.promo_collection.impl.presentation.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2463zoijcleaow implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PromoCollectionItem f102202iobyxmoadg;

        public C2463zoijcleaow(PromoCollectionItem promoCollectionItem) {
            zdlpuopuiu.btonecajqb(promoCollectionItem, "promoCollectionItem");
            this.f102202iobyxmoadg = promoCollectionItem;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2463zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f102202iobyxmoadg, ((C2463zoijcleaow) obj).f102202iobyxmoadg);
        }

        public int hashCode() {
            return this.f102202iobyxmoadg.hashCode();
        }

        public final PromoCollectionItem iobyxmoadg() {
            return this.f102202iobyxmoadg;
        }

        public String toString() {
            return "OnPromoCollectionItemClicked(promoCollectionItem=" + this.f102202iobyxmoadg + ")";
        }
    }
}
