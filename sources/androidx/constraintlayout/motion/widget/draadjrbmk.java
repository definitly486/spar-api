package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class draadjrbmk {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private HashMap f7705cdpycssgdh;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private a1.zoijcleaow f7707draadjrbmk;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    String f7709eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private a1.zoijcleaow[] f7711gtknphoqwx;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private Interpolator f7713hcddaimhww;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private int f7715iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private HashMap f7716istkbnxepw;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private boolean f7718jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int[] f7719jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private double[] f7720kcexrzcfyt;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private int f7722lmojexxdyd;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private int[] f7726oxmwwwfdhm;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private float f7727pkzmftpjix;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    int f7729ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    float f7730rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    float f7731vdvldrhtss;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private View f7734wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private btonecajqb[] f7735yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private String[] f7736yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private int f7737ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private double[] f7738zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    View f7739zoijcleaow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private HashMap f7740zynmafqrjb;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    Rect f7714iobyxmoadg = new Rect();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    boolean f7733wkgbmnqykc = false;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f7712gxszxtbevo = -1;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private agtfadlqog f7723lqeggnwhkg = new agtfadlqog();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private agtfadlqog f7724nufgyqmvbu = new agtfadlqog();

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private gtknphoqwx f7708dxjokdxxww = new gtknphoqwx();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private gtknphoqwx f7704btonecajqb = new gtknphoqwx();

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    float f7732wflxmlrfwp = Float.NaN;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    float f7703agtfadlqog = 0.0f;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    float f7725ojitshcjhn = 1.0f;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f7717iwizpuwonk = 4;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private float[] f7706cqumvgiudr = new float[4];

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private ArrayList f7710esjtqupxsv = new ArrayList();

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private float[] f7721lereixgezr = new float[1];

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private ArrayList f7728pmvmpeiblj = new ArrayList();

    class iobyxmoadg implements Interpolator {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ a1.ppxfxbqfkf f7741iobyxmoadg;

        iobyxmoadg(a1.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f7741iobyxmoadg = ppxfxbqfkfVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f13) {
            return (float) this.f7741iobyxmoadg.iobyxmoadg(f13);
        }
    }

    draadjrbmk(View view) {
        int i13 = ppxfxbqfkf.f7921gxszxtbevo;
        this.f7715iozdgvuglv = i13;
        this.f7722lmojexxdyd = i13;
        this.f7734wwaezpbzkn = null;
        this.f7737ylkuphrtab = i13;
        this.f7727pkzmftpjix = Float.NaN;
        this.f7713hcddaimhww = null;
        this.f7718jpowsppfya = false;
        yadqdtsiqt(view);
    }

    private void jyumaefscl(agtfadlqog agtfadlqogVar) {
        agtfadlqogVar.vdvldrhtss((int) this.f7739zoijcleaow.getX(), (int) this.f7739zoijcleaow.getY(), this.f7739zoijcleaow.getWidth(), this.f7739zoijcleaow.getHeight());
    }

    private float lqeggnwhkg(float f13, float[] fArr) {
        float f14 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f15 = this.f7725ojitshcjhn;
            if (f15 != 1.0d) {
                float f16 = this.f7703agtfadlqog;
                if (f13 < f16) {
                    f13 = 0.0f;
                }
                if (f13 > f16 && f13 < 1.0d) {
                    f13 = Math.min((f13 - f16) * f15, 1.0f);
                }
            }
        }
        a1.ppxfxbqfkf ppxfxbqfkfVar = this.f7723lqeggnwhkg.f7679zdlpuopuiu;
        float f17 = Float.NaN;
        for (agtfadlqog agtfadlqogVar : this.f7710esjtqupxsv) {
            a1.ppxfxbqfkf ppxfxbqfkfVar2 = agtfadlqogVar.f7679zdlpuopuiu;
            if (ppxfxbqfkfVar2 != null) {
                float f18 = agtfadlqogVar.f7670jyumaefscl;
                if (f18 < f13) {
                    ppxfxbqfkfVar = ppxfxbqfkfVar2;
                    f14 = f18;
                } else if (Float.isNaN(f17)) {
                    f17 = agtfadlqogVar.f7670jyumaefscl;
                }
            }
        }
        if (ppxfxbqfkfVar != null) {
            float f19 = (Float.isNaN(f17) ? 1.0f : f17) - f14;
            double d13 = (f13 - f14) / f19;
            f13 = (((float) ppxfxbqfkfVar.iobyxmoadg(d13)) * f19) + f14;
            if (fArr != null) {
                fArr[0] = (float) ppxfxbqfkfVar.zoijcleaow(d13);
            }
        }
        return f13;
    }

    private float oxmwwwfdhm() {
        char c13;
        float[] fArr = new float[2];
        float f13 = 1.0f / 99;
        double d13 = 0.0d;
        double d14 = 0.0d;
        int i13 = 0;
        float fHypot = 0.0f;
        while (i13 < 100) {
            float f14 = i13 * f13;
            double dIobyxmoadg = f14;
            a1.ppxfxbqfkf ppxfxbqfkfVar = this.f7723lqeggnwhkg.f7679zdlpuopuiu;
            float f15 = Float.NaN;
            float f16 = 0.0f;
            for (agtfadlqog agtfadlqogVar : this.f7710esjtqupxsv) {
                a1.ppxfxbqfkf ppxfxbqfkfVar2 = agtfadlqogVar.f7679zdlpuopuiu;
                if (ppxfxbqfkfVar2 != null) {
                    float f17 = agtfadlqogVar.f7670jyumaefscl;
                    if (f17 < f14) {
                        ppxfxbqfkfVar = ppxfxbqfkfVar2;
                        f16 = f17;
                    } else if (Float.isNaN(f15)) {
                        f15 = agtfadlqogVar.f7670jyumaefscl;
                    }
                }
            }
            if (ppxfxbqfkfVar != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                float f18 = f15 - f16;
                dIobyxmoadg = (((float) ppxfxbqfkfVar.iobyxmoadg((f14 - f16) / f18)) * f18) + f16;
            }
            this.f7711gtknphoqwx[0].wkgbmnqykc(dIobyxmoadg, this.f7720kcexrzcfyt);
            int i14 = i13;
            this.f7723lqeggnwhkg.gxszxtbevo(dIobyxmoadg, this.f7726oxmwwwfdhm, this.f7720kcexrzcfyt, fArr, 0);
            if (i14 > 0) {
                c13 = 0;
                fHypot += (float) Math.hypot(d14 - ((double) fArr[1]), d13 - ((double) fArr[0]));
            } else {
                c13 = 0;
            }
            d13 = fArr[c13];
            i13 = i14 + 1;
            d14 = fArr[1];
        }
        return fHypot;
    }

    private static Interpolator rgvfuqvkyq(Context context, int i13, String str, int i14) {
        if (i13 == -2) {
            return AnimationUtils.loadInterpolator(context, i14);
        }
        if (i13 == -1) {
            return new iobyxmoadg(a1.ppxfxbqfkf.ppxfxbqfkf(str));
        }
        if (i13 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i13 == 1) {
            return new AccelerateInterpolator();
        }
        if (i13 == 2) {
            return new DecelerateInterpolator();
        }
        if (i13 == 4) {
            return new BounceInterpolator();
        }
        if (i13 != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    private void zdlpuopuiu(agtfadlqog agtfadlqogVar) {
        int iBinarySearch = Collections.binarySearch(this.f7710esjtqupxsv, agtfadlqogVar);
        if (iBinarySearch == 0) {
            Log.e("MotionController", " KeyPath position \"" + agtfadlqogVar.f7668iwizpuwonk + "\" outside of range");
        }
        this.f7710esjtqupxsv.add((-iBinarySearch) - 1, agtfadlqogVar);
    }

    public float agtfadlqog() {
        return this.f7724nufgyqmvbu.f7663cqumvgiudr;
    }

    public float btonecajqb() {
        return this.f7730rgvfuqvkyq;
    }

    public void cdpycssgdh(e1.eablkybsjg eablkybsjgVar, View view, int i13, int i14, int i15) {
        agtfadlqog agtfadlqogVar = this.f7723lqeggnwhkg;
        agtfadlqogVar.f7670jyumaefscl = 0.0f;
        agtfadlqogVar.f7668iwizpuwonk = 0.0f;
        Rect rect = new Rect();
        if (i13 == 1 || i13 == 2) {
            throw null;
        }
        this.f7723lqeggnwhkg.vdvldrhtss(rect.left, rect.top, rect.width(), rect.height());
        throw null;
    }

    void cqumvgiudr(Rect rect, Rect rect2, int i13, int i14, int i15) {
        if (i13 == 1) {
            int i16 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i15 - ((i16 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i13 == 2) {
            int i17 = rect.left + rect.right;
            rect2.left = i14 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i17 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i13 == 3) {
            int i18 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i18 / 2);
            rect2.top = i15 - ((i18 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i13 != 4) {
            return;
        }
        int i19 = rect.left + rect.right;
        rect2.left = i14 - (((rect.bottom + rect.top) + rect.width()) / 2);
        rect2.top = (i19 - rect.height()) / 2;
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    void draadjrbmk(float f13, float f14, float f15, float[] fArr) {
        double[] dArr;
        float fLqeggnwhkg = lqeggnwhkg(f13, this.f7721lereixgezr);
        a1.zoijcleaow[] zoijcleaowVarArr = this.f7711gtknphoqwx;
        int i13 = 0;
        if (zoijcleaowVarArr == null) {
            agtfadlqog agtfadlqogVar = this.f7724nufgyqmvbu;
            float f16 = agtfadlqogVar.f7663cqumvgiudr;
            agtfadlqog agtfadlqogVar2 = this.f7723lqeggnwhkg;
            float f17 = f16 - agtfadlqogVar2.f7663cqumvgiudr;
            float f18 = agtfadlqogVar.f7664esjtqupxsv - agtfadlqogVar2.f7664esjtqupxsv;
            float f19 = (agtfadlqogVar.f7671lereixgezr - agtfadlqogVar2.f7671lereixgezr) + f17;
            float f23 = (agtfadlqogVar.f7674pmvmpeiblj - agtfadlqogVar2.f7674pmvmpeiblj) + f18;
            fArr[0] = (f17 * (1.0f - f14)) + (f19 * f14);
            fArr[1] = (f18 * (1.0f - f15)) + (f23 * f15);
            return;
        }
        double d13 = fLqeggnwhkg;
        zoijcleaowVarArr[0].gxszxtbevo(d13, this.f7738zdlpuopuiu);
        this.f7711gtknphoqwx[0].wkgbmnqykc(d13, this.f7720kcexrzcfyt);
        float f24 = this.f7721lereixgezr[0];
        while (true) {
            dArr = this.f7738zdlpuopuiu;
            if (i13 >= dArr.length) {
                break;
            }
            dArr[i13] = dArr[i13] * ((double) f24);
            i13++;
        }
        a1.zoijcleaow zoijcleaowVar = this.f7707draadjrbmk;
        if (zoijcleaowVar == null) {
            this.f7723lqeggnwhkg.oxmwwwfdhm(f14, f15, fArr, this.f7726oxmwwwfdhm, dArr, this.f7720kcexrzcfyt);
            return;
        }
        double[] dArr2 = this.f7720kcexrzcfyt;
        if (dArr2.length > 0) {
            zoijcleaowVar.wkgbmnqykc(d13, dArr2);
            this.f7707draadjrbmk.gxszxtbevo(d13, this.f7738zdlpuopuiu);
            this.f7723lqeggnwhkg.oxmwwwfdhm(f14, f15, fArr, this.f7726oxmwwwfdhm, this.f7738zdlpuopuiu, this.f7720kcexrzcfyt);
        }
    }

    public void dxjokdxxww(double d13, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f7711gtknphoqwx[0].wkgbmnqykc(d13, dArr);
        this.f7711gtknphoqwx[0].gxszxtbevo(d13, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f7723lqeggnwhkg.lqeggnwhkg(d13, this.f7726oxmwwwfdhm, dArr, fArr, dArr2, fArr2);
    }

    void eablkybsjg(float f13, float[] fArr, int i13) {
        this.f7711gtknphoqwx[0].wkgbmnqykc(lqeggnwhkg(f13, null), this.f7720kcexrzcfyt);
        this.f7723lqeggnwhkg.btonecajqb(this.f7726oxmwwwfdhm, this.f7720kcexrzcfyt, fArr, i13);
    }

    void esjtqupxsv(View view) {
        agtfadlqog agtfadlqogVar = this.f7723lqeggnwhkg;
        agtfadlqogVar.f7670jyumaefscl = 0.0f;
        agtfadlqogVar.f7668iwizpuwonk = 0.0f;
        this.f7718jpowsppfya = true;
        agtfadlqogVar.vdvldrhtss(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f7724nufgyqmvbu.vdvldrhtss(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f7708dxjokdxxww.dxjokdxxww(view);
        this.f7704btonecajqb.dxjokdxxww(view);
    }

    public float gtknphoqwx() {
        return this.f7731vdvldrhtss;
    }

    void gxszxtbevo(boolean z13) {
        if (!"button".equals(androidx.constraintlayout.motion.widget.iobyxmoadg.wkgbmnqykc(this.f7739zoijcleaow)) || this.f7735yadqdtsiqt == null) {
            return;
        }
        int i13 = 0;
        while (true) {
            btonecajqb[] btonecajqbVarArr = this.f7735yadqdtsiqt;
            if (i13 >= btonecajqbVarArr.length) {
                return;
            }
            btonecajqbVarArr[i13].yggfygwlhe(z13 ? -100.0f : 100.0f, this.f7739zoijcleaow);
            i13++;
        }
    }

    public void iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f7728pmvmpeiblj.add(ppxfxbqfkfVar);
    }

    public void iozdgvuglv(int i13, int i14, float f13, long j13) {
        ArrayList arrayList;
        String[] strArr;
        androidx.constraintlayout.widget.iobyxmoadg iobyxmoadgVar;
        e1.gxszxtbevo gxszxtbevoVarNufgyqmvbu;
        androidx.constraintlayout.widget.iobyxmoadg iobyxmoadgVar2;
        Integer num;
        e1.wkgbmnqykc wkgbmnqykcVarGxszxtbevo;
        androidx.constraintlayout.widget.iobyxmoadg iobyxmoadgVar3;
        new HashSet();
        HashSet<String> hashSet = new HashSet();
        HashSet<String> hashSet2 = new HashSet();
        HashSet<String> hashSet3 = new HashSet();
        HashMap map = new HashMap();
        int i15 = this.f7715iozdgvuglv;
        if (i15 != ppxfxbqfkf.f7921gxszxtbevo) {
            this.f7723lqeggnwhkg.f7662cdpycssgdh = i15;
        }
        this.f7708dxjokdxxww.gxszxtbevo(this.f7704btonecajqb, hashSet2);
        ArrayList<ppxfxbqfkf> arrayList2 = this.f7728pmvmpeiblj;
        if (arrayList2 != null) {
            arrayList = null;
            for (ppxfxbqfkf ppxfxbqfkfVar : arrayList2) {
                if (ppxfxbqfkfVar instanceof lqeggnwhkg) {
                    lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) ppxfxbqfkfVar;
                    zdlpuopuiu(new agtfadlqog(i13, i14, lqeggnwhkgVar, this.f7723lqeggnwhkg, this.f7724nufgyqmvbu));
                    int i16 = lqeggnwhkgVar.f7838lqeggnwhkg;
                    if (i16 != ppxfxbqfkf.f7921gxszxtbevo) {
                        this.f7712gxszxtbevo = i16;
                    }
                } else if (ppxfxbqfkfVar instanceof eablkybsjg) {
                    ppxfxbqfkfVar.wkgbmnqykc(hashSet3);
                } else if (ppxfxbqfkfVar instanceof dxjokdxxww) {
                    ppxfxbqfkfVar.wkgbmnqykc(hashSet);
                } else if (ppxfxbqfkfVar instanceof btonecajqb) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((btonecajqb) ppxfxbqfkfVar);
                } else {
                    ppxfxbqfkfVar.lqeggnwhkg(map);
                    ppxfxbqfkfVar.wkgbmnqykc(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f7735yadqdtsiqt = (btonecajqb[]) arrayList.toArray(new btonecajqb[0]);
        }
        char c13 = 1;
        if (!hashSet2.isEmpty()) {
            this.f7716istkbnxepw = new HashMap();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(StringUtils.COMMA)[1];
                    for (ppxfxbqfkf ppxfxbqfkfVar2 : this.f7728pmvmpeiblj) {
                        HashMap map2 = ppxfxbqfkfVar2.f7922eablkybsjg;
                        if (map2 != null && (iobyxmoadgVar3 = (androidx.constraintlayout.widget.iobyxmoadg) map2.get(str2)) != null) {
                            sparseArray.append(ppxfxbqfkfVar2.f7923iobyxmoadg, iobyxmoadgVar3);
                        }
                    }
                    wkgbmnqykcVarGxszxtbevo = e1.wkgbmnqykc.eablkybsjg(str, sparseArray);
                } else {
                    wkgbmnqykcVarGxszxtbevo = e1.wkgbmnqykc.gxszxtbevo(str);
                }
                if (wkgbmnqykcVarGxszxtbevo != null) {
                    wkgbmnqykcVarGxszxtbevo.ppxfxbqfkf(str);
                    this.f7716istkbnxepw.put(str, wkgbmnqykcVarGxszxtbevo);
                }
            }
            ArrayList<ppxfxbqfkf> arrayList3 = this.f7728pmvmpeiblj;
            if (arrayList3 != null) {
                for (ppxfxbqfkf ppxfxbqfkfVar3 : arrayList3) {
                    if (ppxfxbqfkfVar3 instanceof wkgbmnqykc) {
                        ppxfxbqfkfVar3.iobyxmoadg(this.f7716istkbnxepw);
                    }
                }
            }
            this.f7708dxjokdxxww.iobyxmoadg(this.f7716istkbnxepw, 0);
            this.f7704btonecajqb.iobyxmoadg(this.f7716istkbnxepw, 100);
            for (String str3 : this.f7716istkbnxepw.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = (Integer) map.get(str3)) == null) ? 0 : num.intValue();
                a1.btonecajqb btonecajqbVar = (a1.btonecajqb) this.f7716istkbnxepw.get(str3);
                if (btonecajqbVar != null) {
                    btonecajqbVar.wkgbmnqykc(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f7740zynmafqrjb == null) {
                this.f7740zynmafqrjb = new HashMap();
            }
            for (String str4 : hashSet) {
                if (!this.f7740zynmafqrjb.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(StringUtils.COMMA)[1];
                        for (ppxfxbqfkf ppxfxbqfkfVar4 : this.f7728pmvmpeiblj) {
                            HashMap map3 = ppxfxbqfkfVar4.f7922eablkybsjg;
                            if (map3 != null && (iobyxmoadgVar2 = (androidx.constraintlayout.widget.iobyxmoadg) map3.get(str5)) != null) {
                                sparseArray2.append(ppxfxbqfkfVar4.f7923iobyxmoadg, iobyxmoadgVar2);
                            }
                        }
                        gxszxtbevoVarNufgyqmvbu = e1.gxszxtbevo.lqeggnwhkg(str4, sparseArray2);
                    } else {
                        gxszxtbevoVarNufgyqmvbu = e1.gxszxtbevo.nufgyqmvbu(str4, j13);
                    }
                    if (gxszxtbevoVarNufgyqmvbu != null) {
                        gxszxtbevoVarNufgyqmvbu.wkgbmnqykc(str4);
                        this.f7740zynmafqrjb.put(str4, gxszxtbevoVarNufgyqmvbu);
                    }
                }
            }
            ArrayList<ppxfxbqfkf> arrayList4 = this.f7728pmvmpeiblj;
            if (arrayList4 != null) {
                for (ppxfxbqfkf ppxfxbqfkfVar5 : arrayList4) {
                    if (ppxfxbqfkfVar5 instanceof dxjokdxxww) {
                        ((dxjokdxxww) ppxfxbqfkfVar5).stevsuqkhv(this.f7740zynmafqrjb);
                    }
                }
            }
            for (String str6 : this.f7740zynmafqrjb.keySet()) {
                ((e1.gxszxtbevo) this.f7740zynmafqrjb.get(str6)).eablkybsjg(map.containsKey(str6) ? ((Integer) map.get(str6)).intValue() : 0);
            }
        }
        int size = this.f7710esjtqupxsv.size();
        int i17 = size + 2;
        agtfadlqog[] agtfadlqogVarArr = new agtfadlqog[i17];
        agtfadlqogVarArr[0] = this.f7723lqeggnwhkg;
        agtfadlqogVarArr[size + 1] = this.f7724nufgyqmvbu;
        if (this.f7710esjtqupxsv.size() > 0 && this.f7712gxszxtbevo == -1) {
            this.f7712gxszxtbevo = 0;
        }
        Iterator it = this.f7710esjtqupxsv.iterator();
        int i18 = 1;
        while (it.hasNext()) {
            agtfadlqogVarArr[i18] = (agtfadlqog) it.next();
            i18++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.f7724nufgyqmvbu.f7675wwaezpbzkn.keySet()) {
            if (this.f7723lqeggnwhkg.f7675wwaezpbzkn.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f7736yggfygwlhe = strArr2;
        this.f7719jyumaefscl = new int[strArr2.length];
        int i19 = 0;
        while (true) {
            strArr = this.f7736yggfygwlhe;
            if (i19 >= strArr.length) {
                break;
            }
            String str8 = strArr[i19];
            this.f7719jyumaefscl[i19] = 0;
            for (int i23 = 0; i23 < i17; i23++) {
                if (agtfadlqogVarArr[i23].f7675wwaezpbzkn.containsKey(str8) && (iobyxmoadgVar = (androidx.constraintlayout.widget.iobyxmoadg) agtfadlqogVarArr[i23].f7675wwaezpbzkn.get(str8)) != null) {
                    int[] iArr = this.f7719jyumaefscl;
                    iArr[i19] = iArr[i19] + iobyxmoadgVar.nufgyqmvbu();
                    break;
                }
            }
            i19++;
        }
        boolean z13 = agtfadlqogVarArr[0].f7662cdpycssgdh != ppxfxbqfkf.f7921gxszxtbevo;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i24 = 1; i24 < i17; i24++) {
            agtfadlqogVarArr[i24].wkgbmnqykc(agtfadlqogVarArr[i24 - 1], zArr, this.f7736yggfygwlhe, z13);
        }
        int i25 = 0;
        for (int i26 = 1; i26 < length; i26++) {
            if (zArr[i26]) {
                i25++;
            }
        }
        this.f7726oxmwwwfdhm = new int[i25];
        int i27 = 2;
        int iMax = Math.max(2, i25);
        this.f7720kcexrzcfyt = new double[iMax];
        this.f7738zdlpuopuiu = new double[iMax];
        int i28 = 0;
        for (int i29 = 1; i29 < length; i29++) {
            if (zArr[i29]) {
                this.f7726oxmwwwfdhm[i28] = i29;
                i28++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i17, this.f7726oxmwwwfdhm.length);
        double[] dArr2 = new double[i17];
        for (int i33 = 0; i33 < i17; i33++) {
            agtfadlqogVarArr[i33].eablkybsjg(dArr[i33], this.f7726oxmwwwfdhm);
            dArr2[i33] = agtfadlqogVarArr[i33].f7670jyumaefscl;
        }
        int i34 = 0;
        while (true) {
            int[] iArr2 = this.f7726oxmwwwfdhm;
            if (i34 >= iArr2.length) {
                break;
            }
            if (iArr2[i34] < agtfadlqog.f7661hkdspvbjdz.length) {
                String str9 = agtfadlqog.f7661hkdspvbjdz[this.f7726oxmwwwfdhm[i34]] + " [";
                for (int i35 = 0; i35 < i17; i35++) {
                    str9 = str9 + dArr[i35][i34];
                }
            }
            i34++;
        }
        this.f7711gtknphoqwx = new a1.zoijcleaow[this.f7736yggfygwlhe.length + 1];
        int i36 = 0;
        while (true) {
            String[] strArr3 = this.f7736yggfygwlhe;
            if (i36 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i36];
            int i37 = 0;
            int i38 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i37 < i17) {
                if (agtfadlqogVarArr[i37].gtknphoqwx(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i17];
                        int[] iArr3 = new int[i27];
                        iArr3[c13] = agtfadlqogVarArr[i37].dxjokdxxww(str10);
                        iArr3[0] = i17;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr3);
                    }
                    agtfadlqog agtfadlqogVar = agtfadlqogVarArr[i37];
                    dArr3[i38] = agtfadlqogVar.f7670jyumaefscl;
                    agtfadlqogVar.nufgyqmvbu(str10, dArr4[i38], 0);
                    i38++;
                }
                i37++;
                dArr = dArr;
                i27 = 2;
                c13 = 1;
            }
            i36++;
            this.f7711gtknphoqwx[i36] = a1.zoijcleaow.iobyxmoadg(this.f7712gxszxtbevo, Arrays.copyOf(dArr3, i38), (double[][]) Arrays.copyOf(dArr4, i38));
            dArr = dArr;
            i27 = 2;
            c13 = 1;
        }
        this.f7711gtknphoqwx[0] = a1.zoijcleaow.iobyxmoadg(this.f7712gxszxtbevo, dArr2, dArr);
        if (agtfadlqogVarArr[0].f7662cdpycssgdh != ppxfxbqfkf.f7921gxszxtbevo) {
            int[] iArr4 = new int[i17];
            double[] dArr5 = new double[i17];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i17, 2);
            for (int i39 = 0; i39 < i17; i39++) {
                agtfadlqog agtfadlqogVar2 = agtfadlqogVarArr[i39];
                iArr4[i39] = agtfadlqogVar2.f7662cdpycssgdh;
                dArr5[i39] = agtfadlqogVar2.f7670jyumaefscl;
                double[] dArr7 = dArr6[i39];
                dArr7[0] = agtfadlqogVar2.f7663cqumvgiudr;
                dArr7[1] = agtfadlqogVar2.f7664esjtqupxsv;
            }
            this.f7707draadjrbmk = a1.zoijcleaow.zoijcleaow(iArr4, dArr5, dArr6);
        }
        this.f7705cdpycssgdh = new HashMap();
        if (this.f7728pmvmpeiblj != null) {
            float fOxmwwwfdhm = Float.NaN;
            for (String str11 : hashSet3) {
                e1.ppxfxbqfkf ppxfxbqfkfVarNufgyqmvbu = e1.ppxfxbqfkf.nufgyqmvbu(str11);
                if (ppxfxbqfkfVarNufgyqmvbu != null) {
                    if (ppxfxbqfkfVarNufgyqmvbu.lqeggnwhkg() && Float.isNaN(fOxmwwwfdhm)) {
                        fOxmwwwfdhm = oxmwwwfdhm();
                    }
                    ppxfxbqfkfVarNufgyqmvbu.eablkybsjg(str11);
                    this.f7705cdpycssgdh.put(str11, ppxfxbqfkfVarNufgyqmvbu);
                }
            }
            for (ppxfxbqfkf ppxfxbqfkfVar6 : this.f7728pmvmpeiblj) {
                if (ppxfxbqfkfVar6 instanceof eablkybsjg) {
                    ((eablkybsjg) ppxfxbqfkfVar6).ntlheqmsrt(this.f7705cdpycssgdh);
                }
            }
            Iterator it2 = this.f7705cdpycssgdh.values().iterator();
            while (it2.hasNext()) {
                ((e1.ppxfxbqfkf) it2.next()).gxszxtbevo(fOxmwwwfdhm);
            }
        }
    }

    void istkbnxepw(Rect rect, androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar, int i13, int i14) {
        int i15 = wkgbmnqykcVar.f8146eablkybsjg;
        if (i15 != 0) {
            cqumvgiudr(rect, this.f7714iobyxmoadg, i15, i13, i14);
        }
        agtfadlqog agtfadlqogVar = this.f7723lqeggnwhkg;
        agtfadlqogVar.f7670jyumaefscl = 0.0f;
        agtfadlqogVar.f7668iwizpuwonk = 0.0f;
        jyumaefscl(agtfadlqogVar);
        this.f7723lqeggnwhkg.vdvldrhtss(rect.left, rect.top, rect.width(), rect.height());
        androidx.constraintlayout.widget.wkgbmnqykc.iobyxmoadg iobyxmoadgVarCqumvgiudr = wkgbmnqykcVar.cqumvgiudr(this.f7729ppxfxbqfkf);
        this.f7723lqeggnwhkg.iobyxmoadg(iobyxmoadgVarCqumvgiudr);
        this.f7732wflxmlrfwp = iobyxmoadgVarCqumvgiudr.f8175wkgbmnqykc.f8198lqeggnwhkg;
        this.f7708dxjokdxxww.nufgyqmvbu(rect, wkgbmnqykcVar, i15, this.f7729ppxfxbqfkf);
        this.f7722lmojexxdyd = iobyxmoadgVarCqumvgiudr.f8170gxszxtbevo.f8158dxjokdxxww;
        androidx.constraintlayout.widget.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadgVarCqumvgiudr.f8175wkgbmnqykc;
        this.f7737ylkuphrtab = ppxfxbqfkfVar.f8195gtknphoqwx;
        this.f7727pkzmftpjix = ppxfxbqfkfVar.f8191btonecajqb;
        Context context = this.f7739zoijcleaow.getContext();
        androidx.constraintlayout.widget.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar2 = iobyxmoadgVarCqumvgiudr.f8175wkgbmnqykc;
        this.f7713hcddaimhww = rgvfuqvkyq(context, ppxfxbqfkfVar2.f8201wflxmlrfwp, ppxfxbqfkfVar2.f8192draadjrbmk, ppxfxbqfkfVar2.f8190agtfadlqog);
    }

    public void iwizpuwonk() {
        this.f7733wkgbmnqykc = true;
    }

    public View kcexrzcfyt() {
        return this.f7739zoijcleaow;
    }

    void lereixgezr(Rect rect, androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar, int i13, int i14) {
        int i15 = wkgbmnqykcVar.f8146eablkybsjg;
        if (i15 != 0) {
            cqumvgiudr(rect, this.f7714iobyxmoadg, i15, i13, i14);
            rect = this.f7714iobyxmoadg;
        }
        agtfadlqog agtfadlqogVar = this.f7724nufgyqmvbu;
        agtfadlqogVar.f7670jyumaefscl = 1.0f;
        agtfadlqogVar.f7668iwizpuwonk = 1.0f;
        jyumaefscl(agtfadlqogVar);
        this.f7724nufgyqmvbu.vdvldrhtss(rect.left, rect.top, rect.width(), rect.height());
        this.f7724nufgyqmvbu.iobyxmoadg(wkgbmnqykcVar.cqumvgiudr(this.f7729ppxfxbqfkf));
        this.f7704btonecajqb.nufgyqmvbu(rect, wkgbmnqykcVar, i15, this.f7729ppxfxbqfkf);
    }

    public void lmojexxdyd(draadjrbmk draadjrbmkVar) {
        this.f7723lqeggnwhkg.zdlpuopuiu(draadjrbmkVar, draadjrbmkVar.f7723lqeggnwhkg);
        this.f7724nufgyqmvbu.zdlpuopuiu(draadjrbmkVar, draadjrbmkVar.f7724nufgyqmvbu);
    }

    public int nufgyqmvbu() {
        return this.f7723lqeggnwhkg.f7676yadqdtsiqt;
    }

    public float ojitshcjhn() {
        return this.f7724nufgyqmvbu.f7664esjtqupxsv;
    }

    public void pmvmpeiblj(int i13) {
        this.f7715iozdgvuglv = i13;
    }

    int ppxfxbqfkf(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrLqeggnwhkg = this.f7711gtknphoqwx[0].lqeggnwhkg();
        if (iArr != null) {
            Iterator it = this.f7710esjtqupxsv.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                iArr[i13] = ((agtfadlqog) it.next()).f7678ylkuphrtab;
                i13++;
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < dArrLqeggnwhkg.length; i15++) {
            this.f7711gtknphoqwx[0].wkgbmnqykc(dArrLqeggnwhkg[i15], this.f7720kcexrzcfyt);
            this.f7723lqeggnwhkg.gxszxtbevo(dArrLqeggnwhkg[i15], this.f7726oxmwwwfdhm, this.f7720kcexrzcfyt, fArr, i14);
            i14 += 2;
        }
        return i14 / 2;
    }

    public String toString() {
        return " start: x: " + this.f7723lqeggnwhkg.f7663cqumvgiudr + " y: " + this.f7723lqeggnwhkg.f7664esjtqupxsv + " end: x: " + this.f7724nufgyqmvbu.f7663cqumvgiudr + " y: " + this.f7724nufgyqmvbu.f7664esjtqupxsv;
    }

    agtfadlqog vdvldrhtss(int i13) {
        return (agtfadlqog) this.f7710esjtqupxsv.get(i13);
    }

    public int wflxmlrfwp() {
        int iMax = this.f7723lqeggnwhkg.f7677yggfygwlhe;
        Iterator it = this.f7710esjtqupxsv.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((agtfadlqog) it.next()).f7677yggfygwlhe);
        }
        return Math.max(iMax, this.f7724nufgyqmvbu.f7677yggfygwlhe);
    }

    void wkgbmnqykc(float[] fArr, int i13) {
        int i14 = i13;
        float f13 = 1.0f;
        float f14 = 1.0f / (i14 - 1);
        HashMap map = this.f7716istkbnxepw;
        a1.btonecajqb btonecajqbVar = map == null ? null : (a1.btonecajqb) map.get("translationX");
        HashMap map2 = this.f7716istkbnxepw;
        a1.btonecajqb btonecajqbVar2 = map2 == null ? null : (a1.btonecajqb) map2.get("translationY");
        HashMap map3 = this.f7705cdpycssgdh;
        e1.ppxfxbqfkf ppxfxbqfkfVar = map3 == null ? null : (e1.ppxfxbqfkf) map3.get("translationX");
        HashMap map4 = this.f7705cdpycssgdh;
        e1.ppxfxbqfkf ppxfxbqfkfVar2 = map4 != null ? (e1.ppxfxbqfkf) map4.get("translationY") : null;
        int i15 = 0;
        while (i15 < i14) {
            float fMin = i15 * f14;
            float f15 = this.f7725ojitshcjhn;
            float f16 = 0.0f;
            if (f15 != f13) {
                float f17 = this.f7703agtfadlqog;
                if (fMin < f17) {
                    fMin = 0.0f;
                }
                if (fMin > f17 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f17) * f15, f13);
                }
            }
            double dIobyxmoadg = fMin;
            a1.ppxfxbqfkf ppxfxbqfkfVar3 = this.f7723lqeggnwhkg.f7679zdlpuopuiu;
            float f18 = Float.NaN;
            for (agtfadlqog agtfadlqogVar : this.f7710esjtqupxsv) {
                a1.ppxfxbqfkf ppxfxbqfkfVar4 = agtfadlqogVar.f7679zdlpuopuiu;
                if (ppxfxbqfkfVar4 != null) {
                    float f19 = agtfadlqogVar.f7670jyumaefscl;
                    if (f19 < fMin) {
                        f16 = f19;
                        ppxfxbqfkfVar3 = ppxfxbqfkfVar4;
                    } else if (Float.isNaN(f18)) {
                        f18 = agtfadlqogVar.f7670jyumaefscl;
                    }
                }
            }
            if (ppxfxbqfkfVar3 != null) {
                if (Float.isNaN(f18)) {
                    f18 = 1.0f;
                }
                float f23 = f18 - f16;
                dIobyxmoadg = (((float) ppxfxbqfkfVar3.iobyxmoadg((fMin - f16) / f23)) * f23) + f16;
            }
            this.f7711gtknphoqwx[0].wkgbmnqykc(dIobyxmoadg, this.f7720kcexrzcfyt);
            a1.zoijcleaow zoijcleaowVar = this.f7707draadjrbmk;
            if (zoijcleaowVar != null) {
                double[] dArr = this.f7720kcexrzcfyt;
                if (dArr.length > 0) {
                    zoijcleaowVar.wkgbmnqykc(dIobyxmoadg, dArr);
                }
            }
            int i16 = i15 * 2;
            this.f7723lqeggnwhkg.gxszxtbevo(dIobyxmoadg, this.f7726oxmwwwfdhm, this.f7720kcexrzcfyt, fArr, i16);
            if (ppxfxbqfkfVar != null) {
                fArr[i16] = fArr[i16] + ppxfxbqfkfVar.iobyxmoadg(fMin);
            } else if (btonecajqbVar != null) {
                fArr[i16] = fArr[i16] + btonecajqbVar.iobyxmoadg(fMin);
            }
            if (ppxfxbqfkfVar2 != null) {
                int i17 = i16 + 1;
                fArr[i17] = fArr[i17] + ppxfxbqfkfVar2.iobyxmoadg(fMin);
            } else if (btonecajqbVar2 != null) {
                int i18 = i16 + 1;
                fArr[i18] = fArr[i18] + btonecajqbVar2.iobyxmoadg(fMin);
            }
            i15++;
            i14 = i13;
            f13 = 1.0f;
        }
    }

    public void yadqdtsiqt(View view) {
        this.f7739zoijcleaow = view;
        this.f7729ppxfxbqfkf = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.zoijcleaow) {
            this.f7709eablkybsjg = ((ConstraintLayout.zoijcleaow) layoutParams).iobyxmoadg();
        }
    }

    boolean yggfygwlhe(View view, float f13, long j13, a1.wkgbmnqykc wkgbmnqykcVar) {
        e1.gxszxtbevo.wkgbmnqykc wkgbmnqykcVar2;
        boolean zBtonecajqb;
        float fLqeggnwhkg = lqeggnwhkg(f13, null);
        int i13 = this.f7737ylkuphrtab;
        if (i13 != ppxfxbqfkf.f7921gxszxtbevo) {
            float f14 = 1.0f / i13;
            float fFloor = ((float) Math.floor(fLqeggnwhkg / f14)) * f14;
            float f15 = (fLqeggnwhkg % f14) / f14;
            if (!Float.isNaN(this.f7727pkzmftpjix)) {
                f15 = (f15 + this.f7727pkzmftpjix) % 1.0f;
            }
            Interpolator interpolator = this.f7713hcddaimhww;
            fLqeggnwhkg = ((interpolator != null ? interpolator.getInterpolation(f15) : ((double) f15) > 0.5d ? 1.0f : 0.0f) * f14) + fFloor;
        }
        float f16 = fLqeggnwhkg;
        HashMap map = this.f7716istkbnxepw;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((e1.wkgbmnqykc) it.next()).lqeggnwhkg(view, f16);
            }
        }
        HashMap map2 = this.f7740zynmafqrjb;
        if (map2 != null) {
            e1.gxszxtbevo.wkgbmnqykc wkgbmnqykcVar3 = null;
            boolean zDxjokdxxww = false;
            for (e1.gxszxtbevo gxszxtbevoVar : map2.values()) {
                if (gxszxtbevoVar instanceof e1.gxszxtbevo.wkgbmnqykc) {
                    wkgbmnqykcVar3 = (e1.gxszxtbevo.wkgbmnqykc) gxszxtbevoVar;
                } else {
                    zDxjokdxxww |= gxszxtbevoVar.dxjokdxxww(view, f16, j13, wkgbmnqykcVar);
                }
            }
            zBtonecajqb = zDxjokdxxww;
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
        } else {
            wkgbmnqykcVar2 = null;
            zBtonecajqb = false;
        }
        a1.zoijcleaow[] zoijcleaowVarArr = this.f7711gtknphoqwx;
        int i14 = 1;
        if (zoijcleaowVarArr != null) {
            double d13 = f16;
            zoijcleaowVarArr[0].wkgbmnqykc(d13, this.f7720kcexrzcfyt);
            this.f7711gtknphoqwx[0].gxszxtbevo(d13, this.f7738zdlpuopuiu);
            a1.zoijcleaow zoijcleaowVar = this.f7707draadjrbmk;
            if (zoijcleaowVar != null) {
                double[] dArr = this.f7720kcexrzcfyt;
                if (dArr.length > 0) {
                    zoijcleaowVar.wkgbmnqykc(d13, dArr);
                    this.f7707draadjrbmk.gxszxtbevo(d13, this.f7738zdlpuopuiu);
                }
            }
            if (!this.f7718jpowsppfya) {
                this.f7723lqeggnwhkg.kcexrzcfyt(f16, view, this.f7726oxmwwwfdhm, this.f7720kcexrzcfyt, this.f7738zdlpuopuiu, null, this.f7733wkgbmnqykc);
                this.f7733wkgbmnqykc = false;
            }
            if (this.f7722lmojexxdyd != ppxfxbqfkf.f7921gxszxtbevo) {
                if (this.f7734wwaezpbzkn == null) {
                    this.f7734wwaezpbzkn = ((View) view.getParent()).findViewById(this.f7722lmojexxdyd);
                }
                View view2 = this.f7734wwaezpbzkn;
                if (view2 != null) {
                    float top = (view2.getTop() + this.f7734wwaezpbzkn.getBottom()) / 2.0f;
                    float left = (this.f7734wwaezpbzkn.getLeft() + this.f7734wwaezpbzkn.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        float left2 = left - view.getLeft();
                        float top2 = top - view.getTop();
                        view.setPivotX(left2);
                        view.setPivotY(top2);
                    }
                }
            }
            HashMap map3 = this.f7716istkbnxepw;
            if (map3 != null) {
                for (a1.btonecajqb btonecajqbVar : map3.values()) {
                    if (btonecajqbVar instanceof e1.wkgbmnqykc.C0631wkgbmnqykc) {
                        double[] dArr2 = this.f7738zdlpuopuiu;
                        if (dArr2.length > 1) {
                            ((e1.wkgbmnqykc.C0631wkgbmnqykc) btonecajqbVar).nufgyqmvbu(view, f16, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (wkgbmnqykcVar2 != null) {
                double[] dArr3 = this.f7738zdlpuopuiu;
                zBtonecajqb |= wkgbmnqykcVar2.btonecajqb(view, wkgbmnqykcVar, f16, j13, dArr3[0], dArr3[1]);
            }
            int i15 = i14;
            while (true) {
                a1.zoijcleaow[] zoijcleaowVarArr2 = this.f7711gtknphoqwx;
                if (i15 >= zoijcleaowVarArr2.length) {
                    break;
                }
                zoijcleaowVarArr2[i15].eablkybsjg(d13, this.f7706cqumvgiudr);
                e1.iobyxmoadg.zoijcleaow((androidx.constraintlayout.widget.iobyxmoadg) this.f7723lqeggnwhkg.f7675wwaezpbzkn.get(this.f7736yggfygwlhe[i15 - 1]), view, this.f7706cqumvgiudr);
                i15++;
            }
            gtknphoqwx gtknphoqwxVar = this.f7708dxjokdxxww;
            if (gtknphoqwxVar.f7808yggfygwlhe == 0) {
                if (f16 <= 0.0f) {
                    view.setVisibility(gtknphoqwxVar.f7794jyumaefscl);
                } else if (f16 >= 1.0f) {
                    view.setVisibility(this.f7704btonecajqb.f7794jyumaefscl);
                } else if (this.f7704btonecajqb.f7794jyumaefscl != gtknphoqwxVar.f7794jyumaefscl) {
                    view.setVisibility(0);
                }
            }
            if (this.f7735yadqdtsiqt != null) {
                int i16 = 0;
                while (true) {
                    btonecajqb[] btonecajqbVarArr = this.f7735yadqdtsiqt;
                    if (i16 >= btonecajqbVarArr.length) {
                        break;
                    }
                    btonecajqbVarArr[i16].yggfygwlhe(f16, view);
                    i16++;
                }
            }
        } else {
            i14 = 1;
            agtfadlqog agtfadlqogVar = this.f7723lqeggnwhkg;
            float f17 = agtfadlqogVar.f7663cqumvgiudr;
            agtfadlqog agtfadlqogVar2 = this.f7724nufgyqmvbu;
            float f18 = f17 + ((agtfadlqogVar2.f7663cqumvgiudr - f17) * f16);
            float f19 = agtfadlqogVar.f7664esjtqupxsv;
            float f23 = f19 + ((agtfadlqogVar2.f7664esjtqupxsv - f19) * f16);
            float f24 = agtfadlqogVar.f7671lereixgezr;
            float f25 = agtfadlqogVar2.f7671lereixgezr;
            float f26 = agtfadlqogVar.f7674pmvmpeiblj;
            float f27 = agtfadlqogVar2.f7674pmvmpeiblj;
            float f28 = f18 + 0.5f;
            int i17 = (int) f28;
            float f29 = f23 + 0.5f;
            int i18 = (int) f29;
            int i19 = (int) (f28 + ((f25 - f24) * f16) + f24);
            int i23 = (int) (f29 + ((f27 - f26) * f16) + f26);
            int i24 = i19 - i17;
            int i25 = i23 - i18;
            if (f25 != f24 || f27 != f26 || this.f7733wkgbmnqykc) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i24, 1073741824), View.MeasureSpec.makeMeasureSpec(i25, 1073741824));
                this.f7733wkgbmnqykc = false;
            }
            view.layout(i17, i18, i19, i23);
        }
        HashMap map4 = this.f7705cdpycssgdh;
        if (map4 != null) {
            for (e1.ppxfxbqfkf ppxfxbqfkfVar : map4.values()) {
                if (ppxfxbqfkfVar instanceof e1.ppxfxbqfkf.wkgbmnqykc) {
                    double[] dArr4 = this.f7738zdlpuopuiu;
                    ((e1.ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).btonecajqb(view, f16, dArr4[0], dArr4[i14]);
                } else {
                    ppxfxbqfkfVar.dxjokdxxww(view, f16);
                }
            }
        }
        return zBtonecajqb;
    }

    void zoijcleaow(ArrayList arrayList) {
        this.f7728pmvmpeiblj.addAll(arrayList);
    }

    void zynmafqrjb(View view) {
        agtfadlqog agtfadlqogVar = this.f7723lqeggnwhkg;
        agtfadlqogVar.f7670jyumaefscl = 0.0f;
        agtfadlqogVar.f7668iwizpuwonk = 0.0f;
        agtfadlqogVar.vdvldrhtss(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f7708dxjokdxxww.dxjokdxxww(view);
    }
}
