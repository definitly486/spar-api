package hh1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yz0.ppxfxbqfkf f40410iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f40411ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final hz0.iobyxmoadg f40412zoijcleaow;

    public zoijcleaow(yz0.ppxfxbqfkf platform, hz0.iobyxmoadg version, String storeLink) {
        zdlpuopuiu.btonecajqb(platform, "platform");
        zdlpuopuiu.btonecajqb(version, "version");
        zdlpuopuiu.btonecajqb(storeLink, "storeLink");
        this.f40410iobyxmoadg = platform;
        this.f40412zoijcleaow = version;
        this.f40411ppxfxbqfkf = storeLink;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f40410iobyxmoadg == zoijcleaowVar.f40410iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f40412zoijcleaow, zoijcleaowVar.f40412zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f40411ppxfxbqfkf, zoijcleaowVar.f40411ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f40410iobyxmoadg.hashCode() * 31) + this.f40412zoijcleaow.hashCode()) * 31) + this.f40411ppxfxbqfkf.hashCode();
    }

    public final yz0.ppxfxbqfkf iobyxmoadg() {
        return this.f40410iobyxmoadg;
    }

    public String toString() {
        return "BannerAppUpdateData(platform=" + this.f40410iobyxmoadg + ", version=" + this.f40412zoijcleaow + ", storeLink=" + this.f40411ppxfxbqfkf + ")";
    }

    public final hz0.iobyxmoadg zoijcleaow() {
        return this.f40412zoijcleaow;
    }
}
