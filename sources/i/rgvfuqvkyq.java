package i;

import h.bfopjjpdmp;

/* JADX INFO: loaded from: classes.dex */
public final class rgvfuqvkyq extends ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f41573eablkybsjg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public rgvfuqvkyq(String str, int i13) {
        super(str, zoijcleaow.f41585iobyxmoadg.iobyxmoadg(), i13, null);
    }

    @Override // i.ppxfxbqfkf
    public long btonecajqb(float f13, float f14, float f15, float f16, ppxfxbqfkf ppxfxbqfkfVar) {
        ojitshcjhn ojitshcjhnVar = ojitshcjhn.f41557iobyxmoadg;
        float f17 = f13 / ojitshcjhnVar.ppxfxbqfkf()[0];
        float f18 = f14 / ojitshcjhnVar.ppxfxbqfkf()[1];
        float f19 = f15 / ojitshcjhnVar.ppxfxbqfkf()[2];
        float fCbrt = f17 > 0.008856452f ? (float) Math.cbrt(f17) : (f17 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f18 > 0.008856452f ? (float) Math.cbrt(f18) : (f18 * 7.787037f) + 0.13793103f;
        float f23 = (116.0f * fCbrt2) - 16.0f;
        float f24 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f19 > 0.008856452f ? (float) Math.cbrt(f19) : (f19 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f23 < 0.0f) {
            f23 = 0.0f;
        }
        if (f23 > 100.0f) {
            f23 = 100.0f;
        }
        if (f24 < -128.0f) {
            f24 = -128.0f;
        }
        if (f24 > 128.0f) {
            f24 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return bfopjjpdmp.iobyxmoadg(f23, f24, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f16, ppxfxbqfkfVar);
    }

    @Override // i.ppxfxbqfkf
    public float dxjokdxxww(float f13, float f14, float f15) {
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 100.0f) {
            f13 = 100.0f;
        }
        if (f15 < -128.0f) {
            f15 = -128.0f;
        }
        if (f15 > 128.0f) {
            f15 = 128.0f;
        }
        float f16 = ((f13 + 16.0f) / 116.0f) - (f15 * 0.005f);
        return (f16 > 0.20689656f ? f16 * f16 * f16 : 0.12841855f * (f16 - 0.13793103f)) * ojitshcjhn.f41557iobyxmoadg.ppxfxbqfkf()[2];
    }

    @Override // i.ppxfxbqfkf
    public long nufgyqmvbu(float f13, float f14, float f15) {
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 100.0f) {
            f13 = 100.0f;
        }
        if (f14 < -128.0f) {
            f14 = -128.0f;
        }
        if (f14 > 128.0f) {
            f14 = 128.0f;
        }
        float f16 = (f13 + 16.0f) / 116.0f;
        float f17 = (f14 * 0.002f) + f16;
        float f18 = f17 > 0.20689656f ? f17 * f17 * f17 : (f17 - 0.13793103f) * 0.12841855f;
        float f19 = f16 > 0.20689656f ? f16 * f16 * f16 : (f16 - 0.13793103f) * 0.12841855f;
        ojitshcjhn ojitshcjhnVar = ojitshcjhn.f41557iobyxmoadg;
        return (((long) Float.floatToRawIntBits(f19 * ojitshcjhnVar.ppxfxbqfkf()[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f18 * ojitshcjhnVar.ppxfxbqfkf()[0])) << 32);
    }

    @Override // i.ppxfxbqfkf
    public float ppxfxbqfkf(int i13) {
        return i13 == 0 ? 100.0f : 128.0f;
    }

    @Override // i.ppxfxbqfkf
    public float wkgbmnqykc(int i13) {
        return i13 == 0 ? 0.0f : -128.0f;
    }
}
