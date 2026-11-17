package k82;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow implements w30.ppxfxbqfkf {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f54196jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f54197yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f54198zdlpuopuiu;

    public zoijcleaow(String url, String name, String itemId) {
        zdlpuopuiu.btonecajqb(url, "url");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        this.f54198zdlpuopuiu = url;
        this.f54197yggfygwlhe = name;
        this.f54196jyumaefscl = itemId;
    }

    public final String agtfadlqog() {
        return this.f54198zdlpuopuiu;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f54198zdlpuopuiu, zoijcleaowVar.f54198zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f54197yggfygwlhe, zoijcleaowVar.f54197yggfygwlhe) && zdlpuopuiu.eablkybsjg(this.f54196jyumaefscl, zoijcleaowVar.f54196jyumaefscl);
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.f54196jyumaefscl;
    }

    public int hashCode() {
        return (((this.f54198zdlpuopuiu.hashCode() * 31) + this.f54197yggfygwlhe.hashCode()) * 31) + this.f54196jyumaefscl.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f54197yggfygwlhe;
    }

    public String toString() {
        return "SubscriptionProductUiModel(url=" + this.f54198zdlpuopuiu + ", name=" + this.f54197yggfygwlhe + ", itemId=" + this.f54196jyumaefscl + ")";
    }

    public /* synthetic */ zoijcleaow(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, (i13 & 4) != 0 ? str2 : str3);
    }
}
