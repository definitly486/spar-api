package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.app.yggfygwlhe;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.dxjokdxxww;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.draadjrbmk;
import com.google.android.material.internal.ojitshcjhn;
import da.gtknphoqwx;
import java.util.Iterator;
import java.util.LinkedHashSet;
import oa.ppxfxbqfkf;
import ra.agtfadlqog;
import ra.nufgyqmvbu;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, agtfadlqog {
    private static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int DEF_STYLE_RES = gtknphoqwx.Widget_MaterialComponents_Button;
    public static final int ICON_GRAVITY_END = 3;
    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_END = 4;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    public static final int ICON_GRAVITY_TEXT_TOP = 32;
    public static final int ICON_GRAVITY_TOP = 16;
    private static final String LOG_TAG = "MaterialButton";
    private String accessibilityClassName;
    private boolean broadcasting;
    private boolean checked;
    private Drawable icon;
    private int iconGravity;
    private int iconLeft;
    private int iconPadding;
    private int iconSize;
    private ColorStateList iconTint;
    private PorterDuff.Mode iconTintMode;
    private int iconTop;
    private final com.google.android.material.button.iobyxmoadg materialButtonHelper;
    private final LinkedHashSet<iobyxmoadg> onCheckedChangeListeners;
    private zoijcleaow onPressedChangeListenerInternal;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f22265jyumaefscl;

        class iobyxmoadg implements Parcelable.ClassLoaderCreator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i13) {
                return new SavedState[i13];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void ppxfxbqfkf(Parcel parcel) {
            this.f22265jyumaefscl = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f22265jyumaefscl ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            ppxfxbqfkf(parcel);
        }
    }

    public interface iobyxmoadg {
    }

    interface zoijcleaow {
        void iobyxmoadg(MaterialButton materialButton, boolean z13);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, da.zoijcleaow.materialButtonStyle);
    }

    private boolean eablkybsjg() {
        com.google.android.material.button.iobyxmoadg iobyxmoadgVar = this.materialButtonHelper;
        return (iobyxmoadgVar == null || iobyxmoadgVar.ojitshcjhn()) ? false : true;
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i13 = 0; i13 < lineCount; i13++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i13));
        }
        return (int) Math.ceil(fMax);
    }

    private void gxszxtbevo() {
        if (zoijcleaow()) {
            dxjokdxxww.btonecajqb(this, this.icon, null, null, null);
        } else if (iobyxmoadg()) {
            dxjokdxxww.btonecajqb(this, null, null, this.icon, null);
        } else if (ppxfxbqfkf()) {
            dxjokdxxww.btonecajqb(this, null, this.icon, null, null);
        }
    }

    private boolean iobyxmoadg() {
        int i13 = this.iconGravity;
        return i13 == 3 || i13 == 4;
    }

    private void lqeggnwhkg(boolean z13) {
        Drawable drawable = this.icon;
        if (drawable != null) {
            Drawable drawableMutate = k1.iobyxmoadg.oxmwwwfdhm(drawable).mutate();
            this.icon = drawableMutate;
            k1.iobyxmoadg.ojitshcjhn(drawableMutate, this.iconTint);
            PorterDuff.Mode mode = this.iconTintMode;
            if (mode != null) {
                k1.iobyxmoadg.rgvfuqvkyq(this.icon, mode);
            }
            int intrinsicWidth = this.iconSize;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.icon.getIntrinsicWidth();
            }
            int intrinsicHeight = this.iconSize;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.icon.getIntrinsicHeight();
            }
            Drawable drawable2 = this.icon;
            int i13 = this.iconLeft;
            int i14 = this.iconTop;
            drawable2.setBounds(i13, i14, intrinsicWidth + i13, intrinsicHeight + i14);
            this.icon.setVisible(true, z13);
        }
        if (z13) {
            gxszxtbevo();
            return;
        }
        Drawable[] drawableArrIobyxmoadg = dxjokdxxww.iobyxmoadg(this);
        Drawable drawable3 = drawableArrIobyxmoadg[0];
        Drawable drawable4 = drawableArrIobyxmoadg[1];
        Drawable drawable5 = drawableArrIobyxmoadg[2];
        if ((!zoijcleaow() || drawable3 == this.icon) && ((!iobyxmoadg() || drawable5 == this.icon) && (!ppxfxbqfkf() || drawable4 == this.icon))) {
            return;
        }
        gxszxtbevo();
    }

    private void nufgyqmvbu(int i13, int i14) {
        if (this.icon == null || getLayout() == null) {
            return;
        }
        if (!zoijcleaow() && !iobyxmoadg()) {
            if (ppxfxbqfkf()) {
                this.iconLeft = 0;
                if (this.iconGravity == 16) {
                    this.iconTop = 0;
                    lqeggnwhkg(false);
                    return;
                }
                int intrinsicHeight = this.iconSize;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.icon.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i14 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.iconPadding) - getPaddingBottom()) / 2);
                if (this.iconTop != iMax) {
                    this.iconTop = iMax;
                    lqeggnwhkg(false);
                    return;
                }
                return;
            }
            return;
        }
        this.iconTop = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i15 = this.iconGravity;
        if (i15 == 1 || i15 == 3 || ((i15 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i15 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.iconLeft = 0;
            lqeggnwhkg(false);
            return;
        }
        int intrinsicWidth = this.iconSize;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.icon.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i13 - getTextLayoutWidth()) - jhduphickx.cdpycssgdh(this)) - intrinsicWidth) - this.iconPadding) - jhduphickx.yadqdtsiqt(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (wkgbmnqykc() != (this.iconGravity == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.iconLeft != textLayoutWidth) {
            this.iconLeft = textLayoutWidth;
            lqeggnwhkg(false);
        }
    }

    private boolean ppxfxbqfkf() {
        int i13 = this.iconGravity;
        return i13 == 16 || i13 == 32;
    }

    private boolean wkgbmnqykc() {
        return jhduphickx.lereixgezr(this) == 1;
    }

    private boolean zoijcleaow() {
        int i13 = this.iconGravity;
        return i13 == 1 || i13 == 2;
    }

    public void addOnCheckedChangeListener(iobyxmoadg iobyxmoadgVar) {
        this.onCheckedChangeListeners.add(iobyxmoadgVar);
    }

    public void clearOnCheckedChangeListeners() {
        this.onCheckedChangeListeners.clear();
    }

    String getA11yClassName() {
        if (TextUtils.isEmpty(this.accessibilityClassName)) {
            return (isCheckable() ? CompoundButton.class : Button.class).getName();
        }
        return this.accessibilityClassName;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (eablkybsjg()) {
            return this.materialButtonHelper.zoijcleaow();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public int getIconGravity() {
        return this.iconGravity;
    }

    public int getIconPadding() {
        return this.iconPadding;
    }

    public int getIconSize() {
        return this.iconSize;
    }

    public ColorStateList getIconTint() {
        return this.iconTint;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.iconTintMode;
    }

    public int getInsetBottom() {
        return this.materialButtonHelper.ppxfxbqfkf();
    }

    public int getInsetTop() {
        return this.materialButtonHelper.wkgbmnqykc();
    }

    public ColorStateList getRippleColor() {
        if (eablkybsjg()) {
            return this.materialButtonHelper.nufgyqmvbu();
        }
        return null;
    }

    public ra.gtknphoqwx getShapeAppearanceModel() {
        if (eablkybsjg()) {
            return this.materialButtonHelper.dxjokdxxww();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (eablkybsjg()) {
            return this.materialButtonHelper.btonecajqb();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (eablkybsjg()) {
            return this.materialButtonHelper.gtknphoqwx();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return eablkybsjg() ? this.materialButtonHelper.draadjrbmk() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return eablkybsjg() ? this.materialButtonHelper.wflxmlrfwp() : super.getSupportBackgroundTintMode();
    }

    public boolean isCheckable() {
        com.google.android.material.button.iobyxmoadg iobyxmoadgVar = this.materialButtonHelper;
        return iobyxmoadgVar != null && iobyxmoadgVar.rgvfuqvkyq();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    public boolean isToggleCheckedStateOnClick() {
        return this.materialButtonHelper.vdvldrhtss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (eablkybsjg()) {
            nufgyqmvbu.gxszxtbevo(this, this.materialButtonHelper.gxszxtbevo());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i13) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i13 + 2);
        if (isCheckable()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKABLE_STATE_SET);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        nufgyqmvbu(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.zoijcleaow());
        setChecked(savedState.f22265jyumaefscl);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f22265jyumaefscl = this.checked;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        super.onTextChanged(charSequence, i13, i14, i15);
        nufgyqmvbu(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.materialButtonHelper.vdvldrhtss()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.icon != null) {
            if (this.icon.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void removeOnCheckedChangeListener(iobyxmoadg iobyxmoadgVar) {
        this.onCheckedChangeListeners.remove(iobyxmoadgVar);
    }

    void setA11yClassName(String str) {
        this.accessibilityClassName = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i13) {
        if (eablkybsjg()) {
            this.materialButtonHelper.kcexrzcfyt(i13);
        } else {
            super.setBackgroundColor(i13);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!eablkybsjg()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w(LOG_TAG, "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.materialButtonHelper.zdlpuopuiu();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i13) {
        setBackgroundDrawable(i13 != 0 ? nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z13) {
        if (eablkybsjg()) {
            this.materialButtonHelper.yggfygwlhe(z13);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z13) {
        if (isCheckable() && isEnabled() && this.checked != z13) {
            this.checked = z13;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).agtfadlqog(this, this.checked);
            }
            if (this.broadcasting) {
                return;
            }
            this.broadcasting = true;
            Iterator<iobyxmoadg> it = this.onCheckedChangeListeners.iterator();
            if (it.hasNext()) {
                yggfygwlhe.iobyxmoadg(it.next());
                throw null;
            }
            this.broadcasting = false;
        }
    }

    public void setCornerRadius(int i13) {
        if (eablkybsjg()) {
            this.materialButtonHelper.jyumaefscl(i13);
        }
    }

    public void setCornerRadiusResource(int i13) {
        if (eablkybsjg()) {
            setCornerRadius(getResources().getDimensionPixelSize(i13));
        }
    }

    @Override // android.view.View
    public void setElevation(float f13) {
        super.setElevation(f13);
        if (eablkybsjg()) {
            this.materialButtonHelper.gxszxtbevo().sopmlzcsov(f13);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.icon != drawable) {
            this.icon = drawable;
            lqeggnwhkg(true);
            nufgyqmvbu(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i13) {
        if (this.iconGravity != i13) {
            this.iconGravity = i13;
            nufgyqmvbu(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i13) {
        if (this.iconPadding != i13) {
            this.iconPadding = i13;
            setCompoundDrawablePadding(i13);
        }
    }

    public void setIconResource(int i13) {
        setIcon(i13 != 0 ? nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13) : null);
    }

    public void setIconSize(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.iconSize != i13) {
            this.iconSize = i13;
            lqeggnwhkg(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.iconTint != colorStateList) {
            this.iconTint = colorStateList;
            lqeggnwhkg(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.iconTintMode != mode) {
            this.iconTintMode = mode;
            lqeggnwhkg(false);
        }
    }

    public void setIconTintResource(int i13) {
        setIconTint(nufgyqmvbu.iobyxmoadg.iobyxmoadg(getContext(), i13));
    }

    public void setInsetBottom(int i13) {
        this.materialButtonHelper.iwizpuwonk(i13);
    }

    public void setInsetTop(int i13) {
        this.materialButtonHelper.cqumvgiudr(i13);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(zoijcleaow zoijcleaowVar) {
        this.onPressedChangeListenerInternal = zoijcleaowVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z13) {
        zoijcleaow zoijcleaowVar = this.onPressedChangeListenerInternal;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.iobyxmoadg(this, z13);
        }
        super.setPressed(z13);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (eablkybsjg()) {
            this.materialButtonHelper.esjtqupxsv(colorStateList);
        }
    }

    public void setRippleColorResource(int i13) {
        if (eablkybsjg()) {
            setRippleColor(nufgyqmvbu.iobyxmoadg.iobyxmoadg(getContext(), i13));
        }
    }

    @Override // ra.agtfadlqog
    public void setShapeAppearanceModel(ra.gtknphoqwx gtknphoqwxVar) {
        if (!eablkybsjg()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.materialButtonHelper.lereixgezr(gtknphoqwxVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z13) {
        if (eablkybsjg()) {
            this.materialButtonHelper.pmvmpeiblj(z13);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (eablkybsjg()) {
            this.materialButtonHelper.zynmafqrjb(colorStateList);
        }
    }

    public void setStrokeColorResource(int i13) {
        if (eablkybsjg()) {
            setStrokeColor(nufgyqmvbu.iobyxmoadg.iobyxmoadg(getContext(), i13));
        }
    }

    public void setStrokeWidth(int i13) {
        if (eablkybsjg()) {
            this.materialButtonHelper.istkbnxepw(i13);
        }
    }

    public void setStrokeWidthResource(int i13) {
        if (eablkybsjg()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i13));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (eablkybsjg()) {
            this.materialButtonHelper.cdpycssgdh(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (eablkybsjg()) {
            this.materialButtonHelper.yadqdtsiqt(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i13) {
        super.setTextAlignment(i13);
        nufgyqmvbu(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z13) {
        this.materialButtonHelper.iozdgvuglv(z13);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.checked);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i13) {
        int i14 = DEF_STYLE_RES;
        super(ta.iobyxmoadg.ppxfxbqfkf(context, attributeSet, i13, i14), attributeSet, i13);
        this.onCheckedChangeListeners = new LinkedHashSet<>();
        this.checked = false;
        this.broadcasting = false;
        Context context2 = getContext();
        TypedArray typedArrayDxjokdxxww = draadjrbmk.dxjokdxxww(context2, attributeSet, da.draadjrbmk.MaterialButton, i13, i14, new int[0]);
        this.iconPadding = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.MaterialButton_iconPadding, 0);
        this.iconTintMode = ojitshcjhn.btonecajqb(typedArrayDxjokdxxww.getInt(da.draadjrbmk.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.iconTint = ppxfxbqfkf.iobyxmoadg(getContext(), typedArrayDxjokdxxww, da.draadjrbmk.MaterialButton_iconTint);
        this.icon = ppxfxbqfkf.wkgbmnqykc(getContext(), typedArrayDxjokdxxww, da.draadjrbmk.MaterialButton_icon);
        this.iconGravity = typedArrayDxjokdxxww.getInteger(da.draadjrbmk.MaterialButton_iconGravity, 1);
        this.iconSize = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.MaterialButton_iconSize, 0);
        com.google.android.material.button.iobyxmoadg iobyxmoadgVar = new com.google.android.material.button.iobyxmoadg(this, ra.gtknphoqwx.eablkybsjg(context2, attributeSet, i13, i14).wflxmlrfwp());
        this.materialButtonHelper = iobyxmoadgVar;
        iobyxmoadgVar.oxmwwwfdhm(typedArrayDxjokdxxww);
        typedArrayDxjokdxxww.recycle();
        setCompoundDrawablePadding(this.iconPadding);
        lqeggnwhkg(this.icon != null);
    }
}
