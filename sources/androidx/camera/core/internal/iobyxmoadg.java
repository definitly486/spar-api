package androidx.camera.core.internal;

import istkbnxepw.hkdspvbjdz;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg extends CameraUseCaseAdapter.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f3923iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final hkdspvbjdz f3924zoijcleaow;

    iobyxmoadg(String str, hkdspvbjdz hkdspvbjdzVar) {
        if (str == null) {
            throw new NullPointerException("Null cameraIdString");
        }
        this.f3923iobyxmoadg = str;
        if (hkdspvbjdzVar == null) {
            throw new NullPointerException("Null cameraConfigId");
        }
        this.f3924zoijcleaow = hkdspvbjdzVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraUseCaseAdapter.iobyxmoadg)) {
            return false;
        }
        CameraUseCaseAdapter.iobyxmoadg iobyxmoadgVar = (CameraUseCaseAdapter.iobyxmoadg) obj;
        return this.f3923iobyxmoadg.equals(iobyxmoadgVar.ppxfxbqfkf()) && this.f3924zoijcleaow.equals(iobyxmoadgVar.zoijcleaow());
    }

    public int hashCode() {
        return ((this.f3923iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f3924zoijcleaow.hashCode();
    }

    @Override // androidx.camera.core.internal.CameraUseCaseAdapter.iobyxmoadg
    public String ppxfxbqfkf() {
        return this.f3923iobyxmoadg;
    }

    public String toString() {
        return "CameraId{cameraIdString=" + this.f3923iobyxmoadg + ", cameraConfigId=" + this.f3924zoijcleaow + "}";
    }

    @Override // androidx.camera.core.internal.CameraUseCaseAdapter.iobyxmoadg
    public hkdspvbjdz zoijcleaow() {
        return this.f3924zoijcleaow;
    }
}
