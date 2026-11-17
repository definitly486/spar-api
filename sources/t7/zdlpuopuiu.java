package t7;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.xrmfcynszj;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
abstract class zdlpuopuiu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Interpolator f109999iobyxmoadg = new LinearInterpolator();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static u7.ppxfxbqfkf.iobyxmoadg f110000ppxfxbqfkf = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    static u7.ppxfxbqfkf.iobyxmoadg f110001wkgbmnqykc = u7.ppxfxbqfkf.iobyxmoadg.iobyxmoadg("x", "y");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static xrmfcynszj f110002zoijcleaow;

    /* JADX WARN: Code duplicated, block: B:93:0x01ea  */
    private static w7.iobyxmoadg eablkybsjg(com.airbnb.lottie.btonecajqb btonecajqbVar, u7.ppxfxbqfkf ppxfxbqfkfVar, float f13, cllcsxoeiz cllcsxoeizVar) {
        Interpolator interpolatorZoijcleaow;
        Interpolator interpolatorZoijcleaow2;
        Interpolator interpolatorZoijcleaow3;
        Object obj;
        w7.iobyxmoadg iobyxmoadgVar;
        PointF pointF;
        float f14;
        PointF pointF2;
        ppxfxbqfkfVar.lqeggnwhkg();
        PointF pointFEablkybsjg = null;
        boolean z13 = false;
        PointF pointFEablkybsjg2 = null;
        PointF pointFEablkybsjg3 = null;
        PointF pointF3 = null;
        Object objIobyxmoadg = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        float fAgtfadlqog = 0.0f;
        PointF pointFEablkybsjg4 = null;
        Object objIobyxmoadg2 = null;
        while (ppxfxbqfkfVar.btonecajqb()) {
            switch (ppxfxbqfkfVar.cqumvgiudr(f110000ppxfxbqfkf)) {
                case 0:
                    pointF = pointFEablkybsjg;
                    fAgtfadlqog = (float) ppxfxbqfkfVar.agtfadlqog();
                    pointFEablkybsjg = pointF;
                    break;
                case 1:
                    pointF = pointFEablkybsjg;
                    objIobyxmoadg = cllcsxoeizVar.iobyxmoadg(ppxfxbqfkfVar, f13);
                    pointFEablkybsjg = pointF;
                    break;
                case 2:
                    pointF = pointFEablkybsjg;
                    objIobyxmoadg2 = cllcsxoeizVar.iobyxmoadg(ppxfxbqfkfVar, f13);
                    pointFEablkybsjg = pointF;
                    break;
                case 3:
                    pointF = pointFEablkybsjg;
                    f14 = fAgtfadlqog;
                    PointF pointF7 = pointFEablkybsjg4;
                    if (ppxfxbqfkfVar.zdlpuopuiu() == u7.ppxfxbqfkf.zoijcleaow.BEGIN_OBJECT) {
                        ppxfxbqfkfVar.lqeggnwhkg();
                        float fAgtfadlqog2 = 0.0f;
                        float fAgtfadlqog3 = 0.0f;
                        float fAgtfadlqog4 = 0.0f;
                        float fAgtfadlqog5 = 0.0f;
                        while (ppxfxbqfkfVar.btonecajqb()) {
                            int iCqumvgiudr = ppxfxbqfkfVar.cqumvgiudr(f110001wkgbmnqykc);
                            if (iCqumvgiudr == 0) {
                                u7.ppxfxbqfkf.zoijcleaow zoijcleaowVarZdlpuopuiu = ppxfxbqfkfVar.zdlpuopuiu();
                                u7.ppxfxbqfkf.zoijcleaow zoijcleaowVar = u7.ppxfxbqfkf.zoijcleaow.NUMBER;
                                if (zoijcleaowVarZdlpuopuiu == zoijcleaowVar) {
                                    fAgtfadlqog4 = (float) ppxfxbqfkfVar.agtfadlqog();
                                    fAgtfadlqog2 = fAgtfadlqog4;
                                } else {
                                    ppxfxbqfkfVar.wkgbmnqykc();
                                    fAgtfadlqog2 = (float) ppxfxbqfkfVar.agtfadlqog();
                                    fAgtfadlqog4 = ppxfxbqfkfVar.zdlpuopuiu() == zoijcleaowVar ? (float) ppxfxbqfkfVar.agtfadlqog() : fAgtfadlqog2;
                                    ppxfxbqfkfVar.nufgyqmvbu();
                                }
                            } else if (iCqumvgiudr != 1) {
                                ppxfxbqfkfVar.pmvmpeiblj();
                            } else {
                                u7.ppxfxbqfkf.zoijcleaow zoijcleaowVarZdlpuopuiu2 = ppxfxbqfkfVar.zdlpuopuiu();
                                u7.ppxfxbqfkf.zoijcleaow zoijcleaowVar2 = u7.ppxfxbqfkf.zoijcleaow.NUMBER;
                                if (zoijcleaowVarZdlpuopuiu2 == zoijcleaowVar2) {
                                    fAgtfadlqog5 = (float) ppxfxbqfkfVar.agtfadlqog();
                                    fAgtfadlqog3 = fAgtfadlqog5;
                                } else {
                                    ppxfxbqfkfVar.wkgbmnqykc();
                                    fAgtfadlqog3 = (float) ppxfxbqfkfVar.agtfadlqog();
                                    fAgtfadlqog5 = ppxfxbqfkfVar.zdlpuopuiu() == zoijcleaowVar2 ? (float) ppxfxbqfkfVar.agtfadlqog() : fAgtfadlqog3;
                                    ppxfxbqfkfVar.nufgyqmvbu();
                                }
                            }
                        }
                        PointF pointF8 = new PointF(fAgtfadlqog2, fAgtfadlqog3);
                        PointF pointF9 = new PointF(fAgtfadlqog4, fAgtfadlqog5);
                        ppxfxbqfkfVar.dxjokdxxww();
                        pointF4 = pointF9;
                        pointF3 = pointF8;
                        pointFEablkybsjg4 = pointF7;
                        fAgtfadlqog = f14;
                    } else {
                        pointFEablkybsjg2 = kcexrzcfyt.eablkybsjg(ppxfxbqfkfVar, f13);
                        fAgtfadlqog = f14;
                        pointFEablkybsjg4 = pointF7;
                    }
                    pointFEablkybsjg = pointF;
                    break;
                case 4:
                    if (ppxfxbqfkfVar.zdlpuopuiu() == u7.ppxfxbqfkf.zoijcleaow.BEGIN_OBJECT) {
                        ppxfxbqfkfVar.lqeggnwhkg();
                        float fAgtfadlqog6 = 0.0f;
                        float f15 = 0.0f;
                        float fAgtfadlqog7 = 0.0f;
                        float fAgtfadlqog8 = 0.0f;
                        while (ppxfxbqfkfVar.btonecajqb()) {
                            pointFEablkybsjg4 = pointFEablkybsjg4;
                            int iCqumvgiudr2 = ppxfxbqfkfVar.cqumvgiudr(f110001wkgbmnqykc);
                            if (iCqumvgiudr2 != 0) {
                                pointF2 = pointFEablkybsjg;
                                if (iCqumvgiudr2 != 1) {
                                    ppxfxbqfkfVar.pmvmpeiblj();
                                } else {
                                    u7.ppxfxbqfkf.zoijcleaow zoijcleaowVarZdlpuopuiu3 = ppxfxbqfkfVar.zdlpuopuiu();
                                    u7.ppxfxbqfkf.zoijcleaow zoijcleaowVar3 = u7.ppxfxbqfkf.zoijcleaow.NUMBER;
                                    if (zoijcleaowVarZdlpuopuiu3 == zoijcleaowVar3) {
                                        fAgtfadlqog8 = (float) ppxfxbqfkfVar.agtfadlqog();
                                        fAgtfadlqog = fAgtfadlqog;
                                        f15 = fAgtfadlqog8;
                                    } else {
                                        float f16 = fAgtfadlqog;
                                        ppxfxbqfkfVar.wkgbmnqykc();
                                        float fAgtfadlqog9 = (float) ppxfxbqfkfVar.agtfadlqog();
                                        float fAgtfadlqog10 = ppxfxbqfkfVar.zdlpuopuiu() == zoijcleaowVar3 ? (float) ppxfxbqfkfVar.agtfadlqog() : fAgtfadlqog9;
                                        ppxfxbqfkfVar.nufgyqmvbu();
                                        fAgtfadlqog = f16;
                                        pointFEablkybsjg = pointF2;
                                        fAgtfadlqog8 = fAgtfadlqog10;
                                        f15 = fAgtfadlqog9;
                                    }
                                }
                            } else {
                                pointF2 = pointFEablkybsjg;
                                float f17 = fAgtfadlqog;
                                u7.ppxfxbqfkf.zoijcleaow zoijcleaowVarZdlpuopuiu4 = ppxfxbqfkfVar.zdlpuopuiu();
                                u7.ppxfxbqfkf.zoijcleaow zoijcleaowVar4 = u7.ppxfxbqfkf.zoijcleaow.NUMBER;
                                if (zoijcleaowVarZdlpuopuiu4 == zoijcleaowVar4) {
                                    fAgtfadlqog7 = (float) ppxfxbqfkfVar.agtfadlqog();
                                    fAgtfadlqog = f17;
                                    fAgtfadlqog6 = fAgtfadlqog7;
                                } else {
                                    ppxfxbqfkfVar.wkgbmnqykc();
                                    fAgtfadlqog6 = (float) ppxfxbqfkfVar.agtfadlqog();
                                    fAgtfadlqog7 = ppxfxbqfkfVar.zdlpuopuiu() == zoijcleaowVar4 ? (float) ppxfxbqfkfVar.agtfadlqog() : fAgtfadlqog6;
                                    ppxfxbqfkfVar.nufgyqmvbu();
                                    fAgtfadlqog = f17;
                                }
                            }
                            pointFEablkybsjg = pointF2;
                        }
                        pointF = pointFEablkybsjg;
                        f14 = fAgtfadlqog;
                        PointF pointF10 = new PointF(fAgtfadlqog6, f15);
                        PointF pointF11 = new PointF(fAgtfadlqog7, fAgtfadlqog8);
                        ppxfxbqfkfVar.dxjokdxxww();
                        pointF6 = pointF11;
                        pointF5 = pointF10;
                        fAgtfadlqog = f14;
                    } else {
                        pointF = pointFEablkybsjg;
                        pointFEablkybsjg3 = kcexrzcfyt.eablkybsjg(ppxfxbqfkfVar, f13);
                    }
                    pointFEablkybsjg = pointF;
                    break;
                case 5:
                    z13 = ppxfxbqfkfVar.ojitshcjhn() == 1;
                    break;
                case 6:
                    pointFEablkybsjg4 = kcexrzcfyt.eablkybsjg(ppxfxbqfkfVar, f13);
                    break;
                case 7:
                    pointFEablkybsjg = kcexrzcfyt.eablkybsjg(ppxfxbqfkfVar, f13);
                    break;
                default:
                    ppxfxbqfkfVar.pmvmpeiblj();
                    break;
            }
        }
        PointF pointF12 = pointFEablkybsjg;
        float f18 = fAgtfadlqog;
        PointF pointF13 = pointFEablkybsjg4;
        ppxfxbqfkfVar.dxjokdxxww();
        if (z13) {
            interpolatorZoijcleaow = f109999iobyxmoadg;
            obj = objIobyxmoadg;
        } else {
            if (pointFEablkybsjg2 == null || pointFEablkybsjg3 == null) {
                if (pointF3 == null || pointF4 == null || pointF5 == null || pointF6 == null) {
                    interpolatorZoijcleaow = f109999iobyxmoadg;
                } else {
                    interpolatorZoijcleaow2 = zoijcleaow(pointF3, pointF5);
                    interpolatorZoijcleaow3 = zoijcleaow(pointF4, pointF6);
                    obj = objIobyxmoadg2;
                    interpolatorZoijcleaow = null;
                }
                if (interpolatorZoijcleaow2 != null || interpolatorZoijcleaow3 == null) {
                    iobyxmoadgVar = new w7.iobyxmoadg(btonecajqbVar, objIobyxmoadg, obj, interpolatorZoijcleaow, f18, null);
                } else {
                    iobyxmoadgVar = new w7.iobyxmoadg(btonecajqbVar, objIobyxmoadg, obj, interpolatorZoijcleaow2, interpolatorZoijcleaow3, f18, null);
                }
                iobyxmoadgVar.f118915ojitshcjhn = pointF13;
                iobyxmoadgVar.f118917rgvfuqvkyq = pointF12;
                return iobyxmoadgVar;
            }
            interpolatorZoijcleaow = zoijcleaow(pointFEablkybsjg2, pointFEablkybsjg3);
            obj = objIobyxmoadg2;
        }
        interpolatorZoijcleaow2 = null;
        interpolatorZoijcleaow3 = null;
        if (interpolatorZoijcleaow2 != null) {
            iobyxmoadgVar = new w7.iobyxmoadg(btonecajqbVar, objIobyxmoadg, obj, interpolatorZoijcleaow, f18, null);
        } else {
            iobyxmoadgVar = new w7.iobyxmoadg(btonecajqbVar, objIobyxmoadg, obj, interpolatorZoijcleaow, f18, null);
        }
        iobyxmoadgVar.f118915ojitshcjhn = pointF13;
        iobyxmoadgVar.f118917rgvfuqvkyq = pointF12;
        return iobyxmoadgVar;
    }

    private static w7.iobyxmoadg gxszxtbevo(u7.ppxfxbqfkf ppxfxbqfkfVar, float f13, cllcsxoeiz cllcsxoeizVar) {
        return new w7.iobyxmoadg(cllcsxoeizVar.iobyxmoadg(ppxfxbqfkfVar, f13));
    }

    private static WeakReference iobyxmoadg(int i13) {
        WeakReference weakReference;
        synchronized (zdlpuopuiu.class) {
            weakReference = (WeakReference) lqeggnwhkg().eablkybsjg(i13);
        }
        return weakReference;
    }

    private static xrmfcynszj lqeggnwhkg() {
        if (f110002zoijcleaow == null) {
            f110002zoijcleaow = new xrmfcynszj();
        }
        return f110002zoijcleaow;
    }

    private static void nufgyqmvbu(int i13, WeakReference weakReference) {
        synchronized (zdlpuopuiu.class) {
            f110002zoijcleaow.draadjrbmk(i13, weakReference);
        }
    }

    static w7.iobyxmoadg ppxfxbqfkf(u7.ppxfxbqfkf ppxfxbqfkfVar, com.airbnb.lottie.btonecajqb btonecajqbVar, float f13, cllcsxoeiz cllcsxoeizVar, boolean z13, boolean z14) {
        if (z13 && z14) {
            return eablkybsjg(btonecajqbVar, ppxfxbqfkfVar, f13, cllcsxoeizVar);
        }
        return z13 ? wkgbmnqykc(btonecajqbVar, ppxfxbqfkfVar, f13, cllcsxoeizVar) : gxszxtbevo(ppxfxbqfkfVar, f13, cllcsxoeizVar);
    }

    private static w7.iobyxmoadg wkgbmnqykc(com.airbnb.lottie.btonecajqb btonecajqbVar, u7.ppxfxbqfkf ppxfxbqfkfVar, float f13, cllcsxoeiz cllcsxoeizVar) {
        Interpolator interpolatorZoijcleaow;
        Object obj;
        ppxfxbqfkfVar.lqeggnwhkg();
        PointF pointFEablkybsjg = null;
        Object objIobyxmoadg = null;
        Object objIobyxmoadg2 = null;
        PointF pointFEablkybsjg2 = null;
        PointF pointFEablkybsjg3 = null;
        float fAgtfadlqog = 0.0f;
        boolean z13 = false;
        PointF pointFEablkybsjg4 = null;
        while (ppxfxbqfkfVar.btonecajqb()) {
            switch (ppxfxbqfkfVar.cqumvgiudr(f110000ppxfxbqfkf)) {
                case 0:
                    fAgtfadlqog = (float) ppxfxbqfkfVar.agtfadlqog();
                    break;
                case 1:
                    objIobyxmoadg2 = cllcsxoeizVar.iobyxmoadg(ppxfxbqfkfVar, f13);
                    break;
                case 2:
                    objIobyxmoadg = cllcsxoeizVar.iobyxmoadg(ppxfxbqfkfVar, f13);
                    break;
                case 3:
                    pointFEablkybsjg = kcexrzcfyt.eablkybsjg(ppxfxbqfkfVar, 1.0f);
                    break;
                case 4:
                    pointFEablkybsjg4 = kcexrzcfyt.eablkybsjg(ppxfxbqfkfVar, 1.0f);
                    break;
                case 5:
                    z13 = ppxfxbqfkfVar.ojitshcjhn() == 1;
                    break;
                case 6:
                    pointFEablkybsjg2 = kcexrzcfyt.eablkybsjg(ppxfxbqfkfVar, f13);
                    break;
                case 7:
                    pointFEablkybsjg3 = kcexrzcfyt.eablkybsjg(ppxfxbqfkfVar, f13);
                    break;
                default:
                    ppxfxbqfkfVar.pmvmpeiblj();
                    break;
            }
        }
        ppxfxbqfkfVar.dxjokdxxww();
        if (z13) {
            interpolatorZoijcleaow = f109999iobyxmoadg;
            obj = objIobyxmoadg2;
        } else {
            interpolatorZoijcleaow = (pointFEablkybsjg == null || pointFEablkybsjg4 == null) ? f109999iobyxmoadg : zoijcleaow(pointFEablkybsjg, pointFEablkybsjg4);
            obj = objIobyxmoadg;
        }
        w7.iobyxmoadg iobyxmoadgVar = new w7.iobyxmoadg(btonecajqbVar, objIobyxmoadg2, obj, interpolatorZoijcleaow, fAgtfadlqog, null);
        iobyxmoadgVar.f118915ojitshcjhn = pointFEablkybsjg2;
        iobyxmoadgVar.f118917rgvfuqvkyq = pointFEablkybsjg3;
        return iobyxmoadgVar;
    }

    private static Interpolator zoijcleaow(PointF pointF, PointF pointF2) {
        Interpolator interpolatorIobyxmoadg;
        pointF.x = v7.dxjokdxxww.zoijcleaow(pointF.x, -1.0f, 1.0f);
        pointF.y = v7.dxjokdxxww.zoijcleaow(pointF.y, -100.0f, 100.0f);
        pointF2.x = v7.dxjokdxxww.zoijcleaow(pointF2.x, -1.0f, 1.0f);
        float fZoijcleaow = v7.dxjokdxxww.zoijcleaow(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fZoijcleaow;
        int iDxjokdxxww = v7.btonecajqb.dxjokdxxww(pointF.x, pointF.y, pointF2.x, fZoijcleaow);
        WeakReference weakReferenceIobyxmoadg = com.airbnb.lottie.eablkybsjg.eablkybsjg() ? null : iobyxmoadg(iDxjokdxxww);
        Interpolator interpolator = weakReferenceIobyxmoadg != null ? (Interpolator) weakReferenceIobyxmoadg.get() : null;
        if (weakReferenceIobyxmoadg == null || interpolator == null) {
            try {
                interpolatorIobyxmoadg = x1.iobyxmoadg.iobyxmoadg(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e13) {
                interpolatorIobyxmoadg = "The Path cannot loop back on itself.".equals(e13.getMessage()) ? x1.iobyxmoadg.iobyxmoadg(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator = interpolatorIobyxmoadg;
            if (!com.airbnb.lottie.eablkybsjg.eablkybsjg()) {
                try {
                    nufgyqmvbu(iDxjokdxxww, new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }
}
