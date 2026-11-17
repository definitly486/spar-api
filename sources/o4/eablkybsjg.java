package o4;

import java.util.Arrays;
import t3.kcexrzcfyt;
import t3.vdvldrhtss;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f71958eablkybsjg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f71961wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gxszxtbevo f71959iobyxmoadg = new gxszxtbevo();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yadqdtsiqt f71962zoijcleaow = new yadqdtsiqt(new byte[65025], 0);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f71960ppxfxbqfkf = -1;

    eablkybsjg() {
    }

    private int iobyxmoadg(int i13) {
        int i14;
        int i15 = 0;
        this.f71961wkgbmnqykc = 0;
        do {
            int i16 = this.f71961wkgbmnqykc;
            int i17 = i13 + i16;
            gxszxtbevo gxszxtbevoVar = this.f71959iobyxmoadg;
            if (i17 >= gxszxtbevoVar.f71969lqeggnwhkg) {
                break;
            }
            int[] iArr = gxszxtbevoVar.f71963btonecajqb;
            this.f71961wkgbmnqykc = i16 + 1;
            i14 = iArr[i16 + i13];
            i15 += i14;
        } while (i14 == 255);
        return i15;
    }

    public void eablkybsjg() {
        this.f71959iobyxmoadg.zoijcleaow();
        this.f71962zoijcleaow.tzroggbefp(0);
        this.f71960ppxfxbqfkf = -1;
        this.f71958eablkybsjg = false;
    }

    public void gxszxtbevo() {
        if (this.f71962zoijcleaow.eablkybsjg().length == 65025) {
            return;
        }
        yadqdtsiqt yadqdtsiqtVar = this.f71962zoijcleaow;
        yadqdtsiqtVar.ntlheqmsrt(Arrays.copyOf(yadqdtsiqtVar.eablkybsjg(), Math.max(65025, this.f71962zoijcleaow.lqeggnwhkg())), this.f71962zoijcleaow.lqeggnwhkg());
    }

    public yadqdtsiqt ppxfxbqfkf() {
        return this.f71962zoijcleaow;
    }

    public boolean wkgbmnqykc(vdvldrhtss vdvldrhtssVar) {
        int i13;
        y2.iobyxmoadg.lqeggnwhkg(vdvldrhtssVar != null);
        if (this.f71958eablkybsjg) {
            this.f71958eablkybsjg = false;
            this.f71962zoijcleaow.tzroggbefp(0);
        }
        while (!this.f71958eablkybsjg) {
            if (this.f71960ppxfxbqfkf < 0) {
                if (!this.f71959iobyxmoadg.ppxfxbqfkf(vdvldrhtssVar) || !this.f71959iobyxmoadg.iobyxmoadg(vdvldrhtssVar, true)) {
                    return false;
                }
                gxszxtbevo gxszxtbevoVar = this.f71959iobyxmoadg;
                int iIobyxmoadg = gxszxtbevoVar.f71970nufgyqmvbu;
                if ((gxszxtbevoVar.f71973zoijcleaow & 1) == 1 && this.f71962zoijcleaow.lqeggnwhkg() == 0) {
                    iIobyxmoadg += iobyxmoadg(0);
                    i13 = this.f71961wkgbmnqykc;
                } else {
                    i13 = 0;
                }
                if (!kcexrzcfyt.eablkybsjg(vdvldrhtssVar, iIobyxmoadg)) {
                    return false;
                }
                this.f71960ppxfxbqfkf = i13;
            }
            int iIobyxmoadg2 = iobyxmoadg(this.f71960ppxfxbqfkf);
            int i14 = this.f71960ppxfxbqfkf + this.f71961wkgbmnqykc;
            if (iIobyxmoadg2 > 0) {
                yadqdtsiqt yadqdtsiqtVar = this.f71962zoijcleaow;
                yadqdtsiqtVar.ppxfxbqfkf(yadqdtsiqtVar.lqeggnwhkg() + iIobyxmoadg2);
                if (!kcexrzcfyt.wkgbmnqykc(vdvldrhtssVar, this.f71962zoijcleaow.eablkybsjg(), this.f71962zoijcleaow.lqeggnwhkg(), iIobyxmoadg2)) {
                    return false;
                }
                yadqdtsiqt yadqdtsiqtVar2 = this.f71962zoijcleaow;
                yadqdtsiqtVar2.ulzqkzuiru(yadqdtsiqtVar2.lqeggnwhkg() + iIobyxmoadg2);
                this.f71958eablkybsjg = this.f71959iobyxmoadg.f71963btonecajqb[i14 + (-1)] != 255;
            }
            if (i14 == this.f71959iobyxmoadg.f71969lqeggnwhkg) {
                i14 = -1;
            }
            this.f71960ppxfxbqfkf = i14;
        }
        return true;
    }

    public gxszxtbevo zoijcleaow() {
        return this.f71959iobyxmoadg;
    }
}
