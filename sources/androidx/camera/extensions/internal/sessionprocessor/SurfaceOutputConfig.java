package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class SurfaceOutputConfig implements gxszxtbevo {
    static SurfaceOutputConfig create(int i13, int i14, String str, List<gxszxtbevo> list, Surface surface) {
        return new wkgbmnqykc(i13, i14, str, list, surface);
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public abstract /* synthetic */ int getId();

    @Override // androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public abstract /* synthetic */ String getPhysicalCameraId();

    abstract Surface getSurface();

    @Override // androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public abstract /* synthetic */ int getSurfaceGroupId();

    @Override // androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public abstract /* synthetic */ List getSurfaceSharingOutputConfigs();

    static SurfaceOutputConfig create(int i13, Surface surface) {
        return create(i13, -1, null, Collections.emptyList(), surface);
    }
}
