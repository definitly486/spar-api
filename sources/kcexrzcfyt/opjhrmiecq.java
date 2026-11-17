package kcexrzcfyt;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
final class opjhrmiecq implements iyctptxqzt {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final iwizpuwonk.esjtqupxsv f54910agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    com.google.common.util.concurrent.wkgbmnqykc f54911btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private Map f54912draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    ppxfxbqfkf f54913dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    e f54914eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f54915gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    androidx.camera.core.impl.jyumaefscl f54916gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final Object f54917iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Map f54918lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    List f54919nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final iwizpuwonk.oxmwwwfdhm f54920ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wkgbmnqykc f54921ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final yggfygwlhe.lqeggnwhkg f54922rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final iwizpuwonk.cqumvgiudr f54923vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final iwizpuwonk.yggfygwlhe f54924wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    e.iobyxmoadg f54925wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f54926zoijcleaow;

    class iobyxmoadg implements iozdgvuglv.ppxfxbqfkf {
        iobyxmoadg() {
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r13) {
        }

        @Override // iozdgvuglv.ppxfxbqfkf
        public void onFailure(Throwable th2) {
            synchronized (opjhrmiecq.this.f54917iobyxmoadg) {
                try {
                    opjhrmiecq.this.f54925wkgbmnqykc.stop();
                    int iOrdinal = opjhrmiecq.this.f54913dxjokdxxww.ordinal();
                    if ((iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 6) && !(th2 instanceof CancellationException)) {
                        lereixgezr.sopmlzcsov.wflxmlrfwp("CaptureSession", "Opening session with fail " + opjhrmiecq.this.f54913dxjokdxxww, th2);
                        opjhrmiecq.this.vdvldrhtss();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    enum ppxfxbqfkf {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    final class wkgbmnqykc extends e.ppxfxbqfkf {
        wkgbmnqykc() {
        }

        @Override // kcexrzcfyt.e.ppxfxbqfkf
        public void kcexrzcfyt(e eVar) {
            synchronized (opjhrmiecq.this.f54917iobyxmoadg) {
                try {
                    if (opjhrmiecq.this.f54913dxjokdxxww.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + opjhrmiecq.this.f54913dxjokdxxww);
                    }
                    lereixgezr.sopmlzcsov.iobyxmoadg("CaptureSession", "CameraCaptureSession.onReady() " + opjhrmiecq.this.f54913dxjokdxxww);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // kcexrzcfyt.e.ppxfxbqfkf
        public void oxmwwwfdhm(e eVar) {
            synchronized (opjhrmiecq.this.f54917iobyxmoadg) {
                try {
                    switch (opjhrmiecq.this.f54913dxjokdxxww) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                        case RELEASED:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + opjhrmiecq.this.f54913dxjokdxxww);
                        case OPENING:
                            opjhrmiecq opjhrmiecqVar = opjhrmiecq.this;
                            opjhrmiecqVar.f54913dxjokdxxww = ppxfxbqfkf.OPENED;
                            opjhrmiecqVar.f54914eablkybsjg = eVar;
                            lereixgezr.sopmlzcsov.iobyxmoadg("CaptureSession", "Attempting to send capture request onConfigured");
                            opjhrmiecq opjhrmiecqVar2 = opjhrmiecq.this;
                            opjhrmiecqVar2.jyumaefscl(opjhrmiecqVar2.f54916gxszxtbevo);
                            opjhrmiecq.this.yggfygwlhe();
                            break;
                        case CLOSED:
                            opjhrmiecq.this.f54914eablkybsjg = eVar;
                            break;
                        case RELEASING:
                            eVar.close();
                            break;
                    }
                    lereixgezr.sopmlzcsov.iobyxmoadg("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + opjhrmiecq.this.f54913dxjokdxxww);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // kcexrzcfyt.e.ppxfxbqfkf
        public void vdvldrhtss(e eVar) {
            synchronized (opjhrmiecq.this.f54917iobyxmoadg) {
                try {
                    switch (opjhrmiecq.this.f54913dxjokdxxww) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + opjhrmiecq.this.f54913dxjokdxxww);
                        case OPENING:
                        case CLOSED:
                        case RELEASING:
                            opjhrmiecq.this.vdvldrhtss();
                            break;
                        case RELEASED:
                            lereixgezr.sopmlzcsov.iobyxmoadg("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                    }
                    lereixgezr.sopmlzcsov.ppxfxbqfkf("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + opjhrmiecq.this.f54913dxjokdxxww);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // kcexrzcfyt.e.ppxfxbqfkf
        public void zdlpuopuiu(e eVar) {
            synchronized (opjhrmiecq.this.f54917iobyxmoadg) {
                try {
                    if (opjhrmiecq.this.f54913dxjokdxxww == ppxfxbqfkf.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + opjhrmiecq.this.f54913dxjokdxxww);
                    }
                    lereixgezr.sopmlzcsov.iobyxmoadg("CaptureSession", "onSessionFinished()");
                    opjhrmiecq.this.vdvldrhtss();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    class zoijcleaow extends CameraCaptureSession.CaptureCallback {
        zoijcleaow() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            synchronized (opjhrmiecq.this.f54917iobyxmoadg) {
                try {
                    androidx.camera.core.impl.jyumaefscl jyumaefsclVar = opjhrmiecq.this.f54916gxszxtbevo;
                    if (jyumaefsclVar == null) {
                        return;
                    }
                    androidx.camera.core.impl.dxjokdxxww dxjokdxxwwVarGtknphoqwx = jyumaefsclVar.gtknphoqwx();
                    lereixgezr.sopmlzcsov.iobyxmoadg("CaptureSession", "Submit FLASH_MODE_OFF request");
                    opjhrmiecq opjhrmiecqVar = opjhrmiecq.this;
                    opjhrmiecqVar.iobyxmoadg(Collections.singletonList(opjhrmiecqVar.f54910agtfadlqog.iobyxmoadg(dxjokdxxwwVarGtknphoqwx)));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    opjhrmiecq(yggfygwlhe.lqeggnwhkg lqeggnwhkgVar) {
        this(lqeggnwhkgVar, new istkbnxepw.jztzpxfvev(Collections.emptyList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cqumvgiudr() {
        synchronized (this.f54917iobyxmoadg) {
            if (this.f54926zoijcleaow.isEmpty()) {
                return;
            }
            try {
                zdlpuopuiu(this.f54926zoijcleaow);
                this.f54926zoijcleaow.clear();
            } catch (Throwable th2) {
                this.f54926zoijcleaow.clear();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void iwizpuwonk(CameraCaptureSession cameraCaptureSession, int i13, boolean z13) {
        synchronized (this.f54917iobyxmoadg) {
            try {
                if (this.f54913dxjokdxxww == ppxfxbqfkf.OPENED) {
                    jyumaefscl(this.f54916gxszxtbevo);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private List kcexrzcfyt(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yggfygwlhe.gtknphoqwx gtknphoqwxVar = (yggfygwlhe.gtknphoqwx) it.next();
            if (!arrayList.contains(gtknphoqwxVar.wkgbmnqykc())) {
                arrayList.add(gtknphoqwxVar.wkgbmnqykc());
                arrayList2.add(gtknphoqwxVar);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lereixgezr(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        String str;
        synchronized (this.f54917iobyxmoadg) {
            u1.nufgyqmvbu.dxjokdxxww(this.f54915gtknphoqwx == null, "Release completer expected to be null");
            this.f54915gtknphoqwx = iobyxmoadgVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    private yggfygwlhe.gtknphoqwx oxmwwwfdhm(androidx.camera.core.impl.jyumaefscl.gxszxtbevo gxszxtbevoVar, Map map, String str) {
        long jLongValue;
        DynamicRangeProfiles dynamicRangeProfilesWkgbmnqykc;
        Surface surface = (Surface) map.get(gxszxtbevoVar.gxszxtbevo());
        u1.nufgyqmvbu.lqeggnwhkg(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        yggfygwlhe.gtknphoqwx gtknphoqwxVar = new yggfygwlhe.gtknphoqwx(gxszxtbevoVar.lqeggnwhkg(), surface);
        if (str != null) {
            gtknphoqwxVar.lqeggnwhkg(str);
        } else {
            gtknphoqwxVar.lqeggnwhkg(gxszxtbevoVar.wkgbmnqykc());
        }
        if (gxszxtbevoVar.ppxfxbqfkf() == 0) {
            gtknphoqwxVar.gxszxtbevo(1);
        } else if (gxszxtbevoVar.ppxfxbqfkf() == 1) {
            gtknphoqwxVar.gxszxtbevo(2);
        }
        if (!gxszxtbevoVar.eablkybsjg().isEmpty()) {
            gtknphoqwxVar.zoijcleaow();
            Iterator it = gxszxtbevoVar.eablkybsjg().iterator();
            while (it.hasNext()) {
                Surface surface2 = (Surface) map.get((DeferrableSurface) it.next());
                u1.nufgyqmvbu.lqeggnwhkg(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                gtknphoqwxVar.iobyxmoadg(surface2);
            }
        }
        if (Build.VERSION.SDK_INT < 33 || (dynamicRangeProfilesWkgbmnqykc = this.f54922rgvfuqvkyq.wkgbmnqykc()) == null) {
            jLongValue = 1;
        } else {
            lereixgezr.iwizpuwonk iwizpuwonkVarZoijcleaow = gxszxtbevoVar.zoijcleaow();
            Long lIobyxmoadg = yggfygwlhe.wkgbmnqykc.iobyxmoadg(iwizpuwonkVarZoijcleaow, dynamicRangeProfilesWkgbmnqykc);
            if (lIobyxmoadg == null) {
                lereixgezr.sopmlzcsov.ppxfxbqfkf("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + iwizpuwonkVarZoijcleaow);
                jLongValue = 1;
            } else {
                jLongValue = lIobyxmoadg.longValue();
            }
        }
        gtknphoqwxVar.eablkybsjg(jLongValue);
        return gtknphoqwxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pmvmpeiblj, reason: merged with bridge method [inline-methods] */
    public com.google.common.util.concurrent.wkgbmnqykc esjtqupxsv(List list, androidx.camera.core.impl.jyumaefscl jyumaefsclVar, CameraDevice cameraDevice) {
        synchronized (this.f54917iobyxmoadg) {
            try {
                int iOrdinal = this.f54913dxjokdxxww.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        this.f54918lqeggnwhkg.clear();
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            this.f54918lqeggnwhkg.put((DeferrableSurface) this.f54919nufgyqmvbu.get(i13), (Surface) list.get(i13));
                        }
                        this.f54913dxjokdxxww = ppxfxbqfkf.OPENING;
                        lereixgezr.sopmlzcsov.iobyxmoadg("CaptureSession", "Opening capture session.");
                        e.ppxfxbqfkf ppxfxbqfkfVarJyumaefscl = p.jyumaefscl(this.f54921ppxfxbqfkf, new p.iobyxmoadg(jyumaefsclVar.draadjrbmk()));
                        oxmwwwfdhm.iobyxmoadg iobyxmoadgVar = new oxmwwwfdhm.iobyxmoadg(jyumaefsclVar.gxszxtbevo());
                        androidx.camera.core.impl.dxjokdxxww.iobyxmoadg iobyxmoadgVarGtknphoqwx = androidx.camera.core.impl.dxjokdxxww.iobyxmoadg.gtknphoqwx(jyumaefsclVar.gtknphoqwx());
                        ArrayList arrayList = new ArrayList();
                        String strJhduphickx = iobyxmoadgVar.jhduphickx(null);
                        for (androidx.camera.core.impl.jyumaefscl.gxszxtbevo gxszxtbevoVar : jyumaefsclVar.nufgyqmvbu()) {
                            yggfygwlhe.gtknphoqwx gtknphoqwxVarOxmwwwfdhm = oxmwwwfdhm(gxszxtbevoVar, this.f54918lqeggnwhkg, strJhduphickx);
                            if (this.f54912draadjrbmk.containsKey(gxszxtbevoVar.gxszxtbevo())) {
                                gtknphoqwxVarOxmwwwfdhm.nufgyqmvbu(((Long) this.f54912draadjrbmk.get(gxszxtbevoVar.gxszxtbevo())).longValue());
                            }
                            arrayList.add(gtknphoqwxVarOxmwwwfdhm);
                        }
                        yggfygwlhe.vdvldrhtss vdvldrhtssVarGtknphoqwx = this.f54925wkgbmnqykc.gtknphoqwx(jyumaefsclVar.wflxmlrfwp(), kcexrzcfyt(arrayList), ppxfxbqfkfVarJyumaefscl);
                        if (jyumaefsclVar.rgvfuqvkyq() == 5 && jyumaefsclVar.lqeggnwhkg() != null) {
                            vdvldrhtssVarGtknphoqwx.gxszxtbevo(yggfygwlhe.btonecajqb.zoijcleaow(jyumaefsclVar.lqeggnwhkg()));
                        }
                        try {
                            CaptureRequest captureRequestGxszxtbevo = sopmlzcsov.gxszxtbevo(iobyxmoadgVarGtknphoqwx.nufgyqmvbu(), cameraDevice, this.f54923vdvldrhtss);
                            if (captureRequestGxszxtbevo != null) {
                                vdvldrhtssVarGtknphoqwx.lqeggnwhkg(captureRequestGxszxtbevo);
                            }
                            return this.f54925wkgbmnqykc.ppxfxbqfkf(cameraDevice, vdvldrhtssVarGtknphoqwx, this.f54919nufgyqmvbu);
                        } catch (CameraAccessException e13) {
                            return iozdgvuglv.gtknphoqwx.btonecajqb(e13);
                        }
                    }
                    if (iOrdinal != 4) {
                        return iozdgvuglv.gtknphoqwx.btonecajqb(new CancellationException("openCaptureSession() not execute in state: " + this.f54913dxjokdxxww));
                    }
                }
                return iozdgvuglv.gtknphoqwx.btonecajqb(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f54913dxjokdxxww));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private CameraCaptureSession.CaptureCallback rgvfuqvkyq(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ydmasvzmpa.iobyxmoadg((istkbnxepw.nufgyqmvbu) it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return mbcevpiqjq.iobyxmoadg(arrayList);
    }

    void agtfadlqog() {
        synchronized (this.f54917iobyxmoadg) {
            if (this.f54913dxjokdxxww == ppxfxbqfkf.OPENED) {
                try {
                    this.f54914eablkybsjg.zoijcleaow();
                } catch (CameraAccessException e13) {
                    lereixgezr.sopmlzcsov.wkgbmnqykc("CaptureSession", "Unable to abort captures.", e13);
                }
            } else {
                lereixgezr.sopmlzcsov.ppxfxbqfkf("CaptureSession", "Unable to abort captures. Incorrect state:" + this.f54913dxjokdxxww);
            }
        }
    }

    @Override // kcexrzcfyt.iyctptxqzt
    public void close() {
        synchronized (this.f54917iobyxmoadg) {
            try {
                int iOrdinal = this.f54913dxjokdxxww.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.f54913dxjokdxxww);
                }
                if (iOrdinal == 1) {
                    this.f54913dxjokdxxww = ppxfxbqfkf.RELEASED;
                } else if (iOrdinal == 2) {
                    u1.nufgyqmvbu.lqeggnwhkg(this.f54925wkgbmnqykc, "The Opener shouldn't null in state:" + this.f54913dxjokdxxww);
                    this.f54925wkgbmnqykc.stop();
                    this.f54913dxjokdxxww = ppxfxbqfkf.RELEASED;
                } else if (iOrdinal == 3 || iOrdinal == 4) {
                    u1.nufgyqmvbu.lqeggnwhkg(this.f54925wkgbmnqykc, "The Opener shouldn't null in state:" + this.f54913dxjokdxxww);
                    this.f54925wkgbmnqykc.stop();
                    this.f54913dxjokdxxww = ppxfxbqfkf.CLOSED;
                    this.f54920ojitshcjhn.dxjokdxxww();
                    this.f54916gxszxtbevo = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kcexrzcfyt.iyctptxqzt
    public void dxjokdxxww(Map map) {
        synchronized (this.f54917iobyxmoadg) {
            this.f54912draadjrbmk = map;
        }
    }

    @Override // kcexrzcfyt.iyctptxqzt
    public com.google.common.util.concurrent.wkgbmnqykc eablkybsjg(boolean z13) {
        synchronized (this.f54917iobyxmoadg) {
            switch (this.f54913dxjokdxxww) {
                case UNINITIALIZED:
                    throw new IllegalStateException("release() should not be possible in state: " + this.f54913dxjokdxxww);
                case GET_SURFACE:
                    u1.nufgyqmvbu.lqeggnwhkg(this.f54925wkgbmnqykc, "The Opener shouldn't null in state:" + this.f54913dxjokdxxww);
                    this.f54925wkgbmnqykc.stop();
                case INITIALIZED:
                    this.f54913dxjokdxxww = ppxfxbqfkf.RELEASED;
                    return iozdgvuglv.gtknphoqwx.draadjrbmk(null);
                case OPENED:
                case CLOSED:
                    e eVar = this.f54914eablkybsjg;
                    if (eVar != null) {
                        if (z13) {
                            try {
                                eVar.zoijcleaow();
                            } catch (CameraAccessException e13) {
                                lereixgezr.sopmlzcsov.wkgbmnqykc("CaptureSession", "Unable to abort captures.", e13);
                            }
                        }
                        this.f54914eablkybsjg.close();
                        break;
                    }
                case OPENING:
                    this.f54913dxjokdxxww = ppxfxbqfkf.RELEASING;
                    this.f54920ojitshcjhn.dxjokdxxww();
                    u1.nufgyqmvbu.lqeggnwhkg(this.f54925wkgbmnqykc, "The Opener shouldn't null in state:" + this.f54913dxjokdxxww);
                    if (this.f54925wkgbmnqykc.stop()) {
                        vdvldrhtss();
                        return iozdgvuglv.gtknphoqwx.draadjrbmk(null);
                    }
                case RELEASING:
                    if (this.f54911btonecajqb == null) {
                        this.f54911btonecajqb = androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: kcexrzcfyt.zfvoamnweg
                            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
                            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                                return this.f55115iobyxmoadg.lereixgezr(iobyxmoadgVar);
                            }
                        });
                    }
                    return this.f54911btonecajqb;
                default:
                    return iozdgvuglv.gtknphoqwx.draadjrbmk(null);
            }
        }
    }

    @Override // kcexrzcfyt.iyctptxqzt
    public List gxszxtbevo() {
        List listUnmodifiableList;
        synchronized (this.f54917iobyxmoadg) {
            listUnmodifiableList = Collections.unmodifiableList(this.f54926zoijcleaow);
        }
        return listUnmodifiableList;
    }

    @Override // kcexrzcfyt.iyctptxqzt
    public void iobyxmoadg(List list) {
        synchronized (this.f54917iobyxmoadg) {
            try {
                switch (this.f54913dxjokdxxww) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f54913dxjokdxxww);
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f54926zoijcleaow.addAll(list);
                        break;
                    case OPENED:
                        this.f54926zoijcleaow.addAll(list);
                        yggfygwlhe();
                        break;
                    case CLOSED:
                    case RELEASING:
                    case RELEASED:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    int jyumaefscl(androidx.camera.core.impl.jyumaefscl jyumaefsclVar) {
        synchronized (this.f54917iobyxmoadg) {
            try {
                if (jyumaefsclVar == null) {
                    lereixgezr.sopmlzcsov.iobyxmoadg("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                    return -1;
                }
                if (this.f54913dxjokdxxww != ppxfxbqfkf.OPENED) {
                    lereixgezr.sopmlzcsov.iobyxmoadg("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                    return -1;
                }
                androidx.camera.core.impl.dxjokdxxww dxjokdxxwwVarGtknphoqwx = jyumaefsclVar.gtknphoqwx();
                if (dxjokdxxwwVarGtknphoqwx.dxjokdxxww().isEmpty()) {
                    lereixgezr.sopmlzcsov.iobyxmoadg("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                    try {
                        this.f54914eablkybsjg.stopRepeating();
                    } catch (CameraAccessException e13) {
                        lereixgezr.sopmlzcsov.ppxfxbqfkf("CaptureSession", "Unable to access camera: " + e13.getMessage());
                        Thread.dumpStack();
                    }
                    return -1;
                }
                try {
                    lereixgezr.sopmlzcsov.iobyxmoadg("CaptureSession", "Issuing request for session.");
                    CaptureRequest captureRequestEablkybsjg = sopmlzcsov.eablkybsjg(dxjokdxxwwVarGtknphoqwx, this.f54914eablkybsjg.lqeggnwhkg(), this.f54918lqeggnwhkg, true, this.f54923vdvldrhtss);
                    if (captureRequestEablkybsjg == null) {
                        lereixgezr.sopmlzcsov.iobyxmoadg("CaptureSession", "Skipping issuing empty request for session.");
                        return -1;
                    }
                    return this.f54914eablkybsjg.nufgyqmvbu(captureRequestEablkybsjg, this.f54920ojitshcjhn.wkgbmnqykc(rgvfuqvkyq(dxjokdxxwwVarGtknphoqwx.ppxfxbqfkf(), new CameraCaptureSession.CaptureCallback[0])));
                } catch (CameraAccessException e14) {
                    lereixgezr.sopmlzcsov.ppxfxbqfkf("CaptureSession", "Unable to access camera: " + e14.getMessage());
                    Thread.dumpStack();
                    return -1;
                }
                throw th;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kcexrzcfyt.iyctptxqzt
    public androidx.camera.core.impl.jyumaefscl lqeggnwhkg() {
        androidx.camera.core.impl.jyumaefscl jyumaefsclVar;
        synchronized (this.f54917iobyxmoadg) {
            jyumaefsclVar = this.f54916gxszxtbevo;
        }
        return jyumaefsclVar;
    }

    @Override // kcexrzcfyt.iyctptxqzt
    public void nufgyqmvbu(androidx.camera.core.impl.jyumaefscl jyumaefsclVar) {
        synchronized (this.f54917iobyxmoadg) {
            try {
                switch (this.f54913dxjokdxxww) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f54913dxjokdxxww);
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f54916gxszxtbevo = jyumaefsclVar;
                        break;
                    case OPENED:
                        this.f54916gxszxtbevo = jyumaefsclVar;
                        if (jyumaefsclVar == null) {
                            return;
                        }
                        if (!this.f54918lqeggnwhkg.keySet().containsAll(jyumaefsclVar.ojitshcjhn())) {
                            lereixgezr.sopmlzcsov.ppxfxbqfkf("CaptureSession", "Does not have the proper configured lists");
                            return;
                        } else {
                            lereixgezr.sopmlzcsov.iobyxmoadg("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            jyumaefscl(this.f54916gxszxtbevo);
                        }
                        break;
                    case CLOSED:
                    case RELEASING:
                    case RELEASED:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kcexrzcfyt.iyctptxqzt
    public boolean ppxfxbqfkf() {
        boolean z13;
        synchronized (this.f54917iobyxmoadg) {
            try {
                ppxfxbqfkf ppxfxbqfkfVar = this.f54913dxjokdxxww;
                z13 = ppxfxbqfkfVar == ppxfxbqfkf.OPENED || ppxfxbqfkfVar == ppxfxbqfkf.OPENING;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z13;
    }

    void vdvldrhtss() {
        ppxfxbqfkf ppxfxbqfkfVar = this.f54913dxjokdxxww;
        ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkf.RELEASED;
        if (ppxfxbqfkfVar == ppxfxbqfkfVar2) {
            lereixgezr.sopmlzcsov.iobyxmoadg("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f54913dxjokdxxww = ppxfxbqfkfVar2;
        this.f54914eablkybsjg = null;
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = this.f54915gtknphoqwx;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.ppxfxbqfkf(null);
            this.f54915gtknphoqwx = null;
        }
    }

    @Override // kcexrzcfyt.iyctptxqzt
    public void wkgbmnqykc() {
        ArrayList<androidx.camera.core.impl.dxjokdxxww> arrayList;
        synchronized (this.f54917iobyxmoadg) {
            try {
                if (this.f54926zoijcleaow.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.f54926zoijcleaow);
                    this.f54926zoijcleaow.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList != null) {
            for (androidx.camera.core.impl.dxjokdxxww dxjokdxxwwVar : arrayList) {
                Iterator it = dxjokdxxwwVar.ppxfxbqfkf().iterator();
                while (it.hasNext()) {
                    ((istkbnxepw.nufgyqmvbu) it.next()).iobyxmoadg(dxjokdxxwwVar.gxszxtbevo());
                }
            }
        }
    }

    void yggfygwlhe() {
        this.f54920ojitshcjhn.eablkybsjg().iobyxmoadg(new Runnable() { // from class: kcexrzcfyt.bfopjjpdmp
            @Override // java.lang.Runnable
            public final void run() {
                this.f54611zdlpuopuiu.cqumvgiudr();
            }
        }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
    }

    int zdlpuopuiu(List list) {
        synchronized (this.f54917iobyxmoadg) {
            try {
                if (this.f54913dxjokdxxww != ppxfxbqfkf.OPENED) {
                    lereixgezr.sopmlzcsov.iobyxmoadg("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return -1;
                }
                if (list.isEmpty()) {
                    return -1;
                }
                try {
                    ikoacuggdj ikoacuggdjVar = new ikoacuggdj();
                    ArrayList arrayList = new ArrayList();
                    lereixgezr.sopmlzcsov.iobyxmoadg("CaptureSession", "Issuing capture request.");
                    Iterator it = list.iterator();
                    boolean z13 = false;
                    while (it.hasNext()) {
                        androidx.camera.core.impl.dxjokdxxww dxjokdxxwwVar = (androidx.camera.core.impl.dxjokdxxww) it.next();
                        if (!dxjokdxxwwVar.dxjokdxxww().isEmpty()) {
                            Iterator it2 = dxjokdxxwwVar.dxjokdxxww().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    if (dxjokdxxwwVar.gtknphoqwx() == 2) {
                                        z13 = true;
                                    }
                                    androidx.camera.core.impl.dxjokdxxww.iobyxmoadg iobyxmoadgVarGtknphoqwx = androidx.camera.core.impl.dxjokdxxww.iobyxmoadg.gtknphoqwx(dxjokdxxwwVar);
                                    if (dxjokdxxwwVar.gtknphoqwx() == 5 && dxjokdxxwwVar.wkgbmnqykc() != null) {
                                        iobyxmoadgVarGtknphoqwx.ojitshcjhn(dxjokdxxwwVar.wkgbmnqykc());
                                    }
                                    androidx.camera.core.impl.jyumaefscl jyumaefsclVar = this.f54916gxszxtbevo;
                                    if (jyumaefsclVar != null) {
                                        iobyxmoadgVarGtknphoqwx.eablkybsjg(jyumaefsclVar.gtknphoqwx().lqeggnwhkg());
                                    }
                                    iobyxmoadgVarGtknphoqwx.eablkybsjg(dxjokdxxwwVar.lqeggnwhkg());
                                    CaptureRequest captureRequestEablkybsjg = sopmlzcsov.eablkybsjg(iobyxmoadgVarGtknphoqwx.nufgyqmvbu(), this.f54914eablkybsjg.lqeggnwhkg(), this.f54918lqeggnwhkg, false, this.f54923vdvldrhtss);
                                    if (captureRequestEablkybsjg != null) {
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator it3 = dxjokdxxwwVar.ppxfxbqfkf().iterator();
                                        while (it3.hasNext()) {
                                            ydmasvzmpa.zoijcleaow((istkbnxepw.nufgyqmvbu) it3.next(), arrayList2);
                                        }
                                        ikoacuggdjVar.iobyxmoadg(captureRequestEablkybsjg, arrayList2);
                                        arrayList.add(captureRequestEablkybsjg);
                                        break;
                                    }
                                    lereixgezr.sopmlzcsov.iobyxmoadg("CaptureSession", "Skipping issuing request without surface.");
                                    return -1;
                                }
                                DeferrableSurface deferrableSurface = (DeferrableSurface) it2.next();
                                if (!this.f54918lqeggnwhkg.containsKey(deferrableSurface)) {
                                    lereixgezr.sopmlzcsov.iobyxmoadg("CaptureSession", "Skipping capture request with invalid surface: " + deferrableSurface);
                                    break;
                                }
                            }
                        } else {
                            lereixgezr.sopmlzcsov.iobyxmoadg("CaptureSession", "Skipping issuing empty capture request.");
                        }
                    }
                    if (arrayList.isEmpty()) {
                        lereixgezr.sopmlzcsov.iobyxmoadg("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                        return -1;
                    }
                    if (this.f54924wflxmlrfwp.iobyxmoadg(arrayList, z13)) {
                        this.f54914eablkybsjg.stopRepeating();
                        ikoacuggdjVar.ppxfxbqfkf(new ikoacuggdj.iobyxmoadg() { // from class: kcexrzcfyt.sflfametgt
                            @Override // kcexrzcfyt.ikoacuggdj.iobyxmoadg
                            public final void iobyxmoadg(CameraCaptureSession cameraCaptureSession, int i13, boolean z14) {
                                this.f54984iobyxmoadg.iwizpuwonk(cameraCaptureSession, i13, z14);
                            }
                        });
                    }
                    if (this.f54910agtfadlqog.zoijcleaow(arrayList, z13)) {
                        ikoacuggdjVar.iobyxmoadg((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new zoijcleaow()));
                    }
                    return this.f54914eablkybsjg.btonecajqb(arrayList, ikoacuggdjVar);
                } catch (CameraAccessException e13) {
                    lereixgezr.sopmlzcsov.ppxfxbqfkf("CaptureSession", "Unable to access camera: " + e13.getMessage());
                    Thread.dumpStack();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kcexrzcfyt.iyctptxqzt
    public com.google.common.util.concurrent.wkgbmnqykc zoijcleaow(final androidx.camera.core.impl.jyumaefscl jyumaefsclVar, final CameraDevice cameraDevice, e.iobyxmoadg iobyxmoadgVar) {
        synchronized (this.f54917iobyxmoadg) {
            try {
                if (this.f54913dxjokdxxww.ordinal() == 1) {
                    this.f54913dxjokdxxww = ppxfxbqfkf.GET_SURFACE;
                    ArrayList arrayList = new ArrayList(jyumaefsclVar.ojitshcjhn());
                    this.f54919nufgyqmvbu = arrayList;
                    this.f54925wkgbmnqykc = iobyxmoadgVar;
                    iozdgvuglv.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = iozdgvuglv.wkgbmnqykc.zoijcleaow(iobyxmoadgVar.dxjokdxxww(arrayList, DeviceOrientationRequest.OUTPUT_PERIOD_FAST)).gxszxtbevo(new iozdgvuglv.iobyxmoadg() { // from class: kcexrzcfyt.oipsdeybqn
                        @Override // iozdgvuglv.iobyxmoadg
                        public final com.google.common.util.concurrent.wkgbmnqykc apply(Object obj) {
                            return this.f54905iobyxmoadg.esjtqupxsv(jyumaefsclVar, cameraDevice, (List) obj);
                        }
                    }, this.f54925wkgbmnqykc.iobyxmoadg());
                    iozdgvuglv.gtknphoqwx.lqeggnwhkg(wkgbmnqykcVarGxszxtbevo, new iobyxmoadg(), this.f54925wkgbmnqykc.iobyxmoadg());
                    return iozdgvuglv.gtknphoqwx.zdlpuopuiu(wkgbmnqykcVarGxszxtbevo);
                }
                lereixgezr.sopmlzcsov.ppxfxbqfkf("CaptureSession", "Open not allowed in state: " + this.f54913dxjokdxxww);
                return iozdgvuglv.gtknphoqwx.btonecajqb(new IllegalStateException("open() should not allow the state: " + this.f54913dxjokdxxww));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void zynmafqrjb() {
        synchronized (this.f54917iobyxmoadg) {
            if (this.f54913dxjokdxxww == ppxfxbqfkf.OPENED) {
                try {
                    this.f54914eablkybsjg.stopRepeating();
                } catch (CameraAccessException e13) {
                    lereixgezr.sopmlzcsov.wkgbmnqykc("CaptureSession", "Unable to stop repeating.", e13);
                }
            } else {
                lereixgezr.sopmlzcsov.ppxfxbqfkf("CaptureSession", "Unable to stop repeating. Incorrect state:" + this.f54913dxjokdxxww);
            }
        }
    }

    opjhrmiecq(yggfygwlhe.lqeggnwhkg lqeggnwhkgVar, istkbnxepw.jztzpxfvev jztzpxfvevVar) {
        this.f54917iobyxmoadg = new Object();
        this.f54926zoijcleaow = new ArrayList();
        this.f54918lqeggnwhkg = new HashMap();
        this.f54919nufgyqmvbu = Collections.emptyList();
        this.f54913dxjokdxxww = ppxfxbqfkf.UNINITIALIZED;
        this.f54912draadjrbmk = new HashMap();
        this.f54924wflxmlrfwp = new iwizpuwonk.yggfygwlhe();
        this.f54910agtfadlqog = new iwizpuwonk.esjtqupxsv();
        this.f54913dxjokdxxww = ppxfxbqfkf.INITIALIZED;
        this.f54922rgvfuqvkyq = lqeggnwhkgVar;
        this.f54921ppxfxbqfkf = new wkgbmnqykc();
        this.f54920ojitshcjhn = new iwizpuwonk.oxmwwwfdhm(jztzpxfvevVar.iobyxmoadg(CaptureNoResponseQuirk.class));
        this.f54923vdvldrhtss = new iwizpuwonk.cqumvgiudr(jztzpxfvevVar);
    }
}
