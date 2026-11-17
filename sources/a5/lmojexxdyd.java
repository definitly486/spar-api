package a5;

import java.util.List;
import t3.dsvhmnatus;

/* JADX INFO: loaded from: classes.dex */
public final class lmojexxdyd {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f600iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dsvhmnatus[] f601ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final z2.dxjokdxxww f602wkgbmnqykc = new z2.dxjokdxxww(new z2.dxjokdxxww.zoijcleaow() { // from class: a5.iozdgvuglv
        @Override // z2.dxjokdxxww.zoijcleaow
        public final void iobyxmoadg(long j13, y2.yadqdtsiqt yadqdtsiqtVar) {
            this.f529iobyxmoadg.gxszxtbevo(j13, yadqdtsiqtVar);
        }
    });

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f603zoijcleaow;

    public lmojexxdyd(List list, String str) {
        this.f600iobyxmoadg = list;
        this.f603zoijcleaow = str;
        this.f601ppxfxbqfkf = new dsvhmnatus[list.size()];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gxszxtbevo(long j13, y2.yadqdtsiqt yadqdtsiqtVar) {
        t3.gxszxtbevo.iobyxmoadg(j13, yadqdtsiqtVar, this.f601ppxfxbqfkf);
    }

    public void eablkybsjg() {
        this.f602wkgbmnqykc.wkgbmnqykc();
    }

    public void lqeggnwhkg(int i13) {
        this.f602wkgbmnqykc.lqeggnwhkg(i13);
    }

    public void ppxfxbqfkf(long j13, y2.yadqdtsiqt yadqdtsiqtVar) {
        this.f602wkgbmnqykc.iobyxmoadg(j13, yadqdtsiqtVar);
    }

    public void wkgbmnqykc(t3.oxmwwwfdhm oxmwwwfdhmVar, jpowsppfya.wkgbmnqykc wkgbmnqykcVar) {
        for (int i13 = 0; i13 < this.f601ppxfxbqfkf.length; i13++) {
            wkgbmnqykcVar.iobyxmoadg();
            dsvhmnatus dsvhmnatusVarKcexrzcfyt = oxmwwwfdhmVar.kcexrzcfyt(wkgbmnqykcVar.ppxfxbqfkf(), 3);
            androidx.media3.common.iobyxmoadg iobyxmoadgVar = (androidx.media3.common.iobyxmoadg) this.f600iobyxmoadg.get(i13);
            String str = iobyxmoadgVar.f9769ojitshcjhn;
            y2.iobyxmoadg.zoijcleaow("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String strZoijcleaow = iobyxmoadgVar.f9758iobyxmoadg;
            if (strZoijcleaow == null) {
                strZoijcleaow = wkgbmnqykcVar.zoijcleaow();
            }
            dsvhmnatusVarKcexrzcfyt.iobyxmoadg(new androidx.media3.common.iobyxmoadg.zoijcleaow().xrmfcynszj(strZoijcleaow).ntlheqmsrt(this.f603zoijcleaow).zeieaojujs(str).tbqsvytpvh(iobyxmoadgVar.f9752eablkybsjg).uwvvkdfqfp(iobyxmoadgVar.f9777wkgbmnqykc).dsvhmnatus(iobyxmoadgVar.f9771pkzmftpjix).metgxyhuhe(iobyxmoadgVar.f9770oxmwwwfdhm).cllcsxoeiz());
            this.f601ppxfxbqfkf[i13] = dsvhmnatusVarKcexrzcfyt;
        }
    }

    public void zoijcleaow() {
        this.f602wkgbmnqykc.wkgbmnqykc();
    }
}
