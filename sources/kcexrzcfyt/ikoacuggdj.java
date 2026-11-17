package kcexrzcfyt;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class ikoacuggdj extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    iobyxmoadg f54705zoijcleaow = null;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final Map f54704iobyxmoadg = new HashMap();

    interface iobyxmoadg {
        void iobyxmoadg(CameraCaptureSession cameraCaptureSession, int i13, boolean z13);
    }

    ikoacuggdj() {
    }

    private List zoijcleaow(CaptureRequest captureRequest) {
        List list = (List) this.f54704iobyxmoadg.get(captureRequest);
        return list != null ? list : Collections.emptyList();
    }

    void iobyxmoadg(CaptureRequest captureRequest, List list) {
        List list2 = (List) this.f54704iobyxmoadg.get(captureRequest);
        if (list2 == null) {
            this.f54704iobyxmoadg.put(captureRequest, list);
            return;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        this.f54704iobyxmoadg.put(captureRequest, arrayList);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j13) {
        Iterator it = zoijcleaow(captureRequest).iterator();
        while (it.hasNext()) {
            zdlpuopuiu.ppxfxbqfkf.iobyxmoadg((CameraCaptureSession.CaptureCallback) it.next(), cameraCaptureSession, captureRequest, surface, j13);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Iterator it = zoijcleaow(captureRequest).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        Iterator it = zoijcleaow(captureRequest).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        Iterator it = zoijcleaow(captureRequest).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i13) {
        Iterator it = this.f54704iobyxmoadg.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceAborted(cameraCaptureSession, i13);
            }
        }
        iobyxmoadg iobyxmoadgVar = this.f54705zoijcleaow;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.iobyxmoadg(cameraCaptureSession, i13, true);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i13, long j13) {
        Iterator it = this.f54704iobyxmoadg.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceCompleted(cameraCaptureSession, i13, j13);
            }
        }
        iobyxmoadg iobyxmoadgVar = this.f54705zoijcleaow;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.iobyxmoadg(cameraCaptureSession, i13, false);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j13, long j14) {
        Iterator it = zoijcleaow(captureRequest).iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j13, j14);
        }
    }

    public void ppxfxbqfkf(iobyxmoadg iobyxmoadgVar) {
        this.f54705zoijcleaow = iobyxmoadgVar;
    }
}
