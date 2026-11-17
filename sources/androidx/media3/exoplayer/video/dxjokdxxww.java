package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.appcompat.app.yggfygwlhe;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.wizcaqwiak;
import com.google.common.collect.zdlpuopuiu;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import v2.hcddaimhww;
import v2.ylkuphrtab;
import v2.zynmafqrjb;
import xa.oxmwwwfdhm;
import xa.vdvldrhtss;
import y2.lmojexxdyd;
import y2.ojitshcjhn;
import y2.pkzmftpjix;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww implements hcddaimhww {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final Executor f11478esjtqupxsv = new Executor() { // from class: r3.wkgbmnqykc
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            androidx.media3.exoplayer.video.dxjokdxxww.lmojexxdyd(runnable);
        }
    };

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private long f11479agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final CopyOnWriteArraySet f11480btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f11481cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private androidx.media3.common.iobyxmoadg f11482draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final y2.dxjokdxxww f11483dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f11484eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final boolean f11485gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ylkuphrtab f11486gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f11487iobyxmoadg;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f11488iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private long f11489jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private long f11490kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final VideoSink f11491lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final VideoSink.zoijcleaow f11492nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private Pair f11493ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private wizcaqwiak.iobyxmoadg f11494oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zynmafqrjb.iobyxmoadg f11495ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f11496rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private int f11497vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private ojitshcjhn f11498wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final SparseArray f11499wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f11500yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private long f11501zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pkzmftpjix f11502zoijcleaow;

    /* JADX INFO: Access modifiers changed from: private */
    static final class eablkybsjg implements v2.pkzmftpjix.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static final vdvldrhtss f11503iobyxmoadg = oxmwwwfdhm.iobyxmoadg(new vdvldrhtss() { // from class: androidx.media3.exoplayer.video.btonecajqb
            @Override // xa.vdvldrhtss
            public final Object get() {
                return dxjokdxxww.eablkybsjg.zoijcleaow();
            }
        });

        private eablkybsjg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ v2.pkzmftpjix.iobyxmoadg zoijcleaow() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (v2.pkzmftpjix.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null));
            } catch (Exception e13) {
                throw new IllegalStateException(e13);
            }
        }

        /* synthetic */ eablkybsjg(iobyxmoadg iobyxmoadgVar) {
            this();
        }
    }

    private static final class gxszxtbevo implements zynmafqrjb.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final v2.pkzmftpjix.iobyxmoadg f11504iobyxmoadg;

        public gxszxtbevo(v2.pkzmftpjix.iobyxmoadg iobyxmoadgVar) {
            this.f11504iobyxmoadg = iobyxmoadgVar;
        }

        @Override // v2.zynmafqrjb.iobyxmoadg
        public boolean iobyxmoadg() {
            return false;
        }

        @Override // v2.zynmafqrjb.iobyxmoadg
        public zynmafqrjb zoijcleaow(Context context, v2.dxjokdxxww dxjokdxxwwVar, v2.draadjrbmk draadjrbmkVar, hcddaimhww hcddaimhwwVar, Executor executor, ylkuphrtab ylkuphrtabVar, List list, long j13) throws VideoFrameProcessingException {
            try {
                try {
                    ((zynmafqrjb.iobyxmoadg) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(v2.pkzmftpjix.iobyxmoadg.class).newInstance(this.f11504iobyxmoadg)).zoijcleaow(context, dxjokdxxwwVar, draadjrbmkVar, hcddaimhwwVar, executor, ylkuphrtabVar, list, j13);
                    return null;
                } catch (Exception e13) {
                    e = e13;
                    throw VideoFrameProcessingException.iobyxmoadg(e);
                }
            } catch (Exception e14) {
                e = e14;
            }
        }
    }

    class iobyxmoadg implements VideoSink.zoijcleaow {
        iobyxmoadg() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.zoijcleaow
        public void iobyxmoadg(long j13) {
            dxjokdxxww.iwizpuwonk(dxjokdxxww.this);
            yggfygwlhe.iobyxmoadg(y2.iobyxmoadg.dxjokdxxww(null));
            throw null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.zoijcleaow
        public void zoijcleaow() {
            dxjokdxxww.iwizpuwonk(dxjokdxxww.this);
            yggfygwlhe.iobyxmoadg(y2.iobyxmoadg.dxjokdxxww(null));
            throw null;
        }
    }

    private final class ppxfxbqfkf implements VideoSink, wkgbmnqykc {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private boolean f11506btonecajqb;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f11508eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private long f11510gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f11511iobyxmoadg;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private androidx.media3.common.iobyxmoadg f11515wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f11516zoijcleaow;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private zdlpuopuiu f11514ppxfxbqfkf = zdlpuopuiu.zynmafqrjb();

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private long f11512lqeggnwhkg = -9223372036854775807L;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private VideoSink.iobyxmoadg f11513nufgyqmvbu = VideoSink.iobyxmoadg.f11466iobyxmoadg;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private Executor f11507dxjokdxxww = dxjokdxxww.f11478esjtqupxsv;

        public ppxfxbqfkf(Context context, int i13) {
            this.f11516zoijcleaow = i13;
            this.f11511iobyxmoadg = stevsuqkhv.jhduphickx(context);
        }

        private void esjtqupxsv(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
            iobyxmoadgVar.zoijcleaow().mbcevpiqjq(dxjokdxxww.pmvmpeiblj(iobyxmoadgVar.f9760istkbnxepw)).cllcsxoeiz();
            yggfygwlhe.iobyxmoadg(y2.iobyxmoadg.dxjokdxxww(null));
            throw null;
        }

        private void lereixgezr(List list) {
            if (dxjokdxxww.this.f11495ppxfxbqfkf.iobyxmoadg()) {
                this.f11514ppxfxbqfkf = zdlpuopuiu.jyumaefscl(list);
            } else {
                this.f11514ppxfxbqfkf = new zdlpuopuiu.iobyxmoadg().btonecajqb(list).btonecajqb(dxjokdxxww.this.f11484eablkybsjg).gtknphoqwx();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void agtfadlqog(Surface surface, lmojexxdyd lmojexxdydVar) {
            dxjokdxxww.this.hkdspvbjdz(surface, lmojexxdydVar);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void btonecajqb(long j13, long j14) {
            dxjokdxxww.this.hcddaimhww(j13, j14);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void cqumvgiudr(VideoSink.iobyxmoadg iobyxmoadgVar, Executor executor) {
            this.f11513nufgyqmvbu = iobyxmoadgVar;
            this.f11507dxjokdxxww = executor;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean draadjrbmk(androidx.media3.common.iobyxmoadg iobyxmoadgVar) throws VideoSink.VideoSinkException {
            y2.iobyxmoadg.lqeggnwhkg(!isInitialized());
            dxjokdxxww.eablkybsjg(dxjokdxxww.this, iobyxmoadgVar, this.f11516zoijcleaow);
            return false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void dxjokdxxww(List list) {
            if (this.f11514ppxfxbqfkf.equals(list)) {
                return;
            }
            lereixgezr(list);
            androidx.media3.common.iobyxmoadg iobyxmoadgVar = this.f11515wkgbmnqykc;
            if (iobyxmoadgVar != null) {
                esjtqupxsv(iobyxmoadgVar);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void eablkybsjg(long j13, long j14) {
            pkzmftpjix pkzmftpjixVar = dxjokdxxww.this.f11502zoijcleaow;
            long j15 = this.f11512lqeggnwhkg;
            pkzmftpjixVar.iobyxmoadg(j15 == -9223372036854775807L ? 0L : j15 + 1, Long.valueOf(j13));
            this.f11510gxszxtbevo = j14;
            dxjokdxxww.this.jpowsppfya(j14);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean gtknphoqwx(boolean z13) {
            return dxjokdxxww.this.yadqdtsiqt(z13 && isInitialized());
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void gxszxtbevo() {
            dxjokdxxww.this.f11491lqeggnwhkg.gxszxtbevo();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean iobyxmoadg(long j13, boolean z13, VideoSink.zoijcleaow zoijcleaowVar) {
            y2.iobyxmoadg.lqeggnwhkg(isInitialized());
            if (!dxjokdxxww.this.stevsuqkhv()) {
                return false;
            }
            yggfygwlhe.iobyxmoadg(y2.iobyxmoadg.dxjokdxxww(null));
            throw null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isInitialized() {
            return false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void iwizpuwonk(boolean z13) {
            dxjokdxxww.this.f11491lqeggnwhkg.iwizpuwonk(z13);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void jyumaefscl(boolean z13) {
            if (isInitialized()) {
                throw null;
            }
            this.f11512lqeggnwhkg = -9223372036854775807L;
            dxjokdxxww.this.lereixgezr(z13);
            this.f11506btonecajqb = false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void kcexrzcfyt(int i13) {
            dxjokdxxww.this.f11491lqeggnwhkg.kcexrzcfyt(i13);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void lqeggnwhkg(wizcaqwiak.iobyxmoadg iobyxmoadgVar) {
            dxjokdxxww.this.f11494oxmwwwfdhm = iobyxmoadgVar;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void nufgyqmvbu() {
            dxjokdxxww.this.f11491lqeggnwhkg.nufgyqmvbu();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public Surface ojitshcjhn() {
            y2.iobyxmoadg.lqeggnwhkg(isInitialized());
            yggfygwlhe.iobyxmoadg(y2.iobyxmoadg.dxjokdxxww(null));
            throw null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void oxmwwwfdhm() {
            dxjokdxxww.this.f11491lqeggnwhkg.oxmwwwfdhm();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void ppxfxbqfkf() {
            dxjokdxxww.this.f11501zdlpuopuiu = this.f11512lqeggnwhkg;
            if (dxjokdxxww.this.f11490kcexrzcfyt >= dxjokdxxww.this.f11501zdlpuopuiu) {
                dxjokdxxww.this.f11491lqeggnwhkg.ppxfxbqfkf();
                dxjokdxxww.this.f11500yggfygwlhe = true;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void release() {
            dxjokdxxww.this.pkzmftpjix();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void rgvfuqvkyq() {
            dxjokdxxww.this.f11491lqeggnwhkg.rgvfuqvkyq();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void vdvldrhtss(int i13, androidx.media3.common.iobyxmoadg iobyxmoadgVar, List list) {
            y2.iobyxmoadg.lqeggnwhkg(isInitialized());
            if (i13 != 1 && i13 != 2) {
                throw new UnsupportedOperationException("Unsupported input type " + i13);
            }
            lereixgezr(list);
            this.f11508eablkybsjg = i13;
            this.f11515wkgbmnqykc = iobyxmoadgVar;
            dxjokdxxww.this.f11501zdlpuopuiu = -9223372036854775807L;
            dxjokdxxww.this.f11500yggfygwlhe = false;
            esjtqupxsv(iobyxmoadgVar);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void wflxmlrfwp(boolean z13) {
            dxjokdxxww.this.f11491lqeggnwhkg.wflxmlrfwp(z13);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean wkgbmnqykc() {
            return isInitialized() && dxjokdxxww.this.istkbnxepw();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void yggfygwlhe() {
            dxjokdxxww.this.esjtqupxsv();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void zdlpuopuiu(float f13) {
            dxjokdxxww.this.cllcsxoeiz(f13);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void zoijcleaow(r3.lqeggnwhkg lqeggnwhkgVar) {
            dxjokdxxww.this.wypolnanlu(lqeggnwhkgVar);
        }
    }

    public interface wkgbmnqykc {
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private boolean f11517dxjokdxxww;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f11520iobyxmoadg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private boolean f11522nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private v2.pkzmftpjix.iobyxmoadg f11523ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private zynmafqrjb.iobyxmoadg f11524wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final gtknphoqwx f11525zoijcleaow;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private List f11518eablkybsjg = zdlpuopuiu.zynmafqrjb();

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private ylkuphrtab f11519gxszxtbevo = ylkuphrtab.f115812iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private y2.dxjokdxxww f11521lqeggnwhkg = y2.dxjokdxxww.f123544iobyxmoadg;

        public zoijcleaow(Context context, gtknphoqwx gtknphoqwxVar) {
            this.f11520iobyxmoadg = context.getApplicationContext();
            this.f11525zoijcleaow = gtknphoqwxVar;
        }

        public zoijcleaow dxjokdxxww(y2.dxjokdxxww dxjokdxxwwVar) {
            this.f11521lqeggnwhkg = dxjokdxxwwVar;
            return this;
        }

        public dxjokdxxww nufgyqmvbu() {
            y2.iobyxmoadg.lqeggnwhkg(!this.f11517dxjokdxxww);
            iobyxmoadg iobyxmoadgVar = null;
            if (this.f11524wkgbmnqykc == null) {
                if (this.f11523ppxfxbqfkf == null) {
                    this.f11523ppxfxbqfkf = new eablkybsjg(iobyxmoadgVar);
                }
                this.f11524wkgbmnqykc = new gxszxtbevo(this.f11523ppxfxbqfkf);
            }
            dxjokdxxww dxjokdxxwwVar = new dxjokdxxww(this, iobyxmoadgVar);
            this.f11517dxjokdxxww = true;
            return dxjokdxxwwVar;
        }
    }

    /* synthetic */ dxjokdxxww(zoijcleaow zoijcleaowVar, iobyxmoadg iobyxmoadgVar) {
        this(zoijcleaowVar);
    }

    private boolean cdpycssgdh() {
        return this.f11497vdvldrhtss == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cllcsxoeiz(float f13) {
        this.f11491lqeggnwhkg.zdlpuopuiu(f13);
    }

    static /* synthetic */ v2.pkzmftpjix eablkybsjg(dxjokdxxww dxjokdxxwwVar, androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i13) throws VideoSink.VideoSinkException {
        dxjokdxxwwVar.ylkuphrtab(iobyxmoadgVar, i13);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hcddaimhww(long j13, long j14) {
        this.f11491lqeggnwhkg.btonecajqb(j13, j14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void iozdgvuglv() {
        this.f11496rgvfuqvkyq--;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean istkbnxepw() {
        return this.f11496rgvfuqvkyq == 0 && this.f11500yggfygwlhe && this.f11491lqeggnwhkg.wkgbmnqykc();
    }

    static /* synthetic */ zynmafqrjb iwizpuwonk(dxjokdxxww dxjokdxxwwVar) {
        dxjokdxxwwVar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpowsppfya(long j13) {
        this.f11489jyumaefscl = j13;
        this.f11491lqeggnwhkg.eablkybsjg(this.f11479agtfadlqog, j13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lereixgezr(boolean z13) {
        if (cdpycssgdh()) {
            this.f11496rgvfuqvkyq++;
            this.f11491lqeggnwhkg.jyumaefscl(z13);
            while (this.f11502zoijcleaow.draadjrbmk() > 1) {
                this.f11502zoijcleaow.dxjokdxxww();
            }
            if (this.f11502zoijcleaow.draadjrbmk() == 1) {
                this.f11491lqeggnwhkg.eablkybsjg(((Long) y2.iobyxmoadg.eablkybsjg((Long) this.f11502zoijcleaow.dxjokdxxww())).longValue(), this.f11489jyumaefscl);
            }
            this.f11490kcexrzcfyt = -9223372036854775807L;
            this.f11501zdlpuopuiu = -9223372036854775807L;
            this.f11500yggfygwlhe = false;
            ((ojitshcjhn) y2.iobyxmoadg.dxjokdxxww(this.f11498wflxmlrfwp)).lqeggnwhkg(new Runnable() { // from class: r3.ppxfxbqfkf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81563zdlpuopuiu.iozdgvuglv();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lmojexxdyd(Runnable runnable) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v2.dxjokdxxww pmvmpeiblj(v2.dxjokdxxww dxjokdxxwwVar) {
        return (dxjokdxxwwVar == null || !dxjokdxxwwVar.lqeggnwhkg()) ? v2.dxjokdxxww.f115319nufgyqmvbu : dxjokdxxwwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean stevsuqkhv() {
        int i13 = this.f11488iwizpuwonk;
        return i13 != -1 && i13 == this.f11481cqumvgiudr;
    }

    private void wwaezpbzkn(Surface surface, int i13, int i14) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wypolnanlu(r3.lqeggnwhkg lqeggnwhkgVar) {
        this.f11491lqeggnwhkg.zoijcleaow(lqeggnwhkgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean yadqdtsiqt(boolean z13) {
        return this.f11491lqeggnwhkg.gtknphoqwx(z13 && this.f11496rgvfuqvkyq == 0);
    }

    private v2.pkzmftpjix ylkuphrtab(androidx.media3.common.iobyxmoadg iobyxmoadgVar, int i13) throws VideoSink.VideoSinkException {
        if (i13 != 0) {
            if (!cdpycssgdh()) {
                return null;
            }
            try {
                yggfygwlhe.iobyxmoadg(y2.iobyxmoadg.eablkybsjg(null));
                throw null;
            } catch (VideoFrameProcessingException e13) {
                throw new VideoSink.VideoSinkException(e13, iobyxmoadgVar);
            }
        }
        y2.iobyxmoadg.lqeggnwhkg(this.f11497vdvldrhtss == 0);
        v2.dxjokdxxww dxjokdxxwwVarPmvmpeiblj = pmvmpeiblj(iobyxmoadgVar.f9760istkbnxepw);
        if (this.f11485gtknphoqwx) {
            dxjokdxxwwVarPmvmpeiblj = v2.dxjokdxxww.f115319nufgyqmvbu;
        } else if (dxjokdxxwwVarPmvmpeiblj.f115326ppxfxbqfkf == 7 && stevsuqkhv.f123602iobyxmoadg < 34) {
            dxjokdxxwwVarPmvmpeiblj = dxjokdxxwwVarPmvmpeiblj.iobyxmoadg().eablkybsjg(6).iobyxmoadg();
        }
        v2.dxjokdxxww dxjokdxxwwVar = dxjokdxxwwVarPmvmpeiblj;
        final ojitshcjhn ojitshcjhnVarIobyxmoadg = this.f11483dxjokdxxww.iobyxmoadg((Looper) y2.iobyxmoadg.dxjokdxxww(Looper.myLooper()), null);
        this.f11498wflxmlrfwp = ojitshcjhnVarIobyxmoadg;
        try {
            zynmafqrjb.iobyxmoadg iobyxmoadgVar2 = this.f11495ppxfxbqfkf;
            Context context = this.f11487iobyxmoadg;
            v2.draadjrbmk draadjrbmkVar = v2.draadjrbmk.f115313iobyxmoadg;
            Objects.requireNonNull(ojitshcjhnVarIobyxmoadg);
            iobyxmoadgVar2.zoijcleaow(context, dxjokdxxwwVar, draadjrbmkVar, this, new Executor() { // from class: r3.zoijcleaow
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    ojitshcjhnVarIobyxmoadg.lqeggnwhkg(runnable);
                }
            }, this.f11486gxszxtbevo, this.f11484eablkybsjg, 0L);
            throw null;
        } catch (VideoFrameProcessingException e14) {
            throw new VideoSink.VideoSinkException(e14, iobyxmoadgVar);
        }
    }

    public void cqumvgiudr(wkgbmnqykc wkgbmnqykcVar) {
        this.f11480btonecajqb.add(wkgbmnqykcVar);
    }

    public void dsvhmnatus(int i13) {
        this.f11488iwizpuwonk = i13;
    }

    public void esjtqupxsv() {
        lmojexxdyd lmojexxdydVar = lmojexxdyd.f123566ppxfxbqfkf;
        wwaezpbzkn(null, lmojexxdydVar.zoijcleaow(), lmojexxdydVar.iobyxmoadg());
        this.f11493ojitshcjhn = null;
    }

    public void hkdspvbjdz(Surface surface, lmojexxdyd lmojexxdydVar) {
        Pair pair = this.f11493ojitshcjhn;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((lmojexxdyd) this.f11493ojitshcjhn.second).equals(lmojexxdydVar)) {
            return;
        }
        this.f11493ojitshcjhn = Pair.create(surface, lmojexxdydVar);
        wwaezpbzkn(surface, lmojexxdydVar.zoijcleaow(), lmojexxdydVar.iobyxmoadg());
    }

    public void pkzmftpjix() {
        if (this.f11497vdvldrhtss == 2) {
            return;
        }
        ojitshcjhn ojitshcjhnVar = this.f11498wflxmlrfwp;
        if (ojitshcjhnVar != null) {
            ojitshcjhnVar.eablkybsjg(null);
        }
        this.f11493ojitshcjhn = null;
        this.f11497vdvldrhtss = 2;
    }

    public VideoSink zynmafqrjb(int i13) {
        y2.iobyxmoadg.lqeggnwhkg(!stevsuqkhv.vdvldrhtss(this.f11499wkgbmnqykc, i13));
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this.f11487iobyxmoadg, i13);
        cqumvgiudr(ppxfxbqfkfVar);
        this.f11499wkgbmnqykc.put(i13, ppxfxbqfkfVar);
        return ppxfxbqfkfVar;
    }

    private dxjokdxxww(zoijcleaow zoijcleaowVar) {
        this.f11487iobyxmoadg = zoijcleaowVar.f11520iobyxmoadg;
        this.f11502zoijcleaow = new pkzmftpjix();
        this.f11495ppxfxbqfkf = (zynmafqrjb.iobyxmoadg) y2.iobyxmoadg.dxjokdxxww(zoijcleaowVar.f11524wkgbmnqykc);
        this.f11499wkgbmnqykc = new SparseArray();
        this.f11484eablkybsjg = zoijcleaowVar.f11518eablkybsjg;
        this.f11486gxszxtbevo = zoijcleaowVar.f11519gxszxtbevo;
        y2.dxjokdxxww dxjokdxxwwVar = zoijcleaowVar.f11521lqeggnwhkg;
        this.f11483dxjokdxxww = dxjokdxxwwVar;
        this.f11491lqeggnwhkg = new androidx.media3.exoplayer.video.wkgbmnqykc(zoijcleaowVar.f11525zoijcleaow, dxjokdxxwwVar);
        this.f11492nufgyqmvbu = new iobyxmoadg();
        this.f11480btonecajqb = new CopyOnWriteArraySet();
        this.f11485gtknphoqwx = zoijcleaowVar.f11522nufgyqmvbu;
        this.f11482draadjrbmk = new androidx.media3.common.iobyxmoadg.zoijcleaow().cllcsxoeiz();
        this.f11490kcexrzcfyt = -9223372036854775807L;
        this.f11501zdlpuopuiu = -9223372036854775807L;
        this.f11488iwizpuwonk = -1;
        this.f11497vdvldrhtss = 0;
    }
}
