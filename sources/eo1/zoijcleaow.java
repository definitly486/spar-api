package eo1;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f31661ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f31662wkgbmnqykc = 8;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final do1.iobyxmoadg f31663zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: renamed from: eo1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C0679zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f31664iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final double f31665ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f31666zoijcleaow;

        public C0679zoijcleaow(String article, List exciseMarks, double d13) {
            zdlpuopuiu.btonecajqb(article, "article");
            zdlpuopuiu.btonecajqb(exciseMarks, "exciseMarks");
            this.f31664iobyxmoadg = article;
            this.f31666zoijcleaow = exciseMarks;
            this.f31665ppxfxbqfkf = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0679zoijcleaow)) {
                return false;
            }
            C0679zoijcleaow c0679zoijcleaow = (C0679zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f31664iobyxmoadg, c0679zoijcleaow.f31664iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f31666zoijcleaow, c0679zoijcleaow.f31666zoijcleaow) && Double.compare(this.f31665ppxfxbqfkf, c0679zoijcleaow.f31665ppxfxbqfkf) == 0;
        }

        public int hashCode() {
            return (((this.f31664iobyxmoadg.hashCode() * 31) + this.f31666zoijcleaow.hashCode()) * 31) + Double.hashCode(this.f31665ppxfxbqfkf);
        }

        public final String iobyxmoadg() {
            return this.f31664iobyxmoadg;
        }

        public final double ppxfxbqfkf() {
            return this.f31665ppxfxbqfkf;
        }

        public String toString() {
            return "Params(article=" + this.f31664iobyxmoadg + ", exciseMarks=" + this.f31666zoijcleaow + ", quantity=" + this.f31665ppxfxbqfkf + ")";
        }

        public final List zoijcleaow() {
            return this.f31666zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(do1.iobyxmoadg scanGoRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(scanGoRepository, "scanGoRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f31663zoijcleaow = scanGoRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0679zoijcleaow c0679zoijcleaow, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f31663zoijcleaow.nufgyqmvbu(c0679zoijcleaow.iobyxmoadg(), c0679zoijcleaow.ppxfxbqfkf(), c0679zoijcleaow.zoijcleaow(), gxszxtbevoVar);
    }
}
