package w22;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final h22.iobyxmoadg f118611zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f118612iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final double f118613ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f118614zoijcleaow;

        public iobyxmoadg(String article, List exciseMarks, double d13) {
            zdlpuopuiu.btonecajqb(article, "article");
            zdlpuopuiu.btonecajqb(exciseMarks, "exciseMarks");
            this.f118612iobyxmoadg = article;
            this.f118614zoijcleaow = exciseMarks;
            this.f118613ppxfxbqfkf = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f118612iobyxmoadg, iobyxmoadgVar.f118612iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118614zoijcleaow, iobyxmoadgVar.f118614zoijcleaow) && Double.compare(this.f118613ppxfxbqfkf, iobyxmoadgVar.f118613ppxfxbqfkf) == 0;
        }

        public int hashCode() {
            return (((this.f118612iobyxmoadg.hashCode() * 31) + this.f118614zoijcleaow.hashCode()) * 31) + Double.hashCode(this.f118613ppxfxbqfkf);
        }

        public final String iobyxmoadg() {
            return this.f118612iobyxmoadg;
        }

        public final double ppxfxbqfkf() {
            return this.f118613ppxfxbqfkf;
        }

        public String toString() {
            return "Params(article=" + this.f118612iobyxmoadg + ", exciseMarks=" + this.f118614zoijcleaow + ", quantity=" + this.f118613ppxfxbqfkf + ")";
        }

        public final List zoijcleaow() {
            return this.f118614zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(h22.iobyxmoadg scanGoRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(scanGoRepository, "scanGoRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f118611zoijcleaow = scanGoRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f118611zoijcleaow.nufgyqmvbu(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.zoijcleaow(), gxszxtbevoVar);
    }
}
