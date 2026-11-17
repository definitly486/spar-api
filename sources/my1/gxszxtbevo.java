package my1;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gxszxtbevo {

    public static final class iobyxmoadg extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f68146iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f68147zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(boolean z13, List purchaseLists) {
            super(null);
            zdlpuopuiu.btonecajqb(purchaseLists, "purchaseLists");
            this.f68146iobyxmoadg = z13;
            this.f68147zoijcleaow = purchaseLists;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f68146iobyxmoadg == iobyxmoadgVar.f68146iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f68147zoijcleaow, iobyxmoadgVar.f68147zoijcleaow);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f68146iobyxmoadg) * 31) + this.f68147zoijcleaow.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f68147zoijcleaow;
        }

        public String toString() {
            return "ProcessPurchases(isLoading=" + this.f68146iobyxmoadg + ", purchaseLists=" + this.f68147zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f68146iobyxmoadg;
        }
    }

    public static final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f68148iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f68149zoijcleaow;

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
            return this.f68148iobyxmoadg == zoijcleaowVar.f68148iobyxmoadg && this.f68149zoijcleaow == zoijcleaowVar.f68149zoijcleaow;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f68148iobyxmoadg) * 31) + Boolean.hashCode(this.f68149zoijcleaow);
        }

        public final boolean iobyxmoadg() {
            return this.f68149zoijcleaow;
        }

        public String toString() {
            return "PurchasesIsLoading(isLoading=" + this.f68148iobyxmoadg + ", isInitializing=" + this.f68149zoijcleaow + ")";
        }

        public final boolean zoijcleaow() {
            return this.f68148iobyxmoadg;
        }

        public zoijcleaow(boolean z13, boolean z14) {
            super(null);
            this.f68148iobyxmoadg = z13;
            this.f68149zoijcleaow = z14;
        }
    }

    public /* synthetic */ gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private gxszxtbevo() {
    }
}
