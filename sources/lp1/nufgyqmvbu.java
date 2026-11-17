package lp1;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.scango.impl.screens.scan.shop.domain.model.ShopQrPayload;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final do1.iobyxmoadg f63825zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ShopQrPayload f63826iobyxmoadg;

        public iobyxmoadg(ShopQrPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            this.f63826iobyxmoadg = payload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f63826iobyxmoadg, ((iobyxmoadg) obj).f63826iobyxmoadg);
        }

        public int hashCode() {
            return this.f63826iobyxmoadg.hashCode();
        }

        public final ShopQrPayload iobyxmoadg() {
            return this.f63826iobyxmoadg;
        }

        public String toString() {
            return "Params(payload=" + this.f63826iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(do1.iobyxmoadg scanGoRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(scanGoRepository, "scanGoRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f63825zoijcleaow = scanGoRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f63825zoijcleaow.lqeggnwhkg(iobyxmoadgVar.iobyxmoadg().getShopId(), gxszxtbevoVar);
    }
}
