package r4;

import java.util.Collections;
import java.util.List;
import q4.gtknphoqwx;

/* JADX INFO: loaded from: classes.dex */
final class gxszxtbevo implements gtknphoqwx {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f81616zdlpuopuiu;

    public gxszxtbevo(List list) {
        this.f81616zdlpuopuiu = list;
    }

    @Override // q4.gtknphoqwx
    public int iobyxmoadg(long j13) {
        return j13 < 0 ? 0 : -1;
    }

    @Override // q4.gtknphoqwx
    public long ppxfxbqfkf(int i13) {
        y2.iobyxmoadg.iobyxmoadg(i13 == 0);
        return 0L;
    }

    @Override // q4.gtknphoqwx
    public int wkgbmnqykc() {
        return 1;
    }

    @Override // q4.gtknphoqwx
    public List zoijcleaow(long j13) {
        return j13 >= 0 ? this.f81616zdlpuopuiu : Collections.emptyList();
    }
}
