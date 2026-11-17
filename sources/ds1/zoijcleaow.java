package ds1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements b21.ppxfxbqfkf {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f29445jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f29446yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f29447zdlpuopuiu;

    public zoijcleaow(String itemId, String serviceName, String serviceIcon) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(serviceName, "serviceName");
        zdlpuopuiu.btonecajqb(serviceIcon, "serviceIcon");
        this.f29447zdlpuopuiu = itemId;
        this.f29446yggfygwlhe = serviceName;
        this.f29445jyumaefscl = serviceIcon;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f29447zdlpuopuiu, zoijcleaowVar.f29447zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f29446yggfygwlhe, zoijcleaowVar.f29446yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f29445jyumaefscl, zoijcleaowVar.f29445jyumaefscl);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f29447zdlpuopuiu;
    }

    public int hashCode() {
        return (((this.f29447zdlpuopuiu.hashCode() * 31) + this.f29446yggfygwlhe.hashCode()) * 31) + this.f29445jyumaefscl.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f29445jyumaefscl;
    }

    public String toString() {
        return "ServiceIconUiModel(itemId=" + this.f29447zdlpuopuiu + ", serviceName=" + this.f29446yggfygwlhe + ", serviceIcon=" + this.f29445jyumaefscl + ")";
    }
}
