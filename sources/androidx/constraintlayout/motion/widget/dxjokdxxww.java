package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class dxjokdxxww extends ppxfxbqfkf {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private String f7751lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f7752nufgyqmvbu = -1;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private float f7746dxjokdxxww = Float.NaN;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private float f7743btonecajqb = Float.NaN;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private float f7747gtknphoqwx = Float.NaN;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private float f7745draadjrbmk = Float.NaN;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private float f7757wflxmlrfwp = Float.NaN;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private float f7742agtfadlqog = Float.NaN;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private float f7753ojitshcjhn = Float.NaN;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private float f7755rgvfuqvkyq = Float.NaN;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private float f7756vdvldrhtss = Float.NaN;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private float f7754oxmwwwfdhm = Float.NaN;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private float f7750kcexrzcfyt = Float.NaN;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private float f7759zdlpuopuiu = Float.NaN;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f7758yggfygwlhe = 0;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private String f7749jyumaefscl = null;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private float f7748iwizpuwonk = Float.NaN;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private float f7744cqumvgiudr = 0.0f;

    private static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static SparseIntArray f7760iobyxmoadg;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7760iobyxmoadg = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTimeCycle_android_alpha, 1);
            f7760iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTimeCycle_android_elevation, 2);
            f7760iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTimeCycle_android_rotation, 4);
            f7760iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTimeCycle_android_rotationX, 5);
            f7760iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTimeCycle_android_rotationY, 6);
            f7760iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTimeCycle_android_scaleX, 7);
            f7760iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTimeCycle_transitionPathRotate, 8);
            f7760iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTimeCycle_transitionEasing, 9);
            f7760iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTimeCycle_motionTarget, 10);
            f7760iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTimeCycle_framePosition, 12);
            f7760iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTimeCycle_curveFit, 13);
            f7760iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTimeCycle_android_scaleY, 14);
            f7760iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTimeCycle_android_translationX, 15);
            f7760iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTimeCycle_android_translationY, 16);
            f7760iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTimeCycle_android_translationZ, 17);
            f7760iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTimeCycle_motionProgress, 18);
            f7760iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTimeCycle_wavePeriod, 20);
            f7760iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTimeCycle_waveOffset, 21);
            f7760iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTimeCycle_waveShape, 19);
        }

        public static void iobyxmoadg(dxjokdxxww dxjokdxxwwVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArray.getIndex(i13);
                switch (f7760iobyxmoadg.get(index)) {
                    case 1:
                        dxjokdxxwwVar.f7746dxjokdxxww = typedArray.getFloat(index, dxjokdxxwwVar.f7746dxjokdxxww);
                        break;
                    case 2:
                        dxjokdxxwwVar.f7743btonecajqb = typedArray.getDimension(index, dxjokdxxwwVar.f7743btonecajqb);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f7760iobyxmoadg.get(index));
                        break;
                    case 4:
                        dxjokdxxwwVar.f7747gtknphoqwx = typedArray.getFloat(index, dxjokdxxwwVar.f7747gtknphoqwx);
                        break;
                    case 5:
                        dxjokdxxwwVar.f7745draadjrbmk = typedArray.getFloat(index, dxjokdxxwwVar.f7745draadjrbmk);
                        break;
                    case 6:
                        dxjokdxxwwVar.f7757wflxmlrfwp = typedArray.getFloat(index, dxjokdxxwwVar.f7757wflxmlrfwp);
                        break;
                    case 7:
                        dxjokdxxwwVar.f7753ojitshcjhn = typedArray.getFloat(index, dxjokdxxwwVar.f7753ojitshcjhn);
                        break;
                    case 8:
                        dxjokdxxwwVar.f7742agtfadlqog = typedArray.getFloat(index, dxjokdxxwwVar.f7742agtfadlqog);
                        break;
                    case 9:
                        dxjokdxxwwVar.f7751lqeggnwhkg = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.f7530eslsurpljm) {
                            int resourceId = typedArray.getResourceId(index, dxjokdxxwwVar.f7926zoijcleaow);
                            dxjokdxxwwVar.f7926zoijcleaow = resourceId;
                            if (resourceId == -1) {
                                dxjokdxxwwVar.f7924ppxfxbqfkf = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            dxjokdxxwwVar.f7924ppxfxbqfkf = typedArray.getString(index);
                        } else {
                            dxjokdxxwwVar.f7926zoijcleaow = typedArray.getResourceId(index, dxjokdxxwwVar.f7926zoijcleaow);
                        }
                        break;
                    case 12:
                        dxjokdxxwwVar.f7923iobyxmoadg = typedArray.getInt(index, dxjokdxxwwVar.f7923iobyxmoadg);
                        break;
                    case 13:
                        dxjokdxxwwVar.f7752nufgyqmvbu = typedArray.getInteger(index, dxjokdxxwwVar.f7752nufgyqmvbu);
                        break;
                    case 14:
                        dxjokdxxwwVar.f7755rgvfuqvkyq = typedArray.getFloat(index, dxjokdxxwwVar.f7755rgvfuqvkyq);
                        break;
                    case 15:
                        dxjokdxxwwVar.f7756vdvldrhtss = typedArray.getDimension(index, dxjokdxxwwVar.f7756vdvldrhtss);
                        break;
                    case 16:
                        dxjokdxxwwVar.f7754oxmwwwfdhm = typedArray.getDimension(index, dxjokdxxwwVar.f7754oxmwwwfdhm);
                        break;
                    case 17:
                        dxjokdxxwwVar.f7750kcexrzcfyt = typedArray.getDimension(index, dxjokdxxwwVar.f7750kcexrzcfyt);
                        break;
                    case 18:
                        dxjokdxxwwVar.f7759zdlpuopuiu = typedArray.getFloat(index, dxjokdxxwwVar.f7759zdlpuopuiu);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            dxjokdxxwwVar.f7749jyumaefscl = typedArray.getString(index);
                            dxjokdxxwwVar.f7758yggfygwlhe = 7;
                        } else {
                            dxjokdxxwwVar.f7758yggfygwlhe = typedArray.getInt(index, dxjokdxxwwVar.f7758yggfygwlhe);
                        }
                        break;
                    case 20:
                        dxjokdxxwwVar.f7748iwizpuwonk = typedArray.getFloat(index, dxjokdxxwwVar.f7748iwizpuwonk);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            dxjokdxxwwVar.f7744cqumvgiudr = typedArray.getDimension(index, dxjokdxxwwVar.f7744cqumvgiudr);
                        } else {
                            dxjokdxxwwVar.f7744cqumvgiudr = typedArray.getFloat(index, dxjokdxxwwVar.f7744cqumvgiudr);
                        }
                        break;
                }
            }
        }
    }

    public dxjokdxxww() {
        this.f7925wkgbmnqykc = 3;
        this.f7922eablkybsjg = new HashMap();
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public void eablkybsjg(Context context, AttributeSet attributeSet) {
        iobyxmoadg.iobyxmoadg(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.nufgyqmvbu.KeyTimeCycle));
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public void iobyxmoadg(HashMap map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public void lqeggnwhkg(HashMap map) {
        if (this.f7752nufgyqmvbu == -1) {
            return;
        }
        if (!Float.isNaN(this.f7746dxjokdxxww)) {
            map.put("alpha", Integer.valueOf(this.f7752nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7743btonecajqb)) {
            map.put("elevation", Integer.valueOf(this.f7752nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7747gtknphoqwx)) {
            map.put("rotation", Integer.valueOf(this.f7752nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7745draadjrbmk)) {
            map.put("rotationX", Integer.valueOf(this.f7752nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7757wflxmlrfwp)) {
            map.put("rotationY", Integer.valueOf(this.f7752nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7756vdvldrhtss)) {
            map.put("translationX", Integer.valueOf(this.f7752nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7754oxmwwwfdhm)) {
            map.put("translationY", Integer.valueOf(this.f7752nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7750kcexrzcfyt)) {
            map.put("translationZ", Integer.valueOf(this.f7752nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7742agtfadlqog)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f7752nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7753ojitshcjhn)) {
            map.put("scaleX", Integer.valueOf(this.f7752nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7753ojitshcjhn)) {
            map.put("scaleY", Integer.valueOf(this.f7752nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7759zdlpuopuiu)) {
            map.put("progress", Integer.valueOf(this.f7752nufgyqmvbu));
        }
        if (this.f7922eablkybsjg.size() > 0) {
            Iterator it = this.f7922eablkybsjg.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + ((String) it.next()), Integer.valueOf(this.f7752nufgyqmvbu));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public ppxfxbqfkf ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
        super.ppxfxbqfkf(ppxfxbqfkfVar);
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) ppxfxbqfkfVar;
        this.f7751lqeggnwhkg = dxjokdxxwwVar.f7751lqeggnwhkg;
        this.f7752nufgyqmvbu = dxjokdxxwwVar.f7752nufgyqmvbu;
        this.f7758yggfygwlhe = dxjokdxxwwVar.f7758yggfygwlhe;
        this.f7748iwizpuwonk = dxjokdxxwwVar.f7748iwizpuwonk;
        this.f7744cqumvgiudr = dxjokdxxwwVar.f7744cqumvgiudr;
        this.f7759zdlpuopuiu = dxjokdxxwwVar.f7759zdlpuopuiu;
        this.f7746dxjokdxxww = dxjokdxxwwVar.f7746dxjokdxxww;
        this.f7743btonecajqb = dxjokdxxwwVar.f7743btonecajqb;
        this.f7747gtknphoqwx = dxjokdxxwwVar.f7747gtknphoqwx;
        this.f7742agtfadlqog = dxjokdxxwwVar.f7742agtfadlqog;
        this.f7745draadjrbmk = dxjokdxxwwVar.f7745draadjrbmk;
        this.f7757wflxmlrfwp = dxjokdxxwwVar.f7757wflxmlrfwp;
        this.f7753ojitshcjhn = dxjokdxxwwVar.f7753ojitshcjhn;
        this.f7755rgvfuqvkyq = dxjokdxxwwVar.f7755rgvfuqvkyq;
        this.f7756vdvldrhtss = dxjokdxxwwVar.f7756vdvldrhtss;
        this.f7754oxmwwwfdhm = dxjokdxxwwVar.f7754oxmwwwfdhm;
        this.f7750kcexrzcfyt = dxjokdxxwwVar.f7750kcexrzcfyt;
        this.f7749jyumaefscl = dxjokdxxwwVar.f7749jyumaefscl;
        return this;
    }

    public void stevsuqkhv(HashMap map) {
        for (String str : map.keySet()) {
            e1.gxszxtbevo gxszxtbevoVar = (e1.gxszxtbevo) map.get(str);
            if (gxszxtbevoVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f7745draadjrbmk)) {
                                break;
                            } else {
                                gxszxtbevoVar.zoijcleaow(this.f7923iobyxmoadg, this.f7745draadjrbmk, this.f7748iwizpuwonk, this.f7758yggfygwlhe, this.f7744cqumvgiudr);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f7757wflxmlrfwp)) {
                                break;
                            } else {
                                gxszxtbevoVar.zoijcleaow(this.f7923iobyxmoadg, this.f7757wflxmlrfwp, this.f7748iwizpuwonk, this.f7758yggfygwlhe, this.f7744cqumvgiudr);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f7756vdvldrhtss)) {
                                break;
                            } else {
                                gxszxtbevoVar.zoijcleaow(this.f7923iobyxmoadg, this.f7756vdvldrhtss, this.f7748iwizpuwonk, this.f7758yggfygwlhe, this.f7744cqumvgiudr);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f7754oxmwwwfdhm)) {
                                break;
                            } else {
                                gxszxtbevoVar.zoijcleaow(this.f7923iobyxmoadg, this.f7754oxmwwwfdhm, this.f7748iwizpuwonk, this.f7758yggfygwlhe, this.f7744cqumvgiudr);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f7750kcexrzcfyt)) {
                                break;
                            } else {
                                gxszxtbevoVar.zoijcleaow(this.f7923iobyxmoadg, this.f7750kcexrzcfyt, this.f7748iwizpuwonk, this.f7758yggfygwlhe, this.f7744cqumvgiudr);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f7759zdlpuopuiu)) {
                                break;
                            } else {
                                gxszxtbevoVar.zoijcleaow(this.f7923iobyxmoadg, this.f7759zdlpuopuiu, this.f7748iwizpuwonk, this.f7758yggfygwlhe, this.f7744cqumvgiudr);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f7753ojitshcjhn)) {
                                break;
                            } else {
                                gxszxtbevoVar.zoijcleaow(this.f7923iobyxmoadg, this.f7753ojitshcjhn, this.f7748iwizpuwonk, this.f7758yggfygwlhe, this.f7744cqumvgiudr);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f7755rgvfuqvkyq)) {
                                break;
                            } else {
                                gxszxtbevoVar.zoijcleaow(this.f7923iobyxmoadg, this.f7755rgvfuqvkyq, this.f7748iwizpuwonk, this.f7758yggfygwlhe, this.f7744cqumvgiudr);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f7747gtknphoqwx)) {
                                break;
                            } else {
                                gxszxtbevoVar.zoijcleaow(this.f7923iobyxmoadg, this.f7747gtknphoqwx, this.f7748iwizpuwonk, this.f7758yggfygwlhe, this.f7744cqumvgiudr);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f7743btonecajqb)) {
                                break;
                            } else {
                                gxszxtbevoVar.zoijcleaow(this.f7923iobyxmoadg, this.f7743btonecajqb, this.f7748iwizpuwonk, this.f7758yggfygwlhe, this.f7744cqumvgiudr);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f7742agtfadlqog)) {
                                break;
                            } else {
                                gxszxtbevoVar.zoijcleaow(this.f7923iobyxmoadg, this.f7742agtfadlqog, this.f7748iwizpuwonk, this.f7758yggfygwlhe, this.f7744cqumvgiudr);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f7746dxjokdxxww)) {
                                break;
                            } else {
                                gxszxtbevoVar.zoijcleaow(this.f7923iobyxmoadg, this.f7746dxjokdxxww, this.f7748iwizpuwonk, this.f7758yggfygwlhe, this.f7744cqumvgiudr);
                                break;
                            }
                            break;
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    androidx.constraintlayout.widget.iobyxmoadg iobyxmoadgVar = (androidx.constraintlayout.widget.iobyxmoadg) this.f7922eablkybsjg.get(str.substring(7));
                    if (iobyxmoadgVar != null) {
                        ((e1.gxszxtbevo.zoijcleaow) gxszxtbevoVar).btonecajqb(this.f7923iobyxmoadg, iobyxmoadgVar, this.f7748iwizpuwonk, this.f7758yggfygwlhe, this.f7744cqumvgiudr);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public void wkgbmnqykc(HashSet hashSet) {
        if (!Float.isNaN(this.f7746dxjokdxxww)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f7743btonecajqb)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f7747gtknphoqwx)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f7745draadjrbmk)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f7757wflxmlrfwp)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f7756vdvldrhtss)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f7754oxmwwwfdhm)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f7750kcexrzcfyt)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f7742agtfadlqog)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f7753ojitshcjhn)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f7755rgvfuqvkyq)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f7759zdlpuopuiu)) {
            hashSet.add("progress");
        }
        if (this.f7922eablkybsjg.size() > 0) {
            Iterator it = this.f7922eablkybsjg.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow */
    public ppxfxbqfkf clone() {
        return new dxjokdxxww().ppxfxbqfkf(this);
    }
}
