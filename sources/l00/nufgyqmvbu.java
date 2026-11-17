package l00;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface nufgyqmvbu {

    public static final class iobyxmoadg implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f61291iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f61292ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f61293zoijcleaow;

        public iobyxmoadg(List productSourceDataList, List warnings, List limitedProductsIds) {
            zdlpuopuiu.btonecajqb(productSourceDataList, "productSourceDataList");
            zdlpuopuiu.btonecajqb(warnings, "warnings");
            zdlpuopuiu.btonecajqb(limitedProductsIds, "limitedProductsIds");
            this.f61291iobyxmoadg = productSourceDataList;
            this.f61293zoijcleaow = warnings;
            this.f61292ppxfxbqfkf = limitedProductsIds;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f61291iobyxmoadg, iobyxmoadgVar.f61291iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f61293zoijcleaow, iobyxmoadgVar.f61293zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f61292ppxfxbqfkf, iobyxmoadgVar.f61292ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f61291iobyxmoadg.hashCode() * 31) + this.f61293zoijcleaow.hashCode()) * 31) + this.f61292ppxfxbqfkf.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f61292ppxfxbqfkf;
        }

        public final List ppxfxbqfkf() {
            return this.f61293zoijcleaow;
        }

        public String toString() {
            return "ChangeCartResult(productSourceDataList=" + this.f61291iobyxmoadg + ", warnings=" + this.f61293zoijcleaow + ", limitedProductsIds=" + this.f61292ppxfxbqfkf + ")";
        }

        public final List zoijcleaow() {
            return this.f61291iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f61294iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1598706039;
        }

        public String toString() {
            return "Empty";
        }
    }

    public static final class zoijcleaow implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f61295iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f61296ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f61297zoijcleaow;

        public zoijcleaow(List productSourceDataList, List warnings, List limitedProductsIds) {
            zdlpuopuiu.btonecajqb(productSourceDataList, "productSourceDataList");
            zdlpuopuiu.btonecajqb(warnings, "warnings");
            zdlpuopuiu.btonecajqb(limitedProductsIds, "limitedProductsIds");
            this.f61295iobyxmoadg = productSourceDataList;
            this.f61297zoijcleaow = warnings;
            this.f61296ppxfxbqfkf = limitedProductsIds;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f61295iobyxmoadg, zoijcleaowVar.f61295iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f61297zoijcleaow, zoijcleaowVar.f61297zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f61296ppxfxbqfkf, zoijcleaowVar.f61296ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f61295iobyxmoadg.hashCode() * 31) + this.f61297zoijcleaow.hashCode()) * 31) + this.f61296ppxfxbqfkf.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f61296ppxfxbqfkf;
        }

        public final List ppxfxbqfkf() {
            return this.f61297zoijcleaow;
        }

        public String toString() {
            return "ChangeOrderResult(productSourceDataList=" + this.f61295iobyxmoadg + ", warnings=" + this.f61297zoijcleaow + ", limitedProductsIds=" + this.f61296ppxfxbqfkf + ")";
        }

        public final List zoijcleaow() {
            return this.f61295iobyxmoadg;
        }
    }
}
