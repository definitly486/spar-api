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
public class wkgbmnqykc extends ppxfxbqfkf {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private String f7973lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f7974nufgyqmvbu = -1;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f7968dxjokdxxww = false;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private float f7966btonecajqb = Float.NaN;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private float f7969gtknphoqwx = Float.NaN;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private float f7967draadjrbmk = Float.NaN;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private float f7979wflxmlrfwp = Float.NaN;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private float f7965agtfadlqog = Float.NaN;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private float f7975ojitshcjhn = Float.NaN;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private float f7977rgvfuqvkyq = Float.NaN;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private float f7978vdvldrhtss = Float.NaN;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private float f7976oxmwwwfdhm = Float.NaN;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private float f7972kcexrzcfyt = Float.NaN;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private float f7981zdlpuopuiu = Float.NaN;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private float f7980yggfygwlhe = Float.NaN;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private float f7971jyumaefscl = Float.NaN;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private float f7970iwizpuwonk = Float.NaN;

    private static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static SparseIntArray f7982iobyxmoadg;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7982iobyxmoadg = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyAttribute_android_alpha, 1);
            f7982iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyAttribute_android_elevation, 2);
            f7982iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyAttribute_android_rotation, 4);
            f7982iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyAttribute_android_rotationX, 5);
            f7982iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyAttribute_android_rotationY, 6);
            f7982iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyAttribute_android_transformPivotX, 19);
            f7982iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyAttribute_android_transformPivotY, 20);
            f7982iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyAttribute_android_scaleX, 7);
            f7982iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyAttribute_transitionPathRotate, 8);
            f7982iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyAttribute_transitionEasing, 9);
            f7982iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyAttribute_motionTarget, 10);
            f7982iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyAttribute_framePosition, 12);
            f7982iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyAttribute_curveFit, 13);
            f7982iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyAttribute_android_scaleY, 14);
            f7982iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyAttribute_android_translationX, 15);
            f7982iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyAttribute_android_translationY, 16);
            f7982iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyAttribute_android_translationZ, 17);
            f7982iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyAttribute_motionProgress, 18);
        }

        public static void iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArray.getIndex(i13);
                switch (f7982iobyxmoadg.get(index)) {
                    case 1:
                        wkgbmnqykcVar.f7966btonecajqb = typedArray.getFloat(index, wkgbmnqykcVar.f7966btonecajqb);
                        break;
                    case 2:
                        wkgbmnqykcVar.f7969gtknphoqwx = typedArray.getDimension(index, wkgbmnqykcVar.f7969gtknphoqwx);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + f7982iobyxmoadg.get(index));
                        break;
                    case 4:
                        wkgbmnqykcVar.f7967draadjrbmk = typedArray.getFloat(index, wkgbmnqykcVar.f7967draadjrbmk);
                        break;
                    case 5:
                        wkgbmnqykcVar.f7979wflxmlrfwp = typedArray.getFloat(index, wkgbmnqykcVar.f7979wflxmlrfwp);
                        break;
                    case 6:
                        wkgbmnqykcVar.f7965agtfadlqog = typedArray.getFloat(index, wkgbmnqykcVar.f7965agtfadlqog);
                        break;
                    case 7:
                        wkgbmnqykcVar.f7976oxmwwwfdhm = typedArray.getFloat(index, wkgbmnqykcVar.f7976oxmwwwfdhm);
                        break;
                    case 8:
                        wkgbmnqykcVar.f7978vdvldrhtss = typedArray.getFloat(index, wkgbmnqykcVar.f7978vdvldrhtss);
                        break;
                    case 9:
                        wkgbmnqykcVar.f7973lqeggnwhkg = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.f7530eslsurpljm) {
                            int resourceId = typedArray.getResourceId(index, wkgbmnqykcVar.f7926zoijcleaow);
                            wkgbmnqykcVar.f7926zoijcleaow = resourceId;
                            if (resourceId == -1) {
                                wkgbmnqykcVar.f7924ppxfxbqfkf = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            wkgbmnqykcVar.f7924ppxfxbqfkf = typedArray.getString(index);
                        } else {
                            wkgbmnqykcVar.f7926zoijcleaow = typedArray.getResourceId(index, wkgbmnqykcVar.f7926zoijcleaow);
                        }
                        break;
                    case 12:
                        wkgbmnqykcVar.f7923iobyxmoadg = typedArray.getInt(index, wkgbmnqykcVar.f7923iobyxmoadg);
                        break;
                    case 13:
                        wkgbmnqykcVar.f7974nufgyqmvbu = typedArray.getInteger(index, wkgbmnqykcVar.f7974nufgyqmvbu);
                        break;
                    case 14:
                        wkgbmnqykcVar.f7972kcexrzcfyt = typedArray.getFloat(index, wkgbmnqykcVar.f7972kcexrzcfyt);
                        break;
                    case 15:
                        wkgbmnqykcVar.f7981zdlpuopuiu = typedArray.getDimension(index, wkgbmnqykcVar.f7981zdlpuopuiu);
                        break;
                    case 16:
                        wkgbmnqykcVar.f7980yggfygwlhe = typedArray.getDimension(index, wkgbmnqykcVar.f7980yggfygwlhe);
                        break;
                    case 17:
                        wkgbmnqykcVar.f7971jyumaefscl = typedArray.getDimension(index, wkgbmnqykcVar.f7971jyumaefscl);
                        break;
                    case 18:
                        wkgbmnqykcVar.f7970iwizpuwonk = typedArray.getFloat(index, wkgbmnqykcVar.f7970iwizpuwonk);
                        break;
                    case 19:
                        wkgbmnqykcVar.f7975ojitshcjhn = typedArray.getDimension(index, wkgbmnqykcVar.f7975ojitshcjhn);
                        break;
                    case 20:
                        wkgbmnqykcVar.f7977rgvfuqvkyq = typedArray.getDimension(index, wkgbmnqykcVar.f7977rgvfuqvkyq);
                        break;
                }
            }
        }
    }

    public wkgbmnqykc() {
        this.f7925wkgbmnqykc = 1;
        this.f7922eablkybsjg = new HashMap();
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public void eablkybsjg(Context context, AttributeSet attributeSet) {
        iobyxmoadg.iobyxmoadg(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.nufgyqmvbu.KeyAttribute));
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public void iobyxmoadg(HashMap map) {
        for (String str : map.keySet()) {
            a1.btonecajqb btonecajqbVar = (a1.btonecajqb) map.get(str);
            if (btonecajqbVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f7979wflxmlrfwp)) {
                                break;
                            } else {
                                btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7979wflxmlrfwp);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f7965agtfadlqog)) {
                                break;
                            } else {
                                btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7965agtfadlqog);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f7981zdlpuopuiu)) {
                                break;
                            } else {
                                btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7981zdlpuopuiu);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f7980yggfygwlhe)) {
                                break;
                            } else {
                                btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7980yggfygwlhe);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f7971jyumaefscl)) {
                                break;
                            } else {
                                btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7971jyumaefscl);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f7970iwizpuwonk)) {
                                break;
                            } else {
                                btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7970iwizpuwonk);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f7976oxmwwwfdhm)) {
                                break;
                            } else {
                                btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7976oxmwwwfdhm);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f7972kcexrzcfyt)) {
                                break;
                            } else {
                                btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7972kcexrzcfyt);
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (Float.isNaN(this.f7979wflxmlrfwp)) {
                                break;
                            } else {
                                btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7975ojitshcjhn);
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (Float.isNaN(this.f7965agtfadlqog)) {
                                break;
                            } else {
                                btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7977rgvfuqvkyq);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f7967draadjrbmk)) {
                                break;
                            } else {
                                btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7967draadjrbmk);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f7969gtknphoqwx)) {
                                break;
                            } else {
                                btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7969gtknphoqwx);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f7978vdvldrhtss)) {
                                break;
                            } else {
                                btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7978vdvldrhtss);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f7966btonecajqb)) {
                                break;
                            } else {
                                btonecajqbVar.zoijcleaow(this.f7923iobyxmoadg, this.f7966btonecajqb);
                                break;
                            }
                            break;
                    }
                } else {
                    androidx.constraintlayout.widget.iobyxmoadg iobyxmoadgVar = (androidx.constraintlayout.widget.iobyxmoadg) this.f7922eablkybsjg.get(str.substring(7));
                    if (iobyxmoadgVar != null) {
                        ((e1.wkgbmnqykc.zoijcleaow) btonecajqbVar).nufgyqmvbu(this.f7923iobyxmoadg, iobyxmoadgVar);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public void lqeggnwhkg(HashMap map) {
        if (this.f7974nufgyqmvbu == -1) {
            return;
        }
        if (!Float.isNaN(this.f7966btonecajqb)) {
            map.put("alpha", Integer.valueOf(this.f7974nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7969gtknphoqwx)) {
            map.put("elevation", Integer.valueOf(this.f7974nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7967draadjrbmk)) {
            map.put("rotation", Integer.valueOf(this.f7974nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7979wflxmlrfwp)) {
            map.put("rotationX", Integer.valueOf(this.f7974nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7965agtfadlqog)) {
            map.put("rotationY", Integer.valueOf(this.f7974nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7975ojitshcjhn)) {
            map.put("transformPivotX", Integer.valueOf(this.f7974nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7977rgvfuqvkyq)) {
            map.put("transformPivotY", Integer.valueOf(this.f7974nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7981zdlpuopuiu)) {
            map.put("translationX", Integer.valueOf(this.f7974nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7980yggfygwlhe)) {
            map.put("translationY", Integer.valueOf(this.f7974nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7971jyumaefscl)) {
            map.put("translationZ", Integer.valueOf(this.f7974nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7978vdvldrhtss)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f7974nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7976oxmwwwfdhm)) {
            map.put("scaleX", Integer.valueOf(this.f7974nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7972kcexrzcfyt)) {
            map.put("scaleY", Integer.valueOf(this.f7974nufgyqmvbu));
        }
        if (!Float.isNaN(this.f7970iwizpuwonk)) {
            map.put("progress", Integer.valueOf(this.f7974nufgyqmvbu));
        }
        if (this.f7922eablkybsjg.size() > 0) {
            Iterator it = this.f7922eablkybsjg.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + ((String) it.next()), Integer.valueOf(this.f7974nufgyqmvbu));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public ppxfxbqfkf ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
        super.ppxfxbqfkf(ppxfxbqfkfVar);
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) ppxfxbqfkfVar;
        this.f7974nufgyqmvbu = wkgbmnqykcVar.f7974nufgyqmvbu;
        this.f7968dxjokdxxww = wkgbmnqykcVar.f7968dxjokdxxww;
        this.f7966btonecajqb = wkgbmnqykcVar.f7966btonecajqb;
        this.f7969gtknphoqwx = wkgbmnqykcVar.f7969gtknphoqwx;
        this.f7967draadjrbmk = wkgbmnqykcVar.f7967draadjrbmk;
        this.f7979wflxmlrfwp = wkgbmnqykcVar.f7979wflxmlrfwp;
        this.f7965agtfadlqog = wkgbmnqykcVar.f7965agtfadlqog;
        this.f7975ojitshcjhn = wkgbmnqykcVar.f7975ojitshcjhn;
        this.f7977rgvfuqvkyq = wkgbmnqykcVar.f7977rgvfuqvkyq;
        this.f7978vdvldrhtss = wkgbmnqykcVar.f7978vdvldrhtss;
        this.f7976oxmwwwfdhm = wkgbmnqykcVar.f7976oxmwwwfdhm;
        this.f7972kcexrzcfyt = wkgbmnqykcVar.f7972kcexrzcfyt;
        this.f7981zdlpuopuiu = wkgbmnqykcVar.f7981zdlpuopuiu;
        this.f7980yggfygwlhe = wkgbmnqykcVar.f7980yggfygwlhe;
        this.f7971jyumaefscl = wkgbmnqykcVar.f7971jyumaefscl;
        this.f7970iwizpuwonk = wkgbmnqykcVar.f7970iwizpuwonk;
        this.f7973lqeggnwhkg = wkgbmnqykcVar.f7973lqeggnwhkg;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public void wkgbmnqykc(HashSet hashSet) {
        if (!Float.isNaN(this.f7966btonecajqb)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f7969gtknphoqwx)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f7967draadjrbmk)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f7979wflxmlrfwp)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f7965agtfadlqog)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f7975ojitshcjhn)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f7977rgvfuqvkyq)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f7981zdlpuopuiu)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f7980yggfygwlhe)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f7971jyumaefscl)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f7978vdvldrhtss)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f7976oxmwwwfdhm)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f7972kcexrzcfyt)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f7970iwizpuwonk)) {
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
        return new wkgbmnqykc().ppxfxbqfkf(this);
    }
}
