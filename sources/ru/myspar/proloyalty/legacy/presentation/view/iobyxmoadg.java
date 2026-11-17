package ru.myspar.proloyalty.legacy.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import bc1.kcexrzcfyt;
import xf.dxjokdxxww;
import zf.eablkybsjg;
import zf.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg extends LinearLayout implements ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f97614yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private dxjokdxxww f97615zdlpuopuiu;

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
        if (this.f97615zdlpuopuiu == null) {
            this.f97615zdlpuopuiu = zoijcleaow();
        }
        return this.f97615zdlpuopuiu;
    }

    @Override // zf.zoijcleaow
    public final Object ojitshcjhn() {
        return oxmwwwfdhm().ojitshcjhn();
    }

    protected void ppxfxbqfkf() {
        if (this.f97614yggfygwlhe) {
            return;
        }
        this.f97614yggfygwlhe = true;
        ((kcexrzcfyt) ojitshcjhn()).iobyxmoadg((ProductPriceView) eablkybsjg.iobyxmoadg(this));
    }

    protected dxjokdxxww zoijcleaow() {
        return new dxjokdxxww(this, false);
    }
}
