package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.app.yggfygwlhe;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.mbcevpiqjq;
import androidx.vectordrawable.graphics.drawable.ppxfxbqfkf;
import androidx.vectordrawable.graphics.drawable.zoijcleaow;
import com.google.android.material.drawable.wkgbmnqykc;
import com.google.android.material.internal.ojitshcjhn;
import da.btonecajqb;
import da.draadjrbmk;
import da.eablkybsjg;
import da.gtknphoqwx;
import da.gxszxtbevo;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private static final int[] f22413mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private static final int[][] f22414ntlheqmsrt;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private static final int f22416ulzqkzuiru;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private CharSequence f22417cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private CharSequence f22418cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final LinkedHashSet f22419cqumvgiudr;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f22420dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final LinkedHashSet f22421esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private int f22422hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private boolean f22423hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private Drawable f22424iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f22425istkbnxepw;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private int[] f22426jpowsppfya;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private ColorStateList f22427lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f22428lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private PorterDuff.Mode f22429pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f22430pmvmpeiblj;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final zoijcleaow f22431stevsuqkhv;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    ColorStateList f22432wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private final ppxfxbqfkf f22433wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private Drawable f22434yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    ColorStateList f22435ylkuphrtab;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f22436zynmafqrjb;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private static final int f22412kegysxyocb = gtknphoqwx.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private static final int[] f22415tzroggbefp = {da.zoijcleaow.state_indeterminate};

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f22437zdlpuopuiu;

        class iobyxmoadg implements Parcelable.Creator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i13) {
                return new SavedState[i13];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, iobyxmoadg iobyxmoadgVar) {
            this(parcel);
        }

        private String zoijcleaow() {
            int i13 = this.f22437zdlpuopuiu;
            if (i13 != 1) {
                return i13 != 2 ? "unchecked" : "indeterminate";
            }
            return "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + zoijcleaow() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeValue(Integer.valueOf(this.f22437zdlpuopuiu));
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f22437zdlpuopuiu = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    class iobyxmoadg extends zoijcleaow {
        iobyxmoadg() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.zoijcleaow
        public void ppxfxbqfkf(Drawable drawable) {
            super.ppxfxbqfkf(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f22432wwaezpbzkn;
            if (colorStateList != null) {
                k1.iobyxmoadg.agtfadlqog(drawable, colorStateList.getColorForState(materialCheckBox.f22426jpowsppfya, MaterialCheckBox.this.f22432wwaezpbzkn.getDefaultColor()));
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.zoijcleaow
        public void zoijcleaow(Drawable drawable) {
            super.zoijcleaow(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f22432wwaezpbzkn;
            if (colorStateList != null) {
                k1.iobyxmoadg.ojitshcjhn(drawable, colorStateList);
            }
        }
    }

    static {
        int i13 = da.zoijcleaow.state_error;
        f22413mbcevpiqjq = new int[]{i13};
        f22414ntlheqmsrt = new int[][]{new int[]{R.attr.state_enabled, i13}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f22416ulzqkzuiru = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", ConstantDeviceInfo.APP_PLATFORM);
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, da.zoijcleaow.checkboxStyle);
    }

    private void dxjokdxxww() {
    }

    private void eablkybsjg() {
        this.f22434yadqdtsiqt = wkgbmnqykc.ppxfxbqfkf(this.f22434yadqdtsiqt, this.f22432wwaezpbzkn, androidx.core.widget.ppxfxbqfkf.ppxfxbqfkf(this));
        this.f22424iozdgvuglv = wkgbmnqykc.ppxfxbqfkf(this.f22424iozdgvuglv, this.f22435ylkuphrtab, this.f22429pkzmftpjix);
        lqeggnwhkg();
        nufgyqmvbu();
        super.setButtonDrawable(wkgbmnqykc.iobyxmoadg(this.f22434yadqdtsiqt, this.f22424iozdgvuglv));
        refreshDrawableState();
    }

    private String getButtonStateDescription() {
        int i13 = this.f22422hcddaimhww;
        if (i13 == 1) {
            return getResources().getString(btonecajqb.mtrl_checkbox_state_description_checked);
        }
        return i13 == 0 ? getResources().getString(btonecajqb.mtrl_checkbox_state_description_unchecked) : getResources().getString(btonecajqb.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f22427lereixgezr == null) {
            int[][] iArr = f22414ntlheqmsrt;
            int[] iArr2 = new int[iArr.length];
            int iWkgbmnqykc = ia.iobyxmoadg.wkgbmnqykc(this, da.zoijcleaow.colorControlActivated);
            int iWkgbmnqykc2 = ia.iobyxmoadg.wkgbmnqykc(this, da.zoijcleaow.colorError);
            int iWkgbmnqykc3 = ia.iobyxmoadg.wkgbmnqykc(this, da.zoijcleaow.colorSurface);
            int iWkgbmnqykc4 = ia.iobyxmoadg.wkgbmnqykc(this, da.zoijcleaow.colorOnSurface);
            iArr2[0] = ia.iobyxmoadg.btonecajqb(iWkgbmnqykc3, iWkgbmnqykc2, 1.0f);
            iArr2[1] = ia.iobyxmoadg.btonecajqb(iWkgbmnqykc3, iWkgbmnqykc, 1.0f);
            iArr2[2] = ia.iobyxmoadg.btonecajqb(iWkgbmnqykc3, iWkgbmnqykc4, 0.54f);
            iArr2[3] = ia.iobyxmoadg.btonecajqb(iWkgbmnqykc3, iWkgbmnqykc4, 0.38f);
            iArr2[4] = ia.iobyxmoadg.btonecajqb(iWkgbmnqykc3, iWkgbmnqykc4, 0.38f);
            this.f22427lereixgezr = new ColorStateList(iArr, iArr2);
        }
        return this.f22427lereixgezr;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f22432wwaezpbzkn;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void gxszxtbevo() {
        if (Build.VERSION.SDK_INT < 30 || this.f22418cllcsxoeiz != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void lqeggnwhkg() {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (this.f22428lmojexxdyd) {
            ppxfxbqfkf ppxfxbqfkfVar2 = this.f22433wypolnanlu;
            if (ppxfxbqfkfVar2 != null) {
                ppxfxbqfkfVar2.gxszxtbevo(this.f22431stevsuqkhv);
                this.f22433wypolnanlu.zoijcleaow(this.f22431stevsuqkhv);
            }
            Drawable drawable = this.f22434yadqdtsiqt;
            if (!(drawable instanceof AnimatedStateListDrawable) || (ppxfxbqfkfVar = this.f22433wypolnanlu) == null) {
                return;
            }
            ((AnimatedStateListDrawable) drawable).addTransition(gxszxtbevo.checked, gxszxtbevo.unchecked, ppxfxbqfkfVar, false);
            ((AnimatedStateListDrawable) this.f22434yadqdtsiqt).addTransition(gxszxtbevo.indeterminate, gxszxtbevo.unchecked, this.f22433wypolnanlu, false);
        }
    }

    private void nufgyqmvbu() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f22434yadqdtsiqt;
        if (drawable != null && (colorStateList2 = this.f22432wwaezpbzkn) != null) {
            k1.iobyxmoadg.ojitshcjhn(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f22424iozdgvuglv;
        if (drawable2 == null || (colorStateList = this.f22435ylkuphrtab) == null) {
            return;
        }
        k1.iobyxmoadg.ojitshcjhn(drawable2, colorStateList);
    }

    private boolean ppxfxbqfkf(mbcevpiqjq mbcevpiqjqVar) {
        return mbcevpiqjqVar.agtfadlqog(draadjrbmk.MaterialCheckBox_android_button, 0) == f22416ulzqkzuiru && mbcevpiqjqVar.agtfadlqog(draadjrbmk.MaterialCheckBox_buttonCompat, 0) == 0;
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f22434yadqdtsiqt;
    }

    public Drawable getButtonIconDrawable() {
        return this.f22424iozdgvuglv;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f22435ylkuphrtab;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f22429pkzmftpjix;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f22432wwaezpbzkn;
    }

    public int getCheckedState() {
        return this.f22422hcddaimhww;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f22417cdpycssgdh;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f22422hcddaimhww == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f22430pmvmpeiblj && this.f22432wwaezpbzkn == null && this.f22435ylkuphrtab == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i13) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i13 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f22415tzroggbefp);
        }
        if (wkgbmnqykc()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f22413mbcevpiqjq);
        }
        this.f22426jpowsppfya = wkgbmnqykc.eablkybsjg(iArrOnCreateDrawableState);
        dxjokdxxww();
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableIobyxmoadg;
        if (!this.f22436zynmafqrjb || !TextUtils.isEmpty(getText()) || (drawableIobyxmoadg = androidx.core.widget.ppxfxbqfkf.iobyxmoadg(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableIobyxmoadg.getIntrinsicWidth()) / 2) * (ojitshcjhn.nufgyqmvbu(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableIobyxmoadg.getBounds();
            k1.iobyxmoadg.draadjrbmk(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && wkgbmnqykc()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f22417cdpycssgdh));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f22437zdlpuopuiu);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f22437zdlpuopuiu = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i13) {
        setButtonDrawable(nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f22424iozdgvuglv = drawable;
        eablkybsjg();
    }

    public void setButtonIconDrawableResource(int i13) {
        setButtonIconDrawable(nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f22435ylkuphrtab == colorStateList) {
            return;
        }
        this.f22435ylkuphrtab = colorStateList;
        eablkybsjg();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f22429pkzmftpjix == mode) {
            return;
        }
        this.f22429pkzmftpjix = mode;
        eablkybsjg();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f22432wwaezpbzkn == colorStateList) {
            return;
        }
        this.f22432wwaezpbzkn = colorStateList;
        eablkybsjg();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        eablkybsjg();
    }

    public void setCenterIfNoTextEnabled(boolean z13) {
        this.f22436zynmafqrjb = z13;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z13) {
        setCheckedState(z13 ? 1 : 0);
    }

    public void setCheckedState(int i13) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f22422hcddaimhww != i13) {
            this.f22422hcddaimhww = i13;
            super.setChecked(i13 == 1);
            refreshDrawableState();
            gxszxtbevo();
            if (this.f22423hkdspvbjdz) {
                return;
            }
            this.f22423hkdspvbjdz = true;
            LinkedHashSet linkedHashSet = this.f22421esjtqupxsv;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    yggfygwlhe.iobyxmoadg(it.next());
                    throw null;
                }
            }
            if (this.f22422hcddaimhww != 2 && (onCheckedChangeListener = this.f22420dsvhmnatus) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f22423hkdspvbjdz = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z13) {
        super.setEnabled(z13);
        dxjokdxxww();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f22417cdpycssgdh = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i13) {
        setErrorAccessibilityLabel(i13 != 0 ? getResources().getText(i13) : null);
    }

    public void setErrorShown(boolean z13) {
        if (this.f22425istkbnxepw == z13) {
            return;
        }
        this.f22425istkbnxepw = z13;
        refreshDrawableState();
        Iterator it = this.f22419cqumvgiudr.iterator();
        if (it.hasNext()) {
            yggfygwlhe.iobyxmoadg(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f22420dsvhmnatus = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f22418cllcsxoeiz = charSequence;
        if (charSequence == null) {
            gxszxtbevo();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z13) {
        this.f22430pmvmpeiblj = z13;
        if (z13) {
            androidx.core.widget.ppxfxbqfkf.wkgbmnqykc(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.ppxfxbqfkf.wkgbmnqykc(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean wkgbmnqykc() {
        return this.f22425istkbnxepw;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i13) {
        int i14 = f22412kegysxyocb;
        super(ta.iobyxmoadg.ppxfxbqfkf(context, attributeSet, i13, i14), attributeSet, i13);
        this.f22419cqumvgiudr = new LinkedHashSet();
        this.f22421esjtqupxsv = new LinkedHashSet();
        this.f22433wypolnanlu = ppxfxbqfkf.iobyxmoadg(getContext(), eablkybsjg.mtrl_checkbox_button_checked_unchecked);
        this.f22431stevsuqkhv = new iobyxmoadg();
        Context context2 = getContext();
        this.f22434yadqdtsiqt = androidx.core.widget.ppxfxbqfkf.iobyxmoadg(this);
        this.f22432wwaezpbzkn = getSuperButtonTintList();
        setSupportButtonTintList(null);
        mbcevpiqjq mbcevpiqjqVarBtonecajqb = com.google.android.material.internal.draadjrbmk.btonecajqb(context2, attributeSet, draadjrbmk.MaterialCheckBox, i13, i14, new int[0]);
        this.f22424iozdgvuglv = mbcevpiqjqVarBtonecajqb.lqeggnwhkg(draadjrbmk.MaterialCheckBox_buttonIcon);
        if (this.f22434yadqdtsiqt != null && com.google.android.material.internal.draadjrbmk.lqeggnwhkg(context2) && ppxfxbqfkf(mbcevpiqjqVarBtonecajqb)) {
            super.setButtonDrawable((Drawable) null);
            this.f22434yadqdtsiqt = nufgyqmvbu.iobyxmoadg.zoijcleaow(context2, eablkybsjg.mtrl_checkbox_button);
            this.f22428lmojexxdyd = true;
            if (this.f22424iozdgvuglv == null) {
                this.f22424iozdgvuglv = nufgyqmvbu.iobyxmoadg.zoijcleaow(context2, eablkybsjg.mtrl_checkbox_button_icon);
            }
        }
        this.f22435ylkuphrtab = oa.ppxfxbqfkf.zoijcleaow(context2, mbcevpiqjqVarBtonecajqb, draadjrbmk.MaterialCheckBox_buttonIconTint);
        this.f22429pkzmftpjix = ojitshcjhn.btonecajqb(mbcevpiqjqVarBtonecajqb.gtknphoqwx(draadjrbmk.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f22430pmvmpeiblj = mbcevpiqjqVarBtonecajqb.iobyxmoadg(draadjrbmk.MaterialCheckBox_useMaterialThemeColors, false);
        this.f22436zynmafqrjb = mbcevpiqjqVarBtonecajqb.iobyxmoadg(draadjrbmk.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.f22425istkbnxepw = mbcevpiqjqVarBtonecajqb.iobyxmoadg(draadjrbmk.MaterialCheckBox_errorShown, false);
        this.f22417cdpycssgdh = mbcevpiqjqVarBtonecajqb.rgvfuqvkyq(draadjrbmk.MaterialCheckBox_errorAccessibilityLabel);
        if (mbcevpiqjqVarBtonecajqb.kcexrzcfyt(draadjrbmk.MaterialCheckBox_checkedState)) {
            setCheckedState(mbcevpiqjqVarBtonecajqb.gtknphoqwx(draadjrbmk.MaterialCheckBox_checkedState, 0));
        }
        mbcevpiqjqVarBtonecajqb.cqumvgiudr();
        eablkybsjg();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f22434yadqdtsiqt = drawable;
        this.f22428lmojexxdyd = false;
        eablkybsjg();
    }
}
