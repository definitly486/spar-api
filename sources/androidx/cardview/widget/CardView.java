package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {R.attr.colorBackground};
    private static final ppxfxbqfkf IMPL;
    private final zoijcleaow mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Drawable f4211iobyxmoadg;

        iobyxmoadg() {
        }

        @Override // androidx.cardview.widget.zoijcleaow
        public boolean eablkybsjg() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.zoijcleaow
        public View gxszxtbevo() {
            return CardView.this;
        }

        @Override // androidx.cardview.widget.zoijcleaow
        public void iobyxmoadg(int i13, int i14, int i15, int i16) {
            CardView.this.mShadowBounds.set(i13, i14, i15, i16);
            CardView cardView = CardView.this;
            Rect rect = cardView.mContentPadding;
            CardView.super.setPadding(i13 + rect.left, i14 + rect.top, i15 + rect.right, i16 + rect.bottom);
        }

        @Override // androidx.cardview.widget.zoijcleaow
        public boolean ppxfxbqfkf() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.zoijcleaow
        public Drawable wkgbmnqykc() {
            return this.f4211iobyxmoadg;
        }

        @Override // androidx.cardview.widget.zoijcleaow
        public void zoijcleaow(Drawable drawable) {
            this.f4211iobyxmoadg = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }
    }

    static {
        androidx.cardview.widget.iobyxmoadg iobyxmoadgVar = new androidx.cardview.widget.iobyxmoadg();
        IMPL = iobyxmoadgVar;
        iobyxmoadgVar.draadjrbmk();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, crxdokpmqz.iobyxmoadg.cardViewStyle);
    }

    public ColorStateList getCardBackgroundColor() {
        return IMPL.eablkybsjg(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.dxjokdxxww(this.mCardViewDelegate);
    }

    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.wkgbmnqykc(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.zoijcleaow(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i13, int i14) {
        ppxfxbqfkf ppxfxbqfkfVar = IMPL;
        if (ppxfxbqfkfVar instanceof androidx.cardview.widget.iobyxmoadg) {
            super.onMeasure(i13, i14);
            return;
        }
        int mode = View.MeasureSpec.getMode(i13);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i13 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(ppxfxbqfkfVar.wflxmlrfwp(this.mCardViewDelegate)), View.MeasureSpec.getSize(i13)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i14);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i14 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(ppxfxbqfkfVar.gxszxtbevo(this.mCardViewDelegate)), View.MeasureSpec.getSize(i14)), mode2);
        }
        super.onMeasure(i13, i14);
    }

    public void setCardBackgroundColor(int i13) {
        IMPL.agtfadlqog(this.mCardViewDelegate, ColorStateList.valueOf(i13));
    }

    public void setCardElevation(float f13) {
        IMPL.ppxfxbqfkf(this.mCardViewDelegate, f13);
    }

    public void setContentPadding(int i13, int i14, int i15, int i16) {
        this.mContentPadding.set(i13, i14, i15, i16);
        IMPL.gtknphoqwx(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f13) {
        IMPL.ojitshcjhn(this.mCardViewDelegate, f13);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i13) {
        this.mUserSetMinHeight = i13;
        super.setMinimumHeight(i13);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i13) {
        this.mUserSetMinWidth = i13;
        super.setMinimumWidth(i13);
    }

    @Override // android.view.View
    public void setPadding(int i13, int i14, int i15, int i16) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i13, int i14, int i15, int i16) {
    }

    public void setPreventCornerOverlap(boolean z13) {
        if (z13 != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z13;
            IMPL.lqeggnwhkg(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f13) {
        IMPL.iobyxmoadg(this.mCardViewDelegate, f13);
    }

    public void setUseCompatPadding(boolean z13) {
        if (this.mCompatPadding != z13) {
            this.mCompatPadding = z13;
            IMPL.btonecajqb(this.mCardViewDelegate);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i13) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i13);
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        this.mCardViewDelegate = iobyxmoadgVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, crxdokpmqz.wkgbmnqykc.CardView, i13, crxdokpmqz.ppxfxbqfkf.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(crxdokpmqz.wkgbmnqykc.CardView_cardBackgroundColor)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(crxdokpmqz.wkgbmnqykc.CardView_cardBackgroundColor);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(crxdokpmqz.zoijcleaow.cardview_light_background) : getResources().getColor(crxdokpmqz.zoijcleaow.cardview_dark_background));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(crxdokpmqz.wkgbmnqykc.CardView_cardCornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(crxdokpmqz.wkgbmnqykc.CardView_cardElevation, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(crxdokpmqz.wkgbmnqykc.CardView_cardMaxElevation, 0.0f);
        this.mCompatPadding = typedArrayObtainStyledAttributes.getBoolean(crxdokpmqz.wkgbmnqykc.CardView_cardUseCompatPadding, false);
        this.mPreventCornerOverlap = typedArrayObtainStyledAttributes.getBoolean(crxdokpmqz.wkgbmnqykc.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(crxdokpmqz.wkgbmnqykc.CardView_contentPadding, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(crxdokpmqz.wkgbmnqykc.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(crxdokpmqz.wkgbmnqykc.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(crxdokpmqz.wkgbmnqykc.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(crxdokpmqz.wkgbmnqykc.CardView_contentPaddingBottom, dimensionPixelSize);
        float f13 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(crxdokpmqz.wkgbmnqykc.CardView_android_minWidth, 0);
        this.mUserSetMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(crxdokpmqz.wkgbmnqykc.CardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        IMPL.nufgyqmvbu(iobyxmoadgVar, context, colorStateList, dimension, dimension2, f13);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        IMPL.agtfadlqog(this.mCardViewDelegate, colorStateList);
    }
}
