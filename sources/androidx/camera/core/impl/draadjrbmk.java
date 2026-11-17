package androidx.camera.core.impl;

import android.graphics.Rect;
import lereixgezr.cllcsxoeiz;

/* JADX INFO: loaded from: classes.dex */
public abstract class draadjrbmk implements CameraControlInternal {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final CameraControlInternal f3753zoijcleaow;

    public draadjrbmk(CameraControlInternal cameraControlInternal) {
        this.f3753zoijcleaow = cameraControlInternal;
    }

    @Override // androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.wkgbmnqykc dxjokdxxww(lereixgezr.esjtqupxsv esjtqupxsvVar) {
        return this.f3753zoijcleaow.dxjokdxxww(esjtqupxsvVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public btonecajqb eablkybsjg() {
        return this.f3753zoijcleaow.eablkybsjg();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void gxszxtbevo(cllcsxoeiz.gxszxtbevo gxszxtbevoVar) {
        this.f3753zoijcleaow.gxszxtbevo(gxszxtbevoVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void iobyxmoadg(jyumaefscl.zoijcleaow zoijcleaowVar) {
        this.f3753zoijcleaow.iobyxmoadg(zoijcleaowVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void lqeggnwhkg(btonecajqb btonecajqbVar) {
        this.f3753zoijcleaow.lqeggnwhkg(btonecajqbVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void nufgyqmvbu() {
        this.f3753zoijcleaow.nufgyqmvbu();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void ppxfxbqfkf(int i13) {
        this.f3753zoijcleaow.ppxfxbqfkf(i13);
    }

    @Override // androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykc(boolean z13) {
        return this.f3753zoijcleaow.wkgbmnqykc(z13);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public Rect zoijcleaow() {
        return this.f3753zoijcleaow.zoijcleaow();
    }
}
