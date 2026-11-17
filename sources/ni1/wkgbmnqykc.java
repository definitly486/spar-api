package ni1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public interface wkgbmnqykc {

    public static final class iobyxmoadg implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f70167iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 1203099692;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    public static final class zoijcleaow implements wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f70168iobyxmoadg;

        public zoijcleaow(String promoCollectionItemId) {
            zdlpuopuiu.btonecajqb(promoCollectionItemId, "promoCollectionItemId");
            this.f70168iobyxmoadg = promoCollectionItemId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f70168iobyxmoadg, ((zoijcleaow) obj).f70168iobyxmoadg);
        }

        public int hashCode() {
            return this.f70168iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f70168iobyxmoadg;
        }

        public String toString() {
            return "OnPromoCollectionItemClicked(promoCollectionItemId=" + this.f70168iobyxmoadg + ")";
        }
    }
}
