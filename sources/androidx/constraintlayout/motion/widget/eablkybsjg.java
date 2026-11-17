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
public class eablkybsjg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private String f7772lqeggnwhkg = null;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f7773nufgyqmvbu = 0;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f7765dxjokdxxww = -1;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private String f7762btonecajqb = null;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private float f7767gtknphoqwx = Float.NaN;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private float f7764draadjrbmk = 0.0f;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private float f7778wflxmlrfwp = 0.0f;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private float f7761agtfadlqog = Float.NaN;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private int f7774ojitshcjhn = -1;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private float f7776rgvfuqvkyq = Float.NaN;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private float f7777vdvldrhtss = Float.NaN;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private float f7775oxmwwwfdhm = Float.NaN;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private float f7770kcexrzcfyt = Float.NaN;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private float f7780zdlpuopuiu = Float.NaN;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private float f7779yggfygwlhe = Float.NaN;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private float f7769jyumaefscl = Float.NaN;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private float f7768iwizpuwonk = Float.NaN;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private float f7763cqumvgiudr = Float.NaN;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private float f7766esjtqupxsv = Float.NaN;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private float f7771lereixgezr = Float.NaN;

    private static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static SparseIntArray f7781iobyxmoadg;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7781iobyxmoadg = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_motionTarget, 1);
            f7781iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_framePosition, 2);
            f7781iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_transitionEasing, 3);
            f7781iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_curveFit, 4);
            f7781iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_waveShape, 5);
            f7781iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_wavePeriod, 6);
            f7781iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_waveOffset, 7);
            f7781iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_waveVariesBy, 8);
            f7781iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_android_alpha, 9);
            f7781iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_android_elevation, 10);
            f7781iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_android_rotation, 11);
            f7781iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_android_rotationX, 12);
            f7781iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_android_rotationY, 13);
            f7781iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_transitionPathRotate, 14);
            f7781iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_android_scaleX, 15);
            f7781iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_android_scaleY, 16);
            f7781iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_android_translationX, 17);
            f7781iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_android_translationY, 18);
            f7781iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_android_translationZ, 19);
            f7781iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_motionProgress, 20);
            f7781iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle_wavePhase, 21);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void zoijcleaow(eablkybsjg eablkybsjgVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArray.getIndex(i13);
                switch (f7781iobyxmoadg.get(index)) {
                    case 1:
                        if (MotionLayout.f7530eslsurpljm) {
                            int resourceId = typedArray.getResourceId(index, eablkybsjgVar.f7926zoijcleaow);
                            eablkybsjgVar.f7926zoijcleaow = resourceId;
                            if (resourceId == -1) {
                                eablkybsjgVar.f7924ppxfxbqfkf = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            eablkybsjgVar.f7924ppxfxbqfkf = typedArray.getString(index);
                        } else {
                            eablkybsjgVar.f7926zoijcleaow = typedArray.getResourceId(index, eablkybsjgVar.f7926zoijcleaow);
                        }
                        break;
                    case 2:
                        eablkybsjgVar.f7923iobyxmoadg = typedArray.getInt(index, eablkybsjgVar.f7923iobyxmoadg);
                        break;
                    case 3:
                        eablkybsjgVar.f7772lqeggnwhkg = typedArray.getString(index);
                        break;
                    case 4:
                        eablkybsjgVar.f7773nufgyqmvbu = typedArray.getInteger(index, eablkybsjgVar.f7773nufgyqmvbu);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            eablkybsjgVar.f7762btonecajqb = typedArray.getString(index);
                            eablkybsjgVar.f7765dxjokdxxww = 7;
                        } else {
                            eablkybsjgVar.f7765dxjokdxxww = typedArray.getInt(index, eablkybsjgVar.f7765dxjokdxxww);
                        }
                        break;
                    case 6:
                        eablkybsjgVar.f7767gtknphoqwx = typedArray.getFloat(index, eablkybsjgVar.f7767gtknphoqwx);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            eablkybsjgVar.f7764draadjrbmk = typedArray.getDimension(index, eablkybsjgVar.f7764draadjrbmk);
                        } else {
                            eablkybsjgVar.f7764draadjrbmk = typedArray.getFloat(index, eablkybsjgVar.f7764draadjrbmk);
                        }
                        break;
                    case 8:
                        eablkybsjgVar.f7774ojitshcjhn = typedArray.getInt(index, eablkybsjgVar.f7774ojitshcjhn);
                        break;
                    case 9:
                        eablkybsjgVar.f7776rgvfuqvkyq = typedArray.getFloat(index, eablkybsjgVar.f7776rgvfuqvkyq);
                        break;
                    case 10:
                        eablkybsjgVar.f7777vdvldrhtss = typedArray.getDimension(index, eablkybsjgVar.f7777vdvldrhtss);
                        break;
                    case 11:
                        eablkybsjgVar.f7775oxmwwwfdhm = typedArray.getFloat(index, eablkybsjgVar.f7775oxmwwwfdhm);
                        break;
                    case 12:
                        eablkybsjgVar.f7780zdlpuopuiu = typedArray.getFloat(index, eablkybsjgVar.f7780zdlpuopuiu);
                        break;
                    case 13:
                        eablkybsjgVar.f7779yggfygwlhe = typedArray.getFloat(index, eablkybsjgVar.f7779yggfygwlhe);
                        break;
                    case 14:
                        eablkybsjgVar.f7770kcexrzcfyt = typedArray.getFloat(index, eablkybsjgVar.f7770kcexrzcfyt);
                        break;
                    case 15:
                        eablkybsjgVar.f7769jyumaefscl = typedArray.getFloat(index, eablkybsjgVar.f7769jyumaefscl);
                        break;
                    case 16:
                        eablkybsjgVar.f7768iwizpuwonk = typedArray.getFloat(index, eablkybsjgVar.f7768iwizpuwonk);
                        break;
                    case 17:
                        eablkybsjgVar.f7763cqumvgiudr = typedArray.getDimension(index, eablkybsjgVar.f7763cqumvgiudr);
                        break;
                    case 18:
                        eablkybsjgVar.f7766esjtqupxsv = typedArray.getDimension(index, eablkybsjgVar.f7766esjtqupxsv);
                        break;
                    case 19:
                        eablkybsjgVar.f7771lereixgezr = typedArray.getDimension(index, eablkybsjgVar.f7771lereixgezr);
                        break;
                    case 20:
                        eablkybsjgVar.f7761agtfadlqog = typedArray.getFloat(index, eablkybsjgVar.f7761agtfadlqog);
                        break;
                    case 21:
                        eablkybsjgVar.f7778wflxmlrfwp = typedArray.getFloat(index, eablkybsjgVar.f7778wflxmlrfwp) / 360.0f;
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f7781iobyxmoadg.get(index));
                        break;
                }
            }
        }
    }

    public eablkybsjg() {
        this.f7925wkgbmnqykc = 4;
        this.f7922eablkybsjg = new HashMap();
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public void eablkybsjg(Context context, AttributeSet attributeSet) {
        iobyxmoadg.zoijcleaow(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.nufgyqmvbu.KeyCycle));
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public void iobyxmoadg(HashMap map) {
        androidx.constraintlayout.motion.widget.iobyxmoadg.lqeggnwhkg("KeyCycle", "add " + map.size() + " values", 2);
        for (String str : map.keySet()) {
            a1.btonecajqb btonecajqbVar = (a1.btonecajqb) map.get(str);
            if (btonecajqbVar != null) {
                str.hashCode();
                switch (str) {
                    case "rotationX":
                        btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7780zdlpuopuiu);
                        break;
                    case "rotationY":
                        btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7779yggfygwlhe);
                        break;
                    case "translationX":
                        btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7763cqumvgiudr);
                        break;
                    case "translationY":
                        btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7766esjtqupxsv);
                        break;
                    case "translationZ":
                        btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7771lereixgezr);
                        break;
                    case "progress":
                        btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7761agtfadlqog);
                        break;
                    case "scaleX":
                        btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7769jyumaefscl);
                        break;
                    case "scaleY":
                        btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7768iwizpuwonk);
                        break;
                    case "rotation":
                        btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7775oxmwwwfdhm);
                        break;
                    case "elevation":
                        btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7777vdvldrhtss);
                        break;
                    case "transitionPathRotate":
                        btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7770kcexrzcfyt);
                        break;
                    case "alpha":
                        btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7776rgvfuqvkyq);
                        break;
                    case "waveOffset":
                        btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7764draadjrbmk);
                        break;
                    case "wavePhase":
                        btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7778wflxmlrfwp);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            break;
                        } else {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  " + str);
                            break;
                        }
                        break;
                }
            }
        }
    }

    public void ntlheqmsrt(HashMap map) {
        e1.ppxfxbqfkf ppxfxbqfkfVar;
        e1.ppxfxbqfkf ppxfxbqfkfVar2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.iobyxmoadg iobyxmoadgVar = (androidx.constraintlayout.widget.iobyxmoadg) this.f7922eablkybsjg.get(str.substring(7));
                if (iobyxmoadgVar != null && iobyxmoadgVar.wkgbmnqykc() == androidx.constraintlayout.widget.iobyxmoadg.EnumC0129iobyxmoadg.FLOAT_TYPE && (ppxfxbqfkfVar = (e1.ppxfxbqfkf) map.get(str)) != null) {
                    ppxfxbqfkfVar.wkgbmnqykc(this.f7923iobyxmoadg, this.f7765dxjokdxxww, this.f7762btonecajqb, this.f7774ojitshcjhn, this.f7767gtknphoqwx, this.f7764draadjrbmk, this.f7778wflxmlrfwp, iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar);
                }
            } else {
                float fUlzqkzuiru = ulzqkzuiru(str);
                if (!Float.isNaN(fUlzqkzuiru) && (ppxfxbqfkfVar2 = (e1.ppxfxbqfkf) map.get(str)) != null) {
                    ppxfxbqfkfVar2.ppxfxbqfkf(this.f7923iobyxmoadg, this.f7765dxjokdxxww, this.f7762btonecajqb, this.f7774ojitshcjhn, this.f7767gtknphoqwx, this.f7764draadjrbmk, this.f7778wflxmlrfwp, fUlzqkzuiru);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public ppxfxbqfkf ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
        super.ppxfxbqfkf(ppxfxbqfkfVar);
        eablkybsjg eablkybsjgVar = (eablkybsjg) ppxfxbqfkfVar;
        this.f7772lqeggnwhkg = eablkybsjgVar.f7772lqeggnwhkg;
        this.f7773nufgyqmvbu = eablkybsjgVar.f7773nufgyqmvbu;
        this.f7765dxjokdxxww = eablkybsjgVar.f7765dxjokdxxww;
        this.f7762btonecajqb = eablkybsjgVar.f7762btonecajqb;
        this.f7767gtknphoqwx = eablkybsjgVar.f7767gtknphoqwx;
        this.f7764draadjrbmk = eablkybsjgVar.f7764draadjrbmk;
        this.f7778wflxmlrfwp = eablkybsjgVar.f7778wflxmlrfwp;
        this.f7761agtfadlqog = eablkybsjgVar.f7761agtfadlqog;
        this.f7774ojitshcjhn = eablkybsjgVar.f7774ojitshcjhn;
        this.f7776rgvfuqvkyq = eablkybsjgVar.f7776rgvfuqvkyq;
        this.f7777vdvldrhtss = eablkybsjgVar.f7777vdvldrhtss;
        this.f7775oxmwwwfdhm = eablkybsjgVar.f7775oxmwwwfdhm;
        this.f7770kcexrzcfyt = eablkybsjgVar.f7770kcexrzcfyt;
        this.f7780zdlpuopuiu = eablkybsjgVar.f7780zdlpuopuiu;
        this.f7779yggfygwlhe = eablkybsjgVar.f7779yggfygwlhe;
        this.f7769jyumaefscl = eablkybsjgVar.f7769jyumaefscl;
        this.f7768iwizpuwonk = eablkybsjgVar.f7768iwizpuwonk;
        this.f7763cqumvgiudr = eablkybsjgVar.f7763cqumvgiudr;
        this.f7766esjtqupxsv = eablkybsjgVar.f7766esjtqupxsv;
        this.f7771lereixgezr = eablkybsjgVar.f7771lereixgezr;
        return this;
    }

    public float ulzqkzuiru(String str) {
        str.hashCode();
        switch (str) {
            case "rotationX":
                return this.f7780zdlpuopuiu;
            case "rotationY":
                return this.f7779yggfygwlhe;
            case "translationX":
                return this.f7763cqumvgiudr;
            case "translationY":
                return this.f7766esjtqupxsv;
            case "translationZ":
                return this.f7771lereixgezr;
            case "progress":
                return this.f7761agtfadlqog;
            case "scaleX":
                return this.f7769jyumaefscl;
            case "scaleY":
                return this.f7768iwizpuwonk;
            case "rotation":
                return this.f7775oxmwwwfdhm;
            case "elevation":
                return this.f7777vdvldrhtss;
            case "transitionPathRotate":
                return this.f7770kcexrzcfyt;
            case "alpha":
                return this.f7776rgvfuqvkyq;
            case "waveOffset":
                return this.f7764draadjrbmk;
            case "wavePhase":
                return this.f7778wflxmlrfwp;
            default:
                if (str.startsWith("CUSTOM")) {
                    return Float.NaN;
                }
                Log.v("WARNING! KeyCycle", "  UNKNOWN  " + str);
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public void wkgbmnqykc(HashSet hashSet) {
        if (!Float.isNaN(this.f7776rgvfuqvkyq)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f7777vdvldrhtss)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f7775oxmwwwfdhm)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f7780zdlpuopuiu)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f7779yggfygwlhe)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f7769jyumaefscl)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f7768iwizpuwonk)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f7770kcexrzcfyt)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f7763cqumvgiudr)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f7766esjtqupxsv)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f7771lereixgezr)) {
            hashSet.add("translationZ");
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
        return new eablkybsjg().ppxfxbqfkf(this);
    }
}
