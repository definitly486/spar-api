package q7;

import android.graphics.Paint;
import com.airbnb.lottie.hcddaimhww;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class kcexrzcfyt implements q7.ppxfxbqfkf {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final boolean f78091btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final float f78092dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final p7.wkgbmnqykc f78093eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final p7.zoijcleaow f78094gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f78095iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final zoijcleaow f78096lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final ppxfxbqfkf f78097nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f78098ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final p7.iobyxmoadg f78099wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final p7.zoijcleaow f78100zoijcleaow;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f78101iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final /* synthetic */ int[] f78102zoijcleaow;

        static {
            int[] iArr = new int[ppxfxbqfkf.values().length];
            f78102zoijcleaow = iArr;
            try {
                iArr[ppxfxbqfkf.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78102zoijcleaow[ppxfxbqfkf.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78102zoijcleaow[ppxfxbqfkf.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[zoijcleaow.values().length];
            f78101iobyxmoadg = iArr2;
            try {
                iArr2[zoijcleaow.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f78101iobyxmoadg[zoijcleaow.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f78101iobyxmoadg[zoijcleaow.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum ppxfxbqfkf {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join wkgbmnqykc() {
            int i13 = iobyxmoadg.f78102zoijcleaow[ordinal()];
            if (i13 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i13 == 2) {
                return Paint.Join.MITER;
            }
            if (i13 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public enum zoijcleaow {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap wkgbmnqykc() {
            int i13 = iobyxmoadg.f78101iobyxmoadg[ordinal()];
            if (i13 != 1) {
                return i13 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public kcexrzcfyt(String str, p7.zoijcleaow zoijcleaowVar, List list, p7.iobyxmoadg iobyxmoadgVar, p7.wkgbmnqykc wkgbmnqykcVar, p7.zoijcleaow zoijcleaowVar2, zoijcleaow zoijcleaowVar3, ppxfxbqfkf ppxfxbqfkfVar, float f13, boolean z13) {
        this.f78095iobyxmoadg = str;
        this.f78100zoijcleaow = zoijcleaowVar;
        this.f78098ppxfxbqfkf = list;
        this.f78099wkgbmnqykc = iobyxmoadgVar;
        this.f78093eablkybsjg = wkgbmnqykcVar;
        this.f78094gxszxtbevo = zoijcleaowVar2;
        this.f78096lqeggnwhkg = zoijcleaowVar3;
        this.f78097nufgyqmvbu = ppxfxbqfkfVar;
        this.f78092dxjokdxxww = f13;
        this.f78091btonecajqb = z13;
    }

    public p7.zoijcleaow btonecajqb() {
        return this.f78094gxszxtbevo;
    }

    public p7.wkgbmnqykc dxjokdxxww() {
        return this.f78093eablkybsjg;
    }

    public ppxfxbqfkf eablkybsjg() {
        return this.f78097nufgyqmvbu;
    }

    public boolean gtknphoqwx() {
        return this.f78091btonecajqb;
    }

    public List gxszxtbevo() {
        return this.f78098ppxfxbqfkf;
    }

    @Override // q7.ppxfxbqfkf
    public k7.ppxfxbqfkf iobyxmoadg(hcddaimhww hcddaimhwwVar, com.airbnb.lottie.btonecajqb btonecajqbVar, r7.zoijcleaow zoijcleaowVar) {
        return new k7.zdlpuopuiu(hcddaimhwwVar, zoijcleaowVar, this);
    }

    public float lqeggnwhkg() {
        return this.f78092dxjokdxxww;
    }

    public String nufgyqmvbu() {
        return this.f78095iobyxmoadg;
    }

    public p7.iobyxmoadg ppxfxbqfkf() {
        return this.f78099wkgbmnqykc;
    }

    public p7.zoijcleaow wkgbmnqykc() {
        return this.f78100zoijcleaow;
    }

    public zoijcleaow zoijcleaow() {
        return this.f78096lqeggnwhkg;
    }
}
