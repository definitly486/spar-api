package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.draadjrbmk;
import com.google.android.material.internal.wflxmlrfwp;
import da.gtknphoqwx;
import ra.nufgyqmvbu;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    private boolean f22020bfopjjpdmp;

    /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name */
    private Boolean f22021iyctptxqzt;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private boolean f22022oipsdeybqn;

    /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
    private ImageView.ScaleType f22023opjhrmiecq;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private Integer f22024zfvoamnweg;

    /* JADX INFO: renamed from: weqkydbzbr, reason: collision with root package name */
    private static final int f22019weqkydbzbr = gtknphoqwx.Widget_MaterialComponents_Toolbar;

    /* JADX INFO: renamed from: lrnfpwlwnk, reason: collision with root package name */
    private static final ImageView.ScaleType[] f22018lrnfpwlwnk = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, da.zoijcleaow.toolbarStyle);
    }

    private void crxdokpmqz() {
        ImageView imageViewZoijcleaow = wflxmlrfwp.zoijcleaow(this);
        if (imageViewZoijcleaow != null) {
            Boolean bool = this.f22021iyctptxqzt;
            if (bool != null) {
                imageViewZoijcleaow.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f22023opjhrmiecq;
            if (scaleType != null) {
                imageViewZoijcleaow.setScaleType(scaleType);
            }
        }
    }

    private void mbcevpiqjq(Context context) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : com.google.android.material.drawable.wkgbmnqykc.gxszxtbevo(background);
        if (colorStateListValueOf != null) {
            ra.lqeggnwhkg lqeggnwhkgVar = new ra.lqeggnwhkg();
            lqeggnwhkgVar.crxdokpmqz(colorStateListValueOf);
            lqeggnwhkgVar.hkdspvbjdz(context);
            lqeggnwhkgVar.sopmlzcsov(jhduphickx.yggfygwlhe(this));
            jhduphickx.weqkydbzbr(this, lqeggnwhkgVar);
        }
    }

    private void ntlheqmsrt(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i13 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i14 = measuredWidth2 + i13;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i13, 0), Math.max(i14 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i13 += iMax;
            i14 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i14 - i13, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i13, view.getTop(), i14, view.getBottom());
    }

    private Drawable sopmlzcsov(Drawable drawable) {
        if (drawable == null || this.f22024zfvoamnweg == null) {
            return drawable;
        }
        Drawable drawableOxmwwwfdhm = k1.iobyxmoadg.oxmwwwfdhm(drawable.mutate());
        k1.iobyxmoadg.agtfadlqog(drawableOxmwwwfdhm, this.f22024zfvoamnweg.intValue());
        return drawableOxmwwwfdhm;
    }

    private Pair tzroggbefp(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i13 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i13 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i13 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void ulzqkzuiru() {
        if (this.f22022oipsdeybqn || this.f22020bfopjjpdmp) {
            TextView textViewEablkybsjg = wflxmlrfwp.eablkybsjg(this);
            TextView textViewPpxfxbqfkf = wflxmlrfwp.ppxfxbqfkf(this);
            if (textViewEablkybsjg == null && textViewPpxfxbqfkf == null) {
                return;
            }
            Pair pairTzroggbefp = tzroggbefp(textViewEablkybsjg, textViewPpxfxbqfkf);
            if (this.f22022oipsdeybqn && textViewEablkybsjg != null) {
                ntlheqmsrt(textViewEablkybsjg, pairTzroggbefp);
            }
            if (!this.f22020bfopjjpdmp || textViewPpxfxbqfkf == null) {
                return;
            }
            ntlheqmsrt(textViewPpxfxbqfkf, pairTzroggbefp);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void cqumvgiudr(int i13) {
        Menu menu = getMenu();
        boolean z13 = menu instanceof androidx.appcompat.view.menu.eablkybsjg;
        if (z13) {
            ((androidx.appcompat.view.menu.eablkybsjg) menu).jztzpxfvev();
        }
        super.cqumvgiudr(i13);
        if (z13) {
            ((androidx.appcompat.view.menu.eablkybsjg) menu).okpsazkaxt();
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f22023opjhrmiecq;
    }

    public Integer getNavigationIconTint() {
        return this.f22024zfvoamnweg;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        nufgyqmvbu.eablkybsjg(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        ulzqkzuiru();
        crxdokpmqz();
    }

    @Override // android.view.View
    public void setElevation(float f13) {
        super.setElevation(f13);
        nufgyqmvbu.wkgbmnqykc(this, f13);
    }

    public void setLogoAdjustViewBounds(boolean z13) {
        Boolean bool = this.f22021iyctptxqzt;
        if (bool == null || bool.booleanValue() != z13) {
            this.f22021iyctptxqzt = Boolean.valueOf(z13);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f22023opjhrmiecq != scaleType) {
            this.f22023opjhrmiecq = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(sopmlzcsov(drawable));
    }

    public void setNavigationIconTint(int i13) {
        this.f22024zfvoamnweg = Integer.valueOf(i13);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z13) {
        if (this.f22020bfopjjpdmp != z13) {
            this.f22020bfopjjpdmp = z13;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z13) {
        if (this.f22022oipsdeybqn != z13) {
            this.f22022oipsdeybqn = z13;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i13) {
        int i14 = f22019weqkydbzbr;
        super(ta.iobyxmoadg.ppxfxbqfkf(context, attributeSet, i13, i14), attributeSet, i13);
        Context context2 = getContext();
        TypedArray typedArrayDxjokdxxww = draadjrbmk.dxjokdxxww(context2, attributeSet, da.draadjrbmk.MaterialToolbar, i13, i14, new int[0]);
        if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.MaterialToolbar_navigationIconTint)) {
            setNavigationIconTint(typedArrayDxjokdxxww.getColor(da.draadjrbmk.MaterialToolbar_navigationIconTint, -1));
        }
        this.f22022oipsdeybqn = typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.MaterialToolbar_titleCentered, false);
        this.f22020bfopjjpdmp = typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.MaterialToolbar_subtitleCentered, false);
        int i15 = typedArrayDxjokdxxww.getInt(da.draadjrbmk.MaterialToolbar_logoScaleType, -1);
        if (i15 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f22018lrnfpwlwnk;
            if (i15 < scaleTypeArr.length) {
                this.f22023opjhrmiecq = scaleTypeArr[i15];
            }
        }
        if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.MaterialToolbar_logoAdjustViewBounds)) {
            this.f22021iyctptxqzt = Boolean.valueOf(typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.MaterialToolbar_logoAdjustViewBounds, false));
        }
        typedArrayDxjokdxxww.recycle();
        mbcevpiqjq(context2);
    }
}
