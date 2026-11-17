package nb0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f69528iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f69529zoijcleaow;

    public iobyxmoadg(String groupId, String groupName) {
        zdlpuopuiu.btonecajqb(groupId, "groupId");
        zdlpuopuiu.btonecajqb(groupName, "groupName");
        this.f69528iobyxmoadg = groupId;
        this.f69529zoijcleaow = groupName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f69528iobyxmoadg, iobyxmoadgVar.f69528iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f69529zoijcleaow, iobyxmoadgVar.f69529zoijcleaow);
    }

    public int hashCode() {
        return (this.f69528iobyxmoadg.hashCode() * 31) + this.f69529zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f69528iobyxmoadg;
    }

    public String toString() {
        return "BannerAnalyticsData(groupId=" + this.f69528iobyxmoadg + ", groupName=" + this.f69529zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f69529zoijcleaow;
    }
}
