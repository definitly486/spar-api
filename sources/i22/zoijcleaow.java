package i22;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f41815ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f41816wkgbmnqykc = 8;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final h22.iobyxmoadg f41817zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: renamed from: i22.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C0983zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f41818iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final double f41819ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f41820zoijcleaow;

        public C0983zoijcleaow(String article, List exciseMarks, double d13) {
            zdlpuopuiu.btonecajqb(article, "article");
            zdlpuopuiu.btonecajqb(exciseMarks, "exciseMarks");
            this.f41818iobyxmoadg = article;
            this.f41820zoijcleaow = exciseMarks;
            this.f41819ppxfxbqfkf = d13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0983zoijcleaow)) {
                return false;
            }
            C0983zoijcleaow c0983zoijcleaow = (C0983zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f41818iobyxmoadg, c0983zoijcleaow.f41818iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f41820zoijcleaow, c0983zoijcleaow.f41820zoijcleaow) && Double.compare(this.f41819ppxfxbqfkf, c0983zoijcleaow.f41819ppxfxbqfkf) == 0;
        }

        public int hashCode() {
            return (((this.f41818iobyxmoadg.hashCode() * 31) + this.f41820zoijcleaow.hashCode()) * 31) + Double.hashCode(this.f41819ppxfxbqfkf);
        }

        public final String iobyxmoadg() {
            return this.f41818iobyxmoadg;
        }

        public final double ppxfxbqfkf() {
            return this.f41819ppxfxbqfkf;
        }

        public String toString() {
            return "Params(article=" + this.f41818iobyxmoadg + ", exciseMarks=" + this.f41820zoijcleaow + ", quantity=" + this.f41819ppxfxbqfkf + ")";
        }

        public final List zoijcleaow() {
            return this.f41820zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(h22.iobyxmoadg scanGoRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(scanGoRepository, "scanGoRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f41817zoijcleaow = scanGoRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0983zoijcleaow c0983zoijcleaow, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f41817zoijcleaow.nufgyqmvbu(c0983zoijcleaow.iobyxmoadg(), c0983zoijcleaow.ppxfxbqfkf(), c0983zoijcleaow.zoijcleaow(), gxszxtbevoVar);
    }
}
