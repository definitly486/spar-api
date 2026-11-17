package p0;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class ntlheqmsrt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jpowsppfya f75262iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final AtomicReference f75263zoijcleaow = new AtomicReference(null);

    public ntlheqmsrt(jpowsppfya jpowsppfyaVar) {
        this.f75262iobyxmoadg = jpowsppfyaVar;
    }

    public final void eablkybsjg() {
        this.f75262iobyxmoadg.iobyxmoadg();
        this.f75263zoijcleaow.set(new vipkmwdibw(this, this.f75262iobyxmoadg));
    }

    public final void gxszxtbevo() {
        this.f75263zoijcleaow.set(null);
        this.f75262iobyxmoadg.ppxfxbqfkf();
    }

    public final vipkmwdibw iobyxmoadg() {
        return (vipkmwdibw) this.f75263zoijcleaow.get();
    }

    public void lqeggnwhkg(vipkmwdibw vipkmwdibwVar) {
        if (mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f75263zoijcleaow, vipkmwdibwVar, null)) {
            this.f75262iobyxmoadg.ppxfxbqfkf();
        }
    }

    public final void ppxfxbqfkf() {
        if (iobyxmoadg() != null) {
            this.f75262iobyxmoadg.lqeggnwhkg();
        }
    }

    public vipkmwdibw wkgbmnqykc(tzroggbefp tzroggbefpVar, zdlpuopuiu zdlpuopuiuVar, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2) {
        this.f75262iobyxmoadg.nufgyqmvbu(tzroggbefpVar, zdlpuopuiuVar, draadjrbmkVar, draadjrbmkVar2);
        vipkmwdibw vipkmwdibwVar = new vipkmwdibw(this, this.f75262iobyxmoadg);
        this.f75263zoijcleaow.set(vipkmwdibwVar);
        return vipkmwdibwVar;
    }

    public final void zoijcleaow() {
        this.f75262iobyxmoadg.eablkybsjg();
    }
}
