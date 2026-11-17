package ni1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.components.promo_collection.api.models.PromoCollectionInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface gxszxtbevo {

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f70147iobyxmoadg;

        public iobyxmoadg(List items) {
            zdlpuopuiu.btonecajqb(items, "items");
            this.f70147iobyxmoadg = items;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f70147iobyxmoadg, ((iobyxmoadg) obj).f70147iobyxmoadg);
        }

        public int hashCode() {
            return this.f70147iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f70147iobyxmoadg;
        }

        public String toString() {
            return "CollectionItemsChanged(items=" + this.f70147iobyxmoadg + ")";
        }
    }

    public static final class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f70148iobyxmoadg;

        public ppxfxbqfkf(boolean z13) {
            this.f70148iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f70148iobyxmoadg == ((ppxfxbqfkf) obj).f70148iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f70148iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f70148iobyxmoadg;
        }

        public String toString() {
            return "SetLoading(isLoading=" + this.f70148iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final PromoCollectionInfo f70149iobyxmoadg;

        public zoijcleaow(PromoCollectionInfo promoCollectionInfo) {
            zdlpuopuiu.btonecajqb(promoCollectionInfo, "promoCollectionInfo");
            this.f70149iobyxmoadg = promoCollectionInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f70149iobyxmoadg, ((zoijcleaow) obj).f70149iobyxmoadg);
        }

        public int hashCode() {
            return this.f70149iobyxmoadg.hashCode();
        }

        public final PromoCollectionInfo iobyxmoadg() {
            return this.f70149iobyxmoadg;
        }

        public String toString() {
            return "Init(promoCollectionInfo=" + this.f70149iobyxmoadg + ")";
        }
    }
}
