package yggfygwlhe;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public class ojitshcjhn extends agtfadlqog {
    ojitshcjhn(int i13, Surface surface) {
        this(new OutputConfiguration(i13, surface));
    }

    static ojitshcjhn gtknphoqwx(OutputConfiguration outputConfiguration) {
        return new ojitshcjhn(outputConfiguration);
    }

    @Override // yggfygwlhe.agtfadlqog, yggfygwlhe.wflxmlrfwp, yggfygwlhe.gtknphoqwx.iobyxmoadg
    public /* bridge */ /* synthetic */ void eablkybsjg(String str) {
        super.eablkybsjg(str);
    }

    @Override // yggfygwlhe.rgvfuqvkyq
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // yggfygwlhe.agtfadlqog, yggfygwlhe.wflxmlrfwp, yggfygwlhe.gtknphoqwx.iobyxmoadg
    public /* bridge */ /* synthetic */ String getPhysicalCameraId() {
        return super.getPhysicalCameraId();
    }

    @Override // yggfygwlhe.wflxmlrfwp, yggfygwlhe.gtknphoqwx.iobyxmoadg
    public /* bridge */ /* synthetic */ void gxszxtbevo() {
        super.gxszxtbevo();
    }

    @Override // yggfygwlhe.rgvfuqvkyq
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // yggfygwlhe.draadjrbmk, yggfygwlhe.gtknphoqwx.iobyxmoadg
    public /* bridge */ /* synthetic */ Surface iobyxmoadg() {
        return super.iobyxmoadg();
    }

    @Override // yggfygwlhe.rgvfuqvkyq, yggfygwlhe.gtknphoqwx.iobyxmoadg
    public void lqeggnwhkg(int i13) {
        ((OutputConfiguration) nufgyqmvbu()).setMirrorMode(i13);
    }

    @Override // yggfygwlhe.agtfadlqog, yggfygwlhe.wflxmlrfwp, yggfygwlhe.draadjrbmk, yggfygwlhe.gtknphoqwx.iobyxmoadg
    public Object nufgyqmvbu() {
        u1.nufgyqmvbu.iobyxmoadg(this.f124990iobyxmoadg instanceof OutputConfiguration);
        return this.f124990iobyxmoadg;
    }

    @Override // yggfygwlhe.wflxmlrfwp, yggfygwlhe.gtknphoqwx.iobyxmoadg
    public /* bridge */ /* synthetic */ void ppxfxbqfkf(Surface surface) {
        super.ppxfxbqfkf(surface);
    }

    @Override // yggfygwlhe.agtfadlqog, yggfygwlhe.wflxmlrfwp, yggfygwlhe.gtknphoqwx.iobyxmoadg
    public void wkgbmnqykc(long j13) {
        ((OutputConfiguration) nufgyqmvbu()).setDynamicRangeProfile(j13);
    }

    @Override // yggfygwlhe.rgvfuqvkyq, yggfygwlhe.gtknphoqwx.iobyxmoadg
    public void zoijcleaow(long j13) {
        if (j13 == -1) {
            return;
        }
        ((OutputConfiguration) nufgyqmvbu()).setStreamUseCase(j13);
    }

    ojitshcjhn(Object obj) {
        super(obj);
    }
}
