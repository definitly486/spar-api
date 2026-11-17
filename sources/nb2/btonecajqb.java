package nb2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f69548iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final byte[] f69549zoijcleaow;

    public btonecajqb(String uuid, byte[] serializedMetricsEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uuid, "uuid");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(serializedMetricsEvent, "serializedMetricsEvent");
        this.f69548iobyxmoadg = uuid;
        this.f69549zoijcleaow = serializedMetricsEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(btonecajqb.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type ru.rustore.sdk.metrics.internal.data.dto.PersistentMetricsEventDto");
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f69548iobyxmoadg, btonecajqbVar.f69548iobyxmoadg) && Arrays.equals(this.f69549zoijcleaow, btonecajqbVar.f69549zoijcleaow);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f69549zoijcleaow) + (this.f69548iobyxmoadg.hashCode() * 31);
    }
}
