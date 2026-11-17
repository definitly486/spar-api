package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
abstract class gxszxtbevo extends ConstraintLayout {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private ra.lqeggnwhkg f23535jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f23536yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Runnable f23537zdlpuopuiu;

    public gxszxtbevo(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        LayoutInflater.from(context).inflate(da.nufgyqmvbu.material_radial_view_group, this);
        jhduphickx.weqkydbzbr(this, draadjrbmk());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, da.draadjrbmk.RadialViewGroup, i13, 0);
        this.f23536yggfygwlhe = typedArrayObtainStyledAttributes.getDimensionPixelSize(da.draadjrbmk.RadialViewGroup_materialCircleRadius, 0);
        this.f23537zdlpuopuiu = new Runnable() { // from class: com.google.android.material.timepicker.eablkybsjg
            @Override // java.lang.Runnable
            public final void run() {
                this.f23517zdlpuopuiu.jyumaefscl();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    private Drawable draadjrbmk() {
        ra.lqeggnwhkg lqeggnwhkgVar = new ra.lqeggnwhkg();
        this.f23535jyumaefscl = lqeggnwhkgVar;
        lqeggnwhkgVar.ulzqkzuiru(new ra.dxjokdxxww(0.5f));
        this.f23535jyumaefscl.crxdokpmqz(ColorStateList.valueOf(-1));
        return this.f23535jyumaefscl;
    }

    private void iwizpuwonk() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f23537zdlpuopuiu);
            handler.post(this.f23537zdlpuopuiu);
        }
    }

    private void nufgyqmvbu(List list, androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar, int i13) {
        Iterator it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            wkgbmnqykcVar.vdvldrhtss(((View) it.next()).getId(), da.gxszxtbevo.circle_center, i13, size);
            size += 360.0f / list.size();
        }
    }

    private static boolean yggfygwlhe(View view) {
        return "skip".equals(view.getTag());
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i13, layoutParams);
        if (view.getId() == -1) {
            view.setId(jhduphickx.gtknphoqwx());
        }
        iwizpuwonk();
    }

    protected void jyumaefscl() {
        androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar = new androidx.constraintlayout.widget.wkgbmnqykc();
        wkgbmnqykcVar.ojitshcjhn(this);
        HashMap map = new HashMap();
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getId() != da.gxszxtbevo.circle_center && !yggfygwlhe(childAt)) {
                int i14 = (Integer) childAt.getTag(da.gxszxtbevo.material_clock_level);
                if (i14 == null) {
                    i14 = 1;
                }
                if (!map.containsKey(i14)) {
                    map.put(i14, new ArrayList());
                }
                ((List) map.get(i14)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            nufgyqmvbu((List) entry.getValue(), wkgbmnqykcVar, vdvldrhtss(((Integer) entry.getKey()).intValue()));
        }
        wkgbmnqykcVar.dxjokdxxww(this);
    }

    public int kcexrzcfyt() {
        return this.f23536yggfygwlhe;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        jyumaefscl();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        iwizpuwonk();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i13) {
        this.f23535jyumaefscl.crxdokpmqz(ColorStateList.valueOf(i13));
    }

    int vdvldrhtss(int i13) {
        return i13 == 2 ? Math.round(this.f23536yggfygwlhe * 0.66f) : this.f23536yggfygwlhe;
    }

    public void zdlpuopuiu(int i13) {
        this.f23536yggfygwlhe = i13;
        jyumaefscl();
    }
}
