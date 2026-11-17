package a5;

import t3.dsvhmnatus;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class cqumvgiudr implements cdpycssgdh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f418iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private dsvhmnatus f419ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private y2.hcddaimhww f420zoijcleaow;

    public cqumvgiudr(String str, String str2) {
        this.f418iobyxmoadg = new androidx.media3.common.iobyxmoadg.zoijcleaow().ntlheqmsrt(str2).zeieaojujs(str).cllcsxoeiz();
    }

    private void ppxfxbqfkf() {
        y2.iobyxmoadg.dxjokdxxww(this.f420zoijcleaow);
        stevsuqkhv.nufgyqmvbu(this.f419ppxfxbqfkf);
    }

    @Override // a5.cdpycssgdh
    public void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar) {
        ppxfxbqfkf();
        long jEablkybsjg = this.f420zoijcleaow.eablkybsjg();
        long jGxszxtbevo = this.f420zoijcleaow.gxszxtbevo();
        if (jEablkybsjg == -9223372036854775807L || jGxszxtbevo == -9223372036854775807L) {
            return;
        }
        androidx.media3.common.iobyxmoadg iobyxmoadgVar = this.f418iobyxmoadg;
        if (jGxszxtbevo != iobyxmoadgVar.f9782zdlpuopuiu) {
            androidx.media3.common.iobyxmoadg iobyxmoadgVarCllcsxoeiz = iobyxmoadgVar.zoijcleaow().uawqvzlxes(jGxszxtbevo).cllcsxoeiz();
            this.f418iobyxmoadg = iobyxmoadgVarCllcsxoeiz;
            this.f419ppxfxbqfkf.iobyxmoadg(iobyxmoadgVarCllcsxoeiz);
        }
        int iIobyxmoadg = yadqdtsiqtVar.iobyxmoadg();
        this.f419ppxfxbqfkf.lqeggnwhkg(yadqdtsiqtVar, iIobyxmoadg);
        this.f419ppxfxbqfkf.zoijcleaow(jEablkybsjg, 1, iIobyxmoadg, 0, null);
    }

    @Override // a5.cdpycssgdh
    public void zoijcleaow(y2.hcddaimhww hcddaimhwwVar, t3.oxmwwwfdhm oxmwwwfdhmVar, jpowsppfya.wkgbmnqykc wkgbmnqykcVar) {
        this.f420zoijcleaow = hcddaimhwwVar;
        wkgbmnqykcVar.iobyxmoadg();
        dsvhmnatus dsvhmnatusVarKcexrzcfyt = oxmwwwfdhmVar.kcexrzcfyt(wkgbmnqykcVar.ppxfxbqfkf(), 5);
        this.f419ppxfxbqfkf = dsvhmnatusVarKcexrzcfyt;
        dsvhmnatusVarKcexrzcfyt.iobyxmoadg(this.f418iobyxmoadg);
    }
}
