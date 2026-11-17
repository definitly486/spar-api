package ru.myspar.legacy.presentation.view.product;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import ke0.zoijcleaow;
import xf.dxjokdxxww;
import zf.eablkybsjg;
import zf.ppxfxbqfkf;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg extends ConstraintLayout implements ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f90019yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private dxjokdxxww f90020zdlpuopuiu;

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
        if (this.f90020zdlpuopuiu == null) {
            this.f90020zdlpuopuiu = draadjrbmk();
        }
        return this.f90020zdlpuopuiu;
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    protected void vdvldrhtss() {
        if (this.f90019yggfygwlhe) {
            return;
        }
        this.f90019yggfygwlhe = true;
        ((zoijcleaow) ojitshcjhn()).zoijcleaow((RestaurantProductView) eablkybsjg.iobyxmoadg(this));
    }
}
