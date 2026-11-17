package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private TypedValue f3131cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private TypedValue f3132esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private TypedValue f3133iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private TypedValue f3134jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final Rect f3135lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private iobyxmoadg f3136pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private TypedValue f3137yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private TypedValue f3138zdlpuopuiu;

    public interface iobyxmoadg {
        void iobyxmoadg();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f3131cqumvgiudr == null) {
            this.f3131cqumvgiudr = new TypedValue();
        }
        return this.f3131cqumvgiudr;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f3132esjtqupxsv == null) {
            this.f3132esjtqupxsv = new TypedValue();
        }
        return this.f3132esjtqupxsv;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f3134jyumaefscl == null) {
            this.f3134jyumaefscl = new TypedValue();
        }
        return this.f3134jyumaefscl;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f3133iwizpuwonk == null) {
            this.f3133iwizpuwonk = new TypedValue();
        }
        return this.f3133iwizpuwonk;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f3138zdlpuopuiu == null) {
            this.f3138zdlpuopuiu = new TypedValue();
        }
        return this.f3138zdlpuopuiu;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f3137yggfygwlhe == null) {
            this.f3137yggfygwlhe = new TypedValue();
        }
        return this.f3137yggfygwlhe;
    }

    public void iobyxmoadg(int i13, int i14, int i15, int i16) {
        this.f3135lereixgezr.set(i13, i14, i15, i16);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        iobyxmoadg iobyxmoadgVar = this.f3136pmvmpeiblj;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.iobyxmoadg();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        iobyxmoadg iobyxmoadgVar = this.f3136pmvmpeiblj;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i13, int i14) {
        boolean z13;
        int i15;
        int i16;
        float fraction;
        int i17;
        int i18;
        float fraction2;
        int i19;
        int i23;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z14 = true;
        boolean z15 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i13);
        int mode2 = View.MeasureSpec.getMode(i14);
        if (mode != Integer.MIN_VALUE) {
            z13 = false;
        } else {
            TypedValue typedValue = z15 ? this.f3133iwizpuwonk : this.f3134jyumaefscl;
            if (typedValue == null || (i19 = typedValue.type) == 0) {
                z13 = false;
            } else {
                if (i19 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i19 == 6) {
                        int i24 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i24, i24);
                    } else {
                        i23 = 0;
                    }
                    if (i23 > 0) {
                        Rect rect = this.f3135lereixgezr;
                        i13 = View.MeasureSpec.makeMeasureSpec(Math.min(i23 - (rect.left + rect.right), View.MeasureSpec.getSize(i13)), 1073741824);
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
                i23 = (int) fraction3;
                if (i23 > 0) {
                    Rect rect2 = this.f3135lereixgezr;
                    i13 = View.MeasureSpec.makeMeasureSpec(Math.min(i23 - (rect2.left + rect2.right), View.MeasureSpec.getSize(i13)), 1073741824);
                    z13 = true;
                } else {
                    z13 = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z15 ? this.f3131cqumvgiudr : this.f3132esjtqupxsv;
            if (typedValue2 != null && (i17 = typedValue2.type) != 0) {
                if (i17 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i17 == 6) {
                        int i25 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i25, i25);
                    } else {
                        i18 = 0;
                    }
                    if (i18 > 0) {
                        Rect rect3 = this.f3135lereixgezr;
                        i14 = View.MeasureSpec.makeMeasureSpec(Math.min(i18 - (rect3.top + rect3.bottom), View.MeasureSpec.getSize(i14)), 1073741824);
                    }
                }
                i18 = (int) fraction2;
                if (i18 > 0) {
                    Rect rect4 = this.f3135lereixgezr;
                    i14 = View.MeasureSpec.makeMeasureSpec(Math.min(i18 - (rect4.top + rect4.bottom), View.MeasureSpec.getSize(i14)), 1073741824);
                }
            }
        }
        super.onMeasure(i13, i14);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z13 || mode != Integer.MIN_VALUE) {
            z14 = false;
        } else {
            TypedValue typedValue3 = z15 ? this.f3137yggfygwlhe : this.f3138zdlpuopuiu;
            if (typedValue3 == null || (i15 = typedValue3.type) == 0) {
                z14 = false;
            } else {
                if (i15 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i15 == 6) {
                        int i26 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i26, i26);
                    } else {
                        i16 = 0;
                    }
                    if (i16 > 0) {
                        Rect rect5 = this.f3135lereixgezr;
                        i16 -= rect5.left + rect5.right;
                    }
                    if (measuredWidth < i16) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                    } else {
                        z14 = false;
                    }
                }
                i16 = (int) fraction;
                if (i16 > 0) {
                    Rect rect6 = this.f3135lereixgezr;
                    i16 -= rect6.left + rect6.right;
                }
                if (measuredWidth < i16) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                } else {
                    z14 = false;
                }
            }
        }
        if (z14) {
            super.onMeasure(iMakeMeasureSpec, i14);
        }
    }

    public void setAttachListener(iobyxmoadg iobyxmoadgVar) {
        this.f3136pmvmpeiblj = iobyxmoadgVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f3135lereixgezr = new Rect();
    }
}
