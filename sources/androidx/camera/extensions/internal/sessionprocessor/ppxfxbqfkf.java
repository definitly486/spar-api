package androidx.camera.extensions.internal.sessionprocessor;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf extends MultiResolutionImageReaderOutputConfig {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f4065eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f4066gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f4067iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f4068ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f4069wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f4070zoijcleaow;

    ppxfxbqfkf(int i13, int i14, String str, List list, int i15, int i16) {
        this.f4067iobyxmoadg = i13;
        this.f4070zoijcleaow = i14;
        this.f4068ppxfxbqfkf = str;
        if (list == null) {
            throw new NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.f4069wkgbmnqykc = list;
        this.f4065eablkybsjg = i15;
        this.f4066gxszxtbevo = i16;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MultiResolutionImageReaderOutputConfig)) {
            return false;
        }
        MultiResolutionImageReaderOutputConfig multiResolutionImageReaderOutputConfig = (MultiResolutionImageReaderOutputConfig) obj;
        return this.f4067iobyxmoadg == multiResolutionImageReaderOutputConfig.getId() && this.f4070zoijcleaow == multiResolutionImageReaderOutputConfig.getSurfaceGroupId() && ((str = this.f4068ppxfxbqfkf) != null ? str.equals(multiResolutionImageReaderOutputConfig.getPhysicalCameraId()) : multiResolutionImageReaderOutputConfig.getPhysicalCameraId() == null) && this.f4069wkgbmnqykc.equals(multiResolutionImageReaderOutputConfig.getSurfaceSharingOutputConfigs()) && this.f4065eablkybsjg == multiResolutionImageReaderOutputConfig.getImageFormat() && this.f4066gxszxtbevo == multiResolutionImageReaderOutputConfig.getMaxImages();
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig, androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public int getId() {
        return this.f4067iobyxmoadg;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig
    int getImageFormat() {
        return this.f4065eablkybsjg;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig
    int getMaxImages() {
        return this.f4066gxszxtbevo;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig, androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public String getPhysicalCameraId() {
        return this.f4068ppxfxbqfkf;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig, androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public int getSurfaceGroupId() {
        return this.f4070zoijcleaow;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig, androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public List getSurfaceSharingOutputConfigs() {
        return this.f4069wkgbmnqykc;
    }

    public int hashCode() {
        int i13 = (((this.f4067iobyxmoadg ^ 1000003) * 1000003) ^ this.f4070zoijcleaow) * 1000003;
        String str = this.f4068ppxfxbqfkf;
        return ((((((i13 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f4069wkgbmnqykc.hashCode()) * 1000003) ^ this.f4065eablkybsjg) * 1000003) ^ this.f4066gxszxtbevo;
    }

    public String toString() {
        return "MultiResolutionImageReaderOutputConfig{id=" + this.f4067iobyxmoadg + ", surfaceGroupId=" + this.f4070zoijcleaow + ", physicalCameraId=" + this.f4068ppxfxbqfkf + ", surfaceSharingOutputConfigs=" + this.f4069wkgbmnqykc + ", imageFormat=" + this.f4065eablkybsjg + ", maxImages=" + this.f4066gxszxtbevo + "}";
    }
}
