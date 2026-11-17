package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;
import java.lang.reflect.Method;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class lqeggnwhkg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private Method f10243agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private float f10244btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private long f10245cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f10246cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private long f10247draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private long f10248dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f10249eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private long f10250esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f10251gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private gxszxtbevo f10252gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f10253iobyxmoadg;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private long f10254iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private long f10255istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f10256iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private long f10257jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private long f10258kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private long f10259lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private long f10260lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f10261lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f10262nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private long f10263ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private long f10264oxmwwwfdhm;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private y2.dxjokdxxww f10265pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private long f10266pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private AudioTrack f10267ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private boolean f10268rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private boolean f10269vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private long f10270wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f10271wkgbmnqykc;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private boolean f10272wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f10273yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private long f10274yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private long f10275ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private long f10276zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long[] f10277zoijcleaow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private long f10278zynmafqrjb;

    public interface iobyxmoadg {
        void eablkybsjg(long j13, long j14, long j15, long j16);

        void iobyxmoadg(int i13, long j13);

        void ppxfxbqfkf(long j13);

        void wkgbmnqykc(long j13, long j14, long j15, long j16);

        void zoijcleaow(long j13);
    }

    public lqeggnwhkg(iobyxmoadg iobyxmoadgVar) {
        this.f10253iobyxmoadg = (iobyxmoadg) y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar);
        try {
            this.f10243agtfadlqog = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f10277zoijcleaow = new long[10];
        this.f10265pkzmftpjix = y2.dxjokdxxww.f123544iobyxmoadg;
    }

    private void agtfadlqog(long j13) {
        Method method;
        if (!this.f10269vdvldrhtss || (method = this.f10243agtfadlqog) == null || j13 - this.f10264oxmwwwfdhm < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) stevsuqkhv.nufgyqmvbu((Integer) method.invoke(y2.iobyxmoadg.eablkybsjg(this.f10267ppxfxbqfkf), null))).intValue()) * 1000) - this.f10248dxjokdxxww;
            this.f10263ojitshcjhn = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f10263ojitshcjhn = jMax;
            if (jMax > 5000000) {
                this.f10253iobyxmoadg.ppxfxbqfkf(jMax);
                this.f10263ojitshcjhn = 0L;
            }
        } catch (Exception unused) {
            this.f10243agtfadlqog = null;
        }
        this.f10264oxmwwwfdhm = j13;
    }

    private void draadjrbmk(long j13) {
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) y2.iobyxmoadg.eablkybsjg(this.f10252gxszxtbevo);
        if (gxszxtbevoVar.gxszxtbevo(j13)) {
            long jWkgbmnqykc = gxszxtbevoVar.wkgbmnqykc();
            long jPpxfxbqfkf = gxszxtbevoVar.ppxfxbqfkf();
            long jEablkybsjg = eablkybsjg();
            if (Math.abs(jWkgbmnqykc - j13) > 5000000) {
                this.f10253iobyxmoadg.eablkybsjg(jPpxfxbqfkf, jWkgbmnqykc, j13, jEablkybsjg);
                gxszxtbevoVar.lqeggnwhkg();
            } else if (Math.abs(stevsuqkhv.a(jPpxfxbqfkf, this.f10261lqeggnwhkg) - jEablkybsjg) <= 5000000) {
                gxszxtbevoVar.iobyxmoadg();
            } else {
                this.f10253iobyxmoadg.wkgbmnqykc(jPpxfxbqfkf, jWkgbmnqykc, j13, jEablkybsjg);
                gxszxtbevoVar.lqeggnwhkg();
            }
        }
    }

    private long eablkybsjg() {
        return stevsuqkhv.a(wkgbmnqykc(), this.f10261lqeggnwhkg);
    }

    private long gxszxtbevo() {
        if (((AudioTrack) y2.iobyxmoadg.eablkybsjg(this.f10267ppxfxbqfkf)).getPlayState() == 2) {
            return this.f10266pmvmpeiblj;
        }
        return this.f10266pmvmpeiblj + stevsuqkhv.yadqdtsiqt(stevsuqkhv.ikoacuggdj(stevsuqkhv.ixidwrxhsl(this.f10265pkzmftpjix.elapsedRealtime()) - this.f10250esjtqupxsv, this.f10244btonecajqb), this.f10261lqeggnwhkg);
    }

    private void iwizpuwonk(long j13) {
        AudioTrack audioTrack = (AudioTrack) y2.iobyxmoadg.eablkybsjg(this.f10267ppxfxbqfkf);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f10262nufgyqmvbu) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f10257jyumaefscl = this.f10276zdlpuopuiu;
            }
            playbackHeadPosition += this.f10257jyumaefscl;
        }
        if (stevsuqkhv.f123602iobyxmoadg <= 29) {
            if (playbackHeadPosition == 0 && this.f10276zdlpuopuiu > 0 && playState == 3) {
                if (this.f10259lereixgezr == -9223372036854775807L) {
                    this.f10259lereixgezr = j13;
                    return;
                }
                return;
            }
            this.f10259lereixgezr = -9223372036854775807L;
        }
        long j14 = this.f10276zdlpuopuiu;
        if (j14 > playbackHeadPosition) {
            if (this.f10272wwaezpbzkn) {
                this.f10275ylkuphrtab += j14;
                this.f10272wwaezpbzkn = false;
            } else {
                this.f10274yggfygwlhe++;
            }
        }
        this.f10276zdlpuopuiu = playbackHeadPosition;
    }

    private static boolean ojitshcjhn(int i13) {
        return stevsuqkhv.f123602iobyxmoadg < 23 && (i13 == 5 || i13 == 6);
    }

    private void oxmwwwfdhm() {
        this.f10247draadjrbmk = 0L;
        this.f10246cqumvgiudr = 0;
        this.f10256iwizpuwonk = 0;
        this.f10270wflxmlrfwp = 0L;
        this.f10245cdpycssgdh = 0L;
        this.f10260lmojexxdyd = 0L;
        this.f10251gtknphoqwx = false;
    }

    private void wflxmlrfwp() {
        long jNanoTime = this.f10265pkzmftpjix.nanoTime() / 1000;
        if (jNanoTime - this.f10270wflxmlrfwp >= 30000) {
            long jEablkybsjg = eablkybsjg();
            if (jEablkybsjg != 0) {
                this.f10277zoijcleaow[this.f10256iwizpuwonk] = stevsuqkhv.rlfsiqarku(jEablkybsjg, this.f10244btonecajqb) - jNanoTime;
                this.f10256iwizpuwonk = (this.f10256iwizpuwonk + 1) % 10;
                int i13 = this.f10246cqumvgiudr;
                if (i13 < 10) {
                    this.f10246cqumvgiudr = i13 + 1;
                }
                this.f10270wflxmlrfwp = jNanoTime;
                this.f10247draadjrbmk = 0L;
                int i14 = 0;
                while (true) {
                    int i15 = this.f10246cqumvgiudr;
                    if (i14 >= i15) {
                        break;
                    }
                    this.f10247draadjrbmk += this.f10277zoijcleaow[i14] / ((long) i15);
                    i14++;
                }
            } else {
                return;
            }
        }
        if (this.f10262nufgyqmvbu) {
            return;
        }
        draadjrbmk(jNanoTime);
        agtfadlqog(jNanoTime);
    }

    private long wkgbmnqykc() {
        if (this.f10250esjtqupxsv != -9223372036854775807L) {
            return Math.min(this.f10278zynmafqrjb, gxszxtbevo());
        }
        long jElapsedRealtime = this.f10265pkzmftpjix.elapsedRealtime();
        if (jElapsedRealtime - this.f10258kcexrzcfyt >= 5) {
            iwizpuwonk(jElapsedRealtime);
            this.f10258kcexrzcfyt = jElapsedRealtime;
        }
        return this.f10276zdlpuopuiu + this.f10275ylkuphrtab + (this.f10274yggfygwlhe << 32);
    }

    private boolean zoijcleaow() {
        return this.f10262nufgyqmvbu && ((AudioTrack) y2.iobyxmoadg.eablkybsjg(this.f10267ppxfxbqfkf)).getPlayState() == 2 && wkgbmnqykc() == 0;
    }

    public boolean btonecajqb(long j13) {
        return this.f10259lereixgezr != -9223372036854775807L && j13 > 0 && this.f10265pkzmftpjix.elapsedRealtime() - this.f10259lereixgezr >= 200;
    }

    public boolean dxjokdxxww() {
        return ((AudioTrack) y2.iobyxmoadg.eablkybsjg(this.f10267ppxfxbqfkf)).getPlayState() == 3;
    }

    public boolean gtknphoqwx(long j13) {
        int playState = ((AudioTrack) y2.iobyxmoadg.eablkybsjg(this.f10267ppxfxbqfkf)).getPlayState();
        if (this.f10262nufgyqmvbu) {
            if (playState == 2) {
                this.f10268rgvfuqvkyq = false;
                return false;
            }
            if (playState == 1 && wkgbmnqykc() == 0) {
                return false;
            }
        }
        boolean z13 = this.f10268rgvfuqvkyq;
        boolean zNufgyqmvbu = nufgyqmvbu(j13);
        this.f10268rgvfuqvkyq = zNufgyqmvbu;
        if (z13 && !zNufgyqmvbu && playState != 1) {
            this.f10253iobyxmoadg.iobyxmoadg(this.f10249eablkybsjg, stevsuqkhv.t(this.f10248dxjokdxxww));
        }
        return true;
    }

    public void iobyxmoadg() {
        this.f10272wwaezpbzkn = true;
        gxszxtbevo gxszxtbevoVar = this.f10252gxszxtbevo;
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.zoijcleaow();
        }
    }

    public void jyumaefscl() {
        if (this.f10250esjtqupxsv != -9223372036854775807L) {
            this.f10250esjtqupxsv = stevsuqkhv.ixidwrxhsl(this.f10265pkzmftpjix.elapsedRealtime());
        }
        ((gxszxtbevo) y2.iobyxmoadg.eablkybsjg(this.f10252gxszxtbevo)).nufgyqmvbu();
    }

    public void kcexrzcfyt(AudioTrack audioTrack, boolean z13, int i13, int i14, int i15) {
        this.f10267ppxfxbqfkf = audioTrack;
        this.f10271wkgbmnqykc = i14;
        this.f10249eablkybsjg = i15;
        this.f10252gxszxtbevo = new gxszxtbevo(audioTrack);
        this.f10261lqeggnwhkg = audioTrack.getSampleRate();
        this.f10262nufgyqmvbu = z13 && ojitshcjhn(i13);
        boolean zSkhdrjzrfn = stevsuqkhv.skhdrjzrfn(i13);
        this.f10269vdvldrhtss = zSkhdrjzrfn;
        this.f10248dxjokdxxww = zSkhdrjzrfn ? stevsuqkhv.a(i15 / i14, this.f10261lqeggnwhkg) : -9223372036854775807L;
        this.f10276zdlpuopuiu = 0L;
        this.f10274yggfygwlhe = 0L;
        this.f10272wwaezpbzkn = false;
        this.f10275ylkuphrtab = 0L;
        this.f10257jyumaefscl = 0L;
        this.f10268rgvfuqvkyq = false;
        this.f10250esjtqupxsv = -9223372036854775807L;
        this.f10259lereixgezr = -9223372036854775807L;
        this.f10264oxmwwwfdhm = 0L;
        this.f10263ojitshcjhn = 0L;
        this.f10244btonecajqb = 1.0f;
    }

    public void lqeggnwhkg(long j13) {
        this.f10266pmvmpeiblj = wkgbmnqykc();
        this.f10250esjtqupxsv = stevsuqkhv.ixidwrxhsl(this.f10265pkzmftpjix.elapsedRealtime());
        this.f10278zynmafqrjb = j13;
    }

    public boolean nufgyqmvbu(long j13) {
        return j13 > stevsuqkhv.yadqdtsiqt(ppxfxbqfkf(), this.f10261lqeggnwhkg) || zoijcleaow();
    }

    public long ppxfxbqfkf() {
        long jIkoacuggdj;
        long jMin;
        AudioTrack audioTrack = (AudioTrack) y2.iobyxmoadg.eablkybsjg(this.f10267ppxfxbqfkf);
        if (audioTrack.getPlayState() == 3) {
            wflxmlrfwp();
        }
        long jNanoTime = this.f10265pkzmftpjix.nanoTime() / 1000;
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) y2.iobyxmoadg.eablkybsjg(this.f10252gxszxtbevo);
        boolean zEablkybsjg = gxszxtbevoVar.eablkybsjg();
        if (zEablkybsjg) {
            jMin = stevsuqkhv.a(gxszxtbevoVar.ppxfxbqfkf(), this.f10261lqeggnwhkg) + stevsuqkhv.ikoacuggdj(jNanoTime - gxszxtbevoVar.wkgbmnqykc(), this.f10244btonecajqb);
        } else {
            if (this.f10246cqumvgiudr == 0) {
                jIkoacuggdj = this.f10250esjtqupxsv != -9223372036854775807L ? stevsuqkhv.a(gxszxtbevo(), this.f10261lqeggnwhkg) : eablkybsjg();
            } else {
                jIkoacuggdj = stevsuqkhv.ikoacuggdj(this.f10247draadjrbmk + jNanoTime, this.f10244btonecajqb);
            }
            long jMax = Math.max(0L, jIkoacuggdj - this.f10263ojitshcjhn);
            jMin = this.f10250esjtqupxsv != -9223372036854775807L ? Math.min(stevsuqkhv.a(this.f10278zynmafqrjb, this.f10261lqeggnwhkg), jMax) : jMax;
        }
        if (this.f10273yadqdtsiqt != zEablkybsjg) {
            this.f10260lmojexxdyd = this.f10245cdpycssgdh;
            this.f10254iozdgvuglv = this.f10255istkbnxepw;
        }
        long j13 = jNanoTime - this.f10260lmojexxdyd;
        if (j13 < 1000000) {
            long jIkoacuggdj2 = this.f10254iozdgvuglv + stevsuqkhv.ikoacuggdj(j13, this.f10244btonecajqb);
            long j14 = (j13 * 1000) / 1000000;
            jMin = ((jMin * j14) + ((1000 - j14) * jIkoacuggdj2)) / 1000;
        }
        if (!this.f10251gtknphoqwx && jMin > this.f10255istkbnxepw && audioTrack.getPlayState() == 3) {
            this.f10251gtknphoqwx = true;
            this.f10253iobyxmoadg.zoijcleaow(this.f10265pkzmftpjix.currentTimeMillis() - stevsuqkhv.t(stevsuqkhv.rlfsiqarku(stevsuqkhv.t(jMin - this.f10255istkbnxepw), this.f10244btonecajqb)));
        }
        this.f10245cdpycssgdh = jNanoTime;
        this.f10255istkbnxepw = jMin;
        this.f10273yadqdtsiqt = zEablkybsjg;
        return jMin;
    }

    public boolean rgvfuqvkyq() {
        oxmwwwfdhm();
        if (this.f10250esjtqupxsv == -9223372036854775807L) {
            ((gxszxtbevo) y2.iobyxmoadg.eablkybsjg(this.f10252gxszxtbevo)).nufgyqmvbu();
            return true;
        }
        this.f10266pmvmpeiblj = wkgbmnqykc();
        return false;
    }

    public void vdvldrhtss() {
        oxmwwwfdhm();
        this.f10267ppxfxbqfkf = null;
        this.f10252gxszxtbevo = null;
    }

    public void yggfygwlhe(y2.dxjokdxxww dxjokdxxwwVar) {
        this.f10265pkzmftpjix = dxjokdxxwwVar;
    }

    public void zdlpuopuiu(float f13) {
        this.f10244btonecajqb = f13;
        gxszxtbevo gxszxtbevoVar = this.f10252gxszxtbevo;
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.nufgyqmvbu();
        }
        oxmwwwfdhm();
    }
}
