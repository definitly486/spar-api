package kcexrzcfyt;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class zdlpuopuiu implements CameraControlInternal {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final ulzqkzuiru f55079agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final u f55080btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f55081cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    z f55082draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final x f55083dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final zdlpuopuiu.pmvmpeiblj f55084eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private long f55085esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final uawqvzlxes f55086gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final CameraControlInternal.zoijcleaow f55087gxszxtbevo;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private volatile com.google.common.util.concurrent.wkgbmnqykc f55088iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final AtomicLong f55089jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private volatile int f55090kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final iobyxmoadg f55091lereixgezr;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final androidx.camera.core.impl.jyumaefscl.zoijcleaow f55092lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final ageimvtcrz f55093nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final w f55094ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private volatile boolean f55095oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final Executor f55096ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f55097rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private lereixgezr.cllcsxoeiz.gxszxtbevo f55098vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final esjtqupxsv.lqeggnwhkg f55099wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Object f55100wkgbmnqykc = new Object();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final iwizpuwonk.zoijcleaow f55101yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final iwizpuwonk.iobyxmoadg f55102zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final zoijcleaow f55103zoijcleaow;

    static final class iobyxmoadg extends istkbnxepw.nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        Set f55104iobyxmoadg = new HashSet();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        Map f55105zoijcleaow = new ArrayMap();

        iobyxmoadg() {
        }

        void dxjokdxxww(Executor executor, istkbnxepw.nufgyqmvbu nufgyqmvbuVar) {
            this.f55104iobyxmoadg.add(nufgyqmvbuVar);
            this.f55105zoijcleaow.put(nufgyqmvbuVar, executor);
        }

        @Override // istkbnxepw.nufgyqmvbu
        public void iobyxmoadg(final int i13) {
            for (final istkbnxepw.nufgyqmvbu nufgyqmvbuVar : this.f55104iobyxmoadg) {
                try {
                    ((Executor) this.f55105zoijcleaow.get(nufgyqmvbuVar)).execute(new Runnable() { // from class: kcexrzcfyt.kcexrzcfyt
                        @Override // java.lang.Runnable
                        public final void run() {
                            nufgyqmvbuVar.iobyxmoadg(i13);
                        }
                    });
                } catch (RejectedExecutionException e13) {
                    lereixgezr.sopmlzcsov.wkgbmnqykc("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e13);
                }
            }
        }

        @Override // istkbnxepw.nufgyqmvbu
        public void ppxfxbqfkf(final int i13, final istkbnxepw.btonecajqb btonecajqbVar) {
            for (final istkbnxepw.nufgyqmvbu nufgyqmvbuVar : this.f55104iobyxmoadg) {
                try {
                    ((Executor) this.f55105zoijcleaow.get(nufgyqmvbuVar)).execute(new Runnable() { // from class: kcexrzcfyt.vdvldrhtss
                        @Override // java.lang.Runnable
                        public final void run() {
                            nufgyqmvbuVar.ppxfxbqfkf(i13, btonecajqbVar);
                        }
                    });
                } catch (RejectedExecutionException e13) {
                    lereixgezr.sopmlzcsov.wkgbmnqykc("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e13);
                }
            }
        }

        void wflxmlrfwp(istkbnxepw.nufgyqmvbu nufgyqmvbuVar) {
            this.f55104iobyxmoadg.remove(nufgyqmvbuVar);
            this.f55105zoijcleaow.remove(nufgyqmvbuVar);
        }

        @Override // istkbnxepw.nufgyqmvbu
        public void zoijcleaow(final int i13, final istkbnxepw.ojitshcjhn ojitshcjhnVar) {
            for (final istkbnxepw.nufgyqmvbu nufgyqmvbuVar : this.f55104iobyxmoadg) {
                try {
                    ((Executor) this.f55105zoijcleaow.get(nufgyqmvbuVar)).execute(new Runnable() { // from class: kcexrzcfyt.oxmwwwfdhm
                        @Override // java.lang.Runnable
                        public final void run() {
                            nufgyqmvbuVar.zoijcleaow(i13, ojitshcjhnVar);
                        }
                    });
                } catch (RejectedExecutionException e13) {
                    lereixgezr.sopmlzcsov.wkgbmnqykc("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e13);
                }
            }
        }
    }

    public interface ppxfxbqfkf {
        boolean iobyxmoadg(TotalCaptureResult totalCaptureResult);
    }

    static final class zoijcleaow extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Set f55106iobyxmoadg = new HashSet();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Executor f55107zoijcleaow;

        zoijcleaow(Executor executor) {
            this.f55107zoijcleaow = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void ppxfxbqfkf(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (ppxfxbqfkf ppxfxbqfkfVar : this.f55106iobyxmoadg) {
                if (ppxfxbqfkfVar.iobyxmoadg(totalCaptureResult)) {
                    hashSet.add(ppxfxbqfkfVar);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            this.f55106iobyxmoadg.removeAll(hashSet);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f55107zoijcleaow.execute(new Runnable() { // from class: kcexrzcfyt.yggfygwlhe
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55072zdlpuopuiu.ppxfxbqfkf(totalCaptureResult);
                }
            });
        }

        void wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f55106iobyxmoadg.remove(ppxfxbqfkfVar);
        }

        void zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f55106iobyxmoadg.add(ppxfxbqfkfVar);
        }
    }

    zdlpuopuiu(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar, ScheduledExecutorService scheduledExecutorService, Executor executor, CameraControlInternal.zoijcleaow zoijcleaowVar, istkbnxepw.jztzpxfvev jztzpxfvevVar) {
        androidx.camera.core.impl.jyumaefscl.zoijcleaow zoijcleaowVar2 = new androidx.camera.core.impl.jyumaefscl.zoijcleaow();
        this.f55092lqeggnwhkg = zoijcleaowVar2;
        this.f55097rgvfuqvkyq = 0;
        this.f55095oxmwwwfdhm = false;
        this.f55090kcexrzcfyt = 2;
        this.f55089jyumaefscl = new AtomicLong(0L);
        this.f55088iwizpuwonk = iozdgvuglv.gtknphoqwx.draadjrbmk(null);
        this.f55081cqumvgiudr = 1;
        this.f55085esjtqupxsv = 0L;
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        this.f55091lereixgezr = iobyxmoadgVar;
        this.f55084eablkybsjg = pmvmpeibljVar;
        this.f55087gxszxtbevo = zoijcleaowVar;
        this.f55096ppxfxbqfkf = executor;
        this.f55094ojitshcjhn = new w(executor);
        zoijcleaow zoijcleaowVar3 = new zoijcleaow(executor);
        this.f55103zoijcleaow = zoijcleaowVar3;
        zoijcleaowVar2.esjtqupxsv(this.f55081cqumvgiudr);
        zoijcleaowVar2.gtknphoqwx(yfnezrywwk.gxszxtbevo(zoijcleaowVar3));
        zoijcleaowVar2.gtknphoqwx(iobyxmoadgVar);
        this.f55086gtknphoqwx = new uawqvzlxes(this, pmvmpeibljVar, executor);
        this.f55093nufgyqmvbu = new ageimvtcrz(this, scheduledExecutorService, executor, jztzpxfvevVar);
        this.f55083dxjokdxxww = new x(this, pmvmpeibljVar, executor);
        this.f55080btonecajqb = new u(this, pmvmpeibljVar, executor);
        this.f55082draadjrbmk = new d0(pmvmpeibljVar);
        this.f55102zdlpuopuiu = new iwizpuwonk.iobyxmoadg(jztzpxfvevVar);
        this.f55101yggfygwlhe = new iwizpuwonk.zoijcleaow(jztzpxfvevVar);
        this.f55099wflxmlrfwp = new esjtqupxsv.lqeggnwhkg(this, executor);
        this.f55079agtfadlqog = new ulzqkzuiru(this, pmvmpeibljVar, jztzpxfvevVar, executor, scheduledExecutorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cllcsxoeiz(Executor executor, istkbnxepw.nufgyqmvbu nufgyqmvbuVar) {
        this.f55091lereixgezr.dxjokdxxww(executor, nufgyqmvbuVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void dsvhmnatus() {
    }

    private static boolean hcddaimhww(int i13, int[] iArr) {
        for (int i14 : iArr) {
            if (i13 == i14) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void hkdspvbjdz() {
    }

    public static int istkbnxepw(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar, int i13) {
        int[] iArr = (int[]) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (hcddaimhww(i13, iArr)) {
            return i13;
        }
        return hcddaimhww(1, iArr) ? 1 : 0;
    }

    static boolean jpowsppfya(TotalCaptureResult totalCaptureResult, long j13) {
        Long l13;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof istkbnxepw.opjhrmiecq) && (l13 = (Long) ((istkbnxepw.opjhrmiecq) tag).wkgbmnqykc("CameraControlSessionUpdateId")) != null && l13.longValue() >= j13;
    }

    private com.google.common.util.concurrent.wkgbmnqykc jztzpxfvev(final long j13) {
        return androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: kcexrzcfyt.gtknphoqwx
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return this.f54692iobyxmoadg.mbcevpiqjq(j13, iobyxmoadgVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object kegysxyocb(final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        this.f55096ppxfxbqfkf.execute(new Runnable() { // from class: kcexrzcfyt.dxjokdxxww
            @Override // java.lang.Runnable
            public final void run() {
                this.f54668zdlpuopuiu.stevsuqkhv(iobyxmoadgVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object mbcevpiqjq(final long j13, final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        oxmwwwfdhm(new ppxfxbqfkf() { // from class: kcexrzcfyt.draadjrbmk
            @Override // kcexrzcfyt.zdlpuopuiu.ppxfxbqfkf
            public final boolean iobyxmoadg(TotalCaptureResult totalCaptureResult) {
                return zdlpuopuiu.tzroggbefp(j13, iobyxmoadgVar, totalCaptureResult);
            }
        });
        return "waitForSessionUpdateId:" + j13;
    }

    private boolean pkzmftpjix() {
        return lmojexxdyd() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void stevsuqkhv(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        iozdgvuglv.gtknphoqwx.yggfygwlhe(jztzpxfvev(okpsazkaxt()), iobyxmoadgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean tzroggbefp(long j13, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, TotalCaptureResult totalCaptureResult) {
        if (!jpowsppfya(totalCaptureResult, j13)) {
            return false;
        }
        iobyxmoadgVar.ppxfxbqfkf(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wypolnanlu(istkbnxepw.nufgyqmvbu nufgyqmvbuVar) {
        this.f55091lereixgezr.wflxmlrfwp(nufgyqmvbuVar);
    }

    private int yadqdtsiqt(int i13) {
        int[] iArr = (int[]) this.f55084eablkybsjg.iobyxmoadg(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (hcddaimhww(i13, iArr)) {
            return i13;
        }
        return hcddaimhww(1, iArr) ? 1 : 0;
    }

    int cdpycssgdh(int i13) {
        int[] iArr = (int[]) this.f55084eablkybsjg.iobyxmoadg(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (hcddaimhww(i13, iArr)) {
            return i13;
        }
        if (hcddaimhww(4, iArr)) {
            return 4;
        }
        return hcddaimhww(1, iArr) ? 1 : 0;
    }

    int cqumvgiudr() {
        Integer num = (Integer) this.f55084eablkybsjg.iobyxmoadg(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    void crxdokpmqz(boolean z13) {
        lereixgezr.sopmlzcsov.iobyxmoadg("Camera2CameraControlImp", "setActive: isActive = " + z13);
        this.f55093nufgyqmvbu.hcddaimhww(z13);
        this.f55083dxjokdxxww.lqeggnwhkg(z13);
        this.f55080btonecajqb.btonecajqb(z13);
        this.f55086gtknphoqwx.zoijcleaow(z13);
        this.f55099wflxmlrfwp.zdlpuopuiu(z13);
        if (z13) {
            return;
        }
        this.f55098vdvldrhtss = null;
        this.f55094ojitshcjhn.iobyxmoadg();
    }

    @Override // androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.wkgbmnqykc dxjokdxxww(lereixgezr.esjtqupxsv esjtqupxsvVar) {
        return !pkzmftpjix() ? iozdgvuglv.gtknphoqwx.btonecajqb(new CameraControl.OperationCanceledException("Camera is not active.")) : iozdgvuglv.gtknphoqwx.zdlpuopuiu(this.f55093nufgyqmvbu.dsvhmnatus(esjtqupxsvVar));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public androidx.camera.core.impl.btonecajqb eablkybsjg() {
        return this.f55099wflxmlrfwp.agtfadlqog();
    }

    int esjtqupxsv() {
        Integer num = (Integer) this.f55084eablkybsjg.iobyxmoadg(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void gxszxtbevo(lereixgezr.cllcsxoeiz.gxszxtbevo gxszxtbevoVar) {
        this.f55098vdvldrhtss = gxszxtbevoVar;
    }

    public com.google.common.util.concurrent.wkgbmnqykc ikoacuggdj() {
        return iozdgvuglv.gtknphoqwx.zdlpuopuiu(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: kcexrzcfyt.ojitshcjhn
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return this.f54908iobyxmoadg.kegysxyocb(iobyxmoadgVar);
            }
        }));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void iobyxmoadg(androidx.camera.core.impl.jyumaefscl.zoijcleaow zoijcleaowVar) {
        this.f55082draadjrbmk.iobyxmoadg(zoijcleaowVar);
    }

    public u iozdgvuglv() {
        return this.f55080btonecajqb;
    }

    int iwizpuwonk() {
        Integer num = (Integer) this.f55084eablkybsjg.iobyxmoadg(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    void jhduphickx(List list) {
        this.f55087gxszxtbevo.zoijcleaow(list);
    }

    public void jlmebxxoox(Rational rational) {
        this.f55093nufgyqmvbu.jpowsppfya(rational);
    }

    Rect jyumaefscl() {
        return this.f55083dxjokdxxww.ppxfxbqfkf();
    }

    void kcexrzcfyt(final Executor executor, final istkbnxepw.nufgyqmvbu nufgyqmvbuVar) {
        this.f55096ppxfxbqfkf.execute(new Runnable() { // from class: kcexrzcfyt.wflxmlrfwp
            @Override // java.lang.Runnable
            public final void run() {
                this.f55044zdlpuopuiu.cllcsxoeiz(executor, nufgyqmvbuVar);
            }
        });
    }

    public androidx.camera.core.impl.jyumaefscl lereixgezr() {
        this.f55092lqeggnwhkg.esjtqupxsv(this.f55081cqumvgiudr);
        this.f55092lqeggnwhkg.zdlpuopuiu(pmvmpeiblj());
        this.f55092lqeggnwhkg.ojitshcjhn("CameraControlSessionUpdateId", Long.valueOf(this.f55085esjtqupxsv));
        return this.f55092lqeggnwhkg.rgvfuqvkyq();
    }

    int lmojexxdyd() {
        int i13;
        synchronized (this.f55100wkgbmnqykc) {
            i13 = this.f55097rgvfuqvkyq;
        }
        return i13;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void lqeggnwhkg(androidx.camera.core.impl.btonecajqb btonecajqbVar) {
        this.f55099wflxmlrfwp.lqeggnwhkg(esjtqupxsv.btonecajqb.iobyxmoadg.eablkybsjg(btonecajqbVar).ppxfxbqfkf()).iobyxmoadg(new Runnable() { // from class: kcexrzcfyt.agtfadlqog
            @Override // java.lang.Runnable
            public final void run() {
                zdlpuopuiu.hkdspvbjdz();
            }
        }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
    }

    void ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f55103zoijcleaow.wkgbmnqykc(ppxfxbqfkfVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void nufgyqmvbu() {
        this.f55099wflxmlrfwp.btonecajqb().iobyxmoadg(new Runnable() { // from class: kcexrzcfyt.rgvfuqvkyq
            @Override // java.lang.Runnable
            public final void run() {
                zdlpuopuiu.dsvhmnatus();
            }
        }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
    }

    long okpsazkaxt() {
        this.f55085esjtqupxsv = this.f55089jyumaefscl.getAndIncrement();
        this.f55087gxszxtbevo.iobyxmoadg();
        return this.f55085esjtqupxsv;
    }

    void oxmwwwfdhm(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f55103zoijcleaow.zoijcleaow(ppxfxbqfkfVar);
    }

    androidx.camera.core.impl.btonecajqb pmvmpeiblj() {
        oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg c1637iobyxmoadg = new oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg();
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        androidx.camera.core.impl.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar = androidx.camera.core.impl.btonecajqb.ppxfxbqfkf.REQUIRED;
        c1637iobyxmoadg.lqeggnwhkg(key, 1, ppxfxbqfkfVar);
        this.f55093nufgyqmvbu.dxjokdxxww(c1637iobyxmoadg);
        this.f55102zdlpuopuiu.iobyxmoadg(c1637iobyxmoadg);
        this.f55083dxjokdxxww.iobyxmoadg(c1637iobyxmoadg);
        int iIobyxmoadg = this.f55093nufgyqmvbu.lereixgezr() ? 5 : 1;
        if (this.f55095oxmwwwfdhm) {
            c1637iobyxmoadg.lqeggnwhkg(CaptureRequest.FLASH_MODE, 2, ppxfxbqfkfVar);
        } else {
            int i13 = this.f55090kcexrzcfyt;
            if (i13 == 0) {
                iIobyxmoadg = this.f55101yggfygwlhe.iobyxmoadg(2);
            } else if (i13 == 1) {
                iIobyxmoadg = 3;
            } else if (i13 == 2) {
                iIobyxmoadg = 1;
            }
        }
        c1637iobyxmoadg.lqeggnwhkg(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(zynmafqrjb(iIobyxmoadg)), ppxfxbqfkfVar);
        c1637iobyxmoadg.lqeggnwhkg(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(yadqdtsiqt(1)), ppxfxbqfkfVar);
        this.f55086gtknphoqwx.ppxfxbqfkf(c1637iobyxmoadg);
        this.f55099wflxmlrfwp.dxjokdxxww(c1637iobyxmoadg);
        return c1637iobyxmoadg.zoijcleaow();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void ppxfxbqfkf(int i13) {
        if (!pkzmftpjix()) {
            lereixgezr.sopmlzcsov.draadjrbmk("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f55090kcexrzcfyt = i13;
        lereixgezr.sopmlzcsov.iobyxmoadg("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f55090kcexrzcfyt);
        z zVar = this.f55082draadjrbmk;
        boolean z13 = true;
        if (this.f55090kcexrzcfyt != 1 && this.f55090kcexrzcfyt != 0) {
            z13 = false;
        }
        zVar.zoijcleaow(z13);
        this.f55088iwizpuwonk = ikoacuggdj();
    }

    void ribwqtqdhb(int i13) {
        this.f55081cqumvgiudr = i13;
        this.f55093nufgyqmvbu.hkdspvbjdz(i13);
        this.f55079agtfadlqog.iobyxmoadg(this.f55081cqumvgiudr);
    }

    void sopmlzcsov() {
        ribwqtqdhb(1);
    }

    void ulzqkzuiru(final istkbnxepw.nufgyqmvbu nufgyqmvbuVar) {
        this.f55096ppxfxbqfkf.execute(new Runnable() { // from class: kcexrzcfyt.btonecajqb
            @Override // java.lang.Runnable
            public final void run() {
                this.f54613zdlpuopuiu.wypolnanlu(nufgyqmvbuVar);
            }
        });
    }

    public void vipkmwdibw(boolean z13) {
        this.f55082draadjrbmk.ppxfxbqfkf(z13);
    }

    @Override // androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykc(boolean z13) {
        return !pkzmftpjix() ? iozdgvuglv.gtknphoqwx.btonecajqb(new CameraControl.OperationCanceledException("Camera is not active.")) : iozdgvuglv.gtknphoqwx.zdlpuopuiu(this.f55080btonecajqb.wkgbmnqykc(z13));
    }

    public x wwaezpbzkn() {
        return this.f55083dxjokdxxww;
    }

    void yggfygwlhe(boolean z13) {
        this.f55095oxmwwwfdhm = z13;
        if (!z13) {
            androidx.camera.core.impl.dxjokdxxww.iobyxmoadg iobyxmoadgVar = new androidx.camera.core.impl.dxjokdxxww.iobyxmoadg();
            iobyxmoadgVar.kcexrzcfyt(this.f55081cqumvgiudr);
            iobyxmoadgVar.zdlpuopuiu(true);
            oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg c1637iobyxmoadg = new oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg();
            c1637iobyxmoadg.gxszxtbevo(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(zynmafqrjb(1)));
            c1637iobyxmoadg.gxszxtbevo(CaptureRequest.FLASH_MODE, 0);
            iobyxmoadgVar.eablkybsjg(c1637iobyxmoadg.zoijcleaow());
            jhduphickx(Collections.singletonList(iobyxmoadgVar.nufgyqmvbu()));
        }
        okpsazkaxt();
    }

    void ylkuphrtab() {
        synchronized (this.f55100wkgbmnqykc) {
            this.f55097rgvfuqvkyq++;
        }
    }

    void zdlpuopuiu() {
        synchronized (this.f55100wkgbmnqykc) {
            try {
                int i13 = this.f55097rgvfuqvkyq;
                if (i13 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f55097rgvfuqvkyq = i13 - 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public Rect zoijcleaow() {
        Rect rect = (Rect) this.f55084eablkybsjg.iobyxmoadg(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        return ("robolectric".equals(Build.FINGERPRINT) && rect == null) ? new Rect(0, 0, 4000, 3000) : (Rect) u1.nufgyqmvbu.gxszxtbevo(rect);
    }

    int zynmafqrjb(int i13) {
        return istkbnxepw(this.f55084eablkybsjg, i13);
    }
}
