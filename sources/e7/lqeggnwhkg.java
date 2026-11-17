package e7;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg extends androidx.lifecycle.gtknphoqwx {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final lqeggnwhkg f30658zoijcleaow = new lqeggnwhkg();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final iobyxmoadg f30657ppxfxbqfkf = new iobyxmoadg();

    public static final class iobyxmoadg implements androidx.lifecycle.vdvldrhtss {
        iobyxmoadg() {
        }

        @Override // androidx.lifecycle.vdvldrhtss
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public lqeggnwhkg getLifecycle() {
            return lqeggnwhkg.f30658zoijcleaow;
        }
    }

    private lqeggnwhkg() {
    }

    @Override // androidx.lifecycle.gtknphoqwx
    public void iobyxmoadg(androidx.lifecycle.rgvfuqvkyq rgvfuqvkyqVar) {
        if (!(rgvfuqvkyqVar instanceof androidx.lifecycle.gxszxtbevo)) {
            throw new IllegalArgumentException((rgvfuqvkyqVar + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        androidx.lifecycle.gxszxtbevo gxszxtbevoVar = (androidx.lifecycle.gxszxtbevo) rgvfuqvkyqVar;
        iobyxmoadg iobyxmoadgVar = f30657ppxfxbqfkf;
        gxszxtbevoVar.lqeggnwhkg(iobyxmoadgVar);
        gxszxtbevoVar.onStart(iobyxmoadgVar);
        gxszxtbevoVar.onResume(iobyxmoadgVar);
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.gtknphoqwx
    public void wkgbmnqykc(androidx.lifecycle.rgvfuqvkyq rgvfuqvkyqVar) {
    }

    @Override // androidx.lifecycle.gtknphoqwx
    public androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaow() {
        return androidx.lifecycle.gtknphoqwx.zoijcleaow.RESUMED;
    }
}
