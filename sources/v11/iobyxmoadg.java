package v11;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final draadjrbmk f115255iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final draadjrbmk f115256ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final draadjrbmk f115257wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final draadjrbmk f115258zoijcleaow;

    public iobyxmoadg(draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2, draadjrbmk draadjrbmkVar3, draadjrbmk draadjrbmkVar4) {
        this.f115255iobyxmoadg = draadjrbmkVar;
        this.f115258zoijcleaow = draadjrbmkVar2;
        this.f115256ppxfxbqfkf = draadjrbmkVar3;
        this.f115257wkgbmnqykc = draadjrbmkVar4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f115255iobyxmoadg, iobyxmoadgVar.f115255iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f115258zoijcleaow, iobyxmoadgVar.f115258zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f115256ppxfxbqfkf, iobyxmoadgVar.f115256ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f115257wkgbmnqykc, iobyxmoadgVar.f115257wkgbmnqykc);
    }

    public int hashCode() {
        draadjrbmk draadjrbmkVar = this.f115255iobyxmoadg;
        int iHashCode = (draadjrbmkVar == null ? 0 : draadjrbmkVar.hashCode()) * 31;
        draadjrbmk draadjrbmkVar2 = this.f115258zoijcleaow;
        int iHashCode2 = (iHashCode + (draadjrbmkVar2 == null ? 0 : draadjrbmkVar2.hashCode())) * 31;
        draadjrbmk draadjrbmkVar3 = this.f115256ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (draadjrbmkVar3 == null ? 0 : draadjrbmkVar3.hashCode())) * 31;
        draadjrbmk draadjrbmkVar4 = this.f115257wkgbmnqykc;
        return iHashCode3 + (draadjrbmkVar4 != null ? draadjrbmkVar4.hashCode() : 0);
    }

    public final draadjrbmk iobyxmoadg() {
        return this.f115257wkgbmnqykc;
    }

    public final draadjrbmk ppxfxbqfkf() {
        return this.f115256ppxfxbqfkf;
    }

    public String toString() {
        return "WebViewCallback(onOverrideUrlLoading=" + this.f115255iobyxmoadg + ", onPageStarted=" + this.f115258zoijcleaow + ", onPageFinished=" + this.f115256ppxfxbqfkf + ", onError=" + this.f115257wkgbmnqykc + ")";
    }

    public final draadjrbmk wkgbmnqykc() {
        return this.f115258zoijcleaow;
    }

    public final draadjrbmk zoijcleaow() {
        return this.f115255iobyxmoadg;
    }

    public /* synthetic */ iobyxmoadg(draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2, draadjrbmk draadjrbmkVar3, draadjrbmk draadjrbmkVar4, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : draadjrbmkVar, (i13 & 2) != 0 ? null : draadjrbmkVar2, (i13 & 4) != 0 ? null : draadjrbmkVar3, (i13 & 8) != 0 ? null : draadjrbmkVar4);
    }
}
