package k62;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements w30.ppxfxbqfkf {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f53945jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f53946yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f53947zdlpuopuiu;

    public zoijcleaow(String itemId, String serviceName, String serviceIcon) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(serviceName, "serviceName");
        zdlpuopuiu.btonecajqb(serviceIcon, "serviceIcon");
        this.f53947zdlpuopuiu = itemId;
        this.f53946yggfygwlhe = serviceName;
        this.f53945jyumaefscl = serviceIcon;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f53947zdlpuopuiu, zoijcleaowVar.f53947zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f53946yggfygwlhe, zoijcleaowVar.f53946yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f53945jyumaefscl, zoijcleaowVar.f53945jyumaefscl);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f53947zdlpuopuiu;
    }

    public int hashCode() {
        return (((this.f53947zdlpuopuiu.hashCode() * 31) + this.f53946yggfygwlhe.hashCode()) * 31) + this.f53945jyumaefscl.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f53945jyumaefscl;
    }

    public String toString() {
        return "ServiceIconUiModel(itemId=" + this.f53947zdlpuopuiu + ", serviceName=" + this.f53946yggfygwlhe + ", serviceIcon=" + this.f53945jyumaefscl + ")";
    }
}
