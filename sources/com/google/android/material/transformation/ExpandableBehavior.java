package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.ppxfxbqfkf {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f23552zdlpuopuiu;

    class iobyxmoadg implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ la.iobyxmoadg f23554jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ int f23555yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ View f23556zdlpuopuiu;

        iobyxmoadg(View view, int i13, la.iobyxmoadg iobyxmoadgVar) {
            this.f23556zdlpuopuiu = view;
            this.f23555yggfygwlhe = i13;
            this.f23554jyumaefscl = iobyxmoadgVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f23556zdlpuopuiu.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f23552zdlpuopuiu == this.f23555yggfygwlhe) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                la.iobyxmoadg iobyxmoadgVar = this.f23554jyumaefscl;
                expandableBehavior.jpowsppfya((View) iobyxmoadgVar, this.f23556zdlpuopuiu, iobyxmoadgVar.iobyxmoadg(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f23552zdlpuopuiu = 0;
    }

    private boolean pkzmftpjix(boolean z13) {
        if (!z13) {
            return this.f23552zdlpuopuiu == 1;
        }
        int i13 = this.f23552zdlpuopuiu;
        return i13 == 0 || i13 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean draadjrbmk(CoordinatorLayout coordinatorLayout, View view, View view2) {
        la.iobyxmoadg iobyxmoadgVar = (la.iobyxmoadg) view2;
        if (!pkzmftpjix(iobyxmoadgVar.iobyxmoadg())) {
            return false;
        }
        this.f23552zdlpuopuiu = iobyxmoadgVar.iobyxmoadg() ? 1 : 2;
        return jpowsppfya((View) iobyxmoadgVar, view, iobyxmoadgVar.iobyxmoadg(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public abstract boolean dxjokdxxww(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    protected la.iobyxmoadg hcddaimhww(CoordinatorLayout coordinatorLayout, View view) {
        List listOxmwwwfdhm = coordinatorLayout.oxmwwwfdhm(view);
        int size = listOxmwwwfdhm.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) listOxmwwwfdhm.get(i13);
            if (dxjokdxxww(coordinatorLayout, view, view2)) {
                return (la.iobyxmoadg) view2;
            }
        }
        return null;
    }

    protected abstract boolean jpowsppfya(View view, View view2, boolean z13, boolean z14);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean rgvfuqvkyq(CoordinatorLayout coordinatorLayout, View view, int i13) {
        la.iobyxmoadg iobyxmoadgVarHcddaimhww;
        if (jhduphickx.tzroggbefp(view) || (iobyxmoadgVarHcddaimhww = hcddaimhww(coordinatorLayout, view)) == null || !pkzmftpjix(iobyxmoadgVarHcddaimhww.iobyxmoadg())) {
            return false;
        }
        int i14 = iobyxmoadgVarHcddaimhww.iobyxmoadg() ? 1 : 2;
        this.f23552zdlpuopuiu = i14;
        view.getViewTreeObserver().addOnPreDrawListener(new iobyxmoadg(view, i14, iobyxmoadgVarHcddaimhww));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23552zdlpuopuiu = 0;
    }
}
