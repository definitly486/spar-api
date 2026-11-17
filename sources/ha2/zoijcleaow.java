package ha2;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f39991iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f39992zoijcleaow;

    public zoijcleaow(String str, boolean z13) {
        this.f39991iobyxmoadg = str;
        this.f39992zoijcleaow = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f39991iobyxmoadg, zoijcleaowVar.f39991iobyxmoadg) && this.f39992zoijcleaow == zoijcleaowVar.f39992zoijcleaow;
    }

    public int hashCode() {
        String str = this.f39991iobyxmoadg;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.f39992zoijcleaow);
    }

    public final String iobyxmoadg() {
        return this.f39991iobyxmoadg;
    }

    public String toString() {
        return "UserChangeFavoriteParams(productId=" + this.f39991iobyxmoadg + ", isFavorite=" + this.f39992zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f39992zoijcleaow;
    }
}
