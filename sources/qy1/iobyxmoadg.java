package qy1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes6.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: qy1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1804iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1804iobyxmoadg f80995iobyxmoadg = new C1804iobyxmoadg();

        private C1804iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1804iobyxmoadg);
        }

        public int hashCode() {
            return -753271760;
        }

        public String toString() {
            return "AllProducts";
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final boolean f80996eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f80997iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final MeasureType f80998ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f80999wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f81000zoijcleaow;

        public zoijcleaow(String article, double d13, MeasureType measureType, boolean z13, boolean z14) {
            zdlpuopuiu.btonecajqb(article, "article");
            zdlpuopuiu.btonecajqb(measureType, "measureType");
            this.f80997iobyxmoadg = article;
            this.f81000zoijcleaow = d13;
            this.f80998ppxfxbqfkf = measureType;
            this.f80999wkgbmnqykc = z13;
            this.f80996eablkybsjg = z14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f80997iobyxmoadg, zoijcleaowVar.f80997iobyxmoadg) && Double.compare(this.f81000zoijcleaow, zoijcleaowVar.f81000zoijcleaow) == 0 && zdlpuopuiu.eablkybsjg(this.f80998ppxfxbqfkf, zoijcleaowVar.f80998ppxfxbqfkf) && this.f80999wkgbmnqykc == zoijcleaowVar.f80999wkgbmnqykc && this.f80996eablkybsjg == zoijcleaowVar.f80996eablkybsjg;
        }

        public int hashCode() {
            return (((((((this.f80997iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f81000zoijcleaow)) * 31) + this.f80998ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f80999wkgbmnqykc)) * 31) + Boolean.hashCode(this.f80996eablkybsjg);
        }

        public final String iobyxmoadg() {
            return this.f80997iobyxmoadg;
        }

        public final double ppxfxbqfkf() {
            return this.f81000zoijcleaow;
        }

        public String toString() {
            return "ProductParams(article=" + this.f80997iobyxmoadg + ", quantity=" + this.f81000zoijcleaow + ", measureType=" + this.f80998ppxfxbqfkf + ", isOnlyPickup=" + this.f80999wkgbmnqykc + ", isAvailable=" + this.f80996eablkybsjg + ")";
        }

        public final boolean wkgbmnqykc() {
            return this.f80999wkgbmnqykc;
        }

        public final MeasureType zoijcleaow() {
            return this.f80998ppxfxbqfkf;
        }
    }
}
