package wj1;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes6.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: wj1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3002iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C3002iobyxmoadg f120012iobyxmoadg = new C3002iobyxmoadg();

        private C3002iobyxmoadg() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C3002iobyxmoadg);
        }

        public int hashCode() {
            return -1430753171;
        }

        public String toString() {
            return "AllProducts";
        }
    }

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f120013iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final MeasureType f120014ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final double f120015zoijcleaow;

        public zoijcleaow(String article, double d13, MeasureType measureType) {
            zdlpuopuiu.btonecajqb(article, "article");
            zdlpuopuiu.btonecajqb(measureType, "measureType");
            this.f120013iobyxmoadg = article;
            this.f120015zoijcleaow = d13;
            this.f120014ppxfxbqfkf = measureType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f120013iobyxmoadg, zoijcleaowVar.f120013iobyxmoadg) && Double.compare(this.f120015zoijcleaow, zoijcleaowVar.f120015zoijcleaow) == 0 && zdlpuopuiu.eablkybsjg(this.f120014ppxfxbqfkf, zoijcleaowVar.f120014ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f120013iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f120015zoijcleaow)) * 31) + this.f120014ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f120013iobyxmoadg;
        }

        public final double ppxfxbqfkf() {
            return this.f120015zoijcleaow;
        }

        public String toString() {
            return "ProductParams(article=" + this.f120013iobyxmoadg + ", quantity=" + this.f120015zoijcleaow + ", measureType=" + this.f120014ppxfxbqfkf + ")";
        }

        public final MeasureType zoijcleaow() {
            return this.f120014ppxfxbqfkf;
        }
    }
}
