package m91;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f66615iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f66616zoijcleaow;

    public iobyxmoadg(String groupId, String groupName) {
        zdlpuopuiu.btonecajqb(groupId, "groupId");
        zdlpuopuiu.btonecajqb(groupName, "groupName");
        this.f66615iobyxmoadg = groupId;
        this.f66616zoijcleaow = groupName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f66615iobyxmoadg, iobyxmoadgVar.f66615iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f66616zoijcleaow, iobyxmoadgVar.f66616zoijcleaow);
    }

    public int hashCode() {
        return (this.f66615iobyxmoadg.hashCode() * 31) + this.f66616zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f66615iobyxmoadg;
    }

    public String toString() {
        return "BannerAnalyticsData(groupId=" + this.f66615iobyxmoadg + ", groupName=" + this.f66616zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f66616zoijcleaow;
    }
}
