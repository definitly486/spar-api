package istkbnxepw;

import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import java.util.Collection;
import lereixgezr.roivzttewh;

/* JADX INFO: loaded from: classes.dex */
public interface iwizpuwonk extends lereixgezr.dxjokdxxww, roivzttewh.zoijcleaow {

    public enum iobyxmoadg {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);


        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final boolean f49347zdlpuopuiu;

        iobyxmoadg(boolean z13) {
            this.f49347zdlpuopuiu = z13;
        }

        boolean wkgbmnqykc() {
            return this.f49347zdlpuopuiu;
        }
    }

    default boolean agtfadlqog() {
        return zoijcleaow().ppxfxbqfkf() == 0;
    }

    default void btonecajqb(boolean z13) {
    }

    void draadjrbmk(Collection collection);

    default androidx.camera.core.impl.gxszxtbevo dxjokdxxww() {
        return kcexrzcfyt.iobyxmoadg();
    }

    void gtknphoqwx(Collection collection);

    CameraControlInternal gxszxtbevo();

    @Override // lereixgezr.dxjokdxxww
    default CameraControl iobyxmoadg() {
        return gxszxtbevo();
    }

    default void ojitshcjhn(androidx.camera.core.impl.gxszxtbevo gxszxtbevoVar) {
    }

    default void oxmwwwfdhm(boolean z13) {
    }

    sopmlzcsov rgvfuqvkyq();

    default boolean vdvldrhtss() {
        return true;
    }

    jyumaefscl wflxmlrfwp();

    @Override // lereixgezr.dxjokdxxww
    default lereixgezr.agtfadlqog zoijcleaow() {
        return wflxmlrfwp();
    }
}
