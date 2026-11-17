package kcexrzcfyt;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
class o extends k {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final AtomicBoolean f54896iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final iwizpuwonk.zdlpuopuiu f54897jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final iwizpuwonk.dxjokdxxww f54898kcexrzcfyt;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final ScheduledExecutorService f54899ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    com.google.common.util.concurrent.wkgbmnqykc f54900oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final Object f54901rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private List f54902vdvldrhtss;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final iwizpuwonk.oxmwwwfdhm f54903yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final iwizpuwonk.nufgyqmvbu f54904zdlpuopuiu;

    o(istkbnxepw.jztzpxfvev jztzpxfvevVar, istkbnxepw.jztzpxfvev jztzpxfvevVar2, zeieaojujs zeieaojujsVar, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(zeieaojujsVar, executor, scheduledExecutorService, handler);
        this.f54901rgvfuqvkyq = new Object();
        this.f54896iwizpuwonk = new AtomicBoolean(false);
        this.f54898kcexrzcfyt = new iwizpuwonk.dxjokdxxww(jztzpxfvevVar, jztzpxfvevVar2);
        this.f54903yggfygwlhe = new iwizpuwonk.oxmwwwfdhm(jztzpxfvevVar.iobyxmoadg(CaptureSessionStuckQuirk.class) || jztzpxfvevVar.iobyxmoadg(IncorrectCaptureStateQuirk.class));
        this.f54904zdlpuopuiu = new iwizpuwonk.nufgyqmvbu(jztzpxfvevVar2);
        this.f54897jyumaefscl = new iwizpuwonk.zdlpuopuiu(jztzpxfvevVar2);
        this.f54899ojitshcjhn = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cdpycssgdh() {
        cllcsxoeiz("Session call super.close()");
        super.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void dsvhmnatus(e eVar) {
        super.oxmwwwfdhm(eVar);
    }

    private void hkdspvbjdz() {
        Iterator it = this.f54839zoijcleaow.wkgbmnqykc().iterator();
        while (it.hasNext()) {
            ((e) it.next()).close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.google.common.util.concurrent.wkgbmnqykc wypolnanlu(CameraDevice cameraDevice, yggfygwlhe.vdvldrhtss vdvldrhtssVar, List list, List list2) {
        if (this.f54897jyumaefscl.iobyxmoadg()) {
            hkdspvbjdz();
        }
        cllcsxoeiz("start openCaptureSession");
        return super.ppxfxbqfkf(cameraDevice, vdvldrhtssVar, list);
    }

    @Override // kcexrzcfyt.k, kcexrzcfyt.e
    public int btonecajqb(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.btonecajqb(list, this.f54903yggfygwlhe.wkgbmnqykc(captureCallback));
    }

    void cllcsxoeiz(String str) {
        lereixgezr.sopmlzcsov.iobyxmoadg("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    @Override // kcexrzcfyt.k, kcexrzcfyt.e
    public void close() {
        if (!this.f54896iwizpuwonk.compareAndSet(false, true)) {
            cllcsxoeiz("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f54897jyumaefscl.iobyxmoadg()) {
            try {
                cllcsxoeiz("Call abortCaptures() before closing session.");
                zoijcleaow();
            } catch (Exception e13) {
                cllcsxoeiz("Exception when calling abortCaptures()" + e13);
            }
        }
        cllcsxoeiz("Session call close()");
        this.f54903yggfygwlhe.eablkybsjg().iobyxmoadg(new Runnable() { // from class: kcexrzcfyt.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f54882zdlpuopuiu.cdpycssgdh();
            }
        }, iobyxmoadg());
    }

    @Override // kcexrzcfyt.k, kcexrzcfyt.e.iobyxmoadg
    public com.google.common.util.concurrent.wkgbmnqykc dxjokdxxww(List list, long j13) {
        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarDxjokdxxww;
        synchronized (this.f54901rgvfuqvkyq) {
            this.f54902vdvldrhtss = list;
            wkgbmnqykcVarDxjokdxxww = super.dxjokdxxww(list, j13);
        }
        return wkgbmnqykcVarDxjokdxxww;
    }

    @Override // kcexrzcfyt.k, kcexrzcfyt.e
    public void eablkybsjg() {
        super.eablkybsjg();
        this.f54903yggfygwlhe.dxjokdxxww();
    }

    @Override // kcexrzcfyt.k, kcexrzcfyt.e
    public void gxszxtbevo(int i13) {
        super.gxszxtbevo(i13);
        if (i13 == 5) {
            synchronized (this.f54901rgvfuqvkyq) {
                try {
                    if (istkbnxepw() && this.f54902vdvldrhtss != null) {
                        cllcsxoeiz("Close DeferrableSurfaces for CameraDevice error.");
                        Iterator it = this.f54902vdvldrhtss.iterator();
                        while (it.hasNext()) {
                            ((DeferrableSurface) it.next()).wkgbmnqykc();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // kcexrzcfyt.k, kcexrzcfyt.e
    public int nufgyqmvbu(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.nufgyqmvbu(captureRequest, this.f54903yggfygwlhe.wkgbmnqykc(captureCallback));
    }

    @Override // kcexrzcfyt.k, kcexrzcfyt.e.ppxfxbqfkf
    public void oxmwwwfdhm(e eVar) {
        cllcsxoeiz("Session onConfigured()");
        this.f54904zdlpuopuiu.ppxfxbqfkf(eVar, this.f54839zoijcleaow.eablkybsjg(), this.f54839zoijcleaow.wkgbmnqykc(), new iwizpuwonk.nufgyqmvbu.iobyxmoadg() { // from class: kcexrzcfyt.l
            @Override // iwizpuwonk.nufgyqmvbu.iobyxmoadg
            public final void iobyxmoadg(e eVar2) {
                this.f54872iobyxmoadg.dsvhmnatus(eVar2);
            }
        });
    }

    @Override // kcexrzcfyt.k, kcexrzcfyt.e.iobyxmoadg
    public com.google.common.util.concurrent.wkgbmnqykc ppxfxbqfkf(final CameraDevice cameraDevice, final yggfygwlhe.vdvldrhtss vdvldrhtssVar, final List list) {
        com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarZdlpuopuiu;
        synchronized (this.f54901rgvfuqvkyq) {
            try {
                List listWkgbmnqykc = this.f54839zoijcleaow.wkgbmnqykc();
                ArrayList arrayList = new ArrayList();
                Iterator it = listWkgbmnqykc.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e) it.next()).wflxmlrfwp());
                }
                com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarCqumvgiudr = iozdgvuglv.gtknphoqwx.cqumvgiudr(arrayList);
                this.f54900oxmwwwfdhm = wkgbmnqykcVarCqumvgiudr;
                wkgbmnqykcVarZdlpuopuiu = iozdgvuglv.gtknphoqwx.zdlpuopuiu(iozdgvuglv.wkgbmnqykc.zoijcleaow(wkgbmnqykcVarCqumvgiudr).gxszxtbevo(new iozdgvuglv.iobyxmoadg() { // from class: kcexrzcfyt.n
                    @Override // iozdgvuglv.iobyxmoadg
                    public final com.google.common.util.concurrent.wkgbmnqykc apply(Object obj) {
                        return this.f54885iobyxmoadg.wypolnanlu(cameraDevice, vdvldrhtssVar, list, (List) obj);
                    }
                }, iobyxmoadg()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wkgbmnqykcVarZdlpuopuiu;
    }

    @Override // kcexrzcfyt.k, kcexrzcfyt.e.ppxfxbqfkf
    public void rgvfuqvkyq(e eVar) {
        synchronized (this.f54901rgvfuqvkyq) {
            this.f54898kcexrzcfyt.iobyxmoadg(this.f54902vdvldrhtss);
        }
        cllcsxoeiz("onClosed()");
        super.rgvfuqvkyq(eVar);
    }

    @Override // kcexrzcfyt.k, kcexrzcfyt.e.iobyxmoadg
    public boolean stop() {
        boolean zStop;
        synchronized (this.f54901rgvfuqvkyq) {
            try {
                if (istkbnxepw()) {
                    this.f54898kcexrzcfyt.iobyxmoadg(this.f54902vdvldrhtss);
                } else {
                    com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar = this.f54900oxmwwwfdhm;
                    if (wkgbmnqykcVar != null) {
                        wkgbmnqykcVar.cancel(true);
                    }
                }
                zStop = super.stop();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zStop;
    }

    @Override // kcexrzcfyt.e
    public com.google.common.util.concurrent.wkgbmnqykc wflxmlrfwp() {
        return iozdgvuglv.gtknphoqwx.kcexrzcfyt(1500L, this.f54899ojitshcjhn, this.f54903yggfygwlhe.eablkybsjg());
    }
}
