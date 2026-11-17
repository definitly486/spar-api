package androidx.compose.material;

import androidx.compose.ui.layout.draadjrbmk;
import androidx.compose.ui.layout.kcexrzcfyt;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import igdgnonuha.lqeggnwhkg;
import igdgnonuha.lrnfpwlwnk;
import jztzpxfvev.jlmebxxoox;
import tg.rgvfuqvkyq;
import w0.oxmwwwfdhm;
import x.istkbnxepw;
import x.pmvmpeiblj;
import z.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements yadqdtsiqt {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private jlmebxxoox f5508hcddaimhww;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private boolean f5509jpowsppfya;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private rgvfuqvkyq f5510pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private lqeggnwhkg f5511ylkuphrtab;

    public wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar, rgvfuqvkyq rgvfuqvkyqVar, jlmebxxoox jlmebxxooxVar) {
        this.f5511ylkuphrtab = lqeggnwhkgVar;
        this.f5510pkzmftpjix = rgvfuqvkyqVar;
        this.f5508hcddaimhww = jlmebxxooxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn I0(draadjrbmk draadjrbmkVar, wkgbmnqykc wkgbmnqykcVar, kcexrzcfyt kcexrzcfytVar, kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        float fEablkybsjg = draadjrbmkVar.zeieaojujs() ? wkgbmnqykcVar.f5511ylkuphrtab.oxmwwwfdhm().eablkybsjg(wkgbmnqykcVar.f5511ylkuphrtab.pmvmpeiblj()) : wkgbmnqykcVar.f5511ylkuphrtab.yadqdtsiqt();
        jlmebxxoox jlmebxxooxVar = wkgbmnqykcVar.f5508hcddaimhww;
        float f13 = jlmebxxooxVar == jlmebxxoox.Horizontal ? fEablkybsjg : 0.0f;
        if (jlmebxxooxVar != jlmebxxoox.Vertical) {
            fEablkybsjg = 0.0f;
        }
        kcexrzcfyt.iobyxmoadg.cdpycssgdh(iobyxmoadgVar, kcexrzcfytVar, vg.iobyxmoadg.wkgbmnqykc(f13), vg.iobyxmoadg.wkgbmnqykc(fEablkybsjg), 0.0f, 4, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void J0(rgvfuqvkyq rgvfuqvkyqVar) {
        this.f5510pkzmftpjix = rgvfuqvkyqVar;
    }

    public final void K0(jlmebxxoox jlmebxxooxVar) {
        this.f5508hcddaimhww = jlmebxxooxVar;
    }

    public final void L0(lqeggnwhkg lqeggnwhkgVar) {
        this.f5511ylkuphrtab = lqeggnwhkgVar;
    }

    @Override // z.yadqdtsiqt
    public istkbnxepw gxszxtbevo(final draadjrbmk draadjrbmkVar, pmvmpeiblj pmvmpeibljVar, long j13) {
        final kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(j13);
        if (!draadjrbmkVar.zeieaojujs() || !this.f5509jpowsppfya) {
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) this.f5510pkzmftpjix.invoke(oxmwwwfdhm.zoijcleaow(oxmwwwfdhm.ppxfxbqfkf((((long) kcexrzcfytVarSflfametgt.ipoelvxyzq()) & 4294967295L) | (((long) kcexrzcfytVarSflfametgt.eslsurpljm()) << 32))), w0.zoijcleaow.iobyxmoadg(j13));
            this.f5511ylkuphrtab.dsvhmnatus((lrnfpwlwnk) vdvldrhtssVar.lqeggnwhkg(), vdvldrhtssVar.nufgyqmvbu());
        }
        this.f5509jpowsppfya = draadjrbmkVar.zeieaojujs() || this.f5509jpowsppfya;
        return draadjrbmk.ntlheqmsrt(draadjrbmkVar, kcexrzcfytVarSflfametgt.eslsurpljm(), kcexrzcfytVarSflfametgt.ipoelvxyzq(), null, new tg.draadjrbmk() { // from class: androidx.compose.material.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.I0(draadjrbmkVar, this, kcexrzcfytVarSflfametgt, (kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void r0() {
        this.f5509jpowsppfya = false;
    }
}
