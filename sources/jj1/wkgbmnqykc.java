package jj1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    public static final class iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f51618iobyxmoadg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1545439468;
        }

        public String toString() {
            return "OnCreateNewPurchaseListClicked";
        }
    }

    public static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f51619iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String purchaseListId) {
            super(null);
            zdlpuopuiu.btonecajqb(purchaseListId, "purchaseListId");
            this.f51619iobyxmoadg = purchaseListId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f51619iobyxmoadg, ((zoijcleaow) obj).f51619iobyxmoadg);
        }

        public int hashCode() {
            return this.f51619iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f51619iobyxmoadg;
        }

        public String toString() {
            return "OnPurchaseListClicked(purchaseListId=" + this.f51619iobyxmoadg + ")";
        }
    }

    public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private wkgbmnqykc() {
    }
}
