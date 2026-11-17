package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
class gtknphoqwx implements Comparable {

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    static String[] f7782sopmlzcsov = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private float f7786dsvhmnatus;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private a1.ppxfxbqfkf f7789hkdspvbjdz;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    int f7794jyumaefscl;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private float f7795kegysxyocb;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private float f7802stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private float f7803tzroggbefp;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private float f7806wypolnanlu;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public float f7810zdlpuopuiu = 0.0f;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    int f7808yggfygwlhe = 0;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    LinkedHashMap f7792iwizpuwonk = new LinkedHashMap();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    int f7785cqumvgiudr = 0;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    double[] f7787esjtqupxsv = new double[18];

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    double[] f7796lereixgezr = new double[18];

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private float f7801pmvmpeiblj = 1.0f;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f7811zynmafqrjb = false;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private float f7791istkbnxepw = 0.0f;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private float f7783cdpycssgdh = 0.0f;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private float f7807yadqdtsiqt = 0.0f;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private float f7790iozdgvuglv = 1.0f;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private float f7797lmojexxdyd = 1.0f;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private float f7805wwaezpbzkn = Float.NaN;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private float f7809ylkuphrtab = Float.NaN;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private float f7800pkzmftpjix = 0.0f;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private float f7788hcddaimhww = 0.0f;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private float f7793jpowsppfya = 0.0f;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private int f7784cllcsxoeiz = 0;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private float f7798mbcevpiqjq = Float.NaN;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private float f7799ntlheqmsrt = Float.NaN;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private int f7804ulzqkzuiru = -1;

    gtknphoqwx() {
    }

    private boolean eablkybsjg(float f13, float f14) {
        if (Float.isNaN(f13) || Float.isNaN(f14)) {
            return Float.isNaN(f13) != Float.isNaN(f14);
        }
        return Math.abs(f13 - f14) > 1.0E-6f;
    }

    public void dxjokdxxww(View view) {
        lqeggnwhkg(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        zoijcleaow(view);
    }

    void gxszxtbevo(gtknphoqwx gtknphoqwxVar, HashSet hashSet) {
        if (eablkybsjg(this.f7801pmvmpeiblj, gtknphoqwxVar.f7801pmvmpeiblj)) {
            hashSet.add("alpha");
        }
        if (eablkybsjg(this.f7791istkbnxepw, gtknphoqwxVar.f7791istkbnxepw)) {
            hashSet.add("elevation");
        }
        int i13 = this.f7794jyumaefscl;
        int i14 = gtknphoqwxVar.f7794jyumaefscl;
        if (i13 != i14 && this.f7808yggfygwlhe == 0 && (i13 == 0 || i14 == 0)) {
            hashSet.add("alpha");
        }
        if (eablkybsjg(this.f7783cdpycssgdh, gtknphoqwxVar.f7783cdpycssgdh)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f7798mbcevpiqjq) || !Float.isNaN(gtknphoqwxVar.f7798mbcevpiqjq)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f7799ntlheqmsrt) || !Float.isNaN(gtknphoqwxVar.f7799ntlheqmsrt)) {
            hashSet.add("progress");
        }
        if (eablkybsjg(this.f7807yadqdtsiqt, gtknphoqwxVar.f7807yadqdtsiqt)) {
            hashSet.add("rotationX");
        }
        if (eablkybsjg(this.f7810zdlpuopuiu, gtknphoqwxVar.f7810zdlpuopuiu)) {
            hashSet.add("rotationY");
        }
        if (eablkybsjg(this.f7805wwaezpbzkn, gtknphoqwxVar.f7805wwaezpbzkn)) {
            hashSet.add("transformPivotX");
        }
        if (eablkybsjg(this.f7809ylkuphrtab, gtknphoqwxVar.f7809ylkuphrtab)) {
            hashSet.add("transformPivotY");
        }
        if (eablkybsjg(this.f7790iozdgvuglv, gtknphoqwxVar.f7790iozdgvuglv)) {
            hashSet.add("scaleX");
        }
        if (eablkybsjg(this.f7797lmojexxdyd, gtknphoqwxVar.f7797lmojexxdyd)) {
            hashSet.add("scaleY");
        }
        if (eablkybsjg(this.f7800pkzmftpjix, gtknphoqwxVar.f7800pkzmftpjix)) {
            hashSet.add("translationX");
        }
        if (eablkybsjg(this.f7788hcddaimhww, gtknphoqwxVar.f7788hcddaimhww)) {
            hashSet.add("translationY");
        }
        if (eablkybsjg(this.f7793jpowsppfya, gtknphoqwxVar.f7793jpowsppfya)) {
            hashSet.add("translationZ");
        }
    }

    public void iobyxmoadg(HashMap map, int i13) {
        for (String str : map.keySet()) {
            e1.wkgbmnqykc wkgbmnqykcVar = (e1.wkgbmnqykc) map.get(str);
            if (wkgbmnqykcVar != null) {
                str.hashCode();
                switch (str) {
                    case "rotationX":
                        wkgbmnqykcVar.zoijcleaow(i13, Float.isNaN(this.f7807yadqdtsiqt) ? 0.0f : this.f7807yadqdtsiqt);
                        break;
                    case "rotationY":
                        wkgbmnqykcVar.zoijcleaow(i13, Float.isNaN(this.f7810zdlpuopuiu) ? 0.0f : this.f7810zdlpuopuiu);
                        break;
                    case "translationX":
                        wkgbmnqykcVar.zoijcleaow(i13, Float.isNaN(this.f7800pkzmftpjix) ? 0.0f : this.f7800pkzmftpjix);
                        break;
                    case "translationY":
                        wkgbmnqykcVar.zoijcleaow(i13, Float.isNaN(this.f7788hcddaimhww) ? 0.0f : this.f7788hcddaimhww);
                        break;
                    case "translationZ":
                        wkgbmnqykcVar.zoijcleaow(i13, Float.isNaN(this.f7793jpowsppfya) ? 0.0f : this.f7793jpowsppfya);
                        break;
                    case "progress":
                        wkgbmnqykcVar.zoijcleaow(i13, Float.isNaN(this.f7799ntlheqmsrt) ? 0.0f : this.f7799ntlheqmsrt);
                        break;
                    case "scaleX":
                        wkgbmnqykcVar.zoijcleaow(i13, Float.isNaN(this.f7790iozdgvuglv) ? 1.0f : this.f7790iozdgvuglv);
                        break;
                    case "scaleY":
                        wkgbmnqykcVar.zoijcleaow(i13, Float.isNaN(this.f7797lmojexxdyd) ? 1.0f : this.f7797lmojexxdyd);
                        break;
                    case "transformPivotX":
                        wkgbmnqykcVar.zoijcleaow(i13, Float.isNaN(this.f7805wwaezpbzkn) ? 0.0f : this.f7805wwaezpbzkn);
                        break;
                    case "transformPivotY":
                        wkgbmnqykcVar.zoijcleaow(i13, Float.isNaN(this.f7809ylkuphrtab) ? 0.0f : this.f7809ylkuphrtab);
                        break;
                    case "rotation":
                        wkgbmnqykcVar.zoijcleaow(i13, Float.isNaN(this.f7783cdpycssgdh) ? 0.0f : this.f7783cdpycssgdh);
                        break;
                    case "elevation":
                        wkgbmnqykcVar.zoijcleaow(i13, Float.isNaN(this.f7791istkbnxepw) ? 0.0f : this.f7791istkbnxepw);
                        break;
                    case "transitionPathRotate":
                        wkgbmnqykcVar.zoijcleaow(i13, Float.isNaN(this.f7798mbcevpiqjq) ? 0.0f : this.f7798mbcevpiqjq);
                        break;
                    case "alpha":
                        wkgbmnqykcVar.zoijcleaow(i13, Float.isNaN(this.f7801pmvmpeiblj) ? 1.0f : this.f7801pmvmpeiblj);
                        break;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            Log.e("MotionPaths", "UNKNOWN spline " + str);
                            break;
                        } else {
                            String str2 = str.split(StringUtils.COMMA)[1];
                            if (this.f7792iwizpuwonk.containsKey(str2)) {
                                androidx.constraintlayout.widget.iobyxmoadg iobyxmoadgVar = (androidx.constraintlayout.widget.iobyxmoadg) this.f7792iwizpuwonk.get(str2);
                                if (wkgbmnqykcVar instanceof e1.wkgbmnqykc.zoijcleaow) {
                                    ((e1.wkgbmnqykc.zoijcleaow) wkgbmnqykcVar).nufgyqmvbu(i13, iobyxmoadgVar);
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i13 + ", value" + iobyxmoadgVar.eablkybsjg() + wkgbmnqykcVar);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        }
    }

    void lqeggnwhkg(float f13, float f14, float f15, float f16) {
        this.f7806wypolnanlu = f13;
        this.f7802stevsuqkhv = f14;
        this.f7795kegysxyocb = f15;
        this.f7803tzroggbefp = f16;
    }

    public void nufgyqmvbu(Rect rect, androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar, int i13, int i14) {
        lqeggnwhkg(rect.left, rect.top, rect.width(), rect.height());
        ppxfxbqfkf(wkgbmnqykcVar.cqumvgiudr(i14));
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        return;
                    }
                }
            }
            float f13 = this.f7783cdpycssgdh + 90.0f;
            this.f7783cdpycssgdh = f13;
            if (f13 > 180.0f) {
                this.f7783cdpycssgdh = f13 - 360.0f;
                return;
            }
            return;
        }
        this.f7783cdpycssgdh -= 90.0f;
    }

    public void ppxfxbqfkf(androidx.constraintlayout.widget.wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
        androidx.constraintlayout.widget.wkgbmnqykc.C0131wkgbmnqykc c0131wkgbmnqykc = iobyxmoadgVar.f8174ppxfxbqfkf;
        int i13 = c0131wkgbmnqykc.f8206ppxfxbqfkf;
        this.f7808yggfygwlhe = i13;
        int i14 = c0131wkgbmnqykc.f8208zoijcleaow;
        this.f7794jyumaefscl = i14;
        this.f7801pmvmpeiblj = (i14 == 0 || i13 != 0) ? c0131wkgbmnqykc.f8207wkgbmnqykc : 0.0f;
        androidx.constraintlayout.widget.wkgbmnqykc.eablkybsjg eablkybsjgVar = iobyxmoadgVar.f8170gxszxtbevo;
        this.f7811zynmafqrjb = eablkybsjgVar.f8166wflxmlrfwp;
        this.f7791istkbnxepw = eablkybsjgVar.f8155agtfadlqog;
        this.f7783cdpycssgdh = eablkybsjgVar.f8168zoijcleaow;
        this.f7807yadqdtsiqt = eablkybsjgVar.f8165ppxfxbqfkf;
        this.f7810zdlpuopuiu = eablkybsjgVar.f8167wkgbmnqykc;
        this.f7790iozdgvuglv = eablkybsjgVar.f8159eablkybsjg;
        this.f7797lmojexxdyd = eablkybsjgVar.f8161gxszxtbevo;
        this.f7805wwaezpbzkn = eablkybsjgVar.f8163lqeggnwhkg;
        this.f7809ylkuphrtab = eablkybsjgVar.f8164nufgyqmvbu;
        this.f7800pkzmftpjix = eablkybsjgVar.f8156btonecajqb;
        this.f7788hcddaimhww = eablkybsjgVar.f8160gtknphoqwx;
        this.f7793jpowsppfya = eablkybsjgVar.f8157draadjrbmk;
        this.f7789hkdspvbjdz = a1.ppxfxbqfkf.ppxfxbqfkf(iobyxmoadgVar.f8175wkgbmnqykc.f8202wkgbmnqykc);
        androidx.constraintlayout.widget.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadgVar.f8175wkgbmnqykc;
        this.f7798mbcevpiqjq = ppxfxbqfkfVar.f8193dxjokdxxww;
        this.f7784cllcsxoeiz = ppxfxbqfkfVar.f8196gxszxtbevo;
        this.f7804ulzqkzuiru = ppxfxbqfkfVar.f8203zoijcleaow;
        this.f7799ntlheqmsrt = iobyxmoadgVar.f8174ppxfxbqfkf.f8204eablkybsjg;
        for (String str : iobyxmoadgVar.f8172lqeggnwhkg.keySet()) {
            androidx.constraintlayout.widget.iobyxmoadg iobyxmoadgVar2 = (androidx.constraintlayout.widget.iobyxmoadg) iobyxmoadgVar.f8172lqeggnwhkg.get(str);
            if (iobyxmoadgVar2.lqeggnwhkg()) {
                this.f7792iwizpuwonk.put(str, iobyxmoadgVar2);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public int compareTo(gtknphoqwx gtknphoqwxVar) {
        return Float.compare(this.f7786dsvhmnatus, gtknphoqwxVar.f7786dsvhmnatus);
    }

    public void zoijcleaow(View view) {
        this.f7794jyumaefscl = view.getVisibility();
        this.f7801pmvmpeiblj = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f7811zynmafqrjb = false;
        this.f7791istkbnxepw = view.getElevation();
        this.f7783cdpycssgdh = view.getRotation();
        this.f7807yadqdtsiqt = view.getRotationX();
        this.f7810zdlpuopuiu = view.getRotationY();
        this.f7790iozdgvuglv = view.getScaleX();
        this.f7797lmojexxdyd = view.getScaleY();
        this.f7805wwaezpbzkn = view.getPivotX();
        this.f7809ylkuphrtab = view.getPivotY();
        this.f7800pkzmftpjix = view.getTranslationX();
        this.f7788hcddaimhww = view.getTranslationY();
        this.f7793jpowsppfya = view.getTranslationZ();
    }
}
