package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class lqeggnwhkg extends nufgyqmvbu {

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    String f7831nufgyqmvbu = null;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    int f7828dxjokdxxww = ppxfxbqfkf.f7921gxszxtbevo;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    int f7826btonecajqb = 0;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    float f7829gtknphoqwx = Float.NaN;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    float f7827draadjrbmk = Float.NaN;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    float f7836wflxmlrfwp = Float.NaN;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    float f7825agtfadlqog = Float.NaN;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    float f7832ojitshcjhn = Float.NaN;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    float f7834rgvfuqvkyq = Float.NaN;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    int f7835vdvldrhtss = 0;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private float f7833oxmwwwfdhm = Float.NaN;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private float f7830kcexrzcfyt = Float.NaN;

    private static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static SparseIntArray f7837iobyxmoadg;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7837iobyxmoadg = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyPosition_motionTarget, 1);
            f7837iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyPosition_framePosition, 2);
            f7837iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyPosition_transitionEasing, 3);
            f7837iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyPosition_curveFit, 4);
            f7837iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyPosition_drawPath, 5);
            f7837iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyPosition_percentX, 6);
            f7837iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyPosition_percentY, 7);
            f7837iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyPosition_keyPositionType, 9);
            f7837iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyPosition_sizePercent, 8);
            f7837iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyPosition_percentWidth, 11);
            f7837iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyPosition_percentHeight, 12);
            f7837iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyPosition_pathMotionArc, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void zoijcleaow(lqeggnwhkg lqeggnwhkgVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArray.getIndex(i13);
                switch (f7837iobyxmoadg.get(index)) {
                    case 1:
                        if (MotionLayout.f7530eslsurpljm) {
                            int resourceId = typedArray.getResourceId(index, lqeggnwhkgVar.f7926zoijcleaow);
                            lqeggnwhkgVar.f7926zoijcleaow = resourceId;
                            if (resourceId == -1) {
                                lqeggnwhkgVar.f7924ppxfxbqfkf = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            lqeggnwhkgVar.f7924ppxfxbqfkf = typedArray.getString(index);
                        } else {
                            lqeggnwhkgVar.f7926zoijcleaow = typedArray.getResourceId(index, lqeggnwhkgVar.f7926zoijcleaow);
                        }
                        break;
                    case 2:
                        lqeggnwhkgVar.f7923iobyxmoadg = typedArray.getInt(index, lqeggnwhkgVar.f7923iobyxmoadg);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            lqeggnwhkgVar.f7831nufgyqmvbu = typedArray.getString(index);
                        } else {
                            lqeggnwhkgVar.f7831nufgyqmvbu = a1.ppxfxbqfkf.f259ppxfxbqfkf[typedArray.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        lqeggnwhkgVar.f7838lqeggnwhkg = typedArray.getInteger(index, lqeggnwhkgVar.f7838lqeggnwhkg);
                        break;
                    case 5:
                        lqeggnwhkgVar.f7826btonecajqb = typedArray.getInt(index, lqeggnwhkgVar.f7826btonecajqb);
                        break;
                    case 6:
                        lqeggnwhkgVar.f7836wflxmlrfwp = typedArray.getFloat(index, lqeggnwhkgVar.f7836wflxmlrfwp);
                        break;
                    case 7:
                        lqeggnwhkgVar.f7825agtfadlqog = typedArray.getFloat(index, lqeggnwhkgVar.f7825agtfadlqog);
                        break;
                    case 8:
                        float f13 = typedArray.getFloat(index, lqeggnwhkgVar.f7827draadjrbmk);
                        lqeggnwhkgVar.f7829gtknphoqwx = f13;
                        lqeggnwhkgVar.f7827draadjrbmk = f13;
                        break;
                    case 9:
                        lqeggnwhkgVar.f7835vdvldrhtss = typedArray.getInt(index, lqeggnwhkgVar.f7835vdvldrhtss);
                        break;
                    case 10:
                        lqeggnwhkgVar.f7828dxjokdxxww = typedArray.getInt(index, lqeggnwhkgVar.f7828dxjokdxxww);
                        break;
                    case 11:
                        lqeggnwhkgVar.f7829gtknphoqwx = typedArray.getFloat(index, lqeggnwhkgVar.f7829gtknphoqwx);
                        break;
                    case 12:
                        lqeggnwhkgVar.f7827draadjrbmk = typedArray.getFloat(index, lqeggnwhkgVar.f7827draadjrbmk);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + f7837iobyxmoadg.get(index));
                        break;
                }
            }
            if (lqeggnwhkgVar.f7923iobyxmoadg == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    public lqeggnwhkg() {
        this.f7925wkgbmnqykc = 2;
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public void eablkybsjg(Context context, AttributeSet attributeSet) {
        iobyxmoadg.zoijcleaow(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.nufgyqmvbu.KeyPosition));
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public void iobyxmoadg(HashMap map) {
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public ppxfxbqfkf ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
        super.ppxfxbqfkf(ppxfxbqfkfVar);
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) ppxfxbqfkfVar;
        this.f7831nufgyqmvbu = lqeggnwhkgVar.f7831nufgyqmvbu;
        this.f7828dxjokdxxww = lqeggnwhkgVar.f7828dxjokdxxww;
        this.f7826btonecajqb = lqeggnwhkgVar.f7826btonecajqb;
        this.f7829gtknphoqwx = lqeggnwhkgVar.f7829gtknphoqwx;
        this.f7827draadjrbmk = Float.NaN;
        this.f7836wflxmlrfwp = lqeggnwhkgVar.f7836wflxmlrfwp;
        this.f7825agtfadlqog = lqeggnwhkgVar.f7825agtfadlqog;
        this.f7832ojitshcjhn = lqeggnwhkgVar.f7832ojitshcjhn;
        this.f7834rgvfuqvkyq = lqeggnwhkgVar.f7834rgvfuqvkyq;
        this.f7833oxmwwwfdhm = lqeggnwhkgVar.f7833oxmwwwfdhm;
        this.f7830kcexrzcfyt = lqeggnwhkgVar.f7830kcexrzcfyt;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow */
    public ppxfxbqfkf clone() {
        return new lqeggnwhkg().ppxfxbqfkf(this);
    }
}
