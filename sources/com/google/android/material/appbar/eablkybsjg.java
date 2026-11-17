package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
abstract class eablkybsjg extends CoordinatorLayout.ppxfxbqfkf {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f22025jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f22026yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private gxszxtbevo f22027zdlpuopuiu;

    public eablkybsjg() {
        this.f22026yggfygwlhe = 0;
        this.f22025jyumaefscl = 0;
    }

    public boolean hcddaimhww(int i13) {
        gxszxtbevo gxszxtbevoVar = this.f22027zdlpuopuiu;
        if (gxszxtbevoVar != null) {
            return gxszxtbevoVar.gxszxtbevo(i13);
        }
        this.f22026yggfygwlhe = i13;
        return false;
    }

    protected void pkzmftpjix(CoordinatorLayout coordinatorLayout, View view, int i13) {
        coordinatorLayout.ylkuphrtab(view, i13);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean rgvfuqvkyq(CoordinatorLayout coordinatorLayout, View view, int i13) {
        pkzmftpjix(coordinatorLayout, view, i13);
        if (this.f22027zdlpuopuiu == null) {
            this.f22027zdlpuopuiu = new gxszxtbevo(view);
        }
        this.f22027zdlpuopuiu.wkgbmnqykc();
        this.f22027zdlpuopuiu.iobyxmoadg();
        int i14 = this.f22026yggfygwlhe;
        if (i14 != 0) {
            this.f22027zdlpuopuiu.gxszxtbevo(i14);
            this.f22026yggfygwlhe = 0;
        }
        int i15 = this.f22025jyumaefscl;
        if (i15 == 0) {
            return true;
        }
        this.f22027zdlpuopuiu.eablkybsjg(i15);
        this.f22025jyumaefscl = 0;
        return true;
    }

    public int ylkuphrtab() {
        gxszxtbevo gxszxtbevoVar = this.f22027zdlpuopuiu;
        if (gxszxtbevoVar != null) {
            return gxszxtbevoVar.ppxfxbqfkf();
        }
        return 0;
    }

    public eablkybsjg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22026yggfygwlhe = 0;
        this.f22025jyumaefscl = 0;
    }
}
