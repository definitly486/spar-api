package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class agtfadlqog {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    static final boolean f21044dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final agtfadlqog f21045eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final agtfadlqog f21046gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final agtfadlqog f21048lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final l8.gxszxtbevo f21049nufgyqmvbu;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final agtfadlqog f21047iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final agtfadlqog f21052zoijcleaow = new zoijcleaow();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final agtfadlqog f21050ppxfxbqfkf = new eablkybsjg();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final agtfadlqog f21051wkgbmnqykc = new ppxfxbqfkf();

    private static class eablkybsjg extends agtfadlqog {
        eablkybsjg() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.agtfadlqog
        public lqeggnwhkg iobyxmoadg(int i13, int i14, int i15, int i16) {
            return agtfadlqog.f21044dxjokdxxww ? lqeggnwhkg.QUALITY : lqeggnwhkg.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.agtfadlqog
        public float zoijcleaow(int i13, int i14, int i15, int i16) {
            if (agtfadlqog.f21044dxjokdxxww) {
                return Math.min(i15 / i13, i16 / i14);
            }
            int iMax = Math.max(i14 / i16, i13 / i15);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    private static class gxszxtbevo extends agtfadlqog {
        gxszxtbevo() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.agtfadlqog
        public lqeggnwhkg iobyxmoadg(int i13, int i14, int i15, int i16) {
            return lqeggnwhkg.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.agtfadlqog
        public float zoijcleaow(int i13, int i14, int i15, int i16) {
            return 1.0f;
        }
    }

    private static class iobyxmoadg extends agtfadlqog {
        iobyxmoadg() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.agtfadlqog
        public lqeggnwhkg iobyxmoadg(int i13, int i14, int i15, int i16) {
            return lqeggnwhkg.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.agtfadlqog
        public float zoijcleaow(int i13, int i14, int i15, int i16) {
            int iMin = Math.min(i14 / i16, i13 / i15);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    public enum lqeggnwhkg {
        MEMORY,
        QUALITY
    }

    private static class ppxfxbqfkf extends agtfadlqog {
        ppxfxbqfkf() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.agtfadlqog
        public lqeggnwhkg iobyxmoadg(int i13, int i14, int i15, int i16) {
            return zoijcleaow(i13, i14, i15, i16) == 1.0f ? lqeggnwhkg.QUALITY : agtfadlqog.f21050ppxfxbqfkf.iobyxmoadg(i13, i14, i15, i16);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.agtfadlqog
        public float zoijcleaow(int i13, int i14, int i15, int i16) {
            return Math.min(1.0f, agtfadlqog.f21050ppxfxbqfkf.zoijcleaow(i13, i14, i15, i16));
        }
    }

    private static class wkgbmnqykc extends agtfadlqog {
        wkgbmnqykc() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.agtfadlqog
        public lqeggnwhkg iobyxmoadg(int i13, int i14, int i15, int i16) {
            return lqeggnwhkg.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.agtfadlqog
        public float zoijcleaow(int i13, int i14, int i15, int i16) {
            return Math.max(i15 / i13, i16 / i14);
        }
    }

    private static class zoijcleaow extends agtfadlqog {
        zoijcleaow() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.agtfadlqog
        public lqeggnwhkg iobyxmoadg(int i13, int i14, int i15, int i16) {
            return lqeggnwhkg.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.agtfadlqog
        public float zoijcleaow(int i13, int i14, int i15, int i16) {
            int iCeil = (int) Math.ceil(Math.max(i14 / i16, i13 / i15));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    static {
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc();
        f21045eablkybsjg = wkgbmnqykcVar;
        f21046gxszxtbevo = new gxszxtbevo();
        f21048lqeggnwhkg = wkgbmnqykcVar;
        f21049nufgyqmvbu = l8.gxszxtbevo.gxszxtbevo("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", wkgbmnqykcVar);
        f21044dxjokdxxww = true;
    }

    public abstract lqeggnwhkg iobyxmoadg(int i13, int i14, int i15, int i16);

    public abstract float zoijcleaow(int i13, int i14, int i15, int i16);
}
