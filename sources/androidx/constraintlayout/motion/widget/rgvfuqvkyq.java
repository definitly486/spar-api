package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
class rgvfuqvkyq {

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static final float[][] f7927lmojexxdyd = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private static final float[][] f7928wwaezpbzkn = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private float f7944kcexrzcfyt;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private float f7949oxmwwwfdhm;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final MotionLayout f7958zdlpuopuiu;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f7939iobyxmoadg = 0;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f7959zoijcleaow = 0;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f7951ppxfxbqfkf = 0;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f7955wkgbmnqykc = -1;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f7935eablkybsjg = -1;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f7938gxszxtbevo = -1;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private float f7946lqeggnwhkg = 0.5f;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private float f7947nufgyqmvbu = 0.5f;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    float f7934dxjokdxxww = 0.5f;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    float f7930btonecajqb = 0.5f;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f7937gtknphoqwx = -1;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    boolean f7933draadjrbmk = false;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private float f7954wflxmlrfwp = 0.0f;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private float f7929agtfadlqog = 1.0f;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private boolean f7948ojitshcjhn = false;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private float[] f7952rgvfuqvkyq = new float[2];

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private int[] f7953vdvldrhtss = new int[2];

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private float f7957yggfygwlhe = 4.0f;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private float f7943jyumaefscl = 1.2f;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f7942iwizpuwonk = true;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private float f7932cqumvgiudr = 1.0f;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f7936esjtqupxsv = 0;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private float f7945lereixgezr = 10.0f;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private float f7950pmvmpeiblj = 10.0f;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private float f7960zynmafqrjb = 1.0f;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private float f7941istkbnxepw = Float.NaN;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private float f7931cdpycssgdh = Float.NaN;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private int f7956yadqdtsiqt = 0;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private int f7940iozdgvuglv = 0;

    class iobyxmoadg implements View.OnTouchListener {
        iobyxmoadg() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    class zoijcleaow implements NestedScrollView.eablkybsjg {
        zoijcleaow() {
        }

        @Override // androidx.core.widget.NestedScrollView.eablkybsjg
        public void iobyxmoadg(NestedScrollView nestedScrollView, int i13, int i14, int i15, int i16) {
        }
    }

    rgvfuqvkyq(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f7958zdlpuopuiu = motionLayout;
        ppxfxbqfkf(context, Xml.asAttributeSet(xmlPullParser));
    }

    private void ppxfxbqfkf(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.nufgyqmvbu.OnSwipe);
        zoijcleaow(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void zoijcleaow(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = typedArray.getIndex(i13);
            if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnSwipe_touchAnchorId) {
                this.f7955wkgbmnqykc = typedArray.getResourceId(index, this.f7955wkgbmnqykc);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnSwipe_touchAnchorSide) {
                int i14 = typedArray.getInt(index, this.f7939iobyxmoadg);
                this.f7939iobyxmoadg = i14;
                float[] fArr = f7927lmojexxdyd[i14];
                this.f7947nufgyqmvbu = fArr[0];
                this.f7946lqeggnwhkg = fArr[1];
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnSwipe_dragDirection) {
                int i15 = typedArray.getInt(index, this.f7959zoijcleaow);
                this.f7959zoijcleaow = i15;
                float[][] fArr2 = f7928wwaezpbzkn;
                if (i15 < fArr2.length) {
                    float[] fArr3 = fArr2[i15];
                    this.f7954wflxmlrfwp = fArr3[0];
                    this.f7929agtfadlqog = fArr3[1];
                } else {
                    this.f7929agtfadlqog = Float.NaN;
                    this.f7954wflxmlrfwp = Float.NaN;
                    this.f7933draadjrbmk = true;
                }
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnSwipe_maxVelocity) {
                this.f7957yggfygwlhe = typedArray.getFloat(index, this.f7957yggfygwlhe);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnSwipe_maxAcceleration) {
                this.f7943jyumaefscl = typedArray.getFloat(index, this.f7943jyumaefscl);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnSwipe_moveWhenScrollAtTop) {
                this.f7942iwizpuwonk = typedArray.getBoolean(index, this.f7942iwizpuwonk);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnSwipe_dragScale) {
                this.f7932cqumvgiudr = typedArray.getFloat(index, this.f7932cqumvgiudr);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnSwipe_dragThreshold) {
                this.f7945lereixgezr = typedArray.getFloat(index, this.f7945lereixgezr);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnSwipe_touchRegionId) {
                this.f7935eablkybsjg = typedArray.getResourceId(index, this.f7935eablkybsjg);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnSwipe_onTouchUp) {
                this.f7951ppxfxbqfkf = typedArray.getInt(index, this.f7951ppxfxbqfkf);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnSwipe_nestedScrollFlags) {
                this.f7936esjtqupxsv = typedArray.getInteger(index, 0);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnSwipe_limitBoundsTo) {
                this.f7938gxszxtbevo = typedArray.getResourceId(index, 0);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnSwipe_rotationCenterId) {
                this.f7937gtknphoqwx = typedArray.getResourceId(index, this.f7937gtknphoqwx);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnSwipe_springDamping) {
                this.f7950pmvmpeiblj = typedArray.getFloat(index, this.f7950pmvmpeiblj);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnSwipe_springMass) {
                this.f7960zynmafqrjb = typedArray.getFloat(index, this.f7960zynmafqrjb);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnSwipe_springStiffness) {
                this.f7941istkbnxepw = typedArray.getFloat(index, this.f7941istkbnxepw);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnSwipe_springStopThreshold) {
                this.f7931cdpycssgdh = typedArray.getFloat(index, this.f7931cdpycssgdh);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnSwipe_springBoundary) {
                this.f7956yadqdtsiqt = typedArray.getInt(index, this.f7956yadqdtsiqt);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnSwipe_autoCompleteMode) {
                this.f7940iozdgvuglv = typedArray.getInt(index, this.f7940iozdgvuglv);
            }
        }
    }

    public float agtfadlqog() {
        return this.f7941istkbnxepw;
    }

    float btonecajqb(float f13, float f14) {
        this.f7958zdlpuopuiu.ribwqtqdhb(this.f7955wkgbmnqykc, this.f7958zdlpuopuiu.getProgress(), this.f7947nufgyqmvbu, this.f7946lqeggnwhkg, this.f7952rgvfuqvkyq);
        float f15 = this.f7954wflxmlrfwp;
        if (f15 != 0.0f) {
            float[] fArr = this.f7952rgvfuqvkyq;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f13 * f15) / fArr[0];
        }
        float[] fArr2 = this.f7952rgvfuqvkyq;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f14 * this.f7929agtfadlqog) / fArr2[1];
    }

    public void cqumvgiudr(boolean z13) {
        if (z13) {
            float[][] fArr = f7928wwaezpbzkn;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f7927lmojexxdyd;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f7928wwaezpbzkn;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f7927lmojexxdyd;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f7927lmojexxdyd[this.f7939iobyxmoadg];
        this.f7947nufgyqmvbu = fArr5[0];
        this.f7946lqeggnwhkg = fArr5[1];
        int i13 = this.f7959zoijcleaow;
        float[][] fArr6 = f7928wwaezpbzkn;
        if (i13 >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i13];
        this.f7954wflxmlrfwp = fArr7[0];
        this.f7929agtfadlqog = fArr7[1];
    }

    public float draadjrbmk() {
        return this.f7950pmvmpeiblj;
    }

    boolean dxjokdxxww() {
        return this.f7942iwizpuwonk;
    }

    public int eablkybsjg() {
        return this.f7936esjtqupxsv;
    }

    void esjtqupxsv(float f13, float f14) {
        this.f7949oxmwwwfdhm = f13;
        this.f7944kcexrzcfyt = f14;
        this.f7948ojitshcjhn = false;
    }

    public int gtknphoqwx() {
        return this.f7956yadqdtsiqt;
    }

    RectF gxszxtbevo(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i13 = this.f7938gxszxtbevo;
        if (i13 == -1 || (viewFindViewById = viewGroup.findViewById(i13)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    float iobyxmoadg(float f13, float f14) {
        return (f13 * this.f7954wflxmlrfwp) + (f14 * this.f7929agtfadlqog);
    }

    void iwizpuwonk(float f13, float f14) {
        this.f7949oxmwwwfdhm = f13;
        this.f7944kcexrzcfyt = f14;
    }

    void jyumaefscl(float f13, float f14) {
        int i13;
        this.f7948ojitshcjhn = false;
        float progress = this.f7958zdlpuopuiu.getProgress();
        this.f7958zdlpuopuiu.ribwqtqdhb(this.f7955wkgbmnqykc, progress, this.f7947nufgyqmvbu, this.f7946lqeggnwhkg, this.f7952rgvfuqvkyq);
        float f15 = this.f7954wflxmlrfwp;
        float[] fArr = this.f7952rgvfuqvkyq;
        float f16 = f15 != 0.0f ? (f13 * f15) / fArr[0] : (f14 * this.f7929agtfadlqog) / fArr[1];
        if (!Float.isNaN(f16)) {
            progress += f16 / 3.0f;
        }
        if (progress == 0.0f || progress == 1.0f || (i13 = this.f7951ppxfxbqfkf) == 3) {
            return;
        }
        this.f7958zdlpuopuiu.oipsdeybqn(i13, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f16);
    }

    void kcexrzcfyt(MotionEvent motionEvent, MotionLayout.lqeggnwhkg lqeggnwhkgVar, int i13, ojitshcjhn ojitshcjhnVar) {
        int i14;
        if (this.f7933draadjrbmk) {
            zdlpuopuiu(motionEvent, lqeggnwhkgVar, i13, ojitshcjhnVar);
            return;
        }
        lqeggnwhkgVar.ppxfxbqfkf(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7949oxmwwwfdhm = motionEvent.getRawX();
            this.f7944kcexrzcfyt = motionEvent.getRawY();
            this.f7948ojitshcjhn = false;
            return;
        }
        if (action == 1) {
            this.f7948ojitshcjhn = false;
            lqeggnwhkgVar.gxszxtbevo(1000);
            float fEablkybsjg = lqeggnwhkgVar.eablkybsjg();
            float fWkgbmnqykc = lqeggnwhkgVar.wkgbmnqykc();
            float progress = this.f7958zdlpuopuiu.getProgress();
            int i15 = this.f7955wkgbmnqykc;
            if (i15 != -1) {
                this.f7958zdlpuopuiu.ribwqtqdhb(i15, progress, this.f7947nufgyqmvbu, this.f7946lqeggnwhkg, this.f7952rgvfuqvkyq);
            } else {
                float fMin = Math.min(this.f7958zdlpuopuiu.getWidth(), this.f7958zdlpuopuiu.getHeight());
                float[] fArr = this.f7952rgvfuqvkyq;
                fArr[1] = this.f7929agtfadlqog * fMin;
                fArr[0] = fMin * this.f7954wflxmlrfwp;
            }
            float f13 = this.f7954wflxmlrfwp;
            float[] fArr2 = this.f7952rgvfuqvkyq;
            float fAbs = f13 != 0.0f ? fEablkybsjg / fArr2[0] : fWkgbmnqykc / fArr2[1];
            float f14 = !Float.isNaN(fAbs) ? (fAbs / 3.0f) + progress : progress;
            if (f14 == 0.0f || f14 == 1.0f || (i14 = this.f7951ppxfxbqfkf) == 3) {
                if (0.0f >= f14 || 1.0f <= f14) {
                    this.f7958zdlpuopuiu.setState(MotionLayout.gtknphoqwx.FINISHED);
                    return;
                }
                return;
            }
            float f15 = ((double) f14) < 0.5d ? 0.0f : 1.0f;
            if (i14 == 6) {
                if (progress + fAbs < 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                f15 = 1.0f;
            }
            if (this.f7951ppxfxbqfkf == 7) {
                if (progress + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f15 = 0.0f;
            }
            this.f7958zdlpuopuiu.oipsdeybqn(this.f7951ppxfxbqfkf, f15, fAbs);
            if (0.0f >= progress || 1.0f <= progress) {
                this.f7958zdlpuopuiu.setState(MotionLayout.gtknphoqwx.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.f7944kcexrzcfyt;
        float rawX = motionEvent.getRawX() - this.f7949oxmwwwfdhm;
        if (Math.abs((this.f7954wflxmlrfwp * rawX) + (this.f7929agtfadlqog * rawY)) > this.f7945lereixgezr || this.f7948ojitshcjhn) {
            float progress2 = this.f7958zdlpuopuiu.getProgress();
            if (!this.f7948ojitshcjhn) {
                this.f7948ojitshcjhn = true;
                this.f7958zdlpuopuiu.setProgress(progress2);
            }
            int i16 = this.f7955wkgbmnqykc;
            if (i16 != -1) {
                this.f7958zdlpuopuiu.ribwqtqdhb(i16, progress2, this.f7947nufgyqmvbu, this.f7946lqeggnwhkg, this.f7952rgvfuqvkyq);
            } else {
                float fMin2 = Math.min(this.f7958zdlpuopuiu.getWidth(), this.f7958zdlpuopuiu.getHeight());
                float[] fArr3 = this.f7952rgvfuqvkyq;
                fArr3[1] = this.f7929agtfadlqog * fMin2;
                fArr3[0] = fMin2 * this.f7954wflxmlrfwp;
            }
            float f16 = this.f7954wflxmlrfwp;
            float[] fArr4 = this.f7952rgvfuqvkyq;
            if (Math.abs(((f16 * fArr4[0]) + (this.f7929agtfadlqog * fArr4[1])) * this.f7932cqumvgiudr) < 0.01d) {
                float[] fArr5 = this.f7952rgvfuqvkyq;
                fArr5[0] = 0.01f;
                fArr5[1] = 0.01f;
            }
            float fMax = Math.max(Math.min(progress2 + (this.f7954wflxmlrfwp != 0.0f ? rawX / this.f7952rgvfuqvkyq[0] : rawY / this.f7952rgvfuqvkyq[1]), 1.0f), 0.0f);
            if (this.f7951ppxfxbqfkf == 6) {
                fMax = Math.max(fMax, 0.01f);
            }
            if (this.f7951ppxfxbqfkf == 7) {
                fMax = Math.min(fMax, 0.99f);
            }
            float progress3 = this.f7958zdlpuopuiu.getProgress();
            if (fMax != progress3) {
                if (progress3 == 0.0f || progress3 == 1.0f) {
                    this.f7958zdlpuopuiu.tzroggbefp(progress3 == 0.0f);
                }
                this.f7958zdlpuopuiu.setProgress(fMax);
                lqeggnwhkgVar.gxszxtbevo(1000);
                this.f7958zdlpuopuiu.f7555iwizpuwonk = this.f7954wflxmlrfwp != 0.0f ? lqeggnwhkgVar.eablkybsjg() / this.f7952rgvfuqvkyq[0] : lqeggnwhkgVar.wkgbmnqykc() / this.f7952rgvfuqvkyq[1];
            } else {
                this.f7958zdlpuopuiu.f7555iwizpuwonk = 0.0f;
            }
            this.f7949oxmwwwfdhm = motionEvent.getRawX();
            this.f7944kcexrzcfyt = motionEvent.getRawY();
        }
    }

    void lereixgezr() {
        View viewFindViewById;
        int i13 = this.f7955wkgbmnqykc;
        if (i13 != -1) {
            viewFindViewById = this.f7958zdlpuopuiu.findViewById(i13);
            if (viewFindViewById == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + androidx.constraintlayout.motion.widget.iobyxmoadg.ppxfxbqfkf(this.f7958zdlpuopuiu.getContext(), this.f7955wkgbmnqykc));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new iobyxmoadg());
            nestedScrollView.setOnScrollChangeListener(new zoijcleaow());
        }
    }

    float lqeggnwhkg() {
        return this.f7943jyumaefscl;
    }

    public float nufgyqmvbu() {
        return this.f7957yggfygwlhe;
    }

    public float ojitshcjhn() {
        return this.f7931cdpycssgdh;
    }

    boolean oxmwwwfdhm() {
        return this.f7948ojitshcjhn;
    }

    RectF rgvfuqvkyq(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i13 = this.f7935eablkybsjg;
        if (i13 == -1 || (viewFindViewById = viewGroup.findViewById(i13)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public String toString() {
        if (Float.isNaN(this.f7954wflxmlrfwp)) {
            return "rotation";
        }
        return this.f7954wflxmlrfwp + " , " + this.f7929agtfadlqog;
    }

    int vdvldrhtss() {
        return this.f7935eablkybsjg;
    }

    public float wflxmlrfwp() {
        return this.f7960zynmafqrjb;
    }

    public int wkgbmnqykc() {
        return this.f7940iozdgvuglv;
    }

    void yggfygwlhe(float f13, float f14) {
        float progress = this.f7958zdlpuopuiu.getProgress();
        if (!this.f7948ojitshcjhn) {
            this.f7948ojitshcjhn = true;
            this.f7958zdlpuopuiu.setProgress(progress);
        }
        this.f7958zdlpuopuiu.ribwqtqdhb(this.f7955wkgbmnqykc, progress, this.f7947nufgyqmvbu, this.f7946lqeggnwhkg, this.f7952rgvfuqvkyq);
        float f15 = this.f7954wflxmlrfwp;
        float[] fArr = this.f7952rgvfuqvkyq;
        if (Math.abs((f15 * fArr[0]) + (this.f7929agtfadlqog * fArr[1])) < 0.01d) {
            float[] fArr2 = this.f7952rgvfuqvkyq;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f16 = this.f7954wflxmlrfwp;
        float fMax = Math.max(Math.min(progress + (f16 != 0.0f ? (f13 * f16) / this.f7952rgvfuqvkyq[0] : (f14 * this.f7929agtfadlqog) / this.f7952rgvfuqvkyq[1]), 1.0f), 0.0f);
        if (fMax != this.f7958zdlpuopuiu.getProgress()) {
            this.f7958zdlpuopuiu.setProgress(fMax);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0270  */
    /* JADX WARN: Code duplicated, block: B:58:0x0294  */
    /* JADX WARN: Code duplicated, block: B:61:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x02be  */
    void zdlpuopuiu(MotionEvent motionEvent, MotionLayout.lqeggnwhkg lqeggnwhkgVar, int i13, ojitshcjhn ojitshcjhnVar) {
        float left;
        float f13;
        int top;
        int bottom;
        int i14;
        float degrees;
        float f14;
        int i15;
        lqeggnwhkgVar.ppxfxbqfkf(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7949oxmwwwfdhm = motionEvent.getRawX();
            this.f7944kcexrzcfyt = motionEvent.getRawY();
            this.f7948ojitshcjhn = false;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            motionEvent.getRawY();
            motionEvent.getRawX();
            float width = this.f7958zdlpuopuiu.getWidth() / 2.0f;
            float height = this.f7958zdlpuopuiu.getHeight() / 2.0f;
            int i16 = this.f7937gtknphoqwx;
            if (i16 != -1) {
                View viewFindViewById = this.f7958zdlpuopuiu.findViewById(i16);
                this.f7958zdlpuopuiu.getLocationOnScreen(this.f7953vdvldrhtss);
                float left2 = this.f7953vdvldrhtss[0] + ((viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f);
                height = ((viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f) + this.f7953vdvldrhtss[1];
                width = left2;
            } else {
                int i17 = this.f7955wkgbmnqykc;
                if (i17 != -1) {
                    View viewFindViewById2 = this.f7958zdlpuopuiu.findViewById(this.f7958zdlpuopuiu.jhduphickx(i17).nufgyqmvbu());
                    if (viewFindViewById2 == null) {
                        Log.e("TouchResponse", "could not find view to animate to");
                    } else {
                        this.f7958zdlpuopuiu.getLocationOnScreen(this.f7953vdvldrhtss);
                        width = this.f7953vdvldrhtss[0] + ((viewFindViewById2.getLeft() + viewFindViewById2.getRight()) / 2.0f);
                        height = this.f7953vdvldrhtss[1] + ((viewFindViewById2.getTop() + viewFindViewById2.getBottom()) / 2.0f);
                    }
                }
            }
            float rawX = motionEvent.getRawX() - width;
            float rawY = motionEvent.getRawY() - height;
            double dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
            float fAtan2 = (float) (((dAtan2 - Math.atan2(this.f7944kcexrzcfyt - height, this.f7949oxmwwwfdhm - width)) * 180.0d) / 3.141592653589793d);
            if (fAtan2 > 330.0f) {
                fAtan2 -= 360.0f;
            } else if (fAtan2 < -330.0f) {
                fAtan2 += 360.0f;
            }
            if (Math.abs(fAtan2) > 0.01d || this.f7948ojitshcjhn) {
                float progress = this.f7958zdlpuopuiu.getProgress();
                if (!this.f7948ojitshcjhn) {
                    this.f7948ojitshcjhn = true;
                    this.f7958zdlpuopuiu.setProgress(progress);
                }
                int i18 = this.f7955wkgbmnqykc;
                if (i18 != -1) {
                    this.f7958zdlpuopuiu.ribwqtqdhb(i18, progress, this.f7947nufgyqmvbu, this.f7946lqeggnwhkg, this.f7952rgvfuqvkyq);
                    float[] fArr = this.f7952rgvfuqvkyq;
                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                } else {
                    this.f7952rgvfuqvkyq[1] = 360.0f;
                }
                float fMax = Math.max(Math.min(progress + ((fAtan2 * this.f7932cqumvgiudr) / this.f7952rgvfuqvkyq[1]), 1.0f), 0.0f);
                float progress2 = this.f7958zdlpuopuiu.getProgress();
                if (fMax != progress2) {
                    if (progress2 == 0.0f || progress2 == 1.0f) {
                        this.f7958zdlpuopuiu.tzroggbefp(progress2 == 0.0f);
                    }
                    this.f7958zdlpuopuiu.setProgress(fMax);
                    lqeggnwhkgVar.gxszxtbevo(1000);
                    float fEablkybsjg = lqeggnwhkgVar.eablkybsjg();
                    double dWkgbmnqykc = lqeggnwhkgVar.wkgbmnqykc();
                    double d13 = fEablkybsjg;
                    this.f7958zdlpuopuiu.f7555iwizpuwonk = (float) Math.toDegrees((float) ((Math.hypot(dWkgbmnqykc, d13) * Math.sin(Math.atan2(dWkgbmnqykc, d13) - dAtan2)) / Math.hypot(rawX, rawY)));
                } else {
                    this.f7958zdlpuopuiu.f7555iwizpuwonk = 0.0f;
                }
                this.f7949oxmwwwfdhm = motionEvent.getRawX();
                this.f7944kcexrzcfyt = motionEvent.getRawY();
                return;
            }
            return;
        }
        this.f7948ojitshcjhn = false;
        lqeggnwhkgVar.gxszxtbevo(16);
        float fEablkybsjg2 = lqeggnwhkgVar.eablkybsjg();
        float fWkgbmnqykc = lqeggnwhkgVar.wkgbmnqykc();
        float progress3 = this.f7958zdlpuopuiu.getProgress();
        float width2 = this.f7958zdlpuopuiu.getWidth() / 2.0f;
        float height2 = this.f7958zdlpuopuiu.getHeight() / 2.0f;
        int i19 = this.f7937gtknphoqwx;
        if (i19 == -1) {
            int i23 = this.f7955wkgbmnqykc;
            if (i23 != -1) {
                View viewFindViewById3 = this.f7958zdlpuopuiu.findViewById(this.f7958zdlpuopuiu.jhduphickx(i23).nufgyqmvbu());
                this.f7958zdlpuopuiu.getLocationOnScreen(this.f7953vdvldrhtss);
                left = this.f7953vdvldrhtss[0] + ((viewFindViewById3.getLeft() + viewFindViewById3.getRight()) / 2.0f);
                f13 = this.f7953vdvldrhtss[1];
                top = viewFindViewById3.getTop();
                bottom = viewFindViewById3.getBottom();
            }
            float rawX2 = motionEvent.getRawX() - width2;
            float rawY2 = motionEvent.getRawY() - height2;
            double degrees2 = Math.toDegrees(Math.atan2(rawY2, rawX2));
            i14 = this.f7955wkgbmnqykc;
            if (i14 != -1) {
                this.f7958zdlpuopuiu.ribwqtqdhb(i14, progress3, this.f7947nufgyqmvbu, this.f7946lqeggnwhkg, this.f7952rgvfuqvkyq);
                float[] fArr2 = this.f7952rgvfuqvkyq;
                fArr2[1] = (float) Math.toDegrees(fArr2[1]);
            } else {
                this.f7952rgvfuqvkyq[1] = 360.0f;
            }
            degrees = ((float) (Math.toDegrees(Math.atan2(fWkgbmnqykc + rawY2, fEablkybsjg2 + rawX2)) - degrees2)) * 62.5f;
            if (Float.isNaN(degrees)) {
                f14 = progress3;
            } else {
                f14 = (((degrees * 3.0f) * this.f7932cqumvgiudr) / this.f7952rgvfuqvkyq[1]) + progress3;
            }
            if (f14 != 0.0f || f14 == 1.0f || (i15 = this.f7951ppxfxbqfkf) == 3) {
                if (0.0f < f14 || 1.0f <= f14) {
                    this.f7958zdlpuopuiu.setState(MotionLayout.gtknphoqwx.FINISHED);
                }
                return;
            }
            float fAbs = (degrees * this.f7932cqumvgiudr) / this.f7952rgvfuqvkyq[1];
            float f15 = ((double) f14) < 0.5d ? 0.0f : 1.0f;
            if (i15 == 6) {
                if (progress3 + fAbs < 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                f15 = 1.0f;
            }
            if (this.f7951ppxfxbqfkf == 7) {
                if (progress3 + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f15 = 0.0f;
            }
            this.f7958zdlpuopuiu.oipsdeybqn(this.f7951ppxfxbqfkf, f15, fAbs * 3.0f);
            if (0.0f >= progress3 || 1.0f <= progress3) {
                this.f7958zdlpuopuiu.setState(MotionLayout.gtknphoqwx.FINISHED);
                return;
            }
            return;
        }
        View viewFindViewById4 = this.f7958zdlpuopuiu.findViewById(i19);
        this.f7958zdlpuopuiu.getLocationOnScreen(this.f7953vdvldrhtss);
        left = this.f7953vdvldrhtss[0] + ((viewFindViewById4.getLeft() + viewFindViewById4.getRight()) / 2.0f);
        f13 = this.f7953vdvldrhtss[1];
        top = viewFindViewById4.getTop();
        bottom = viewFindViewById4.getBottom();
        height2 = f13 + ((top + bottom) / 2.0f);
        width2 = left;
        float rawX3 = motionEvent.getRawX() - width2;
        float rawY3 = motionEvent.getRawY() - height2;
        double degrees3 = Math.toDegrees(Math.atan2(rawY3, rawX3));
        i14 = this.f7955wkgbmnqykc;
        if (i14 != -1) {
            this.f7958zdlpuopuiu.ribwqtqdhb(i14, progress3, this.f7947nufgyqmvbu, this.f7946lqeggnwhkg, this.f7952rgvfuqvkyq);
            float[] fArr3 = this.f7952rgvfuqvkyq;
            fArr3[1] = (float) Math.toDegrees(fArr3[1]);
        } else {
            this.f7952rgvfuqvkyq[1] = 360.0f;
        }
        degrees = ((float) (Math.toDegrees(Math.atan2(fWkgbmnqykc + rawY3, fEablkybsjg2 + rawX3)) - degrees3)) * 62.5f;
        if (Float.isNaN(degrees)) {
            f14 = (((degrees * 3.0f) * this.f7932cqumvgiudr) / this.f7952rgvfuqvkyq[1]) + progress3;
        } else {
            f14 = progress3;
        }
        if (f14 != 0.0f) {
        }
        if (0.0f < f14) {
        }
        this.f7958zdlpuopuiu.setState(MotionLayout.gtknphoqwx.FINISHED);
    }
}
