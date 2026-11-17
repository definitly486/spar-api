package com.google.android.material.timepicker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import java.util.Locale;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final MaterialButtonToggleGroup f23498cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final View.OnClickListener f23499esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final ClockFaceView f23500iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ClockHandView f23501jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private eablkybsjg f23502lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private gxszxtbevo f23503pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Chip f23504yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Chip f23505zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private wkgbmnqykc f23506zynmafqrjb;

    interface eablkybsjg {
        void wkgbmnqykc(int i13);
    }

    interface gxszxtbevo {
        void eablkybsjg(int i13);
    }

    class iobyxmoadg implements View.OnClickListener {
        iobyxmoadg() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.f23503pmvmpeiblj != null) {
                TimePickerView.this.f23503pmvmpeiblj.eablkybsjg(((Integer) view.getTag(da.gxszxtbevo.selection_type)).intValue());
            }
        }
    }

    class ppxfxbqfkf implements View.OnTouchListener {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ GestureDetector f23509zdlpuopuiu;

        ppxfxbqfkf(GestureDetector gestureDetector) {
            this.f23509zdlpuopuiu = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f23509zdlpuopuiu.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface wkgbmnqykc {
        void gtknphoqwx();
    }

    class zoijcleaow extends GestureDetector.SimpleOnGestureListener {
        zoijcleaow() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            wkgbmnqykc wkgbmnqykcVar = TimePickerView.this.f23506zynmafqrjb;
            if (wkgbmnqykcVar == null) {
                return false;
            }
            wkgbmnqykcVar.gtknphoqwx();
            return true;
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void iozdgvuglv() {
        this.f23505zdlpuopuiu.setTag(da.gxszxtbevo.selection_type, 12);
        this.f23504yggfygwlhe.setTag(da.gxszxtbevo.selection_type, 10);
        this.f23505zdlpuopuiu.setOnClickListener(this.f23499esjtqupxsv);
        this.f23504yggfygwlhe.setOnClickListener(this.f23499esjtqupxsv);
        this.f23505zdlpuopuiu.setAccessibilityClassName("android.view.View");
        this.f23504yggfygwlhe.setAccessibilityClassName("android.view.View");
    }

    private void pkzmftpjix(Chip chip, boolean z13) {
        chip.setChecked(z13);
        jhduphickx.opjhrmiecq(chip, z13 ? 2 : 0);
    }

    private void wwaezpbzkn() {
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(new GestureDetector(getContext(), new zoijcleaow()));
        this.f23505zdlpuopuiu.setOnTouchListener(ppxfxbqfkfVar);
        this.f23504yggfygwlhe.setOnTouchListener(ppxfxbqfkfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void yggfygwlhe(MaterialButtonToggleGroup materialButtonToggleGroup, int i13, boolean z13) {
        eablkybsjg eablkybsjgVar;
        if (z13 && (eablkybsjgVar = this.f23502lereixgezr) != null) {
            eablkybsjgVar.wkgbmnqykc(i13 == da.gxszxtbevo.material_clock_period_pm_button ? 1 : 0);
        }
    }

    void cdpycssgdh(eablkybsjg eablkybsjgVar) {
        this.f23502lereixgezr = eablkybsjgVar;
    }

    void cqumvgiudr(int i13) {
        this.f23500iwizpuwonk.lmojexxdyd(i13);
    }

    public void esjtqupxsv(float f13, boolean z13) {
        this.f23501jyumaefscl.oxmwwwfdhm(f13, z13);
    }

    public void hcddaimhww(int i13, int i14, int i15) {
        this.f23498cqumvgiudr.eablkybsjg(i13 == 1 ? da.gxszxtbevo.material_clock_period_pm_button : da.gxszxtbevo.material_clock_period_am_button);
        Locale locale = getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(i15));
        String str2 = String.format(locale, "%02d", Integer.valueOf(i14));
        if (!TextUtils.equals(this.f23505zdlpuopuiu.getText(), str)) {
            this.f23505zdlpuopuiu.setText(str);
        }
        if (TextUtils.equals(this.f23504yggfygwlhe.getText(), str2)) {
            return;
        }
        this.f23504yggfygwlhe.setText(str2);
    }

    void istkbnxepw(wkgbmnqykc wkgbmnqykcVar) {
        this.f23506zynmafqrjb = wkgbmnqykcVar;
    }

    public void iwizpuwonk(boolean z13) {
        this.f23501jyumaefscl.agtfadlqog(z13);
    }

    public void jyumaefscl(int i13) {
        pkzmftpjix(this.f23505zdlpuopuiu, i13 == 12);
        pkzmftpjix(this.f23504yggfygwlhe, i13 == 10);
    }

    public void kcexrzcfyt(ClockHandView.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f23501jyumaefscl.zoijcleaow(ppxfxbqfkfVar);
    }

    public void lereixgezr(v1.iobyxmoadg iobyxmoadgVar) {
        jhduphickx.oipsdeybqn(this.f23505zdlpuopuiu, iobyxmoadgVar);
    }

    public void lmojexxdyd(String[] strArr, int i13) {
        this.f23500iwizpuwonk.wwaezpbzkn(strArr, i13);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i13) {
        super.onVisibilityChanged(view, i13);
        if (view == this && i13 == 0) {
            this.f23504yggfygwlhe.sendAccessibilityEvent(8);
        }
    }

    public void pmvmpeiblj(v1.iobyxmoadg iobyxmoadgVar) {
        jhduphickx.oipsdeybqn(this.f23504yggfygwlhe, iobyxmoadgVar);
    }

    void yadqdtsiqt(gxszxtbevo gxszxtbevoVar) {
        this.f23503pmvmpeiblj = gxszxtbevoVar;
    }

    public void ylkuphrtab() {
        this.f23498cqumvgiudr.setVisibility(0);
    }

    int zdlpuopuiu() {
        return this.f23500iwizpuwonk.istkbnxepw();
    }

    public void zynmafqrjb(ClockHandView.zoijcleaow zoijcleaowVar) {
        this.f23501jyumaefscl.yggfygwlhe(zoijcleaowVar);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f23499esjtqupxsv = new iobyxmoadg();
        LayoutInflater.from(context).inflate(da.nufgyqmvbu.material_timepicker, this);
        this.f23500iwizpuwonk = (ClockFaceView) findViewById(da.gxszxtbevo.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(da.gxszxtbevo.material_clock_period_toggle);
        this.f23498cqumvgiudr = materialButtonToggleGroup;
        materialButtonToggleGroup.zoijcleaow(new MaterialButtonToggleGroup.wkgbmnqykc() { // from class: com.google.android.material.timepicker.draadjrbmk
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.wkgbmnqykc
            public final void iobyxmoadg(MaterialButtonToggleGroup materialButtonToggleGroup2, int i14, boolean z13) {
                this.f23512iobyxmoadg.yggfygwlhe(materialButtonToggleGroup2, i14, z13);
            }
        });
        this.f23505zdlpuopuiu = (Chip) findViewById(da.gxszxtbevo.material_minute_tv);
        this.f23504yggfygwlhe = (Chip) findViewById(da.gxszxtbevo.material_hour_tv);
        this.f23501jyumaefscl = (ClockHandView) findViewById(da.gxszxtbevo.material_clock_hand);
        wwaezpbzkn();
        iozdgvuglv();
    }
}
