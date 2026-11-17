package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public interface ylkuphrtab extends gtknphoqwx {
    long eablkybsjg(float f13, float f14, float f15);

    float ppxfxbqfkf(long j13, float f13, float f14, float f15);

    float wkgbmnqykc(long j13, float f13, float f14, float f15);

    default float zoijcleaow(float f13, float f14, float f15) {
        return wkgbmnqykc(eablkybsjg(f13, f14, f15), f13, f14, f15);
    }

    @Override // vipkmwdibw.gtknphoqwx
    default v iobyxmoadg(ezmngbhpjk ezmngbhpjkVar) {
        return new v(this);
    }
}
