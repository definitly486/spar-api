package a5;

import t3.dsvhmnatus;

/* JADX INFO: loaded from: classes.dex */
public final class oxmwwwfdhm implements wflxmlrfwp {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f645gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f646iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f647lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private dsvhmnatus f648ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f649wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y2.yadqdtsiqt f650zoijcleaow = new y2.yadqdtsiqt(10);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private long f644eablkybsjg = -9223372036854775807L;

    public oxmwwwfdhm(String str) {
        this.f646iobyxmoadg = str;
    }

    @Override // a5.wflxmlrfwp
    public void eablkybsjg(long j13, int i13) {
        if ((i13 & 4) == 0) {
            return;
        }
        this.f649wkgbmnqykc = true;
        this.f644eablkybsjg = j13;
        this.f645gxszxtbevo = 0;
        this.f647lqeggnwhkg = 0;
    }

    @Override // a5.wflxmlrfwp
    public void gxszxtbevo(t3.oxmwwwfdhm oxmwwwfdhmVar, jpowsppfya.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.iobyxmoadg();
        dsvhmnatus dsvhmnatusVarKcexrzcfyt = oxmwwwfdhmVar.kcexrzcfyt(wkgbmnqykcVar.ppxfxbqfkf(), 5);
        this.f648ppxfxbqfkf = dsvhmnatusVarKcexrzcfyt;
        dsvhmnatusVarKcexrzcfyt.iobyxmoadg(new androidx.media3.common.iobyxmoadg.zoijcleaow().xrmfcynszj(wkgbmnqykcVar.zoijcleaow()).ntlheqmsrt(this.f646iobyxmoadg).zeieaojujs("application/id3").cllcsxoeiz());
    }

    @Override // a5.wflxmlrfwp
    public void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar) {
        y2.iobyxmoadg.dxjokdxxww(this.f648ppxfxbqfkf);
        if (this.f649wkgbmnqykc) {
            int iIobyxmoadg = yadqdtsiqtVar.iobyxmoadg();
            int i13 = this.f647lqeggnwhkg;
            if (i13 < 10) {
                int iMin = Math.min(iIobyxmoadg, 10 - i13);
                System.arraycopy(yadqdtsiqtVar.eablkybsjg(), yadqdtsiqtVar.gxszxtbevo(), this.f650zoijcleaow.eablkybsjg(), this.f647lqeggnwhkg, iMin);
                if (this.f647lqeggnwhkg + iMin == 10) {
                    this.f650zoijcleaow.sopmlzcsov(0);
                    if (73 != this.f650zoijcleaow.wwaezpbzkn() || 68 != this.f650zoijcleaow.wwaezpbzkn() || 51 != this.f650zoijcleaow.wwaezpbzkn()) {
                        y2.kcexrzcfyt.nufgyqmvbu("Id3Reader", "Discarding invalid ID3 tag");
                        this.f649wkgbmnqykc = false;
                        return;
                    } else {
                        this.f650zoijcleaow.crxdokpmqz(3);
                        this.f645gxszxtbevo = this.f650zoijcleaow.lmojexxdyd() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iIobyxmoadg, this.f645gxszxtbevo - this.f647lqeggnwhkg);
            this.f648ppxfxbqfkf.lqeggnwhkg(yadqdtsiqtVar, iMin2);
            this.f647lqeggnwhkg += iMin2;
        }
    }

    @Override // a5.wflxmlrfwp
    public void ppxfxbqfkf() {
        this.f649wkgbmnqykc = false;
        this.f644eablkybsjg = -9223372036854775807L;
    }

    @Override // a5.wflxmlrfwp
    public void wkgbmnqykc(boolean z13) {
        int i13;
        y2.iobyxmoadg.dxjokdxxww(this.f648ppxfxbqfkf);
        if (this.f649wkgbmnqykc && (i13 = this.f645gxszxtbevo) != 0 && this.f647lqeggnwhkg == i13) {
            y2.iobyxmoadg.lqeggnwhkg(this.f644eablkybsjg != -9223372036854775807L);
            this.f648ppxfxbqfkf.zoijcleaow(this.f644eablkybsjg, 1, this.f645gxszxtbevo, 0, null);
            this.f649wkgbmnqykc = false;
        }
    }
}
