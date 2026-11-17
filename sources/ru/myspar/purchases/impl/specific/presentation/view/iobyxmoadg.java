package ru.myspar.purchases.impl.specific.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import vy1.gxszxtbevo;
import xf.dxjokdxxww;
import zf.eablkybsjg;
import zf.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg extends ConstraintLayout implements ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f102625yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private dxjokdxxww f102626zdlpuopuiu;

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
        if (this.f102626zdlpuopuiu == null) {
            this.f102626zdlpuopuiu = draadjrbmk();
        }
        return this.f102626zdlpuopuiu;
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    protected void vdvldrhtss() {
        if (this.f102625yggfygwlhe) {
            return;
        }
        this.f102625yggfygwlhe = true;
        ((gxszxtbevo) ojitshcjhn()).eablkybsjg((PurchaseProductView) eablkybsjg.iobyxmoadg(this));
    }
}
