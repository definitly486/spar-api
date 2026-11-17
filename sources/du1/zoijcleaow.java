package du1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements b21.ppxfxbqfkf {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f29629jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f29630yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f29631zdlpuopuiu;

    public zoijcleaow(String url, String name, String itemId) {
        zdlpuopuiu.btonecajqb(url, "url");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        this.f29631zdlpuopuiu = url;
        this.f29630yggfygwlhe = name;
        this.f29629jyumaefscl = itemId;
    }

    public final String agtfadlqog() {
        return this.f29631zdlpuopuiu;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f29631zdlpuopuiu, zoijcleaowVar.f29631zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f29630yggfygwlhe, zoijcleaowVar.f29630yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f29629jyumaefscl, zoijcleaowVar.f29629jyumaefscl);
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.f29629jyumaefscl;
    }

    public int hashCode() {
        return (((this.f29631zdlpuopuiu.hashCode() * 31) + this.f29630yggfygwlhe.hashCode()) * 31) + this.f29629jyumaefscl.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f29630yggfygwlhe;
    }

    public String toString() {
        return "SubscriptionProductUiModel(url=" + this.f29631zdlpuopuiu + ", name=" + this.f29630yggfygwlhe + ", itemId=" + this.f29629jyumaefscl + ")";
    }

    public /* synthetic */ zoijcleaow(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, (i13 & 4) != 0 ? str2 : str3);
    }
}
