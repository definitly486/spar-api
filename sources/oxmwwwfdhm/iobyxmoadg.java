package oxmwwwfdhm;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.kcexrzcfyt;
import androidx.camera.core.impl.oxmwwwfdhm;
import androidx.camera.core.impl.vdvldrhtss;
import esjtqupxsv.btonecajqb;
import lereixgezr.cqumvgiudr;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg extends btonecajqb {

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    public static final androidx.camera.core.impl.btonecajqb.iobyxmoadg f75076pkzmftpjix = androidx.camera.core.impl.btonecajqb.iobyxmoadg.iobyxmoadg("camera2.captureRequest.templateType", Integer.TYPE);

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    public static final androidx.camera.core.impl.btonecajqb.iobyxmoadg f75073hcddaimhww = androidx.camera.core.impl.btonecajqb.iobyxmoadg.iobyxmoadg("camera2.cameraCaptureSession.streamUseCase", Long.TYPE);

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    public static final androidx.camera.core.impl.btonecajqb.iobyxmoadg f75075jpowsppfya = androidx.camera.core.impl.btonecajqb.iobyxmoadg.iobyxmoadg("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    public static final androidx.camera.core.impl.btonecajqb.iobyxmoadg f75074hkdspvbjdz = androidx.camera.core.impl.btonecajqb.iobyxmoadg.iobyxmoadg("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    public static final androidx.camera.core.impl.btonecajqb.iobyxmoadg f75071cllcsxoeiz = androidx.camera.core.impl.btonecajqb.iobyxmoadg.iobyxmoadg("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    public static final androidx.camera.core.impl.btonecajqb.iobyxmoadg f75072dsvhmnatus = androidx.camera.core.impl.btonecajqb.iobyxmoadg.iobyxmoadg("camera2.captureRequest.tag", Object.class);

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    public static final androidx.camera.core.impl.btonecajqb.iobyxmoadg f75077wypolnanlu = androidx.camera.core.impl.btonecajqb.iobyxmoadg.iobyxmoadg("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* JADX INFO: renamed from: oxmwwwfdhm.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1637iobyxmoadg implements cqumvgiudr {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final oxmwwwfdhm f75078iobyxmoadg = oxmwwwfdhm.jhduphickx();

        public C1637iobyxmoadg eablkybsjg(androidx.camera.core.impl.btonecajqb btonecajqbVar, androidx.camera.core.impl.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
            for (androidx.camera.core.impl.btonecajqb.iobyxmoadg iobyxmoadgVar : btonecajqbVar.eablkybsjg()) {
                this.f75078iobyxmoadg.ojitshcjhn(iobyxmoadgVar, ppxfxbqfkfVar, btonecajqbVar.iobyxmoadg(iobyxmoadgVar));
            }
            return this;
        }

        public C1637iobyxmoadg gxszxtbevo(CaptureRequest.Key key, Object obj) {
            this.f75078iobyxmoadg.vdvldrhtss(iobyxmoadg.crxdokpmqz(key), obj);
            return this;
        }

        @Override // lereixgezr.cqumvgiudr
        public vdvldrhtss iobyxmoadg() {
            return this.f75078iobyxmoadg;
        }

        public C1637iobyxmoadg lqeggnwhkg(CaptureRequest.Key key, Object obj, androidx.camera.core.impl.btonecajqb.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f75078iobyxmoadg.ojitshcjhn(iobyxmoadg.crxdokpmqz(key), ppxfxbqfkfVar, obj);
            return this;
        }

        public C1637iobyxmoadg ppxfxbqfkf(androidx.camera.core.impl.btonecajqb btonecajqbVar) {
            eablkybsjg(btonecajqbVar, androidx.camera.core.impl.btonecajqb.ppxfxbqfkf.OPTIONAL);
            return this;
        }

        public iobyxmoadg zoijcleaow() {
            return new iobyxmoadg(kcexrzcfyt.ribwqtqdhb(this.f75078iobyxmoadg));
        }
    }

    public iobyxmoadg(androidx.camera.core.impl.btonecajqb btonecajqbVar) {
        super(btonecajqbVar);
    }

    public static androidx.camera.core.impl.btonecajqb.iobyxmoadg crxdokpmqz(CaptureRequest.Key key) {
        return androidx.camera.core.impl.btonecajqb.iobyxmoadg.zoijcleaow("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public CameraCaptureSession.CaptureCallback ikoacuggdj(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) getConfig().lqeggnwhkg(f75071cllcsxoeiz, captureCallback);
    }

    public String jhduphickx(String str) {
        return (String) getConfig().lqeggnwhkg(f75077wypolnanlu, str);
    }

    public btonecajqb jlmebxxoox() {
        return btonecajqb.iobyxmoadg.eablkybsjg(getConfig()).ppxfxbqfkf();
    }

    public long jztzpxfvev(long j13) {
        return ((Long) getConfig().lqeggnwhkg(f75073hcddaimhww, Long.valueOf(j13))).longValue();
    }

    public CameraCaptureSession.StateCallback okpsazkaxt(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) getConfig().lqeggnwhkg(f75074hkdspvbjdz, stateCallback);
    }

    public int ribwqtqdhb(int i13) {
        return ((Integer) getConfig().lqeggnwhkg(f75076pkzmftpjix, Integer.valueOf(i13))).intValue();
    }

    public CameraDevice.StateCallback vipkmwdibw(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) getConfig().lqeggnwhkg(f75075jpowsppfya, stateCallback);
    }
}
