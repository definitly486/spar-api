package p30;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final draadjrbmk f75514iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final draadjrbmk f75515ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final draadjrbmk f75516wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final draadjrbmk f75517zoijcleaow;

    public iobyxmoadg(draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2, draadjrbmk draadjrbmkVar3, draadjrbmk draadjrbmkVar4) {
        this.f75514iobyxmoadg = draadjrbmkVar;
        this.f75517zoijcleaow = draadjrbmkVar2;
        this.f75515ppxfxbqfkf = draadjrbmkVar3;
        this.f75516wkgbmnqykc = draadjrbmkVar4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f75514iobyxmoadg, iobyxmoadgVar.f75514iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f75517zoijcleaow, iobyxmoadgVar.f75517zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f75515ppxfxbqfkf, iobyxmoadgVar.f75515ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f75516wkgbmnqykc, iobyxmoadgVar.f75516wkgbmnqykc);
    }

    public int hashCode() {
        draadjrbmk draadjrbmkVar = this.f75514iobyxmoadg;
        int iHashCode = (draadjrbmkVar == null ? 0 : draadjrbmkVar.hashCode()) * 31;
        draadjrbmk draadjrbmkVar2 = this.f75517zoijcleaow;
        int iHashCode2 = (iHashCode + (draadjrbmkVar2 == null ? 0 : draadjrbmkVar2.hashCode())) * 31;
        draadjrbmk draadjrbmkVar3 = this.f75515ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (draadjrbmkVar3 == null ? 0 : draadjrbmkVar3.hashCode())) * 31;
        draadjrbmk draadjrbmkVar4 = this.f75516wkgbmnqykc;
        return iHashCode3 + (draadjrbmkVar4 != null ? draadjrbmkVar4.hashCode() : 0);
    }

    public final draadjrbmk iobyxmoadg() {
        return this.f75516wkgbmnqykc;
    }

    public final draadjrbmk ppxfxbqfkf() {
        return this.f75515ppxfxbqfkf;
    }

    public String toString() {
        return "WebViewCallback(onOverrideUrlLoading=" + this.f75514iobyxmoadg + ", onPageStarted=" + this.f75517zoijcleaow + ", onPageFinished=" + this.f75515ppxfxbqfkf + ", onError=" + this.f75516wkgbmnqykc + ")";
    }

    public final draadjrbmk wkgbmnqykc() {
        return this.f75517zoijcleaow;
    }

    public final draadjrbmk zoijcleaow() {
        return this.f75514iobyxmoadg;
    }

    public /* synthetic */ iobyxmoadg(draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2, draadjrbmk draadjrbmkVar3, draadjrbmk draadjrbmkVar4, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : draadjrbmkVar, (i13 & 2) != 0 ? null : draadjrbmkVar2, (i13 & 4) != 0 ? null : draadjrbmkVar3, (i13 & 8) != 0 ? null : draadjrbmkVar4);
    }
}
