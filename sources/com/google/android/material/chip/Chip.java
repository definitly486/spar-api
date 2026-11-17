package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.internal.draadjrbmk;
import com.google.android.material.internal.ojitshcjhn;
import da.btonecajqb;
import da.gtknphoqwx;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import oa.gxszxtbevo;
import oa.wkgbmnqykc;
import ra.agtfadlqog;
import ra.nufgyqmvbu;
import v1.jhduphickx;
import w1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public class Chip extends AppCompatCheckBox implements com.google.android.material.chip.iobyxmoadg.InterfaceC0397iobyxmoadg, agtfadlqog, Checkable {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f22443cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final RectF f22444cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private com.google.android.material.chip.iobyxmoadg f22445cqumvgiudr;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final gxszxtbevo f22446dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private InsetDrawable f22447esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final ppxfxbqfkf f22448hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final Rect f22449hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private boolean f22450iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f22451istkbnxepw;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private boolean f22452jpowsppfya;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private RippleDrawable f22453lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f22454lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private CharSequence f22455pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private View.OnClickListener f22456pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private int f22457wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f22458yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private int f22459ylkuphrtab;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f22460zynmafqrjb;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private static final int f22442wypolnanlu = gtknphoqwx.Widget_MaterialComponents_Chip_Action;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private static final Rect f22440stevsuqkhv = new Rect();

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private static final int[] f22439kegysxyocb = {R.attr.state_selected};

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private static final int[] f22441tzroggbefp = {R.attr.state_checkable};

    class iobyxmoadg extends gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // oa.gxszxtbevo
        public void iobyxmoadg(int i13) {
        }

        @Override // oa.gxszxtbevo
        public void zoijcleaow(Typeface typeface, boolean z13) {
            Chip chip = Chip.this;
            chip.setText(chip.f22445cqumvgiudr.S0() ? Chip.this.f22445cqumvgiudr.n() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    private class ppxfxbqfkf extends b2.iobyxmoadg {
        ppxfxbqfkf(Chip chip) {
            super(chip);
        }

        @Override // b2.iobyxmoadg
        protected void cllcsxoeiz(int i13, zdlpuopuiu zdlpuopuiuVar) {
            if (i13 != 1) {
                zdlpuopuiuVar.zfvoamnweg("");
                zdlpuopuiuVar.xrmfcynszj(Chip.f22440stevsuqkhv);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                zdlpuopuiuVar.zfvoamnweg(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                zdlpuopuiuVar.zfvoamnweg(Chip.this.getContext().getString(btonecajqb.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            zdlpuopuiuVar.xrmfcynszj(Chip.this.getCloseIconTouchBoundsInt());
            zdlpuopuiuVar.zoijcleaow(zdlpuopuiu.iobyxmoadg.f118517dxjokdxxww);
            zdlpuopuiuVar.weqkydbzbr(Chip.this.isEnabled());
        }

        @Override // b2.iobyxmoadg
        protected void dsvhmnatus(int i13, boolean z13) {
            if (i13 == 1) {
                Chip.this.f22450iozdgvuglv = z13;
                Chip.this.refreshDrawableState();
            }
        }

        @Override // b2.iobyxmoadg
        protected void hkdspvbjdz(zdlpuopuiu zdlpuopuiuVar) {
            zdlpuopuiuVar.rlfsiqarku(Chip.this.oxmwwwfdhm());
            zdlpuopuiuVar.yfnezrywwk(Chip.this.isClickable());
            zdlpuopuiuVar.uwvvkdfqfp(Chip.this.getAccessibilityClassName());
            zdlpuopuiuVar.yzdjzghtvl(Chip.this.getText());
        }

        @Override // b2.iobyxmoadg
        protected void istkbnxepw(List list) {
            list.add(0);
            if (Chip.this.agtfadlqog() && Chip.this.kcexrzcfyt() && Chip.this.f22456pmvmpeiblj != null) {
                list.add(1);
            }
        }

        @Override // b2.iobyxmoadg
        protected boolean pkzmftpjix(int i13, int i14, Bundle bundle) {
            if (i14 != 16) {
                return false;
            }
            if (i13 == 0) {
                return Chip.this.performClick();
            }
            if (i13 == 1) {
                return Chip.this.yggfygwlhe();
            }
            return false;
        }

        @Override // b2.iobyxmoadg
        protected int zynmafqrjb(float f13, float f14) {
            return (Chip.this.agtfadlqog() && Chip.this.getCloseIconTouchBounds().contains(f13, f14)) ? 1 : 0;
        }
    }

    class zoijcleaow extends ViewOutlineProvider {
        zoijcleaow() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f22445cqumvgiudr != null) {
                Chip.this.f22445cqumvgiudr.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, da.zoijcleaow.chipStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean agtfadlqog() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        return (iobyxmoadgVar == null || iobyxmoadgVar.yzdjzghtvl() == null) ? false : true;
    }

    private void btonecajqb(com.google.android.material.chip.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.v0(this);
    }

    private void cdpycssgdh(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", L2.f46171g) != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    private void cqumvgiudr(com.google.android.material.chip.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.v0(null);
        }
    }

    private void esjtqupxsv() {
        if (agtfadlqog() && kcexrzcfyt() && this.f22456pmvmpeiblj != null) {
            jhduphickx.oipsdeybqn(this, this.f22448hcddaimhww);
            this.f22452jpowsppfya = true;
        } else {
            jhduphickx.oipsdeybqn(this, null);
            this.f22452jpowsppfya = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f22444cllcsxoeiz.setEmpty();
        if (agtfadlqog() && this.f22456pmvmpeiblj != null) {
            this.f22445cqumvgiudr.e(this.f22444cllcsxoeiz);
        }
        return this.f22444cllcsxoeiz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f22449hkdspvbjdz.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f22449hkdspvbjdz;
    }

    private wkgbmnqykc getTextAppearance() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.o();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] gtknphoqwx() {
        ?? IsEnabled = isEnabled();
        int i13 = IsEnabled;
        if (this.f22450iozdgvuglv) {
            i13 = IsEnabled + 1;
        }
        int i14 = i13;
        if (this.f22458yadqdtsiqt) {
            i14 = i13 + 1;
        }
        int i15 = i14;
        if (this.f22443cdpycssgdh) {
            i15 = i14 + 1;
        }
        int i16 = i15;
        if (isChecked()) {
            i16 = i15 + 1;
        }
        int[] iArr = new int[i16];
        int i17 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i17 = 1;
        }
        if (this.f22450iozdgvuglv) {
            iArr[i17] = 16842908;
            i17++;
        }
        if (this.f22458yadqdtsiqt) {
            iArr[i17] = 16843623;
            i17++;
        }
        if (this.f22443cdpycssgdh) {
            iArr[i17] = 16842919;
            i17++;
        }
        if (isChecked()) {
            iArr[i17] = 16842913;
        }
        return iArr;
    }

    private void istkbnxepw() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            paint.drawableState = iobyxmoadgVar.getState();
        }
        wkgbmnqykc textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.agtfadlqog(getContext(), paint, this.f22446dsvhmnatus);
        }
    }

    private void jyumaefscl() {
        if (this.f22447esjtqupxsv != null) {
            this.f22447esjtqupxsv = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            lereixgezr();
        }
    }

    private void lereixgezr() {
        if (pa.zoijcleaow.f76259iobyxmoadg) {
            pmvmpeiblj();
            return;
        }
        this.f22445cqumvgiudr.R0(true);
        jhduphickx.weqkydbzbr(this, getBackgroundDrawable());
        zynmafqrjb();
        wflxmlrfwp();
    }

    private void ojitshcjhn(Context context, AttributeSet attributeSet, int i13) {
        TypedArray typedArrayDxjokdxxww = draadjrbmk.dxjokdxxww(context, attributeSet, da.draadjrbmk.Chip, i13, f22442wypolnanlu, new int[0]);
        this.f22454lmojexxdyd = typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.Chip_ensureMinTouchTargetSize, false);
        this.f22459ylkuphrtab = (int) Math.ceil(typedArrayDxjokdxxww.getDimension(da.draadjrbmk.Chip_chipMinTouchTargetSize, (float) Math.ceil(ojitshcjhn.ppxfxbqfkf(getContext(), 48))));
        typedArrayDxjokdxxww.recycle();
    }

    private void pmvmpeiblj() {
        this.f22453lereixgezr = new RippleDrawable(pa.zoijcleaow.wkgbmnqykc(this.f22445cqumvgiudr.l()), getBackgroundDrawable(), null);
        this.f22445cqumvgiudr.R0(false);
        jhduphickx.weqkydbzbr(this, this.f22453lereixgezr);
        zynmafqrjb();
    }

    private void rgvfuqvkyq() {
        setOutlineProvider(new zoijcleaow());
    }

    private void setCloseIconHovered(boolean z13) {
        if (this.f22458yadqdtsiqt != z13) {
            this.f22458yadqdtsiqt = z13;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z13) {
        if (this.f22443cdpycssgdh != z13) {
            this.f22443cdpycssgdh = z13;
            refreshDrawableState();
        }
    }

    private void vdvldrhtss(int i13, int i14, int i15, int i16) {
        this.f22447esjtqupxsv = new InsetDrawable((Drawable) this.f22445cqumvgiudr, i13, i14, i15, i16);
    }

    private void wflxmlrfwp() {
        if (getBackgroundDrawable() == this.f22447esjtqupxsv && this.f22445cqumvgiudr.getCallback() == null) {
            this.f22445cqumvgiudr.setCallback(this.f22447esjtqupxsv);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zdlpuopuiu(CompoundButton compoundButton, boolean z13) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f22460zynmafqrjb;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z13);
        }
    }

    private void zynmafqrjb() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar;
        if (TextUtils.isEmpty(getText()) || (iobyxmoadgVar = this.f22445cqumvgiudr) == null) {
            return;
        }
        int iIpoelvxyzq = (int) (iobyxmoadgVar.ipoelvxyzq() + this.f22445cqumvgiudr.p() + this.f22445cqumvgiudr.iyctptxqzt());
        int iFmlbqenlif = (int) (this.f22445cqumvgiudr.fmlbqenlif() + this.f22445cqumvgiudr.q() + this.f22445cqumvgiudr.zfvoamnweg());
        if (this.f22447esjtqupxsv != null) {
            Rect rect = new Rect();
            this.f22447esjtqupxsv.getPadding(rect);
            iFmlbqenlif += rect.left;
            iIpoelvxyzq += rect.right;
        }
        jhduphickx.lxfrhoxuzk(this, iFmlbqenlif, getPaddingTop(), iIpoelvxyzq, getPaddingBottom());
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f22452jpowsppfya) {
            return this.f22448hcddaimhww.jyumaefscl(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f22452jpowsppfya) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f22448hcddaimhww.iwizpuwonk(keyEvent) || this.f22448hcddaimhww.pmvmpeiblj() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public boolean draadjrbmk(int i13) {
        this.f22459ylkuphrtab = i13;
        if (!iwizpuwonk()) {
            if (this.f22447esjtqupxsv != null) {
                jyumaefscl();
            } else {
                lereixgezr();
            }
            return false;
        }
        int iMax = Math.max(0, i13 - this.f22445cqumvgiudr.getIntrinsicHeight());
        int iMax2 = Math.max(0, i13 - this.f22445cqumvgiudr.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f22447esjtqupxsv != null) {
                jyumaefscl();
            } else {
                lereixgezr();
            }
            return false;
        }
        int i14 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i15 = iMax > 0 ? iMax / 2 : 0;
        if (this.f22447esjtqupxsv != null) {
            Rect rect = new Rect();
            this.f22447esjtqupxsv.getPadding(rect);
            if (rect.top == i15 && rect.bottom == i15 && rect.left == i14 && rect.right == i14) {
                lereixgezr();
                return true;
            }
        }
        if (getMinHeight() != i13) {
            setMinHeight(i13);
        }
        if (getMinWidth() != i13) {
            setMinWidth(i13);
        }
        vdvldrhtss(i14, i15, i14, i15);
        lereixgezr();
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if ((iobyxmoadgVar == null || !iobyxmoadgVar.v()) ? false : this.f22445cqumvgiudr.r0(gtknphoqwx())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f22455pkzmftpjix)) {
            return this.f22455pkzmftpjix;
        }
        if (!oxmwwwfdhm()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f22447esjtqupxsv;
        return insetDrawable == null ? this.f22445cqumvgiudr : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.hszhottldk();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.fiwbwshyhd();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.ageimvtcrz();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return Math.max(0.0f, iobyxmoadgVar.fyldjkxazc());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f22445cqumvgiudr;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.ipoelvxyzq();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.grlcpdaxtj();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.mhtqkkgtqm();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.ixidwrxhsl();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.jrbgnlbqoe();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.fmlbqenlif();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.ezmngbhpjk();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.rhgxfdycjh();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.yzdjzghtvl();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.eslsurpljm();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.krqnebusok();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.a();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.b();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.h();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f22452jpowsppfya && (this.f22448hcddaimhww.pmvmpeiblj() == 1 || this.f22448hcddaimhww.cqumvgiudr() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public ea.gxszxtbevo getHideMotionSpec() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.i();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.j();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.k();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.l();
        }
        return null;
    }

    public ra.gtknphoqwx getShapeAppearanceModel() {
        return this.f22445cqumvgiudr.cdpycssgdh();
    }

    public ea.gxszxtbevo getShowMotionSpec() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.m();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.p();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar.q();
        }
        return 0.0f;
    }

    @Override // com.google.android.material.chip.iobyxmoadg.InterfaceC0397iobyxmoadg
    public void iobyxmoadg() {
        draadjrbmk(this.f22459ylkuphrtab);
        requestLayout();
        invalidateOutline();
    }

    public boolean iwizpuwonk() {
        return this.f22454lmojexxdyd;
    }

    public boolean kcexrzcfyt() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        return iobyxmoadgVar != null && iobyxmoadgVar.w();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        nufgyqmvbu.gxszxtbevo(this, this.f22445cqumvgiudr);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i13) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i13 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f22439kegysxyocb);
        }
        if (oxmwwwfdhm()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f22441tzroggbefp);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z13, int i13, Rect rect) {
        super.onFocusChanged(z13, i13, rect);
        if (this.f22452jpowsppfya) {
            this.f22448hcddaimhww.ylkuphrtab(z13, i13, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(oxmwwwfdhm());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i13) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i13);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i13) {
        super.onRtlPropertiesChanged(i13);
        if (this.f22457wwaezpbzkn != i13) {
            this.f22457wwaezpbzkn = i13;
            zynmafqrjb();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z13;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f22443cdpycssgdh) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z13 = true;
                }
                z13 = false;
            } else {
                if (this.f22443cdpycssgdh) {
                    yggfygwlhe();
                    z13 = true;
                }
                setCloseIconPressed(false);
            }
            z13 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z13 = true;
        } else {
            z13 = false;
        }
        return z13 || super.onTouchEvent(motionEvent);
    }

    public boolean oxmwwwfdhm() {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        return iobyxmoadgVar != null && iobyxmoadgVar.u();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f22455pkzmftpjix = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f22453lereixgezr) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i13) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f22453lereixgezr) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i13) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.D(z13);
        }
    }

    public void setCheckableResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.E(i13);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar == null) {
            this.f22451istkbnxepw = z13;
        } else if (iobyxmoadgVar.u()) {
            super.setChecked(z13);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.F(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z13) {
        setCheckedIconVisible(z13);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i13) {
        setCheckedIconVisible(i13);
    }

    public void setCheckedIconResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.G(i13);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.H(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.I(i13);
        }
    }

    public void setCheckedIconVisible(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.J(i13);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.L(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.M(i13);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.N(f13);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.O(i13);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.iobyxmoadg iobyxmoadgVar) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar2 = this.f22445cqumvgiudr;
        if (iobyxmoadgVar2 != iobyxmoadgVar) {
            cqumvgiudr(iobyxmoadgVar2);
            this.f22445cqumvgiudr = iobyxmoadgVar;
            iobyxmoadgVar.G0(false);
            btonecajqb(this.f22445cqumvgiudr);
            draadjrbmk(this.f22459ylkuphrtab);
        }
    }

    public void setChipEndPadding(float f13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.P(f13);
        }
    }

    public void setChipEndPaddingResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.Q(i13);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.R(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z13) {
        setChipIconVisible(z13);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i13) {
        setChipIconVisible(i13);
    }

    public void setChipIconResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.S(i13);
        }
    }

    public void setChipIconSize(float f13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.T(f13);
        }
    }

    public void setChipIconSizeResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.U(i13);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.V(colorStateList);
        }
    }

    public void setChipIconTintResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.W(i13);
        }
    }

    public void setChipIconVisible(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.X(i13);
        }
    }

    public void setChipMinHeight(float f13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.Z(f13);
        }
    }

    public void setChipMinHeightResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.a0(i13);
        }
    }

    public void setChipStartPadding(float f13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.b0(f13);
        }
    }

    public void setChipStartPaddingResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.c0(i13);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.d0(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.e0(i13);
        }
    }

    public void setChipStrokeWidth(float f13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.f0(f13);
        }
    }

    public void setChipStrokeWidthResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.g0(i13);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i13) {
        setText(getResources().getString(i13));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.i0(drawable);
        }
        esjtqupxsv();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.j0(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z13) {
        setCloseIconVisible(z13);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i13) {
        setCloseIconVisible(i13);
    }

    public void setCloseIconEndPadding(float f13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.k0(f13);
        }
    }

    public void setCloseIconEndPaddingResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.l0(i13);
        }
    }

    public void setCloseIconResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.m0(i13);
        }
        esjtqupxsv();
    }

    public void setCloseIconSize(float f13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.n0(f13);
        }
    }

    public void setCloseIconSizeResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.o0(i13);
        }
    }

    public void setCloseIconStartPadding(float f13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.p0(f13);
        }
    }

    public void setCloseIconStartPaddingResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.q0(i13);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.s0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.t0(i13);
        }
    }

    public void setCloseIconVisible(int i13) {
        setCloseIconVisible(getResources().getBoolean(i13));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i13, int i14, int i15, int i16) {
        if (i13 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i15 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i13, i14, i15, i16);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i13, int i14, int i15, int i16) {
        if (i13 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i15 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i13, i14, i15, i16);
    }

    @Override // android.view.View
    public void setElevation(float f13) {
        super.setElevation(f13);
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.sopmlzcsov(f13);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f22445cqumvgiudr == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.w0(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z13) {
        this.f22454lmojexxdyd = z13;
        draadjrbmk(this.f22459ylkuphrtab);
    }

    @Override // android.widget.TextView
    public void setGravity(int i13) {
        if (i13 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i13);
        }
    }

    public void setHideMotionSpec(ea.gxszxtbevo gxszxtbevoVar) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.x0(gxszxtbevoVar);
        }
    }

    public void setHideMotionSpecResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.y0(i13);
        }
    }

    public void setIconEndPadding(float f13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.z0(f13);
        }
    }

    public void setIconEndPaddingResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.A0(i13);
        }
    }

    public void setIconStartPadding(float f13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.B0(f13);
        }
    }

    public void setIconStartPaddingResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.C0(i13);
        }
    }

    public void setInternalOnCheckedChangeListener(com.google.android.material.internal.gxszxtbevo gxszxtbevoVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i13) {
        if (this.f22445cqumvgiudr == null) {
            return;
        }
        super.setLayoutDirection(i13);
    }

    @Override // android.widget.TextView
    public void setLines(int i13) {
        if (i13 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i13);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i13) {
        if (i13 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i13);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i13) {
        super.setMaxWidth(i13);
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.D0(i13);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i13) {
        if (i13 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i13);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f22460zynmafqrjb = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f22456pmvmpeiblj = onClickListener;
        esjtqupxsv();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.E0(colorStateList);
        }
        if (this.f22445cqumvgiudr.s()) {
            return;
        }
        pmvmpeiblj();
    }

    public void setRippleColorResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.F0(i13);
            if (this.f22445cqumvgiudr.s()) {
                return;
            }
            pmvmpeiblj();
        }
    }

    @Override // ra.agtfadlqog
    public void setShapeAppearanceModel(ra.gtknphoqwx gtknphoqwxVar) {
        this.f22445cqumvgiudr.setShapeAppearanceModel(gtknphoqwxVar);
    }

    public void setShowMotionSpec(ea.gxszxtbevo gxszxtbevoVar) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.H0(gxszxtbevoVar);
        }
    }

    public void setShowMotionSpecResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.I0(i13);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z13) {
        if (!z13) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z13);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(iobyxmoadgVar.S0() ? null : charSequence, bufferType);
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar2 = this.f22445cqumvgiudr;
        if (iobyxmoadgVar2 != null) {
            iobyxmoadgVar2.J0(charSequence);
        }
    }

    public void setTextAppearance(wkgbmnqykc wkgbmnqykcVar) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.K0(wkgbmnqykcVar);
        }
        istkbnxepw();
    }

    public void setTextAppearanceResource(int i13) {
        setTextAppearance(getContext(), i13);
    }

    public void setTextEndPadding(float f13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.M0(f13);
        }
    }

    public void setTextEndPaddingResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.N0(i13);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i13, float f13) {
        super.setTextSize(i13, f13);
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.O0(TypedValue.applyDimension(i13, f13, getResources().getDisplayMetrics()));
        }
        istkbnxepw();
    }

    public void setTextStartPadding(float f13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.P0(f13);
        }
    }

    public void setTextStartPaddingResource(int i13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.Q0(i13);
        }
    }

    public boolean yggfygwlhe() {
        boolean z13 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f22456pmvmpeiblj;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z13 = true;
        }
        if (this.f22452jpowsppfya) {
            this.f22448hcddaimhww.ntlheqmsrt(1, 1);
        }
        return z13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i13) {
        int i14 = f22442wypolnanlu;
        super(ta.iobyxmoadg.ppxfxbqfkf(context, attributeSet, i13, i14), attributeSet, i13);
        this.f22449hkdspvbjdz = new Rect();
        this.f22444cllcsxoeiz = new RectF();
        this.f22446dsvhmnatus = new iobyxmoadg();
        Context context2 = getContext();
        cdpycssgdh(attributeSet);
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVarTbqsvytpvh = com.google.android.material.chip.iobyxmoadg.tbqsvytpvh(context2, attributeSet, i13, i14);
        ojitshcjhn(context2, attributeSet, i13);
        setChipDrawable(iobyxmoadgVarTbqsvytpvh);
        iobyxmoadgVarTbqsvytpvh.sopmlzcsov(jhduphickx.yggfygwlhe(this));
        TypedArray typedArrayDxjokdxxww = draadjrbmk.dxjokdxxww(context2, attributeSet, da.draadjrbmk.Chip, i13, i14, new int[0]);
        boolean zHasValue = typedArrayDxjokdxxww.hasValue(da.draadjrbmk.Chip_shapeAppearance);
        typedArrayDxjokdxxww.recycle();
        this.f22448hcddaimhww = new ppxfxbqfkf(this);
        esjtqupxsv();
        if (!zHasValue) {
            rgvfuqvkyq();
        }
        setChecked(this.f22451istkbnxepw);
        setText(iobyxmoadgVarTbqsvytpvh.n());
        setEllipsize(iobyxmoadgVarTbqsvytpvh.h());
        istkbnxepw();
        if (!this.f22445cqumvgiudr.S0()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        zynmafqrjb();
        if (iwizpuwonk()) {
            setMinHeight(this.f22459ylkuphrtab);
        }
        this.f22457wwaezpbzkn = jhduphickx.lereixgezr(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ha.iobyxmoadg
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                this.f39933iobyxmoadg.zdlpuopuiu(compoundButton, z13);
            }
        });
    }

    public void setCloseIconVisible(boolean z13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.u0(z13);
        }
        esjtqupxsv();
    }

    public void setCheckedIconVisible(boolean z13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.K(z13);
        }
    }

    public void setChipIconVisible(boolean z13) {
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.Y(z13);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i13) {
        super.setTextAppearance(context, i13);
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.L0(i13);
        }
        istkbnxepw();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i13) {
        super.setTextAppearance(i13);
        com.google.android.material.chip.iobyxmoadg iobyxmoadgVar = this.f22445cqumvgiudr;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.L0(i13);
        }
        istkbnxepw();
    }
}
