package zdlpuopuiu;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class esjtqupxsv implements pmvmpeiblj.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected final CameraCharacteristics f129703iobyxmoadg;

    esjtqupxsv(CameraCharacteristics cameraCharacteristics) {
        this.f129703iobyxmoadg = cameraCharacteristics;
    }

    @Override // zdlpuopuiu.pmvmpeiblj.iobyxmoadg
    public CameraCharacteristics iobyxmoadg() {
        return this.f129703iobyxmoadg;
    }

    @Override // zdlpuopuiu.pmvmpeiblj.iobyxmoadg
    public Set ppxfxbqfkf() {
        return Collections.emptySet();
    }

    @Override // zdlpuopuiu.pmvmpeiblj.iobyxmoadg
    public Object zoijcleaow(CameraCharacteristics.Key key) {
        return this.f129703iobyxmoadg.get(key);
    }
}
