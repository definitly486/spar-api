package nb2;

/* JADX INFO: loaded from: classes6.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final mb2.ppxfxbqfkf f69603eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f69604iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f69605ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final String f69606wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f69607zoijcleaow;

    public rgvfuqvkyq(String packageName, String uuid, String userId, String str, mb2.ppxfxbqfkf metricsEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(packageName, "packageName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uuid, "uuid");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userId, "userId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricsEvent, "metricsEvent");
        this.f69604iobyxmoadg = packageName;
        this.f69607zoijcleaow = uuid;
        this.f69605ppxfxbqfkf = userId;
        this.f69606wkgbmnqykc = str;
        this.f69603eablkybsjg = metricsEvent;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    public final boolean equals(Object obj) {
        boolean zEablkybsjg;
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(rgvfuqvkyq.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type ru.rustore.sdk.metrics.internal.data.dto.RemoteMetricsEventDto");
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f69604iobyxmoadg, rgvfuqvkyqVar.f69604iobyxmoadg) || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f69607zoijcleaow, rgvfuqvkyqVar.f69607zoijcleaow) || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f69605ppxfxbqfkf, rgvfuqvkyqVar.f69605ppxfxbqfkf)) {
            return false;
        }
        String str = this.f69606wkgbmnqykc;
        String str2 = rgvfuqvkyqVar.f69606wkgbmnqykc;
        if (str == null) {
            if (str2 == null) {
                zEablkybsjg = true;
            } else {
                zEablkybsjg = false;
            }
        } else if (str2 == null) {
            zEablkybsjg = false;
        } else {
            zEablkybsjg = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, str2);
        }
        return zEablkybsjg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f69603eablkybsjg, rgvfuqvkyqVar.f69603eablkybsjg);
    }

    public final int hashCode() {
        int iHashCode = (this.f69605ppxfxbqfkf.hashCode() + ((this.f69607zoijcleaow.hashCode() + (this.f69604iobyxmoadg.hashCode() * 31)) * 31)) * 31;
        String str = this.f69606wkgbmnqykc;
        lmojexxdyd lmojexxdydVar = str != null ? new lmojexxdyd(str) : null;
        return this.f69603eablkybsjg.hashCode() + ((iHashCode + (lmojexxdydVar != null ? lmojexxdydVar.f69585iobyxmoadg.hashCode() : 0)) * 31);
    }
}
