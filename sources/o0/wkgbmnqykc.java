package o0;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import n0.cdpycssgdh;
import n0.cqumvgiudr;
import n0.istkbnxepw;
import n0.lereixgezr;
import n0.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc extends n0.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ppxfxbqfkf.iobyxmoadg f71501eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final yadqdtsiqt f71502gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f71503lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f71504nufgyqmvbu;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f71505wkgbmnqykc;

    public /* synthetic */ wkgbmnqykc(String str, ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, yadqdtsiqt yadqdtsiqtVar, int i13, boolean z13, gtknphoqwx gtknphoqwxVar) {
        this(str, iobyxmoadgVar, yadqdtsiqtVar, i13, z13);
    }

    private final String eablkybsjg() {
        return this.f71504nufgyqmvbu ? "true" : "false";
    }

    private final int lqeggnwhkg(int i13) {
        return lereixgezr.gxszxtbevo(i13, lereixgezr.f68283zoijcleaow.iobyxmoadg()) ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f71505wkgbmnqykc, wkgbmnqykcVar.f71505wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f71501eablkybsjg, wkgbmnqykcVar.f71501eablkybsjg) && zdlpuopuiu.eablkybsjg(zoijcleaow(), wkgbmnqykcVar.zoijcleaow()) && lereixgezr.gxszxtbevo(ppxfxbqfkf(), wkgbmnqykcVar.ppxfxbqfkf()) && this.f71504nufgyqmvbu == wkgbmnqykcVar.f71504nufgyqmvbu;
    }

    public final r1.eablkybsjg gxszxtbevo() {
        String str = "name=" + this.f71505wkgbmnqykc + "&weight=" + zoijcleaow().dxjokdxxww() + "&italic=" + lqeggnwhkg(ppxfxbqfkf()) + "&besteffort=" + eablkybsjg();
        List listIobyxmoadg = this.f71501eablkybsjg.iobyxmoadg();
        return listIobyxmoadg != null ? new r1.eablkybsjg(this.f71501eablkybsjg.ppxfxbqfkf(), this.f71501eablkybsjg.wkgbmnqykc(), str, listIobyxmoadg) : new r1.eablkybsjg(this.f71501eablkybsjg.ppxfxbqfkf(), this.f71501eablkybsjg.wkgbmnqykc(), str, this.f71501eablkybsjg.zoijcleaow());
    }

    public int hashCode() {
        return (((((((this.f71505wkgbmnqykc.hashCode() * 31) + this.f71501eablkybsjg.hashCode()) * 31) + zoijcleaow().hashCode()) * 31) + lereixgezr.lqeggnwhkg(ppxfxbqfkf())) * 31) + Boolean.hashCode(this.f71504nufgyqmvbu);
    }

    public final int nufgyqmvbu() {
        boolean zGxszxtbevo = lereixgezr.gxszxtbevo(ppxfxbqfkf(), lereixgezr.f68283zoijcleaow.iobyxmoadg());
        boolean z13 = zoijcleaow().compareTo(yadqdtsiqt.f68367yggfygwlhe.iobyxmoadg()) >= 0;
        if (zGxszxtbevo && z13) {
            return 3;
        }
        if (zGxszxtbevo) {
            return 2;
        }
        return z13 ? 1 : 0;
    }

    @Override // n0.draadjrbmk
    public int ppxfxbqfkf() {
        return this.f71503lqeggnwhkg;
    }

    public String toString() {
        return "Font(GoogleFont(\"" + this.f71505wkgbmnqykc + "\", bestEffort=" + this.f71504nufgyqmvbu + "), weight=" + zoijcleaow() + ", style=" + ((Object) lereixgezr.nufgyqmvbu(ppxfxbqfkf())) + ')';
    }

    @Override // n0.draadjrbmk
    public yadqdtsiqt zoijcleaow() {
        return this.f71502gxszxtbevo;
    }

    private wkgbmnqykc(String str, ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, yadqdtsiqt yadqdtsiqtVar, int i13, boolean z13) {
        super(cqumvgiudr.f68240iobyxmoadg.iobyxmoadg(), gxszxtbevo.f71489iobyxmoadg, new cdpycssgdh(new istkbnxepw[0]), null);
        this.f71505wkgbmnqykc = str;
        this.f71501eablkybsjg = iobyxmoadgVar;
        this.f71502gxszxtbevo = yadqdtsiqtVar;
        this.f71503lqeggnwhkg = i13;
        this.f71504nufgyqmvbu = z13;
    }
}
