package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
public abstract class k2 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final ageimvtcrz.ppxfxbqfkf f43224eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final ageimvtcrz.ppxfxbqfkf f43225gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final androidx.compose.runtime.a f43226iobyxmoadg = androidx.compose.runtime.lmojexxdyd.nufgyqmvbu(null, new tg.iobyxmoadg() { // from class: igdgnonuha.j2
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return k2.zoijcleaow();
        }
    }, 1, null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final l2 f43227ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final ageimvtcrz.ppxfxbqfkf f43228wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final l2 f43229zoijcleaow;

    static {
        w0.nufgyqmvbu.iobyxmoadg iobyxmoadgVar = w0.nufgyqmvbu.f118267yggfygwlhe;
        float fPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        h.oipsdeybqn.iobyxmoadg iobyxmoadgVar2 = h.oipsdeybqn.f38945zoijcleaow;
        f43229zoijcleaow = new l2(true, fPpxfxbqfkf, iobyxmoadgVar2.lqeggnwhkg(), (kotlin.jvm.internal.gtknphoqwx) null);
        f43227ppxfxbqfkf = new l2(false, iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar2.lqeggnwhkg(), (kotlin.jvm.internal.gtknphoqwx) null);
        f43228wkgbmnqykc = new ageimvtcrz.ppxfxbqfkf(0.16f, 0.24f, 0.08f, 0.24f);
        f43224eablkybsjg = new ageimvtcrz.ppxfxbqfkf(0.08f, 0.12f, 0.04f, 0.12f);
        f43225gxszxtbevo = new ageimvtcrz.ppxfxbqfkf(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static final androidx.compose.runtime.a gxszxtbevo() {
        return f43226iobyxmoadg;
    }

    public static final ikoacuggdj.tzroggbefp lqeggnwhkg(boolean z13, float f13, long j13) {
        if (w0.nufgyqmvbu.dxjokdxxww(f13, w0.nufgyqmvbu.f118267yggfygwlhe.ppxfxbqfkf()) && h.oipsdeybqn.ojitshcjhn(j13, h.oipsdeybqn.f38945zoijcleaow.lqeggnwhkg())) {
            return z13 ? f43229zoijcleaow : f43227ppxfxbqfkf;
        }
        return new l2(z13, f13, j13, (kotlin.jvm.internal.gtknphoqwx) null);
    }

    public static /* synthetic */ ikoacuggdj.tzroggbefp nufgyqmvbu(boolean z13, float f13, long j13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = true;
        }
        if ((i13 & 2) != 0) {
            f13 = w0.nufgyqmvbu.f118267yggfygwlhe.ppxfxbqfkf();
        }
        if ((i13 & 4) != 0) {
            j13 = h.oipsdeybqn.f38945zoijcleaow.lqeggnwhkg();
        }
        return lqeggnwhkg(z13, f13, j13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h2 zoijcleaow() {
        return new h2(0L, null, 3, null);
    }
}
