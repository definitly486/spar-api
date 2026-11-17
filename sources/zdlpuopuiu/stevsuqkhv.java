package zdlpuopuiu;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class stevsuqkhv extends wypolnanlu {
    stevsuqkhv(Context context) {
        super(context);
    }

    @Override // zdlpuopuiu.kegysxyocb, zdlpuopuiu.cllcsxoeiz.zoijcleaow
    public Set ppxfxbqfkf() throws CameraAccessExceptionCompat {
        try {
            return this.f129722iobyxmoadg.getConcurrentCameraIds();
        } catch (CameraAccessException e13) {
            throw CameraAccessExceptionCompat.dxjokdxxww(e13);
        }
    }
}
