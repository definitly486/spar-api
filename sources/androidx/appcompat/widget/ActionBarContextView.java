package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import v1.jhduphickx;
import v1.yfnezrywwk;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private View f2971cdpycssgdh;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private int f2972hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private int f2973hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private View f2974iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private CharSequence f2975istkbnxepw;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private boolean f2976jpowsppfya;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private LinearLayout f2977lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private int f2978pkzmftpjix;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private TextView f2979wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private View f2980yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private TextView f2981ylkuphrtab;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private CharSequence f2982zynmafqrjb;

    class iobyxmoadg implements View.OnClickListener {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.zoijcleaow f2984zdlpuopuiu;

        iobyxmoadg(androidx.appcompat.view.zoijcleaow zoijcleaowVar) {
            this.f2984zdlpuopuiu = zoijcleaowVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f2984zdlpuopuiu.ppxfxbqfkf();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void dxjokdxxww() {
        if (this.f2977lmojexxdyd == null) {
            LayoutInflater.from(getContext()).inflate(lqeggnwhkg.lqeggnwhkg.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2977lmojexxdyd = linearLayout;
            this.f2979wwaezpbzkn = (TextView) linearLayout.findViewById(lqeggnwhkg.gxszxtbevo.action_bar_title);
            this.f2981ylkuphrtab = (TextView) this.f2977lmojexxdyd.findViewById(lqeggnwhkg.gxszxtbevo.action_bar_subtitle);
            if (this.f2978pkzmftpjix != 0) {
                this.f2979wwaezpbzkn.setTextAppearance(getContext(), this.f2978pkzmftpjix);
            }
            if (this.f2972hcddaimhww != 0) {
                this.f2981ylkuphrtab.setTextAppearance(getContext(), this.f2972hcddaimhww);
            }
        }
        this.f2979wwaezpbzkn.setText(this.f2982zynmafqrjb);
        this.f2981ylkuphrtab.setText(this.f2975istkbnxepw);
        boolean zIsEmpty = TextUtils.isEmpty(this.f2982zynmafqrjb);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f2975istkbnxepw);
        this.f2981ylkuphrtab.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f2977lmojexxdyd.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f2977lmojexxdyd.getParent() == null) {
            addView(this.f2977lmojexxdyd);
        }
    }

    public boolean btonecajqb() {
        return this.f2976jpowsppfya;
    }

    public boolean draadjrbmk() {
        ActionMenuPresenter actionMenuPresenter = this.f3314iwizpuwonk;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.hcddaimhww();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.iobyxmoadg
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.iobyxmoadg
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f2975istkbnxepw;
    }

    public CharSequence getTitle() {
        return this.f2982zynmafqrjb;
    }

    public void gtknphoqwx() {
        removeAllViews();
        this.f2974iozdgvuglv = null;
        this.f3315jyumaefscl = null;
        this.f3314iwizpuwonk = null;
        View view = this.f2980yadqdtsiqt;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // androidx.appcompat.widget.iobyxmoadg
    public /* bridge */ /* synthetic */ yfnezrywwk gxszxtbevo(int i13, long j13) {
        return super.gxszxtbevo(i13, j13);
    }

    public void lqeggnwhkg() {
        if (this.f2971cdpycssgdh == null) {
            gtknphoqwx();
        }
    }

    public void nufgyqmvbu(androidx.appcompat.view.zoijcleaow zoijcleaowVar) {
        View view = this.f2971cdpycssgdh;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f2973hkdspvbjdz, (ViewGroup) this, false);
            this.f2971cdpycssgdh = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f2971cdpycssgdh);
        }
        View viewFindViewById = this.f2971cdpycssgdh.findViewById(lqeggnwhkg.gxszxtbevo.action_mode_close_button);
        this.f2980yadqdtsiqt = viewFindViewById;
        viewFindViewById.setOnClickListener(new iobyxmoadg(zoijcleaowVar));
        androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar = (androidx.appcompat.view.menu.eablkybsjg) zoijcleaowVar.eablkybsjg();
        ActionMenuPresenter actionMenuPresenter = this.f3314iwizpuwonk;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.esjtqupxsv();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f3314iwizpuwonk = actionMenuPresenter2;
        actionMenuPresenter2.pkzmftpjix(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eablkybsjgVar.ppxfxbqfkf(this.f3314iwizpuwonk, this.f3318yggfygwlhe);
        ActionMenuView actionMenuView = (ActionMenuView) this.f3314iwizpuwonk.ojitshcjhn(this);
        this.f3315jyumaefscl = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f3315jyumaefscl, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f3314iwizpuwonk;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.zynmafqrjb();
            this.f3314iwizpuwonk.istkbnxepw();
        }
    }

    @Override // androidx.appcompat.widget.iobyxmoadg, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        boolean zZoijcleaow = vipkmwdibw.zoijcleaow(this);
        int paddingRight = zZoijcleaow ? (i15 - i13) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i16 - i14) - getPaddingTop()) - getPaddingBottom();
        View view = this.f2971cdpycssgdh;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2971cdpycssgdh.getLayoutParams();
            int i17 = zZoijcleaow ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i18 = zZoijcleaow ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iWkgbmnqykc = androidx.appcompat.widget.iobyxmoadg.wkgbmnqykc(paddingRight, i17, zZoijcleaow);
            paddingRight = androidx.appcompat.widget.iobyxmoadg.wkgbmnqykc(iWkgbmnqykc + eablkybsjg(this.f2971cdpycssgdh, iWkgbmnqykc, paddingTop, paddingTop2, zZoijcleaow), i18, zZoijcleaow);
        }
        int iEablkybsjg = paddingRight;
        LinearLayout linearLayout = this.f2977lmojexxdyd;
        if (linearLayout != null && this.f2974iozdgvuglv == null && linearLayout.getVisibility() != 8) {
            iEablkybsjg += eablkybsjg(this.f2977lmojexxdyd, iEablkybsjg, paddingTop, paddingTop2, zZoijcleaow);
        }
        int i19 = iEablkybsjg;
        View view2 = this.f2974iozdgvuglv;
        if (view2 != null) {
            eablkybsjg(view2, i19, paddingTop, paddingTop2, zZoijcleaow);
        }
        int paddingLeft = zZoijcleaow ? getPaddingLeft() : (i15 - i13) - getPaddingRight();
        ActionMenuView actionMenuView = this.f3315jyumaefscl;
        if (actionMenuView != null) {
            eablkybsjg(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zZoijcleaow);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        if (View.MeasureSpec.getMode(i13) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i14) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i13);
        int size2 = this.f3312cqumvgiudr;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i14);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f2971cdpycssgdh;
        if (view != null) {
            int iPpxfxbqfkf = ppxfxbqfkf(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2971cdpycssgdh.getLayoutParams();
            paddingLeft = iPpxfxbqfkf - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f3315jyumaefscl;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = ppxfxbqfkf(this.f3315jyumaefscl, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f2977lmojexxdyd;
        if (linearLayout != null && this.f2974iozdgvuglv == null) {
            if (this.f2976jpowsppfya) {
                this.f2977lmojexxdyd.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f2977lmojexxdyd.getMeasuredWidth();
                boolean z13 = measuredWidth <= paddingLeft;
                if (z13) {
                    paddingLeft -= measuredWidth;
                }
                this.f2977lmojexxdyd.setVisibility(z13 ? 0 : 8);
            } else {
                paddingLeft = ppxfxbqfkf(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f2974iozdgvuglv;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = i15 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i15 >= 0) {
                paddingLeft = Math.min(i15, paddingLeft);
            }
            int i17 = layoutParams.height;
            int i18 = i17 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i17 >= 0) {
                iMin = Math.min(i17, iMin);
            }
            this.f2974iozdgvuglv.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i16), View.MeasureSpec.makeMeasureSpec(iMin, i18));
        }
        if (this.f3312cqumvgiudr > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i19 = 0;
        for (int i23 = 0; i23 < childCount; i23++) {
            int measuredHeight = getChildAt(i23).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i19) {
                i19 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i19);
    }

    @Override // androidx.appcompat.widget.iobyxmoadg, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.iobyxmoadg
    public void setContentHeight(int i13) {
        this.f3312cqumvgiudr = i13;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f2974iozdgvuglv;
        if (view2 != null) {
            removeView(view2);
        }
        this.f2974iozdgvuglv = view;
        if (view != null && (linearLayout = this.f2977lmojexxdyd) != null) {
            removeView(linearLayout);
            this.f2977lmojexxdyd = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2975istkbnxepw = charSequence;
        dxjokdxxww();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2982zynmafqrjb = charSequence;
        dxjokdxxww();
        jhduphickx.iyctptxqzt(this, charSequence);
    }

    public void setTitleOptional(boolean z13) {
        if (z13 != this.f2976jpowsppfya) {
            requestLayout();
        }
        this.f2976jpowsppfya = z13;
    }

    @Override // androidx.appcompat.widget.iobyxmoadg, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i13) {
        super.setVisibility(i13);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lqeggnwhkg.iobyxmoadg.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        mbcevpiqjq mbcevpiqjqVarJyumaefscl = mbcevpiqjq.jyumaefscl(context, attributeSet, lqeggnwhkg.btonecajqb.ActionMode, i13, 0);
        setBackground(mbcevpiqjqVarJyumaefscl.lqeggnwhkg(lqeggnwhkg.btonecajqb.ActionMode_background));
        this.f2978pkzmftpjix = mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.ActionMode_titleTextStyle, 0);
        this.f2972hcddaimhww = mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.ActionMode_subtitleTextStyle, 0);
        this.f3312cqumvgiudr = mbcevpiqjqVarJyumaefscl.wflxmlrfwp(lqeggnwhkg.btonecajqb.ActionMode_height, 0);
        this.f2973hkdspvbjdz = mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.ActionMode_closeItemLayout, lqeggnwhkg.lqeggnwhkg.abc_action_mode_close_item_material);
        mbcevpiqjqVarJyumaefscl.cqumvgiudr();
    }
}
