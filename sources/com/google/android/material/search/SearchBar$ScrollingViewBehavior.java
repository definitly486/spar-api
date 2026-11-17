package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes2.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f23020pmvmpeiblj;

    public SearchBar$ScrollingViewBehavior() {
        this.f23020pmvmpeiblj = false;
    }

    private void jlmebxxoox(AppBarLayout appBarLayout) {
        appBarLayout.setBackgroundColor(0);
        appBarLayout.setTargetElevation(0.0f);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean draadjrbmk(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean zDraadjrbmk = super.draadjrbmk(coordinatorLayout, view, view2);
        if (!this.f23020pmvmpeiblj && (view2 instanceof AppBarLayout)) {
            this.f23020pmvmpeiblj = true;
            jlmebxxoox((AppBarLayout) view2);
        }
        return zDraadjrbmk;
    }

    @Override // com.google.android.material.appbar.wkgbmnqykc
    protected boolean mbcevpiqjq() {
        return true;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23020pmvmpeiblj = false;
    }
}
