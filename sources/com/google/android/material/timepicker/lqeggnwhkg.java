package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import modern.payments.ecomAndroid.data.repository.ThreeDSecureRepositoryImpl;
import w1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
class lqeggnwhkg implements ClockHandView.ppxfxbqfkf, TimePickerView.gxszxtbevo, TimePickerView.eablkybsjg, ClockHandView.zoijcleaow, nufgyqmvbu {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final String[] f23539esjtqupxsv = {"12", "1", "2", "3", "4", ThreeDSecureRepositoryImpl.DEF_MAX_TIMEOUT, "6", "7", "8", "9", "10", "11"};

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final String[] f23540lereixgezr = {"00", "1", "2", "3", "4", ThreeDSecureRepositoryImpl.DEF_MAX_TIMEOUT, "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final String[] f23541pmvmpeiblj = {"00", ThreeDSecureRepositoryImpl.DEF_MAX_TIMEOUT, "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f23542cqumvgiudr = false;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private float f23543iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private float f23544jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final TimeModel f23545yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final TimePickerView f23546zdlpuopuiu;

    class iobyxmoadg extends com.google.android.material.timepicker.iobyxmoadg {
        iobyxmoadg(Context context, int i13) {
            super(context, i13);
        }

        @Override // com.google.android.material.timepicker.iobyxmoadg, v1.iobyxmoadg
        public void lqeggnwhkg(View view, zdlpuopuiu zdlpuopuiuVar) {
            super.lqeggnwhkg(view, zdlpuopuiuVar);
            zdlpuopuiuVar.zfvoamnweg(view.getResources().getString(lqeggnwhkg.this.f23545yggfygwlhe.eablkybsjg(), String.valueOf(lqeggnwhkg.this.f23545yggfygwlhe.gxszxtbevo())));
        }
    }

    class zoijcleaow extends com.google.android.material.timepicker.iobyxmoadg {
        zoijcleaow(Context context, int i13) {
            super(context, i13);
        }

        @Override // com.google.android.material.timepicker.iobyxmoadg, v1.iobyxmoadg
        public void lqeggnwhkg(View view, zdlpuopuiu zdlpuopuiuVar) {
            super.lqeggnwhkg(view, zdlpuopuiuVar);
            zdlpuopuiuVar.zfvoamnweg(view.getResources().getString(da.btonecajqb.material_minute_suffix, String.valueOf(lqeggnwhkg.this.f23545yggfygwlhe.f23491cqumvgiudr)));
        }
    }

    public lqeggnwhkg(TimePickerView timePickerView, TimeModel timeModel) {
        this.f23546zdlpuopuiu = timePickerView;
        this.f23545yggfygwlhe = timeModel;
        btonecajqb();
    }

    private void agtfadlqog() {
        TimePickerView timePickerView = this.f23546zdlpuopuiu;
        TimeModel timeModel = this.f23545yggfygwlhe;
        timePickerView.hcddaimhww(timeModel.f23495lereixgezr, timeModel.gxszxtbevo(), this.f23545yggfygwlhe.f23491cqumvgiudr);
    }

    private int dxjokdxxww() {
        return (this.f23545yggfygwlhe.gxszxtbevo() * 30) % 360;
    }

    private void gtknphoqwx(int i13, int i14) {
        TimeModel timeModel = this.f23545yggfygwlhe;
        if (timeModel.f23491cqumvgiudr == i14 && timeModel.f23493iwizpuwonk == i13) {
            return;
        }
        this.f23546zdlpuopuiu.performHapticFeedback(4);
    }

    private String[] nufgyqmvbu() {
        return this.f23545yggfygwlhe.f23494jyumaefscl == 1 ? f23540lereixgezr : f23539esjtqupxsv;
    }

    private void ojitshcjhn() {
        rgvfuqvkyq(f23539esjtqupxsv, "%d");
        rgvfuqvkyq(f23541pmvmpeiblj, "%02d");
    }

    private void rgvfuqvkyq(String[] strArr, String str) {
        for (int i13 = 0; i13 < strArr.length; i13++) {
            strArr[i13] = TimeModel.ppxfxbqfkf(this.f23546zdlpuopuiu.getResources(), strArr[i13], str);
        }
    }

    private void wflxmlrfwp() {
        TimeModel timeModel = this.f23545yggfygwlhe;
        int i13 = 1;
        if (timeModel.f23492esjtqupxsv == 10 && timeModel.f23494jyumaefscl == 1 && timeModel.f23493iwizpuwonk >= 12) {
            i13 = 2;
        }
        this.f23546zdlpuopuiu.cqumvgiudr(i13);
    }

    public void btonecajqb() {
        if (this.f23545yggfygwlhe.f23494jyumaefscl == 0) {
            this.f23546zdlpuopuiu.ylkuphrtab();
        }
        this.f23546zdlpuopuiu.kcexrzcfyt(this);
        this.f23546zdlpuopuiu.yadqdtsiqt(this);
        this.f23546zdlpuopuiu.cdpycssgdh(this);
        this.f23546zdlpuopuiu.zynmafqrjb(this);
        ojitshcjhn();
        invalidate();
    }

    void draadjrbmk(int i13, boolean z13) {
        boolean z14 = i13 == 12;
        this.f23546zdlpuopuiu.iwizpuwonk(z14);
        this.f23545yggfygwlhe.f23492esjtqupxsv = i13;
        this.f23546zdlpuopuiu.lmojexxdyd(z14 ? f23541pmvmpeiblj : nufgyqmvbu(), z14 ? da.btonecajqb.material_minute_suffix : this.f23545yggfygwlhe.eablkybsjg());
        wflxmlrfwp();
        this.f23546zdlpuopuiu.esjtqupxsv(z14 ? this.f23544jyumaefscl : this.f23543iwizpuwonk, z13);
        this.f23546zdlpuopuiu.jyumaefscl(i13);
        this.f23546zdlpuopuiu.pmvmpeiblj(new iobyxmoadg(this.f23546zdlpuopuiu.getContext(), da.btonecajqb.material_hour_selection));
        this.f23546zdlpuopuiu.lereixgezr(new zoijcleaow(this.f23546zdlpuopuiu.getContext(), da.btonecajqb.material_minute_selection));
    }

    @Override // com.google.android.material.timepicker.TimePickerView.gxszxtbevo
    public void eablkybsjg(int i13) {
        draadjrbmk(i13, true);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.ppxfxbqfkf
    public void gxszxtbevo(float f13, boolean z13) {
        if (this.f23542cqumvgiudr) {
            return;
        }
        TimeModel timeModel = this.f23545yggfygwlhe;
        int i13 = timeModel.f23493iwizpuwonk;
        int i14 = timeModel.f23491cqumvgiudr;
        int iRound = Math.round(f13);
        TimeModel timeModel2 = this.f23545yggfygwlhe;
        if (timeModel2.f23492esjtqupxsv == 12) {
            timeModel2.gtknphoqwx((iRound + 3) / 6);
            this.f23544jyumaefscl = (float) Math.floor(this.f23545yggfygwlhe.f23491cqumvgiudr * 6);
        } else {
            int i15 = (iRound + 15) / 30;
            if (timeModel2.f23494jyumaefscl == 1) {
                i15 %= 12;
                if (this.f23546zdlpuopuiu.zdlpuopuiu() == 2) {
                    i15 += 12;
                }
            }
            this.f23545yggfygwlhe.btonecajqb(i15);
            this.f23543iwizpuwonk = dxjokdxxww();
        }
        if (z13) {
            return;
        }
        agtfadlqog();
        gtknphoqwx(i13, i14);
    }

    @Override // com.google.android.material.timepicker.nufgyqmvbu
    public void invalidate() {
        this.f23543iwizpuwonk = dxjokdxxww();
        TimeModel timeModel = this.f23545yggfygwlhe;
        this.f23544jyumaefscl = timeModel.f23491cqumvgiudr * 6;
        draadjrbmk(timeModel.f23492esjtqupxsv, false);
        agtfadlqog();
    }

    @Override // com.google.android.material.timepicker.nufgyqmvbu
    public void iobyxmoadg() {
        this.f23546zdlpuopuiu.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.zoijcleaow
    public void ppxfxbqfkf(float f13, boolean z13) {
        this.f23542cqumvgiudr = true;
        TimeModel timeModel = this.f23545yggfygwlhe;
        int i13 = timeModel.f23491cqumvgiudr;
        int i14 = timeModel.f23493iwizpuwonk;
        if (timeModel.f23492esjtqupxsv == 10) {
            this.f23546zdlpuopuiu.esjtqupxsv(this.f23543iwizpuwonk, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) androidx.core.content.iobyxmoadg.getSystemService(this.f23546zdlpuopuiu.getContext(), AccessibilityManager.class);
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                draadjrbmk(12, true);
            }
        } else {
            int iRound = Math.round(f13);
            if (!z13) {
                this.f23545yggfygwlhe.gtknphoqwx(((iRound + 15) / 30) * 5);
                this.f23544jyumaefscl = this.f23545yggfygwlhe.f23491cqumvgiudr * 6;
            }
            this.f23546zdlpuopuiu.esjtqupxsv(this.f23544jyumaefscl, z13);
        }
        this.f23542cqumvgiudr = false;
        agtfadlqog();
        gtknphoqwx(i14, i13);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.eablkybsjg
    public void wkgbmnqykc(int i13) {
        this.f23545yggfygwlhe.wflxmlrfwp(i13);
    }

    @Override // com.google.android.material.timepicker.nufgyqmvbu
    public void zoijcleaow() {
        this.f23546zdlpuopuiu.setVisibility(8);
    }
}
