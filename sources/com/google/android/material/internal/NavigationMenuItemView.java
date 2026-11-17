package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.jlmebxxoox;
import v1.jhduphickx;
import w1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationMenuItemView extends wkgbmnqykc implements androidx.appcompat.view.menu.gtknphoqwx.iobyxmoadg {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private static final int[] f22873hcddaimhww = {R.attr.state_checked};

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final CheckedTextView f22874cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private androidx.appcompat.view.menu.lqeggnwhkg f22875iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    boolean f22876istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f22877lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private ColorStateList f22878lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final v1.iobyxmoadg f22879pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f22880pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private boolean f22881wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private FrameLayout f22882yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private Drawable f22883ylkuphrtab;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    boolean f22884zynmafqrjb;

    class iobyxmoadg extends v1.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // v1.iobyxmoadg
        public void lqeggnwhkg(View view, zdlpuopuiu zdlpuopuiuVar) {
            super.lqeggnwhkg(view, zdlpuopuiuVar);
            zdlpuopuiuVar.rlfsiqarku(NavigationMenuItemView.this.f22884zynmafqrjb);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void btonecajqb() {
        if (draadjrbmk()) {
            this.f22874cdpycssgdh.setVisibility(8);
            FrameLayout frameLayout = this.f22882yadqdtsiqt;
            if (frameLayout != null) {
                LinearLayoutCompat.iobyxmoadg iobyxmoadgVar = (LinearLayoutCompat.iobyxmoadg) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) iobyxmoadgVar).width = -1;
                this.f22882yadqdtsiqt.setLayoutParams(iobyxmoadgVar);
                return;
            }
            return;
        }
        this.f22874cdpycssgdh.setVisibility(0);
        FrameLayout frameLayout2 = this.f22882yadqdtsiqt;
        if (frameLayout2 != null) {
            LinearLayoutCompat.iobyxmoadg iobyxmoadgVar2 = (LinearLayoutCompat.iobyxmoadg) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) iobyxmoadgVar2).width = -2;
            this.f22882yadqdtsiqt.setLayoutParams(iobyxmoadgVar2);
        }
    }

    private boolean draadjrbmk() {
        return this.f22875iozdgvuglv.getTitle() == null && this.f22875iozdgvuglv.getIcon() == null && this.f22875iozdgvuglv.getActionView() != null;
    }

    private StateListDrawable gtknphoqwx() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(lqeggnwhkg.iobyxmoadg.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f22873hcddaimhww, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f22882yadqdtsiqt == null) {
                this.f22882yadqdtsiqt = (FrameLayout) ((ViewStub) findViewById(da.gxszxtbevo.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f22882yadqdtsiqt.removeAllViews();
            this.f22882yadqdtsiqt.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.gtknphoqwx.iobyxmoadg
    public boolean eablkybsjg() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.gtknphoqwx.iobyxmoadg
    public androidx.appcompat.view.menu.lqeggnwhkg getItemData() {
        return this.f22875iozdgvuglv;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i13) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i13 + 1);
        androidx.appcompat.view.menu.lqeggnwhkg lqeggnwhkgVar = this.f22875iozdgvuglv;
        if (lqeggnwhkgVar != null && lqeggnwhkgVar.isCheckable() && this.f22875iozdgvuglv.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f22873hcddaimhww);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.gtknphoqwx.iobyxmoadg
    public void ppxfxbqfkf(androidx.appcompat.view.menu.lqeggnwhkg lqeggnwhkgVar, int i13) {
        this.f22875iozdgvuglv = lqeggnwhkgVar;
        if (lqeggnwhkgVar.getItemId() > 0) {
            setId(lqeggnwhkgVar.getItemId());
        }
        setVisibility(lqeggnwhkgVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            jhduphickx.weqkydbzbr(this, gtknphoqwx());
        }
        setCheckable(lqeggnwhkgVar.isCheckable());
        setChecked(lqeggnwhkgVar.isChecked());
        setEnabled(lqeggnwhkgVar.isEnabled());
        setTitle(lqeggnwhkgVar.getTitle());
        setIcon(lqeggnwhkgVar.getIcon());
        setActionView(lqeggnwhkgVar.getActionView());
        setContentDescription(lqeggnwhkgVar.getContentDescription());
        jlmebxxoox.iobyxmoadg(this, lqeggnwhkgVar.getTooltipText());
        btonecajqb();
    }

    public void setCheckable(boolean z13) {
        refreshDrawableState();
        if (this.f22884zynmafqrjb != z13) {
            this.f22884zynmafqrjb = z13;
            this.f22879pkzmftpjix.draadjrbmk(this.f22874cdpycssgdh, 2048);
        }
    }

    public void setChecked(boolean z13) {
        refreshDrawableState();
        this.f22874cdpycssgdh.setChecked(z13);
        CheckedTextView checkedTextView = this.f22874cdpycssgdh;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z13 && this.f22876istkbnxepw) ? 1 : 0);
    }

    public void setHorizontalPadding(int i13) {
        setPadding(i13, getPaddingTop(), i13, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f22881wwaezpbzkn) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = k1.iobyxmoadg.oxmwwwfdhm(drawable).mutate();
                k1.iobyxmoadg.ojitshcjhn(drawable, this.f22878lmojexxdyd);
            }
            int i13 = this.f22877lereixgezr;
            drawable.setBounds(0, 0, i13, i13);
        } else if (this.f22880pmvmpeiblj) {
            if (this.f22883ylkuphrtab == null) {
                Drawable drawableGxszxtbevo = i1.nufgyqmvbu.gxszxtbevo(getResources(), da.eablkybsjg.navigation_empty_icon, getContext().getTheme());
                this.f22883ylkuphrtab = drawableGxszxtbevo;
                if (drawableGxszxtbevo != null) {
                    int i14 = this.f22877lereixgezr;
                    drawableGxszxtbevo.setBounds(0, 0, i14, i14);
                }
            }
            drawable = this.f22883ylkuphrtab;
        }
        androidx.core.widget.dxjokdxxww.btonecajqb(this.f22874cdpycssgdh, drawable, null, null, null);
    }

    public void setIconPadding(int i13) {
        this.f22874cdpycssgdh.setCompoundDrawablePadding(i13);
    }

    public void setIconSize(int i13) {
        this.f22877lereixgezr = i13;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f22878lmojexxdyd = colorStateList;
        this.f22881wwaezpbzkn = colorStateList != null;
        androidx.appcompat.view.menu.lqeggnwhkg lqeggnwhkgVar = this.f22875iozdgvuglv;
        if (lqeggnwhkgVar != null) {
            setIcon(lqeggnwhkgVar.getIcon());
        }
    }

    public void setMaxLines(int i13) {
        this.f22874cdpycssgdh.setMaxLines(i13);
    }

    public void setNeedsEmptyIcon(boolean z13) {
        this.f22880pmvmpeiblj = z13;
    }

    public void setTextAppearance(int i13) {
        androidx.core.widget.dxjokdxxww.rgvfuqvkyq(this.f22874cdpycssgdh, i13);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f22874cdpycssgdh.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f22874cdpycssgdh.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f22876istkbnxepw = true;
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        this.f22879pkzmftpjix = iobyxmoadgVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(da.nufgyqmvbu.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(da.wkgbmnqykc.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(da.gxszxtbevo.design_menu_item_text);
        this.f22874cdpycssgdh = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        jhduphickx.oipsdeybqn(checkedTextView, iobyxmoadgVar);
    }
}
