package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.uwvvkdfqfp;
import com.google.android.gms.location.DeviceOrientationRequest;
import f3.hkdspvbjdz;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import t3.dsvhmnatus;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class zynmafqrjb implements vdvldrhtss, t3.oxmwwwfdhm, Loader.zoijcleaow, Loader.gxszxtbevo, iozdgvuglv.wkgbmnqykc {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final int f11346cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private g4.zoijcleaow f11347cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final kcexrzcfyt.iobyxmoadg f11348cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private boolean f11349crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private boolean f11350czzsidtyhn;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private iozdgvuglv[] f11351dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.nufgyqmvbu.iobyxmoadg f11352esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final Runnable f11353hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private vdvldrhtss.iobyxmoadg f11354hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private int f11355ikoacuggdj;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final long f11356iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final long f11357istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.zoijcleaow f11358iwizpuwonk;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private boolean f11359jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private int f11360jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final Handler f11361jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.dxjokdxxww f11362jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private long f11363jztzpxfvev;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private boolean f11364kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final ppxfxbqfkf f11365lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final Loader f11366lmojexxdyd;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private boolean f11367mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private boolean f11368metgxyhuhe;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private gxszxtbevo f11369ntlheqmsrt;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private boolean f11370okpsazkaxt;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final Runnable f11371pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final p3.zoijcleaow f11372pmvmpeiblj;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private boolean f11373ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private int f11374rlfsiqarku;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private long f11375sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private boolean f11376stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private boolean f11377tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private t3.pkzmftpjix f11378ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private boolean f11379uwvvkdfqfp;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private boolean f11380vipkmwdibw;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final iwizpuwonk f11381wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private eablkybsjg[] f11382wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private long f11383xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final androidx.media3.common.iobyxmoadg f11384yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final androidx.media3.datasource.iobyxmoadg f11385yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final y2.draadjrbmk f11386ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Uri f11387zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final String f11388zynmafqrjb;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private static final Map f11345yfnezrywwk = cllcsxoeiz();

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private static final androidx.media3.common.iobyxmoadg f11344ydmasvzmpa = new androidx.media3.common.iobyxmoadg.zoijcleaow().xrmfcynszj("icy").zeieaojujs("application/x-icy").cllcsxoeiz();

    private static final class eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f11389iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final boolean f11390zoijcleaow;

        public eablkybsjg(int i13, boolean z13) {
            this.f11389iobyxmoadg = i13;
            this.f11390zoijcleaow = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || eablkybsjg.class != obj.getClass()) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return this.f11389iobyxmoadg == eablkybsjgVar.f11389iobyxmoadg && this.f11390zoijcleaow == eablkybsjgVar.f11390zoijcleaow;
        }

        public int hashCode() {
            return (this.f11389iobyxmoadg * 31) + (this.f11390zoijcleaow ? 1 : 0);
        }
    }

    private static final class gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final m3.iwizpuwonk f11391iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final boolean[] f11392ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final boolean[] f11393wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final boolean[] f11394zoijcleaow;

        public gxszxtbevo(m3.iwizpuwonk iwizpuwonkVar, boolean[] zArr) {
            this.f11391iobyxmoadg = iwizpuwonkVar;
            this.f11394zoijcleaow = zArr;
            int i13 = iwizpuwonkVar.f65036iobyxmoadg;
            this.f11392ppxfxbqfkf = new boolean[i13];
            this.f11393wkgbmnqykc = new boolean[i13];
        }
    }

    class iobyxmoadg extends t3.pmvmpeiblj {
        iobyxmoadg(t3.pkzmftpjix pkzmftpjixVar) {
            super(pkzmftpjixVar);
        }

        @Override // t3.pmvmpeiblj, t3.pkzmftpjix
        public long gtknphoqwx() {
            return zynmafqrjb.this.f11375sopmlzcsov;
        }
    }

    interface ppxfxbqfkf {
        void wkgbmnqykc(long j13, t3.pkzmftpjix pkzmftpjixVar, boolean z13);
    }

    private final class wkgbmnqykc implements m3.oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f11396iobyxmoadg;

        public wkgbmnqykc(int i13) {
            this.f11396iobyxmoadg = i13;
        }

        @Override // m3.oxmwwwfdhm
        public void iobyxmoadg() throws IOException {
            zynmafqrjb.this.vipkmwdibw(this.f11396iobyxmoadg);
        }

        @Override // m3.oxmwwwfdhm
        public boolean ppxfxbqfkf() {
            return zynmafqrjb.this.tzroggbefp(this.f11396iobyxmoadg);
        }

        @Override // m3.oxmwwwfdhm
        public int wkgbmnqykc(long j13) {
            return zynmafqrjb.this.ydmasvzmpa(this.f11396iobyxmoadg, j13);
        }

        @Override // m3.oxmwwwfdhm
        public int zoijcleaow(f3.lmojexxdyd lmojexxdydVar, DecoderInputBuffer decoderInputBuffer, int i13) {
            return zynmafqrjb.this.rlfsiqarku(this.f11396iobyxmoadg, lmojexxdydVar, decoderInputBuffer, i13);
        }
    }

    final class zoijcleaow implements Loader.eablkybsjg, agtfadlqog.iobyxmoadg {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private long f11399btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private dsvhmnatus f11400draadjrbmk;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final t3.oxmwwwfdhm f11402eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final y2.draadjrbmk f11404gxszxtbevo;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private volatile boolean f11407nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final b3.gtknphoqwx f11408ppxfxbqfkf;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private boolean f11409wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final iwizpuwonk f11410wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Uri f11411zoijcleaow;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final t3.ylkuphrtab f11406lqeggnwhkg = new t3.ylkuphrtab();

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private boolean f11401dxjokdxxww = true;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final long f11405iobyxmoadg = m3.dxjokdxxww.iobyxmoadg();

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private b3.lqeggnwhkg f11403gtknphoqwx = nufgyqmvbu(0);

        public zoijcleaow(Uri uri, androidx.media3.datasource.iobyxmoadg iobyxmoadgVar, iwizpuwonk iwizpuwonkVar, t3.oxmwwwfdhm oxmwwwfdhmVar, y2.draadjrbmk draadjrbmkVar) {
            this.f11411zoijcleaow = uri;
            this.f11408ppxfxbqfkf = new b3.gtknphoqwx(iobyxmoadgVar);
            this.f11410wkgbmnqykc = iwizpuwonkVar;
            this.f11402eablkybsjg = oxmwwwfdhmVar;
            this.f11404gxszxtbevo = draadjrbmkVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void dxjokdxxww(long j13, long j14) {
            this.f11406lqeggnwhkg.f109571iobyxmoadg = j13;
            this.f11399btonecajqb = j14;
            this.f11401dxjokdxxww = true;
            this.f11409wflxmlrfwp = false;
        }

        private b3.lqeggnwhkg nufgyqmvbu(long j13) {
            return new b3.lqeggnwhkg.zoijcleaow().dxjokdxxww(this.f11411zoijcleaow).nufgyqmvbu(j13).gxszxtbevo(zynmafqrjb.this.f11388zynmafqrjb).zoijcleaow(6).eablkybsjg(zynmafqrjb.f11345yfnezrywwk).iobyxmoadg();
        }

        @Override // androidx.media3.exoplayer.source.agtfadlqog.iobyxmoadg
        public void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar) {
            long jMax = !this.f11409wflxmlrfwp ? this.f11399btonecajqb : Math.max(zynmafqrjb.this.wypolnanlu(true), this.f11399btonecajqb);
            int iIobyxmoadg = yadqdtsiqtVar.iobyxmoadg();
            dsvhmnatus dsvhmnatusVar = (dsvhmnatus) y2.iobyxmoadg.eablkybsjg(this.f11400draadjrbmk);
            dsvhmnatusVar.lqeggnwhkg(yadqdtsiqtVar, iIobyxmoadg);
            dsvhmnatusVar.zoijcleaow(jMax, 1, iIobyxmoadg, 0, null);
            this.f11409wflxmlrfwp = true;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.eablkybsjg
        public void load() {
            int iWkgbmnqykc = 0;
            while (iWkgbmnqykc == 0 && !this.f11407nufgyqmvbu) {
                try {
                    long j13 = this.f11406lqeggnwhkg.f109571iobyxmoadg;
                    b3.lqeggnwhkg lqeggnwhkgVarNufgyqmvbu = nufgyqmvbu(j13);
                    this.f11403gtknphoqwx = lqeggnwhkgVarNufgyqmvbu;
                    long jIobyxmoadg = this.f11408ppxfxbqfkf.iobyxmoadg(lqeggnwhkgVarNufgyqmvbu);
                    if (this.f11407nufgyqmvbu) {
                        if (iWkgbmnqykc != 1 && this.f11410wkgbmnqykc.eablkybsjg() != -1) {
                            this.f11406lqeggnwhkg.f109571iobyxmoadg = this.f11410wkgbmnqykc.eablkybsjg();
                        }
                        b3.gxszxtbevo.iobyxmoadg(this.f11408ppxfxbqfkf);
                        return;
                    }
                    if (jIobyxmoadg != -1) {
                        jIobyxmoadg += j13;
                        zynmafqrjb.this.jhduphickx();
                    }
                    long j14 = jIobyxmoadg;
                    zynmafqrjb.this.f11347cllcsxoeiz = g4.zoijcleaow.wkgbmnqykc(this.f11408ppxfxbqfkf.wkgbmnqykc());
                    v2.btonecajqb agtfadlqogVar = this.f11408ppxfxbqfkf;
                    if (zynmafqrjb.this.f11347cllcsxoeiz != null && zynmafqrjb.this.f11347cllcsxoeiz.f36180gxszxtbevo != -1) {
                        agtfadlqogVar = new agtfadlqog(this.f11408ppxfxbqfkf, zynmafqrjb.this.f11347cllcsxoeiz.f36180gxszxtbevo, this);
                        dsvhmnatus dsvhmnatusVarStevsuqkhv = zynmafqrjb.this.stevsuqkhv();
                        this.f11400draadjrbmk = dsvhmnatusVarStevsuqkhv;
                        dsvhmnatusVarStevsuqkhv.iobyxmoadg(zynmafqrjb.f11344ydmasvzmpa);
                    }
                    long jEablkybsjg = j13;
                    this.f11410wkgbmnqykc.ppxfxbqfkf(agtfadlqogVar, this.f11411zoijcleaow, this.f11408ppxfxbqfkf.wkgbmnqykc(), j13, j14, this.f11402eablkybsjg);
                    if (zynmafqrjb.this.f11347cllcsxoeiz != null) {
                        this.f11410wkgbmnqykc.zoijcleaow();
                    }
                    if (this.f11401dxjokdxxww) {
                        this.f11410wkgbmnqykc.iobyxmoadg(jEablkybsjg, this.f11399btonecajqb);
                        this.f11401dxjokdxxww = false;
                    }
                    while (true) {
                        long j15 = jEablkybsjg;
                        while (true) {
                            if (iWkgbmnqykc != 0 || this.f11407nufgyqmvbu) {
                                break;
                            }
                            try {
                                this.f11404gxszxtbevo.iobyxmoadg();
                                iWkgbmnqykc = this.f11410wkgbmnqykc.wkgbmnqykc(this.f11406lqeggnwhkg);
                                jEablkybsjg = this.f11410wkgbmnqykc.eablkybsjg();
                                if (jEablkybsjg > zynmafqrjb.this.f11357istkbnxepw + j15) {
                                    this.f11404gxszxtbevo.ppxfxbqfkf();
                                    zynmafqrjb.this.f11361jpowsppfya.post(zynmafqrjb.this.f11353hcddaimhww);
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                    }
                    if (iWkgbmnqykc == 1) {
                        iWkgbmnqykc = 0;
                    } else if (this.f11410wkgbmnqykc.eablkybsjg() != -1) {
                        this.f11406lqeggnwhkg.f109571iobyxmoadg = this.f11410wkgbmnqykc.eablkybsjg();
                    }
                    b3.gxszxtbevo.iobyxmoadg(this.f11408ppxfxbqfkf);
                } catch (Throwable th2) {
                    if (iWkgbmnqykc != 1 && this.f11410wkgbmnqykc.eablkybsjg() != -1) {
                        this.f11406lqeggnwhkg.f109571iobyxmoadg = this.f11410wkgbmnqykc.eablkybsjg();
                    }
                    b3.gxszxtbevo.iobyxmoadg(this.f11408ppxfxbqfkf);
                    throw th2;
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.eablkybsjg
        public void zoijcleaow() {
            this.f11407nufgyqmvbu = true;
        }
    }

    public zynmafqrjb(Uri uri, androidx.media3.datasource.iobyxmoadg iobyxmoadgVar, iwizpuwonk iwizpuwonkVar, androidx.media3.exoplayer.drm.dxjokdxxww dxjokdxxwwVar, androidx.media3.exoplayer.drm.nufgyqmvbu.iobyxmoadg iobyxmoadgVar2, androidx.media3.exoplayer.upstream.zoijcleaow zoijcleaowVar, kcexrzcfyt.iobyxmoadg iobyxmoadgVar3, ppxfxbqfkf ppxfxbqfkfVar, p3.zoijcleaow zoijcleaowVar2, String str, int i13, int i14, androidx.media3.common.iobyxmoadg iobyxmoadgVar4, long j13, q3.iobyxmoadg iobyxmoadgVar5) {
        this.f11387zdlpuopuiu = uri;
        this.f11385yggfygwlhe = iobyxmoadgVar;
        this.f11362jyumaefscl = dxjokdxxwwVar;
        this.f11352esjtqupxsv = iobyxmoadgVar2;
        this.f11358iwizpuwonk = zoijcleaowVar;
        this.f11348cqumvgiudr = iobyxmoadgVar3;
        this.f11365lereixgezr = ppxfxbqfkfVar;
        this.f11372pmvmpeiblj = zoijcleaowVar2;
        this.f11388zynmafqrjb = str;
        this.f11357istkbnxepw = i13;
        this.f11346cdpycssgdh = i14;
        this.f11384yadqdtsiqt = iobyxmoadgVar4;
        this.f11366lmojexxdyd = iobyxmoadgVar5 != null ? new Loader(iobyxmoadgVar5) : new Loader("ProgressiveMediaPeriod");
        this.f11381wwaezpbzkn = iwizpuwonkVar;
        this.f11356iozdgvuglv = j13;
        this.f11386ylkuphrtab = new y2.draadjrbmk();
        this.f11371pkzmftpjix = new Runnable() { // from class: androidx.media3.exoplayer.source.esjtqupxsv
            @Override // java.lang.Runnable
            public final void run() {
                this.f11144zdlpuopuiu.sopmlzcsov();
            }
        };
        this.f11353hcddaimhww = new Runnable() { // from class: androidx.media3.exoplayer.source.lereixgezr
            @Override // java.lang.Runnable
            public final void run() {
                this.f11247zdlpuopuiu.mbcevpiqjq();
            }
        };
        this.f11361jpowsppfya = stevsuqkhv.lereixgezr();
        this.f11382wypolnanlu = new eablkybsjg[0];
        this.f11351dsvhmnatus = new iozdgvuglv[0];
        this.f11383xrmfcynszj = -9223372036854775807L;
        this.f11360jlmebxxoox = 1;
    }

    private static Map cllcsxoeiz() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    private void crxdokpmqz(int i13) {
        jpowsppfya();
        gxszxtbevo gxszxtbevoVar = this.f11369ntlheqmsrt;
        boolean[] zArr = gxszxtbevoVar.f11393wkgbmnqykc;
        if (zArr[i13]) {
            return;
        }
        androidx.media3.common.iobyxmoadg iobyxmoadgVarIobyxmoadg = gxszxtbevoVar.f11391iobyxmoadg.zoijcleaow(i13).iobyxmoadg(0);
        this.f11348cqumvgiudr.dxjokdxxww(v2.iwizpuwonk.gtknphoqwx(iobyxmoadgVarIobyxmoadg.f9769ojitshcjhn), iobyxmoadgVarIobyxmoadg, 0, null, this.f11363jztzpxfvev);
        zArr[i13] = true;
    }

    private int dsvhmnatus() {
        int iCdpycssgdh = 0;
        for (iozdgvuglv iozdgvuglvVar : this.f11351dsvhmnatus) {
            iCdpycssgdh += iozdgvuglvVar.cdpycssgdh();
        }
        return iCdpycssgdh;
    }

    private boolean hkdspvbjdz(zoijcleaow zoijcleaowVar, int i13) {
        t3.pkzmftpjix pkzmftpjixVar;
        if (this.f11370okpsazkaxt || !((pkzmftpjixVar = this.f11378ulzqkzuiru) == null || pkzmftpjixVar.gtknphoqwx() == -9223372036854775807L)) {
            this.f11374rlfsiqarku = i13;
            return true;
        }
        if (this.f11364kegysxyocb && !zfvoamnweg()) {
            this.f11368metgxyhuhe = true;
            return false;
        }
        this.f11380vipkmwdibw = this.f11364kegysxyocb;
        this.f11363jztzpxfvev = 0L;
        this.f11374rlfsiqarku = 0;
        for (iozdgvuglv iozdgvuglvVar : this.f11351dsvhmnatus) {
            iozdgvuglvVar.stevsuqkhv();
        }
        zoijcleaowVar.dxjokdxxww(0L, 0L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jhduphickx() {
        this.f11361jpowsppfya.post(new Runnable() { // from class: androidx.media3.exoplayer.source.cqumvgiudr
            @Override // java.lang.Runnable
            public final void run() {
                this.f11117zdlpuopuiu.ntlheqmsrt();
            }
        });
    }

    private void jlmebxxoox(int i13) {
        jpowsppfya();
        if (this.f11368metgxyhuhe) {
            if (!this.f11377tzroggbefp || this.f11369ntlheqmsrt.f11394zoijcleaow[i13]) {
                if (this.f11351dsvhmnatus[i13].lmojexxdyd(false)) {
                    return;
                }
                this.f11383xrmfcynszj = 0L;
                this.f11368metgxyhuhe = false;
                this.f11380vipkmwdibw = true;
                this.f11363jztzpxfvev = 0L;
                this.f11374rlfsiqarku = 0;
                for (iozdgvuglv iozdgvuglvVar : this.f11351dsvhmnatus) {
                    iozdgvuglvVar.stevsuqkhv();
                }
                ((vdvldrhtss.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f11354hkdspvbjdz)).lqeggnwhkg(this);
            }
        }
    }

    private void jpowsppfya() {
        y2.iobyxmoadg.lqeggnwhkg(this.f11364kegysxyocb);
        y2.iobyxmoadg.eablkybsjg(this.f11369ntlheqmsrt);
        y2.iobyxmoadg.eablkybsjg(this.f11378ulzqkzuiru);
    }

    private boolean kegysxyocb() {
        return this.f11383xrmfcynszj != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void mbcevpiqjq() {
        if (this.f11379uwvvkdfqfp) {
            return;
        }
        ((vdvldrhtss.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f11354hkdspvbjdz)).lqeggnwhkg(this);
    }

    private dsvhmnatus metgxyhuhe(eablkybsjg eablkybsjgVar) {
        int length = this.f11351dsvhmnatus.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (eablkybsjgVar.equals(this.f11382wypolnanlu[i13])) {
                return this.f11351dsvhmnatus[i13];
            }
        }
        if (this.f11376stevsuqkhv) {
            y2.kcexrzcfyt.nufgyqmvbu("ProgressiveMediaPeriod", "Extractor added new track (id=" + eablkybsjgVar.f11389iobyxmoadg + ") after finishing tracks.");
            return new t3.wflxmlrfwp();
        }
        iozdgvuglv iozdgvuglvVarDraadjrbmk = iozdgvuglv.draadjrbmk(this.f11372pmvmpeiblj, this.f11362jyumaefscl, this.f11352esjtqupxsv);
        iozdgvuglvVarDraadjrbmk.crxdokpmqz(this);
        int i14 = length + 1;
        eablkybsjg[] eablkybsjgVarArr = (eablkybsjg[]) Arrays.copyOf(this.f11382wypolnanlu, i14);
        eablkybsjgVarArr[length] = eablkybsjgVar;
        this.f11382wypolnanlu = (eablkybsjg[]) stevsuqkhv.dxjokdxxww(eablkybsjgVarArr);
        iozdgvuglv[] iozdgvuglvVarArr = (iozdgvuglv[]) Arrays.copyOf(this.f11351dsvhmnatus, i14);
        iozdgvuglvVarArr[length] = iozdgvuglvVarDraadjrbmk;
        this.f11351dsvhmnatus = (iozdgvuglv[]) stevsuqkhv.dxjokdxxww(iozdgvuglvVarArr);
        return iozdgvuglvVarDraadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ntlheqmsrt() {
        this.f11370okpsazkaxt = true;
    }

    private void sflfametgt() {
        zoijcleaow zoijcleaowVar = new zoijcleaow(this.f11387zdlpuopuiu, this.f11385yggfygwlhe, this.f11381wwaezpbzkn, this, this.f11386ylkuphrtab);
        if (this.f11364kegysxyocb) {
            y2.iobyxmoadg.lqeggnwhkg(kegysxyocb());
            long j13 = this.f11375sopmlzcsov;
            if (j13 != -9223372036854775807L && this.f11383xrmfcynszj > j13) {
                this.f11350czzsidtyhn = true;
                this.f11383xrmfcynszj = -9223372036854775807L;
                return;
            }
            zoijcleaowVar.dxjokdxxww(((t3.pkzmftpjix) y2.iobyxmoadg.eablkybsjg(this.f11378ulzqkzuiru)).wkgbmnqykc(this.f11383xrmfcynszj).f109526iobyxmoadg.f109433zoijcleaow, this.f11383xrmfcynszj);
            for (iozdgvuglv iozdgvuglvVar : this.f11351dsvhmnatus) {
                iozdgvuglvVar.ulzqkzuiru(this.f11383xrmfcynszj);
            }
            this.f11383xrmfcynszj = -9223372036854775807L;
        }
        this.f11374rlfsiqarku = dsvhmnatus();
        this.f11366lmojexxdyd.agtfadlqog(zoijcleaowVar, this, this.f11358iwizpuwonk.zoijcleaow(this.f11360jlmebxxoox));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sopmlzcsov() {
        if (this.f11379uwvvkdfqfp || this.f11364kegysxyocb || !this.f11376stevsuqkhv || this.f11378ulzqkzuiru == null) {
            return;
        }
        for (iozdgvuglv iozdgvuglvVar : this.f11351dsvhmnatus) {
            if (iozdgvuglvVar.istkbnxepw() == null) {
                return;
            }
        }
        this.f11386ylkuphrtab.ppxfxbqfkf();
        int length = this.f11351dsvhmnatus.length;
        v2.yadqdtsiqt[] yadqdtsiqtVarArr = new v2.yadqdtsiqt[length];
        boolean[] zArr = new boolean[length];
        for (int i13 = 0; i13 < length; i13++) {
            androidx.media3.common.iobyxmoadg iobyxmoadgVarCllcsxoeiz = (androidx.media3.common.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f11351dsvhmnatus[i13].istkbnxepw());
            String str = iobyxmoadgVarCllcsxoeiz.f9769ojitshcjhn;
            boolean zAgtfadlqog = v2.iwizpuwonk.agtfadlqog(str);
            boolean z13 = zAgtfadlqog || v2.iwizpuwonk.vdvldrhtss(str);
            zArr[i13] = z13;
            this.f11377tzroggbefp = z13 | this.f11377tzroggbefp;
            this.f11367mbcevpiqjq = this.f11356iozdgvuglv != -9223372036854775807L && length == 1 && v2.iwizpuwonk.ojitshcjhn(str);
            g4.zoijcleaow zoijcleaowVar = this.f11347cllcsxoeiz;
            if (zoijcleaowVar != null) {
                if (zAgtfadlqog || this.f11382wypolnanlu[i13].f11390zoijcleaow) {
                    v2.jyumaefscl jyumaefsclVar = iobyxmoadgVarCllcsxoeiz.f9749draadjrbmk;
                    iobyxmoadgVarCllcsxoeiz = iobyxmoadgVarCllcsxoeiz.zoijcleaow().zfvoamnweg(jyumaefsclVar == null ? new v2.jyumaefscl(zoijcleaowVar) : jyumaefsclVar.iobyxmoadg(zoijcleaowVar)).cllcsxoeiz();
                }
                if (zAgtfadlqog && iobyxmoadgVarCllcsxoeiz.f9768nufgyqmvbu == -1 && iobyxmoadgVarCllcsxoeiz.f9751dxjokdxxww == -1 && zoijcleaowVar.f36181iobyxmoadg != -1) {
                    iobyxmoadgVarCllcsxoeiz = iobyxmoadgVarCllcsxoeiz.zoijcleaow().stevsuqkhv(zoijcleaowVar.f36181iobyxmoadg).cllcsxoeiz();
                }
            }
            androidx.media3.common.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = iobyxmoadgVarCllcsxoeiz.ppxfxbqfkf(this.f11362jyumaefscl.eablkybsjg(iobyxmoadgVarCllcsxoeiz));
            yadqdtsiqtVarArr[i13] = new v2.yadqdtsiqt(Integer.toString(i13), iobyxmoadgVarPpxfxbqfkf);
            this.f11359jhduphickx = iobyxmoadgVarPpxfxbqfkf.f9780yggfygwlhe | this.f11359jhduphickx;
        }
        this.f11369ntlheqmsrt = new gxszxtbevo(new m3.iwizpuwonk(yadqdtsiqtVarArr), zArr);
        if (this.f11367mbcevpiqjq && this.f11375sopmlzcsov == -9223372036854775807L) {
            this.f11375sopmlzcsov = this.f11356iozdgvuglv;
            this.f11378ulzqkzuiru = new iobyxmoadg(this.f11378ulzqkzuiru);
        }
        this.f11365lereixgezr.wkgbmnqykc(this.f11375sopmlzcsov, this.f11378ulzqkzuiru, this.f11349crxdokpmqz);
        this.f11364kegysxyocb = true;
        ((vdvldrhtss.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f11354hkdspvbjdz)).gxszxtbevo(this);
    }

    private boolean uwvvkdfqfp(boolean[] zArr, long j13, boolean z13) {
        int length = this.f11351dsvhmnatus.length;
        for (int i13 = 0; i13 < length; i13++) {
            iozdgvuglv iozdgvuglvVar = this.f11351dsvhmnatus[i13];
            if (iozdgvuglvVar.lereixgezr() != 0 || !z13) {
                if (!(this.f11367mbcevpiqjq ? iozdgvuglvVar.mbcevpiqjq(iozdgvuglvVar.jyumaefscl()) : iozdgvuglvVar.ntlheqmsrt(j13, false)) && (zArr[i13] || !this.f11377tzroggbefp)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long wypolnanlu(boolean z13) {
        long jMax = Long.MIN_VALUE;
        for (int i13 = 0; i13 < this.f11351dsvhmnatus.length; i13++) {
            if (z13 || ((gxszxtbevo) y2.iobyxmoadg.eablkybsjg(this.f11369ntlheqmsrt)).f11392ppxfxbqfkf[i13]) {
                jMax = Math.max(jMax, this.f11351dsvhmnatus[i13].iwizpuwonk());
            }
        }
        return jMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public void ulzqkzuiru(t3.pkzmftpjix pkzmftpjixVar) {
        this.f11378ulzqkzuiru = this.f11347cllcsxoeiz == null ? pkzmftpjixVar : new t3.pkzmftpjix.zoijcleaow(-9223372036854775807L);
        this.f11375sopmlzcsov = pkzmftpjixVar.gtknphoqwx();
        boolean z13 = !this.f11370okpsazkaxt && pkzmftpjixVar.gtknphoqwx() == -9223372036854775807L;
        this.f11349crxdokpmqz = z13;
        this.f11360jlmebxxoox = z13 ? 7 : 1;
        if (this.f11364kegysxyocb) {
            this.f11365lereixgezr.wkgbmnqykc(this.f11375sopmlzcsov, pkzmftpjixVar, z13);
        } else {
            sopmlzcsov();
        }
    }

    private boolean zfvoamnweg() {
        return this.f11380vipkmwdibw || kegysxyocb();
    }

    @Override // t3.oxmwwwfdhm
    public void agtfadlqog() {
        this.f11376stevsuqkhv = true;
        this.f11361jpowsppfya.post(this.f11371pkzmftpjix);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long btonecajqb() {
        if (this.f11359jhduphickx) {
            this.f11359jhduphickx = false;
            return this.f11363jztzpxfvev;
        }
        if (!this.f11380vipkmwdibw) {
            return -9223372036854775807L;
        }
        if (!this.f11350czzsidtyhn && dsvhmnatus() <= this.f11374rlfsiqarku) {
            return -9223372036854775807L;
        }
        this.f11380vipkmwdibw = false;
        return this.f11363jztzpxfvev;
    }

    public void czzsidtyhn() {
        if (this.f11364kegysxyocb) {
            for (iozdgvuglv iozdgvuglvVar : this.f11351dsvhmnatus) {
                iozdgvuglvVar.hkdspvbjdz();
            }
        }
        this.f11366lmojexxdyd.wflxmlrfwp(this);
        this.f11361jpowsppfya.removeCallbacksAndMessages(null);
        this.f11354hkdspvbjdz = null;
        this.f11379uwvvkdfqfp = true;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public void draadjrbmk() throws IOException {
        ribwqtqdhb();
        if (this.f11350czzsidtyhn && !this.f11364kegysxyocb) {
            throw ParserException.iobyxmoadg("Loading finished before preparation is complete.", null);
        }
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long dxjokdxxww(long j13) {
        jpowsppfya();
        boolean[] zArr = this.f11369ntlheqmsrt.f11394zoijcleaow;
        if (!this.f11378ulzqkzuiru.lqeggnwhkg()) {
            j13 = 0;
        }
        int i13 = 0;
        this.f11380vipkmwdibw = false;
        boolean z13 = this.f11363jztzpxfvev == j13;
        this.f11363jztzpxfvev = j13;
        if (kegysxyocb()) {
            this.f11383xrmfcynszj = j13;
            return j13;
        }
        if (this.f11360jlmebxxoox != 7 && ((this.f11350czzsidtyhn || this.f11366lmojexxdyd.dxjokdxxww()) && uwvvkdfqfp(zArr, j13, z13))) {
            return j13;
        }
        this.f11368metgxyhuhe = false;
        this.f11383xrmfcynszj = j13;
        this.f11350czzsidtyhn = false;
        this.f11359jhduphickx = false;
        if (this.f11366lmojexxdyd.dxjokdxxww()) {
            iozdgvuglv[] iozdgvuglvVarArr = this.f11351dsvhmnatus;
            int length = iozdgvuglvVarArr.length;
            while (i13 < length) {
                iozdgvuglvVarArr[i13].vdvldrhtss();
                i13++;
            }
            this.f11366lmojexxdyd.eablkybsjg();
        } else {
            this.f11366lmojexxdyd.gxszxtbevo();
            iozdgvuglv[] iozdgvuglvVarArr2 = this.f11351dsvhmnatus;
            int length2 = iozdgvuglvVarArr2.length;
            while (i13 < length2) {
                iozdgvuglvVarArr2[i13].stevsuqkhv();
                i13++;
            }
        }
        return j13;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public void eablkybsjg(long j13) {
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.gxszxtbevo
    public void gtknphoqwx() {
        for (iozdgvuglv iozdgvuglvVar : this.f11351dsvhmnatus) {
            iozdgvuglvVar.dsvhmnatus();
        }
        this.f11381wwaezpbzkn.release();
    }

    @Override // t3.oxmwwwfdhm
    public void gxszxtbevo(final t3.pkzmftpjix pkzmftpjixVar) {
        this.f11361jpowsppfya.post(new Runnable() { // from class: androidx.media3.exoplayer.source.pmvmpeiblj
            @Override // java.lang.Runnable
            public final void run() {
                this.f11270zdlpuopuiu.ulzqkzuiru(pkzmftpjixVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.zoijcleaow
    /* JADX INFO: renamed from: ikoacuggdj, reason: merged with bridge method [inline-methods] */
    public void jyumaefscl(zoijcleaow zoijcleaowVar, long j13, long j14, boolean z13) {
        b3.gtknphoqwx gtknphoqwxVar = zoijcleaowVar.f11408ppxfxbqfkf;
        m3.dxjokdxxww dxjokdxxwwVar = new m3.dxjokdxxww(zoijcleaowVar.f11405iobyxmoadg, zoijcleaowVar.f11403gtknphoqwx, gtknphoqwxVar.vdvldrhtss(), gtknphoqwxVar.oxmwwwfdhm(), j13, j14, gtknphoqwxVar.rgvfuqvkyq());
        this.f11358iwizpuwonk.ppxfxbqfkf(zoijcleaowVar.f11405iobyxmoadg);
        this.f11348cqumvgiudr.vdvldrhtss(dxjokdxxwwVar, 1, -1, null, 0, null, zoijcleaowVar.f11399btonecajqb, this.f11375sopmlzcsov);
        if (z13) {
            return;
        }
        for (iozdgvuglv iozdgvuglvVar : this.f11351dsvhmnatus) {
            iozdgvuglvVar.stevsuqkhv();
        }
        if (this.f11355ikoacuggdj > 0) {
            ((vdvldrhtss.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f11354hkdspvbjdz)).lqeggnwhkg(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public boolean iobyxmoadg(uwvvkdfqfp uwvvkdfqfpVar) {
        if (this.f11350czzsidtyhn || this.f11366lmojexxdyd.nufgyqmvbu() || this.f11368metgxyhuhe) {
            return false;
        }
        if ((this.f11364kegysxyocb || this.f11384yadqdtsiqt != null) && this.f11355ikoacuggdj == 0) {
            return false;
        }
        boolean zEablkybsjg = this.f11386ylkuphrtab.eablkybsjg();
        if (this.f11366lmojexxdyd.dxjokdxxww()) {
            return zEablkybsjg;
        }
        sflfametgt();
        return true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.zoijcleaow
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public Loader.ppxfxbqfkf lqeggnwhkg(zoijcleaow zoijcleaowVar, long j13, long j14, IOException iOException, int i13) {
        Loader.ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg;
        b3.gtknphoqwx gtknphoqwxVar = zoijcleaowVar.f11408ppxfxbqfkf;
        m3.dxjokdxxww dxjokdxxwwVar = new m3.dxjokdxxww(zoijcleaowVar.f11405iobyxmoadg, zoijcleaowVar.f11403gtknphoqwx, gtknphoqwxVar.vdvldrhtss(), gtknphoqwxVar.oxmwwwfdhm(), j13, j14, gtknphoqwxVar.rgvfuqvkyq());
        long jIobyxmoadg = this.f11358iwizpuwonk.iobyxmoadg(new androidx.media3.exoplayer.upstream.zoijcleaow.iobyxmoadg(dxjokdxxwwVar, new m3.btonecajqb(1, -1, null, 0, null, stevsuqkhv.t(zoijcleaowVar.f11399btonecajqb), stevsuqkhv.t(this.f11375sopmlzcsov)), iOException, i13));
        if (jIobyxmoadg == -9223372036854775807L) {
            ppxfxbqfkfVarLqeggnwhkg = Loader.f11423lqeggnwhkg;
        } else {
            int iDsvhmnatus = dsvhmnatus();
            ppxfxbqfkfVarLqeggnwhkg = hkdspvbjdz(zoijcleaowVar, iDsvhmnatus) ? Loader.lqeggnwhkg(iDsvhmnatus > this.f11374rlfsiqarku, jIobyxmoadg) : Loader.f11422gxszxtbevo;
        }
        boolean zPpxfxbqfkf = ppxfxbqfkfVarLqeggnwhkg.ppxfxbqfkf();
        this.f11348cqumvgiudr.yggfygwlhe(dxjokdxxwwVar, 1, -1, null, 0, null, zoijcleaowVar.f11399btonecajqb, this.f11375sopmlzcsov, iOException, !zPpxfxbqfkf);
        if (!zPpxfxbqfkf) {
            this.f11358iwizpuwonk.ppxfxbqfkf(zoijcleaowVar.f11405iobyxmoadg);
        }
        return ppxfxbqfkfVarLqeggnwhkg;
    }

    @Override // t3.oxmwwwfdhm
    public dsvhmnatus kcexrzcfyt(int i13, int i14) {
        return metgxyhuhe(new eablkybsjg(i13, false));
    }

    @Override // androidx.media3.exoplayer.source.iozdgvuglv.wkgbmnqykc
    public void nufgyqmvbu(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        this.f11361jpowsppfya.post(this.f11371pkzmftpjix);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long ojitshcjhn(o3.esjtqupxsv[] esjtqupxsvVarArr, boolean[] zArr, m3.oxmwwwfdhm[] oxmwwwfdhmVarArr, boolean[] zArr2, long j13) {
        o3.esjtqupxsv esjtqupxsvVar;
        jpowsppfya();
        gxszxtbevo gxszxtbevoVar = this.f11369ntlheqmsrt;
        m3.iwizpuwonk iwizpuwonkVar = gxszxtbevoVar.f11391iobyxmoadg;
        boolean[] zArr3 = gxszxtbevoVar.f11392ppxfxbqfkf;
        int i13 = this.f11355ikoacuggdj;
        int i14 = 0;
        for (int i15 = 0; i15 < esjtqupxsvVarArr.length; i15++) {
            m3.oxmwwwfdhm oxmwwwfdhmVar = oxmwwwfdhmVarArr[i15];
            if (oxmwwwfdhmVar != null && (esjtqupxsvVarArr[i15] == null || !zArr[i15])) {
                int i16 = ((wkgbmnqykc) oxmwwwfdhmVar).f11396iobyxmoadg;
                y2.iobyxmoadg.lqeggnwhkg(zArr3[i16]);
                this.f11355ikoacuggdj--;
                zArr3[i16] = false;
                oxmwwwfdhmVarArr[i15] = null;
            }
        }
        boolean z13 = !this.f11373ribwqtqdhb ? j13 == 0 || this.f11367mbcevpiqjq : i13 != 0;
        for (int i17 = 0; i17 < esjtqupxsvVarArr.length; i17++) {
            if (oxmwwwfdhmVarArr[i17] == null && (esjtqupxsvVar = esjtqupxsvVarArr[i17]) != null) {
                y2.iobyxmoadg.lqeggnwhkg(esjtqupxsvVar.length() == 1);
                y2.iobyxmoadg.lqeggnwhkg(esjtqupxsvVar.ppxfxbqfkf(0) == 0);
                int iWkgbmnqykc = iwizpuwonkVar.wkgbmnqykc(esjtqupxsvVar.nufgyqmvbu());
                y2.iobyxmoadg.lqeggnwhkg(!zArr3[iWkgbmnqykc]);
                this.f11355ikoacuggdj++;
                zArr3[iWkgbmnqykc] = true;
                this.f11359jhduphickx = esjtqupxsvVar.draadjrbmk().f9780yggfygwlhe | this.f11359jhduphickx;
                oxmwwwfdhmVarArr[i17] = new wkgbmnqykc(iWkgbmnqykc);
                zArr2[i17] = true;
                if (!z13) {
                    iozdgvuglv iozdgvuglvVar = this.f11351dsvhmnatus[iWkgbmnqykc];
                    z13 = (iozdgvuglvVar.lereixgezr() == 0 || iozdgvuglvVar.ntlheqmsrt(j13, true)) ? false : true;
                }
            }
        }
        if (this.f11355ikoacuggdj == 0) {
            this.f11368metgxyhuhe = false;
            this.f11380vipkmwdibw = false;
            this.f11359jhduphickx = false;
            if (this.f11366lmojexxdyd.dxjokdxxww()) {
                iozdgvuglv[] iozdgvuglvVarArr = this.f11351dsvhmnatus;
                int length = iozdgvuglvVarArr.length;
                while (i14 < length) {
                    iozdgvuglvVarArr[i14].vdvldrhtss();
                    i14++;
                }
                this.f11366lmojexxdyd.eablkybsjg();
            } else {
                this.f11350czzsidtyhn = false;
                iozdgvuglv[] iozdgvuglvVarArr2 = this.f11351dsvhmnatus;
                int length2 = iozdgvuglvVarArr2.length;
                while (i14 < length2) {
                    iozdgvuglvVarArr2[i14].stevsuqkhv();
                    i14++;
                }
            }
        } else if (z13) {
            j13 = dxjokdxxww(j13);
            while (i14 < oxmwwwfdhmVarArr.length) {
                if (oxmwwwfdhmVarArr[i14] != null) {
                    zArr2[i14] = true;
                }
                i14++;
            }
        }
        this.f11373ribwqtqdhb = true;
        return j13;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.zoijcleaow
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void oxmwwwfdhm(zoijcleaow zoijcleaowVar, long j13, long j14) {
        if (this.f11375sopmlzcsov == -9223372036854775807L && this.f11378ulzqkzuiru != null) {
            long jWypolnanlu = wypolnanlu(true);
            long j15 = jWypolnanlu == Long.MIN_VALUE ? 0L : jWypolnanlu + DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
            this.f11375sopmlzcsov = j15;
            this.f11365lereixgezr.wkgbmnqykc(j15, this.f11378ulzqkzuiru, this.f11349crxdokpmqz);
        }
        b3.gtknphoqwx gtknphoqwxVar = zoijcleaowVar.f11408ppxfxbqfkf;
        m3.dxjokdxxww dxjokdxxwwVar = new m3.dxjokdxxww(zoijcleaowVar.f11405iobyxmoadg, zoijcleaowVar.f11403gtknphoqwx, gtknphoqwxVar.vdvldrhtss(), gtknphoqwxVar.oxmwwwfdhm(), j13, j14, gtknphoqwxVar.rgvfuqvkyq());
        this.f11358iwizpuwonk.ppxfxbqfkf(zoijcleaowVar.f11405iobyxmoadg);
        this.f11348cqumvgiudr.kcexrzcfyt(dxjokdxxwwVar, 1, -1, null, 0, null, zoijcleaowVar.f11399btonecajqb, this.f11375sopmlzcsov);
        this.f11350czzsidtyhn = true;
        ((vdvldrhtss.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f11354hkdspvbjdz)).lqeggnwhkg(this);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public boolean ppxfxbqfkf() {
        return this.f11366lmojexxdyd.dxjokdxxww() && this.f11386ylkuphrtab.wkgbmnqykc();
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public void rgvfuqvkyq(vdvldrhtss.iobyxmoadg iobyxmoadgVar, long j13) {
        this.f11354hkdspvbjdz = iobyxmoadgVar;
        if (this.f11384yadqdtsiqt == null) {
            this.f11386ylkuphrtab.eablkybsjg();
            sflfametgt();
        } else {
            kcexrzcfyt(this.f11346cdpycssgdh, 3).iobyxmoadg(this.f11384yadqdtsiqt);
            ulzqkzuiru(new t3.yadqdtsiqt(new long[]{0}, new long[]{0}, -9223372036854775807L));
            agtfadlqog();
            this.f11383xrmfcynszj = j13;
        }
    }

    void ribwqtqdhb() throws IOException {
        this.f11366lmojexxdyd.gtknphoqwx(this.f11358iwizpuwonk.zoijcleaow(this.f11360jlmebxxoox));
    }

    int rlfsiqarku(int i13, f3.lmojexxdyd lmojexxdydVar, DecoderInputBuffer decoderInputBuffer, int i14) {
        if (zfvoamnweg()) {
            return -3;
        }
        crxdokpmqz(i13);
        int iCllcsxoeiz = this.f11351dsvhmnatus[i13].cllcsxoeiz(lmojexxdydVar, decoderInputBuffer, i14, this.f11350czzsidtyhn);
        if (iCllcsxoeiz == -3) {
            jlmebxxoox(i13);
        }
        return iCllcsxoeiz;
    }

    dsvhmnatus stevsuqkhv() {
        return metgxyhuhe(new eablkybsjg(0, true));
    }

    boolean tzroggbefp(int i13) {
        return !zfvoamnweg() && this.f11351dsvhmnatus[i13].lmojexxdyd(this.f11350czzsidtyhn);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public m3.iwizpuwonk vdvldrhtss() {
        jpowsppfya();
        return this.f11369ntlheqmsrt.f11391iobyxmoadg;
    }

    void vipkmwdibw(int i13) throws IOException {
        this.f11351dsvhmnatus[i13].pkzmftpjix();
        ribwqtqdhb();
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public long wkgbmnqykc() {
        long jWypolnanlu;
        jpowsppfya();
        if (this.f11350czzsidtyhn || this.f11355ikoacuggdj == 0) {
            return Long.MIN_VALUE;
        }
        if (kegysxyocb()) {
            return this.f11383xrmfcynszj;
        }
        if (this.f11377tzroggbefp) {
            int length = this.f11351dsvhmnatus.length;
            jWypolnanlu = Long.MAX_VALUE;
            for (int i13 = 0; i13 < length; i13++) {
                gxszxtbevo gxszxtbevoVar = this.f11369ntlheqmsrt;
                if (gxszxtbevoVar.f11394zoijcleaow[i13] && gxszxtbevoVar.f11392ppxfxbqfkf[i13] && !this.f11351dsvhmnatus[i13].iozdgvuglv()) {
                    jWypolnanlu = Math.min(jWypolnanlu, this.f11351dsvhmnatus[i13].iwizpuwonk());
                }
            }
        } else {
            jWypolnanlu = Long.MAX_VALUE;
        }
        if (jWypolnanlu == Long.MAX_VALUE) {
            jWypolnanlu = wypolnanlu(false);
        }
        return jWypolnanlu == Long.MIN_VALUE ? this.f11363jztzpxfvev : jWypolnanlu;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.zoijcleaow
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public void wflxmlrfwp(zoijcleaow zoijcleaowVar, long j13, long j14, int i13) {
        b3.gtknphoqwx gtknphoqwxVar = zoijcleaowVar.f11408ppxfxbqfkf;
        this.f11348cqumvgiudr.iwizpuwonk(i13 == 0 ? new m3.dxjokdxxww(zoijcleaowVar.f11405iobyxmoadg, zoijcleaowVar.f11403gtknphoqwx, j13) : new m3.dxjokdxxww(zoijcleaowVar.f11405iobyxmoadg, zoijcleaowVar.f11403gtknphoqwx, gtknphoqwxVar.vdvldrhtss(), gtknphoqwxVar.oxmwwwfdhm(), j13, j14, gtknphoqwxVar.rgvfuqvkyq()), 1, -1, null, 0, null, zoijcleaowVar.f11399btonecajqb, this.f11375sopmlzcsov, i13);
    }

    int ydmasvzmpa(int i13, long j13) {
        if (zfvoamnweg()) {
            return 0;
        }
        crxdokpmqz(i13);
        iozdgvuglv iozdgvuglvVar = this.f11351dsvhmnatus[i13];
        int iZynmafqrjb = iozdgvuglvVar.zynmafqrjb(j13, this.f11350czzsidtyhn);
        iozdgvuglvVar.jlmebxxoox(iZynmafqrjb);
        if (iZynmafqrjb == 0) {
            jlmebxxoox(i13);
        }
        return iZynmafqrjb;
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public long yggfygwlhe(long j13, hkdspvbjdz hkdspvbjdzVar) {
        jpowsppfya();
        if (!this.f11378ulzqkzuiru.lqeggnwhkg()) {
            return 0L;
        }
        t3.pkzmftpjix.iobyxmoadg iobyxmoadgVarWkgbmnqykc = this.f11378ulzqkzuiru.wkgbmnqykc(j13);
        return hkdspvbjdzVar.iobyxmoadg(j13, iobyxmoadgVarWkgbmnqykc.f109526iobyxmoadg.f109432iobyxmoadg, iobyxmoadgVarWkgbmnqykc.f109527zoijcleaow.f109432iobyxmoadg);
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss
    public void zdlpuopuiu(long j13, boolean z13) {
        if (this.f11367mbcevpiqjq) {
            return;
        }
        jpowsppfya();
        if (kegysxyocb()) {
            return;
        }
        boolean[] zArr = this.f11369ntlheqmsrt.f11392ppxfxbqfkf;
        int length = this.f11351dsvhmnatus.length;
        for (int i13 = 0; i13 < length; i13++) {
            this.f11351dsvhmnatus[i13].rgvfuqvkyq(j13, z13, zArr[i13]);
        }
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss, androidx.media3.exoplayer.source.lmojexxdyd
    public long zoijcleaow() {
        return wkgbmnqykc();
    }
}
