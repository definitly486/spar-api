package lm1;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pkzmftpjix f63611ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final km1.iobyxmoadg f63612zoijcleaow;

    /* JADX INFO: renamed from: lm1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1297iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f63613iobyxmoadg;

        public C1297iobyxmoadg(String productArticle) {
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f63613iobyxmoadg = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1297iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f63613iobyxmoadg, ((C1297iobyxmoadg) obj).f63613iobyxmoadg);
        }

        public int hashCode() {
            return this.f63613iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f63613iobyxmoadg;
        }

        public String toString() {
            return "Params(productArticle=" + this.f63613iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(km1.iobyxmoadg rateProductsRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(rateProductsRepository, "rateProductsRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f63612zoijcleaow = rateProductsRepository;
        this.f63611ppxfxbqfkf = coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C1297iobyxmoadg c1297iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        return this.f63612zoijcleaow.zoijcleaow(c1297iobyxmoadg.iobyxmoadg(), gxszxtbevoVar);
    }
}
