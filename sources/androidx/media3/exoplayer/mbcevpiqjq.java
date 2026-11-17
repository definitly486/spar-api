package androidx.media3.exoplayer;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.image.ImageOutput;
import g3.d0;
import g3.h0;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
final class mbcevpiqjq extends v2.lqeggnwhkg implements ExoPlayer {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final CopyOnWriteArraySet f10630agtfadlqog;

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    private boolean f10631bfopjjpdmp;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final y2.ojitshcjhn f10632btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final rhgxfdycjh f10633cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private f3.hkdspvbjdz f10634cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final long f10635cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private Surface f10636crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private float f10637czzsidtyhn;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final rlfsiqarku f10638draadjrbmk;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private m3.kcexrzcfyt f10639dsvhmnatus;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final o3.cdpycssgdh f10640dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f10641eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final y2.dxjokdxxww f10642esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final rlfsiqarku.gxszxtbevo f10643gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final v2.esjtqupxsv f10644gxszxtbevo;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private int f10645hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private boolean f10646hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private int f10647ikoacuggdj;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final long f10648iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final mhtqkkgtqm f10649istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final long f10650iwizpuwonk;

    /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name */
    private v2.jpowsppfya f10651iyctptxqzt;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private TextureView f10652jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private SurfaceHolder f10653jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private int f10654jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final long f10655jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private y2.lmojexxdyd f10656jztzpxfvev;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final g3.iobyxmoadg f10657kcexrzcfyt;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private v2.esjtqupxsv.zoijcleaow f10658kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final ppxfxbqfkf f10659lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final jrbgnlbqoe f10660lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final wizcaqwiak[] f10661lqeggnwhkg;

    /* JADX INFO: renamed from: lrnfpwlwnk, reason: collision with root package name */
    private skhdrjzrfn f10662lrnfpwlwnk;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private v2.yggfygwlhe f10663mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private f3.zoijcleaow f10664metgxyhuhe;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f10665ntlheqmsrt;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final wizcaqwiak[] f10666nufgyqmvbu;

    /* JADX INFO: renamed from: nuxfzjnpeb, reason: collision with root package name */
    private int f10667nuxfzjnpeb;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private boolean f10668oipsdeybqn;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final v2.cdpycssgdh.zoijcleaow f10669ojitshcjhn;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private int f10670okpsazkaxt;

    /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
    private v2.wflxmlrfwp f10671opjhrmiecq;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final androidx.media3.exoplayer.source.oxmwwwfdhm.iobyxmoadg f10672oxmwwwfdhm;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f10673pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final wkgbmnqykc f10674pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final v2.esjtqupxsv.zoijcleaow f10675ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final List f10676rgvfuqvkyq;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private s3.draadjrbmk f10677ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private v2.ppxfxbqfkf f10678rlfsiqarku;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private boolean f10679sflfametgt;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private Object f10680sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private boolean f10681stevsuqkhv;

    /* JADX INFO: renamed from: tbqsvytpvh, reason: collision with root package name */
    private long f10682tbqsvytpvh;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private v2.yggfygwlhe f10683tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f10684ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private boolean f10685uwvvkdfqfp;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final boolean f10686vdvldrhtss;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private boolean f10687vipkmwdibw;

    /* JADX INFO: renamed from: weqkydbzbr, reason: collision with root package name */
    private v2.yggfygwlhe f10688weqkydbzbr;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final y2.oxmwwwfdhm f10689wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final y2.draadjrbmk f10690wkgbmnqykc = new y2.draadjrbmk();

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final y2.lqeggnwhkg f10691wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private ExoPlayer.ppxfxbqfkf f10692wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private f3.zoijcleaow f10693xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final krqnebusok f10694yadqdtsiqt;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private boolean f10695ydmasvzmpa;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private x2.zoijcleaow f10696yfnezrywwk;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final p3.wkgbmnqykc f10697yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private int f10698ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Looper f10699zdlpuopuiu;

    /* JADX INFO: renamed from: zeieaojujs, reason: collision with root package name */
    private int f10700zeieaojujs;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private int f10701zfvoamnweg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final o3.yadqdtsiqt f10702zoijcleaow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final androidx.media3.exoplayer.wkgbmnqykc f10703zynmafqrjb;

    private static final class eablkybsjg implements oipsdeybqn {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Object f10704iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private v2.cdpycssgdh f10705ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final androidx.media3.exoplayer.source.oxmwwwfdhm f10706zoijcleaow;

        public eablkybsjg(Object obj, androidx.media3.exoplayer.source.rgvfuqvkyq rgvfuqvkyqVar) {
            this.f10704iobyxmoadg = obj;
            this.f10706zoijcleaow = rgvfuqvkyqVar;
            this.f10705ppxfxbqfkf = rgvfuqvkyqVar.ulzqkzuiru();
        }

        @Override // androidx.media3.exoplayer.oipsdeybqn
        public Object iobyxmoadg() {
            return this.f10704iobyxmoadg;
        }

        public void ppxfxbqfkf(v2.cdpycssgdh cdpycssgdhVar) {
            this.f10705ppxfxbqfkf = cdpycssgdhVar;
        }

        @Override // androidx.media3.exoplayer.oipsdeybqn
        public v2.cdpycssgdh zoijcleaow() {
            return this.f10705ppxfxbqfkf;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class ppxfxbqfkf implements androidx.media3.exoplayer.video.wflxmlrfwp, androidx.media3.exoplayer.audio.eablkybsjg, n3.nufgyqmvbu, l3.zoijcleaow, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, s3.draadjrbmk.zoijcleaow, androidx.media3.exoplayer.wkgbmnqykc.zoijcleaow, mhtqkkgtqm.zoijcleaow, ExoPlayer.iobyxmoadg {
        private ppxfxbqfkf() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void stevsuqkhv(v2.esjtqupxsv.wkgbmnqykc wkgbmnqykcVar) {
            wkgbmnqykcVar.jpowsppfya(mbcevpiqjq.this.f10683tzroggbefp);
        }

        @Override // androidx.media3.exoplayer.audio.eablkybsjg
        public void agtfadlqog(long j13) {
            mbcevpiqjq.this.f10657kcexrzcfyt.agtfadlqog(j13);
        }

        @Override // androidx.media3.exoplayer.audio.eablkybsjg
        public void btonecajqb(String str) {
            mbcevpiqjq.this.f10657kcexrzcfyt.btonecajqb(str);
        }

        @Override // s3.draadjrbmk.zoijcleaow
        public void cdpycssgdh(Surface surface) {
            mbcevpiqjq.this.I0(surface);
        }

        @Override // androidx.media3.exoplayer.video.wflxmlrfwp
        public void cqumvgiudr(f3.zoijcleaow zoijcleaowVar) {
            mbcevpiqjq.this.f10657kcexrzcfyt.cqumvgiudr(zoijcleaowVar);
            mbcevpiqjq.this.f10665ntlheqmsrt = null;
            mbcevpiqjq.this.f10693xrmfcynszj = null;
        }

        @Override // n3.nufgyqmvbu
        public void draadjrbmk(final x2.zoijcleaow zoijcleaowVar) {
            mbcevpiqjq.this.f10696yfnezrywwk = zoijcleaowVar;
            mbcevpiqjq.this.f10689wflxmlrfwp.draadjrbmk(27, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.ulzqkzuiru
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    ((v2.esjtqupxsv.wkgbmnqykc) obj).draadjrbmk(zoijcleaowVar);
                }
            });
        }

        @Override // androidx.media3.exoplayer.audio.eablkybsjg
        public void dxjokdxxww(f3.zoijcleaow zoijcleaowVar) {
            mbcevpiqjq.this.f10664metgxyhuhe = zoijcleaowVar;
            mbcevpiqjq.this.f10657kcexrzcfyt.dxjokdxxww(zoijcleaowVar);
        }

        @Override // androidx.media3.exoplayer.audio.eablkybsjg
        public void eablkybsjg(Exception exc) {
            mbcevpiqjq.this.f10657kcexrzcfyt.eablkybsjg(exc);
        }

        @Override // androidx.media3.exoplayer.audio.eablkybsjg
        public void esjtqupxsv(int i13, long j13, long j14) {
            mbcevpiqjq.this.f10657kcexrzcfyt.esjtqupxsv(i13, j13, j14);
        }

        @Override // androidx.media3.exoplayer.audio.eablkybsjg
        public void gtknphoqwx(String str, long j13, long j14) {
            mbcevpiqjq.this.f10657kcexrzcfyt.gtknphoqwx(str, j13, j14);
        }

        @Override // androidx.media3.exoplayer.video.wflxmlrfwp
        public void gxszxtbevo(String str) {
            mbcevpiqjq.this.f10657kcexrzcfyt.gxszxtbevo(str);
        }

        @Override // androidx.media3.exoplayer.audio.eablkybsjg
        public void iobyxmoadg(AudioSink.iobyxmoadg iobyxmoadgVar) {
            mbcevpiqjq.this.f10657kcexrzcfyt.iobyxmoadg(iobyxmoadgVar);
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.iobyxmoadg
        public void iozdgvuglv(boolean z13) {
            mbcevpiqjq.this.P0();
        }

        @Override // androidx.media3.exoplayer.audio.eablkybsjg
        public void iwizpuwonk(Exception exc) {
            mbcevpiqjq.this.f10657kcexrzcfyt.iwizpuwonk(exc);
        }

        @Override // androidx.media3.exoplayer.video.wflxmlrfwp
        public void jyumaefscl(Object obj, long j13) {
            mbcevpiqjq.this.f10657kcexrzcfyt.jyumaefscl(obj, j13);
            if (mbcevpiqjq.this.f10680sopmlzcsov == obj) {
                mbcevpiqjq.this.f10689wflxmlrfwp.draadjrbmk(26, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: f3.yadqdtsiqt
                    @Override // y2.oxmwwwfdhm.iobyxmoadg
                    public final void invoke(Object obj2) {
                        ((v2.esjtqupxsv.wkgbmnqykc) obj2).cllcsxoeiz();
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.video.wflxmlrfwp
        public void kcexrzcfyt(f3.zoijcleaow zoijcleaowVar) {
            mbcevpiqjq.this.f10693xrmfcynszj = zoijcleaowVar;
            mbcevpiqjq.this.f10657kcexrzcfyt.kcexrzcfyt(zoijcleaowVar);
        }

        @Override // androidx.media3.exoplayer.video.wflxmlrfwp
        public void lereixgezr(long j13, int i13) {
            mbcevpiqjq.this.f10657kcexrzcfyt.lereixgezr(j13, i13);
        }

        @Override // androidx.media3.exoplayer.video.wflxmlrfwp
        public void lqeggnwhkg(String str, long j13, long j14) {
            mbcevpiqjq.this.f10657kcexrzcfyt.lqeggnwhkg(str, j13, j14);
        }

        @Override // androidx.media3.exoplayer.mhtqkkgtqm.zoijcleaow
        public void nufgyqmvbu(int i13) {
            final v2.wflxmlrfwp wflxmlrfwpVarE = mbcevpiqjq.E(mbcevpiqjq.this.f10649istkbnxepw);
            if (wflxmlrfwpVarE.equals(mbcevpiqjq.this.f10671opjhrmiecq)) {
                return;
            }
            mbcevpiqjq.this.f10671opjhrmiecq = wflxmlrfwpVarE;
            mbcevpiqjq.this.f10689wflxmlrfwp.draadjrbmk(29, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.vipkmwdibw
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    ((v2.esjtqupxsv.wkgbmnqykc) obj).jhduphickx(wflxmlrfwpVarE);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.wflxmlrfwp
        public void ojitshcjhn(Exception exc) {
            mbcevpiqjq.this.f10657kcexrzcfyt.ojitshcjhn(exc);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i13, int i14) {
            mbcevpiqjq.this.H0(surfaceTexture);
            mbcevpiqjq.this.w0(i13, i14);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            mbcevpiqjq.this.I0(null);
            mbcevpiqjq.this.w0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i13, int i14) {
            mbcevpiqjq.this.w0(i13, i14);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // androidx.media3.exoplayer.video.wflxmlrfwp
        public void oxmwwwfdhm(androidx.media3.common.iobyxmoadg iobyxmoadgVar, f3.ppxfxbqfkf ppxfxbqfkfVar) {
            mbcevpiqjq.this.f10665ntlheqmsrt = iobyxmoadgVar;
            mbcevpiqjq.this.f10657kcexrzcfyt.oxmwwwfdhm(iobyxmoadgVar, ppxfxbqfkfVar);
        }

        @Override // androidx.media3.exoplayer.wkgbmnqykc.zoijcleaow
        public void pmvmpeiblj() {
            mbcevpiqjq.this.M0(false, 3);
        }

        @Override // androidx.media3.exoplayer.audio.eablkybsjg
        public void ppxfxbqfkf(AudioSink.iobyxmoadg iobyxmoadgVar) {
            mbcevpiqjq.this.f10657kcexrzcfyt.ppxfxbqfkf(iobyxmoadgVar);
        }

        @Override // androidx.media3.exoplayer.audio.eablkybsjg
        public void rgvfuqvkyq(androidx.media3.common.iobyxmoadg iobyxmoadgVar, f3.ppxfxbqfkf ppxfxbqfkfVar) {
            mbcevpiqjq.this.f10684ulzqkzuiru = iobyxmoadgVar;
            mbcevpiqjq.this.f10657kcexrzcfyt.rgvfuqvkyq(iobyxmoadgVar, ppxfxbqfkfVar);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i13, int i14, int i15) {
            mbcevpiqjq.this.w0(i14, i15);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (mbcevpiqjq.this.f10687vipkmwdibw) {
                mbcevpiqjq.this.I0(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (mbcevpiqjq.this.f10687vipkmwdibw) {
                mbcevpiqjq.this.I0(null);
            }
            mbcevpiqjq.this.w0(0, 0);
        }

        @Override // androidx.media3.exoplayer.audio.eablkybsjg
        public void vdvldrhtss(f3.zoijcleaow zoijcleaowVar) {
            mbcevpiqjq.this.f10657kcexrzcfyt.vdvldrhtss(zoijcleaowVar);
            mbcevpiqjq.this.f10684ulzqkzuiru = null;
            mbcevpiqjq.this.f10664metgxyhuhe = null;
        }

        @Override // n3.nufgyqmvbu
        public void wflxmlrfwp(final List list) {
            mbcevpiqjq.this.f10689wflxmlrfwp.draadjrbmk(27, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.jlmebxxoox
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    ((v2.esjtqupxsv.wkgbmnqykc) obj).wflxmlrfwp(list);
                }
            });
        }

        @Override // androidx.media3.exoplayer.audio.eablkybsjg
        public void wkgbmnqykc(final boolean z13) {
            if (mbcevpiqjq.this.f10685uwvvkdfqfp == z13) {
                return;
            }
            mbcevpiqjq.this.f10685uwvvkdfqfp = z13;
            mbcevpiqjq.this.f10689wflxmlrfwp.draadjrbmk(23, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.ikoacuggdj
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    ((v2.esjtqupxsv.wkgbmnqykc) obj).wkgbmnqykc(z13);
                }
            });
        }

        @Override // androidx.media3.exoplayer.mhtqkkgtqm.zoijcleaow
        public void yadqdtsiqt(final int i13, final boolean z13) {
            mbcevpiqjq.this.f10689wflxmlrfwp.draadjrbmk(30, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.jhduphickx
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    ((v2.esjtqupxsv.wkgbmnqykc) obj).hcddaimhww(i13, z13);
                }
            });
        }

        @Override // l3.zoijcleaow
        public void yggfygwlhe(final v2.jyumaefscl jyumaefsclVar) {
            mbcevpiqjq mbcevpiqjqVar = mbcevpiqjq.this;
            mbcevpiqjqVar.f10688weqkydbzbr = mbcevpiqjqVar.f10688weqkydbzbr.iobyxmoadg().cllcsxoeiz(jyumaefsclVar).pkzmftpjix();
            v2.yggfygwlhe yggfygwlheVarA = mbcevpiqjq.this.A();
            if (!yggfygwlheVarA.equals(mbcevpiqjq.this.f10683tzroggbefp)) {
                mbcevpiqjq.this.f10683tzroggbefp = yggfygwlheVarA;
                mbcevpiqjq.this.f10689wflxmlrfwp.dxjokdxxww(14, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.sopmlzcsov
                    @Override // y2.oxmwwwfdhm.iobyxmoadg
                    public final void invoke(Object obj) {
                        this.f11054iobyxmoadg.stevsuqkhv((v2.esjtqupxsv.wkgbmnqykc) obj);
                    }
                });
            }
            mbcevpiqjq.this.f10689wflxmlrfwp.dxjokdxxww(28, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.crxdokpmqz
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    ((v2.esjtqupxsv.wkgbmnqykc) obj).yggfygwlhe(jyumaefsclVar);
                }
            });
            mbcevpiqjq.this.f10689wflxmlrfwp.gxszxtbevo();
        }

        @Override // androidx.media3.exoplayer.video.wflxmlrfwp
        public void zdlpuopuiu(int i13, long j13) {
            mbcevpiqjq.this.f10657kcexrzcfyt.zdlpuopuiu(i13, j13);
        }

        @Override // androidx.media3.exoplayer.video.wflxmlrfwp
        public void zoijcleaow(final v2.jpowsppfya jpowsppfyaVar) {
            mbcevpiqjq.this.f10651iyctptxqzt = jpowsppfyaVar;
            mbcevpiqjq.this.f10689wflxmlrfwp.draadjrbmk(25, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.ribwqtqdhb
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    ((v2.esjtqupxsv.wkgbmnqykc) obj).zoijcleaow(jpowsppfyaVar);
                }
            });
        }

        @Override // s3.draadjrbmk.zoijcleaow
        public void zynmafqrjb(Surface surface) {
            mbcevpiqjq.this.I0(null);
        }
    }

    private static final class wkgbmnqykc implements r3.lqeggnwhkg, s3.iobyxmoadg, igdgnonuha.zoijcleaow {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private s3.iobyxmoadg f10708iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private r3.lqeggnwhkg f10709jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private s3.iobyxmoadg f10710yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private r3.lqeggnwhkg f10711zdlpuopuiu;

        private wkgbmnqykc() {
        }

        @Override // androidx.media3.exoplayer.igdgnonuha.zoijcleaow
        public void cqumvgiudr(int i13, Object obj) {
            if (i13 == 7) {
                this.f10711zdlpuopuiu = (r3.lqeggnwhkg) obj;
                return;
            }
            if (i13 == 8) {
                this.f10710yggfygwlhe = (s3.iobyxmoadg) obj;
                return;
            }
            if (i13 != 10000) {
                return;
            }
            s3.draadjrbmk draadjrbmkVar = (s3.draadjrbmk) obj;
            if (draadjrbmkVar == null) {
                this.f10709jyumaefscl = null;
                this.f10708iwizpuwonk = null;
            } else {
                this.f10709jyumaefscl = draadjrbmkVar.getVideoFrameMetadataListener();
                this.f10708iwizpuwonk = draadjrbmkVar.getCameraMotionListener();
            }
        }

        @Override // s3.iobyxmoadg
        public void eablkybsjg() {
            s3.iobyxmoadg iobyxmoadgVar = this.f10708iwizpuwonk;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.eablkybsjg();
            }
            s3.iobyxmoadg iobyxmoadgVar2 = this.f10710yggfygwlhe;
            if (iobyxmoadgVar2 != null) {
                iobyxmoadgVar2.eablkybsjg();
            }
        }

        @Override // s3.iobyxmoadg
        public void iobyxmoadg(long j13, float[] fArr) {
            s3.iobyxmoadg iobyxmoadgVar = this.f10708iwizpuwonk;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.iobyxmoadg(j13, fArr);
            }
            s3.iobyxmoadg iobyxmoadgVar2 = this.f10710yggfygwlhe;
            if (iobyxmoadgVar2 != null) {
                iobyxmoadgVar2.iobyxmoadg(j13, fArr);
            }
        }

        @Override // r3.lqeggnwhkg
        public void lqeggnwhkg(long j13, long j14, androidx.media3.common.iobyxmoadg iobyxmoadgVar, MediaFormat mediaFormat) {
            r3.lqeggnwhkg lqeggnwhkgVar = this.f10709jyumaefscl;
            if (lqeggnwhkgVar != null) {
                lqeggnwhkgVar.lqeggnwhkg(j13, j14, iobyxmoadgVar, mediaFormat);
            }
            r3.lqeggnwhkg lqeggnwhkgVar2 = this.f10711zdlpuopuiu;
            if (lqeggnwhkgVar2 != null) {
                lqeggnwhkgVar2.lqeggnwhkg(j13, j14, iobyxmoadgVar, mediaFormat);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class zoijcleaow {
        public static void ppxfxbqfkf(final Context context, final mbcevpiqjq mbcevpiqjqVar, final boolean z13, final h0 h0Var) {
            mbcevpiqjqVar.J().iobyxmoadg(mbcevpiqjqVar.N(), null).lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.ntlheqmsrt
                @Override // java.lang.Runnable
                public final void run() {
                    mbcevpiqjq.zoijcleaow.zoijcleaow(context, z13, mbcevpiqjqVar, h0Var);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void zoijcleaow(Context context, boolean z13, mbcevpiqjq mbcevpiqjqVar, h0 h0Var) {
            d0 d0VarSkhdrjzrfn = d0.skhdrjzrfn(context);
            if (d0VarSkhdrjzrfn == null) {
                y2.kcexrzcfyt.nufgyqmvbu("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return;
            }
            if (z13) {
                mbcevpiqjqVar.x(d0VarSkhdrjzrfn);
            }
            h0Var.zoijcleaow(d0VarSkhdrjzrfn.fyldjkxazc());
        }
    }

    static {
        v2.zdlpuopuiu.iobyxmoadg("media3.exoplayer");
    }

    public mbcevpiqjq(ExoPlayer.zoijcleaow zoijcleaowVar, v2.esjtqupxsv esjtqupxsvVar) {
        try {
            y2.kcexrzcfyt.gxszxtbevo("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.7.1] [" + y2.stevsuqkhv.f123599eablkybsjg + "]");
            this.f10641eablkybsjg = zoijcleaowVar.f10048iobyxmoadg.getApplicationContext();
            this.f10657kcexrzcfyt = (g3.iobyxmoadg) zoijcleaowVar.f10043dxjokdxxww.apply(zoijcleaowVar.f10071zoijcleaow);
            this.f10701zfvoamnweg = zoijcleaowVar.f10046gtknphoqwx;
            this.f10678rlfsiqarku = zoijcleaowVar.f10042draadjrbmk;
            this.f10647ikoacuggdj = zoijcleaowVar.f10059oxmwwwfdhm;
            this.f10670okpsazkaxt = zoijcleaowVar.f10053kcexrzcfyt;
            this.f10685uwvvkdfqfp = zoijcleaowVar.f10062rgvfuqvkyq;
            this.f10648iozdgvuglv = zoijcleaowVar.f10060pmvmpeiblj;
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
            this.f10659lereixgezr = ppxfxbqfkfVar;
            this.f10674pmvmpeiblj = new wkgbmnqykc();
            Handler handler = new Handler(zoijcleaowVar.f10039btonecajqb);
            f3.jpowsppfya jpowsppfyaVar = (f3.jpowsppfya) zoijcleaowVar.f10065wkgbmnqykc.get();
            wizcaqwiak[] wizcaqwiakVarArrIobyxmoadg = jpowsppfyaVar.iobyxmoadg(handler, ppxfxbqfkfVar, ppxfxbqfkfVar, ppxfxbqfkfVar, ppxfxbqfkfVar);
            this.f10661lqeggnwhkg = wizcaqwiakVarArrIobyxmoadg;
            y2.iobyxmoadg.lqeggnwhkg(wizcaqwiakVarArrIobyxmoadg.length > 0);
            this.f10666nufgyqmvbu = new wizcaqwiak[wizcaqwiakVarArrIobyxmoadg.length];
            int i13 = 0;
            while (true) {
                wizcaqwiak[] wizcaqwiakVarArr = this.f10666nufgyqmvbu;
                if (i13 >= wizcaqwiakVarArr.length) {
                    break;
                }
                wizcaqwiak wizcaqwiakVar = this.f10661lqeggnwhkg[i13];
                ppxfxbqfkf ppxfxbqfkfVar2 = this.f10659lereixgezr;
                wizcaqwiakVarArr[i13] = jpowsppfyaVar.zoijcleaow(wizcaqwiakVar, handler, ppxfxbqfkfVar2, ppxfxbqfkfVar2, ppxfxbqfkfVar2, ppxfxbqfkfVar2);
                i13++;
            }
            o3.cdpycssgdh cdpycssgdhVar = (o3.cdpycssgdh) zoijcleaowVar.f10047gxszxtbevo.get();
            this.f10640dxjokdxxww = cdpycssgdhVar;
            this.f10672oxmwwwfdhm = (androidx.media3.exoplayer.source.oxmwwwfdhm.iobyxmoadg) zoijcleaowVar.f10044eablkybsjg.get();
            p3.wkgbmnqykc wkgbmnqykcVar = (p3.wkgbmnqykc) zoijcleaowVar.f10057nufgyqmvbu.get();
            this.f10697yggfygwlhe = wkgbmnqykcVar;
            this.f10686vdvldrhtss = zoijcleaowVar.f10070zdlpuopuiu;
            this.f10634cllcsxoeiz = zoijcleaowVar.f10068yggfygwlhe;
            this.f10655jyumaefscl = zoijcleaowVar.f10052jyumaefscl;
            this.f10650iwizpuwonk = zoijcleaowVar.f10051iwizpuwonk;
            this.f10635cqumvgiudr = zoijcleaowVar.f10041cqumvgiudr;
            this.f10681stevsuqkhv = zoijcleaowVar.f10072zynmafqrjb;
            Looper looper = zoijcleaowVar.f10039btonecajqb;
            this.f10699zdlpuopuiu = looper;
            y2.dxjokdxxww dxjokdxxwwVar = zoijcleaowVar.f10071zoijcleaow;
            this.f10642esjtqupxsv = dxjokdxxwwVar;
            v2.esjtqupxsv esjtqupxsvVar2 = esjtqupxsvVar == null ? this : esjtqupxsvVar;
            this.f10644gxszxtbevo = esjtqupxsvVar2;
            this.f10689wflxmlrfwp = new y2.oxmwwwfdhm(looper, dxjokdxxwwVar, new y2.oxmwwwfdhm.zoijcleaow() { // from class: androidx.media3.exoplayer.lereixgezr
                @Override // y2.oxmwwwfdhm.zoijcleaow
                public final void iobyxmoadg(Object obj, v2.rgvfuqvkyq rgvfuqvkyqVar) {
                    this.f10606iobyxmoadg.V((v2.esjtqupxsv.wkgbmnqykc) obj, rgvfuqvkyqVar);
                }
            });
            this.f10630agtfadlqog = new CopyOnWriteArraySet();
            this.f10676rgvfuqvkyq = new ArrayList();
            this.f10639dsvhmnatus = new m3.kcexrzcfyt.iobyxmoadg(0);
            this.f10692wypolnanlu = ExoPlayer.ppxfxbqfkf.f10036zoijcleaow;
            wizcaqwiak[] wizcaqwiakVarArr2 = this.f10661lqeggnwhkg;
            o3.yadqdtsiqt yadqdtsiqtVar = new o3.yadqdtsiqt(new f3.hcddaimhww[wizcaqwiakVarArr2.length], new o3.esjtqupxsv[wizcaqwiakVarArr2.length], v2.wwaezpbzkn.f115691zoijcleaow, null);
            this.f10702zoijcleaow = yadqdtsiqtVar;
            this.f10669ojitshcjhn = new v2.cdpycssgdh.zoijcleaow();
            v2.esjtqupxsv.zoijcleaow zoijcleaowVarEablkybsjg = new v2.esjtqupxsv.zoijcleaow.iobyxmoadg().ppxfxbqfkf(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).wkgbmnqykc(29, cdpycssgdhVar.nufgyqmvbu()).wkgbmnqykc(23, zoijcleaowVar.f10063vdvldrhtss).wkgbmnqykc(25, zoijcleaowVar.f10063vdvldrhtss).wkgbmnqykc(33, zoijcleaowVar.f10063vdvldrhtss).wkgbmnqykc(26, zoijcleaowVar.f10063vdvldrhtss).wkgbmnqykc(34, zoijcleaowVar.f10063vdvldrhtss).eablkybsjg();
            this.f10675ppxfxbqfkf = zoijcleaowVarEablkybsjg;
            this.f10658kegysxyocb = new v2.esjtqupxsv.zoijcleaow.iobyxmoadg().zoijcleaow(zoijcleaowVarEablkybsjg).iobyxmoadg(4).iobyxmoadg(10).eablkybsjg();
            this.f10632btonecajqb = dxjokdxxwwVar.iobyxmoadg(looper, null);
            rlfsiqarku.gxszxtbevo gxszxtbevoVar = new rlfsiqarku.gxszxtbevo() { // from class: androidx.media3.exoplayer.pmvmpeiblj
                @Override // androidx.media3.exoplayer.rlfsiqarku.gxszxtbevo
                public final void iobyxmoadg(rlfsiqarku.eablkybsjg eablkybsjgVar) {
                    this.f10937iobyxmoadg.X(eablkybsjgVar);
                }
            };
            this.f10643gtknphoqwx = gxszxtbevoVar;
            this.f10662lrnfpwlwnk = skhdrjzrfn.gtknphoqwx(yadqdtsiqtVar);
            this.f10657kcexrzcfyt.tzroggbefp(esjtqupxsvVar2, looper);
            h0 h0Var = new h0(zoijcleaowVar.f10055lmojexxdyd);
            rlfsiqarku rlfsiqarkuVar = new rlfsiqarku(this.f10641eablkybsjg, this.f10661lqeggnwhkg, this.f10666nufgyqmvbu, cdpycssgdhVar, yadqdtsiqtVar, (czzsidtyhn) zoijcleaowVar.f10056lqeggnwhkg.get(), wkgbmnqykcVar, this.f10698ylkuphrtab, this.f10673pkzmftpjix, this.f10657kcexrzcfyt, this.f10634cllcsxoeiz, zoijcleaowVar.f10045esjtqupxsv, zoijcleaowVar.f10054lereixgezr, this.f10681stevsuqkhv, zoijcleaowVar.f10066wwaezpbzkn, looper, dxjokdxxwwVar, gxszxtbevoVar, h0Var, zoijcleaowVar.f10040cdpycssgdh, this.f10692wypolnanlu);
            this.f10638draadjrbmk = rlfsiqarkuVar;
            Looper looperHcddaimhww = rlfsiqarkuVar.hcddaimhww();
            this.f10637czzsidtyhn = 1.0f;
            this.f10698ylkuphrtab = 0;
            v2.yggfygwlhe yggfygwlheVar = v2.yggfygwlhe.f115743ylkuphrtab;
            this.f10683tzroggbefp = yggfygwlheVar;
            this.f10663mbcevpiqjq = yggfygwlheVar;
            this.f10688weqkydbzbr = yggfygwlheVar;
            this.f10700zeieaojujs = -1;
            this.f10696yfnezrywwk = x2.zoijcleaow.f121001ppxfxbqfkf;
            this.f10695ydmasvzmpa = true;
            zynmafqrjb(this.f10657kcexrzcfyt);
            wkgbmnqykcVar.eablkybsjg(new Handler(looper), this.f10657kcexrzcfyt);
            y(this.f10659lereixgezr);
            long j13 = zoijcleaowVar.f10061ppxfxbqfkf;
            if (j13 > 0) {
                rlfsiqarkuVar.yadqdtsiqt(j13);
            }
            if (y2.stevsuqkhv.f123602iobyxmoadg >= 31) {
                zoijcleaow.ppxfxbqfkf(this.f10641eablkybsjg, this, zoijcleaowVar.f10050istkbnxepw, h0Var);
            }
            y2.lqeggnwhkg lqeggnwhkgVar = new y2.lqeggnwhkg(0, looperHcddaimhww, looper, dxjokdxxwwVar, new y2.lqeggnwhkg.iobyxmoadg() { // from class: androidx.media3.exoplayer.zynmafqrjb
                @Override // y2.lqeggnwhkg.iobyxmoadg
                public final void iobyxmoadg(Object obj, Object obj2) {
                    this.f11682iobyxmoadg.x0(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            });
            this.f10691wwaezpbzkn = lqeggnwhkgVar;
            lqeggnwhkgVar.nufgyqmvbu(new Runnable() { // from class: androidx.media3.exoplayer.istkbnxepw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10582zdlpuopuiu.Y();
                }
            });
            androidx.media3.exoplayer.wkgbmnqykc wkgbmnqykcVar2 = new androidx.media3.exoplayer.wkgbmnqykc(zoijcleaowVar.f10048iobyxmoadg, looperHcddaimhww, zoijcleaowVar.f10039btonecajqb, this.f10659lereixgezr, dxjokdxxwwVar);
            this.f10703zynmafqrjb = wkgbmnqykcVar2;
            wkgbmnqykcVar2.gxszxtbevo(zoijcleaowVar.f10058ojitshcjhn);
            if (zoijcleaowVar.f10049iozdgvuglv) {
                jrbgnlbqoe jrbgnlbqoeVar = zoijcleaowVar.f10069ylkuphrtab;
                this.f10660lmojexxdyd = jrbgnlbqoeVar;
                jrbgnlbqoeVar.iobyxmoadg(new jrbgnlbqoe.iobyxmoadg() { // from class: androidx.media3.exoplayer.yadqdtsiqt
                    @Override // androidx.media3.exoplayer.jrbgnlbqoe.iobyxmoadg
                    public final void iobyxmoadg(boolean z13) {
                        this.f11624iobyxmoadg.y0(z13);
                    }
                }, this.f10641eablkybsjg, looper, looperHcddaimhww, dxjokdxxwwVar);
            } else {
                this.f10660lmojexxdyd = null;
            }
            if (zoijcleaowVar.f10063vdvldrhtss) {
                this.f10649istkbnxepw = new mhtqkkgtqm(zoijcleaowVar.f10048iobyxmoadg, this.f10659lereixgezr, this.f10678rlfsiqarku.zoijcleaow(), looperHcddaimhww, looper, dxjokdxxwwVar);
            } else {
                this.f10649istkbnxepw = null;
            }
            rhgxfdycjh rhgxfdycjhVar = new rhgxfdycjh(zoijcleaowVar.f10048iobyxmoadg, looperHcddaimhww, dxjokdxxwwVar);
            this.f10633cdpycssgdh = rhgxfdycjhVar;
            rhgxfdycjhVar.eablkybsjg(zoijcleaowVar.f10038agtfadlqog != 0);
            krqnebusok krqnebusokVar = new krqnebusok(zoijcleaowVar.f10048iobyxmoadg, looperHcddaimhww, dxjokdxxwwVar);
            this.f10694yadqdtsiqt = krqnebusokVar;
            krqnebusokVar.eablkybsjg(zoijcleaowVar.f10038agtfadlqog == 2);
            this.f10671opjhrmiecq = v2.wflxmlrfwp.f115678eablkybsjg;
            this.f10651iyctptxqzt = v2.jpowsppfya.f115374eablkybsjg;
            this.f10656jztzpxfvev = y2.lmojexxdyd.f123566ppxfxbqfkf;
            rlfsiqarkuVar.h(this.f10678rlfsiqarku, zoijcleaowVar.f10064wflxmlrfwp);
            C0(1, 3, this.f10678rlfsiqarku);
            C0(2, 4, Integer.valueOf(this.f10647ikoacuggdj));
            C0(2, 5, Integer.valueOf(this.f10670okpsazkaxt));
            C0(1, 9, Boolean.valueOf(this.f10685uwvvkdfqfp));
            C0(2, 7, this.f10674pmvmpeiblj);
            C0(6, 8, this.f10674pmvmpeiblj);
            D0(16, Integer.valueOf(this.f10701zfvoamnweg));
        } finally {
            this.f10690wkgbmnqykc.eablkybsjg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v2.yggfygwlhe A() {
        v2.cdpycssgdh cdpycssgdhVarJyumaefscl = jyumaefscl();
        if (cdpycssgdhVarJyumaefscl.vdvldrhtss()) {
            return this.f10688weqkydbzbr;
        }
        return this.f10688weqkydbzbr.iobyxmoadg().jpowsppfya(cdpycssgdhVarJyumaefscl.agtfadlqog(mbcevpiqjq(), this.f115643iobyxmoadg).f115290ppxfxbqfkf.f115391eablkybsjg).pkzmftpjix();
    }

    private void A0(int i13, int i14) {
        for (int i15 = i14 - 1; i15 >= i13; i15--) {
            this.f10676rgvfuqvkyq.remove(i15);
        }
        this.f10639dsvhmnatus = this.f10639dsvhmnatus.iobyxmoadg(i13, i14);
    }

    private void B0() {
        if (this.f10677ribwqtqdhb != null) {
            H(this.f10674pmvmpeiblj).wflxmlrfwp(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND).draadjrbmk(null).gtknphoqwx();
            this.f10677ribwqtqdhb.dxjokdxxww(this.f10659lereixgezr);
            this.f10677ribwqtqdhb = null;
        }
        TextureView textureView = this.f10652jhduphickx;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f10659lereixgezr) {
                y2.kcexrzcfyt.nufgyqmvbu("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f10652jhduphickx.setSurfaceTextureListener(null);
            }
            this.f10652jhduphickx = null;
        }
        SurfaceHolder surfaceHolder = this.f10653jlmebxxoox;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f10659lereixgezr);
            this.f10653jlmebxxoox = null;
        }
    }

    private void C0(int i13, int i14, Object obj) {
        for (wizcaqwiak wizcaqwiakVar : this.f10661lqeggnwhkg) {
            if (i13 == -1 || wizcaqwiakVar.dxjokdxxww() == i13) {
                H(wizcaqwiakVar).wflxmlrfwp(i14).draadjrbmk(obj).gtknphoqwx();
            }
        }
        for (wizcaqwiak wizcaqwiakVar2 : this.f10666nufgyqmvbu) {
            if (wizcaqwiakVar2 != null && (i13 == -1 || wizcaqwiakVar2.dxjokdxxww() == i13)) {
                H(wizcaqwiakVar2).wflxmlrfwp(i14).draadjrbmk(obj).gtknphoqwx();
            }
        }
    }

    private int D(boolean z13) {
        jrbgnlbqoe jrbgnlbqoeVar = this.f10660lmojexxdyd;
        if (jrbgnlbqoeVar == null || jrbgnlbqoeVar.zoijcleaow()) {
            return (this.f10662lrnfpwlwnk.f11034agtfadlqog != 1 || z13) ? 0 : 1;
        }
        return 3;
    }

    private void D0(int i13, Object obj) {
        C0(-1, i13, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v2.wflxmlrfwp E(mhtqkkgtqm mhtqkkgtqmVar) {
        return new v2.wflxmlrfwp.zoijcleaow(0).lqeggnwhkg(mhtqkkgtqmVar != null ? mhtqkkgtqmVar.btonecajqb() : 0).gxszxtbevo(mhtqkkgtqmVar != null ? mhtqkkgtqmVar.dxjokdxxww() : 0).eablkybsjg();
    }

    private v2.cdpycssgdh F() {
        return new lxfrhoxuzk(this.f10676rgvfuqvkyq, this.f10639dsvhmnatus);
    }

    private void F0(List list, int i13, long j13, boolean z13) {
        int iIobyxmoadg;
        long j14;
        int iM = M(this.f10662lrnfpwlwnk);
        long jIkoacuggdj = ikoacuggdj();
        this.f10645hcddaimhww++;
        if (!this.f10676rgvfuqvkyq.isEmpty()) {
            A0(0, this.f10676rgvfuqvkyq.size());
        }
        List listZ = z(0, list);
        v2.cdpycssgdh cdpycssgdhVarF = F();
        if (!cdpycssgdhVarF.vdvldrhtss() && i13 >= cdpycssgdhVarF.rgvfuqvkyq()) {
            throw new IllegalSeekPositionException(cdpycssgdhVarF, i13, j13);
        }
        if (z13) {
            j14 = -9223372036854775807L;
            iIobyxmoadg = cdpycssgdhVarF.iobyxmoadg(this.f10673pkzmftpjix);
        } else if (i13 == -1) {
            iIobyxmoadg = iM;
            j14 = jIkoacuggdj;
        } else {
            iIobyxmoadg = i13;
            j14 = j13;
        }
        skhdrjzrfn skhdrjzrfnVarU0 = u0(this.f10662lrnfpwlwnk, cdpycssgdhVarF, v0(cdpycssgdhVarF, iIobyxmoadg, j14));
        int i14 = skhdrjzrfnVarU0.f11038eablkybsjg;
        if (iIobyxmoadg != -1 && i14 != 1) {
            i14 = (cdpycssgdhVarF.vdvldrhtss() || iIobyxmoadg >= cdpycssgdhVarF.rgvfuqvkyq()) ? 4 : 2;
        }
        skhdrjzrfn skhdrjzrfnVarT0 = t0(skhdrjzrfnVarU0, i14);
        this.f10638draadjrbmk.m(listZ, iIobyxmoadg, y2.stevsuqkhv.ixidwrxhsl(j14), this.f10639dsvhmnatus);
        N0(skhdrjzrfnVarT0, 0, (this.f10662lrnfpwlwnk.f11053zoijcleaow.f11262iobyxmoadg.equals(skhdrjzrfnVarT0.f11053zoijcleaow.f11262iobyxmoadg) || this.f10662lrnfpwlwnk.f11041iobyxmoadg.vdvldrhtss()) ? false : true, 4, L(skhdrjzrfnVarT0), -1, false);
    }

    private List G(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < list.size(); i13++) {
            arrayList.add(this.f10672oxmwwwfdhm.wkgbmnqykc((v2.kcexrzcfyt) list.get(i13)));
        }
        return arrayList;
    }

    private void G0(SurfaceHolder surfaceHolder) {
        this.f10687vipkmwdibw = false;
        this.f10653jlmebxxoox = surfaceHolder;
        surfaceHolder.addCallback(this.f10659lereixgezr);
        Surface surface = this.f10653jlmebxxoox.getSurface();
        if (surface == null || !surface.isValid()) {
            w0(0, 0);
        } else {
            Rect surfaceFrame = this.f10653jlmebxxoox.getSurfaceFrame();
            w0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    private igdgnonuha H(igdgnonuha.zoijcleaow zoijcleaowVar) {
        int iM = M(this.f10662lrnfpwlwnk);
        rlfsiqarku rlfsiqarkuVar = this.f10638draadjrbmk;
        v2.cdpycssgdh cdpycssgdhVar = this.f10662lrnfpwlwnk.f11041iobyxmoadg;
        if (iM == -1) {
            iM = 0;
        }
        return new igdgnonuha(rlfsiqarkuVar, zoijcleaowVar, cdpycssgdhVar, iM, this.f10642esjtqupxsv, rlfsiqarkuVar.hcddaimhww());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        I0(surface);
        this.f10636crxdokpmqz = surface;
    }

    private Pair I(skhdrjzrfn skhdrjzrfnVar, skhdrjzrfn skhdrjzrfnVar2, boolean z13, int i13, boolean z14, boolean z15) {
        v2.cdpycssgdh cdpycssgdhVar = skhdrjzrfnVar2.f11041iobyxmoadg;
        v2.cdpycssgdh cdpycssgdhVar2 = skhdrjzrfnVar.f11041iobyxmoadg;
        if (cdpycssgdhVar2.vdvldrhtss() && cdpycssgdhVar.vdvldrhtss()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i14 = 3;
        if (cdpycssgdhVar2.vdvldrhtss() != cdpycssgdhVar.vdvldrhtss()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (cdpycssgdhVar.agtfadlqog(cdpycssgdhVar.nufgyqmvbu(skhdrjzrfnVar2.f11053zoijcleaow.f11262iobyxmoadg, this.f10669ojitshcjhn).f115304ppxfxbqfkf, this.f115643iobyxmoadg).f115286iobyxmoadg.equals(cdpycssgdhVar2.agtfadlqog(cdpycssgdhVar2.nufgyqmvbu(skhdrjzrfnVar.f11053zoijcleaow.f11262iobyxmoadg, this.f10669ojitshcjhn).f115304ppxfxbqfkf, this.f115643iobyxmoadg).f115286iobyxmoadg)) {
            if (z13 && i13 == 0 && skhdrjzrfnVar2.f11053zoijcleaow.f11264wkgbmnqykc < skhdrjzrfnVar.f11053zoijcleaow.f11264wkgbmnqykc) {
                return new Pair(Boolean.TRUE, 0);
            }
            return (z13 && i13 == 1 && z15) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        if (z13 && i13 == 0) {
            i14 = 1;
        } else if (z13 && i13 == 1) {
            i14 = 2;
        } else if (!z14) {
            throw new IllegalStateException();
        }
        return new Pair(Boolean.TRUE, Integer.valueOf(i14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0(Object obj) {
        Object obj2 = this.f10680sopmlzcsov;
        boolean z13 = (obj2 == null || obj2 == obj) ? false : true;
        boolean zB = this.f10638draadjrbmk.B(obj, z13 ? this.f10648iozdgvuglv : -9223372036854775807L);
        if (z13) {
            Object obj3 = this.f10680sopmlzcsov;
            Surface surface = this.f10636crxdokpmqz;
            if (obj3 == surface) {
                surface.release();
                this.f10636crxdokpmqz = null;
            }
        }
        this.f10680sopmlzcsov = obj;
        if (zB) {
            return;
        }
        K0(ExoPlaybackException.nufgyqmvbu(new ExoTimeoutException(3), 1003));
    }

    private long K(skhdrjzrfn skhdrjzrfnVar) {
        if (!skhdrjzrfnVar.f11053zoijcleaow.zoijcleaow()) {
            return y2.stevsuqkhv.t(L(skhdrjzrfnVar));
        }
        skhdrjzrfnVar.f11041iobyxmoadg.nufgyqmvbu(skhdrjzrfnVar.f11053zoijcleaow.f11262iobyxmoadg, this.f10669ojitshcjhn);
        return skhdrjzrfnVar.f11047ppxfxbqfkf == -9223372036854775807L ? skhdrjzrfnVar.f11041iobyxmoadg.agtfadlqog(M(skhdrjzrfnVar), this.f115643iobyxmoadg).zoijcleaow() : this.f10669ojitshcjhn.wflxmlrfwp() + y2.stevsuqkhv.t(skhdrjzrfnVar.f11047ppxfxbqfkf);
    }

    private void K0(ExoPlaybackException exoPlaybackException) {
        skhdrjzrfn skhdrjzrfnVar = this.f10662lrnfpwlwnk;
        skhdrjzrfn skhdrjzrfnVarPpxfxbqfkf = skhdrjzrfnVar.ppxfxbqfkf(skhdrjzrfnVar.f11053zoijcleaow);
        skhdrjzrfnVarPpxfxbqfkf.f11049vdvldrhtss = skhdrjzrfnVarPpxfxbqfkf.f11042kcexrzcfyt;
        skhdrjzrfnVarPpxfxbqfkf.f11046oxmwwwfdhm = 0L;
        skhdrjzrfn skhdrjzrfnVarT0 = t0(skhdrjzrfnVarPpxfxbqfkf, 1);
        if (exoPlaybackException != null) {
            skhdrjzrfnVarT0 = skhdrjzrfnVarT0.gxszxtbevo(exoPlaybackException);
        }
        this.f10645hcddaimhww++;
        this.f10638draadjrbmk.K();
        N0(skhdrjzrfnVarT0, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private long L(skhdrjzrfn skhdrjzrfnVar) {
        if (skhdrjzrfnVar.f11041iobyxmoadg.vdvldrhtss()) {
            return y2.stevsuqkhv.ixidwrxhsl(this.f10682tbqsvytpvh);
        }
        long jWflxmlrfwp = skhdrjzrfnVar.f11048rgvfuqvkyq ? skhdrjzrfnVar.wflxmlrfwp() : skhdrjzrfnVar.f11042kcexrzcfyt;
        return skhdrjzrfnVar.f11053zoijcleaow.zoijcleaow() ? jWflxmlrfwp : z0(skhdrjzrfnVar.f11041iobyxmoadg, skhdrjzrfnVar.f11053zoijcleaow, jWflxmlrfwp);
    }

    private void L0() {
        v2.esjtqupxsv.zoijcleaow zoijcleaowVar = this.f10658kegysxyocb;
        v2.esjtqupxsv.zoijcleaow zoijcleaowVarCllcsxoeiz = y2.stevsuqkhv.cllcsxoeiz(this.f10644gxszxtbevo, this.f10675ppxfxbqfkf);
        this.f10658kegysxyocb = zoijcleaowVarCllcsxoeiz;
        if (zoijcleaowVarCllcsxoeiz.equals(zoijcleaowVar)) {
            return;
        }
        this.f10689wflxmlrfwp.dxjokdxxww(13, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.wwaezpbzkn
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                this.f11620iobyxmoadg.e0((v2.esjtqupxsv.wkgbmnqykc) obj);
            }
        });
    }

    private int M(skhdrjzrfn skhdrjzrfnVar) {
        return skhdrjzrfnVar.f11041iobyxmoadg.vdvldrhtss() ? this.f10700zeieaojujs : skhdrjzrfnVar.f11041iobyxmoadg.nufgyqmvbu(skhdrjzrfnVar.f11053zoijcleaow.f11262iobyxmoadg, this.f10669ojitshcjhn).f115304ppxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0(boolean z13, int i13) {
        int iD = D(z13);
        skhdrjzrfn skhdrjzrfnVarIobyxmoadg = this.f10662lrnfpwlwnk;
        if (skhdrjzrfnVarIobyxmoadg.f11036draadjrbmk == z13 && skhdrjzrfnVarIobyxmoadg.f11034agtfadlqog == iD && skhdrjzrfnVarIobyxmoadg.f11050wflxmlrfwp == i13) {
            return;
        }
        this.f10645hcddaimhww++;
        if (skhdrjzrfnVarIobyxmoadg.f11048rgvfuqvkyq) {
            skhdrjzrfnVarIobyxmoadg = skhdrjzrfnVarIobyxmoadg.iobyxmoadg();
        }
        skhdrjzrfn skhdrjzrfnVarEablkybsjg = skhdrjzrfnVarIobyxmoadg.eablkybsjg(z13, i13, iD);
        this.f10638draadjrbmk.p(z13, i13, iD);
        N0(skhdrjzrfnVarEablkybsjg, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void N0(final skhdrjzrfn skhdrjzrfnVar, final int i13, boolean z13, final int i14, long j13, int i15, boolean z14) {
        skhdrjzrfn skhdrjzrfnVar2 = this.f10662lrnfpwlwnk;
        this.f10662lrnfpwlwnk = skhdrjzrfnVar;
        boolean zEquals = skhdrjzrfnVar2.f11041iobyxmoadg.equals(skhdrjzrfnVar.f11041iobyxmoadg);
        Pair pairI = I(skhdrjzrfnVar, skhdrjzrfnVar2, z13, i14, !zEquals, z14);
        boolean zBooleanValue = ((Boolean) pairI.first).booleanValue();
        final int iIntValue = ((Integer) pairI.second).intValue();
        final v2.kcexrzcfyt kcexrzcfytVar = null;
        if (zBooleanValue) {
            if (!skhdrjzrfnVar.f11041iobyxmoadg.vdvldrhtss()) {
                kcexrzcfytVar = skhdrjzrfnVar.f11041iobyxmoadg.agtfadlqog(skhdrjzrfnVar.f11041iobyxmoadg.nufgyqmvbu(skhdrjzrfnVar.f11053zoijcleaow.f11262iobyxmoadg, this.f10669ojitshcjhn).f115304ppxfxbqfkf, this.f115643iobyxmoadg).f115290ppxfxbqfkf;
            }
            this.f10688weqkydbzbr = v2.yggfygwlhe.f115743ylkuphrtab;
        }
        if (zBooleanValue || !skhdrjzrfnVar2.f11035btonecajqb.equals(skhdrjzrfnVar.f11035btonecajqb)) {
            this.f10688weqkydbzbr = this.f10688weqkydbzbr.iobyxmoadg().hkdspvbjdz(skhdrjzrfnVar.f11035btonecajqb).pkzmftpjix();
        }
        v2.yggfygwlhe yggfygwlheVarA = A();
        boolean zEquals2 = yggfygwlheVarA.equals(this.f10683tzroggbefp);
        this.f10683tzroggbefp = yggfygwlheVarA;
        boolean z15 = skhdrjzrfnVar2.f11036draadjrbmk != skhdrjzrfnVar.f11036draadjrbmk;
        boolean z16 = skhdrjzrfnVar2.f11038eablkybsjg != skhdrjzrfnVar.f11038eablkybsjg;
        if (z16 || z15) {
            P0();
        }
        boolean z17 = skhdrjzrfnVar2.f11043lqeggnwhkg;
        boolean z18 = skhdrjzrfnVar.f11043lqeggnwhkg;
        boolean z19 = z17 != z18;
        if (z19) {
            O0(z18);
        }
        if (!zEquals) {
            this.f10689wflxmlrfwp.dxjokdxxww(0, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.kcexrzcfyt
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    mbcevpiqjq.f0(skhdrjzrfnVar, i13, (v2.esjtqupxsv.wkgbmnqykc) obj);
                }
            });
        }
        if (z13) {
            final v2.esjtqupxsv.eablkybsjg eablkybsjgVarQ = Q(i14, skhdrjzrfnVar2, i15);
            final v2.esjtqupxsv.eablkybsjg eablkybsjgVarP = P(j13);
            this.f10689wflxmlrfwp.dxjokdxxww(11, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.dsvhmnatus
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    mbcevpiqjq.g0(i14, eablkybsjgVarQ, eablkybsjgVarP, (v2.esjtqupxsv.wkgbmnqykc) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f10689wflxmlrfwp.dxjokdxxww(1, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.wypolnanlu
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    ((v2.esjtqupxsv.wkgbmnqykc) obj).kegysxyocb(kcexrzcfytVar, iIntValue);
                }
            });
        }
        if (skhdrjzrfnVar2.f11040gxszxtbevo != skhdrjzrfnVar.f11040gxszxtbevo) {
            this.f10689wflxmlrfwp.dxjokdxxww(10, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.stevsuqkhv
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    mbcevpiqjq.i0(skhdrjzrfnVar, (v2.esjtqupxsv.wkgbmnqykc) obj);
                }
            });
            if (skhdrjzrfnVar.f11040gxszxtbevo != null) {
                this.f10689wflxmlrfwp.dxjokdxxww(10, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.kegysxyocb
                    @Override // y2.oxmwwwfdhm.iobyxmoadg
                    public final void invoke(Object obj) {
                        mbcevpiqjq.j0(skhdrjzrfnVar, (v2.esjtqupxsv.wkgbmnqykc) obj);
                    }
                });
            }
        }
        o3.yadqdtsiqt yadqdtsiqtVar = skhdrjzrfnVar2.f11037dxjokdxxww;
        o3.yadqdtsiqt yadqdtsiqtVar2 = skhdrjzrfnVar.f11037dxjokdxxww;
        if (yadqdtsiqtVar != yadqdtsiqtVar2) {
            this.f10640dxjokdxxww.dxjokdxxww(yadqdtsiqtVar2.f71901eablkybsjg);
            this.f10689wflxmlrfwp.dxjokdxxww(2, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.tzroggbefp
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    mbcevpiqjq.k0(skhdrjzrfnVar, (v2.esjtqupxsv.wkgbmnqykc) obj);
                }
            });
        }
        if (!zEquals2) {
            final v2.yggfygwlhe yggfygwlheVar = this.f10683tzroggbefp;
            this.f10689wflxmlrfwp.dxjokdxxww(14, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.zdlpuopuiu
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    ((v2.esjtqupxsv.wkgbmnqykc) obj).jpowsppfya(yggfygwlheVar);
                }
            });
        }
        if (z19) {
            this.f10689wflxmlrfwp.dxjokdxxww(3, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.yggfygwlhe
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    mbcevpiqjq.m0(skhdrjzrfnVar, (v2.esjtqupxsv.wkgbmnqykc) obj);
                }
            });
        }
        if (z16 || z15) {
            this.f10689wflxmlrfwp.dxjokdxxww(-1, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.jyumaefscl
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    mbcevpiqjq.n0(skhdrjzrfnVar, (v2.esjtqupxsv.wkgbmnqykc) obj);
                }
            });
        }
        if (z16) {
            this.f10689wflxmlrfwp.dxjokdxxww(4, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.iwizpuwonk
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    mbcevpiqjq.o0(skhdrjzrfnVar, (v2.esjtqupxsv.wkgbmnqykc) obj);
                }
            });
        }
        if (z15 || skhdrjzrfnVar2.f11050wflxmlrfwp != skhdrjzrfnVar.f11050wflxmlrfwp) {
            this.f10689wflxmlrfwp.dxjokdxxww(5, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.cdpycssgdh
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    mbcevpiqjq.p0(skhdrjzrfnVar, (v2.esjtqupxsv.wkgbmnqykc) obj);
                }
            });
        }
        if (skhdrjzrfnVar2.f11034agtfadlqog != skhdrjzrfnVar.f11034agtfadlqog) {
            this.f10689wflxmlrfwp.dxjokdxxww(6, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.jpowsppfya
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    mbcevpiqjq.q0(skhdrjzrfnVar, (v2.esjtqupxsv.wkgbmnqykc) obj);
                }
            });
        }
        if (skhdrjzrfnVar2.agtfadlqog() != skhdrjzrfnVar.agtfadlqog()) {
            this.f10689wflxmlrfwp.dxjokdxxww(7, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.hkdspvbjdz
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    mbcevpiqjq.r0(skhdrjzrfnVar, (v2.esjtqupxsv.wkgbmnqykc) obj);
                }
            });
        }
        if (!skhdrjzrfnVar2.f11045ojitshcjhn.equals(skhdrjzrfnVar.f11045ojitshcjhn)) {
            this.f10689wflxmlrfwp.dxjokdxxww(12, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.cllcsxoeiz
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    mbcevpiqjq.s0(skhdrjzrfnVar, (v2.esjtqupxsv.wkgbmnqykc) obj);
                }
            });
        }
        L0();
        this.f10689wflxmlrfwp.gxszxtbevo();
        if (skhdrjzrfnVar2.f11048rgvfuqvkyq != skhdrjzrfnVar.f11048rgvfuqvkyq) {
            Iterator it = this.f10630agtfadlqog.iterator();
            while (it.hasNext()) {
                ((ExoPlayer.iobyxmoadg) it.next()).iozdgvuglv(skhdrjzrfnVar.f11048rgvfuqvkyq);
            }
        }
    }

    private void O0(boolean z13) {
    }

    private v2.esjtqupxsv.eablkybsjg P(long j13) {
        v2.kcexrzcfyt kcexrzcfytVar;
        Object obj;
        int iZoijcleaow;
        Object obj2;
        int iMbcevpiqjq = mbcevpiqjq();
        if (this.f10662lrnfpwlwnk.f11041iobyxmoadg.vdvldrhtss()) {
            kcexrzcfytVar = null;
            obj = null;
            iZoijcleaow = -1;
            obj2 = null;
        } else {
            skhdrjzrfn skhdrjzrfnVar = this.f10662lrnfpwlwnk;
            Object obj3 = skhdrjzrfnVar.f11053zoijcleaow.f11262iobyxmoadg;
            skhdrjzrfnVar.f11041iobyxmoadg.nufgyqmvbu(obj3, this.f10669ojitshcjhn);
            iZoijcleaow = this.f10662lrnfpwlwnk.f11041iobyxmoadg.zoijcleaow(obj3);
            obj = obj3;
            obj2 = this.f10662lrnfpwlwnk.f11041iobyxmoadg.agtfadlqog(iMbcevpiqjq, this.f115643iobyxmoadg).f115286iobyxmoadg;
            kcexrzcfytVar = this.f115643iobyxmoadg.f115290ppxfxbqfkf;
        }
        long jT = y2.stevsuqkhv.t(j13);
        long jT2 = this.f10662lrnfpwlwnk.f11053zoijcleaow.zoijcleaow() ? y2.stevsuqkhv.t(R(this.f10662lrnfpwlwnk)) : jT;
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar = this.f10662lrnfpwlwnk.f11053zoijcleaow;
        return new v2.esjtqupxsv.eablkybsjg(obj2, iMbcevpiqjq, kcexrzcfytVar, obj, iZoijcleaow, jT, jT2, zoijcleaowVar.f11265zoijcleaow, zoijcleaowVar.f11263ppxfxbqfkf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        int iTzroggbefp = tzroggbefp();
        if (iTzroggbefp != 1) {
            if (iTzroggbefp == 2 || iTzroggbefp == 3) {
                this.f10633cdpycssgdh.gxszxtbevo(iozdgvuglv() && !T());
                this.f10694yadqdtsiqt.gxszxtbevo(iozdgvuglv());
                return;
            } else if (iTzroggbefp != 4) {
                throw new IllegalStateException();
            }
        }
        this.f10633cdpycssgdh.gxszxtbevo(false);
        this.f10694yadqdtsiqt.gxszxtbevo(false);
    }

    private v2.esjtqupxsv.eablkybsjg Q(int i13, skhdrjzrfn skhdrjzrfnVar, int i14) {
        int i15;
        Object obj;
        v2.kcexrzcfyt kcexrzcfytVar;
        Object obj2;
        int i16;
        long jR;
        long jR2;
        v2.cdpycssgdh.zoijcleaow zoijcleaowVar = new v2.cdpycssgdh.zoijcleaow();
        if (skhdrjzrfnVar.f11041iobyxmoadg.vdvldrhtss()) {
            i15 = i14;
            obj = null;
            kcexrzcfytVar = null;
            obj2 = null;
            i16 = -1;
        } else {
            Object obj3 = skhdrjzrfnVar.f11053zoijcleaow.f11262iobyxmoadg;
            skhdrjzrfnVar.f11041iobyxmoadg.nufgyqmvbu(obj3, zoijcleaowVar);
            int i17 = zoijcleaowVar.f115304ppxfxbqfkf;
            int iZoijcleaow = skhdrjzrfnVar.f11041iobyxmoadg.zoijcleaow(obj3);
            Object obj4 = skhdrjzrfnVar.f11041iobyxmoadg.agtfadlqog(i17, this.f115643iobyxmoadg).f115286iobyxmoadg;
            kcexrzcfytVar = this.f115643iobyxmoadg.f115290ppxfxbqfkf;
            obj2 = obj3;
            i16 = iZoijcleaow;
            obj = obj4;
            i15 = i17;
        }
        if (i13 == 0) {
            if (skhdrjzrfnVar.f11053zoijcleaow.zoijcleaow()) {
                androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar2 = skhdrjzrfnVar.f11053zoijcleaow;
                jR = zoijcleaowVar.zoijcleaow(zoijcleaowVar2.f11265zoijcleaow, zoijcleaowVar2.f11263ppxfxbqfkf);
                jR2 = R(skhdrjzrfnVar);
            } else {
                jR = skhdrjzrfnVar.f11053zoijcleaow.f11261eablkybsjg != -1 ? R(this.f10662lrnfpwlwnk) : zoijcleaowVar.f115300eablkybsjg + zoijcleaowVar.f115305wkgbmnqykc;
                jR2 = jR;
            }
        } else if (skhdrjzrfnVar.f11053zoijcleaow.zoijcleaow()) {
            jR = skhdrjzrfnVar.f11042kcexrzcfyt;
            jR2 = R(skhdrjzrfnVar);
        } else {
            jR = zoijcleaowVar.f115300eablkybsjg + skhdrjzrfnVar.f11042kcexrzcfyt;
            jR2 = jR;
        }
        long jT = y2.stevsuqkhv.t(jR);
        long jT2 = y2.stevsuqkhv.t(jR2);
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar3 = skhdrjzrfnVar.f11053zoijcleaow;
        return new v2.esjtqupxsv.eablkybsjg(obj, i15, kcexrzcfytVar, obj2, i16, jT, jT2, zoijcleaowVar3.f11265zoijcleaow, zoijcleaowVar3.f11263ppxfxbqfkf);
    }

    private void Q0() {
        this.f10690wkgbmnqykc.zoijcleaow();
        if (Thread.currentThread() != iwizpuwonk().getThread()) {
            String strIozdgvuglv = y2.stevsuqkhv.iozdgvuglv("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), iwizpuwonk().getThread().getName());
            if (this.f10695ydmasvzmpa) {
                throw new IllegalStateException(strIozdgvuglv);
            }
            y2.kcexrzcfyt.dxjokdxxww("ExoPlayerImpl", strIozdgvuglv, this.f10679sflfametgt ? null : new IllegalStateException());
            this.f10679sflfametgt = true;
        }
    }

    private static long R(skhdrjzrfn skhdrjzrfnVar) {
        v2.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVar = new v2.cdpycssgdh.ppxfxbqfkf();
        v2.cdpycssgdh.zoijcleaow zoijcleaowVar = new v2.cdpycssgdh.zoijcleaow();
        skhdrjzrfnVar.f11041iobyxmoadg.nufgyqmvbu(skhdrjzrfnVar.f11053zoijcleaow.f11262iobyxmoadg, zoijcleaowVar);
        return skhdrjzrfnVar.f11047ppxfxbqfkf == -9223372036854775807L ? skhdrjzrfnVar.f11041iobyxmoadg.agtfadlqog(zoijcleaowVar.f115304ppxfxbqfkf, ppxfxbqfkfVar).ppxfxbqfkf() : zoijcleaowVar.agtfadlqog() + skhdrjzrfnVar.f11047ppxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void W(rlfsiqarku.eablkybsjg eablkybsjgVar) {
        long jZ0;
        int i13 = this.f10645hcddaimhww - eablkybsjgVar.f11006ppxfxbqfkf;
        this.f10645hcddaimhww = i13;
        boolean z13 = true;
        if (eablkybsjgVar.f11007wkgbmnqykc) {
            this.f10654jpowsppfya = eablkybsjgVar.f11004eablkybsjg;
            this.f10646hkdspvbjdz = true;
        }
        if (i13 == 0) {
            v2.cdpycssgdh cdpycssgdhVar = eablkybsjgVar.f11008zoijcleaow.f11041iobyxmoadg;
            if (!this.f10662lrnfpwlwnk.f11041iobyxmoadg.vdvldrhtss() && cdpycssgdhVar.vdvldrhtss()) {
                this.f10700zeieaojujs = -1;
                this.f10682tbqsvytpvh = 0L;
                this.f10667nuxfzjnpeb = 0;
            }
            if (!cdpycssgdhVar.vdvldrhtss()) {
                List listIozdgvuglv = ((lxfrhoxuzk) cdpycssgdhVar).iozdgvuglv();
                y2.iobyxmoadg.lqeggnwhkg(listIozdgvuglv.size() == this.f10676rgvfuqvkyq.size());
                for (int i14 = 0; i14 < listIozdgvuglv.size(); i14++) {
                    ((eablkybsjg) this.f10676rgvfuqvkyq.get(i14)).ppxfxbqfkf((v2.cdpycssgdh) listIozdgvuglv.get(i14));
                }
            }
            long j13 = -9223372036854775807L;
            if (this.f10646hkdspvbjdz) {
                if (eablkybsjgVar.f11008zoijcleaow.f11053zoijcleaow.equals(this.f10662lrnfpwlwnk.f11053zoijcleaow) && eablkybsjgVar.f11008zoijcleaow.f11051wkgbmnqykc == this.f10662lrnfpwlwnk.f11042kcexrzcfyt) {
                    z13 = false;
                }
                if (z13) {
                    if (cdpycssgdhVar.vdvldrhtss() || eablkybsjgVar.f11008zoijcleaow.f11053zoijcleaow.zoijcleaow()) {
                        jZ0 = eablkybsjgVar.f11008zoijcleaow.f11051wkgbmnqykc;
                    } else {
                        skhdrjzrfn skhdrjzrfnVar = eablkybsjgVar.f11008zoijcleaow;
                        jZ0 = z0(cdpycssgdhVar, skhdrjzrfnVar.f11053zoijcleaow, skhdrjzrfnVar.f11051wkgbmnqykc);
                    }
                    j13 = jZ0;
                }
            } else {
                z13 = false;
            }
            this.f10646hkdspvbjdz = false;
            N0(eablkybsjgVar.f11008zoijcleaow, 1, z13, this.f10654jpowsppfya, j13, -1, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(v2.esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, v2.rgvfuqvkyq rgvfuqvkyqVar) {
        wkgbmnqykcVar.oipsdeybqn(this.f10644gxszxtbevo, new v2.esjtqupxsv.ppxfxbqfkf(rgvfuqvkyqVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(final rlfsiqarku.eablkybsjg eablkybsjgVar) {
        this.f10632btonecajqb.lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.iozdgvuglv
            @Override // java.lang.Runnable
            public final void run() {
                this.f10581zdlpuopuiu.W(eablkybsjgVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y() {
        this.f10691wwaezpbzkn.dxjokdxxww(Integer.valueOf(y2.stevsuqkhv.ylkuphrtab(this.f10641eablkybsjg)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a0(v2.esjtqupxsv.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ntlheqmsrt(ExoPlaybackException.nufgyqmvbu(new ExoTimeoutException(1), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0(v2.esjtqupxsv.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.jlmebxxoox(this.f10658kegysxyocb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f0(skhdrjzrfn skhdrjzrfnVar, int i13, v2.esjtqupxsv.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.yfnezrywwk(skhdrjzrfnVar.f11041iobyxmoadg, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g0(int i13, v2.esjtqupxsv.eablkybsjg eablkybsjgVar, v2.esjtqupxsv.eablkybsjg eablkybsjgVar2, v2.esjtqupxsv.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.vipkmwdibw(i13);
        wkgbmnqykcVar.rlfsiqarku(eablkybsjgVar, eablkybsjgVar2, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i0(skhdrjzrfn skhdrjzrfnVar, v2.esjtqupxsv.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.uwvvkdfqfp(skhdrjzrfnVar.f11040gxszxtbevo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j0(skhdrjzrfn skhdrjzrfnVar, v2.esjtqupxsv.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ntlheqmsrt(skhdrjzrfnVar.f11040gxszxtbevo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k0(skhdrjzrfn skhdrjzrfnVar, v2.esjtqupxsv.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.wypolnanlu(skhdrjzrfnVar.f11037dxjokdxxww.f71904wkgbmnqykc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m0(skhdrjzrfn skhdrjzrfnVar, v2.esjtqupxsv.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.zynmafqrjb(skhdrjzrfnVar.f11043lqeggnwhkg);
        wkgbmnqykcVar.okpsazkaxt(skhdrjzrfnVar.f11043lqeggnwhkg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n0(skhdrjzrfn skhdrjzrfnVar, v2.esjtqupxsv.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.metgxyhuhe(skhdrjzrfnVar.f11036draadjrbmk, skhdrjzrfnVar.f11038eablkybsjg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o0(skhdrjzrfn skhdrjzrfnVar, v2.esjtqupxsv.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.iozdgvuglv(skhdrjzrfnVar.f11038eablkybsjg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p0(skhdrjzrfn skhdrjzrfnVar, v2.esjtqupxsv.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.ydmasvzmpa(skhdrjzrfnVar.f11036draadjrbmk, skhdrjzrfnVar.f11050wflxmlrfwp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q0(skhdrjzrfn skhdrjzrfnVar, v2.esjtqupxsv.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.pmvmpeiblj(skhdrjzrfnVar.f11034agtfadlqog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r0(skhdrjzrfn skhdrjzrfnVar, v2.esjtqupxsv.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.bfopjjpdmp(skhdrjzrfnVar.agtfadlqog());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s0(skhdrjzrfn skhdrjzrfnVar, v2.esjtqupxsv.wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykcVar.nufgyqmvbu(skhdrjzrfnVar.f11045ojitshcjhn);
    }

    private static skhdrjzrfn t0(skhdrjzrfn skhdrjzrfnVar, int i13) {
        skhdrjzrfn skhdrjzrfnVarNufgyqmvbu = skhdrjzrfnVar.nufgyqmvbu(i13);
        return (i13 == 1 || i13 == 4) ? skhdrjzrfnVarNufgyqmvbu.zoijcleaow(false) : skhdrjzrfnVarNufgyqmvbu;
    }

    private skhdrjzrfn u0(skhdrjzrfn skhdrjzrfnVar, v2.cdpycssgdh cdpycssgdhVar, Pair pair) {
        y2.iobyxmoadg.iobyxmoadg(cdpycssgdhVar.vdvldrhtss() || pair != null);
        v2.cdpycssgdh cdpycssgdhVar2 = skhdrjzrfnVar.f11041iobyxmoadg;
        long jK = K(skhdrjzrfnVar);
        skhdrjzrfn skhdrjzrfnVarBtonecajqb = skhdrjzrfnVar.btonecajqb(cdpycssgdhVar);
        if (cdpycssgdhVar.vdvldrhtss()) {
            androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVarDraadjrbmk = skhdrjzrfn.draadjrbmk();
            long jIxidwrxhsl = y2.stevsuqkhv.ixidwrxhsl(this.f10682tbqsvytpvh);
            skhdrjzrfn skhdrjzrfnVarPpxfxbqfkf = skhdrjzrfnVarBtonecajqb.wkgbmnqykc(zoijcleaowVarDraadjrbmk, jIxidwrxhsl, jIxidwrxhsl, jIxidwrxhsl, 0L, m3.iwizpuwonk.f65035wkgbmnqykc, this.f10702zoijcleaow, com.google.common.collect.zdlpuopuiu.zynmafqrjb()).ppxfxbqfkf(zoijcleaowVarDraadjrbmk);
            skhdrjzrfnVarPpxfxbqfkf.f11049vdvldrhtss = skhdrjzrfnVarPpxfxbqfkf.f11042kcexrzcfyt;
            return skhdrjzrfnVarPpxfxbqfkf;
        }
        Object obj = skhdrjzrfnVarBtonecajqb.f11053zoijcleaow.f11262iobyxmoadg;
        boolean zEquals = obj.equals(((Pair) y2.stevsuqkhv.nufgyqmvbu(pair)).first);
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar = !zEquals ? new androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow(pair.first) : skhdrjzrfnVarBtonecajqb.f11053zoijcleaow;
        long jLongValue = ((Long) pair.second).longValue();
        long jIxidwrxhsl2 = y2.stevsuqkhv.ixidwrxhsl(jK);
        if (!cdpycssgdhVar2.vdvldrhtss()) {
            jIxidwrxhsl2 -= cdpycssgdhVar2.nufgyqmvbu(obj, this.f10669ojitshcjhn).agtfadlqog();
        }
        if (!zEquals || jLongValue < jIxidwrxhsl2) {
            y2.iobyxmoadg.lqeggnwhkg(!zoijcleaowVar.zoijcleaow());
            skhdrjzrfn skhdrjzrfnVarPpxfxbqfkf2 = skhdrjzrfnVarBtonecajqb.wkgbmnqykc(zoijcleaowVar, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? m3.iwizpuwonk.f65035wkgbmnqykc : skhdrjzrfnVarBtonecajqb.f11044nufgyqmvbu, !zEquals ? this.f10702zoijcleaow : skhdrjzrfnVarBtonecajqb.f11037dxjokdxxww, !zEquals ? com.google.common.collect.zdlpuopuiu.zynmafqrjb() : skhdrjzrfnVarBtonecajqb.f11035btonecajqb).ppxfxbqfkf(zoijcleaowVar);
            skhdrjzrfnVarPpxfxbqfkf2.f11049vdvldrhtss = jLongValue;
            return skhdrjzrfnVarPpxfxbqfkf2;
        }
        if (jLongValue == jIxidwrxhsl2) {
            int iZoijcleaow = cdpycssgdhVar.zoijcleaow(skhdrjzrfnVarBtonecajqb.f11039gtknphoqwx.f11262iobyxmoadg);
            if (iZoijcleaow == -1 || cdpycssgdhVar.gxszxtbevo(iZoijcleaow, this.f10669ojitshcjhn).f115304ppxfxbqfkf != cdpycssgdhVar.nufgyqmvbu(zoijcleaowVar.f11262iobyxmoadg, this.f10669ojitshcjhn).f115304ppxfxbqfkf) {
                cdpycssgdhVar.nufgyqmvbu(zoijcleaowVar.f11262iobyxmoadg, this.f10669ojitshcjhn);
                long jZoijcleaow = zoijcleaowVar.zoijcleaow() ? this.f10669ojitshcjhn.zoijcleaow(zoijcleaowVar.f11265zoijcleaow, zoijcleaowVar.f11263ppxfxbqfkf) : this.f10669ojitshcjhn.f115305wkgbmnqykc;
                skhdrjzrfnVarBtonecajqb = skhdrjzrfnVarBtonecajqb.wkgbmnqykc(zoijcleaowVar, skhdrjzrfnVarBtonecajqb.f11042kcexrzcfyt, skhdrjzrfnVarBtonecajqb.f11042kcexrzcfyt, skhdrjzrfnVarBtonecajqb.f11051wkgbmnqykc, jZoijcleaow - skhdrjzrfnVarBtonecajqb.f11042kcexrzcfyt, skhdrjzrfnVarBtonecajqb.f11044nufgyqmvbu, skhdrjzrfnVarBtonecajqb.f11037dxjokdxxww, skhdrjzrfnVarBtonecajqb.f11035btonecajqb).ppxfxbqfkf(zoijcleaowVar);
                skhdrjzrfnVarBtonecajqb.f11049vdvldrhtss = jZoijcleaow;
            }
        } else {
            y2.iobyxmoadg.lqeggnwhkg(!zoijcleaowVar.zoijcleaow());
            long jMax = Math.max(0L, skhdrjzrfnVarBtonecajqb.f11046oxmwwwfdhm - (jLongValue - jIxidwrxhsl2));
            long j13 = skhdrjzrfnVarBtonecajqb.f11049vdvldrhtss;
            if (skhdrjzrfnVarBtonecajqb.f11039gtknphoqwx.equals(skhdrjzrfnVarBtonecajqb.f11053zoijcleaow)) {
                j13 = jLongValue + jMax;
            }
            skhdrjzrfnVarBtonecajqb = skhdrjzrfnVarBtonecajqb.wkgbmnqykc(zoijcleaowVar, jLongValue, jLongValue, jLongValue, jMax, skhdrjzrfnVarBtonecajqb.f11044nufgyqmvbu, skhdrjzrfnVarBtonecajqb.f11037dxjokdxxww, skhdrjzrfnVarBtonecajqb.f11035btonecajqb);
            skhdrjzrfnVarBtonecajqb.f11049vdvldrhtss = j13;
        }
        return skhdrjzrfnVarBtonecajqb;
    }

    private Pair v0(v2.cdpycssgdh cdpycssgdhVar, int i13, long j13) {
        if (cdpycssgdhVar.vdvldrhtss()) {
            this.f10700zeieaojujs = i13;
            if (j13 == -9223372036854775807L) {
                j13 = 0;
            }
            this.f10682tbqsvytpvh = j13;
            this.f10667nuxfzjnpeb = 0;
            return null;
        }
        if (i13 == -1 || i13 >= cdpycssgdhVar.rgvfuqvkyq()) {
            i13 = cdpycssgdhVar.iobyxmoadg(this.f10673pkzmftpjix);
            j13 = cdpycssgdhVar.agtfadlqog(i13, this.f115643iobyxmoadg).zoijcleaow();
        }
        return cdpycssgdhVar.btonecajqb(this.f115643iobyxmoadg, this.f10669ojitshcjhn, i13, y2.stevsuqkhv.ixidwrxhsl(j13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(final int i13, final int i14) {
        if (i13 == this.f10656jztzpxfvev.zoijcleaow() && i14 == this.f10656jztzpxfvev.iobyxmoadg()) {
            return;
        }
        this.f10656jztzpxfvev = new y2.lmojexxdyd(i13, i14);
        this.f10689wflxmlrfwp.draadjrbmk(24, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.cqumvgiudr
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((v2.esjtqupxsv.wkgbmnqykc) obj).ulzqkzuiru(i13, i14);
            }
        });
        C0(2, 14, new y2.lmojexxdyd(i13, i14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0(int i13, final int i14) {
        Q0();
        C0(1, 10, Integer.valueOf(i14));
        C0(2, 10, Integer.valueOf(i14));
        this.f10689wflxmlrfwp.draadjrbmk(21, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.pkzmftpjix
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((v2.esjtqupxsv.wkgbmnqykc) obj).yadqdtsiqt(i14);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(boolean z13) {
        if (this.f10631bfopjjpdmp) {
            return;
        }
        if (!z13) {
            M0(this.f10662lrnfpwlwnk.f11036draadjrbmk, 1);
            return;
        }
        skhdrjzrfn skhdrjzrfnVar = this.f10662lrnfpwlwnk;
        if (skhdrjzrfnVar.f11034agtfadlqog == 3) {
            M0(skhdrjzrfnVar.f11036draadjrbmk, 1);
        }
    }

    private List z(int i13, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < list.size(); i14++) {
            dvvnrvtcbc.ppxfxbqfkf ppxfxbqfkfVar = new dvvnrvtcbc.ppxfxbqfkf((androidx.media3.exoplayer.source.oxmwwwfdhm) list.get(i14), this.f10686vdvldrhtss);
            arrayList.add(ppxfxbqfkfVar);
            this.f10676rgvfuqvkyq.add(i14 + i13, new eablkybsjg(ppxfxbqfkfVar.f10507zoijcleaow, ppxfxbqfkfVar.f10504iobyxmoadg));
        }
        this.f10639dsvhmnatus = this.f10639dsvhmnatus.lqeggnwhkg(i13, arrayList.size());
        return arrayList;
    }

    private long z0(v2.cdpycssgdh cdpycssgdhVar, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, long j13) {
        cdpycssgdhVar.nufgyqmvbu(zoijcleaowVar.f11262iobyxmoadg, this.f10669ojitshcjhn);
        return j13 + this.f10669ojitshcjhn.agtfadlqog();
    }

    public void B() {
        Q0();
        B0();
        I0(null);
        w0(0, 0);
    }

    public void C(SurfaceHolder surfaceHolder) {
        Q0();
        if (surfaceHolder == null || surfaceHolder != this.f10653jlmebxxoox) {
            return;
        }
        B();
    }

    public void E0(List list, boolean z13) {
        Q0();
        F0(list, -1, -9223372036854775807L, z13);
    }

    public y2.dxjokdxxww J() {
        return this.f10642esjtqupxsv;
    }

    public void J0(SurfaceHolder surfaceHolder) {
        Q0();
        if (surfaceHolder == null) {
            B();
            return;
        }
        B0();
        this.f10687vipkmwdibw = true;
        this.f10653jlmebxxoox = surfaceHolder;
        surfaceHolder.addCallback(this.f10659lereixgezr);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            I0(null);
            w0(0, 0);
        } else {
            I0(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            w0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public Looper N() {
        return this.f10638draadjrbmk.hcddaimhww();
    }

    @Override // v2.esjtqupxsv
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public ExoPlaybackException draadjrbmk() {
        Q0();
        return this.f10662lrnfpwlwnk.f11040gxszxtbevo;
    }

    public boolean T() {
        Q0();
        return this.f10662lrnfpwlwnk.f11048rgvfuqvkyq;
    }

    @Override // v2.esjtqupxsv
    public void btonecajqb(SurfaceView surfaceView) {
        Q0();
        if (surfaceView instanceof r3.gxszxtbevo) {
            B0();
            I0(surfaceView);
            G0(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof s3.draadjrbmk)) {
                J0(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            B0();
            this.f10677ribwqtqdhb = (s3.draadjrbmk) surfaceView;
            H(this.f10674pmvmpeiblj).wflxmlrfwp(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND).draadjrbmk(this.f10677ribwqtqdhb).gtknphoqwx();
            this.f10677ribwqtqdhb.wkgbmnqykc(this.f10659lereixgezr);
            I0(this.f10677ribwqtqdhb.getVideoSurface());
            G0(surfaceView.getHolder());
        }
    }

    @Override // v2.esjtqupxsv
    public v2.esjtqupxsv.zoijcleaow cdpycssgdh() {
        Q0();
        return this.f10658kegysxyocb;
    }

    @Override // v2.esjtqupxsv
    public int cllcsxoeiz() {
        Q0();
        if (ppxfxbqfkf()) {
            return this.f10662lrnfpwlwnk.f11053zoijcleaow.f11263ppxfxbqfkf;
        }
        return -1;
    }

    @Override // v2.esjtqupxsv
    public v2.lmojexxdyd cqumvgiudr() {
        Q0();
        return this.f10640dxjokdxxww.ppxfxbqfkf();
    }

    @Override // v2.esjtqupxsv
    public boolean crxdokpmqz() {
        Q0();
        return this.f10673pkzmftpjix;
    }

    @Override // v2.esjtqupxsv
    public void dxjokdxxww(List list, boolean z13) {
        Q0();
        E0(G(list), z13);
    }

    @Override // v2.esjtqupxsv
    public void eablkybsjg(v2.cqumvgiudr cqumvgiudrVar) {
        Q0();
        if (cqumvgiudrVar == null) {
            cqumvgiudrVar = v2.cqumvgiudr.f115309wkgbmnqykc;
        }
        if (this.f10662lrnfpwlwnk.f11045ojitshcjhn.equals(cqumvgiudrVar)) {
            return;
        }
        skhdrjzrfn skhdrjzrfnVarLqeggnwhkg = this.f10662lrnfpwlwnk.lqeggnwhkg(cqumvgiudrVar);
        this.f10645hcddaimhww++;
        this.f10638draadjrbmk.r(cqumvgiudrVar);
        N0(skhdrjzrfnVarLqeggnwhkg, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // v2.esjtqupxsv
    public void hcddaimhww(TextureView textureView) {
        Q0();
        if (textureView == null || textureView != this.f10652jhduphickx) {
            return;
        }
        B();
    }

    @Override // v2.esjtqupxsv
    public long ikoacuggdj() {
        Q0();
        return y2.stevsuqkhv.t(L(this.f10662lrnfpwlwnk));
    }

    @Override // v2.esjtqupxsv
    public long iobyxmoadg() {
        Q0();
        if (!ppxfxbqfkf()) {
            return ylkuphrtab();
        }
        skhdrjzrfn skhdrjzrfnVar = this.f10662lrnfpwlwnk;
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar = skhdrjzrfnVar.f11053zoijcleaow;
        skhdrjzrfnVar.f11041iobyxmoadg.nufgyqmvbu(zoijcleaowVar.f11262iobyxmoadg, this.f10669ojitshcjhn);
        return y2.stevsuqkhv.t(this.f10669ojitshcjhn.zoijcleaow(zoijcleaowVar.f11265zoijcleaow, zoijcleaowVar.f11263ppxfxbqfkf));
    }

    @Override // v2.esjtqupxsv
    public boolean iozdgvuglv() {
        Q0();
        return this.f10662lrnfpwlwnk.f11036draadjrbmk;
    }

    @Override // v2.esjtqupxsv
    public Looper iwizpuwonk() {
        return this.f10699zdlpuopuiu;
    }

    @Override // v2.esjtqupxsv
    public v2.yggfygwlhe jhduphickx() {
        Q0();
        return this.f10683tzroggbefp;
    }

    @Override // v2.esjtqupxsv
    public long jlmebxxoox() {
        Q0();
        if (this.f10662lrnfpwlwnk.f11041iobyxmoadg.vdvldrhtss()) {
            return this.f10682tbqsvytpvh;
        }
        skhdrjzrfn skhdrjzrfnVar = this.f10662lrnfpwlwnk;
        if (skhdrjzrfnVar.f11039gtknphoqwx.f11264wkgbmnqykc != skhdrjzrfnVar.f11053zoijcleaow.f11264wkgbmnqykc) {
            return skhdrjzrfnVar.f11041iobyxmoadg.agtfadlqog(mbcevpiqjq(), this.f115643iobyxmoadg).wkgbmnqykc();
        }
        long j13 = skhdrjzrfnVar.f11049vdvldrhtss;
        if (this.f10662lrnfpwlwnk.f11039gtknphoqwx.zoijcleaow()) {
            skhdrjzrfn skhdrjzrfnVar2 = this.f10662lrnfpwlwnk;
            v2.cdpycssgdh.zoijcleaow zoijcleaowVarNufgyqmvbu = skhdrjzrfnVar2.f11041iobyxmoadg.nufgyqmvbu(skhdrjzrfnVar2.f11039gtknphoqwx.f11262iobyxmoadg, this.f10669ojitshcjhn);
            long jGxszxtbevo = zoijcleaowVarNufgyqmvbu.gxszxtbevo(this.f10662lrnfpwlwnk.f11039gtknphoqwx.f11265zoijcleaow);
            j13 = jGxszxtbevo == Long.MIN_VALUE ? zoijcleaowVarNufgyqmvbu.f115305wkgbmnqykc : jGxszxtbevo;
        }
        skhdrjzrfn skhdrjzrfnVar3 = this.f10662lrnfpwlwnk;
        return y2.stevsuqkhv.t(z0(skhdrjzrfnVar3.f11041iobyxmoadg, skhdrjzrfnVar3.f11039gtknphoqwx, j13));
    }

    @Override // v2.esjtqupxsv
    public v2.jpowsppfya jpowsppfya() {
        Q0();
        return this.f10651iyctptxqzt;
    }

    @Override // v2.esjtqupxsv
    public v2.cdpycssgdh jyumaefscl() {
        Q0();
        return this.f10662lrnfpwlwnk.f11041iobyxmoadg;
    }

    @Override // v2.esjtqupxsv
    public void lereixgezr(TextureView textureView) {
        Q0();
        if (textureView == null) {
            B();
            return;
        }
        B0();
        this.f10652jhduphickx = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            y2.kcexrzcfyt.nufgyqmvbu("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f10659lereixgezr);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            I0(null);
            w0(0, 0);
        } else {
            H0(surfaceTexture);
            w0(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // v2.esjtqupxsv
    public void lmojexxdyd(final boolean z13) {
        Q0();
        if (this.f10673pkzmftpjix != z13) {
            this.f10673pkzmftpjix = z13;
            this.f10638draadjrbmk.x(z13);
            this.f10689wflxmlrfwp.dxjokdxxww(9, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.ylkuphrtab
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    ((v2.esjtqupxsv.wkgbmnqykc) obj).ylkuphrtab(z13);
                }
            });
            L0();
            this.f10689wflxmlrfwp.gxszxtbevo();
        }
    }

    @Override // v2.esjtqupxsv
    public v2.cqumvgiudr lqeggnwhkg() {
        Q0();
        return this.f10662lrnfpwlwnk.f11045ojitshcjhn;
    }

    @Override // v2.esjtqupxsv
    public int mbcevpiqjq() {
        Q0();
        int iM = M(this.f10662lrnfpwlwnk);
        if (iM == -1) {
            return 0;
        }
        return iM;
    }

    @Override // v2.esjtqupxsv
    public void ntlheqmsrt(final int i13) {
        Q0();
        if (this.f10698ylkuphrtab != i13) {
            this.f10698ylkuphrtab = i13;
            this.f10638draadjrbmk.u(i13);
            this.f10689wflxmlrfwp.dxjokdxxww(8, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.lmojexxdyd
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    ((v2.esjtqupxsv.wkgbmnqykc) obj).czzsidtyhn(i13);
                }
            });
            L0();
            this.f10689wflxmlrfwp.gxszxtbevo();
        }
    }

    @Override // v2.esjtqupxsv
    public v2.wwaezpbzkn ojitshcjhn() {
        Q0();
        return this.f10662lrnfpwlwnk.f11037dxjokdxxww.f71904wkgbmnqykc;
    }

    @Override // v2.esjtqupxsv
    public long okpsazkaxt() {
        Q0();
        return this.f10655jyumaefscl;
    }

    @Override // v2.esjtqupxsv
    public int oxmwwwfdhm() {
        Q0();
        if (ppxfxbqfkf()) {
            return this.f10662lrnfpwlwnk.f11053zoijcleaow.f11265zoijcleaow;
        }
        return -1;
    }

    @Override // v2.esjtqupxsv
    public int pkzmftpjix() {
        Q0();
        if (this.f10662lrnfpwlwnk.f11041iobyxmoadg.vdvldrhtss()) {
            return this.f10667nuxfzjnpeb;
        }
        skhdrjzrfn skhdrjzrfnVar = this.f10662lrnfpwlwnk;
        return skhdrjzrfnVar.f11041iobyxmoadg.zoijcleaow(skhdrjzrfnVar.f11053zoijcleaow.f11262iobyxmoadg);
    }

    @Override // v2.esjtqupxsv
    public void pmvmpeiblj(v2.esjtqupxsv.wkgbmnqykc wkgbmnqykcVar) {
        Q0();
        this.f10689wflxmlrfwp.gtknphoqwx((v2.esjtqupxsv.wkgbmnqykc) y2.iobyxmoadg.eablkybsjg(wkgbmnqykcVar));
    }

    @Override // v2.esjtqupxsv
    public boolean ppxfxbqfkf() {
        Q0();
        return this.f10662lrnfpwlwnk.f11053zoijcleaow.zoijcleaow();
    }

    @Override // v2.esjtqupxsv
    public void release() {
        y2.kcexrzcfyt.gxszxtbevo("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.7.1] [" + y2.stevsuqkhv.f123599eablkybsjg + "] [" + v2.zdlpuopuiu.zoijcleaow() + "]");
        Q0();
        this.f10703zynmafqrjb.gxszxtbevo(false);
        mhtqkkgtqm mhtqkkgtqmVar = this.f10649istkbnxepw;
        if (mhtqkkgtqmVar != null) {
            mhtqkkgtqmVar.ojitshcjhn();
        }
        this.f10633cdpycssgdh.gxszxtbevo(false);
        this.f10694yadqdtsiqt.gxszxtbevo(false);
        jrbgnlbqoe jrbgnlbqoeVar = this.f10660lmojexxdyd;
        if (jrbgnlbqoeVar != null) {
            jrbgnlbqoeVar.gxszxtbevo();
        }
        if (!this.f10638draadjrbmk.igdgnonuha()) {
            this.f10689wflxmlrfwp.draadjrbmk(10, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.esjtqupxsv
                @Override // y2.oxmwwwfdhm.iobyxmoadg
                public final void invoke(Object obj) {
                    mbcevpiqjq.a0((v2.esjtqupxsv.wkgbmnqykc) obj);
                }
            });
        }
        this.f10689wflxmlrfwp.btonecajqb();
        this.f10632btonecajqb.eablkybsjg(null);
        this.f10697yggfygwlhe.gxszxtbevo(this.f10657kcexrzcfyt);
        skhdrjzrfn skhdrjzrfnVar = this.f10662lrnfpwlwnk;
        if (skhdrjzrfnVar.f11048rgvfuqvkyq) {
            this.f10662lrnfpwlwnk = skhdrjzrfnVar.iobyxmoadg();
        }
        skhdrjzrfn skhdrjzrfnVarT0 = t0(this.f10662lrnfpwlwnk, 1);
        this.f10662lrnfpwlwnk = skhdrjzrfnVarT0;
        skhdrjzrfn skhdrjzrfnVarPpxfxbqfkf = skhdrjzrfnVarT0.ppxfxbqfkf(skhdrjzrfnVarT0.f11053zoijcleaow);
        this.f10662lrnfpwlwnk = skhdrjzrfnVarPpxfxbqfkf;
        skhdrjzrfnVarPpxfxbqfkf.f11049vdvldrhtss = skhdrjzrfnVarPpxfxbqfkf.f11042kcexrzcfyt;
        this.f10662lrnfpwlwnk.f11046oxmwwwfdhm = 0L;
        this.f10657kcexrzcfyt.release();
        B0();
        Surface surface = this.f10636crxdokpmqz;
        if (surface != null) {
            surface.release();
            this.f10636crxdokpmqz = null;
        }
        if (this.f10668oipsdeybqn) {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(y2.iobyxmoadg.eablkybsjg(null));
            throw null;
        }
        this.f10696yfnezrywwk = x2.zoijcleaow.f121001ppxfxbqfkf;
        this.f10631bfopjjpdmp = true;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setImageOutput(ImageOutput imageOutput) {
        Q0();
        C0(4, 15, imageOutput);
    }

    @Override // v2.esjtqupxsv
    public int sopmlzcsov() {
        Q0();
        return this.f10698ylkuphrtab;
    }

    @Override // v2.esjtqupxsv
    public long stevsuqkhv() {
        Q0();
        return K(this.f10662lrnfpwlwnk);
    }

    @Override // v2.esjtqupxsv
    public int tzroggbefp() {
        Q0();
        return this.f10662lrnfpwlwnk.f11038eablkybsjg;
    }

    @Override // v2.esjtqupxsv
    public void ulzqkzuiru(SurfaceView surfaceView) {
        Q0();
        C(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // v2.esjtqupxsv
    public x2.zoijcleaow vdvldrhtss() {
        Q0();
        return this.f10696yfnezrywwk;
    }

    @Override // v2.esjtqupxsv
    public void wflxmlrfwp(boolean z13) {
        Q0();
        M0(z13, 1);
    }

    @Override // v2.esjtqupxsv
    public long wkgbmnqykc() {
        Q0();
        return y2.stevsuqkhv.t(this.f10662lrnfpwlwnk.f11046oxmwwwfdhm);
    }

    @Override // v2.esjtqupxsv
    public long wwaezpbzkn() {
        Q0();
        return this.f10635cqumvgiudr;
    }

    @Override // v2.esjtqupxsv
    public long wypolnanlu() {
        Q0();
        return this.f10650iwizpuwonk;
    }

    public void x(g3.zoijcleaow zoijcleaowVar) {
        this.f10657kcexrzcfyt.zfvoamnweg((g3.zoijcleaow) y2.iobyxmoadg.eablkybsjg(zoijcleaowVar));
    }

    public void y(ExoPlayer.iobyxmoadg iobyxmoadgVar) {
        this.f10630agtfadlqog.add(iobyxmoadgVar);
    }

    @Override // v2.esjtqupxsv
    public void yadqdtsiqt(final v2.lmojexxdyd lmojexxdydVar) {
        Q0();
        if (!this.f10640dxjokdxxww.nufgyqmvbu() || lmojexxdydVar.equals(this.f10640dxjokdxxww.ppxfxbqfkf())) {
            return;
        }
        this.f10640dxjokdxxww.wflxmlrfwp(lmojexxdydVar);
        this.f10689wflxmlrfwp.draadjrbmk(19, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: androidx.media3.exoplayer.hcddaimhww
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((v2.esjtqupxsv.wkgbmnqykc) obj).wwaezpbzkn(lmojexxdydVar);
            }
        });
    }

    @Override // v2.lqeggnwhkg
    protected void yfnezrywwk(int i13, long j13, int i14, boolean z13) {
        Q0();
        if (i13 == -1) {
            return;
        }
        y2.iobyxmoadg.iobyxmoadg(i13 >= 0);
        v2.cdpycssgdh cdpycssgdhVar = this.f10662lrnfpwlwnk.f11041iobyxmoadg;
        if (cdpycssgdhVar.vdvldrhtss() || i13 < cdpycssgdhVar.rgvfuqvkyq()) {
            this.f10657kcexrzcfyt.lmojexxdyd();
            this.f10645hcddaimhww++;
            if (ppxfxbqfkf()) {
                y2.kcexrzcfyt.nufgyqmvbu("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                rlfsiqarku.eablkybsjg eablkybsjgVar = new rlfsiqarku.eablkybsjg(this.f10662lrnfpwlwnk);
                eablkybsjgVar.zoijcleaow(1);
                this.f10643gtknphoqwx.iobyxmoadg(eablkybsjgVar);
                return;
            }
            skhdrjzrfn skhdrjzrfnVarT0 = this.f10662lrnfpwlwnk;
            int i15 = skhdrjzrfnVarT0.f11038eablkybsjg;
            if (i15 == 3 || (i15 == 4 && !cdpycssgdhVar.vdvldrhtss())) {
                skhdrjzrfnVarT0 = t0(this.f10662lrnfpwlwnk, 2);
            }
            int iMbcevpiqjq = mbcevpiqjq();
            skhdrjzrfn skhdrjzrfnVarU0 = u0(skhdrjzrfnVarT0, cdpycssgdhVar, v0(cdpycssgdhVar, i13, j13));
            this.f10638draadjrbmk.eslsurpljm(cdpycssgdhVar, i13, y2.stevsuqkhv.ixidwrxhsl(j13));
            N0(skhdrjzrfnVarU0, 0, true, 1, L(skhdrjzrfnVarU0), iMbcevpiqjq, z13);
        }
    }

    @Override // v2.esjtqupxsv
    public int yggfygwlhe() {
        Q0();
        return this.f10662lrnfpwlwnk.f11034agtfadlqog;
    }

    @Override // v2.esjtqupxsv
    public void zoijcleaow() {
        Q0();
        skhdrjzrfn skhdrjzrfnVar = this.f10662lrnfpwlwnk;
        if (skhdrjzrfnVar.f11038eablkybsjg != 1) {
            return;
        }
        skhdrjzrfn skhdrjzrfnVarGxszxtbevo = skhdrjzrfnVar.gxszxtbevo(null);
        skhdrjzrfn skhdrjzrfnVarT0 = t0(skhdrjzrfnVarGxszxtbevo, skhdrjzrfnVarGxszxtbevo.f11041iobyxmoadg.vdvldrhtss() ? 4 : 2);
        this.f10645hcddaimhww++;
        this.f10638draadjrbmk.dvvnrvtcbc();
        N0(skhdrjzrfnVarT0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // v2.esjtqupxsv
    public void zynmafqrjb(v2.esjtqupxsv.wkgbmnqykc wkgbmnqykcVar) {
        this.f10689wflxmlrfwp.ppxfxbqfkf((v2.esjtqupxsv.wkgbmnqykc) y2.iobyxmoadg.eablkybsjg(wkgbmnqykcVar));
    }
}
