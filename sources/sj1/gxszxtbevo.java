package sj1;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f107157iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f107158zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(boolean z13, List purchaseLists) {
            super(null);
            zdlpuopuiu.btonecajqb(purchaseLists, "purchaseLists");
            this.f107157iobyxmoadg = z13;
            this.f107158zoijcleaow = purchaseLists;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f107157iobyxmoadg == iobyxmoadgVar.f107157iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f107158zoijcleaow, iobyxmoadgVar.f107158zoijcleaow);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f107157iobyxmoadg) * 31) + this.f107158zoijcleaow.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f107158zoijcleaow;
        }

        public String toString() {
            return "ProcessPurchases(isLoading=" + this.f107157iobyxmoadg + ", purchaseLists=" + this.f107158zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f107157iobyxmoadg;
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f107159iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f107160zoijcleaow;

        public /* synthetic */ zoijcleaow(boolean z13, boolean z14, int i13, gtknphoqwx gtknphoqwxVar) {
            this(z13, (i13 & 2) != 0 ? false : z14);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f107159iobyxmoadg == zoijcleaowVar.f107159iobyxmoadg && this.f107160zoijcleaow == zoijcleaowVar.f107160zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f107159iobyxmoadg) * 31) + Boolean.hashCode(this.f107160zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f107160zoijcleaow;
        }

        public String toString() {
            return "PurchasesIsLoading(isLoading=" + this.f107159iobyxmoadg + ", isInitializing=" + this.f107160zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f107159iobyxmoadg;
        }

        public zoijcleaow(boolean z13, boolean z14) {
            super(null);
            this.f107159iobyxmoadg = z13;
            this.f107160zoijcleaow = z14;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
