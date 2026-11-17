package c;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f17799iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wflxmlrfwp f17800ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final c0.eablkybsjg f17801wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f17802zoijcleaow;

    public draadjrbmk(int i13, long j13, wflxmlrfwp wflxmlrfwpVar, c0.eablkybsjg eablkybsjgVar) {
        this.f17799iobyxmoadg = i13;
        this.f17802zoijcleaow = j13;
        this.f17800ppxfxbqfkf = wflxmlrfwpVar;
        this.f17801wkgbmnqykc = eablkybsjgVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return this.f17799iobyxmoadg == draadjrbmkVar.f17799iobyxmoadg && this.f17802zoijcleaow == draadjrbmkVar.f17802zoijcleaow && this.f17800ppxfxbqfkf == draadjrbmkVar.f17800ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f17801wkgbmnqykc, draadjrbmkVar.f17801wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f17799iobyxmoadg) * 31) + Long.hashCode(this.f17802zoijcleaow)) * 31) + this.f17800ppxfxbqfkf.hashCode()) * 31;
        c0.eablkybsjg eablkybsjgVar = this.f17801wkgbmnqykc;
        return iHashCode + (eablkybsjgVar == null ? 0 : eablkybsjgVar.hashCode());
    }

    public final int iobyxmoadg() {
        return this.f17799iobyxmoadg;
    }

    public final wflxmlrfwp ppxfxbqfkf() {
        return this.f17800ppxfxbqfkf;
    }

    public String toString() {
        return "ContentCaptureEvent(id=" + this.f17799iobyxmoadg + ", timestamp=" + this.f17802zoijcleaow + ", type=" + this.f17800ppxfxbqfkf + ", structureCompat=" + this.f17801wkgbmnqykc + ')';
    }

    public final c0.eablkybsjg zoijcleaow() {
        return this.f17801wkgbmnqykc;
    }
}
