package ma0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc implements iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f66662eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f66663iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f66664ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f66665wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f66666zoijcleaow;

    public wkgbmnqykc(String title, String message, boolean z13, boolean z14, String version) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(message, "message");
        zdlpuopuiu.btonecajqb(version, "version");
        this.f66663iobyxmoadg = title;
        this.f66666zoijcleaow = message;
        this.f66664ppxfxbqfkf = z13;
        this.f66665wkgbmnqykc = z14;
        this.f66662eablkybsjg = version;
    }

    public final boolean eablkybsjg() {
        return this.f66665wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f66663iobyxmoadg, wkgbmnqykcVar.f66663iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f66666zoijcleaow, wkgbmnqykcVar.f66666zoijcleaow) && this.f66664ppxfxbqfkf == wkgbmnqykcVar.f66664ppxfxbqfkf && this.f66665wkgbmnqykc == wkgbmnqykcVar.f66665wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f66662eablkybsjg, wkgbmnqykcVar.f66662eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f66663iobyxmoadg.hashCode() * 31) + this.f66666zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f66664ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f66665wkgbmnqykc)) * 31) + this.f66662eablkybsjg.hashCode();
    }

    public final boolean iobyxmoadg() {
        return this.f66664ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f66663iobyxmoadg;
    }

    public String toString() {
        return "ForceUpdateConfigModel(title=" + this.f66663iobyxmoadg + ", message=" + this.f66666zoijcleaow + ", forceUpdate=" + this.f66664ppxfxbqfkf + ", isEnabled=" + this.f66665wkgbmnqykc + ", version=" + this.f66662eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f66662eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f66666zoijcleaow;
    }

    public /* synthetic */ wkgbmnqykc(String str, String str2, boolean z13, boolean z14, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? "" : str3);
    }
}
