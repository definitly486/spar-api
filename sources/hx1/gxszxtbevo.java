package hx1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.components.promo_collection.api.models.PromoCollectionInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f41257iobyxmoadg;

        public iobyxmoadg(List items) {
            zdlpuopuiu.btonecajqb(items, "items");
            this.f41257iobyxmoadg = items;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f41257iobyxmoadg, ((iobyxmoadg) obj).f41257iobyxmoadg);
        }

        public int hashCode() {
            return this.f41257iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f41257iobyxmoadg;
        }

        public String toString() {
            return "CollectionItemsChanged(items=" + this.f41257iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f41258iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            this.f41258iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f41258iobyxmoadg == ((ppxfxbqfkf) obj).f41258iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f41258iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f41258iobyxmoadg;
        }

        public String toString() {
            return "SetLoading(isLoading=" + this.f41258iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PromoCollectionInfo f41259iobyxmoadg;

        public zoijcleaow(PromoCollectionInfo promoCollectionInfo) {
            zdlpuopuiu.btonecajqb(promoCollectionInfo, "promoCollectionInfo");
            this.f41259iobyxmoadg = promoCollectionInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f41259iobyxmoadg, ((zoijcleaow) obj).f41259iobyxmoadg);
        }

        public int hashCode() {
            return this.f41259iobyxmoadg.hashCode();
        }

        public final PromoCollectionInfo iobyxmoadg() {
            return this.f41259iobyxmoadg;
        }

        public String toString() {
            return "Init(promoCollectionInfo=" + this.f41259iobyxmoadg + ")";
        }
    }
}
