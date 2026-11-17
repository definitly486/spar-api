package ru.myspar.proloyalty.legacy.presentation.view.product;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import fc1.zoijcleaow;
import xf.dxjokdxxww;
import zf.eablkybsjg;
import zf.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg extends ConstraintLayout implements ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f97629yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private dxjokdxxww f97630zdlpuopuiu;

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
        if (this.f97630zdlpuopuiu == null) {
            this.f97630zdlpuopuiu = draadjrbmk();
        }
        return this.f97630zdlpuopuiu;
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    protected void vdvldrhtss() {
        if (this.f97629yggfygwlhe) {
            return;
        }
        this.f97629yggfygwlhe = true;
        ((zoijcleaow) ojitshcjhn()).wkgbmnqykc((RestaurantProductView) eablkybsjg.iobyxmoadg(this));
    }
}
