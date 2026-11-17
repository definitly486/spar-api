package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public static class iobyxmoadg extends LinearLayout.LayoutParams {
        public iobyxmoadg(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public iobyxmoadg(int i13, int i14) {
            super(i13, i14);
        }

        public iobyxmoadg(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public iobyxmoadg(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void dxjokdxxww(View view, int i13, int i14, int i15, int i16) {
        view.layout(i13, i14, i15 + i13, i16 + i14);
    }

    private void lqeggnwhkg(int i13, int i14) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i15 = 0; i15 < i13; i15++) {
            View virtualChildAt = getVirtualChildAt(i15);
            if (virtualChildAt.getVisibility() != 8) {
                iobyxmoadg iobyxmoadgVar = (iobyxmoadg) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) iobyxmoadgVar).height == -1) {
                    int i16 = ((LinearLayout.LayoutParams) iobyxmoadgVar).width;
                    ((LinearLayout.LayoutParams) iobyxmoadgVar).width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i14, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) iobyxmoadgVar).width = i16;
                }
            }
        }
    }

    private void nufgyqmvbu(int i13, int i14) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i15 = 0; i15 < i13; i15++) {
            View virtualChildAt = getVirtualChildAt(i15);
            if (virtualChildAt.getVisibility() != 8) {
                iobyxmoadg iobyxmoadgVar = (iobyxmoadg) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) iobyxmoadgVar).width == -1) {
                    int i16 = ((LinearLayout.LayoutParams) iobyxmoadgVar).height;
                    ((LinearLayout.LayoutParams) iobyxmoadgVar).height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, iMakeMeasureSpec, 0, i14, 0);
                    ((LinearLayout.LayoutParams) iobyxmoadgVar).height = i16;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof iobyxmoadg;
    }

    void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i13;
        int virtualChildCount = getVirtualChildCount();
        boolean zZoijcleaow = vipkmwdibw.zoijcleaow(this);
        for (int i14 = 0; i14 < virtualChildCount; i14++) {
            View virtualChildAt = getVirtualChildAt(i14);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i14)) {
                iobyxmoadg iobyxmoadgVar = (iobyxmoadg) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, zZoijcleaow ? virtualChildAt.getRight() + ((LinearLayout.LayoutParams) iobyxmoadgVar).rightMargin : (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) iobyxmoadgVar).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) virtualChildAt2.getLayoutParams();
                if (zZoijcleaow) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) iobyxmoadgVar2).leftMargin;
                    i13 = this.mDividerWidth;
                    right = left - i13;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) iobyxmoadgVar2).rightMargin;
                }
            } else if (zZoijcleaow) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i13 = this.mDividerWidth;
                right = left - i13;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i13 = 0; i13 < virtualChildCount; i13++) {
            View virtualChildAt = getVirtualChildAt(i13);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i13)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((iobyxmoadg) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((iobyxmoadg) virtualChildAt2.getLayoutParams())).bottomMargin);
        }
    }

    void drawHorizontalDivider(Canvas canvas, int i13) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i13, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i13);
        this.mDivider.draw(canvas);
    }

    void drawVerticalDivider(Canvas canvas, int i13) {
        this.mDivider.setBounds(i13, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i13, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i13;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i14 = this.mBaselineAlignedChildIndex;
        if (childCount <= i14) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i14);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i13 = this.mGravity & 112) != 48) {
            if (i13 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i13 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((iobyxmoadg) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    int getChildrenSkipCount(View view, int i13) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    int getLocationOffset(View view) {
        return 0;
    }

    int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    View getVirtualChildAt(int i13) {
        return getChildAt(i13);
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    protected boolean hasDividerBeforeChildAt(int i13) {
        if (i13 == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i13 == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) == 0) {
            return false;
        }
        for (int i14 = i13 - 1; i14 >= 0; i14--) {
            if (getChildAt(i14).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x0100  */
    void layoutHorizontal(int i13, int i14, int i15, int i16) {
        int paddingLeft;
        int i17;
        int i18;
        boolean z13;
        int baseline;
        int i19;
        int i23;
        int measuredHeight;
        boolean zZoijcleaow = vipkmwdibw.zoijcleaow(this);
        int paddingTop = getPaddingTop();
        int i24 = i16 - i14;
        int paddingBottom = i24 - getPaddingBottom();
        int paddingBottom2 = (i24 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i25 = this.mGravity;
        int i26 = i25 & 112;
        boolean z14 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int iZoijcleaow = v1.zdlpuopuiu.zoijcleaow(8388615 & i25, getLayoutDirection());
        boolean z15 = true;
        if (iZoijcleaow != 1) {
            paddingLeft = iZoijcleaow != 5 ? getPaddingLeft() : ((getPaddingLeft() + i15) - i13) - this.mTotalLength;
        } else {
            paddingLeft = getPaddingLeft() + (((i15 - i13) - this.mTotalLength) / 2);
        }
        if (zZoijcleaow) {
            i17 = virtualChildCount - 1;
            i18 = -1;
        } else {
            i17 = 0;
            i18 = 1;
        }
        int childrenSkipCount = 0;
        while (childrenSkipCount < virtualChildCount) {
            int i27 = i17 + (i18 * childrenSkipCount);
            View virtualChildAt = getVirtualChildAt(i27);
            if (virtualChildAt == null) {
                paddingLeft += measureNullChild(i27);
                z13 = z15;
            } else {
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight2 = virtualChildAt.getMeasuredHeight();
                    iobyxmoadg iobyxmoadgVar = (iobyxmoadg) virtualChildAt.getLayoutParams();
                    int i28 = childrenSkipCount;
                    if (z14) {
                        virtualChildCount = virtualChildCount;
                        baseline = ((LinearLayout.LayoutParams) iobyxmoadgVar).height != -1 ? virtualChildAt.getBaseline() : -1;
                        i19 = ((LinearLayout.LayoutParams) iobyxmoadgVar).gravity;
                        if (i19 < 0) {
                            i19 = i26;
                        }
                        i23 = i19 & 112;
                        i26 = i26;
                        if (i23 != 16) {
                            if (i23 != 48) {
                                measuredHeight = ((LinearLayout.LayoutParams) iobyxmoadgVar).topMargin + paddingTop;
                                if (baseline != -1) {
                                    z13 = true;
                                    measuredHeight += iArr[1] - baseline;
                                }
                            } else if (i23 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                measuredHeight = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) iobyxmoadgVar).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight -= iArr2[2] - (virtualChildAt.getMeasuredHeight() - baseline);
                                }
                            }
                            z13 = true;
                        } else {
                            z13 = true;
                            measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((LinearLayout.LayoutParams) iobyxmoadgVar).topMargin) - ((LinearLayout.LayoutParams) iobyxmoadgVar).bottomMargin;
                        }
                        if (hasDividerBeforeChildAt(i27)) {
                            paddingLeft += this.mDividerWidth;
                        }
                        int i29 = ((LinearLayout.LayoutParams) iobyxmoadgVar).leftMargin + paddingLeft;
                        paddingTop = paddingTop;
                        dxjokdxxww(virtualChildAt, i29 + getLocationOffset(virtualChildAt), measuredHeight, measuredWidth, measuredHeight2);
                        int nextLocationOffset = i29 + measuredWidth + ((LinearLayout.LayoutParams) iobyxmoadgVar).rightMargin + getNextLocationOffset(virtualChildAt);
                        childrenSkipCount = i28 + getChildrenSkipCount(virtualChildAt, i27);
                        paddingLeft = nextLocationOffset;
                    } else {
                        virtualChildCount = virtualChildCount;
                    }
                    i19 = ((LinearLayout.LayoutParams) iobyxmoadgVar).gravity;
                    if (i19 < 0) {
                        i19 = i26;
                    }
                    i23 = i19 & 112;
                    i26 = i26;
                    if (i23 != 16) {
                        if (i23 != 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) iobyxmoadgVar).topMargin + paddingTop;
                            if (baseline != -1) {
                                z13 = true;
                                measuredHeight += iArr[1] - baseline;
                            }
                        } else if (i23 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) iobyxmoadgVar).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (virtualChildAt.getMeasuredHeight() - baseline);
                            }
                        }
                        z13 = true;
                    } else {
                        z13 = true;
                        measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((LinearLayout.LayoutParams) iobyxmoadgVar).topMargin) - ((LinearLayout.LayoutParams) iobyxmoadgVar).bottomMargin;
                    }
                    if (hasDividerBeforeChildAt(i27)) {
                        paddingLeft += this.mDividerWidth;
                    }
                    int i210 = ((LinearLayout.LayoutParams) iobyxmoadgVar).leftMargin + paddingLeft;
                    paddingTop = paddingTop;
                    dxjokdxxww(virtualChildAt, i210 + getLocationOffset(virtualChildAt), measuredHeight, measuredWidth, measuredHeight2);
                    int nextLocationOffset2 = i210 + measuredWidth + ((LinearLayout.LayoutParams) iobyxmoadgVar).rightMargin + getNextLocationOffset(virtualChildAt);
                    childrenSkipCount = i28 + getChildrenSkipCount(virtualChildAt, i27);
                    paddingLeft = nextLocationOffset2;
                } else {
                    z13 = true;
                }
                childrenSkipCount++;
                virtualChildCount = virtualChildCount;
                i26 = i26;
                z15 = z13;
                paddingTop = paddingTop;
            }
            childrenSkipCount++;
            virtualChildCount = virtualChildCount;
            i26 = i26;
            z15 = z13;
            paddingTop = paddingTop;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    void layoutVertical(int i13, int i14, int i15, int i16) {
        int paddingTop;
        int i17;
        int i18;
        int i19;
        int i23;
        int paddingLeft = getPaddingLeft();
        int i24 = i15 - i13;
        int paddingRight = i24 - getPaddingRight();
        int paddingRight2 = (i24 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i25 = this.mGravity;
        int i26 = i25 & 112;
        int i27 = i25 & 8388615;
        if (i26 != 16) {
            paddingTop = i26 != 80 ? getPaddingTop() : ((getPaddingTop() + i16) - i14) - this.mTotalLength;
        } else {
            paddingTop = getPaddingTop() + (((i16 - i14) - this.mTotalLength) / 2);
        }
        int childrenSkipCount = 0;
        while (childrenSkipCount < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                paddingTop += measureNullChild(childrenSkipCount);
            } else {
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight = virtualChildAt.getMeasuredHeight();
                    iobyxmoadg iobyxmoadgVar = (iobyxmoadg) virtualChildAt.getLayoutParams();
                    int i28 = ((LinearLayout.LayoutParams) iobyxmoadgVar).gravity;
                    if (i28 < 0) {
                        i28 = i27;
                    }
                    int iZoijcleaow = v1.zdlpuopuiu.zoijcleaow(i28, getLayoutDirection()) & 7;
                    if (iZoijcleaow != 1) {
                        if (iZoijcleaow != 5) {
                            i19 = ((LinearLayout.LayoutParams) iobyxmoadgVar).leftMargin + paddingLeft;
                        } else {
                            i17 = paddingRight - measuredWidth;
                            i18 = ((LinearLayout.LayoutParams) iobyxmoadgVar).rightMargin;
                        }
                        int i29 = i19;
                        if (hasDividerBeforeChildAt(childrenSkipCount)) {
                            paddingTop += this.mDividerHeight;
                        }
                        int i33 = paddingTop + ((LinearLayout.LayoutParams) iobyxmoadgVar).topMargin;
                        dxjokdxxww(virtualChildAt, i29, i33 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                        int nextLocationOffset = i33 + measuredHeight + ((LinearLayout.LayoutParams) iobyxmoadgVar).bottomMargin + getNextLocationOffset(virtualChildAt);
                        childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                        paddingTop = nextLocationOffset;
                        i23 = 1;
                    } else {
                        i17 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) iobyxmoadgVar).leftMargin;
                        i18 = ((LinearLayout.LayoutParams) iobyxmoadgVar).rightMargin;
                    }
                    i19 = i17 - i18;
                    int i210 = i19;
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        paddingTop += this.mDividerHeight;
                    }
                    int i34 = paddingTop + ((LinearLayout.LayoutParams) iobyxmoadgVar).topMargin;
                    dxjokdxxww(virtualChildAt, i210, i34 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                    int nextLocationOffset2 = i34 + measuredHeight + ((LinearLayout.LayoutParams) iobyxmoadgVar).bottomMargin + getNextLocationOffset(virtualChildAt);
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                    paddingTop = nextLocationOffset2;
                    i23 = 1;
                }
                childrenSkipCount += i23;
            }
            i23 = 1;
            childrenSkipCount += i23;
        }
    }

    void measureChildBeforeLayout(View view, int i13, int i14, int i15, int i16, int i17) {
        measureChildWithMargins(view, i14, i15, i16, i17);
    }

    /* JADX WARN: Code duplicated, block: B:200:0x045b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0175  */
    /* JADX WARN: Code duplicated, block: B:67:0x0197  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e0  */
    void measureHorizontal(int i13, int i14) {
        int[] iArr;
        int iCombineMeasuredStates;
        int i15;
        int iMax;
        int i16;
        int i17;
        int baseline;
        int i18;
        int i19;
        byte b13;
        int i23;
        int i24;
        boolean z13;
        boolean z14;
        View view;
        int i25;
        boolean z15;
        int i26;
        int measuredHeight;
        int childrenSkipCount;
        int baseline2;
        int i27;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i13);
        int mode2 = View.MeasureSpec.getMode(i14);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr2 = this.mMaxAscent;
        int[] iArr3 = this.mMaxDescent;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z16 = this.mBaselineAligned;
        boolean z17 = this.mUseLargestChild;
        int i28 = 1073741824;
        boolean z18 = mode == 1073741824;
        int childrenSkipCount2 = 0;
        int iMax2 = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        int iMax5 = 0;
        boolean z19 = false;
        int iCombineMeasuredStates2 = 0;
        boolean z23 = false;
        boolean z24 = true;
        float f13 = 0.0f;
        while (true) {
            iArr = iArr3;
            if (childrenSkipCount2 >= virtualChildCount) {
                break;
            }
            View virtualChildAt = getVirtualChildAt(childrenSkipCount2);
            if (virtualChildAt == null) {
                this.mTotalLength += measureNullChild(childrenSkipCount2);
            } else {
                if (virtualChildAt.getVisibility() == 8) {
                    childrenSkipCount2 += getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
                } else {
                    if (hasDividerBeforeChildAt(childrenSkipCount2)) {
                        this.mTotalLength += this.mDividerWidth;
                    }
                    iobyxmoadg iobyxmoadgVar = (iobyxmoadg) virtualChildAt.getLayoutParams();
                    float f14 = ((LinearLayout.LayoutParams) iobyxmoadgVar).weight;
                    float f15 = f13 + f14;
                    if (mode == i28 && ((LinearLayout.LayoutParams) iobyxmoadgVar).width == 0 && f14 > 0.0f) {
                        if (z18) {
                            this.mTotalLength += ((LinearLayout.LayoutParams) iobyxmoadgVar).leftMargin + ((LinearLayout.LayoutParams) iobyxmoadgVar).rightMargin;
                        } else {
                            int i29 = this.mTotalLength;
                            this.mTotalLength = Math.max(i29, ((LinearLayout.LayoutParams) iobyxmoadgVar).leftMargin + i29 + ((LinearLayout.LayoutParams) iobyxmoadgVar).rightMargin);
                        }
                        if (z16) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            virtualChildAt.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                            i24 = childrenSkipCount2;
                            z13 = z17;
                            z14 = z16;
                            view = virtualChildAt;
                        } else {
                            i24 = childrenSkipCount2;
                            z13 = z17;
                            z14 = z16;
                            view = virtualChildAt;
                            z19 = true;
                            i25 = 1073741824;
                        }
                        if (mode2 == i25 && ((LinearLayout.LayoutParams) iobyxmoadgVar).height == -1) {
                            z15 = true;
                            z23 = true;
                        } else {
                            z15 = false;
                        }
                        i26 = ((LinearLayout.LayoutParams) iobyxmoadgVar).topMargin + ((LinearLayout.LayoutParams) iobyxmoadgVar).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i26;
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, view.getMeasuredState());
                        if (z14 && (baseline2 = view.getBaseline()) != -1) {
                            i27 = ((LinearLayout.LayoutParams) iobyxmoadgVar).gravity;
                            if (i27 < 0) {
                                i27 = this.mGravity;
                            }
                            int i33 = (((i27 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i33] = Math.max(iArr2[i33], baseline2);
                            iArr[i33] = Math.max(iArr[i33], measuredHeight - baseline2);
                        }
                        iMax3 = Math.max(iMax3, measuredHeight);
                        if (z24 || ((LinearLayout.LayoutParams) iobyxmoadgVar).height != -1) {
                            z24 = false;
                        } else {
                            z24 = true;
                        }
                        if (((LinearLayout.LayoutParams) iobyxmoadgVar).weight > 0.0f) {
                            if (!z15) {
                                i26 = measuredHeight;
                            }
                            iMax5 = Math.max(iMax5, i26);
                        } else {
                            int i34 = iMax5;
                            if (!z15) {
                                i26 = measuredHeight;
                            }
                            iMax4 = Math.max(iMax4, i26);
                            iMax5 = i34;
                        }
                        int i35 = i24;
                        childrenSkipCount = getChildrenSkipCount(view, i35) + i35;
                        f13 = f15;
                    } else {
                        if (((LinearLayout.LayoutParams) iobyxmoadgVar).width != 0 || f14 <= 0.0f) {
                            b13 = -2;
                            i23 = Integer.MIN_VALUE;
                        } else {
                            b13 = -2;
                            ((LinearLayout.LayoutParams) iobyxmoadgVar).width = -2;
                            i23 = 0;
                        }
                        i24 = childrenSkipCount2;
                        int i36 = i23;
                        z13 = z17;
                        z14 = z16;
                        measureChildBeforeLayout(virtualChildAt, i24, i13, f15 == 0.0f ? this.mTotalLength : 0, i14, 0);
                        if (i36 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) iobyxmoadgVar).width = i36;
                        }
                        int measuredWidth = virtualChildAt.getMeasuredWidth();
                        if (z18) {
                            view = virtualChildAt;
                            this.mTotalLength += ((LinearLayout.LayoutParams) iobyxmoadgVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) iobyxmoadgVar).rightMargin + getNextLocationOffset(view);
                        } else {
                            view = virtualChildAt;
                            int i37 = this.mTotalLength;
                            this.mTotalLength = Math.max(i37, i37 + measuredWidth + ((LinearLayout.LayoutParams) iobyxmoadgVar).leftMargin + ((LinearLayout.LayoutParams) iobyxmoadgVar).rightMargin + getNextLocationOffset(view));
                        }
                        if (z13) {
                            iMax2 = Math.max(measuredWidth, iMax2);
                        }
                    }
                    i25 = 1073741824;
                    if (mode2 == i25) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    i26 = ((LinearLayout.LayoutParams) iobyxmoadgVar).topMargin + ((LinearLayout.LayoutParams) iobyxmoadgVar).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i26;
                    iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, view.getMeasuredState());
                    if (z14) {
                        i27 = ((LinearLayout.LayoutParams) iobyxmoadgVar).gravity;
                        if (i27 < 0) {
                            i27 = this.mGravity;
                        }
                        int i38 = (((i27 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i38] = Math.max(iArr2[i38], baseline2);
                        iArr[i38] = Math.max(iArr[i38], measuredHeight - baseline2);
                    }
                    iMax3 = Math.max(iMax3, measuredHeight);
                    if (z24) {
                        z24 = false;
                    } else {
                        z24 = false;
                    }
                    if (((LinearLayout.LayoutParams) iobyxmoadgVar).weight > 0.0f) {
                        if (!z15) {
                            i26 = measuredHeight;
                        }
                        iMax5 = Math.max(iMax5, i26);
                    } else {
                        int i39 = iMax5;
                        if (!z15) {
                            i26 = measuredHeight;
                        }
                        iMax4 = Math.max(iMax4, i26);
                        iMax5 = i39;
                    }
                    int i310 = i24;
                    childrenSkipCount = getChildrenSkipCount(view, i310) + i310;
                    f13 = f15;
                }
                int i43 = childrenSkipCount + 1;
                iArr3 = iArr;
                z17 = z13;
                z16 = z14;
                i28 = i25;
                childrenSkipCount2 = i43;
            }
            z13 = z17;
            z14 = z16;
            int i44 = i28;
            childrenSkipCount = childrenSkipCount2;
            i25 = i44;
            int i45 = childrenSkipCount + 1;
            iArr3 = iArr;
            z17 = z13;
            z16 = z14;
            i28 = i25;
            childrenSkipCount2 = i45;
        }
        boolean z25 = z17;
        boolean z26 = z16;
        int i46 = iMax3;
        int i47 = iMax4;
        int i48 = iMax5;
        int i49 = iCombineMeasuredStates2;
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerWidth;
        }
        int i53 = iArr2[1];
        int iMax6 = (i53 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? i46 : Math.max(i46, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i53, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        if (z25 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.mTotalLength = 0;
            int childrenSkipCount3 = 0;
            while (childrenSkipCount3 < virtualChildCount) {
                View virtualChildAt2 = getVirtualChildAt(childrenSkipCount3);
                if (virtualChildAt2 == null) {
                    this.mTotalLength += measureNullChild(childrenSkipCount3);
                } else if (virtualChildAt2.getVisibility() == 8) {
                    childrenSkipCount3 += getChildrenSkipCount(virtualChildAt2, childrenSkipCount3);
                } else {
                    iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) virtualChildAt2.getLayoutParams();
                    if (z18) {
                        this.mTotalLength += ((LinearLayout.LayoutParams) iobyxmoadgVar2).leftMargin + iMax2 + ((LinearLayout.LayoutParams) iobyxmoadgVar2).rightMargin + getNextLocationOffset(virtualChildAt2);
                    } else {
                        int i54 = this.mTotalLength;
                        this.mTotalLength = Math.max(i54, i54 + iMax2 + ((LinearLayout.LayoutParams) iobyxmoadgVar2).leftMargin + ((LinearLayout.LayoutParams) iobyxmoadgVar2).rightMargin + getNextLocationOffset(virtualChildAt2));
                    }
                    childrenSkipCount3++;
                    iMax6 = iMax6;
                }
                childrenSkipCount3++;
                iMax6 = iMax6;
            }
        }
        int iMax7 = iMax6;
        int paddingLeft = this.mTotalLength + getPaddingLeft() + getPaddingRight();
        this.mTotalLength = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i13, 0);
        int i55 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
        if (z19 || (i55 != 0 && f13 > 0.0f)) {
            float f16 = this.mWeightSum;
            if (f16 > 0.0f) {
                f13 = f16;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.mTotalLength = 0;
            int i56 = i47;
            int iMax8 = -1;
            iCombineMeasuredStates = i49;
            int i57 = 0;
            while (i57 < virtualChildCount) {
                View virtualChildAt3 = getVirtualChildAt(i57);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    i16 = i55;
                    virtualChildCount = virtualChildCount;
                } else {
                    iobyxmoadg iobyxmoadgVar3 = (iobyxmoadg) virtualChildAt3.getLayoutParams();
                    float f17 = ((LinearLayout.LayoutParams) iobyxmoadgVar3).weight;
                    if (f17 > 0.0f) {
                        int i58 = (int) ((i55 * f17) / f13);
                        float f18 = f13 - f17;
                        int i59 = i55 - i58;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i14, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) iobyxmoadgVar3).topMargin + ((LinearLayout.LayoutParams) iobyxmoadgVar3).bottomMargin, ((LinearLayout.LayoutParams) iobyxmoadgVar3).height);
                        if (((LinearLayout.LayoutParams) iobyxmoadgVar3).width == 0) {
                            i19 = 1073741824;
                            if (mode == 1073741824) {
                                if (i58 <= 0) {
                                    i58 = 0;
                                }
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i58, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt3.getMeasuredState() & (-16777216));
                            f13 = f18;
                            i16 = i59;
                        } else {
                            i19 = 1073741824;
                        }
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i58;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i19), childMeasureSpec);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt3.getMeasuredState() & (-16777216));
                        f13 = f18;
                        i16 = i59;
                    } else {
                        i16 = i55;
                    }
                    if (z18) {
                        this.mTotalLength += virtualChildAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) iobyxmoadgVar3).leftMargin + ((LinearLayout.LayoutParams) iobyxmoadgVar3).rightMargin + getNextLocationOffset(virtualChildAt3);
                    } else {
                        int i63 = this.mTotalLength;
                        this.mTotalLength = Math.max(i63, virtualChildAt3.getMeasuredWidth() + i63 + ((LinearLayout.LayoutParams) iobyxmoadgVar3).leftMargin + ((LinearLayout.LayoutParams) iobyxmoadgVar3).rightMargin + getNextLocationOffset(virtualChildAt3));
                    }
                    boolean z27 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) iobyxmoadgVar3).height == -1;
                    int i64 = ((LinearLayout.LayoutParams) iobyxmoadgVar3).topMargin + ((LinearLayout.LayoutParams) iobyxmoadgVar3).bottomMargin;
                    int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i64;
                    iMax8 = Math.max(iMax8, measuredHeight2);
                    if (!z27) {
                        i64 = measuredHeight2;
                    }
                    int iMax9 = Math.max(i56, i64);
                    if (z24) {
                        i17 = -1;
                        boolean z28 = ((LinearLayout.LayoutParams) iobyxmoadgVar3).height == -1;
                        if (z26 && (baseline = virtualChildAt3.getBaseline()) != i17) {
                            i18 = ((LinearLayout.LayoutParams) iobyxmoadgVar3).gravity;
                            if (i18 < 0) {
                                i18 = this.mGravity;
                            }
                            int i65 = (((i18 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i65] = Math.max(iArr2[i65], baseline);
                            iArr[i65] = Math.max(iArr[i65], measuredHeight2 - baseline);
                        }
                        z24 = z28;
                        i56 = iMax9;
                        f13 = f13;
                    } else {
                        i17 = -1;
                    }
                    if (z26) {
                        i18 = ((LinearLayout.LayoutParams) iobyxmoadgVar3).gravity;
                        if (i18 < 0) {
                            i18 = this.mGravity;
                        }
                        int i66 = (((i18 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i66] = Math.max(iArr2[i66], baseline);
                        iArr[i66] = Math.max(iArr[i66], measuredHeight2 - baseline);
                    }
                    z24 = z28;
                    i56 = iMax9;
                    f13 = f13;
                }
                i57++;
                i55 = i16;
                virtualChildCount = virtualChildCount;
            }
            i15 = virtualChildCount;
            this.mTotalLength += getPaddingLeft() + getPaddingRight();
            int i67 = iArr2[1];
            iMax7 = (i67 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i67, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
            iMax = i56;
        } else {
            iMax = Math.max(i47, i48);
            if (z25 && mode != 1073741824) {
                for (int i68 = 0; i68 < virtualChildCount; i68++) {
                    View virtualChildAt4 = getVirtualChildAt(i68);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((iobyxmoadg) virtualChildAt4.getLayoutParams())).weight > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i15 = virtualChildCount;
            iCombineMeasuredStates = i49;
        }
        if (z24 || mode2 == 1073741824) {
            iMax = iMax7;
        }
        setMeasuredDimension(iResolveSizeAndState | ((-16777216) & iCombineMeasuredStates), View.resolveSizeAndState(Math.max(iMax + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i14, iCombineMeasuredStates << 16));
        if (z23) {
            lqeggnwhkg(i15, i13);
        }
    }

    int measureNullChild(int i13) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x032f  */
    void measureVertical(int i13, int i14) {
        int i15;
        int iCombineMeasuredStates;
        int iMax;
        int i16;
        int i17;
        int i18;
        boolean z13;
        int i19;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int iMax2;
        int i29;
        View view;
        int iMax3;
        boolean z14;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i13);
        int mode2 = View.MeasureSpec.getMode(i14);
        int i33 = this.mBaselineAlignedChildIndex;
        boolean z15 = this.mUseLargestChild;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int iMax4 = 0;
        int i37 = 0;
        int childrenSkipCount = 0;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = true;
        float f13 = 0.0f;
        while (true) {
            int i38 = 8;
            int i39 = iMax4;
            if (childrenSkipCount >= virtualChildCount) {
                int i43 = i34;
                int i44 = i36;
                int i45 = i37;
                int i46 = mode2;
                int iMax5 = i35;
                int i47 = virtualChildCount;
                if (this.mTotalLength > 0) {
                    i15 = i47;
                    if (hasDividerBeforeChildAt(i15)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                } else {
                    i15 = i47;
                }
                if (z15 && (i46 == Integer.MIN_VALUE || i46 == 0)) {
                    this.mTotalLength = 0;
                    int childrenSkipCount2 = 0;
                    while (childrenSkipCount2 < i15) {
                        View virtualChildAt = getVirtualChildAt(childrenSkipCount2);
                        if (virtualChildAt == null) {
                            this.mTotalLength += measureNullChild(childrenSkipCount2);
                        } else if (virtualChildAt.getVisibility() == i38) {
                            childrenSkipCount2 += getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
                        } else {
                            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) virtualChildAt.getLayoutParams();
                            int i48 = this.mTotalLength;
                            this.mTotalLength = Math.max(i48, i48 + i44 + ((LinearLayout.LayoutParams) iobyxmoadgVar).topMargin + ((LinearLayout.LayoutParams) iobyxmoadgVar).bottomMargin + getNextLocationOffset(virtualChildAt));
                        }
                        childrenSkipCount2++;
                        i38 = 8;
                    }
                }
                int paddingTop = this.mTotalLength + getPaddingTop() + getPaddingBottom();
                this.mTotalLength = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i14, 0);
                int i49 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
                if (z16 || (i49 != 0 && f13 > 0.0f)) {
                    float f14 = this.mWeightSum;
                    if (f14 > 0.0f) {
                        f13 = f14;
                    }
                    this.mTotalLength = 0;
                    int i53 = i49;
                    int i54 = i45;
                    iCombineMeasuredStates = i43;
                    int i55 = 0;
                    while (i55 < i15) {
                        View virtualChildAt2 = getVirtualChildAt(i55);
                        if (virtualChildAt2.getVisibility() == 8) {
                            i16 = i53;
                        } else {
                            iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) virtualChildAt2.getLayoutParams();
                            float f15 = ((LinearLayout.LayoutParams) iobyxmoadgVar2).weight;
                            if (f15 > 0.0f) {
                                int i56 = (int) ((i53 * f15) / f13);
                                float f16 = f13 - f15;
                                i16 = i53 - i56;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i13, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) iobyxmoadgVar2).leftMargin + ((LinearLayout.LayoutParams) iobyxmoadgVar2).rightMargin, ((LinearLayout.LayoutParams) iobyxmoadgVar2).width);
                                if (((LinearLayout.LayoutParams) iobyxmoadgVar2).height == 0) {
                                    i19 = 1073741824;
                                    if (i46 == 1073741824) {
                                        if (i56 <= 0) {
                                            i56 = 0;
                                        }
                                        virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i56, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & (-256));
                                    f13 = f16;
                                } else {
                                    i19 = 1073741824;
                                }
                                int measuredHeight = virtualChildAt2.getMeasuredHeight() + i56;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i19));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & (-256));
                                f13 = f16;
                            } else {
                                i16 = i53;
                            }
                            int i57 = ((LinearLayout.LayoutParams) iobyxmoadgVar2).leftMargin + ((LinearLayout.LayoutParams) iobyxmoadgVar2).rightMargin;
                            int measuredWidth = virtualChildAt2.getMeasuredWidth() + i57;
                            iMax5 = Math.max(iMax5, measuredWidth);
                            float f17 = f13;
                            if (mode != 1073741824) {
                                i17 = iCombineMeasuredStates;
                                i18 = -1;
                                if (((LinearLayout.LayoutParams) iobyxmoadgVar2).width != -1) {
                                }
                                int iMax6 = Math.max(i54, i57);
                                if (z18 || ((LinearLayout.LayoutParams) iobyxmoadgVar2).width != i18) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                int i58 = this.mTotalLength;
                                this.mTotalLength = Math.max(i58, virtualChildAt2.getMeasuredHeight() + i58 + ((LinearLayout.LayoutParams) iobyxmoadgVar2).topMargin + ((LinearLayout.LayoutParams) iobyxmoadgVar2).bottomMargin + getNextLocationOffset(virtualChildAt2));
                                z18 = z13;
                                iCombineMeasuredStates = i17;
                                i54 = iMax6;
                                f13 = f17;
                            } else {
                                i17 = iCombineMeasuredStates;
                                i18 = -1;
                            }
                            i57 = measuredWidth;
                            int iMax7 = Math.max(i54, i57);
                            if (z18) {
                                z13 = false;
                            } else {
                                z13 = false;
                            }
                            int i59 = this.mTotalLength;
                            this.mTotalLength = Math.max(i59, virtualChildAt2.getMeasuredHeight() + i59 + ((LinearLayout.LayoutParams) iobyxmoadgVar2).topMargin + ((LinearLayout.LayoutParams) iobyxmoadgVar2).bottomMargin + getNextLocationOffset(virtualChildAt2));
                            z18 = z13;
                            iCombineMeasuredStates = i17;
                            i54 = iMax7;
                            f13 = f17;
                        }
                        i55++;
                        i53 = i16;
                    }
                    this.mTotalLength += getPaddingTop() + getPaddingBottom();
                    iMax = i54;
                } else {
                    iMax = Math.max(i45, i39);
                    if (z15 && i46 != 1073741824) {
                        for (int i63 = 0; i63 < i15; i63++) {
                            View virtualChildAt3 = getVirtualChildAt(i63);
                            if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((iobyxmoadg) virtualChildAt3.getLayoutParams())).weight > 0.0f) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i44, 1073741824));
                            }
                        }
                    }
                    iCombineMeasuredStates = i43;
                }
                if (z18 || mode == 1073741824) {
                    iMax = iMax5;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i13, iCombineMeasuredStates), iResolveSizeAndState);
                if (z17) {
                    nufgyqmvbu(i15, i14);
                    return;
                }
                return;
            }
            View virtualChildAt4 = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt4 == null) {
                this.mTotalLength += measureNullChild(childrenSkipCount);
                i26 = mode2;
                iMax4 = i39;
                i28 = virtualChildCount;
            } else {
                int i64 = i34;
                if (virtualChildAt4.getVisibility() == 8) {
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt4, childrenSkipCount);
                    iMax4 = i39;
                    i34 = i64;
                    i28 = virtualChildCount;
                    i26 = mode2;
                } else {
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                    iobyxmoadg iobyxmoadgVar3 = (iobyxmoadg) virtualChildAt4.getLayoutParams();
                    float f18 = ((LinearLayout.LayoutParams) iobyxmoadgVar3).weight;
                    float f19 = f13 + f18;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) iobyxmoadgVar3).height == 0 && f18 > 0.0f) {
                        int i65 = this.mTotalLength;
                        this.mTotalLength = Math.max(i65, ((LinearLayout.LayoutParams) iobyxmoadgVar3).topMargin + i65 + ((LinearLayout.LayoutParams) iobyxmoadgVar3).bottomMargin);
                        iMax3 = i36;
                        view = virtualChildAt4;
                        iMax2 = i37;
                        z16 = true;
                        i24 = i64;
                        i25 = i35;
                        i26 = mode2;
                        i27 = i39;
                        i28 = virtualChildCount;
                        i29 = childrenSkipCount;
                    } else {
                        int i66 = i35;
                        if (((LinearLayout.LayoutParams) iobyxmoadgVar3).height != 0 || f18 <= 0.0f) {
                            i23 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) iobyxmoadgVar3).height = -2;
                            i23 = 0;
                        }
                        i24 = i64;
                        int i67 = i23;
                        i25 = i66;
                        int i68 = i36;
                        i26 = mode2;
                        i27 = i39;
                        i28 = virtualChildCount;
                        iMax2 = i37;
                        i29 = childrenSkipCount;
                        measureChildBeforeLayout(virtualChildAt4, childrenSkipCount, i13, 0, i14, f19 == 0.0f ? this.mTotalLength : 0);
                        if (i67 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) iobyxmoadgVar3).height = i67;
                        }
                        int measuredHeight2 = virtualChildAt4.getMeasuredHeight();
                        int i69 = this.mTotalLength;
                        view = virtualChildAt4;
                        this.mTotalLength = Math.max(i69, i69 + measuredHeight2 + ((LinearLayout.LayoutParams) iobyxmoadgVar3).topMargin + ((LinearLayout.LayoutParams) iobyxmoadgVar3).bottomMargin + getNextLocationOffset(view));
                        iMax3 = z15 ? Math.max(measuredHeight2, i68) : i68;
                    }
                    if (i33 >= 0 && i33 == i29 + 1) {
                        this.mBaselineChildTop = this.mTotalLength;
                    }
                    if (i29 < i33 && ((LinearLayout.LayoutParams) iobyxmoadgVar3).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) iobyxmoadgVar3).width != -1) {
                        z14 = false;
                    } else {
                        z14 = true;
                        z17 = true;
                    }
                    int i73 = ((LinearLayout.LayoutParams) iobyxmoadgVar3).leftMargin + ((LinearLayout.LayoutParams) iobyxmoadgVar3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i73;
                    int iMax8 = Math.max(i25, measuredWidth2);
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i24, view.getMeasuredState());
                    z18 = z18 && ((LinearLayout.LayoutParams) iobyxmoadgVar3).width == -1;
                    if (((LinearLayout.LayoutParams) iobyxmoadgVar3).weight > 0.0f) {
                        if (!z14) {
                            i73 = measuredWidth2;
                        }
                        iMax4 = Math.max(i27, i73);
                    } else {
                        if (!z14) {
                            i73 = measuredWidth2;
                        }
                        iMax2 = Math.max(iMax2, i73);
                        iMax4 = i27;
                    }
                    int childrenSkipCount3 = getChildrenSkipCount(view, i29) + i29;
                    i36 = iMax3;
                    i35 = iMax8;
                    f13 = f19;
                    i37 = iMax2;
                    childrenSkipCount = childrenSkipCount3;
                    i34 = iCombineMeasuredStates2;
                }
            }
            childrenSkipCount++;
            virtualChildCount = i28;
            mode2 = i26;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        if (this.mOrientation == 1) {
            layoutVertical(i13, i14, i15, i16);
        } else {
            layoutHorizontal(i13, i14, i15, i16);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        if (this.mOrientation == 1) {
            measureVertical(i13, i14);
        } else {
            measureHorizontal(i13, i14);
        }
    }

    public void setBaselineAligned(boolean z13) {
        this.mBaselineAligned = z13;
    }

    public void setBaselineAlignedChildIndex(int i13) {
        if (i13 >= 0 && i13 < getChildCount()) {
            this.mBaselineAlignedChildIndex = i13;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i13) {
        this.mDividerPadding = i13;
    }

    public void setGravity(int i13) {
        if (this.mGravity != i13) {
            if ((8388615 & i13) == 0) {
                i13 |= 8388611;
            }
            if ((i13 & 112) == 0) {
                i13 |= 48;
            }
            this.mGravity = i13;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i13) {
        int i14 = i13 & 8388615;
        int i15 = this.mGravity;
        if ((8388615 & i15) != i14) {
            this.mGravity = i14 | ((-8388616) & i15);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z13) {
        this.mUseLargestChild = z13;
    }

    public void setOrientation(int i13) {
        if (this.mOrientation != i13) {
            this.mOrientation = i13;
            requestLayout();
        }
    }

    public void setShowDividers(int i13) {
        if (i13 != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i13;
    }

    public void setVerticalGravity(int i13) {
        int i14 = i13 & 112;
        int i15 = this.mGravity;
        if ((i15 & 112) != i14) {
            this.mGravity = i14 | (i15 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f13) {
        this.mWeightSum = Math.max(0.0f, f13);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        mbcevpiqjq mbcevpiqjqVarJyumaefscl = mbcevpiqjq.jyumaefscl(context, attributeSet, lqeggnwhkg.btonecajqb.LinearLayoutCompat, i13, 0);
        jhduphickx.sflfametgt(this, context, lqeggnwhkg.btonecajqb.LinearLayoutCompat, attributeSet, mbcevpiqjqVarJyumaefscl.oxmwwwfdhm(), i13, 0);
        int iGtknphoqwx = mbcevpiqjqVarJyumaefscl.gtknphoqwx(lqeggnwhkg.btonecajqb.LinearLayoutCompat_android_orientation, -1);
        if (iGtknphoqwx >= 0) {
            setOrientation(iGtknphoqwx);
        }
        int iGtknphoqwx2 = mbcevpiqjqVarJyumaefscl.gtknphoqwx(lqeggnwhkg.btonecajqb.LinearLayoutCompat_android_gravity, -1);
        if (iGtknphoqwx2 >= 0) {
            setGravity(iGtknphoqwx2);
        }
        boolean zIobyxmoadg = mbcevpiqjqVarJyumaefscl.iobyxmoadg(lqeggnwhkg.btonecajqb.LinearLayoutCompat_android_baselineAligned, true);
        if (!zIobyxmoadg) {
            setBaselineAligned(zIobyxmoadg);
        }
        this.mWeightSum = mbcevpiqjqVarJyumaefscl.dxjokdxxww(lqeggnwhkg.btonecajqb.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = mbcevpiqjqVarJyumaefscl.gtknphoqwx(lqeggnwhkg.btonecajqb.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = mbcevpiqjqVarJyumaefscl.iobyxmoadg(lqeggnwhkg.btonecajqb.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(mbcevpiqjqVarJyumaefscl.lqeggnwhkg(lqeggnwhkg.btonecajqb.LinearLayoutCompat_divider));
        this.mShowDividers = mbcevpiqjqVarJyumaefscl.gtknphoqwx(lqeggnwhkg.btonecajqb.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = mbcevpiqjqVarJyumaefscl.gxszxtbevo(lqeggnwhkg.btonecajqb.LinearLayoutCompat_dividerPadding, 0);
        mbcevpiqjqVarJyumaefscl.cqumvgiudr();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public iobyxmoadg generateDefaultLayoutParams() {
        int i13 = this.mOrientation;
        if (i13 == 0) {
            return new iobyxmoadg(-2, -2);
        }
        if (i13 == 1) {
            return new iobyxmoadg(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public iobyxmoadg generateLayoutParams(AttributeSet attributeSet) {
        return new iobyxmoadg(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public iobyxmoadg generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof iobyxmoadg) {
            return new iobyxmoadg((ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new iobyxmoadg((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new iobyxmoadg(layoutParams);
    }
}
