package at;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f14466iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f14467zoijcleaow;

    public zoijcleaow(String screenTag, List permissions) {
        zdlpuopuiu.btonecajqb(screenTag, "screenTag");
        zdlpuopuiu.btonecajqb(permissions, "permissions");
        this.f14466iobyxmoadg = screenTag;
        this.f14467zoijcleaow = permissions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f14466iobyxmoadg, zoijcleaowVar.f14466iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f14467zoijcleaow, zoijcleaowVar.f14467zoijcleaow);
    }

    public int hashCode() {
        return (this.f14466iobyxmoadg.hashCode() * 31) + this.f14467zoijcleaow.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f14467zoijcleaow;
    }

    public String toString() {
        return "PermissionRequestModel(screenTag=" + this.f14466iobyxmoadg + ", permissions=" + this.f14467zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f14466iobyxmoadg;
    }
}
