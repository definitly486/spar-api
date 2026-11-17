package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class btonecajqb extends ppxfxbqfkf {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int f7681agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    int f7682btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f7683cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    RectF f7684draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    int f7685dxjokdxxww;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private float f7686esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    RectF f7687gtknphoqwx;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f7688iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f7689jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private int f7690kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private float f7691lereixgezr;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    float f7692lqeggnwhkg = 0.1f;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    int f7693nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private String f7694ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private String f7695oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f7696pmvmpeiblj;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f7697rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private String f7698vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    HashMap f7699wflxmlrfwp;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private View f7700yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f7701zdlpuopuiu;

    private static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static SparseIntArray f7702iobyxmoadg;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f7702iobyxmoadg = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTrigger_framePosition, 8);
            f7702iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTrigger_onCross, 4);
            f7702iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTrigger_onNegativeCross, 1);
            f7702iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTrigger_onPositiveCross, 2);
            f7702iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTrigger_motionTarget, 7);
            f7702iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTrigger_triggerId, 6);
            f7702iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTrigger_triggerSlack, 5);
            f7702iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTrigger_motion_triggerOnCollision, 9);
            f7702iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTrigger_motion_postLayoutCollision, 10);
            f7702iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTrigger_triggerReceiver, 11);
            f7702iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTrigger_viewTransitionOnCross, 12);
            f7702iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTrigger_viewTransitionOnNegativeCross, 13);
            f7702iobyxmoadg.append(androidx.constraintlayout.widget.nufgyqmvbu.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        public static void iobyxmoadg(btonecajqb btonecajqbVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArray.getIndex(i13);
                switch (f7702iobyxmoadg.get(index)) {
                    case 1:
                        btonecajqbVar.f7698vdvldrhtss = typedArray.getString(index);
                        break;
                    case 2:
                        btonecajqbVar.f7695oxmwwwfdhm = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + f7702iobyxmoadg.get(index));
                        break;
                    case 4:
                        btonecajqbVar.f7694ojitshcjhn = typedArray.getString(index);
                        break;
                    case 5:
                        btonecajqbVar.f7692lqeggnwhkg = typedArray.getFloat(index, btonecajqbVar.f7692lqeggnwhkg);
                        break;
                    case 6:
                        btonecajqbVar.f7690kcexrzcfyt = typedArray.getResourceId(index, btonecajqbVar.f7690kcexrzcfyt);
                        break;
                    case 7:
                        if (MotionLayout.f7530eslsurpljm) {
                            int resourceId = typedArray.getResourceId(index, btonecajqbVar.f7926zoijcleaow);
                            btonecajqbVar.f7926zoijcleaow = resourceId;
                            if (resourceId == -1) {
                                btonecajqbVar.f7924ppxfxbqfkf = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            btonecajqbVar.f7924ppxfxbqfkf = typedArray.getString(index);
                        } else {
                            btonecajqbVar.f7926zoijcleaow = typedArray.getResourceId(index, btonecajqbVar.f7926zoijcleaow);
                        }
                        break;
                    case 8:
                        int integer = typedArray.getInteger(index, btonecajqbVar.f7923iobyxmoadg);
                        btonecajqbVar.f7923iobyxmoadg = integer;
                        btonecajqbVar.f7686esjtqupxsv = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        btonecajqbVar.f7701zdlpuopuiu = typedArray.getResourceId(index, btonecajqbVar.f7701zdlpuopuiu);
                        break;
                    case 10:
                        btonecajqbVar.f7696pmvmpeiblj = typedArray.getBoolean(index, btonecajqbVar.f7696pmvmpeiblj);
                        break;
                    case 11:
                        btonecajqbVar.f7697rgvfuqvkyq = typedArray.getResourceId(index, btonecajqbVar.f7697rgvfuqvkyq);
                        break;
                    case 12:
                        btonecajqbVar.f7682btonecajqb = typedArray.getResourceId(index, btonecajqbVar.f7682btonecajqb);
                        break;
                    case 13:
                        btonecajqbVar.f7693nufgyqmvbu = typedArray.getResourceId(index, btonecajqbVar.f7693nufgyqmvbu);
                        break;
                    case 14:
                        btonecajqbVar.f7685dxjokdxxww = typedArray.getResourceId(index, btonecajqbVar.f7685dxjokdxxww);
                        break;
                }
            }
        }
    }

    public btonecajqb() {
        int i13 = ppxfxbqfkf.f7921gxszxtbevo;
        this.f7693nufgyqmvbu = i13;
        this.f7685dxjokdxxww = i13;
        this.f7682btonecajqb = i13;
        this.f7687gtknphoqwx = new RectF();
        this.f7684draadjrbmk = new RectF();
        this.f7699wflxmlrfwp = new HashMap();
        this.f7681agtfadlqog = -1;
        this.f7694ojitshcjhn = null;
        int i14 = ppxfxbqfkf.f7921gxszxtbevo;
        this.f7697rgvfuqvkyq = i14;
        this.f7698vdvldrhtss = null;
        this.f7695oxmwwwfdhm = null;
        this.f7690kcexrzcfyt = i14;
        this.f7701zdlpuopuiu = i14;
        this.f7700yggfygwlhe = null;
        this.f7689jyumaefscl = true;
        this.f7688iwizpuwonk = true;
        this.f7683cqumvgiudr = true;
        this.f7686esjtqupxsv = Float.NaN;
        this.f7696pmvmpeiblj = false;
        this.f7925wkgbmnqykc = 5;
        this.f7922eablkybsjg = new HashMap();
    }

    private void cqumvgiudr(RectF rectF, View view, boolean z13) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z13) {
            view.getMatrix().mapRect(rectF);
        }
    }

    private void iwizpuwonk(String str, View view) {
        boolean z13 = str.length() == 1;
        if (!z13) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f7922eablkybsjg.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z13 || lowerCase.matches(str)) {
                androidx.constraintlayout.widget.iobyxmoadg iobyxmoadgVar = (androidx.constraintlayout.widget.iobyxmoadg) this.f7922eablkybsjg.get(str2);
                if (iobyxmoadgVar != null) {
                    iobyxmoadgVar.iobyxmoadg(view);
                }
            }
        }
    }

    private void jyumaefscl(String str, View view) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            iwizpuwonk(str, view);
            return;
        }
        if (this.f7699wflxmlrfwp.containsKey(str)) {
            method = (Method) this.f7699wflxmlrfwp.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, null);
                this.f7699wflxmlrfwp.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.f7699wflxmlrfwp.put(str, null);
                Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + androidx.constraintlayout.motion.widget.iobyxmoadg.wkgbmnqykc(view));
                return;
            }
        }
        try {
            method.invoke(view, null);
        } catch (Exception unused2) {
            Log.e("KeyTrigger", "Exception in call \"" + this.f7694ojitshcjhn + "\"on class " + view.getClass().getSimpleName() + " " + androidx.constraintlayout.motion.widget.iobyxmoadg.wkgbmnqykc(view));
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public void eablkybsjg(Context context, AttributeSet attributeSet) {
        iobyxmoadg.iobyxmoadg(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.nufgyqmvbu.KeyTrigger), context);
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public void iobyxmoadg(HashMap map) {
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public ppxfxbqfkf ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
        super.ppxfxbqfkf(ppxfxbqfkfVar);
        btonecajqb btonecajqbVar = (btonecajqb) ppxfxbqfkfVar;
        this.f7681agtfadlqog = btonecajqbVar.f7681agtfadlqog;
        this.f7694ojitshcjhn = btonecajqbVar.f7694ojitshcjhn;
        this.f7697rgvfuqvkyq = btonecajqbVar.f7697rgvfuqvkyq;
        this.f7698vdvldrhtss = btonecajqbVar.f7698vdvldrhtss;
        this.f7695oxmwwwfdhm = btonecajqbVar.f7695oxmwwwfdhm;
        this.f7690kcexrzcfyt = btonecajqbVar.f7690kcexrzcfyt;
        this.f7701zdlpuopuiu = btonecajqbVar.f7701zdlpuopuiu;
        this.f7700yggfygwlhe = btonecajqbVar.f7700yggfygwlhe;
        this.f7692lqeggnwhkg = btonecajqbVar.f7692lqeggnwhkg;
        this.f7689jyumaefscl = btonecajqbVar.f7689jyumaefscl;
        this.f7688iwizpuwonk = btonecajqbVar.f7688iwizpuwonk;
        this.f7683cqumvgiudr = btonecajqbVar.f7683cqumvgiudr;
        this.f7686esjtqupxsv = btonecajqbVar.f7686esjtqupxsv;
        this.f7691lereixgezr = btonecajqbVar.f7691lereixgezr;
        this.f7696pmvmpeiblj = btonecajqbVar.f7696pmvmpeiblj;
        this.f7687gtknphoqwx = btonecajqbVar.f7687gtknphoqwx;
        this.f7684draadjrbmk = btonecajqbVar.f7684draadjrbmk;
        this.f7699wflxmlrfwp = btonecajqbVar.f7699wflxmlrfwp;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    public void wkgbmnqykc(HashSet hashSet) {
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00db  */
    public void yggfygwlhe(float f13, View view) {
        boolean z13;
        boolean z14;
        boolean z15;
        float f14;
        float f15;
        float f16;
        float f17;
        boolean z16;
        boolean z17 = true;
        boolean z18 = false;
        if (this.f7701zdlpuopuiu != ppxfxbqfkf.f7921gxszxtbevo) {
            if (this.f7700yggfygwlhe == null) {
                this.f7700yggfygwlhe = ((ViewGroup) view.getParent()).findViewById(this.f7701zdlpuopuiu);
            }
            cqumvgiudr(this.f7687gtknphoqwx, this.f7700yggfygwlhe, this.f7696pmvmpeiblj);
            cqumvgiudr(this.f7684draadjrbmk, view, this.f7696pmvmpeiblj);
            if (this.f7687gtknphoqwx.intersect(this.f7684draadjrbmk)) {
                if (this.f7689jyumaefscl) {
                    this.f7689jyumaefscl = false;
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.f7683cqumvgiudr) {
                    this.f7683cqumvgiudr = false;
                    z15 = true;
                } else {
                    z15 = false;
                }
                this.f7688iwizpuwonk = true;
            } else {
                if (this.f7689jyumaefscl) {
                    z13 = false;
                } else {
                    this.f7689jyumaefscl = true;
                    z13 = true;
                }
                if (this.f7688iwizpuwonk) {
                    this.f7688iwizpuwonk = false;
                    z16 = true;
                } else {
                    z16 = false;
                }
                this.f7683cqumvgiudr = true;
                z18 = z16;
                z15 = false;
            }
        } else {
            if (this.f7689jyumaefscl) {
                float f18 = this.f7686esjtqupxsv;
                if ((f13 - f18) * (this.f7691lereixgezr - f18) < 0.0f) {
                    this.f7689jyumaefscl = false;
                    z13 = true;
                }
                if (this.f7688iwizpuwonk) {
                    f16 = this.f7686esjtqupxsv;
                    f17 = f13 - f16;
                    if ((this.f7691lereixgezr - f16) * f17 >= 0.0f && f17 < 0.0f) {
                        this.f7688iwizpuwonk = false;
                        z14 = true;
                    }
                    if (this.f7683cqumvgiudr) {
                        f14 = this.f7686esjtqupxsv;
                        f15 = f13 - f14;
                        if ((this.f7691lereixgezr - f14) * f15 < 0.0f || f15 <= 0.0f) {
                            z17 = false;
                        } else {
                            this.f7683cqumvgiudr = false;
                        }
                        z15 = z17;
                    } else {
                        if (Math.abs(f13 - this.f7686esjtqupxsv) > this.f7692lqeggnwhkg) {
                            this.f7683cqumvgiudr = true;
                        }
                        z15 = false;
                    }
                    z18 = z14;
                } else if (Math.abs(f13 - this.f7686esjtqupxsv) > this.f7692lqeggnwhkg) {
                    this.f7688iwizpuwonk = true;
                }
                z14 = false;
                if (this.f7683cqumvgiudr) {
                    f14 = this.f7686esjtqupxsv;
                    f15 = f13 - f14;
                    if ((this.f7691lereixgezr - f14) * f15 < 0.0f) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    z15 = z17;
                } else {
                    if (Math.abs(f13 - this.f7686esjtqupxsv) > this.f7692lqeggnwhkg) {
                        this.f7683cqumvgiudr = true;
                    }
                    z15 = false;
                }
                z18 = z14;
            } else if (Math.abs(f13 - this.f7686esjtqupxsv) > this.f7692lqeggnwhkg) {
                this.f7689jyumaefscl = true;
            }
            z13 = false;
            if (this.f7688iwizpuwonk) {
                f16 = this.f7686esjtqupxsv;
                f17 = f13 - f16;
                if ((this.f7691lereixgezr - f16) * f17 >= 0.0f) {
                }
                if (this.f7683cqumvgiudr) {
                    f14 = this.f7686esjtqupxsv;
                    f15 = f13 - f14;
                    if ((this.f7691lereixgezr - f14) * f15 < 0.0f) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    z15 = z17;
                } else {
                    if (Math.abs(f13 - this.f7686esjtqupxsv) > this.f7692lqeggnwhkg) {
                        this.f7683cqumvgiudr = true;
                    }
                    z15 = false;
                }
                z18 = z14;
            } else if (Math.abs(f13 - this.f7686esjtqupxsv) > this.f7692lqeggnwhkg) {
                this.f7688iwizpuwonk = true;
            }
            z14 = false;
            if (this.f7683cqumvgiudr) {
                f14 = this.f7686esjtqupxsv;
                f15 = f13 - f14;
                if ((this.f7691lereixgezr - f14) * f15 < 0.0f) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                z15 = z17;
            } else {
                if (Math.abs(f13 - this.f7686esjtqupxsv) > this.f7692lqeggnwhkg) {
                    this.f7683cqumvgiudr = true;
                }
                z15 = false;
            }
            z18 = z14;
        }
        this.f7691lereixgezr = f13;
        if (z18 || z13 || z15) {
            ((MotionLayout) view.getParent()).jlmebxxoox(this.f7690kcexrzcfyt, z15, f13);
        }
        View viewFindViewById = this.f7697rgvfuqvkyq == ppxfxbqfkf.f7921gxszxtbevo ? view : ((MotionLayout) view.getParent()).findViewById(this.f7697rgvfuqvkyq);
        if (z18) {
            String str = this.f7698vdvldrhtss;
            if (str != null) {
                jyumaefscl(str, viewFindViewById);
            }
            if (this.f7693nufgyqmvbu != ppxfxbqfkf.f7921gxszxtbevo) {
                ((MotionLayout) view.getParent()).roivzttewh(this.f7693nufgyqmvbu, viewFindViewById);
            }
        }
        if (z15) {
            String str2 = this.f7695oxmwwwfdhm;
            if (str2 != null) {
                jyumaefscl(str2, viewFindViewById);
            }
            if (this.f7685dxjokdxxww != ppxfxbqfkf.f7921gxszxtbevo) {
                ((MotionLayout) view.getParent()).roivzttewh(this.f7685dxjokdxxww, viewFindViewById);
            }
        }
        if (z13) {
            String str3 = this.f7694ojitshcjhn;
            if (str3 != null) {
                jyumaefscl(str3, viewFindViewById);
            }
            if (this.f7682btonecajqb != ppxfxbqfkf.f7921gxszxtbevo) {
                ((MotionLayout) view.getParent()).roivzttewh(this.f7682btonecajqb, viewFindViewById);
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ppxfxbqfkf
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf clone() {
        return new btonecajqb().ppxfxbqfkf(this);
    }
}
