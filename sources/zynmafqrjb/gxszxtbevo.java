package zynmafqrjb;

import androidx.camera.core.ImageCaptureException;

/* JADX INFO: loaded from: classes.dex */
final class gxszxtbevo extends stevsuqkhv.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f131617iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ImageCaptureException f131618zoijcleaow;

    gxszxtbevo(int i13, ImageCaptureException imageCaptureException) {
        this.f131617iobyxmoadg = i13;
        if (imageCaptureException == null) {
            throw new NullPointerException("Null imageCaptureException");
        }
        this.f131618zoijcleaow = imageCaptureException;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof stevsuqkhv.iobyxmoadg)) {
            return false;
        }
        stevsuqkhv.iobyxmoadg iobyxmoadgVar = (stevsuqkhv.iobyxmoadg) obj;
        return this.f131617iobyxmoadg == iobyxmoadgVar.zoijcleaow() && this.f131618zoijcleaow.equals(iobyxmoadgVar.iobyxmoadg());
    }

    public int hashCode() {
        return ((this.f131617iobyxmoadg ^ 1000003) * 1000003) ^ this.f131618zoijcleaow.hashCode();
    }

    @Override // zynmafqrjb.stevsuqkhv.iobyxmoadg
    ImageCaptureException iobyxmoadg() {
        return this.f131618zoijcleaow;
    }

    public String toString() {
        return "CaptureError{requestId=" + this.f131617iobyxmoadg + ", imageCaptureException=" + this.f131618zoijcleaow + "}";
    }

    @Override // zynmafqrjb.stevsuqkhv.iobyxmoadg
    int zoijcleaow() {
        return this.f131617iobyxmoadg;
    }
}
