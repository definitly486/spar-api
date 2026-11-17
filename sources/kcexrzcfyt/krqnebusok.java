package kcexrzcfyt;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
final class krqnebusok implements iyctptxqzt {

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private static List f54845rgvfuqvkyq = new ArrayList();

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private static int f54846vdvldrhtss = 0;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private androidx.camera.core.impl.jyumaefscl f54850dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final opjhrmiecq f54851eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final istkbnxepw.yfnezrywwk f54854iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private androidx.camera.core.impl.jyumaefscl f54855lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private ribwqtqdhb f54856nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private int f54857ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final Executor f54858ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ScheduledExecutorService f54860wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tzroggbefp f54861zoijcleaow;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private List f54853gxszxtbevo = new ArrayList();

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private volatile List f54852gtknphoqwx = null;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private esjtqupxsv.btonecajqb f54859wflxmlrfwp = new esjtqupxsv.btonecajqb.iobyxmoadg().ppxfxbqfkf();

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private esjtqupxsv.btonecajqb f54847agtfadlqog = new esjtqupxsv.btonecajqb.iobyxmoadg().ppxfxbqfkf();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private ppxfxbqfkf f54848btonecajqb = ppxfxbqfkf.UNINITIALIZED;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final wkgbmnqykc f54849draadjrbmk = new wkgbmnqykc();

    class iobyxmoadg implements iozdgvuglv.ppxfxbqfkf {
        iobyxmoadg() {
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r13) {
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        public void onFailure(Throwable th2) {
            lereixgezr.sopmlzcsov.wkgbmnqykc("ProcessingCaptureSession", "open session failed ", th2);
            krqnebusok.this.close();
            krqnebusok.this.eablkybsjg(false);
        }
    }

    private enum ppxfxbqfkf {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        DE_INITIALIZED
    }

    private static class wkgbmnqykc implements istkbnxepw.yfnezrywwk.iobyxmoadg {
        wkgbmnqykc() {
        }

        @Override // istkbnxepw.yfnezrywwk.iobyxmoadg
        public void eablkybsjg(int i13) {
        }

        @Override // istkbnxepw.yfnezrywwk.iobyxmoadg
        public void iobyxmoadg(int i13) {
        }

        @Override // istkbnxepw.yfnezrywwk.iobyxmoadg
        public void onCaptureSequenceAborted(int i13) {
        }

        @Override // istkbnxepw.yfnezrywwk.iobyxmoadg
        public void ppxfxbqfkf(int i13, long j13) {
        }

        @Override // istkbnxepw.yfnezrywwk.iobyxmoadg
        public void wkgbmnqykc(long j13, int i13, istkbnxepw.ojitshcjhn ojitshcjhnVar) {
        }

        @Override // istkbnxepw.yfnezrywwk.iobyxmoadg
        public void zoijcleaow(int i13) {
        }
    }

    private static class zoijcleaow implements istkbnxepw.yfnezrywwk.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private List f54869iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private istkbnxepw.ojitshcjhn f54870ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f54871zoijcleaow;

        /* synthetic */ zoijcleaow(int i13, List list, iobyxmoadg iobyxmoadgVar) {
            this(i13, list);
        }

        @Override // istkbnxepw.yfnezrywwk.iobyxmoadg
        public void iobyxmoadg(int i13) {
            istkbnxepw.ojitshcjhn iobyxmoadgVar = this.f54870ppxfxbqfkf;
            if (iobyxmoadgVar == null) {
                iobyxmoadgVar = new istkbnxepw.ojitshcjhn.iobyxmoadg();
            }
            Iterator it = this.f54869iobyxmoadg.iterator();
            while (it.hasNext()) {
                ((istkbnxepw.nufgyqmvbu) it.next()).zoijcleaow(this.f54871zoijcleaow, iobyxmoadgVar);
            }
        }

        @Override // istkbnxepw.yfnezrywwk.iobyxmoadg
        public void onCaptureProcessProgressed(int i13) {
            Iterator it = this.f54869iobyxmoadg.iterator();
            while (it.hasNext()) {
                ((istkbnxepw.nufgyqmvbu) it.next()).wkgbmnqykc(this.f54871zoijcleaow, i13);
            }
        }

        @Override // istkbnxepw.yfnezrywwk.iobyxmoadg
        public void ppxfxbqfkf(int i13, long j13) {
            Iterator it = this.f54869iobyxmoadg.iterator();
            while (it.hasNext()) {
                ((istkbnxepw.nufgyqmvbu) it.next()).eablkybsjg(this.f54871zoijcleaow);
            }
        }

        @Override // istkbnxepw.yfnezrywwk.iobyxmoadg
        public void wkgbmnqykc(long j13, int i13, istkbnxepw.ojitshcjhn ojitshcjhnVar) {
            this.f54870ppxfxbqfkf = ojitshcjhnVar;
        }

        @Override // istkbnxepw.yfnezrywwk.iobyxmoadg
        public void zoijcleaow(int i13) {
            Iterator it = this.f54869iobyxmoadg.iterator();
            while (it.hasNext()) {
                ((istkbnxepw.nufgyqmvbu) it.next()).ppxfxbqfkf(this.f54871zoijcleaow, new istkbnxepw.btonecajqb(istkbnxepw.btonecajqb.iobyxmoadg.ERROR));
            }
        }

        private zoijcleaow(int i13, List list) {
            this.f54870ppxfxbqfkf = null;
            this.f54871zoijcleaow = i13;
            this.f54869iobyxmoadg = list;
        }
    }

    krqnebusok(istkbnxepw.yfnezrywwk yfnezrywwkVar, tzroggbefp tzroggbefpVar, yggfygwlhe.lqeggnwhkg lqeggnwhkgVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f54857ojitshcjhn = 0;
        this.f54851eablkybsjg = new opjhrmiecq(lqeggnwhkgVar);
        this.f54854iobyxmoadg = yfnezrywwkVar;
        this.f54861zoijcleaow = tzroggbefpVar;
        this.f54858ppxfxbqfkf = executor;
        this.f54860wkgbmnqykc = scheduledExecutorService;
        int i13 = f54846vdvldrhtss;
        f54846vdvldrhtss = i13 + 1;
        this.f54857ojitshcjhn = i13;
        lereixgezr.sopmlzcsov.iobyxmoadg("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f54857ojitshcjhn + ")");
    }

    private void cdpycssgdh(esjtqupxsv.btonecajqb btonecajqbVar, esjtqupxsv.btonecajqb btonecajqbVar2) {
        oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg c1637iobyxmoadg = new oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg();
        c1637iobyxmoadg.ppxfxbqfkf(btonecajqbVar);
        c1637iobyxmoadg.ppxfxbqfkf(btonecajqbVar2);
        this.f54854iobyxmoadg.setParameters(c1637iobyxmoadg.zoijcleaow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cqumvgiudr(DeferrableSurface deferrableSurface) {
        androidx.camera.core.impl.gtknphoqwx.ppxfxbqfkf(this.f54853gxszxtbevo);
        if (deferrableSurface != null) {
            deferrableSurface.eablkybsjg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void esjtqupxsv(DeferrableSurface deferrableSurface) {
        f54845rgvfuqvkyq.remove(deferrableSurface);
    }

    private static boolean kcexrzcfyt(DeferrableSurface deferrableSurface) {
        return Objects.equals(deferrableSurface.lqeggnwhkg(), lereixgezr.cllcsxoeiz.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.google.common.util.concurrent.wkgbmnqykc lereixgezr(androidx.camera.core.impl.jyumaefscl jyumaefsclVar, CameraDevice cameraDevice, e.iobyxmoadg iobyxmoadgVar, List list) {
        istkbnxepw.jlmebxxoox jlmebxxooxVarIobyxmoadg;
        lereixgezr.sopmlzcsov.iobyxmoadg("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + this.f54857ojitshcjhn + ")");
        if (this.f54848btonecajqb == ppxfxbqfkf.DE_INITIALIZED) {
            return iozdgvuglv.gtknphoqwx.btonecajqb(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        final DeferrableSurface deferrableSurfaceGxszxtbevo = null;
        if (list.contains(null)) {
            return iozdgvuglv.gtknphoqwx.btonecajqb(new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) jyumaefsclVar.ojitshcjhn().get(list.indexOf(null))));
        }
        istkbnxepw.jlmebxxoox jlmebxxooxVarIobyxmoadg2 = null;
        istkbnxepw.jlmebxxoox jlmebxxooxVarIobyxmoadg3 = null;
        istkbnxepw.jlmebxxoox jlmebxxooxVarIobyxmoadg4 = null;
        for (int i13 = 0; i13 < jyumaefsclVar.ojitshcjhn().size(); i13++) {
            DeferrableSurface deferrableSurface = (DeferrableSurface) jyumaefsclVar.ojitshcjhn().get(i13);
            if (zdlpuopuiu(deferrableSurface) || yggfygwlhe(deferrableSurface)) {
                jlmebxxooxVarIobyxmoadg2 = istkbnxepw.jlmebxxoox.iobyxmoadg((Surface) deferrableSurface.btonecajqb().get(), deferrableSurface.nufgyqmvbu(), deferrableSurface.dxjokdxxww());
            } else if (kcexrzcfyt(deferrableSurface)) {
                jlmebxxooxVarIobyxmoadg3 = istkbnxepw.jlmebxxoox.iobyxmoadg((Surface) deferrableSurface.btonecajqb().get(), deferrableSurface.nufgyqmvbu(), deferrableSurface.dxjokdxxww());
            } else if (oxmwwwfdhm(deferrableSurface)) {
                jlmebxxooxVarIobyxmoadg4 = istkbnxepw.jlmebxxoox.iobyxmoadg((Surface) deferrableSurface.btonecajqb().get(), deferrableSurface.nufgyqmvbu(), deferrableSurface.dxjokdxxww());
            }
        }
        if (jyumaefsclVar.dxjokdxxww() != null) {
            deferrableSurfaceGxszxtbevo = jyumaefsclVar.dxjokdxxww().gxszxtbevo();
            jlmebxxooxVarIobyxmoadg = istkbnxepw.jlmebxxoox.iobyxmoadg((Surface) deferrableSurfaceGxszxtbevo.btonecajqb().get(), deferrableSurfaceGxszxtbevo.nufgyqmvbu(), deferrableSurfaceGxszxtbevo.dxjokdxxww());
        } else {
            jlmebxxooxVarIobyxmoadg = null;
        }
        this.f54848btonecajqb = ppxfxbqfkf.SESSION_INITIALIZED;
        try {
            ArrayList arrayList = new ArrayList(this.f54853gxszxtbevo);
            if (deferrableSurfaceGxszxtbevo != null) {
                arrayList.add(deferrableSurfaceGxszxtbevo);
            }
            androidx.camera.core.impl.gtknphoqwx.wkgbmnqykc(arrayList);
            lereixgezr.sopmlzcsov.draadjrbmk("ProcessingCaptureSession", "== initSession (id=" + this.f54857ojitshcjhn + ")");
            try {
                androidx.camera.core.impl.jyumaefscl jyumaefsclVarInitSession = this.f54854iobyxmoadg.initSession(this.f54861zoijcleaow, istkbnxepw.ribwqtqdhb.iobyxmoadg(jlmebxxooxVarIobyxmoadg2, jlmebxxooxVarIobyxmoadg3, jlmebxxooxVarIobyxmoadg4, jlmebxxooxVarIobyxmoadg));
                this.f54850dxjokdxxww = jyumaefsclVarInitSession;
                ((DeferrableSurface) jyumaefsclVarInitSession.ojitshcjhn().get(0)).gtknphoqwx().iobyxmoadg(new Runnable() { // from class: kcexrzcfyt.fmlbqenlif
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f54689zdlpuopuiu.cqumvgiudr(deferrableSurfaceGxszxtbevo);
                    }
                }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
                for (final DeferrableSurface deferrableSurface2 : this.f54850dxjokdxxww.ojitshcjhn()) {
                    f54845rgvfuqvkyq.add(deferrableSurface2);
                    deferrableSurface2.gtknphoqwx().iobyxmoadg(new Runnable() { // from class: kcexrzcfyt.ezmngbhpjk
                        @Override // java.lang.Runnable
                        public final void run() {
                            krqnebusok.esjtqupxsv(deferrableSurface2);
                        }
                    }, this.f54858ppxfxbqfkf);
                }
                androidx.camera.core.impl.jyumaefscl.nufgyqmvbu nufgyqmvbuVar = new androidx.camera.core.impl.jyumaefscl.nufgyqmvbu();
                nufgyqmvbuVar.zoijcleaow(jyumaefsclVar);
                nufgyqmvbuVar.wkgbmnqykc();
                nufgyqmvbuVar.zoijcleaow(this.f54850dxjokdxxww);
                u1.nufgyqmvbu.zoijcleaow(nufgyqmvbuVar.gxszxtbevo(), "Cannot transform the SessionConfig");
                com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarZoijcleaow = this.f54851eablkybsjg.zoijcleaow(nufgyqmvbuVar.ppxfxbqfkf(), (CameraDevice) u1.nufgyqmvbu.gxszxtbevo(cameraDevice), iobyxmoadgVar);
                iozdgvuglv.gtknphoqwx.lqeggnwhkg(wkgbmnqykcVarZoijcleaow, new iobyxmoadg(), this.f54858ppxfxbqfkf);
                return wkgbmnqykcVarZoijcleaow;
            } catch (Throwable th2) {
                lereixgezr.sopmlzcsov.wkgbmnqykc("ProcessingCaptureSession", "initSession failed", th2);
                androidx.camera.core.impl.gtknphoqwx.ppxfxbqfkf(this.f54853gxszxtbevo);
                if (deferrableSurfaceGxszxtbevo != null) {
                    deferrableSurfaceGxszxtbevo.eablkybsjg();
                }
                throw th2;
            }
        } catch (DeferrableSurface.SurfaceClosedException e13) {
            return iozdgvuglv.gtknphoqwx.btonecajqb(e13);
        }
    }

    private static void ojitshcjhn(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.dxjokdxxww dxjokdxxwwVar = (androidx.camera.core.impl.dxjokdxxww) it.next();
            Iterator it2 = dxjokdxxwwVar.ppxfxbqfkf().iterator();
            while (it2.hasNext()) {
                ((istkbnxepw.nufgyqmvbu) it2.next()).iobyxmoadg(dxjokdxxwwVar.gxszxtbevo());
            }
        }
    }

    private static boolean oxmwwwfdhm(DeferrableSurface deferrableSurface) {
        return Objects.equals(deferrableSurface.lqeggnwhkg(), androidx.camera.core.gxszxtbevo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void pmvmpeiblj(Void r13) {
        istkbnxepw(this.f54851eablkybsjg);
        return null;
    }

    private static List rgvfuqvkyq(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DeferrableSurface deferrableSurface = (DeferrableSurface) it.next();
            u1.nufgyqmvbu.zoijcleaow(deferrableSurface instanceof istkbnxepw.ydmasvzmpa, "Surface must be SessionProcessorSurface");
            arrayList.add((istkbnxepw.ydmasvzmpa) deferrableSurface);
        }
        return arrayList;
    }

    private static boolean vdvldrhtss(androidx.camera.core.impl.dxjokdxxww dxjokdxxwwVar) {
        for (DeferrableSurface deferrableSurface : dxjokdxxwwVar.dxjokdxxww()) {
            if (zdlpuopuiu(deferrableSurface) || yggfygwlhe(deferrableSurface)) {
                return true;
            }
        }
        return false;
    }

    private static boolean yggfygwlhe(DeferrableSurface deferrableSurface) {
        return Objects.equals(deferrableSurface.lqeggnwhkg(), wypolnanlu.nufgyqmvbu.class);
    }

    private static boolean zdlpuopuiu(DeferrableSurface deferrableSurface) {
        return Objects.equals(deferrableSurface.lqeggnwhkg(), lereixgezr.metgxyhuhe.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zynmafqrjb() {
        lereixgezr.sopmlzcsov.iobyxmoadg("ProcessingCaptureSession", "== deInitSession (id=" + this.f54857ojitshcjhn + ")");
        this.f54854iobyxmoadg.deInitSession();
    }

    @Override // kcexrzcfyt.iyctptxqzt
    public void close() {
        lereixgezr.sopmlzcsov.iobyxmoadg("ProcessingCaptureSession", "close (id=" + this.f54857ojitshcjhn + ") state=" + this.f54848btonecajqb);
        if (this.f54848btonecajqb == ppxfxbqfkf.ON_CAPTURE_SESSION_STARTED) {
            lereixgezr.sopmlzcsov.iobyxmoadg("ProcessingCaptureSession", "== onCaptureSessionEnd (id = " + this.f54857ojitshcjhn + ")");
            this.f54854iobyxmoadg.onCaptureSessionEnd();
            ribwqtqdhb ribwqtqdhbVar = this.f54856nufgyqmvbu;
            if (ribwqtqdhbVar != null) {
                ribwqtqdhbVar.gxszxtbevo();
            }
            this.f54848btonecajqb = ppxfxbqfkf.ON_CAPTURE_SESSION_ENDED;
        }
        this.f54851eablkybsjg.close();
    }

    @Override // kcexrzcfyt.iyctptxqzt
    public void dxjokdxxww(Map map) {
    }

    @Override // kcexrzcfyt.iyctptxqzt
    public com.google.common.util.concurrent.wkgbmnqykc eablkybsjg(boolean z13) {
        lereixgezr.sopmlzcsov.iobyxmoadg("ProcessingCaptureSession", "release (id=" + this.f54857ojitshcjhn + ") mProcessorState=" + this.f54848btonecajqb);
        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarEablkybsjg = this.f54851eablkybsjg.eablkybsjg(z13);
        int iOrdinal = this.f54848btonecajqb.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            wkgbmnqykcVarEablkybsjg.iobyxmoadg(new Runnable() { // from class: kcexrzcfyt.rhgxfdycjh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f54966zdlpuopuiu.zynmafqrjb();
                }
            }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
        }
        this.f54848btonecajqb = ppxfxbqfkf.DE_INITIALIZED;
        return wkgbmnqykcVarEablkybsjg;
    }

    @Override // kcexrzcfyt.iyctptxqzt
    public List gxszxtbevo() {
        return this.f54852gtknphoqwx != null ? this.f54852gtknphoqwx : Collections.emptyList();
    }

    @Override // kcexrzcfyt.iyctptxqzt
    public void iobyxmoadg(List list) {
        if (list.isEmpty()) {
            return;
        }
        lereixgezr.sopmlzcsov.iobyxmoadg("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f54857ojitshcjhn + ") + state =" + this.f54848btonecajqb);
        int iOrdinal = this.f54848btonecajqb.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (this.f54852gtknphoqwx == null) {
                this.f54852gtknphoqwx = list;
                return;
            } else {
                ojitshcjhn(list);
                lereixgezr.sopmlzcsov.iobyxmoadg("ProcessingCaptureSession", "cancel the request because are pending un-submitted request");
                return;
            }
        }
        if (iOrdinal == 2) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                androidx.camera.core.impl.dxjokdxxww dxjokdxxwwVar = (androidx.camera.core.impl.dxjokdxxww) it.next();
                if (dxjokdxxwwVar.gtknphoqwx() == 2) {
                    jyumaefscl(dxjokdxxwwVar);
                } else {
                    iwizpuwonk(dxjokdxxwwVar);
                }
            }
            return;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            lereixgezr.sopmlzcsov.iobyxmoadg("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f54848btonecajqb);
            ojitshcjhn(list);
        }
    }

    void istkbnxepw(opjhrmiecq opjhrmiecqVar) {
        if (this.f54848btonecajqb != ppxfxbqfkf.SESSION_INITIALIZED) {
            return;
        }
        this.f54856nufgyqmvbu = new ribwqtqdhb(opjhrmiecqVar, rgvfuqvkyq(this.f54850dxjokdxxww.ojitshcjhn()));
        lereixgezr.sopmlzcsov.iobyxmoadg("ProcessingCaptureSession", "== onCaptureSessinStarted (id = " + this.f54857ojitshcjhn + ")");
        this.f54854iobyxmoadg.onCaptureSessionStart(this.f54856nufgyqmvbu);
        this.f54848btonecajqb = ppxfxbqfkf.ON_CAPTURE_SESSION_STARTED;
        androidx.camera.core.impl.jyumaefscl jyumaefsclVar = this.f54855lqeggnwhkg;
        if (jyumaefsclVar != null) {
            nufgyqmvbu(jyumaefsclVar);
        }
        if (this.f54852gtknphoqwx != null) {
            iobyxmoadg(this.f54852gtknphoqwx);
            this.f54852gtknphoqwx = null;
        }
    }

    void iwizpuwonk(androidx.camera.core.impl.dxjokdxxww dxjokdxxwwVar) {
        lereixgezr.sopmlzcsov.iobyxmoadg("ProcessingCaptureSession", "issueTriggerRequest");
        esjtqupxsv.btonecajqb btonecajqbVarPpxfxbqfkf = esjtqupxsv.btonecajqb.iobyxmoadg.eablkybsjg(dxjokdxxwwVar.lqeggnwhkg()).ppxfxbqfkf();
        Iterator it = btonecajqbVarPpxfxbqfkf.eablkybsjg().iterator();
        while (it.hasNext()) {
            CaptureRequest.Key key = (CaptureRequest.Key) ((androidx.camera.core.impl.btonecajqb.iobyxmoadg) it.next()).wkgbmnqykc();
            if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                this.f54854iobyxmoadg.startTrigger(btonecajqbVarPpxfxbqfkf, dxjokdxxwwVar.btonecajqb(), new zoijcleaow(dxjokdxxwwVar.gxszxtbevo(), dxjokdxxwwVar.ppxfxbqfkf(), null));
                return;
            }
        }
        ojitshcjhn(Arrays.asList(dxjokdxxwwVar));
    }

    void jyumaefscl(androidx.camera.core.impl.dxjokdxxww dxjokdxxwwVar) {
        esjtqupxsv.btonecajqb.iobyxmoadg iobyxmoadgVarEablkybsjg = esjtqupxsv.btonecajqb.iobyxmoadg.eablkybsjg(dxjokdxxwwVar.lqeggnwhkg());
        androidx.camera.core.impl.btonecajqb btonecajqbVarLqeggnwhkg = dxjokdxxwwVar.lqeggnwhkg();
        androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar = androidx.camera.core.impl.dxjokdxxww.f3755dxjokdxxww;
        if (btonecajqbVarLqeggnwhkg.zoijcleaow(iobyxmoadgVar)) {
            iobyxmoadgVarEablkybsjg.lqeggnwhkg(CaptureRequest.JPEG_ORIENTATION, (Integer) dxjokdxxwwVar.lqeggnwhkg().iobyxmoadg(iobyxmoadgVar));
        }
        androidx.camera.core.impl.btonecajqb btonecajqbVarLqeggnwhkg2 = dxjokdxxwwVar.lqeggnwhkg();
        androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar2 = androidx.camera.core.impl.dxjokdxxww.f3754btonecajqb;
        if (btonecajqbVarLqeggnwhkg2.zoijcleaow(iobyxmoadgVar2)) {
            iobyxmoadgVarEablkybsjg.lqeggnwhkg(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) dxjokdxxwwVar.lqeggnwhkg().iobyxmoadg(iobyxmoadgVar2)).byteValue()));
        }
        esjtqupxsv.btonecajqb btonecajqbVarPpxfxbqfkf = iobyxmoadgVarEablkybsjg.ppxfxbqfkf();
        this.f54847agtfadlqog = btonecajqbVarPpxfxbqfkf;
        cdpycssgdh(this.f54859wflxmlrfwp, btonecajqbVarPpxfxbqfkf);
        this.f54854iobyxmoadg.startCapture(dxjokdxxwwVar.wflxmlrfwp(), dxjokdxxwwVar.btonecajqb(), new zoijcleaow(dxjokdxxwwVar.gxszxtbevo(), dxjokdxxwwVar.ppxfxbqfkf(), null));
    }

    @Override // kcexrzcfyt.iyctptxqzt
    public androidx.camera.core.impl.jyumaefscl lqeggnwhkg() {
        return this.f54855lqeggnwhkg;
    }

    @Override // kcexrzcfyt.iyctptxqzt
    public void nufgyqmvbu(androidx.camera.core.impl.jyumaefscl jyumaefsclVar) {
        lereixgezr.sopmlzcsov.iobyxmoadg("ProcessingCaptureSession", "setSessionConfig (id=" + this.f54857ojitshcjhn + ")");
        this.f54855lqeggnwhkg = jyumaefsclVar;
        if (jyumaefsclVar == null) {
            return;
        }
        ribwqtqdhb ribwqtqdhbVar = this.f54856nufgyqmvbu;
        if (ribwqtqdhbVar != null) {
            ribwqtqdhbVar.btonecajqb(jyumaefsclVar);
        }
        if (this.f54848btonecajqb == ppxfxbqfkf.ON_CAPTURE_SESSION_STARTED) {
            esjtqupxsv.btonecajqb btonecajqbVarPpxfxbqfkf = esjtqupxsv.btonecajqb.iobyxmoadg.eablkybsjg(jyumaefsclVar.gxszxtbevo()).ppxfxbqfkf();
            this.f54859wflxmlrfwp = btonecajqbVarPpxfxbqfkf;
            cdpycssgdh(btonecajqbVarPpxfxbqfkf, this.f54847agtfadlqog);
            if (vdvldrhtss(jyumaefsclVar.gtknphoqwx())) {
                this.f54854iobyxmoadg.startRepeating(jyumaefsclVar.gtknphoqwx().btonecajqb(), this.f54849draadjrbmk);
            } else {
                this.f54854iobyxmoadg.stopRepeating();
            }
        }
    }

    @Override // kcexrzcfyt.iyctptxqzt
    public boolean ppxfxbqfkf() {
        return this.f54851eablkybsjg.ppxfxbqfkf();
    }

    @Override // kcexrzcfyt.iyctptxqzt
    public void wkgbmnqykc() {
        lereixgezr.sopmlzcsov.iobyxmoadg("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f54857ojitshcjhn + ")");
        if (this.f54852gtknphoqwx != null) {
            for (androidx.camera.core.impl.dxjokdxxww dxjokdxxwwVar : this.f54852gtknphoqwx) {
                Iterator it = dxjokdxxwwVar.ppxfxbqfkf().iterator();
                while (it.hasNext()) {
                    ((istkbnxepw.nufgyqmvbu) it.next()).iobyxmoadg(dxjokdxxwwVar.gxszxtbevo());
                }
            }
            this.f54852gtknphoqwx = null;
        }
    }

    @Override // kcexrzcfyt.iyctptxqzt
    public com.google.common.util.concurrent.wkgbmnqykc zoijcleaow(final androidx.camera.core.impl.jyumaefscl jyumaefsclVar, final CameraDevice cameraDevice, final e.iobyxmoadg iobyxmoadgVar) {
        u1.nufgyqmvbu.zoijcleaow(this.f54848btonecajqb == ppxfxbqfkf.UNINITIALIZED, "Invalid state state:" + this.f54848btonecajqb);
        u1.nufgyqmvbu.zoijcleaow(jyumaefsclVar.ojitshcjhn().isEmpty() ^ true, "SessionConfig contains no surfaces");
        lereixgezr.sopmlzcsov.iobyxmoadg("ProcessingCaptureSession", "open (id=" + this.f54857ojitshcjhn + ")");
        List listOjitshcjhn = jyumaefsclVar.ojitshcjhn();
        this.f54853gxszxtbevo = listOjitshcjhn;
        return iozdgvuglv.wkgbmnqykc.zoijcleaow(androidx.camera.core.impl.gtknphoqwx.lqeggnwhkg(listOjitshcjhn, false, DeviceOrientationRequest.OUTPUT_PERIOD_FAST, this.f54858ppxfxbqfkf, this.f54860wkgbmnqykc)).gxszxtbevo(new iozdgvuglv.iobyxmoadg() { // from class: kcexrzcfyt.yzdjzghtvl
            @Override // iozdgvuglv.iobyxmoadg
            public final com.google.common.util.concurrent.wkgbmnqykc apply(Object obj) {
                return this.f55075iobyxmoadg.lereixgezr(jyumaefsclVar, cameraDevice, iobyxmoadgVar, (List) obj);
            }
        }, this.f54858ppxfxbqfkf).eablkybsjg(new ojitshcjhn.iobyxmoadg() { // from class: kcexrzcfyt.eslsurpljm
            @Override // ojitshcjhn.iobyxmoadg
            public final Object apply(Object obj) {
                return this.f54681iobyxmoadg.pmvmpeiblj((Void) obj);
            }
        }, this.f54858ppxfxbqfkf);
    }
}
