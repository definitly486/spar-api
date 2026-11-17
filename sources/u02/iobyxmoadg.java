package u02;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pkzmftpjix f112445ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final t02.iobyxmoadg f112446zoijcleaow;

    /* JADX INFO: renamed from: u02.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2767iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f112447iobyxmoadg;

        public C2767iobyxmoadg(String productArticle) {
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            this.f112447iobyxmoadg = productArticle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2767iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f112447iobyxmoadg, ((C2767iobyxmoadg) obj).f112447iobyxmoadg);
        }

        public int hashCode() {
            return this.f112447iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f112447iobyxmoadg;
        }

        public String toString() {
            return "Params(productArticle=" + this.f112447iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(t02.iobyxmoadg rateProductsRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(rateProductsRepository, "rateProductsRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f112446zoijcleaow = rateProductsRepository;
        this.f112445ppxfxbqfkf = coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C2767iobyxmoadg c2767iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        return this.f112446zoijcleaow.zoijcleaow(c2767iobyxmoadg.iobyxmoadg(), gxszxtbevoVar);
    }
}
