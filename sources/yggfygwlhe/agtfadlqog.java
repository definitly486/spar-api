package yggfygwlhe;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class agtfadlqog extends wflxmlrfwp {

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final OutputConfiguration f124981iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        long f124982zoijcleaow = 1;

        iobyxmoadg(OutputConfiguration outputConfiguration) {
            this.f124981iobyxmoadg = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return Objects.equals(this.f124981iobyxmoadg, iobyxmoadgVar.f124981iobyxmoadg) && this.f124982zoijcleaow == iobyxmoadgVar.f124982zoijcleaow;
        }

        public int hashCode() {
            int iHashCode = this.f124981iobyxmoadg.hashCode() ^ 31;
            return Long.hashCode(this.f124982zoijcleaow) ^ ((iHashCode << 5) - iHashCode);
        }
    }

    agtfadlqog(int i13, Surface surface) {
        this(new iobyxmoadg(new OutputConfiguration(i13, surface)));
    }

    static agtfadlqog btonecajqb(OutputConfiguration outputConfiguration) {
        return new agtfadlqog(new iobyxmoadg(outputConfiguration));
    }

    @Override // yggfygwlhe.wflxmlrfwp, yggfygwlhe.gtknphoqwx.iobyxmoadg
    public void eablkybsjg(String str) {
        ((OutputConfiguration) nufgyqmvbu()).setPhysicalCameraId(str);
    }

    @Override // yggfygwlhe.wflxmlrfwp, yggfygwlhe.gtknphoqwx.iobyxmoadg
    public String getPhysicalCameraId() {
        return null;
    }

    @Override // yggfygwlhe.wflxmlrfwp, yggfygwlhe.draadjrbmk, yggfygwlhe.gtknphoqwx.iobyxmoadg
    public Object nufgyqmvbu() {
        u1.nufgyqmvbu.iobyxmoadg(this.f124990iobyxmoadg instanceof iobyxmoadg);
        return ((iobyxmoadg) this.f124990iobyxmoadg).f124981iobyxmoadg;
    }

    @Override // yggfygwlhe.wflxmlrfwp, yggfygwlhe.gtknphoqwx.iobyxmoadg
    public void wkgbmnqykc(long j13) {
        ((iobyxmoadg) this.f124990iobyxmoadg).f124982zoijcleaow = j13;
    }

    agtfadlqog(Object obj) {
        super(obj);
    }
}
