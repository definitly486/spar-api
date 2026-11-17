package yggfygwlhe;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class wflxmlrfwp extends draadjrbmk {

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final OutputConfiguration f125000iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        long f125001ppxfxbqfkf = 1;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        String f125002zoijcleaow;

        iobyxmoadg(OutputConfiguration outputConfiguration) {
            this.f125000iobyxmoadg = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return Objects.equals(this.f125000iobyxmoadg, iobyxmoadgVar.f125000iobyxmoadg) && this.f125001ppxfxbqfkf == iobyxmoadgVar.f125001ppxfxbqfkf && Objects.equals(this.f125002zoijcleaow, iobyxmoadgVar.f125002zoijcleaow);
        }

        public int hashCode() {
            int iHashCode = this.f125000iobyxmoadg.hashCode() ^ 31;
            int i13 = (iHashCode << 5) - iHashCode;
            String str = this.f125002zoijcleaow;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i13;
            return Long.hashCode(this.f125001ppxfxbqfkf) ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    wflxmlrfwp(int i13, Surface surface) {
        this(new iobyxmoadg(new OutputConfiguration(i13, surface)));
    }

    static wflxmlrfwp dxjokdxxww(OutputConfiguration outputConfiguration) {
        return new wflxmlrfwp(new iobyxmoadg(outputConfiguration));
    }

    @Override // yggfygwlhe.gtknphoqwx.iobyxmoadg
    public void eablkybsjg(String str) {
        ((iobyxmoadg) this.f124990iobyxmoadg).f125002zoijcleaow = str;
    }

    @Override // yggfygwlhe.gtknphoqwx.iobyxmoadg
    public String getPhysicalCameraId() {
        return ((iobyxmoadg) this.f124990iobyxmoadg).f125002zoijcleaow;
    }

    @Override // yggfygwlhe.gtknphoqwx.iobyxmoadg
    public void gxszxtbevo() {
        ((OutputConfiguration) nufgyqmvbu()).enableSurfaceSharing();
    }

    @Override // yggfygwlhe.draadjrbmk, yggfygwlhe.gtknphoqwx.iobyxmoadg
    public Object nufgyqmvbu() {
        u1.nufgyqmvbu.iobyxmoadg(this.f124990iobyxmoadg instanceof iobyxmoadg);
        return ((iobyxmoadg) this.f124990iobyxmoadg).f125000iobyxmoadg;
    }

    @Override // yggfygwlhe.gtknphoqwx.iobyxmoadg
    public void ppxfxbqfkf(Surface surface) {
        ((OutputConfiguration) nufgyqmvbu()).addSurface(surface);
    }

    @Override // yggfygwlhe.gtknphoqwx.iobyxmoadg
    public void wkgbmnqykc(long j13) {
        ((iobyxmoadg) this.f124990iobyxmoadg).f125001ppxfxbqfkf = j13;
    }

    wflxmlrfwp(Object obj) {
        super(obj);
    }
}
