package w22;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final h22.iobyxmoadg f118608zoijcleaow;

    /* JADX INFO: renamed from: w22.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2950iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f118609iobyxmoadg;

        public C2950iobyxmoadg(String article) {
            zdlpuopuiu.btonecajqb(article, "article");
            this.f118609iobyxmoadg = article;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2950iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118609iobyxmoadg, ((C2950iobyxmoadg) obj).f118609iobyxmoadg);
        }

        public int hashCode() {
            return this.f118609iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f118609iobyxmoadg;
        }

        public String toString() {
            return "Params(article=" + this.f118609iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(h22.iobyxmoadg scanGoRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(scanGoRepository, "scanGoRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f118608zoijcleaow = scanGoRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C2950iobyxmoadg c2950iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        return this.f118608zoijcleaow.eablkybsjg(c2950iobyxmoadg.iobyxmoadg(), gxszxtbevoVar);
    }
}
