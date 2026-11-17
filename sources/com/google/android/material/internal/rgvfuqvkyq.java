package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rgvfuqvkyq extends ImageButton {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f23001zdlpuopuiu;

    public rgvfuqvkyq(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f23001zdlpuopuiu = getVisibility();
    }

    public final int getUserSetVisibility() {
        return this.f23001zdlpuopuiu;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i13) {
        zoijcleaow(i13, true);
    }

    public final void zoijcleaow(int i13, boolean z13) {
        super.setVisibility(i13);
        if (z13) {
            this.f23001zdlpuopuiu = i13;
        }
    }
}
