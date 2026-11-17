package o4;

import androidx.media3.common.ParserException;
import t3.dsvhmnatus;
import t3.oxmwwwfdhm;
import t3.rgvfuqvkyq;
import t3.vdvldrhtss;
import t3.yggfygwlhe;
import t3.ylkuphrtab;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public class wkgbmnqykc implements rgvfuqvkyq {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final yggfygwlhe f71990wkgbmnqykc = new yggfygwlhe() { // from class: o4.ppxfxbqfkf
        @Override // t3.yggfygwlhe
        public final rgvfuqvkyq[] lqeggnwhkg() {
            return wkgbmnqykc.gxszxtbevo();
        }
    };

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private oxmwwwfdhm f71991iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f71992ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private dxjokdxxww f71993zoijcleaow;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ rgvfuqvkyq[] gxszxtbevo() {
        return new rgvfuqvkyq[]{new wkgbmnqykc()};
    }

    private static yadqdtsiqt lqeggnwhkg(yadqdtsiqt yadqdtsiqtVar) {
        yadqdtsiqtVar.sopmlzcsov(0);
        return yadqdtsiqtVar;
    }

    private boolean nufgyqmvbu(vdvldrhtss vdvldrhtssVar) {
        gxszxtbevo gxszxtbevoVar = new gxszxtbevo();
        if (gxszxtbevoVar.iobyxmoadg(vdvldrhtssVar, true) && (gxszxtbevoVar.f71973zoijcleaow & 2) == 2) {
            int iMin = Math.min(gxszxtbevoVar.f71964dxjokdxxww, 8);
            yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt(iMin);
            vdvldrhtssVar.ojitshcjhn(yadqdtsiqtVar.eablkybsjg(), 0, iMin);
            if (zoijcleaow.rgvfuqvkyq(lqeggnwhkg(yadqdtsiqtVar))) {
                this.f71993zoijcleaow = new zoijcleaow();
            } else if (btonecajqb.oxmwwwfdhm(lqeggnwhkg(yadqdtsiqtVar))) {
                this.f71993zoijcleaow = new btonecajqb();
            } else if (nufgyqmvbu.ojitshcjhn(lqeggnwhkg(yadqdtsiqtVar))) {
                this.f71993zoijcleaow = new nufgyqmvbu();
            }
            return true;
        }
        return false;
    }

    @Override // t3.rgvfuqvkyq
    public boolean draadjrbmk(vdvldrhtss vdvldrhtssVar) {
        try {
            return nufgyqmvbu(vdvldrhtssVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // t3.rgvfuqvkyq
    public void iobyxmoadg(long j13, long j14) {
        dxjokdxxww dxjokdxxwwVar = this.f71993zoijcleaow;
        if (dxjokdxxwwVar != null) {
            dxjokdxxwwVar.wflxmlrfwp(j13, j14);
        }
    }

    @Override // t3.rgvfuqvkyq
    public void ppxfxbqfkf(oxmwwwfdhm oxmwwwfdhmVar) {
        this.f71991iobyxmoadg = oxmwwwfdhmVar;
    }

    @Override // t3.rgvfuqvkyq
    public void release() {
    }

    @Override // t3.rgvfuqvkyq
    public int zoijcleaow(vdvldrhtss vdvldrhtssVar, ylkuphrtab ylkuphrtabVar) throws ParserException {
        y2.iobyxmoadg.dxjokdxxww(this.f71991iobyxmoadg);
        if (this.f71993zoijcleaow == null) {
            if (!nufgyqmvbu(vdvldrhtssVar)) {
                throw ParserException.iobyxmoadg("Failed to determine bitstream type", null);
            }
            vdvldrhtssVar.gxszxtbevo();
        }
        if (!this.f71992ppxfxbqfkf) {
            dsvhmnatus dsvhmnatusVarKcexrzcfyt = this.f71991iobyxmoadg.kcexrzcfyt(0, 1);
            this.f71991iobyxmoadg.agtfadlqog();
            this.f71993zoijcleaow.wkgbmnqykc(this.f71991iobyxmoadg, dsvhmnatusVarKcexrzcfyt);
            this.f71992ppxfxbqfkf = true;
        }
        return this.f71993zoijcleaow.lqeggnwhkg(vdvldrhtssVar, ylkuphrtabVar);
    }
}
