package nb2;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f69620iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final mb2.ppxfxbqfkf f69621zoijcleaow;

    public wkgbmnqykc(String uuid, mb2.ppxfxbqfkf metricsEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uuid, "uuid");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricsEvent, "metricsEvent");
        this.f69620iobyxmoadg = uuid;
        this.f69621zoijcleaow = metricsEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykc.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type ru.rustore.sdk.metrics.internal.domain.model.PersistentMetricsEvent");
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f69620iobyxmoadg, wkgbmnqykcVar.f69620iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f69621zoijcleaow, wkgbmnqykcVar.f69621zoijcleaow);
    }

    public final int hashCode() {
        return this.f69621zoijcleaow.hashCode() + (this.f69620iobyxmoadg.hashCode() * 31);
    }
}
