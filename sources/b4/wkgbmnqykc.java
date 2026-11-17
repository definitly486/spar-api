package b4;

import t3.lereixgezr;
import t3.vdvldrhtss;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc extends lereixgezr {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f15108zoijcleaow;

    public wkgbmnqykc(vdvldrhtss vdvldrhtssVar, long j13) {
        super(vdvldrhtssVar);
        y2.iobyxmoadg.iobyxmoadg(vdvldrhtssVar.getPosition() >= j13);
        this.f15108zoijcleaow = j13;
    }

    @Override // t3.lereixgezr, t3.vdvldrhtss
    public long getLength() {
        return super.getLength() - this.f15108zoijcleaow;
    }

    @Override // t3.lereixgezr, t3.vdvldrhtss
    public long getPosition() {
        return super.getPosition() - this.f15108zoijcleaow;
    }

    @Override // t3.lereixgezr, t3.vdvldrhtss
    public long nufgyqmvbu() {
        return super.nufgyqmvbu() - this.f15108zoijcleaow;
    }
}
