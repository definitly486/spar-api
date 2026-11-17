package ru.myspar.proloyalty.legacy.presentation.view.filter;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import b31.eablkybsjg;
import b31.ojitshcjhn;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.dxjokdxxww;
import tg.draadjrbmk;
import z41.ageimvtcrz;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ageimvtcrz f97611jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f97612yggfygwlhe;

    public /* synthetic */ wkgbmnqykc(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    private final void eablkybsjg(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ojitshcjhn.FilterButton);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        dxjokdxxww.draadjrbmk(typedArrayObtainStyledAttributes, new draadjrbmk() { // from class: ru.myspar.proloyalty.legacy.presentation.view.filter.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return wkgbmnqykc.gxszxtbevo(this.f97610zdlpuopuiu, (TypedArray) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(wkgbmnqykc wkgbmnqykcVar, TypedArray use) {
        zdlpuopuiu.btonecajqb(use, "$this$use");
        wkgbmnqykcVar.f97611jyumaefscl.f127816wkgbmnqykc.setText(use.getString(ojitshcjhn.FilterButton_title));
        if (use.hasValue(ojitshcjhn.FilterButton_icon)) {
            wkgbmnqykcVar.setIcon(use.getDrawable(ojitshcjhn.FilterButton_icon));
        }
        if (use.hasValue(ojitshcjhn.FilterButton_badge_text)) {
            wkgbmnqykcVar.setBadge(use.getString(ojitshcjhn.FilterButton_badge_text));
        }
        wkgbmnqykcVar.setChecked(use.getBoolean(ojitshcjhn.FilterButton_checked, false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void setBadge(String str) {
        this.f97611jyumaefscl.f127815ppxfxbqfkf.setVisibility(0);
        this.f97611jyumaefscl.f127815ppxfxbqfkf.setText(str);
    }

    public final boolean isChecked() {
        return this.f97612yggfygwlhe;
    }

    public final void setChecked(boolean z13) {
        this.f97612yggfygwlhe = z13;
        ppxfxbqfkf(z13);
    }

    public final void setIcon(Drawable drawable) {
        this.f97611jyumaefscl.f127816wkgbmnqykc.setVisibility(0);
        this.f97611jyumaefscl.f127817zoijcleaow.setImageDrawable(drawable);
    }

    @Override // ru.myspar.proloyalty.legacy.presentation.view.filter.iobyxmoadg
    protected void setIconTint(int i13) {
        this.f97611jyumaefscl.f127817zoijcleaow.setColorFilter(i13, PorterDuff.Mode.MULTIPLY);
    }

    @Override // ru.myspar.proloyalty.legacy.presentation.view.filter.iobyxmoadg
    protected void setTextColor(int i13) {
        this.f97611jyumaefscl.f127816wkgbmnqykc.setTextColor(i13);
    }

    public final void setTitle(String str) {
        this.f97611jyumaefscl.f127816wkgbmnqykc.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        ageimvtcrz ageimvtcrzVarZoijcleaow = ageimvtcrz.zoijcleaow(dxjokdxxww.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(ageimvtcrzVarZoijcleaow, "inflate(...)");
        this.f97611jyumaefscl = ageimvtcrzVarZoijcleaow;
        setRadius(getResources().getDimension(eablkybsjg.content_margin_12));
        eablkybsjg(attributeSet);
    }
}
