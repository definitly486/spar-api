package i00;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.handler.ProductMessageType;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f41595iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f41596ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ProductMessageType f41597zoijcleaow;

    public iobyxmoadg(String productId, ProductMessageType messageType, long j13) {
        zdlpuopuiu.btonecajqb(productId, "productId");
        zdlpuopuiu.btonecajqb(messageType, "messageType");
        this.f41595iobyxmoadg = productId;
        this.f41597zoijcleaow = messageType;
        this.f41596ppxfxbqfkf = j13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zdlpuopuiu.eablkybsjg(iobyxmoadg.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type ru.myspar.core.domain.handler.ProductMessage");
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        if (zdlpuopuiu.eablkybsjg(this.f41595iobyxmoadg, iobyxmoadgVar.f41595iobyxmoadg)) {
            return zdlpuopuiu.eablkybsjg(this.f41597zoijcleaow, iobyxmoadgVar.f41597zoijcleaow);
        }
        return false;
    }

    public int hashCode() {
        return (this.f41595iobyxmoadg.hashCode() * 31) + this.f41597zoijcleaow.hashCode();
    }

    public final long iobyxmoadg() {
        return this.f41596ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f41595iobyxmoadg;
    }

    public final ProductMessageType zoijcleaow() {
        return this.f41597zoijcleaow;
    }
}
