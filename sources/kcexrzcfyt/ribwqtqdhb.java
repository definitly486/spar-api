package kcexrzcfyt;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public class ribwqtqdhb implements istkbnxepw.xrmfcynszj {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private volatile androidx.camera.core.impl.jyumaefscl f54967eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private List f54969ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private opjhrmiecq f54971zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f54968iobyxmoadg = new Object();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private volatile boolean f54970wkgbmnqykc = false;

    private class iobyxmoadg extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final istkbnxepw.xrmfcynszj.iobyxmoadg f54972iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f54973ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final istkbnxepw.xrmfcynszj.zoijcleaow f54975zoijcleaow;

        iobyxmoadg(istkbnxepw.xrmfcynszj.zoijcleaow zoijcleaowVar, istkbnxepw.xrmfcynszj.iobyxmoadg iobyxmoadgVar, boolean z13) {
            this.f54972iobyxmoadg = iobyxmoadgVar;
            this.f54975zoijcleaow = zoijcleaowVar;
            this.f54973ppxfxbqfkf = z13;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j13) {
            this.f54972iobyxmoadg.onCaptureBufferLost(this.f54975zoijcleaow, j13, ribwqtqdhb.this.lqeggnwhkg(surface));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f54972iobyxmoadg.onCaptureCompleted(this.f54975zoijcleaow, new nufgyqmvbu(totalCaptureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f54972iobyxmoadg.onCaptureFailed(this.f54975zoijcleaow, new lqeggnwhkg(istkbnxepw.btonecajqb.iobyxmoadg.ERROR, captureFailure));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f54972iobyxmoadg.onCaptureProgressed(this.f54975zoijcleaow, new nufgyqmvbu(captureResult));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i13) {
            if (this.f54973ppxfxbqfkf) {
                this.f54972iobyxmoadg.onCaptureSequenceAborted(i13);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i13, long j13) {
            if (this.f54973ppxfxbqfkf) {
                this.f54972iobyxmoadg.onCaptureSequenceCompleted(i13, j13);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j13, long j14) {
            this.f54972iobyxmoadg.onCaptureStarted(this.f54975zoijcleaow, j14, j13);
        }
    }

    public ribwqtqdhb(opjhrmiecq opjhrmiecqVar, List list) {
        u1.nufgyqmvbu.zoijcleaow(opjhrmiecqVar.f54913dxjokdxxww == opjhrmiecq.ppxfxbqfkf.OPENED, "CaptureSession state must be OPENED. Current state:" + opjhrmiecqVar.f54913dxjokdxxww);
        this.f54971zoijcleaow = opjhrmiecqVar;
        this.f54969ppxfxbqfkf = Collections.unmodifiableList(new ArrayList(list));
    }

    private boolean dxjokdxxww(istkbnxepw.xrmfcynszj.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar.getTargetOutputConfigIds().isEmpty()) {
            lereixgezr.sopmlzcsov.ppxfxbqfkf("Camera2RequestProcessor", "Unable to submit the RequestProcessor.Request: empty targetOutputConfigIds");
            return false;
        }
        for (Integer num : zoijcleaowVar.getTargetOutputConfigIds()) {
            if (nufgyqmvbu(num.intValue()) == null) {
                lereixgezr.sopmlzcsov.ppxfxbqfkf("Camera2RequestProcessor", "Unable to submit the RequestProcessor.Request: targetOutputConfigId(" + num + ") is not a valid id");
                return false;
            }
        }
        return true;
    }

    private boolean iobyxmoadg(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!dxjokdxxww((istkbnxepw.xrmfcynszj.zoijcleaow) it.next())) {
                return false;
            }
        }
        return true;
    }

    private DeferrableSurface nufgyqmvbu(int i13) {
        synchronized (this.f54968iobyxmoadg) {
            try {
                List<istkbnxepw.ydmasvzmpa> list = this.f54969ppxfxbqfkf;
                if (list == null) {
                    return null;
                }
                for (istkbnxepw.ydmasvzmpa ydmasvzmpaVar : list) {
                    if (ydmasvzmpaVar.zdlpuopuiu() == i13) {
                        return ydmasvzmpaVar;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void btonecajqb(androidx.camera.core.impl.jyumaefscl jyumaefsclVar) {
        synchronized (this.f54968iobyxmoadg) {
            this.f54967eablkybsjg = jyumaefsclVar;
        }
    }

    @Override // istkbnxepw.xrmfcynszj
    public int eablkybsjg(List list, istkbnxepw.xrmfcynszj.iobyxmoadg iobyxmoadgVar) {
        synchronized (this.f54968iobyxmoadg) {
            try {
                if (!this.f54970wkgbmnqykc && iobyxmoadg(list) && this.f54971zoijcleaow != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    boolean z13 = true;
                    while (it.hasNext()) {
                        istkbnxepw.xrmfcynszj.zoijcleaow zoijcleaowVar = (istkbnxepw.xrmfcynszj.zoijcleaow) it.next();
                        androidx.camera.core.impl.dxjokdxxww.iobyxmoadg iobyxmoadgVar2 = new androidx.camera.core.impl.dxjokdxxww.iobyxmoadg();
                        iobyxmoadgVar2.kcexrzcfyt(zoijcleaowVar.getTemplateId());
                        iobyxmoadgVar2.vdvldrhtss(zoijcleaowVar.getParameters());
                        iobyxmoadgVar2.ppxfxbqfkf(yfnezrywwk.gxszxtbevo(new iobyxmoadg(zoijcleaowVar, iobyxmoadgVar, z13)));
                        Iterator it2 = zoijcleaowVar.getTargetOutputConfigIds().iterator();
                        while (it2.hasNext()) {
                            iobyxmoadgVar2.gxszxtbevo(nufgyqmvbu(((Integer) it2.next()).intValue()));
                        }
                        arrayList.add(iobyxmoadgVar2.nufgyqmvbu());
                        z13 = false;
                    }
                    return this.f54971zoijcleaow.zdlpuopuiu(arrayList);
                }
                return -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void gxszxtbevo() {
        synchronized (this.f54968iobyxmoadg) {
            this.f54970wkgbmnqykc = true;
            this.f54971zoijcleaow = null;
            this.f54967eablkybsjg = null;
            this.f54969ppxfxbqfkf = null;
        }
    }

    int lqeggnwhkg(Surface surface) {
        synchronized (this.f54968iobyxmoadg) {
            try {
                List<istkbnxepw.ydmasvzmpa> list = this.f54969ppxfxbqfkf;
                if (list == null) {
                    return -1;
                }
                for (istkbnxepw.ydmasvzmpa ydmasvzmpaVar : list) {
                    try {
                        if (ydmasvzmpaVar.btonecajqb().get() == surface) {
                            return ydmasvzmpaVar.zdlpuopuiu();
                        }
                        continue;
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
                return -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // istkbnxepw.xrmfcynszj
    public int ppxfxbqfkf(istkbnxepw.xrmfcynszj.zoijcleaow zoijcleaowVar, istkbnxepw.xrmfcynszj.iobyxmoadg iobyxmoadgVar) {
        return eablkybsjg(Arrays.asList(zoijcleaowVar), iobyxmoadgVar);
    }

    @Override // istkbnxepw.xrmfcynszj
    public void stopRepeating() {
        opjhrmiecq opjhrmiecqVar;
        synchronized (this.f54968iobyxmoadg) {
            try {
                if (!this.f54970wkgbmnqykc && (opjhrmiecqVar = this.f54971zoijcleaow) != null) {
                    opjhrmiecqVar.zynmafqrjb();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // istkbnxepw.xrmfcynszj
    public int wkgbmnqykc(istkbnxepw.xrmfcynszj.zoijcleaow zoijcleaowVar, istkbnxepw.xrmfcynszj.iobyxmoadg iobyxmoadgVar) {
        synchronized (this.f54968iobyxmoadg) {
            try {
                if (!this.f54970wkgbmnqykc && dxjokdxxww(zoijcleaowVar) && this.f54971zoijcleaow != null) {
                    androidx.camera.core.impl.jyumaefscl.zoijcleaow zoijcleaowVar2 = new androidx.camera.core.impl.jyumaefscl.zoijcleaow();
                    zoijcleaowVar2.esjtqupxsv(zoijcleaowVar.getTemplateId());
                    zoijcleaowVar2.zdlpuopuiu(zoijcleaowVar.getParameters());
                    zoijcleaowVar2.eablkybsjg(yfnezrywwk.gxszxtbevo(new iobyxmoadg(zoijcleaowVar, iobyxmoadgVar, true)));
                    if (this.f54967eablkybsjg != null) {
                        Iterator it = this.f54967eablkybsjg.btonecajqb().iterator();
                        while (it.hasNext()) {
                            zoijcleaowVar2.eablkybsjg((istkbnxepw.nufgyqmvbu) it.next());
                        }
                        istkbnxepw.opjhrmiecq opjhrmiecqVarBtonecajqb = this.f54967eablkybsjg.gtknphoqwx().btonecajqb();
                        for (String str : opjhrmiecqVarBtonecajqb.eablkybsjg()) {
                            zoijcleaowVar2.ojitshcjhn(str, opjhrmiecqVarBtonecajqb.wkgbmnqykc(str));
                        }
                    }
                    Iterator it2 = zoijcleaowVar.getTargetOutputConfigIds().iterator();
                    while (it2.hasNext()) {
                        zoijcleaowVar2.wflxmlrfwp(nufgyqmvbu(((Integer) it2.next()).intValue()));
                    }
                    return this.f54971zoijcleaow.jyumaefscl(zoijcleaowVar2.rgvfuqvkyq());
                }
                return -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // istkbnxepw.xrmfcynszj
    public void zoijcleaow() {
        opjhrmiecq opjhrmiecqVar;
        synchronized (this.f54968iobyxmoadg) {
            try {
                if (!this.f54970wkgbmnqykc && (opjhrmiecqVar = this.f54971zoijcleaow) != null) {
                    opjhrmiecqVar.agtfadlqog();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
