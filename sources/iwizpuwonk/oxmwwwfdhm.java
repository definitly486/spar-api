package iwizpuwonk;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import kcexrzcfyt.mbcevpiqjq;

/* JADX INFO: loaded from: classes.dex */
public class oxmwwwfdhm {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f49822iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f49823zoijcleaow = Collections.synchronizedList(new ArrayList());

    static class iobyxmoadg extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final com.google.common.util.concurrent.wkgbmnqykc f49824iobyxmoadg = androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: iwizpuwonk.vdvldrhtss
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return this.f49829iobyxmoadg.ppxfxbqfkf(iobyxmoadgVar);
            }
        });

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f49825zoijcleaow;

        iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object ppxfxbqfkf(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
            this.f49825zoijcleaow = iobyxmoadgVar;
            return "RequestCompleteListener[" + this + "]";
        }

        private void zoijcleaow() {
            androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = this.f49825zoijcleaow;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.ppxfxbqfkf(null);
                this.f49825zoijcleaow = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            zoijcleaow();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            zoijcleaow();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i13) {
            zoijcleaow();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i13, long j13) {
            zoijcleaow();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j13, long j14) {
            zoijcleaow();
        }
    }

    public oxmwwwfdhm(boolean z13) {
        this.f49822iobyxmoadg = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gxszxtbevo(iobyxmoadg iobyxmoadgVar, com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar) {
        Log.d("RequestMonitor", "RequestListener " + iobyxmoadgVar + " done " + this);
        this.f49823zoijcleaow.remove(wkgbmnqykcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lqeggnwhkg(List list) {
        return null;
    }

    private CameraCaptureSession.CaptureCallback ppxfxbqfkf() {
        final iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        final com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar = iobyxmoadgVar.f49824iobyxmoadg;
        this.f49823zoijcleaow.add(wkgbmnqykcVar);
        Log.d("RequestMonitor", "RequestListener " + iobyxmoadgVar + " monitoring " + this);
        wkgbmnqykcVar.iobyxmoadg(new Runnable() { // from class: iwizpuwonk.rgvfuqvkyq
            @Override // java.lang.Runnable
            public final void run() {
                this.f49828zdlpuopuiu.gxszxtbevo(iobyxmoadgVar, wkgbmnqykcVar);
            }
        }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
        return iobyxmoadgVar;
    }

    public void dxjokdxxww() {
        LinkedList linkedList = new LinkedList(this.f49823zoijcleaow);
        while (!linkedList.isEmpty()) {
            com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar = (com.google.common.util.concurrent.wkgbmnqykc) linkedList.poll();
            Objects.requireNonNull(wkgbmnqykcVar);
            wkgbmnqykcVar.cancel(true);
        }
    }

    public com.google.common.util.concurrent.wkgbmnqykc eablkybsjg() {
        return this.f49823zoijcleaow.isEmpty() ? iozdgvuglv.gtknphoqwx.draadjrbmk(null) : iozdgvuglv.gtknphoqwx.zdlpuopuiu(iozdgvuglv.gtknphoqwx.esjtqupxsv(iozdgvuglv.gtknphoqwx.cqumvgiudr(new ArrayList(this.f49823zoijcleaow)), new ojitshcjhn.iobyxmoadg() { // from class: iwizpuwonk.ojitshcjhn
            @Override // ojitshcjhn.iobyxmoadg
            public final Object apply(Object obj) {
                return oxmwwwfdhm.lqeggnwhkg((List) obj);
            }
        }, yadqdtsiqt.iobyxmoadg.iobyxmoadg()));
    }

    public boolean nufgyqmvbu() {
        return this.f49822iobyxmoadg;
    }

    public CameraCaptureSession.CaptureCallback wkgbmnqykc(CameraCaptureSession.CaptureCallback captureCallback) {
        return nufgyqmvbu() ? mbcevpiqjq.zoijcleaow(ppxfxbqfkf(), captureCallback) : captureCallback;
    }
}
