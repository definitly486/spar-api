package q00;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final i10.ppxfxbqfkf f77577iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f77578ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final p00.iobyxmoadg f77579zoijcleaow;

    public iobyxmoadg(i10.ppxfxbqfkf platform, p00.iobyxmoadg version, String storeLink) {
        zdlpuopuiu.btonecajqb(platform, "platform");
        zdlpuopuiu.btonecajqb(version, "version");
        zdlpuopuiu.btonecajqb(storeLink, "storeLink");
        this.f77577iobyxmoadg = platform;
        this.f77579zoijcleaow = version;
        this.f77578ppxfxbqfkf = storeLink;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f77577iobyxmoadg == iobyxmoadgVar.f77577iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f77579zoijcleaow, iobyxmoadgVar.f77579zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f77578ppxfxbqfkf, iobyxmoadgVar.f77578ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f77577iobyxmoadg.hashCode() * 31) + this.f77579zoijcleaow.hashCode()) * 31) + this.f77578ppxfxbqfkf.hashCode();
    }

    public final i10.ppxfxbqfkf iobyxmoadg() {
        return this.f77577iobyxmoadg;
    }

    public String toString() {
        return "AppUpdateData(platform=" + this.f77577iobyxmoadg + ", version=" + this.f77579zoijcleaow + ", storeLink=" + this.f77578ppxfxbqfkf + ")";
    }

    public final p00.iobyxmoadg zoijcleaow() {
        return this.f77579zoijcleaow;
    }
}
