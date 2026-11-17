package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.Arrays;
import v1.jhduphickx;
import w1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
class ClockFaceView extends gxszxtbevo implements ClockHandView.ppxfxbqfkf {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final float[] f23427cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final Rect f23428cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final RectF f23429esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final ColorStateList f23430hcddaimhww;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final int f23431iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final int[] f23432istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ClockHandView f23433iwizpuwonk;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final Rect f23434lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final int f23435lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private float f23436pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final SparseArray f23437pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final int f23438wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final int f23439yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private String[] f23440ylkuphrtab;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final v1.iobyxmoadg f23441zynmafqrjb;

    class iobyxmoadg implements ViewTreeObserver.OnPreDrawListener {
        iobyxmoadg() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.zdlpuopuiu(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f23433iwizpuwonk.btonecajqb()) - ClockFaceView.this.f23439yadqdtsiqt);
            return true;
        }
    }

    class zoijcleaow extends v1.iobyxmoadg {
        zoijcleaow() {
        }

        @Override // v1.iobyxmoadg
        public boolean btonecajqb(View view, int i13, Bundle bundle) {
            if (i13 != 16) {
                return super.btonecajqb(view, i13, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f23428cqumvgiudr);
            float fCenterX = ClockFaceView.this.f23428cqumvgiudr.centerX();
            float fCenterY = ClockFaceView.this.f23428cqumvgiudr.centerY();
            ClockFaceView.this.f23433iwizpuwonk.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.f23433iwizpuwonk.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }

        @Override // v1.iobyxmoadg
        public void lqeggnwhkg(View view, zdlpuopuiu zdlpuopuiuVar) {
            super.lqeggnwhkg(view, zdlpuopuiuVar);
            int iIntValue = ((Integer) view.getTag(da.gxszxtbevo.material_value_index)).intValue();
            if (iIntValue > 0) {
                zdlpuopuiuVar.krqnebusok((View) ClockFaceView.this.f23437pmvmpeiblj.get(iIntValue - 1));
            }
            zdlpuopuiuVar.sflfametgt(zdlpuopuiu.gxszxtbevo.iobyxmoadg(0, 1, iIntValue, 1, false, view.isSelected()));
            zdlpuopuiuVar.yfnezrywwk(true);
            zdlpuopuiuVar.zoijcleaow(zdlpuopuiu.iobyxmoadg.f118517dxjokdxxww);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, da.zoijcleaow.materialClockStyle);
    }

    private RadialGradient cdpycssgdh(RectF rectF, TextView textView) {
        textView.getHitRect(this.f23428cqumvgiudr);
        this.f23429esjtqupxsv.set(this.f23428cqumvgiudr);
        textView.getLineBounds(0, this.f23434lereixgezr);
        RectF rectF2 = this.f23429esjtqupxsv;
        Rect rect = this.f23434lereixgezr;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f23429esjtqupxsv)) {
            return new RadialGradient(rectF.centerX() - this.f23429esjtqupxsv.left, rectF.centerY() - this.f23429esjtqupxsv.top, rectF.width() * 0.5f, this.f23432istkbnxepw, this.f23427cdpycssgdh, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private static float iozdgvuglv(float f13, float f14, float f15) {
        return Math.max(Math.max(f13, f14), f15);
    }

    private TextView yadqdtsiqt(RectF rectF) {
        float f13 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i13 = 0; i13 < this.f23437pmvmpeiblj.size(); i13++) {
            TextView textView2 = (TextView) this.f23437pmvmpeiblj.get(i13);
            if (textView2 != null) {
                textView2.getHitRect(this.f23428cqumvgiudr);
                this.f23429esjtqupxsv.set(this.f23428cqumvgiudr);
                this.f23429esjtqupxsv.union(rectF);
                float fWidth = this.f23429esjtqupxsv.width() * this.f23429esjtqupxsv.height();
                if (fWidth < f13) {
                    textView = textView2;
                    f13 = fWidth;
                }
            }
        }
        return textView;
    }

    private void ylkuphrtab(int i13) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.f23437pmvmpeiblj.size();
        boolean z13 = false;
        for (int i14 = 0; i14 < Math.max(this.f23440ylkuphrtab.length, size); i14++) {
            TextView textView = (TextView) this.f23437pmvmpeiblj.get(i14);
            if (i14 >= this.f23440ylkuphrtab.length) {
                removeView(textView);
                this.f23437pmvmpeiblj.remove(i14);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(da.nufgyqmvbu.material_clockface_textview, (ViewGroup) this, false);
                    this.f23437pmvmpeiblj.put(i14, textView);
                    addView(textView);
                }
                textView.setText(this.f23440ylkuphrtab[i14]);
                textView.setTag(da.gxszxtbevo.material_value_index, Integer.valueOf(i14));
                int i15 = (i14 / 12) + 1;
                textView.setTag(da.gxszxtbevo.material_clock_level, Integer.valueOf(i15));
                if (i15 > 1) {
                    z13 = true;
                }
                jhduphickx.oipsdeybqn(textView, this.f23441zynmafqrjb);
                textView.setTextColor(this.f23430hcddaimhww);
                if (i13 != 0) {
                    textView.setContentDescription(getResources().getString(i13, this.f23440ylkuphrtab[i14]));
                }
            }
        }
        this.f23433iwizpuwonk.zdlpuopuiu(z13);
    }

    private void zynmafqrjb() {
        RectF rectFGxszxtbevo = this.f23433iwizpuwonk.gxszxtbevo();
        TextView textViewYadqdtsiqt = yadqdtsiqt(rectFGxszxtbevo);
        for (int i13 = 0; i13 < this.f23437pmvmpeiblj.size(); i13++) {
            TextView textView = (TextView) this.f23437pmvmpeiblj.get(i13);
            if (textView != null) {
                textView.setSelected(textView == textViewYadqdtsiqt);
                textView.getPaint().setShader(cdpycssgdh(rectFGxszxtbevo, textView));
                textView.invalidate();
            }
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.ppxfxbqfkf
    public void gxszxtbevo(float f13, boolean z13) {
        if (Math.abs(this.f23436pkzmftpjix - f13) > 0.001f) {
            this.f23436pkzmftpjix = f13;
            zynmafqrjb();
        }
    }

    int istkbnxepw() {
        return this.f23433iwizpuwonk.eablkybsjg();
    }

    @Override // com.google.android.material.timepicker.gxszxtbevo
    protected void jyumaefscl() {
        super.jyumaefscl();
        for (int i13 = 0; i13 < this.f23437pmvmpeiblj.size(); i13++) {
            ((TextView) this.f23437pmvmpeiblj.get(i13)).setVisibility(0);
        }
    }

    void lmojexxdyd(int i13) {
        this.f23433iwizpuwonk.rgvfuqvkyq(i13);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        zdlpuopuiu.g(accessibilityNodeInfo).ydmasvzmpa(zdlpuopuiu.eablkybsjg.iobyxmoadg(1, this.f23440ylkuphrtab.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        zynmafqrjb();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i13, int i14) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iIozdgvuglv = (int) (this.f23438wwaezpbzkn / iozdgvuglv(this.f23431iozdgvuglv / displayMetrics.heightPixels, this.f23435lmojexxdyd / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iIozdgvuglv, 1073741824);
        setMeasuredDimension(iIozdgvuglv, iIozdgvuglv);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public void wwaezpbzkn(String[] strArr, int i13) {
        this.f23440ylkuphrtab = strArr;
        ylkuphrtab(i13);
    }

    @Override // com.google.android.material.timepicker.gxszxtbevo
    public void zdlpuopuiu(int i13) {
        if (i13 != kcexrzcfyt()) {
            super.zdlpuopuiu(i13);
            this.f23433iwizpuwonk.ojitshcjhn(kcexrzcfyt());
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f23428cqumvgiudr = new Rect();
        this.f23429esjtqupxsv = new RectF();
        this.f23434lereixgezr = new Rect();
        this.f23437pmvmpeiblj = new SparseArray();
        this.f23427cdpycssgdh = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, da.draadjrbmk.ClockFaceView, i13, da.gtknphoqwx.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListIobyxmoadg = oa.ppxfxbqfkf.iobyxmoadg(context, typedArrayObtainStyledAttributes, da.draadjrbmk.ClockFaceView_clockNumberTextColor);
        this.f23430hcddaimhww = colorStateListIobyxmoadg;
        LayoutInflater.from(context).inflate(da.nufgyqmvbu.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(da.gxszxtbevo.material_clock_hand);
        this.f23433iwizpuwonk = clockHandView;
        this.f23439yadqdtsiqt = resources.getDimensionPixelSize(da.wkgbmnqykc.material_clock_hand_padding);
        int colorForState = colorStateListIobyxmoadg.getColorForState(new int[]{R.attr.state_selected}, colorStateListIobyxmoadg.getDefaultColor());
        this.f23432istkbnxepw = new int[]{colorForState, colorForState, colorStateListIobyxmoadg.getDefaultColor()};
        clockHandView.zoijcleaow(this);
        int defaultColor = nufgyqmvbu.iobyxmoadg.iobyxmoadg(context, da.ppxfxbqfkf.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListIobyxmoadg2 = oa.ppxfxbqfkf.iobyxmoadg(context, typedArrayObtainStyledAttributes, da.draadjrbmk.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateListIobyxmoadg2 != null ? colorStateListIobyxmoadg2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new iobyxmoadg());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f23441zynmafqrjb = new zoijcleaow();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        wwaezpbzkn(strArr, 0);
        this.f23431iozdgvuglv = resources.getDimensionPixelSize(da.wkgbmnqykc.material_time_picker_minimum_screen_height);
        this.f23435lmojexxdyd = resources.getDimensionPixelSize(da.wkgbmnqykc.material_time_picker_minimum_screen_width);
        this.f23438wwaezpbzkn = resources.getDimensionPixelSize(da.wkgbmnqykc.material_clock_size);
    }
}
