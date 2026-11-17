package tzroggbefp;

import androidx.camera.core.CameraControl;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.istkbnxepw;
import androidx.lifecycle.rgvfuqvkyq;
import androidx.lifecycle.vdvldrhtss;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import lereixgezr.agtfadlqog;
import lereixgezr.dxjokdxxww;
import lereixgezr.roivzttewh;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow implements rgvfuqvkyq, dxjokdxxww {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final CameraUseCaseAdapter f112389jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final vdvldrhtss f112390yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Object f112391zdlpuopuiu = new Object();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private volatile boolean f112388iwizpuwonk = false;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f112386cqumvgiudr = false;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f112387esjtqupxsv = false;

    zoijcleaow(vdvldrhtss vdvldrhtssVar, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.f112390yggfygwlhe = vdvldrhtssVar;
        this.f112389jyumaefscl = cameraUseCaseAdapter;
        if (vdvldrhtssVar.getLifecycle().zoijcleaow().wkgbmnqykc(gtknphoqwx.zoijcleaow.STARTED)) {
            cameraUseCaseAdapter.lqeggnwhkg();
        } else {
            cameraUseCaseAdapter.pmvmpeiblj();
        }
        vdvldrhtssVar.getLifecycle().iobyxmoadg(this);
    }

    void cqumvgiudr() {
        synchronized (this.f112391zdlpuopuiu) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f112389jyumaefscl;
            cameraUseCaseAdapter.ribwqtqdhb(cameraUseCaseAdapter.pkzmftpjix());
        }
    }

    public void esjtqupxsv() {
        synchronized (this.f112391zdlpuopuiu) {
            try {
                if (this.f112386cqumvgiudr) {
                    this.f112386cqumvgiudr = false;
                    if (this.f112390yggfygwlhe.getLifecycle().zoijcleaow().wkgbmnqykc(gtknphoqwx.zoijcleaow.STARTED)) {
                        onStart(this.f112390yggfygwlhe);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // lereixgezr.dxjokdxxww
    public CameraControl iobyxmoadg() {
        return this.f112389jyumaefscl.iobyxmoadg();
    }

    public void iwizpuwonk() {
        synchronized (this.f112391zdlpuopuiu) {
            try {
                if (this.f112386cqumvgiudr) {
                    return;
                }
                onStop(this.f112390yggfygwlhe);
                this.f112386cqumvgiudr = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean jyumaefscl(roivzttewh roivzttewhVar) {
        boolean zContains;
        synchronized (this.f112391zdlpuopuiu) {
            zContains = this.f112389jyumaefscl.pkzmftpjix().contains(roivzttewhVar);
        }
        return zContains;
    }

    public vdvldrhtss kcexrzcfyt() {
        vdvldrhtss vdvldrhtssVar;
        synchronized (this.f112391zdlpuopuiu) {
            vdvldrhtssVar = this.f112390yggfygwlhe;
        }
        return vdvldrhtssVar;
    }

    @istkbnxepw(gtknphoqwx.iobyxmoadg.ON_DESTROY)
    public void onDestroy(vdvldrhtss vdvldrhtssVar) {
        synchronized (this.f112391zdlpuopuiu) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f112389jyumaefscl;
            cameraUseCaseAdapter.ribwqtqdhb(cameraUseCaseAdapter.pkzmftpjix());
        }
    }

    @istkbnxepw(gtknphoqwx.iobyxmoadg.ON_PAUSE)
    public void onPause(vdvldrhtss vdvldrhtssVar) {
        this.f112389jyumaefscl.btonecajqb(false);
    }

    @istkbnxepw(gtknphoqwx.iobyxmoadg.ON_RESUME)
    public void onResume(vdvldrhtss vdvldrhtssVar) {
        this.f112389jyumaefscl.btonecajqb(true);
    }

    @istkbnxepw(gtknphoqwx.iobyxmoadg.ON_START)
    public void onStart(vdvldrhtss vdvldrhtssVar) {
        synchronized (this.f112391zdlpuopuiu) {
            try {
                if (!this.f112386cqumvgiudr && !this.f112387esjtqupxsv) {
                    this.f112389jyumaefscl.lqeggnwhkg();
                    this.f112388iwizpuwonk = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @istkbnxepw(gtknphoqwx.iobyxmoadg.ON_STOP)
    public void onStop(vdvldrhtss vdvldrhtssVar) {
        synchronized (this.f112391zdlpuopuiu) {
            try {
                if (!this.f112386cqumvgiudr && !this.f112387esjtqupxsv) {
                    this.f112389jyumaefscl.pmvmpeiblj();
                    this.f112388iwizpuwonk = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void ppxfxbqfkf(Collection collection) {
        synchronized (this.f112391zdlpuopuiu) {
            this.f112389jyumaefscl.eablkybsjg(collection);
        }
    }

    public CameraUseCaseAdapter wkgbmnqykc() {
        return this.f112389jyumaefscl;
    }

    public List yggfygwlhe() {
        List listUnmodifiableList;
        synchronized (this.f112391zdlpuopuiu) {
            listUnmodifiableList = Collections.unmodifiableList(this.f112389jyumaefscl.pkzmftpjix());
        }
        return listUnmodifiableList;
    }

    agtfadlqog zdlpuopuiu() {
        return this.f112389jyumaefscl.lmojexxdyd();
    }

    @Override // lereixgezr.dxjokdxxww
    public agtfadlqog zoijcleaow() {
        return this.f112389jyumaefscl.zoijcleaow();
    }
}
