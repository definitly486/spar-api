package zdlpuopuiu;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class wwaezpbzkn extends lmojexxdyd {
    wwaezpbzkn(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    static wwaezpbzkn eablkybsjg(CameraDevice cameraDevice, Handler handler) {
        return new wwaezpbzkn(cameraDevice, new pkzmftpjix.iobyxmoadg(handler));
    }

    @Override // zdlpuopuiu.zynmafqrjb.iobyxmoadg
    public void iobyxmoadg(yggfygwlhe.vdvldrhtss vdvldrhtssVar) throws CameraAccessExceptionCompat {
        pkzmftpjix.ppxfxbqfkf(this.f129741iobyxmoadg, vdvldrhtssVar);
        lqeggnwhkg.ppxfxbqfkf ppxfxbqfkfVar = new lqeggnwhkg.ppxfxbqfkf(vdvldrhtssVar.iobyxmoadg(), vdvldrhtssVar.eablkybsjg());
        List listPpxfxbqfkf = vdvldrhtssVar.ppxfxbqfkf();
        Handler handler = ((pkzmftpjix.iobyxmoadg) u1.nufgyqmvbu.gxszxtbevo((pkzmftpjix.iobyxmoadg) this.f129742zoijcleaow)).f129743iobyxmoadg;
        yggfygwlhe.btonecajqb btonecajqbVarZoijcleaow = vdvldrhtssVar.zoijcleaow();
        try {
            if (btonecajqbVarZoijcleaow != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) btonecajqbVarZoijcleaow.iobyxmoadg();
                u1.nufgyqmvbu.gxszxtbevo(inputConfiguration);
                this.f129741iobyxmoadg.createReprocessableCaptureSessionByConfigurations(inputConfiguration, yggfygwlhe.vdvldrhtss.nufgyqmvbu(listPpxfxbqfkf), ppxfxbqfkfVar, handler);
            } else if (vdvldrhtssVar.wkgbmnqykc() == 1) {
                this.f129741iobyxmoadg.createConstrainedHighSpeedCaptureSession(pkzmftpjix.wkgbmnqykc(listPpxfxbqfkf), ppxfxbqfkfVar, handler);
            } else {
                this.f129741iobyxmoadg.createCaptureSessionByOutputConfigurations(yggfygwlhe.vdvldrhtss.nufgyqmvbu(listPpxfxbqfkf), ppxfxbqfkfVar, handler);
            }
        } catch (CameraAccessException e13) {
            throw CameraAccessExceptionCompat.dxjokdxxww(e13);
        }
    }
}
