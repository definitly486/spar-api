package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc extends SurfaceOutputConfig {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Surface f4078eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f4079iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f4080ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f4081wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f4082zoijcleaow;

    wkgbmnqykc(int i13, int i14, String str, List list, Surface surface) {
        this.f4079iobyxmoadg = i13;
        this.f4082zoijcleaow = i14;
        this.f4080ppxfxbqfkf = str;
        if (list == null) {
            throw new NullPointerException("Null surfaceSharingOutputConfigs");
        }
        this.f4081wkgbmnqykc = list;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f4078eablkybsjg = surface;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceOutputConfig)) {
            return false;
        }
        SurfaceOutputConfig surfaceOutputConfig = (SurfaceOutputConfig) obj;
        return this.f4079iobyxmoadg == surfaceOutputConfig.getId() && this.f4082zoijcleaow == surfaceOutputConfig.getSurfaceGroupId() && ((str = this.f4080ppxfxbqfkf) != null ? str.equals(surfaceOutputConfig.getPhysicalCameraId()) : surfaceOutputConfig.getPhysicalCameraId() == null) && this.f4081wkgbmnqykc.equals(surfaceOutputConfig.getSurfaceSharingOutputConfigs()) && this.f4078eablkybsjg.equals(surfaceOutputConfig.getSurface());
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig, androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public int getId() {
        return this.f4079iobyxmoadg;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig, androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public String getPhysicalCameraId() {
        return this.f4080ppxfxbqfkf;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig
    Surface getSurface() {
        return this.f4078eablkybsjg;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig, androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public int getSurfaceGroupId() {
        return this.f4082zoijcleaow;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig, androidx.camera.extensions.internal.sessionprocessor.gxszxtbevo
    public List getSurfaceSharingOutputConfigs() {
        return this.f4081wkgbmnqykc;
    }

    public int hashCode() {
        int i13 = (((this.f4079iobyxmoadg ^ 1000003) * 1000003) ^ this.f4082zoijcleaow) * 1000003;
        String str = this.f4080ppxfxbqfkf;
        return ((((i13 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f4081wkgbmnqykc.hashCode()) * 1000003) ^ this.f4078eablkybsjg.hashCode();
    }

    public String toString() {
        return "SurfaceOutputConfig{id=" + this.f4079iobyxmoadg + ", surfaceGroupId=" + this.f4082zoijcleaow + ", physicalCameraId=" + this.f4080ppxfxbqfkf + ", surfaceSharingOutputConfigs=" + this.f4081wkgbmnqykc + ", surface=" + this.f4078eablkybsjg + "}";
    }
}
