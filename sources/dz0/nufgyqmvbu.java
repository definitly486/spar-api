package dz0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface nufgyqmvbu {

    public static final class iobyxmoadg implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f30044iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f30045ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f30046zoijcleaow;

        public iobyxmoadg(List productSourceDataList, List warnings, List limitedProductsIds) {
            zdlpuopuiu.btonecajqb(productSourceDataList, "productSourceDataList");
            zdlpuopuiu.btonecajqb(warnings, "warnings");
            zdlpuopuiu.btonecajqb(limitedProductsIds, "limitedProductsIds");
            this.f30044iobyxmoadg = productSourceDataList;
            this.f30046zoijcleaow = warnings;
            this.f30045ppxfxbqfkf = limitedProductsIds;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f30044iobyxmoadg, iobyxmoadgVar.f30044iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f30046zoijcleaow, iobyxmoadgVar.f30046zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f30045ppxfxbqfkf, iobyxmoadgVar.f30045ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f30044iobyxmoadg.hashCode() * 31) + this.f30046zoijcleaow.hashCode()) * 31) + this.f30045ppxfxbqfkf.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f30045ppxfxbqfkf;
        }

        public final List ppxfxbqfkf() {
            return this.f30046zoijcleaow;
        }

        public String toString() {
            return "ChangeCartResult(productSourceDataList=" + this.f30044iobyxmoadg + ", warnings=" + this.f30046zoijcleaow + ", limitedProductsIds=" + this.f30045ppxfxbqfkf + ")";
        }

        public final List zoijcleaow() {
            return this.f30044iobyxmoadg;
        }
    }

    public static final class ppxfxbqfkf implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final ppxfxbqfkf f30047iobyxmoadg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -1820597076;
        }

        public String toString() {
            return "Empty";
        }
    }

    public static final class zoijcleaow implements nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f30048iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f30049ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f30050zoijcleaow;

        public zoijcleaow(List productSourceDataList, List warnings, List limitedProductsIds) {
            zdlpuopuiu.btonecajqb(productSourceDataList, "productSourceDataList");
            zdlpuopuiu.btonecajqb(warnings, "warnings");
            zdlpuopuiu.btonecajqb(limitedProductsIds, "limitedProductsIds");
            this.f30048iobyxmoadg = productSourceDataList;
            this.f30050zoijcleaow = warnings;
            this.f30049ppxfxbqfkf = limitedProductsIds;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f30048iobyxmoadg, zoijcleaowVar.f30048iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f30050zoijcleaow, zoijcleaowVar.f30050zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f30049ppxfxbqfkf, zoijcleaowVar.f30049ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f30048iobyxmoadg.hashCode() * 31) + this.f30050zoijcleaow.hashCode()) * 31) + this.f30049ppxfxbqfkf.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f30049ppxfxbqfkf;
        }

        public final List ppxfxbqfkf() {
            return this.f30050zoijcleaow;
        }

        public String toString() {
            return "ChangeOrderResult(productSourceDataList=" + this.f30048iobyxmoadg + ", warnings=" + this.f30050zoijcleaow + ", limitedProductsIds=" + this.f30049ppxfxbqfkf + ")";
        }

        public final List zoijcleaow() {
            return this.f30048iobyxmoadg;
        }
    }
}
