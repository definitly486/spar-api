package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImageReaderOutputConfig implements gxszxtbevo {
    static ImageReaderOutputConfig create(int i13, int i14, String str, List<gxszxtbevo> list, Size size, int i15, int i16) {
        return new zoijcleaow(i13, i14, str, list, size, i15, i16);
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public abstract /* synthetic */ int getId();

    abstract int getImageFormat();

    abstract int getMaxImages();

    @Override // androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public abstract /* synthetic */ String getPhysicalCameraId();

    abstract Size getSize();

    @Override // androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public abstract /* synthetic */ int getSurfaceGroupId();

    @Override // androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public abstract /* synthetic */ List getSurfaceSharingOutputConfigs();

    static ImageReaderOutputConfig create(int i13, Size size, int i14, int i15) {
        return new zoijcleaow(i13, -1, null, Collections.emptyList(), size, i14, i15);
    }
}
