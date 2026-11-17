package ru.myspar.legacy.presentation.view.filter;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import c60.nufgyqmvbu;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.j;
import s40.agtfadlqog;
import s40.eablkybsjg;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final j f90001jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f90002yggfygwlhe;

    public /* synthetic */ wkgbmnqykc(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    private final void eablkybsjg(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, agtfadlqog.FilterButton);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        nufgyqmvbu.draadjrbmk(typedArrayObtainStyledAttributes, new draadjrbmk() { // from class: ru.myspar.legacy.presentation.view.filter.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.gxszxtbevo(this.f90000zdlpuopuiu, (TypedArray) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(wkgbmnqykc wkgbmnqykcVar, TypedArray use) {
        zdlpuopuiu.btonecajqb(use, "$this$use");
        wkgbmnqykcVar.f90001jyumaefscl.f65646wkgbmnqykc.setText(use.getString(agtfadlqog.FilterButton_title));
        if (use.hasValue(agtfadlqog.FilterButton_icon)) {
            wkgbmnqykcVar.setIcon(use.getDrawable(agtfadlqog.FilterButton_icon));
        }
        if (use.hasValue(agtfadlqog.FilterButton_badge_text)) {
            wkgbmnqykcVar.setBadge(use.getString(agtfadlqog.FilterButton_badge_text));
        }
        wkgbmnqykcVar.setChecked(use.getBoolean(agtfadlqog.FilterButton_checked, false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void setBadge(String str) {
        this.f90001jyumaefscl.f65645ppxfxbqfkf.setVisibility(0);
        this.f90001jyumaefscl.f65645ppxfxbqfkf.setText(str);
    }

    public final boolean isChecked() {
        return this.f90002yggfygwlhe;
    }

    public final void setChecked(boolean z13) {
        this.f90002yggfygwlhe = z13;
        ppxfxbqfkf(z13);
    }

    public final void setIcon(Drawable drawable) {
        this.f90001jyumaefscl.f65646wkgbmnqykc.setVisibility(0);
        this.f90001jyumaefscl.f65647zoijcleaow.setImageDrawable(drawable);
    }

    @Override // ru.myspar.legacy.presentation.view.filter.iobyxmoadg
    protected void setIconTint(int i13) {
        this.f90001jyumaefscl.f65647zoijcleaow.setColorFilter(i13, PorterDuff.Mode.MULTIPLY);
    }

    @Override // ru.myspar.legacy.presentation.view.filter.iobyxmoadg
    protected void setTextColor(int i13) {
        this.f90001jyumaefscl.f65646wkgbmnqykc.setTextColor(i13);
    }

    public final void setTitle(String str) {
        this.f90001jyumaefscl.f65646wkgbmnqykc.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        j jVarZoijcleaow = j.zoijcleaow(nufgyqmvbu.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(jVarZoijcleaow, "inflate(...)");
        this.f90001jyumaefscl = jVarZoijcleaow;
        setRadius(getResources().getDimension(eablkybsjg.content_margin_12));
        eablkybsjg(attributeSet);
    }
}
