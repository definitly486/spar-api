package ur0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f114261iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f114262zoijcleaow;

    public zoijcleaow(String screenTag, List permissions) {
        zdlpuopuiu.btonecajqb(screenTag, "screenTag");
        zdlpuopuiu.btonecajqb(permissions, "permissions");
        this.f114261iobyxmoadg = screenTag;
        this.f114262zoijcleaow = permissions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f114261iobyxmoadg, zoijcleaowVar.f114261iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f114262zoijcleaow, zoijcleaowVar.f114262zoijcleaow);
    }

    public int hashCode() {
        return (this.f114261iobyxmoadg.hashCode() * 31) + this.f114262zoijcleaow.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f114262zoijcleaow;
    }

    public String toString() {
        return "PermissionRequestModel(screenTag=" + this.f114261iobyxmoadg + ", permissions=" + this.f114262zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f114261iobyxmoadg;
    }
}
