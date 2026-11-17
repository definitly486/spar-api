package hh1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f40405iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f40406ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f40407zoijcleaow;

    public ppxfxbqfkf(String code, String name, List banners) {
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(banners, "banners");
        this.f40405iobyxmoadg = code;
        this.f40407zoijcleaow = name;
        this.f40406ppxfxbqfkf = banners;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f40405iobyxmoadg, ppxfxbqfkfVar.f40405iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f40407zoijcleaow, ppxfxbqfkfVar.f40407zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f40406ppxfxbqfkf, ppxfxbqfkfVar.f40406ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f40405iobyxmoadg.hashCode() * 31) + this.f40407zoijcleaow.hashCode()) * 31) + this.f40406ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f40406ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f40407zoijcleaow;
    }

    public String toString() {
        return "BannerGroup(code=" + this.f40405iobyxmoadg + ", name=" + this.f40407zoijcleaow + ", banners=" + this.f40406ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f40405iobyxmoadg;
    }
}
