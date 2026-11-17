package xg0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f122324iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f122325ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f122326zoijcleaow;

    public iobyxmoadg(String code, String name, List banners) {
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(banners, "banners");
        this.f122324iobyxmoadg = code;
        this.f122326zoijcleaow = name;
        this.f122325ppxfxbqfkf = banners;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f122324iobyxmoadg, iobyxmoadgVar.f122324iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f122326zoijcleaow, iobyxmoadgVar.f122326zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f122325ppxfxbqfkf, iobyxmoadgVar.f122325ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f122324iobyxmoadg.hashCode() * 31) + this.f122326zoijcleaow.hashCode()) * 31) + this.f122325ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f122325ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f122326zoijcleaow;
    }

    public String toString() {
        return "BannerGroup(code=" + this.f122324iobyxmoadg + ", name=" + this.f122326zoijcleaow + ", banners=" + this.f122325ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f122324iobyxmoadg;
    }
}
