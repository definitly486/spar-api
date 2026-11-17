package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements androidx.appcompat.view.menu.eablkybsjg.zoijcleaow, androidx.appcompat.view.menu.gtknphoqwx {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f3053cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private ActionMenuPresenter f3054cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private androidx.appcompat.view.menu.btonecajqb.iobyxmoadg f3055esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private int f3056istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f3057iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f3058jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg f3059lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f3060pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    eablkybsjg f3061yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Context f3062yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private androidx.appcompat.view.menu.eablkybsjg f3063zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f3064zynmafqrjb;

    public interface eablkybsjg {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public interface iobyxmoadg {
        boolean iobyxmoadg();

        boolean zoijcleaow();
    }

    public static class ppxfxbqfkf extends LinearLayoutCompat.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public boolean f3065eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        boolean f3066gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public boolean f3067iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public int f3068ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public boolean f3069wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public int f3070zoijcleaow;

        public ppxfxbqfkf(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public ppxfxbqfkf(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
            super((ViewGroup.LayoutParams) ppxfxbqfkfVar);
            this.f3067iobyxmoadg = ppxfxbqfkfVar.f3067iobyxmoadg;
        }

        public ppxfxbqfkf(int i13, int i14) {
            super(i13, i14);
            this.f3067iobyxmoadg = false;
        }
    }

    private class wkgbmnqykc implements androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg {
        wkgbmnqykc() {
        }

        @Override // androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg
        public boolean iobyxmoadg(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar, MenuItem menuItem) {
            eablkybsjg eablkybsjgVar2 = ActionMenuView.this.f3061yadqdtsiqt;
            return eablkybsjgVar2 != null && eablkybsjgVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg
        public void zoijcleaow(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar) {
            androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg iobyxmoadgVar = ActionMenuView.this.f3059lereixgezr;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.zoijcleaow(eablkybsjgVar);
            }
        }
    }

    private static class zoijcleaow implements androidx.appcompat.view.menu.btonecajqb.iobyxmoadg {
        zoijcleaow() {
        }

        @Override // androidx.appcompat.view.menu.btonecajqb.iobyxmoadg
        public void ppxfxbqfkf(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar, boolean z13) {
        }

        @Override // androidx.appcompat.view.menu.btonecajqb.iobyxmoadg
        public boolean wkgbmnqykc(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar) {
            return false;
        }
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    private void yggfygwlhe(int i13, int i14) {
        boolean z13;
        int i15;
        int i16;
        boolean z14;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i13);
        int size2 = View.MeasureSpec.getSize(i14);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i14, paddingTop, -2);
        int i17 = size - paddingLeft;
        int i18 = this.f3056istkbnxepw;
        int i19 = i17 / i18;
        int i23 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i24 = i18 + (i23 / i19);
        int childCount = getChildCount();
        int iMax = 0;
        int i25 = 0;
        boolean z15 = false;
        int i26 = 0;
        int iMax2 = 0;
        int i27 = 0;
        long j13 = 0;
        while (i25 < childCount) {
            View childAt = getChildAt(i25);
            int i28 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z16 = childAt instanceof ActionMenuItemView;
                int i29 = i26 + 1;
                if (z16) {
                    int i33 = this.f3053cdpycssgdh;
                    r14 = 0;
                    childAt.setPadding(i33, 0, i33, 0);
                } else {
                    r14 = 0;
                }
                ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) childAt.getLayoutParams();
                ppxfxbqfkfVar.f3066gxszxtbevo = r14;
                ppxfxbqfkfVar.f3068ppxfxbqfkf = r14;
                ppxfxbqfkfVar.f3070zoijcleaow = r14;
                ppxfxbqfkfVar.f3069wkgbmnqykc = r14;
                ((LinearLayout.LayoutParams) ppxfxbqfkfVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) ppxfxbqfkfVar).rightMargin = r14;
                ppxfxbqfkfVar.f3065eablkybsjg = z16 && ((ActionMenuItemView) childAt).kcexrzcfyt();
                int iZdlpuopuiu = zdlpuopuiu(childAt, i24, ppxfxbqfkfVar.f3067iobyxmoadg ? 1 : i19, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iZdlpuopuiu);
                if (ppxfxbqfkfVar.f3069wkgbmnqykc) {
                    i27++;
                }
                if (ppxfxbqfkfVar.f3067iobyxmoadg) {
                    z15 = true;
                }
                i19 -= iZdlpuopuiu;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iZdlpuopuiu == 1) {
                    j13 |= (long) (1 << i25);
                    iMax = iMax;
                }
                i26 = i29;
            }
            i25++;
            size2 = i28;
        }
        int i34 = size2;
        boolean z17 = z15 && i26 == 2;
        boolean z18 = false;
        while (true) {
            if (i27 <= 0 || i19 <= 0) {
                z13 = z18;
                i15 = iMax;
                break;
            }
            int i35 = Integer.MAX_VALUE;
            int i36 = 0;
            int i37 = 0;
            long j14 = 0;
            while (i37 < childCount) {
                boolean z19 = z18;
                ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) getChildAt(i37).getLayoutParams();
                int i38 = iMax;
                if (ppxfxbqfkfVar2.f3069wkgbmnqykc) {
                    int i39 = ppxfxbqfkfVar2.f3070zoijcleaow;
                    if (i39 < i35) {
                        j14 = 1 << i37;
                        i35 = i39;
                        i36 = 1;
                    } else if (i39 == i35) {
                        i36++;
                        j14 |= 1 << i37;
                    }
                }
                i37++;
                iMax = i38;
                z18 = z19;
            }
            z13 = z18;
            i15 = iMax;
            j13 |= j14;
            if (i36 > i19) {
                break;
            }
            int i43 = i35 + 1;
            int i44 = 0;
            while (i44 < childCount) {
                View childAt2 = getChildAt(i44);
                ppxfxbqfkf ppxfxbqfkfVar3 = (ppxfxbqfkf) childAt2.getLayoutParams();
                int i45 = i17;
                int i46 = mode;
                long j15 = 1 << i44;
                if ((j14 & j15) == 0) {
                    if (ppxfxbqfkfVar3.f3070zoijcleaow == i43) {
                        j13 |= j15;
                    }
                    z17 = z17;
                } else {
                    if (z17 && ppxfxbqfkfVar3.f3065eablkybsjg && i19 == 1) {
                        int i47 = this.f3053cdpycssgdh;
                        childAt2.setPadding(i47 + i24, 0, i47, 0);
                    }
                    ppxfxbqfkfVar3.f3070zoijcleaow++;
                    ppxfxbqfkfVar3.f3066gxszxtbevo = true;
                    i19--;
                }
                i44++;
                mode = i46;
                i17 = i45;
                z17 = z17;
            }
            iMax = i15;
            z18 = true;
        }
        boolean z23 = !z15 && i26 == 1;
        if (i19 <= 0 || j13 == 0 || (i19 >= i26 - 1 && !z23 && iMax2 <= 1)) {
            i16 = 0;
            z14 = z13;
        } else {
            float fBitCount = Long.bitCount(j13);
            if (z23) {
                i16 = 0;
            } else {
                i16 = 0;
                if ((j13 & 1) != 0 && !((ppxfxbqfkf) getChildAt(0).getLayoutParams()).f3065eablkybsjg) {
                    fBitCount -= 0.5f;
                }
                int i48 = childCount - 1;
                if ((j13 & ((long) (1 << i48))) != 0 && !((ppxfxbqfkf) getChildAt(i48).getLayoutParams()).f3065eablkybsjg) {
                    fBitCount -= 0.5f;
                }
            }
            int i49 = fBitCount > 0.0f ? (int) ((i19 * i24) / fBitCount) : i16;
            z14 = z13;
            for (int i53 = i16; i53 < childCount; i53++) {
                if ((j13 & ((long) (1 << i53))) != 0) {
                    View childAt3 = getChildAt(i53);
                    ppxfxbqfkf ppxfxbqfkfVar4 = (ppxfxbqfkf) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        ppxfxbqfkfVar4.f3068ppxfxbqfkf = i49;
                        ppxfxbqfkfVar4.f3066gxszxtbevo = true;
                        if (i53 == 0 && !ppxfxbqfkfVar4.f3065eablkybsjg) {
                            ((LinearLayout.LayoutParams) ppxfxbqfkfVar4).leftMargin = (-i49) / 2;
                        }
                        z14 = true;
                    } else if (ppxfxbqfkfVar4.f3067iobyxmoadg) {
                        ppxfxbqfkfVar4.f3068ppxfxbqfkf = i49;
                        ppxfxbqfkfVar4.f3066gxszxtbevo = true;
                        ((LinearLayout.LayoutParams) ppxfxbqfkfVar4).rightMargin = (-i49) / 2;
                        z14 = true;
                    } else {
                        if (i53 != 0) {
                            ((LinearLayout.LayoutParams) ppxfxbqfkfVar4).leftMargin = i49 / 2;
                        }
                        if (i53 != childCount - 1) {
                            ((LinearLayout.LayoutParams) ppxfxbqfkfVar4).rightMargin = i49 / 2;
                        }
                    }
                }
            }
        }
        if (z14) {
            for (int i54 = i16; i54 < childCount; i54++) {
                View childAt4 = getChildAt(i54);
                ppxfxbqfkf ppxfxbqfkfVar5 = (ppxfxbqfkf) childAt4.getLayoutParams();
                if (ppxfxbqfkfVar5.f3066gxszxtbevo) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((ppxfxbqfkfVar5.f3070zoijcleaow * i24) + ppxfxbqfkfVar5.f3068ppxfxbqfkf, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i17, mode != 1073741824 ? i15 : i34);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    static int zdlpuopuiu(View view, int i13, int i14, int i15, int i16) {
        int i17;
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i15) - i16, View.MeasureSpec.getMode(i15));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z13 = false;
        boolean z14 = actionMenuItemView != null && actionMenuItemView.kcexrzcfyt();
        if (i14 > 0) {
            i17 = 2;
            if (!z14 || i14 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i14 * i13, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i18 = measuredWidth / i13;
                if (measuredWidth % i13 != 0) {
                    i18++;
                }
                if (!z14 || i18 >= 2) {
                    i17 = i18;
                }
            } else {
                i17 = 0;
            }
        } else {
            i17 = 0;
        }
        if (!ppxfxbqfkfVar.f3067iobyxmoadg && z14) {
            z13 = true;
        }
        ppxfxbqfkfVar.f3069wkgbmnqykc = z13;
        ppxfxbqfkfVar.f3070zoijcleaow = i17;
        view.measure(View.MeasureSpec.makeMeasureSpec(i13 * i17, 1073741824), iMakeMeasureSpec);
        return i17;
    }

    public ppxfxbqfkf agtfadlqog() {
        ppxfxbqfkf ppxfxbqfkfVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        ppxfxbqfkfVarGenerateDefaultLayoutParams.f3067iobyxmoadg = true;
        return ppxfxbqfkfVarGenerateDefaultLayoutParams;
    }

    public void btonecajqb() {
        ActionMenuPresenter actionMenuPresenter = this.f3054cqumvgiudr;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.esjtqupxsv();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ppxfxbqfkf;
    }

    public boolean cqumvgiudr() {
        ActionMenuPresenter actionMenuPresenter = this.f3054cqumvgiudr;
        return actionMenuPresenter != null && actionMenuPresenter.hcddaimhww();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf generateLayoutParams(AttributeSet attributeSet) {
        return new ppxfxbqfkf(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f3063zdlpuopuiu == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar = new androidx.appcompat.view.menu.eablkybsjg(context);
            this.f3063zdlpuopuiu = eablkybsjgVar;
            eablkybsjgVar.tzroggbefp(new wkgbmnqykc());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f3054cqumvgiudr = actionMenuPresenter;
            actionMenuPresenter.pkzmftpjix(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f3054cqumvgiudr;
            androidx.appcompat.view.menu.btonecajqb.iobyxmoadg zoijcleaowVar = this.f3055esjtqupxsv;
            if (zoijcleaowVar == null) {
                zoijcleaowVar = new zoijcleaow();
            }
            actionMenuPresenter2.eablkybsjg(zoijcleaowVar);
            this.f3063zdlpuopuiu.ppxfxbqfkf(this.f3054cqumvgiudr, this.f3062yggfygwlhe);
            this.f3054cqumvgiudr.wwaezpbzkn(this);
        }
        return this.f3063zdlpuopuiu;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f3054cqumvgiudr.pmvmpeiblj();
    }

    public int getPopupTheme() {
        return this.f3058jyumaefscl;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf generateDefaultLayoutParams() {
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(-2, -2);
        ((LinearLayout.LayoutParams) ppxfxbqfkfVar).gravity = 16;
        return ppxfxbqfkfVar;
    }

    @Override // androidx.appcompat.view.menu.gtknphoqwx
    public void iobyxmoadg(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar) {
        this.f3063zdlpuopuiu = eablkybsjgVar;
    }

    public void iwizpuwonk(androidx.appcompat.view.menu.btonecajqb.iobyxmoadg iobyxmoadgVar, androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg iobyxmoadgVar2) {
        this.f3055esjtqupxsv = iobyxmoadgVar;
        this.f3059lereixgezr = iobyxmoadgVar2;
    }

    public androidx.appcompat.view.menu.eablkybsjg jyumaefscl() {
        return this.f3063zdlpuopuiu;
    }

    public boolean kcexrzcfyt() {
        return this.f3057iwizpuwonk;
    }

    protected boolean ojitshcjhn(int i13) {
        boolean zIobyxmoadg = false;
        if (i13 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i13 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i13);
        if (i13 < getChildCount() && (childAt instanceof iobyxmoadg)) {
            zIobyxmoadg = ((iobyxmoadg) childAt).iobyxmoadg();
        }
        return (i13 <= 0 || !(childAt2 instanceof iobyxmoadg)) ? zIobyxmoadg : zIobyxmoadg | ((iobyxmoadg) childAt2).zoijcleaow();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f3054cqumvgiudr;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.lqeggnwhkg(false);
            if (this.f3054cqumvgiudr.yadqdtsiqt()) {
                this.f3054cqumvgiudr.zynmafqrjb();
                this.f3054cqumvgiudr.hcddaimhww();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        btonecajqb();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int width;
        int paddingLeft;
        if (!this.f3060pmvmpeiblj) {
            super.onLayout(z13, i13, i14, i15, i16);
            return;
        }
        int childCount = getChildCount();
        int i17 = (i16 - i14) / 2;
        int dividerWidth = getDividerWidth();
        int i18 = i15 - i13;
        int paddingRight = (i18 - getPaddingRight()) - getPaddingLeft();
        boolean zZoijcleaow = vipkmwdibw.zoijcleaow(this);
        int i19 = 0;
        int i23 = 0;
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt = getChildAt(i24);
            if (childAt.getVisibility() != 8) {
                ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) childAt.getLayoutParams();
                if (ppxfxbqfkfVar.f3067iobyxmoadg) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (ojitshcjhn(i24)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zZoijcleaow) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) ppxfxbqfkfVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) ppxfxbqfkfVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i25 = i17 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i25, width, measuredHeight + i25);
                    paddingRight -= measuredWidth;
                    i19 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) ppxfxbqfkfVar).leftMargin) + ((LinearLayout.LayoutParams) ppxfxbqfkfVar).rightMargin;
                    ojitshcjhn(i24);
                    i23++;
                }
            }
        }
        if (childCount == 1 && i19 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i26 = (i18 / 2) - (measuredWidth2 / 2);
            int i27 = i17 - (measuredHeight2 / 2);
            childAt2.layout(i26, i27, measuredWidth2 + i26, measuredHeight2 + i27);
            return;
        }
        int i28 = i23 - (i19 ^ 1);
        int iMax = Math.max(0, i28 > 0 ? paddingRight / i28 : 0);
        if (zZoijcleaow) {
            int width2 = getWidth() - getPaddingRight();
            for (int i29 = 0; i29 < childCount; i29++) {
                View childAt3 = getChildAt(i29);
                ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !ppxfxbqfkfVar2.f3067iobyxmoadg) {
                    int i33 = width2 - ((LinearLayout.LayoutParams) ppxfxbqfkfVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i34 = i17 - (measuredHeight3 / 2);
                    childAt3.layout(i33 - measuredWidth3, i34, i33, measuredHeight3 + i34);
                    width2 = i33 - ((measuredWidth3 + ((LinearLayout.LayoutParams) ppxfxbqfkfVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i35 = 0; i35 < childCount; i35++) {
            View childAt4 = getChildAt(i35);
            ppxfxbqfkf ppxfxbqfkfVar3 = (ppxfxbqfkf) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !ppxfxbqfkfVar3.f3067iobyxmoadg) {
                int i36 = paddingLeft2 + ((LinearLayout.LayoutParams) ppxfxbqfkfVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i37 = i17 - (measuredHeight4 / 2);
                childAt4.layout(i36, i37, i36 + measuredWidth4, measuredHeight4 + i37);
                paddingLeft2 = i36 + measuredWidth4 + ((LinearLayout.LayoutParams) ppxfxbqfkfVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i13, int i14) {
        androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar;
        boolean z13 = this.f3060pmvmpeiblj;
        boolean z14 = View.MeasureSpec.getMode(i13) == 1073741824;
        this.f3060pmvmpeiblj = z14;
        if (z13 != z14) {
            this.f3064zynmafqrjb = 0;
        }
        int size = View.MeasureSpec.getSize(i13);
        if (this.f3060pmvmpeiblj && (eablkybsjgVar = this.f3063zdlpuopuiu) != null && size != this.f3064zynmafqrjb) {
            this.f3064zynmafqrjb = size;
            eablkybsjgVar.jpowsppfya(true);
        }
        int childCount = getChildCount();
        if (this.f3060pmvmpeiblj && childCount > 0) {
            yggfygwlhe(i13, i14);
            return;
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) getChildAt(i15).getLayoutParams();
            ((LinearLayout.LayoutParams) ppxfxbqfkfVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) ppxfxbqfkfVar).leftMargin = 0;
        }
        super.onMeasure(i13, i14);
    }

    public boolean oxmwwwfdhm() {
        ActionMenuPresenter actionMenuPresenter = this.f3054cqumvgiudr;
        return actionMenuPresenter != null && actionMenuPresenter.yadqdtsiqt();
    }

    public boolean rgvfuqvkyq() {
        ActionMenuPresenter actionMenuPresenter = this.f3054cqumvgiudr;
        return actionMenuPresenter != null && actionMenuPresenter.zynmafqrjb();
    }

    public void setExpandedActionViewsExclusive(boolean z13) {
        this.f3054cqumvgiudr.lmojexxdyd(z13);
    }

    public void setOnMenuItemClickListener(eablkybsjg eablkybsjgVar) {
        this.f3061yadqdtsiqt = eablkybsjgVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f3054cqumvgiudr.ylkuphrtab(drawable);
    }

    public void setOverflowReserved(boolean z13) {
        this.f3057iwizpuwonk = z13;
    }

    public void setPopupTheme(int i13) {
        if (this.f3058jyumaefscl != i13) {
            this.f3058jyumaefscl = i13;
            if (i13 == 0) {
                this.f3062yggfygwlhe = getContext();
            } else {
                this.f3062yggfygwlhe = new ContextThemeWrapper(getContext(), i13);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f3054cqumvgiudr = actionMenuPresenter;
        actionMenuPresenter.wwaezpbzkn(this);
    }

    public boolean vdvldrhtss() {
        ActionMenuPresenter actionMenuPresenter = this.f3054cqumvgiudr;
        return actionMenuPresenter != null && actionMenuPresenter.cdpycssgdh();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        ppxfxbqfkf ppxfxbqfkfVar = layoutParams instanceof ppxfxbqfkf ? new ppxfxbqfkf((ppxfxbqfkf) layoutParams) : new ppxfxbqfkf(layoutParams);
        if (((LinearLayout.LayoutParams) ppxfxbqfkfVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) ppxfxbqfkfVar).gravity = 16;
        }
        return ppxfxbqfkfVar;
    }

    @Override // androidx.appcompat.view.menu.eablkybsjg.zoijcleaow
    public boolean wkgbmnqykc(androidx.appcompat.view.menu.lqeggnwhkg lqeggnwhkgVar) {
        return this.f3063zdlpuopuiu.hkdspvbjdz(lqeggnwhkgVar, 0);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f13 = context.getResources().getDisplayMetrics().density;
        this.f3056istkbnxepw = (int) (56.0f * f13);
        this.f3053cdpycssgdh = (int) (f13 * 4.0f);
        this.f3062yggfygwlhe = context;
        this.f3058jyumaefscl = 0;
    }
}
