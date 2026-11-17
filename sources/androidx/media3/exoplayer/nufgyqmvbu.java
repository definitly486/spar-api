package androidx.media3.exoplayer;

import androidx.media3.decoder.DecoderInputBuffer;
import g3.h0;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class nufgyqmvbu implements wizcaqwiak, hszhottldk {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private long f10894cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f10895cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private h0 f10896esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg[] f10898istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private f3.hcddaimhww f10899iwizpuwonk;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private y2.dxjokdxxww f10901lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f10902lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private hszhottldk.iobyxmoadg f10903pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f10904pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private boolean f10905wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private long f10906yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f10907yggfygwlhe;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private m3.oxmwwwfdhm f10910zynmafqrjb;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Object f10909zdlpuopuiu = new Object();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final f3.lmojexxdyd f10900jyumaefscl = new f3.lmojexxdyd();

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private long f10897iozdgvuglv = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private v2.cdpycssgdh f10908ylkuphrtab = v2.cdpycssgdh.f115259iobyxmoadg;

    public nufgyqmvbu(int i13) {
        this.f10907yggfygwlhe = i13;
    }

    private void iyctptxqzt(long j13, boolean z13) {
        this.f10902lmojexxdyd = false;
        this.f10906yadqdtsiqt = j13;
        this.f10897iozdgvuglv = j13;
        czzsidtyhn(j13, z13);
    }

    protected void bfopjjpdmp(v2.cdpycssgdh cdpycssgdhVar) {
    }

    public int cllcsxoeiz() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.igdgnonuha.zoijcleaow
    public void cqumvgiudr(int i13, Object obj) {
    }

    protected final f3.lmojexxdyd crxdokpmqz() {
        this.f10900jyumaefscl.iobyxmoadg();
        return this.f10900jyumaefscl;
    }

    protected abstract void czzsidtyhn(long j13, boolean z13);

    @Override // androidx.media3.exoplayer.hszhottldk
    public final void draadjrbmk() {
        synchronized (this.f10909zdlpuopuiu) {
            this.f10903pkzmftpjix = null;
        }
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public final void dsvhmnatus(v2.cdpycssgdh cdpycssgdhVar) {
        if (Objects.equals(this.f10908ylkuphrtab, cdpycssgdhVar)) {
            return;
        }
        this.f10908ylkuphrtab = cdpycssgdhVar;
        bfopjjpdmp(cdpycssgdhVar);
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak, androidx.media3.exoplayer.hszhottldk
    public final int dxjokdxxww() {
        return this.f10907yggfygwlhe;
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public final void esjtqupxsv(f3.hcddaimhww hcddaimhwwVar, androidx.media3.common.iobyxmoadg[] iobyxmoadgVarArr, m3.oxmwwwfdhm oxmwwwfdhmVar, long j13, boolean z13, boolean z14, long j14, long j15, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        y2.iobyxmoadg.lqeggnwhkg(this.f10904pmvmpeiblj == 0);
        this.f10899iwizpuwonk = hcddaimhwwVar;
        this.f10904pmvmpeiblj = 1;
        metgxyhuhe(z13, z14);
        oxmwwwfdhm(iobyxmoadgVarArr, oxmwwwfdhmVar, j14, j15, zoijcleaowVar);
        iyctptxqzt(j14, z13);
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public final int getState() {
        return this.f10904pmvmpeiblj;
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public final m3.oxmwwwfdhm gtknphoqwx() {
        return this.f10910zynmafqrjb;
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public final void gxszxtbevo() {
        y2.iobyxmoadg.lqeggnwhkg(this.f10904pmvmpeiblj == 1);
        this.f10900jyumaefscl.iobyxmoadg();
        this.f10904pmvmpeiblj = 0;
        this.f10910zynmafqrjb = null;
        this.f10898istkbnxepw = null;
        this.f10902lmojexxdyd = false;
        xrmfcynszj();
    }

    protected final long ikoacuggdj() {
        return this.f10894cdpycssgdh;
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public final boolean istkbnxepw() {
        return this.f10902lmojexxdyd;
    }

    protected final androidx.media3.common.iobyxmoadg[] jhduphickx() {
        return (androidx.media3.common.iobyxmoadg[]) y2.iobyxmoadg.eablkybsjg(this.f10898istkbnxepw);
    }

    protected final int jlmebxxoox() {
        return this.f10895cqumvgiudr;
    }

    protected final boolean jztzpxfvev() {
        return wflxmlrfwp() ? this.f10902lmojexxdyd : ((m3.oxmwwwfdhm) y2.iobyxmoadg.eablkybsjg(this.f10910zynmafqrjb)).ppxfxbqfkf();
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public f3.ylkuphrtab kegysxyocb() {
        return null;
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public final void lereixgezr() {
        ((m3.oxmwwwfdhm) y2.iobyxmoadg.eablkybsjg(this.f10910zynmafqrjb)).iobyxmoadg();
    }

    protected final ExoPlaybackException mbcevpiqjq(Throwable th2, androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i13) {
        return ntlheqmsrt(th2, iobyxmoadgVar, false, i13);
    }

    protected void metgxyhuhe(boolean z13, boolean z14) {
    }

    protected final ExoPlaybackException ntlheqmsrt(Throwable th2, androidx.media3.common.iobyxmoadg iobyxmoadgVar, boolean z13, int i13) {
        int iTzroggbefp;
        if (iobyxmoadgVar == null || this.f10905wwaezpbzkn) {
            iTzroggbefp = 4;
        } else {
            this.f10905wwaezpbzkn = true;
            try {
                iTzroggbefp = hszhottldk.tzroggbefp(iobyxmoadg(iobyxmoadgVar));
                this.f10905wwaezpbzkn = false;
            } catch (ExoPlaybackException unused) {
                this.f10905wwaezpbzkn = false;
                iTzroggbefp = 4;
            } catch (Throwable th3) {
                this.f10905wwaezpbzkn = false;
                throw th3;
            }
        }
        return ExoPlaybackException.wkgbmnqykc(th2, getName(), jlmebxxoox(), iobyxmoadgVar, iTzroggbefp, z13, i13);
    }

    protected void oipsdeybqn(androidx.media3.common.iobyxmoadg[] iobyxmoadgVarArr, long j13, long j14, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
    }

    protected final v2.cdpycssgdh okpsazkaxt() {
        return this.f10908ylkuphrtab;
    }

    protected final int opjhrmiecq(f3.lmojexxdyd lmojexxdydVar, DecoderInputBuffer decoderInputBuffer, int i13) {
        int iZoijcleaow = ((m3.oxmwwwfdhm) y2.iobyxmoadg.eablkybsjg(this.f10910zynmafqrjb)).zoijcleaow(lmojexxdydVar, decoderInputBuffer, i13);
        if (iZoijcleaow == -4) {
            if (decoderInputBuffer.dxjokdxxww()) {
                this.f10897iozdgvuglv = Long.MIN_VALUE;
                return this.f10902lmojexxdyd ? -4 : -3;
            }
            long j13 = decoderInputBuffer.f10020esjtqupxsv + this.f10894cdpycssgdh;
            decoderInputBuffer.f10020esjtqupxsv = j13;
            this.f10897iozdgvuglv = Math.max(this.f10897iozdgvuglv, j13);
        } else if (iZoijcleaow == -5) {
            androidx.media3.common.iobyxmoadg iobyxmoadgVar = (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(lmojexxdydVar.f32682zoijcleaow);
            if (iobyxmoadgVar.f9782zdlpuopuiu != Long.MAX_VALUE) {
                lmojexxdydVar.f32682zoijcleaow = iobyxmoadgVar.zoijcleaow().uawqvzlxes(iobyxmoadgVar.f9782zdlpuopuiu + this.f10894cdpycssgdh).cllcsxoeiz();
            }
        }
        return iZoijcleaow;
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public final void oxmwwwfdhm(androidx.media3.common.iobyxmoadg[] iobyxmoadgVarArr, m3.oxmwwwfdhm oxmwwwfdhmVar, long j13, long j14, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        y2.iobyxmoadg.lqeggnwhkg(!this.f10902lmojexxdyd);
        this.f10910zynmafqrjb = oxmwwwfdhmVar;
        if (this.f10897iozdgvuglv == Long.MIN_VALUE) {
            this.f10897iozdgvuglv = j13;
        }
        this.f10898istkbnxepw = iobyxmoadgVarArr;
        this.f10894cdpycssgdh = j14;
        oipsdeybqn(iobyxmoadgVarArr, j13, j14, zoijcleaowVar);
    }

    @Override // androidx.media3.exoplayer.hszhottldk
    public final void pkzmftpjix(hszhottldk.iobyxmoadg iobyxmoadgVar) {
        synchronized (this.f10909zdlpuopuiu) {
            this.f10903pkzmftpjix = iobyxmoadgVar;
        }
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public final void release() {
        y2.iobyxmoadg.lqeggnwhkg(this.f10904pmvmpeiblj == 0);
        uwvvkdfqfp();
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public final void rgvfuqvkyq() {
        this.f10902lmojexxdyd = true;
    }

    protected final long ribwqtqdhb() {
        return this.f10906yadqdtsiqt;
    }

    protected void rlfsiqarku() {
    }

    protected void sflfametgt() {
    }

    protected final f3.hcddaimhww sopmlzcsov() {
        return (f3.hcddaimhww) y2.iobyxmoadg.eablkybsjg(this.f10899iwizpuwonk);
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public final void start() {
        y2.iobyxmoadg.lqeggnwhkg(this.f10904pmvmpeiblj == 1);
        this.f10904pmvmpeiblj = 2;
        sflfametgt();
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public final void stevsuqkhv(long j13) {
        iyctptxqzt(j13, false);
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public final void stop() {
        y2.iobyxmoadg.lqeggnwhkg(this.f10904pmvmpeiblj == 2);
        this.f10904pmvmpeiblj = 1;
        zfvoamnweg();
    }

    protected final y2.dxjokdxxww ulzqkzuiru() {
        return (y2.dxjokdxxww) y2.iobyxmoadg.eablkybsjg(this.f10901lereixgezr);
    }

    protected void uwvvkdfqfp() {
    }

    protected final h0 vipkmwdibw() {
        return (h0) y2.iobyxmoadg.eablkybsjg(this.f10896esjtqupxsv);
    }

    protected int weqkydbzbr(long j13) {
        return ((m3.oxmwwwfdhm) y2.iobyxmoadg.eablkybsjg(this.f10910zynmafqrjb)).wkgbmnqykc(j13 - this.f10894cdpycssgdh);
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public final boolean wflxmlrfwp() {
        return this.f10897iozdgvuglv == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public final void wwaezpbzkn(int i13, h0 h0Var, y2.dxjokdxxww dxjokdxxwwVar) {
        this.f10895cqumvgiudr = i13;
        this.f10896esjtqupxsv = h0Var;
        this.f10901lereixgezr = dxjokdxxwwVar;
        rlfsiqarku();
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public final long wypolnanlu() {
        return this.f10897iozdgvuglv;
    }

    protected abstract void xrmfcynszj();

    protected void ydmasvzmpa() {
    }

    protected final void yfnezrywwk() {
        hszhottldk.iobyxmoadg iobyxmoadgVar;
        synchronized (this.f10909zdlpuopuiu) {
            iobyxmoadgVar = this.f10903pkzmftpjix;
        }
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.iobyxmoadg(this);
        }
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public final hszhottldk ylkuphrtab() {
        return this;
    }

    protected void zfvoamnweg() {
    }

    @Override // androidx.media3.exoplayer.wizcaqwiak
    public final void zoijcleaow() {
        y2.iobyxmoadg.lqeggnwhkg(this.f10904pmvmpeiblj == 0);
        this.f10900jyumaefscl.iobyxmoadg();
        ydmasvzmpa();
    }
}
