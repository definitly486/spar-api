package ru.myspar.legacy.presentation.screen.review;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nufgyqmvbu {

    public static final class iobyxmoadg extends nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Throwable f89582iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Throwable error) {
            super(null);
            zdlpuopuiu.btonecajqb(error, "error");
            this.f89582iobyxmoadg = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f89582iobyxmoadg, ((iobyxmoadg) obj).f89582iobyxmoadg);
        }

        public int hashCode() {
            return this.f89582iobyxmoadg.hashCode();
        }

        public final Throwable iobyxmoadg() {
            return this.f89582iobyxmoadg;
        }

        public String toString() {
            return "ShowError(error=" + this.f89582iobyxmoadg + ")";
        }
    }

    public static final class zoijcleaow extends nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f89583iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f89584zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String productArticle, String productName) {
            super(null);
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            zdlpuopuiu.btonecajqb(productName, "productName");
            this.f89583iobyxmoadg = productArticle;
            this.f89584zoijcleaow = productName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f89583iobyxmoadg, zoijcleaowVar.f89583iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f89584zoijcleaow, zoijcleaowVar.f89584zoijcleaow);
        }

        public int hashCode() {
            return (this.f89583iobyxmoadg.hashCode() * 31) + this.f89584zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f89583iobyxmoadg;
        }

        public String toString() {
            return "ShowRateProductDialog(productArticle=" + this.f89583iobyxmoadg + ", productName=" + this.f89584zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f89584zoijcleaow;
        }
    }

    public /* synthetic */ nufgyqmvbu(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private nufgyqmvbu() {
    }
}
