package androidx.compose.ui.draw;

import androidx.collection.jpowsppfya;
import androidx.collection.ntlheqmsrt;
import h.auzgnhcxok;

/* JADX INFO: loaded from: classes.dex */
final class gxszxtbevo implements auzgnhcxok {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private jpowsppfya f6169iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private auzgnhcxok f6170zoijcleaow;

    public final void eablkybsjg(auzgnhcxok auzgnhcxokVar) {
        wkgbmnqykc();
        this.f6170zoijcleaow = auzgnhcxokVar;
    }

    @Override // h.auzgnhcxok
    public void iobyxmoadg(k.ppxfxbqfkf ppxfxbqfkfVar) {
        auzgnhcxok auzgnhcxokVar = this.f6170zoijcleaow;
        if (auzgnhcxokVar != null) {
            auzgnhcxokVar.iobyxmoadg(ppxfxbqfkfVar);
        }
    }

    public final auzgnhcxok ppxfxbqfkf() {
        return this.f6170zoijcleaow;
    }

    public final void wkgbmnqykc() {
        jpowsppfya jpowsppfyaVar = this.f6169iobyxmoadg;
        if (jpowsppfyaVar != null) {
            Object[] objArr = jpowsppfyaVar.f4343iobyxmoadg;
            int i13 = jpowsppfyaVar.f4344zoijcleaow;
            for (int i14 = 0; i14 < i13; i14++) {
                iobyxmoadg((k.ppxfxbqfkf) objArr[i14]);
            }
            jpowsppfyaVar.yggfygwlhe();
        }
    }

    @Override // h.auzgnhcxok
    public k.ppxfxbqfkf zoijcleaow() {
        auzgnhcxok auzgnhcxokVar = this.f6170zoijcleaow;
        if (!(auzgnhcxokVar != null)) {
            w.iobyxmoadg.zoijcleaow("GraphicsContext not provided");
        }
        k.ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = auzgnhcxokVar.zoijcleaow();
        jpowsppfya jpowsppfyaVar = this.f6169iobyxmoadg;
        if (jpowsppfyaVar == null) {
            this.f6169iobyxmoadg = ntlheqmsrt.lqeggnwhkg(ppxfxbqfkfVarZoijcleaow);
        } else {
            jpowsppfyaVar.agtfadlqog(ppxfxbqfkfVarZoijcleaow);
        }
        return ppxfxbqfkfVarZoijcleaow;
    }
}
