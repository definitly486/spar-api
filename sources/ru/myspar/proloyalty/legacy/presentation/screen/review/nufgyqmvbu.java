package ru.myspar.proloyalty.legacy.presentation.screen.review;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class nufgyqmvbu {

    public static final class iobyxmoadg extends nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f97261iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f97261iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f97261iobyxmoadg, ((iobyxmoadg) obj).f97261iobyxmoadg);
        }

        public int hashCode() {
            return this.f97261iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f97261iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f97261iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f97262iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f97263zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String productArticle, String productName) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            zdlpuopuiu.btonecajqb(productName, "productName");
            this.f97262iobyxmoadg = productArticle;
            this.f97263zoijcleaow = productName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f97262iobyxmoadg, zoijcleaowVar.f97262iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f97263zoijcleaow, zoijcleaowVar.f97263zoijcleaow);
        }

        public int hashCode() {
            return (this.f97262iobyxmoadg.hashCode() * 31) + this.f97263zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f97262iobyxmoadg;
        }

        public String toString() {
            return "ShowRateProductDialog(productArticle=" + this.f97262iobyxmoadg + ", productName=" + this.f97263zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f97263zoijcleaow;
        }
    }

    public /* synthetic */ nufgyqmvbu(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private nufgyqmvbu() {
    }
}
