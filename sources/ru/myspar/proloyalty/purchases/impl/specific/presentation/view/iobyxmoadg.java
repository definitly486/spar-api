package ru.myspar.proloyalty.purchases.impl.specific.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import bk1.gxszxtbevo;
import xf.dxjokdxxww;
import zf.eablkybsjg;
import zf.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg extends ConstraintLayout implements ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f99909yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private dxjokdxxww f99910zdlpuopuiu;

    iobyxmoadg(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        if (isInEditMode()) {
            return;
        }
        vdvldrhtss();
    }

    protected dxjokdxxww draadjrbmk() {
        return new dxjokdxxww(this, false);
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public final dxjokdxxww oxmwwwfdhm() {
        if (this.f99910zdlpuopuiu == null) {
            this.f99910zdlpuopuiu = draadjrbmk();
        }
        return this.f99910zdlpuopuiu;
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    protected void vdvldrhtss() {
        if (this.f99909yggfygwlhe) {
            return;
        }
        this.f99909yggfygwlhe = true;
        ((gxszxtbevo) ojitshcjhn()).gxszxtbevo((PurchaseProductView) eablkybsjg.iobyxmoadg(this));
    }
}
