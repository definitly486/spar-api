package kegysxyocb;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.agtfadlqog;
import androidx.camera.core.ojitshcjhn;
import androidx.camera.extensions.internal.compat.quirk.CaptureOutputSurfaceOccupiedQuirk;
import istkbnxepw.cllcsxoeiz;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Surface f55355eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f55356gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f55358lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final cllcsxoeiz f55360ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ImageWriter f55362zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f55357iobyxmoadg = new Object();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f55361wkgbmnqykc = false;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    long f55359nufgyqmvbu = -1;

    static final class iobyxmoadg {
        static void iobyxmoadg(Image image, long j13) {
            image.setTimestamp(j13);
        }
    }

    static final class zoijcleaow {
        static void iobyxmoadg(ImageWriter imageWriter) {
            imageWriter.close();
        }

        static void ppxfxbqfkf(ImageWriter imageWriter, Image image) {
            imageWriter.queueInputImage(image);
        }

        static ImageWriter zoijcleaow(Surface surface, int i13, int i14) {
            return ImageWriter.newInstance(surface, i13, i14);
        }
    }

    public ppxfxbqfkf(Surface surface, Size size, boolean z13) {
        this.f55358lqeggnwhkg = z13;
        boolean z14 = androidx.camera.extensions.internal.compat.quirk.iobyxmoadg.zoijcleaow(CaptureOutputSurfaceOccupiedQuirk.class) != null || z13;
        this.f55356gxszxtbevo = z14;
        if (Build.VERSION.SDK_INT < 29 || !z14) {
            this.f55355eablkybsjg = surface;
            this.f55360ppxfxbqfkf = null;
            this.f55362zoijcleaow = null;
        } else {
            sopmlzcsov.iobyxmoadg("CaptureOutputSurface", "Enabling intermediate surface");
            cllcsxoeiz cllcsxoeizVarIobyxmoadg = ojitshcjhn.iobyxmoadg(size.getWidth(), size.getHeight(), 35, 2);
            this.f55360ppxfxbqfkf = cllcsxoeizVarIobyxmoadg;
            this.f55355eablkybsjg = cllcsxoeizVarIobyxmoadg.iobyxmoadg();
            this.f55362zoijcleaow = zoijcleaow.zoijcleaow(surface, 2, 35);
            cllcsxoeizVarIobyxmoadg.lqeggnwhkg(new cllcsxoeiz.iobyxmoadg() { // from class: kegysxyocb.zoijcleaow
                @Override // istkbnxepw.cllcsxoeiz.iobyxmoadg
                public final void iobyxmoadg(cllcsxoeiz cllcsxoeizVar) {
                    this.f55363iobyxmoadg.wkgbmnqykc(cllcsxoeizVar);
                }
            }, yadqdtsiqt.iobyxmoadg.iobyxmoadg());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wkgbmnqykc(cllcsxoeiz cllcsxoeizVar) {
        Image imageU;
        synchronized (this.f55357iobyxmoadg) {
            try {
                if (this.f55361wkgbmnqykc) {
                    return;
                }
                agtfadlqog agtfadlqogVarNufgyqmvbu = cllcsxoeizVar.nufgyqmvbu();
                if (agtfadlqogVarNufgyqmvbu != null && (imageU = agtfadlqogVarNufgyqmvbu.U()) != null) {
                    if (this.f55358lqeggnwhkg) {
                        long j13 = this.f55359nufgyqmvbu;
                        if (j13 != -1) {
                            iobyxmoadg.iobyxmoadg(imageU, j13);
                        }
                    }
                    zoijcleaow.ppxfxbqfkf(this.f55362zoijcleaow, imageU);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void eablkybsjg(long j13) {
        if (this.f55358lqeggnwhkg) {
            this.f55359nufgyqmvbu = j13;
        }
    }

    public Surface ppxfxbqfkf() {
        return this.f55355eablkybsjg;
    }

    public void zoijcleaow() {
        synchronized (this.f55357iobyxmoadg) {
            try {
                this.f55361wkgbmnqykc = true;
                if (Build.VERSION.SDK_INT >= 29 && this.f55356gxszxtbevo) {
                    this.f55360ppxfxbqfkf.eablkybsjg();
                    this.f55360ppxfxbqfkf.close();
                    zoijcleaow.iobyxmoadg(this.f55362zoijcleaow);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
