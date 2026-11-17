package a5;

import java.util.List;
import t3.dsvhmnatus;

/* JADX INFO: loaded from: classes.dex */
final class cllcsxoeiz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f415iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dsvhmnatus[] f416ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f417zoijcleaow;

    public cllcsxoeiz(List list, String str) {
        this.f415iobyxmoadg = list;
        this.f417zoijcleaow = str;
        this.f416ppxfxbqfkf = new dsvhmnatus[list.size()];
    }

    public void iobyxmoadg(long j13, y2.yadqdtsiqt yadqdtsiqtVar) {
        if (yadqdtsiqtVar.iobyxmoadg() < 9) {
            return;
        }
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        int iVdvldrhtss2 = yadqdtsiqtVar.vdvldrhtss();
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        if (iVdvldrhtss == 434 && iVdvldrhtss2 == 1195456820 && iWwaezpbzkn == 3) {
            t3.gxszxtbevo.zoijcleaow(j13, yadqdtsiqtVar, this.f416ppxfxbqfkf);
        }
    }

    public void zoijcleaow(t3.oxmwwwfdhm oxmwwwfdhmVar, jpowsppfya.wkgbmnqykc wkgbmnqykcVar) {
        for (int i13 = 0; i13 < this.f416ppxfxbqfkf.length; i13++) {
            wkgbmnqykcVar.iobyxmoadg();
            dsvhmnatus dsvhmnatusVarKcexrzcfyt = oxmwwwfdhmVar.kcexrzcfyt(wkgbmnqykcVar.ppxfxbqfkf(), 3);
            androidx.media3.common.iobyxmoadg iobyxmoadgVar = (androidx.media3.common.iobyxmoadg) this.f415iobyxmoadg.get(i13);
            String str = iobyxmoadgVar.f9769ojitshcjhn;
            y2.iobyxmoadg.zoijcleaow("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            dsvhmnatusVarKcexrzcfyt.iobyxmoadg(new androidx.media3.common.iobyxmoadg.zoijcleaow().xrmfcynszj(wkgbmnqykcVar.zoijcleaow()).ntlheqmsrt(this.f417zoijcleaow).zeieaojujs(str).tbqsvytpvh(iobyxmoadgVar.f9752eablkybsjg).uwvvkdfqfp(iobyxmoadgVar.f9777wkgbmnqykc).dsvhmnatus(iobyxmoadgVar.f9771pkzmftpjix).metgxyhuhe(iobyxmoadgVar.f9770oxmwwwfdhm).cllcsxoeiz());
            this.f416ppxfxbqfkf[i13] = dsvhmnatusVarKcexrzcfyt;
        }
    }
}
