package hx1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f41277iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 2000490889;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f41278iobyxmoadg;

        public zoijcleaow(String promoCollectionItemId) {
            zdlpuopuiu.btonecajqb(promoCollectionItemId, "promoCollectionItemId");
            this.f41278iobyxmoadg = promoCollectionItemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f41278iobyxmoadg, ((zoijcleaow) obj).f41278iobyxmoadg);
        }

        public int hashCode() {
            return this.f41278iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f41278iobyxmoadg;
        }

        public String toString() {
            return "OnPromoCollectionItemClicked(promoCollectionItemId=" + this.f41278iobyxmoadg + ")";
        }
    }
}
