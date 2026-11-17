package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.camera.core.CameraControl;
import java.util.List;
import lereixgezr.cllcsxoeiz;

/* JADX INFO: loaded from: classes.dex */
public interface CameraControlInternal extends CameraControl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final CameraControlInternal f3707iobyxmoadg = new iobyxmoadg();

    public static final class CameraControlException extends Exception {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private istkbnxepw.btonecajqb f3708zdlpuopuiu;

        public CameraControlException(istkbnxepw.btonecajqb btonecajqbVar) {
            this.f3708zdlpuopuiu = btonecajqbVar;
        }
    }

    class iobyxmoadg implements CameraControlInternal {
        iobyxmoadg() {
        }

        @Override // androidx.camera.core.CameraControl
        public com.google.common.util.concurrent.wkgbmnqykc dxjokdxxww(lereixgezr.esjtqupxsv esjtqupxsvVar) {
            return iozdgvuglv.gtknphoqwx.draadjrbmk(lereixgezr.lereixgezr.zoijcleaow());
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public btonecajqb eablkybsjg() {
            return null;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void iobyxmoadg(jyumaefscl.zoijcleaow zoijcleaowVar) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void lqeggnwhkg(btonecajqb btonecajqbVar) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void nufgyqmvbu() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void ppxfxbqfkf(int i13) {
        }

        @Override // androidx.camera.core.CameraControl
        public com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykc(boolean z13) {
            return iozdgvuglv.gtknphoqwx.draadjrbmk(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public Rect zoijcleaow() {
            return new Rect();
        }
    }

    public interface zoijcleaow {
        void iobyxmoadg();

        void zoijcleaow(List list);
    }

    btonecajqb eablkybsjg();

    default void gxszxtbevo(cllcsxoeiz.gxszxtbevo gxszxtbevoVar) {
    }

    void iobyxmoadg(jyumaefscl.zoijcleaow zoijcleaowVar);

    void lqeggnwhkg(btonecajqb btonecajqbVar);

    void nufgyqmvbu();

    void ppxfxbqfkf(int i13);

    Rect zoijcleaow();
}
