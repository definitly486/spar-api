package az0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.handler.ProductMessageType;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f14794iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f14795ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ProductMessageType f14796zoijcleaow;

    public iobyxmoadg(String productId, ProductMessageType messageType, long j13) {
        zdlpuopuiu.btonecajqb(productId, "productId");
        zdlpuopuiu.btonecajqb(messageType, "messageType");
        this.f14794iobyxmoadg = productId;
        this.f14796zoijcleaow = messageType;
        this.f14795ppxfxbqfkf = j13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zdlpuopuiu.eablkybsjg(iobyxmoadg.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type ru.myspar.proloyalty.core.domain.handler.ProductMessage");
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        if (zdlpuopuiu.eablkybsjg(this.f14794iobyxmoadg, iobyxmoadgVar.f14794iobyxmoadg)) {
            return zdlpuopuiu.eablkybsjg(this.f14796zoijcleaow, iobyxmoadgVar.f14796zoijcleaow);
        }
        return false;
    }

    public int hashCode() {
        return (this.f14794iobyxmoadg.hashCode() * 31) + this.f14796zoijcleaow.hashCode();
    }

    public final long iobyxmoadg() {
        return this.f14795ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f14794iobyxmoadg;
    }

    public final ProductMessageType zoijcleaow() {
        return this.f14796zoijcleaow;
    }
}
