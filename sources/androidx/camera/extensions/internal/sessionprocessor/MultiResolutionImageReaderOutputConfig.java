package androidx.camera.extensions.internal.sessionprocessor;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class MultiResolutionImageReaderOutputConfig implements gxszxtbevo {
    static MultiResolutionImageReaderOutputConfig create(int i13, int i14, String str, List<gxszxtbevo> list, int i15, int i16) {
        return new ppxfxbqfkf(i13, i14, str, list, i15, i16);
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public abstract /* synthetic */ int getId();

    abstract int getImageFormat();

    abstract int getMaxImages();

    @Override // androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public abstract /* synthetic */ String getPhysicalCameraId();

    @Override // androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public abstract /* synthetic */ int getSurfaceGroupId();

    @Override // androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public abstract /* synthetic */ List getSurfaceSharingOutputConfigs();
}
