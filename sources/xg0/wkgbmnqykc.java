package xg0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f122339iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f122340ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f122341zoijcleaow;

    public wkgbmnqykc(String code, String name, String str) {
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(name, "name");
        this.f122339iobyxmoadg = code;
        this.f122341zoijcleaow = name;
        this.f122340ppxfxbqfkf = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f122339iobyxmoadg, wkgbmnqykcVar.f122339iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f122341zoijcleaow, wkgbmnqykcVar.f122341zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f122340ppxfxbqfkf, wkgbmnqykcVar.f122340ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((this.f122339iobyxmoadg.hashCode() * 31) + this.f122341zoijcleaow.hashCode()) * 31;
        String str = this.f122340ppxfxbqfkf;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f122339iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f122340ppxfxbqfkf;
    }

    public String toString() {
        return "Brand(code=" + this.f122339iobyxmoadg + ", name=" + this.f122341zoijcleaow + ", pic=" + this.f122340ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f122341zoijcleaow;
    }
}
