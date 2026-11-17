package so1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final do1.iobyxmoadg f107784zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f107785iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final double f107786ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f107787zoijcleaow;

        public iobyxmoadg(String article, List exciseMarks, double d13) {
            zdlpuopuiu.btonecajqb(article, "article");
            zdlpuopuiu.btonecajqb(exciseMarks, "exciseMarks");
            this.f107785iobyxmoadg = article;
            this.f107787zoijcleaow = exciseMarks;
            this.f107786ppxfxbqfkf = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f107785iobyxmoadg, iobyxmoadgVar.f107785iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f107787zoijcleaow, iobyxmoadgVar.f107787zoijcleaow) && Double.compare(this.f107786ppxfxbqfkf, iobyxmoadgVar.f107786ppxfxbqfkf) == 0;
        }

        public int hashCode() {
            return (((this.f107785iobyxmoadg.hashCode() * 31) + this.f107787zoijcleaow.hashCode()) * 31) + Double.hashCode(this.f107786ppxfxbqfkf);
        }

        public final String iobyxmoadg() {
            return this.f107785iobyxmoadg;
        }

        public final double ppxfxbqfkf() {
            return this.f107786ppxfxbqfkf;
        }

        public String toString() {
            return "Params(article=" + this.f107785iobyxmoadg + ", exciseMarks=" + this.f107787zoijcleaow + ", quantity=" + this.f107786ppxfxbqfkf + ")";
        }

        public final List zoijcleaow() {
            return this.f107787zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(do1.iobyxmoadg scanGoRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(scanGoRepository, "scanGoRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f107784zoijcleaow = scanGoRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f107784zoijcleaow.nufgyqmvbu(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.zoijcleaow(), gxszxtbevoVar);
    }
}
