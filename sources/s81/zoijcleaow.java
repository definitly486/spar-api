package s81;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f105754eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f105755iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f105756ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f105757wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f105758zoijcleaow;

    public zoijcleaow(String title, String message, boolean z13, boolean z14, String version) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(message, "message");
        zdlpuopuiu.btonecajqb(version, "version");
        this.f105755iobyxmoadg = title;
        this.f105758zoijcleaow = message;
        this.f105756ppxfxbqfkf = z13;
        this.f105757wkgbmnqykc = z14;
        this.f105754eablkybsjg = version;
    }

    public final boolean eablkybsjg() {
        return this.f105757wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f105755iobyxmoadg, zoijcleaowVar.f105755iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f105758zoijcleaow, zoijcleaowVar.f105758zoijcleaow) && this.f105756ppxfxbqfkf == zoijcleaowVar.f105756ppxfxbqfkf && this.f105757wkgbmnqykc == zoijcleaowVar.f105757wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f105754eablkybsjg, zoijcleaowVar.f105754eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f105755iobyxmoadg.hashCode() * 31) + this.f105758zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f105756ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f105757wkgbmnqykc)) * 31) + this.f105754eablkybsjg.hashCode();
    }

    public final boolean iobyxmoadg() {
        return this.f105756ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f105755iobyxmoadg;
    }

    public String toString() {
        return "ForceUpdateConfig(title=" + this.f105755iobyxmoadg + ", message=" + this.f105758zoijcleaow + ", forceUpdate=" + this.f105756ppxfxbqfkf + ", isEnabled=" + this.f105757wkgbmnqykc + ", version=" + this.f105754eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f105754eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f105758zoijcleaow;
    }

    public /* synthetic */ zoijcleaow(String str, String str2, boolean z13, boolean z14, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? "" : str3);
    }
}
