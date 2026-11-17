package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import da.gxszxtbevo;
import da.wkgbmnqykc;
import da.zoijcleaow;
import na.nufgyqmvbu;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f23086iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final TimeInterpolator f23087jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Button f23088yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private TextView f23089zdlpuopuiu;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23087jyumaefscl = nufgyqmvbu.lqeggnwhkg(context, zoijcleaow.motionEasingEmphasizedInterpolator, ea.iobyxmoadg.f31023zoijcleaow);
    }

    private static void iobyxmoadg(View view, int i13, int i14) {
        if (jhduphickx.ntlheqmsrt(view)) {
            jhduphickx.lxfrhoxuzk(view, jhduphickx.yadqdtsiqt(view), i13, jhduphickx.cdpycssgdh(view), i14);
        } else {
            view.setPadding(view.getPaddingLeft(), i13, view.getPaddingRight(), i14);
        }
    }

    private boolean zoijcleaow(int i13, int i14, int i15) {
        boolean z13;
        if (i13 != getOrientation()) {
            setOrientation(i13);
            z13 = true;
        } else {
            z13 = false;
        }
        if (this.f23089zdlpuopuiu.getPaddingTop() == i14 && this.f23089zdlpuopuiu.getPaddingBottom() == i15) {
            return z13;
        }
        iobyxmoadg(this.f23089zdlpuopuiu, i14, i15);
        return true;
    }

    public Button getActionView() {
        return this.f23088yggfygwlhe;
    }

    public TextView getMessageView() {
        return this.f23089zdlpuopuiu;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f23089zdlpuopuiu = (TextView) findViewById(gxszxtbevo.snackbar_text);
        this.f23088yggfygwlhe = (Button) findViewById(gxszxtbevo.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(wkgbmnqykc.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(wkgbmnqykc.design_snackbar_padding_vertical);
        Layout layout = this.f23089zdlpuopuiu.getLayout();
        boolean z13 = layout != null && layout.getLineCount() > 1;
        if (!z13 || this.f23086iwizpuwonk <= 0 || this.f23088yggfygwlhe.getMeasuredWidth() <= this.f23086iwizpuwonk) {
            if (!z13) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!zoijcleaow(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!zoijcleaow(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i13, i14);
    }

    public void setMaxInlineActionWidth(int i13) {
        this.f23086iwizpuwonk = i13;
    }
}
