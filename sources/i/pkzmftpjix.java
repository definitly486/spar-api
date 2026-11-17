package i;

import h.bfopjjpdmp;

/* JADX INFO: loaded from: classes.dex */
public final class pkzmftpjix extends ppxfxbqfkf {
    public pkzmftpjix(String str, int i13) {
        super(str, zoijcleaow.f41585iobyxmoadg.ppxfxbqfkf(), i13, null);
    }

    @Override // i.ppxfxbqfkf
    public long btonecajqb(float f13, float f14, float f15, float f16, ppxfxbqfkf ppxfxbqfkfVar) {
        if (f13 < -2.0f) {
            f13 = -2.0f;
        }
        if (f13 > 2.0f) {
            f13 = 2.0f;
        }
        if (f14 < -2.0f) {
            f14 = -2.0f;
        }
        if (f14 > 2.0f) {
            f14 = 2.0f;
        }
        if (f15 < -2.0f) {
            f15 = -2.0f;
        }
        return bfopjjpdmp.iobyxmoadg(f13, f14, f15 <= 2.0f ? f15 : 2.0f, f16, ppxfxbqfkfVar);
    }

    @Override // i.ppxfxbqfkf
    public float dxjokdxxww(float f13, float f14, float f15) {
        if (f15 < -2.0f) {
            f15 = -2.0f;
        }
        if (f15 > 2.0f) {
            return 2.0f;
        }
        return f15;
    }

    @Override // i.ppxfxbqfkf
    public long nufgyqmvbu(float f13, float f14, float f15) {
        if (f13 < -2.0f) {
            f13 = -2.0f;
        }
        if (f13 > 2.0f) {
            f13 = 2.0f;
        }
        if (f14 < -2.0f) {
            f14 = -2.0f;
        }
        return (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f14 <= 2.0f ? f14 : 2.0f)) & 4294967295L);
    }

    @Override // i.ppxfxbqfkf
    public float ppxfxbqfkf(int i13) {
        return 2.0f;
    }

    @Override // i.ppxfxbqfkf
    public float wkgbmnqykc(int i13) {
        return -2.0f;
    }
}
