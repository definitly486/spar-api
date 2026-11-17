package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static int btonecajqb(View view) {
        int iPmvmpeiblj = jhduphickx.pmvmpeiblj(view);
        if (iPmvmpeiblj > 0) {
            return iPmvmpeiblj;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return btonecajqb(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    private void dxjokdxxww(View view, int i13, int i14, int i15, int i16) {
        view.layout(i13, i14, i15 + i13, i16 + i14);
    }

    private boolean gtknphoqwx(int i13, int i14) {
        int iCombineMeasuredStates;
        int iBtonecajqb;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == lqeggnwhkg.gxszxtbevo.topPanel) {
                    view = childAt;
                } else if (id2 == lqeggnwhkg.gxszxtbevo.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id2 != lqeggnwhkg.gxszxtbevo.contentPanel && id2 != lqeggnwhkg.gxszxtbevo.customPanel) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        int mode2 = View.MeasureSpec.getMode(i13);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i13, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i13, 0);
            iBtonecajqb = btonecajqb(view2);
            measuredHeight = view2.getMeasuredHeight() - iBtonecajqb;
            paddingTop += iBtonecajqb;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iBtonecajqb = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i13, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i16 = size - paddingTop;
        if (view2 != null) {
            int i17 = paddingTop - iBtonecajqb;
            int iMin = Math.min(i16, measuredHeight);
            if (iMin > 0) {
                i16 -= iMin;
                iBtonecajqb += iMin;
            }
            view2.measure(i13, View.MeasureSpec.makeMeasureSpec(iBtonecajqb, 1073741824));
            paddingTop = i17 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i16 > 0) {
            view3.measure(i13, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i16, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i13, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i14, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        nufgyqmvbu(childCount, i14);
        return true;
    }

    private void nufgyqmvbu(int i13, int i14) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i15 = 0; i15 < i13; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                LinearLayoutCompat.iobyxmoadg iobyxmoadgVar = (LinearLayoutCompat.iobyxmoadg) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) iobyxmoadgVar).width == -1) {
                    int i16 = ((LinearLayout.LayoutParams) iobyxmoadgVar).height;
                    ((LinearLayout.LayoutParams) iobyxmoadgVar).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i14, 0);
                    ((LinearLayout.LayoutParams) iobyxmoadgVar).height = i16;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        int paddingLeft = getPaddingLeft();
        int i23 = i15 - i13;
        int paddingRight = i23 - getPaddingRight();
        int paddingRight2 = (i23 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i24 = gravity & 112;
        int i25 = gravity & 8388615;
        int paddingTop = i24 != 16 ? i24 != 80 ? getPaddingTop() : ((getPaddingTop() + i16) - i14) - measuredHeight : getPaddingTop() + (((i16 - i14) - measuredHeight) / 2);
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt = getChildAt(i26);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayoutCompat.iobyxmoadg iobyxmoadgVar = (LinearLayoutCompat.iobyxmoadg) childAt.getLayoutParams();
                int i27 = ((LinearLayout.LayoutParams) iobyxmoadgVar).gravity;
                if (i27 < 0) {
                    i27 = i25;
                }
                int iZoijcleaow = v1.zdlpuopuiu.zoijcleaow(i27, getLayoutDirection()) & 7;
                if (iZoijcleaow != 1) {
                    if (iZoijcleaow != 5) {
                        i19 = ((LinearLayout.LayoutParams) iobyxmoadgVar).leftMargin + paddingLeft;
                    } else {
                        i17 = paddingRight - measuredWidth;
                        i18 = ((LinearLayout.LayoutParams) iobyxmoadgVar).rightMargin;
                    }
                    if (hasDividerBeforeChildAt(i26)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i28 = paddingTop + ((LinearLayout.LayoutParams) iobyxmoadgVar).topMargin;
                    dxjokdxxww(childAt, i19, i28, measuredWidth, measuredHeight2);
                    paddingTop = i28 + measuredHeight2 + ((LinearLayout.LayoutParams) iobyxmoadgVar).bottomMargin;
                } else {
                    i17 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) iobyxmoadgVar).leftMargin;
                    i18 = ((LinearLayout.LayoutParams) iobyxmoadgVar).rightMargin;
                }
                i19 = i17 - i18;
                if (hasDividerBeforeChildAt(i26)) {
                    paddingTop += intrinsicHeight;
                }
                int i29 = paddingTop + ((LinearLayout.LayoutParams) iobyxmoadgVar).topMargin;
                dxjokdxxww(childAt, i19, i29, measuredWidth, measuredHeight2);
                paddingTop = i29 + measuredHeight2 + ((LinearLayout.LayoutParams) iobyxmoadgVar).bottomMargin;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i13, int i14) {
        if (gtknphoqwx(i13, i14)) {
            return;
        }
        super.onMeasure(i13, i14);
    }
}
