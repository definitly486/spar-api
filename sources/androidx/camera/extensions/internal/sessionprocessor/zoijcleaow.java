package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow extends ImageReaderOutputConfig {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Size f4087eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f4088gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f4089iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f4090lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f4091ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f4092wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f4093zoijcleaow;

    zoijcleaow(int i13, int i14, String str, List list, Size size, int i15, int i16) {
        this.f4089iobyxmoadg = i13;
        this.f4093zoijcleaow = i14;
        this.f4091ppxfxbqfkf = str;
        if (list == null) {
            throw new NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.f4092wkgbmnqykc = list;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f4087eablkybsjg = size;
        this.f4088gxszxtbevo = i15;
        this.f4090lqeggnwhkg = i16;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageReaderOutputConfig)) {
            return false;
        }
        ImageReaderOutputConfig imageReaderOutputConfig = (ImageReaderOutputConfig) obj;
        return this.f4089iobyxmoadg == imageReaderOutputConfig.getId() && this.f4093zoijcleaow == imageReaderOutputConfig.getSurfaceGroupId() && ((str = this.f4091ppxfxbqfkf) != null ? str.equals(imageReaderOutputConfig.getPhysicalCameraId()) : imageReaderOutputConfig.getPhysicalCameraId() == null) && this.f4092wkgbmnqykc.equals(imageReaderOutputConfig.getSurfaceSharingOutputConfigs()) && this.f4087eablkybsjg.equals(imageReaderOutputConfig.getSize()) && this.f4088gxszxtbevo == imageReaderOutputConfig.getImageFormat() && this.f4090lqeggnwhkg == imageReaderOutputConfig.getMaxImages();
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig, androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public int getId() {
        return this.f4089iobyxmoadg;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    int getImageFormat() {
        return this.f4088gxszxtbevo;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    int getMaxImages() {
        return this.f4090lqeggnwhkg;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig, androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public String getPhysicalCameraId() {
        return this.f4091ppxfxbqfkf;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    Size getSize() {
        return this.f4087eablkybsjg;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig, androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public int getSurfaceGroupId() {
        return this.f4093zoijcleaow;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig, androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public List getSurfaceSharingOutputConfigs() {
        return this.f4092wkgbmnqykc;
    }

    public int hashCode() {
        int i13 = (((this.f4089iobyxmoadg ^ 1000003) * 1000003) ^ this.f4093zoijcleaow) * 1000003;
        String str = this.f4091ppxfxbqfkf;
        return ((((((((i13 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f4092wkgbmnqykc.hashCode()) * 1000003) ^ this.f4087eablkybsjg.hashCode()) * 1000003) ^ this.f4088gxszxtbevo) * 1000003) ^ this.f4090lqeggnwhkg;
    }

    public String toString() {
        return "ImageReaderOutputConfig{id=" + this.f4089iobyxmoadg + ", surfaceGroupId=" + this.f4093zoijcleaow + ", physicalCameraId=" + this.f4091ppxfxbqfkf + ", surfaceSharingOutputConfigs=" + this.f4092wkgbmnqykc + ", size=" + this.f4087eablkybsjg + ", imageFormat=" + this.f4088gxszxtbevo + ", maxImages=" + this.f4090lqeggnwhkg + "}";
    }
}
