package u;

import hg.agtfadlqog;
import kotlin.NoWhenBranchMatchedException;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f112396eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final float[] f112397gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f112398iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final float[] f112399lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final float[] f112400nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f112401ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final u.iobyxmoadg[] f112402wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iobyxmoadg f112403zoijcleaow;

    public enum iobyxmoadg {
        Lsq2,
        Impulse;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f112404iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f112408iobyxmoadg;

        static {
            int[] iArr = new int[iobyxmoadg.values().length];
            try {
                iArr[iobyxmoadg.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[iobyxmoadg.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f112408iobyxmoadg = iArr;
        }
    }

    public ppxfxbqfkf(boolean z13, iobyxmoadg iobyxmoadgVar) {
        this.f112398iobyxmoadg = z13;
        this.f112403zoijcleaow = iobyxmoadgVar;
        if (z13 && iobyxmoadgVar.equals(iobyxmoadg.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i13 = zoijcleaow.f112408iobyxmoadg[iobyxmoadgVar.ordinal()];
        int i14 = 2;
        if (i13 != 1) {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i14 = 3;
        }
        this.f112401ppxfxbqfkf = i14;
        this.f112402wkgbmnqykc = new u.iobyxmoadg[20];
        this.f112397gxszxtbevo = new float[20];
        this.f112399lqeggnwhkg = new float[20];
        this.f112400nufgyqmvbu = new float[3];
    }

    private final float zoijcleaow(float[] fArr, float[] fArr2, int i13) {
        try {
            return eablkybsjg.btonecajqb(fArr2, fArr, i13, 2, this.f112400nufgyqmvbu)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void eablkybsjg() {
        agtfadlqog.cdpycssgdh(this.f112402wkgbmnqykc, null, 0, 0, 6, null);
        this.f112396eablkybsjg = 0;
    }

    public final void iobyxmoadg(long j13, float f13) {
        int i13 = (this.f112396eablkybsjg + 1) % 20;
        this.f112396eablkybsjg = i13;
        eablkybsjg.gtknphoqwx(this.f112402wkgbmnqykc, i13, j13, f13);
    }

    public final float ppxfxbqfkf() {
        float fLqeggnwhkg;
        float[] fArr = this.f112397gxszxtbevo;
        float[] fArr2 = this.f112399lqeggnwhkg;
        int i13 = this.f112396eablkybsjg;
        u.iobyxmoadg iobyxmoadgVar = this.f112402wkgbmnqykc[i13];
        if (iobyxmoadgVar == null) {
            return 0.0f;
        }
        int i14 = 0;
        u.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar;
        while (true) {
            u.iobyxmoadg iobyxmoadgVar3 = this.f112402wkgbmnqykc[i13];
            if (iobyxmoadgVar3 == null) {
                break;
            }
            float fZoijcleaow = iobyxmoadgVar.zoijcleaow() - iobyxmoadgVar3.zoijcleaow();
            float fAbs = Math.abs(iobyxmoadgVar3.zoijcleaow() - iobyxmoadgVar2.zoijcleaow());
            u.iobyxmoadg iobyxmoadgVar4 = (this.f112403zoijcleaow == iobyxmoadg.Lsq2 || this.f112398iobyxmoadg) ? iobyxmoadgVar3 : iobyxmoadgVar;
            if (fZoijcleaow > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr[i14] = iobyxmoadgVar3.iobyxmoadg();
            fArr2[i14] = -fZoijcleaow;
            if (i13 == 0) {
                i13 = 20;
            }
            i13--;
            i14++;
            if (i14 >= 20) {
                break;
            }
            iobyxmoadgVar2 = iobyxmoadgVar4;
        }
        if (i14 < this.f112401ppxfxbqfkf) {
            return 0.0f;
        }
        int i15 = zoijcleaow.f112408iobyxmoadg[this.f112403zoijcleaow.ordinal()];
        if (i15 == 1) {
            fLqeggnwhkg = eablkybsjg.lqeggnwhkg(fArr, fArr2, i14, this.f112398iobyxmoadg);
        } else {
            if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fLqeggnwhkg = zoijcleaow(fArr, fArr2, i14);
        }
        return fLqeggnwhkg * 1000;
    }

    public final float wkgbmnqykc(float f13) {
        if (!(f13 > 0.0f)) {
            w.iobyxmoadg.zoijcleaow("maximumVelocity should be a positive value. You specified=" + f13);
        }
        float fPpxfxbqfkf = ppxfxbqfkf();
        if (fPpxfxbqfkf == 0.0f || Float.isNaN(fPpxfxbqfkf)) {
            return 0.0f;
        }
        return fPpxfxbqfkf > 0.0f ? gtknphoqwx.dxjokdxxww(fPpxfxbqfkf, f13) : gtknphoqwx.eablkybsjg(fPpxfxbqfkf, -f13);
    }

    public /* synthetic */ ppxfxbqfkf(boolean z13, iobyxmoadg iobyxmoadgVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? iobyxmoadg.Lsq2 : iobyxmoadgVar);
    }

    public ppxfxbqfkf(boolean z13) {
        this(z13, iobyxmoadg.Impulse);
    }
}
