package ru.myspar.legacy.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import ge0.lmojexxdyd;
import xf.dxjokdxxww;
import zf.eablkybsjg;
import zf.ppxfxbqfkf;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg extends LinearLayout implements ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f90004yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private dxjokdxxww f90005zdlpuopuiu;

    iobyxmoadg(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        if (isInEditMode()) {
            return;
        }
        ppxfxbqfkf();
    }

    @Override // zf.ppxfxbqfkf
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public final dxjokdxxww oxmwwwfdhm() {
        if (this.f90005zdlpuopuiu == null) {
            this.f90005zdlpuopuiu = zoijcleaow();
        }
        return this.f90005zdlpuopuiu;
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    protected void ppxfxbqfkf() {
        if (this.f90004yggfygwlhe) {
            return;
        }
        this.f90004yggfygwlhe = true;
        ((lmojexxdyd) ojitshcjhn()).ppxfxbqfkf((ProductPriceView) eablkybsjg.iobyxmoadg(this));
    }

    protected dxjokdxxww zoijcleaow() {
        return new dxjokdxxww(this, false);
    }
}
