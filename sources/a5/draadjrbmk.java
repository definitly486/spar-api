package a5;

import java.util.Collections;
import java.util.List;
import t3.dsvhmnatus;

/* JADX INFO: loaded from: classes.dex */
public final class draadjrbmk implements wflxmlrfwp {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f421eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f422gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f423iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private long f424lqeggnwhkg = -9223372036854775807L;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dsvhmnatus[] f425ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f426wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f427zoijcleaow;

    public draadjrbmk(List list, String str) {
        this.f423iobyxmoadg = list;
        this.f427zoijcleaow = str;
        this.f425ppxfxbqfkf = new dsvhmnatus[list.size()];
    }

    private boolean zoijcleaow(y2.yadqdtsiqt yadqdtsiqtVar, int i13) {
        if (yadqdtsiqtVar.iobyxmoadg() == 0) {
            return false;
        }
        if (yadqdtsiqtVar.wwaezpbzkn() != i13) {
            this.f426wkgbmnqykc = false;
        }
        this.f421eablkybsjg--;
        return this.f426wkgbmnqykc;
    }

    @Override // a5.wflxmlrfwp
    public void eablkybsjg(long j13, int i13) {
        if ((i13 & 4) == 0) {
            return;
        }
        this.f426wkgbmnqykc = true;
        this.f424lqeggnwhkg = j13;
        this.f422gxszxtbevo = 0;
        this.f421eablkybsjg = 2;
    }

    @Override // a5.wflxmlrfwp
    public void gxszxtbevo(t3.oxmwwwfdhm oxmwwwfdhmVar, jpowsppfya.wkgbmnqykc wkgbmnqykcVar) {
        for (int i13 = 0; i13 < this.f425ppxfxbqfkf.length; i13++) {
            jpowsppfya.iobyxmoadg iobyxmoadgVar = (jpowsppfya.iobyxmoadg) this.f423iobyxmoadg.get(i13);
            wkgbmnqykcVar.iobyxmoadg();
            dsvhmnatus dsvhmnatusVarKcexrzcfyt = oxmwwwfdhmVar.kcexrzcfyt(wkgbmnqykcVar.ppxfxbqfkf(), 3);
            dsvhmnatusVarKcexrzcfyt.iobyxmoadg(new androidx.media3.common.iobyxmoadg.zoijcleaow().xrmfcynszj(wkgbmnqykcVar.zoijcleaow()).ntlheqmsrt(this.f427zoijcleaow).zeieaojujs("application/dvbsubs").metgxyhuhe(Collections.singletonList(iobyxmoadgVar.f556ppxfxbqfkf)).uwvvkdfqfp(iobyxmoadgVar.f555iobyxmoadg).cllcsxoeiz());
            this.f425ppxfxbqfkf[i13] = dsvhmnatusVarKcexrzcfyt;
        }
    }

    @Override // a5.wflxmlrfwp
    public void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar) {
        if (this.f426wkgbmnqykc) {
            if (this.f421eablkybsjg != 2 || zoijcleaow(yadqdtsiqtVar, 32)) {
                if (this.f421eablkybsjg != 1 || zoijcleaow(yadqdtsiqtVar, 0)) {
                    int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
                    int iIobyxmoadg = yadqdtsiqtVar.iobyxmoadg();
                    for (dsvhmnatus dsvhmnatusVar : this.f425ppxfxbqfkf) {
                        yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                        dsvhmnatusVar.lqeggnwhkg(yadqdtsiqtVar, iIobyxmoadg);
                    }
                    this.f422gxszxtbevo += iIobyxmoadg;
                }
            }
        }
    }

    @Override // a5.wflxmlrfwp
    public void ppxfxbqfkf() {
        this.f426wkgbmnqykc = false;
        this.f424lqeggnwhkg = -9223372036854775807L;
    }

    @Override // a5.wflxmlrfwp
    public void wkgbmnqykc(boolean z13) {
        if (this.f426wkgbmnqykc) {
            y2.iobyxmoadg.lqeggnwhkg(this.f424lqeggnwhkg != -9223372036854775807L);
            for (dsvhmnatus dsvhmnatusVar : this.f425ppxfxbqfkf) {
                dsvhmnatusVar.zoijcleaow(this.f424lqeggnwhkg, 1, this.f422gxszxtbevo, 0, null);
            }
            this.f426wkgbmnqykc = false;
        }
    }
}
