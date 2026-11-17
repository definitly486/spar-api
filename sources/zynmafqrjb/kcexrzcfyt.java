package zynmafqrjb;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.utils.ImageUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class kcexrzcfyt implements jpowsppfya.yggfygwlhe {
    @Override // jpowsppfya.yggfygwlhe
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public Bitmap apply(jpowsppfya.jyumaefscl jyumaefsclVar) throws Throwable {
        androidx.camera.core.vdvldrhtss vdvldrhtssVar;
        Bitmap bitmapDxjokdxxww;
        androidx.camera.core.vdvldrhtss vdvldrhtssVar2 = null;
        try {
            try {
                if (jyumaefsclVar.eablkybsjg() == 35) {
                    androidx.camera.core.agtfadlqog agtfadlqogVar = (androidx.camera.core.agtfadlqog) jyumaefsclVar.ppxfxbqfkf();
                    boolean z13 = jyumaefsclVar.gxszxtbevo() % 180 != 0;
                    vdvldrhtssVar = new androidx.camera.core.vdvldrhtss(androidx.camera.core.ojitshcjhn.iobyxmoadg(z13 ? agtfadlqogVar.getHeight() : agtfadlqogVar.getWidth(), z13 ? agtfadlqogVar.getWidth() : agtfadlqogVar.getHeight(), 1, 2));
                    try {
                        androidx.camera.core.agtfadlqog agtfadlqogVarLqeggnwhkg = ImageProcessingUtil.lqeggnwhkg(agtfadlqogVar, vdvldrhtssVar, ByteBuffer.allocateDirect(agtfadlqogVar.getWidth() * agtfadlqogVar.getHeight() * 4), jyumaefsclVar.gxszxtbevo(), false);
                        agtfadlqogVar.close();
                        if (agtfadlqogVarLqeggnwhkg == null) {
                            throw new ImageCaptureException(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapDxjokdxxww = ImageUtil.iobyxmoadg(agtfadlqogVarLqeggnwhkg);
                        agtfadlqogVarLqeggnwhkg.close();
                    } catch (UnsupportedOperationException e13) {
                        e = e13;
                        throw new ImageCaptureException(0, "Can't convert " + (jyumaefsclVar.eablkybsjg() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th2) {
                        th = th2;
                        vdvldrhtssVar2 = vdvldrhtssVar;
                        if (vdvldrhtssVar2 != null) {
                            vdvldrhtssVar2.close();
                        }
                        throw th;
                    }
                } else {
                    if (jyumaefsclVar.eablkybsjg() != 256) {
                        throw new IllegalArgumentException("Invalid postview image format : " + jyumaefsclVar.eablkybsjg());
                    }
                    androidx.camera.core.agtfadlqog agtfadlqogVar2 = (androidx.camera.core.agtfadlqog) jyumaefsclVar.ppxfxbqfkf();
                    Bitmap bitmapIobyxmoadg = ImageUtil.iobyxmoadg(agtfadlqogVar2);
                    agtfadlqogVar2.close();
                    vdvldrhtssVar = null;
                    bitmapDxjokdxxww = ImageUtil.dxjokdxxww(bitmapIobyxmoadg, jyumaefsclVar.gxszxtbevo());
                }
                if (vdvldrhtssVar != null) {
                    vdvldrhtssVar.close();
                }
                return bitmapDxjokdxxww;
            } catch (UnsupportedOperationException e14) {
                e = e14;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
