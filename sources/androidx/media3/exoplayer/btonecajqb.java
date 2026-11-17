package androidx.media3.exoplayer;

import g3.h0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class btonecajqb implements czzsidtyhn {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final HashMap f10332btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final boolean f10333dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final long f10334eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private long f10335gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f10336gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final p3.eablkybsjg f10337iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f10338lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final long f10339nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f10340ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final long f10341wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f10342zoijcleaow;

    private static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public boolean f10343iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public int f10344zoijcleaow;

        private zoijcleaow() {
        }
    }

    public btonecajqb() {
        this(new p3.eablkybsjg(true, 65536), 50000, 50000, 1000, 2000, -1, false, 0, false);
    }

    private static int agtfadlqog(int i13) {
        switch (i13) {
            case -2:
                return 0;
            case -1:
                return 13107200;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    private static void gtknphoqwx(int i13, int i14, String str, String str2) {
        y2.iobyxmoadg.zoijcleaow(i13 >= i14, str + " cannot be less than " + str2);
    }

    private void ojitshcjhn(h0 h0Var) {
        if (this.f10332btonecajqb.remove(h0Var) != null) {
            vdvldrhtss();
        }
    }

    private void rgvfuqvkyq(h0 h0Var) {
        zoijcleaow zoijcleaowVar = (zoijcleaow) y2.iobyxmoadg.eablkybsjg((zoijcleaow) this.f10332btonecajqb.get(h0Var));
        int i13 = this.f10336gxszxtbevo;
        if (i13 == -1) {
            i13 = 13107200;
        }
        zoijcleaowVar.f10344zoijcleaow = i13;
        zoijcleaowVar.f10343iobyxmoadg = false;
    }

    private void vdvldrhtss() {
        if (this.f10332btonecajqb.isEmpty()) {
            this.f10337iobyxmoadg.lqeggnwhkg();
        } else {
            this.f10337iobyxmoadg.nufgyqmvbu(wflxmlrfwp());
        }
    }

    @Override // androidx.media3.exoplayer.czzsidtyhn
    public void btonecajqb(h0 h0Var) {
        ojitshcjhn(h0Var);
    }

    protected int draadjrbmk(o3.esjtqupxsv[] esjtqupxsvVarArr) {
        int iAgtfadlqog = 0;
        for (o3.esjtqupxsv esjtqupxsvVar : esjtqupxsvVarArr) {
            if (esjtqupxsvVar != null) {
                iAgtfadlqog += agtfadlqog(esjtqupxsvVar.nufgyqmvbu().f115706ppxfxbqfkf);
            }
        }
        return Math.max(13107200, iAgtfadlqog);
    }

    @Override // androidx.media3.exoplayer.czzsidtyhn
    public void dxjokdxxww(czzsidtyhn.iobyxmoadg iobyxmoadgVar, m3.iwizpuwonk iwizpuwonkVar, o3.esjtqupxsv[] esjtqupxsvVarArr) {
        zoijcleaow zoijcleaowVar = (zoijcleaow) y2.iobyxmoadg.eablkybsjg((zoijcleaow) this.f10332btonecajqb.get(iobyxmoadgVar.f10354iobyxmoadg));
        int iDraadjrbmk = this.f10336gxszxtbevo;
        if (iDraadjrbmk == -1) {
            iDraadjrbmk = draadjrbmk(esjtqupxsvVarArr);
        }
        zoijcleaowVar.f10344zoijcleaow = iDraadjrbmk;
        vdvldrhtss();
    }

    @Override // androidx.media3.exoplayer.czzsidtyhn
    public void eablkybsjg(h0 h0Var) {
        ojitshcjhn(h0Var);
        if (this.f10332btonecajqb.isEmpty()) {
            this.f10335gtknphoqwx = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.czzsidtyhn
    public boolean gxszxtbevo(v2.cdpycssgdh cdpycssgdhVar, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, long j13) {
        Iterator it = this.f10332btonecajqb.values().iterator();
        while (it.hasNext()) {
            if (((zoijcleaow) it.next()).f10343iobyxmoadg) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.czzsidtyhn
    public boolean iobyxmoadg(czzsidtyhn.iobyxmoadg iobyxmoadgVar) {
        long jRlfsiqarku = y2.stevsuqkhv.rlfsiqarku(iobyxmoadgVar.f10352eablkybsjg, iobyxmoadgVar.f10353gxszxtbevo);
        long jMin = iobyxmoadgVar.f10356nufgyqmvbu ? this.f10334eablkybsjg : this.f10341wkgbmnqykc;
        long j13 = iobyxmoadgVar.f10351dxjokdxxww;
        if (j13 != -9223372036854775807L) {
            jMin = Math.min(j13 / 2, jMin);
        }
        return jMin <= 0 || jRlfsiqarku >= jMin || (!this.f10338lqeggnwhkg && this.f10337iobyxmoadg.gxszxtbevo() >= wflxmlrfwp());
    }

    @Override // androidx.media3.exoplayer.czzsidtyhn
    public p3.zoijcleaow lqeggnwhkg() {
        return this.f10337iobyxmoadg;
    }

    @Override // androidx.media3.exoplayer.czzsidtyhn
    public boolean nufgyqmvbu(czzsidtyhn.iobyxmoadg iobyxmoadgVar) {
        zoijcleaow zoijcleaowVar = (zoijcleaow) y2.iobyxmoadg.eablkybsjg((zoijcleaow) this.f10332btonecajqb.get(iobyxmoadgVar.f10354iobyxmoadg));
        boolean z13 = true;
        boolean z14 = this.f10337iobyxmoadg.gxszxtbevo() >= wflxmlrfwp();
        long jMin = this.f10342zoijcleaow;
        float f13 = iobyxmoadgVar.f10353gxszxtbevo;
        if (f13 > 1.0f) {
            jMin = Math.min(y2.stevsuqkhv.ikoacuggdj(jMin, f13), this.f10340ppxfxbqfkf);
        }
        long jMax = Math.max(jMin, 500000L);
        long j13 = iobyxmoadgVar.f10352eablkybsjg;
        if (j13 < jMax) {
            if (!this.f10338lqeggnwhkg && z14) {
                z13 = false;
            }
            zoijcleaowVar.f10343iobyxmoadg = z13;
            if (!z13 && j13 < 500000) {
                y2.kcexrzcfyt.nufgyqmvbu("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j13 >= this.f10340ppxfxbqfkf || z14) {
            zoijcleaowVar.f10343iobyxmoadg = false;
        }
        return zoijcleaowVar.f10343iobyxmoadg;
    }

    @Override // androidx.media3.exoplayer.czzsidtyhn
    public void ppxfxbqfkf(h0 h0Var) {
        long id2 = Thread.currentThread().getId();
        long j13 = this.f10335gtknphoqwx;
        y2.iobyxmoadg.nufgyqmvbu(j13 == -1 || j13 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f10335gtknphoqwx = id2;
        if (!this.f10332btonecajqb.containsKey(h0Var)) {
            this.f10332btonecajqb.put(h0Var, new zoijcleaow());
        }
        rgvfuqvkyq(h0Var);
    }

    int wflxmlrfwp() {
        Iterator it = this.f10332btonecajqb.values().iterator();
        int i13 = 0;
        while (it.hasNext()) {
            i13 += ((zoijcleaow) it.next()).f10344zoijcleaow;
        }
        return i13;
    }

    @Override // androidx.media3.exoplayer.czzsidtyhn
    public long wkgbmnqykc(h0 h0Var) {
        return this.f10339nufgyqmvbu;
    }

    @Override // androidx.media3.exoplayer.czzsidtyhn
    public boolean zoijcleaow(h0 h0Var) {
        return this.f10333dxjokdxxww;
    }

    protected btonecajqb(p3.eablkybsjg eablkybsjgVar, int i13, int i14, int i15, int i16, int i17, boolean z13, int i18, boolean z14) {
        gtknphoqwx(i15, 0, "bufferForPlaybackMs", CommonUrlParts.Values.FALSE_INTEGER);
        gtknphoqwx(i16, 0, "bufferForPlaybackAfterRebufferMs", CommonUrlParts.Values.FALSE_INTEGER);
        gtknphoqwx(i13, i15, "minBufferMs", "bufferForPlaybackMs");
        gtknphoqwx(i13, i16, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        gtknphoqwx(i14, i13, "maxBufferMs", "minBufferMs");
        gtknphoqwx(i18, 0, "backBufferDurationMs", CommonUrlParts.Values.FALSE_INTEGER);
        this.f10337iobyxmoadg = eablkybsjgVar;
        this.f10342zoijcleaow = y2.stevsuqkhv.ixidwrxhsl(i13);
        this.f10340ppxfxbqfkf = y2.stevsuqkhv.ixidwrxhsl(i14);
        this.f10341wkgbmnqykc = y2.stevsuqkhv.ixidwrxhsl(i15);
        this.f10334eablkybsjg = y2.stevsuqkhv.ixidwrxhsl(i16);
        this.f10336gxszxtbevo = i17;
        this.f10338lqeggnwhkg = z13;
        this.f10339nufgyqmvbu = y2.stevsuqkhv.ixidwrxhsl(i18);
        this.f10333dxjokdxxww = z14;
        this.f10332btonecajqb = new HashMap();
        this.f10335gtknphoqwx = -1L;
    }
}
