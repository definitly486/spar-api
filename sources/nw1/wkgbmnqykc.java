package nw1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f71304iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f71305ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f71306zoijcleaow;

    public wkgbmnqykc(String id2, eablkybsjg type, boolean z13) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(type, "type");
        this.f71304iobyxmoadg = id2;
        this.f71306zoijcleaow = type;
        this.f71305ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f71304iobyxmoadg, wkgbmnqykcVar.f71304iobyxmoadg) && this.f71306zoijcleaow == wkgbmnqykcVar.f71306zoijcleaow && this.f71305ppxfxbqfkf == wkgbmnqykcVar.f71305ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f71304iobyxmoadg.hashCode() * 31) + this.f71306zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f71305ppxfxbqfkf);
    }

    public final eablkybsjg iobyxmoadg() {
        return this.f71306zoijcleaow;
    }

    public String toString() {
        return "UserNotificationSetting(id=" + this.f71304iobyxmoadg + ", type=" + this.f71306zoijcleaow + ", isActive=" + this.f71305ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f71305ppxfxbqfkf;
    }

    public /* synthetic */ wkgbmnqykc(String str, eablkybsjg eablkybsjgVar, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? String.valueOf(xg.ppxfxbqfkf.f122316zdlpuopuiu.wkgbmnqykc()) : str, eablkybsjgVar, z13);
    }
}
