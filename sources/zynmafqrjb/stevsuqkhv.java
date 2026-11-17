package zynmafqrjb;

import android.util.Log;
import androidx.camera.core.ImageCaptureException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class stevsuqkhv implements androidx.camera.core.eablkybsjg.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f131669eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    jyumaefscl f131672ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private cllcsxoeiz f131673wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final yggfygwlhe f131674zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final Deque f131671iobyxmoadg = new ArrayDeque();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    boolean f131670gxszxtbevo = false;

    static abstract class iobyxmoadg {
        iobyxmoadg() {
        }

        static iobyxmoadg ppxfxbqfkf(int i13, ImageCaptureException imageCaptureException) {
            return new gxszxtbevo(i13, imageCaptureException);
        }

        abstract ImageCaptureException iobyxmoadg();

        abstract int zoijcleaow();
    }

    public stevsuqkhv(yggfygwlhe yggfygwlheVar) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        this.f131674zoijcleaow = yggfygwlheVar;
        this.f131669eablkybsjg = new ArrayList();
    }

    public void eablkybsjg() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        this.f131670gxszxtbevo = true;
    }

    public void gxszxtbevo() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        this.f131670gxszxtbevo = false;
        wkgbmnqykc();
    }

    public void iobyxmoadg() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        ImageCaptureException imageCaptureException = new ImageCaptureException(3, "Camera is closed.", null);
        Iterator it = this.f131671iobyxmoadg.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(it.next());
            throw null;
        }
        this.f131671iobyxmoadg.clear();
        Iterator it2 = new ArrayList(this.f131669eablkybsjg).iterator();
        while (it2.hasNext()) {
            ((cllcsxoeiz) it2.next()).iobyxmoadg(imageCaptureException);
        }
    }

    public void lqeggnwhkg(jyumaefscl jyumaefsclVar) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        this.f131672ppxfxbqfkf = jyumaefsclVar;
        jyumaefsclVar.eablkybsjg(this);
    }

    boolean ppxfxbqfkf() {
        return false;
    }

    void wkgbmnqykc() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        Log.d("TakePictureManager", "Issue the next TakePictureRequest.");
        if (ppxfxbqfkf()) {
            Log.d("TakePictureManager", "There is already a request in-flight.");
            return;
        }
        if (this.f131670gxszxtbevo) {
            Log.d("TakePictureManager", "The class is paused.");
        } else if (this.f131672ppxfxbqfkf.ppxfxbqfkf() == 0) {
            Log.d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
        } else {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(this.f131671iobyxmoadg.poll());
            Log.d("TakePictureManager", "No new request.");
        }
    }

    @Override // androidx.camera.core.eablkybsjg.iobyxmoadg
    public void zoijcleaow(androidx.camera.core.agtfadlqog agtfadlqogVar) {
        yadqdtsiqt.iobyxmoadg.wkgbmnqykc().execute(new Runnable() { // from class: zynmafqrjb.wypolnanlu
            @Override // java.lang.Runnable
            public final void run() {
                this.f131683zdlpuopuiu.wkgbmnqykc();
            }
        });
    }
}
