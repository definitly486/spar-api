package p32;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.scango.impl.screens.scan.shop.domain.model.ShopQrPayload;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final h22.iobyxmoadg f75569zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ShopQrPayload f75570iobyxmoadg;

        public iobyxmoadg(ShopQrPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            this.f75570iobyxmoadg = payload;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f75570iobyxmoadg, ((iobyxmoadg) obj).f75570iobyxmoadg);
        }

        public int hashCode() {
            return this.f75570iobyxmoadg.hashCode();
        }

        public final ShopQrPayload iobyxmoadg() {
            return this.f75570iobyxmoadg;
        }

        public String toString() {
            return "Params(payload=" + this.f75570iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(h22.iobyxmoadg scanGoRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(scanGoRepository, "scanGoRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f75569zoijcleaow = scanGoRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f75569zoijcleaow.lqeggnwhkg(iobyxmoadgVar.iobyxmoadg().getShopId(), gxszxtbevoVar);
    }
}
