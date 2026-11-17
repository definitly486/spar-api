package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f3148cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private int f3149cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f3150cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private int f3151crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private btonecajqb f3152czzsidtyhn;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private float f3153dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private Drawable f3154esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private CharSequence f3155hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private int f3156hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private ColorStateList f3157ikoacuggdj;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private int f3158iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f3159istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f3160iwizpuwonk;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private final TextPaint f3161jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private int f3162jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private boolean f3163jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private PorterDuff.Mode f3164jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private Layout f3165jztzpxfvev;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private int f3166kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private ColorStateList f3167lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f3168lmojexxdyd;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private int f3169mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    ObjectAnimator f3170metgxyhuhe;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private int f3171ntlheqmsrt;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private Layout f3172okpsazkaxt;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private CharSequence f3173pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private PorterDuff.Mode f3174pmvmpeiblj;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private int f3175ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private final zdlpuopuiu f3176rlfsiqarku;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private int f3177sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private VelocityTracker f3178stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    float f3179tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private int f3180ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private final Rect f3181uwvvkdfqfp;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private boolean f3182vipkmwdibw;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private CharSequence f3183wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private float f3184wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private TransformationMethod f3185xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private int f3186yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private ColorStateList f3187yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private CharSequence f3188ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Drawable f3189zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f3190zynmafqrjb;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private static final Property f3147yfnezrywwk = new iobyxmoadg(Float.class, "thumbPos");

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private static final int[] f3146ydmasvzmpa = {R.attr.state_checked};

    class iobyxmoadg extends Property {
        iobyxmoadg(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f3179tzroggbefp);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f13) {
            switchCompat.setThumbPosition(f13.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lqeggnwhkg.iobyxmoadg.switchStyle);
    }

    private void agtfadlqog(int i13, int i14) {
        Typeface typeface;
        if (i13 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i13 != 2) {
            typeface = i13 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        wflxmlrfwp(typeface, i14);
    }

    private void btonecajqb() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f3173pkzmftpjix;
            if (string == null) {
                string = getResources().getString(lqeggnwhkg.nufgyqmvbu.abc_capital_off);
            }
            jhduphickx.ageimvtcrz(this, string);
        }
    }

    private Layout dxjokdxxww(CharSequence charSequence) {
        TextPaint textPaint = this.f3161jhduphickx;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void eablkybsjg(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private btonecajqb getEmojiTextViewHelper() {
        if (this.f3152czzsidtyhn == null) {
            this.f3152czzsidtyhn = new btonecajqb(this);
        }
        return this.f3152czzsidtyhn;
    }

    private boolean getTargetCheckedState() {
        return this.f3179tzroggbefp > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((vipkmwdibw.zoijcleaow(this) ? 1.0f - this.f3179tzroggbefp : this.f3179tzroggbefp) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f3154esjtqupxsv;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f3181uwvvkdfqfp;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f3189zdlpuopuiu;
        Rect rectWkgbmnqykc = drawable2 != null ? yadqdtsiqt.wkgbmnqykc(drawable2) : yadqdtsiqt.f3436ppxfxbqfkf;
        return ((((this.f3169mbcevpiqjq - this.f3180ulzqkzuiru) - rect.left) - rect.right) - rectWkgbmnqykc.left) - rectWkgbmnqykc.right;
    }

    private void gtknphoqwx() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f3183wwaezpbzkn;
            if (string == null) {
                string = getResources().getString(lqeggnwhkg.nufgyqmvbu.abc_capital_on);
            }
            jhduphickx.ageimvtcrz(this, string);
        }
    }

    private static float gxszxtbevo(float f13, float f14, float f15) {
        if (f13 < f14) {
            return f14;
        }
        return f13 > f15 ? f15 : f13;
    }

    private void iobyxmoadg(boolean z13) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) f3147yfnezrywwk, z13 ? 1.0f : 0.0f);
        this.f3170metgxyhuhe = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f3170metgxyhuhe.setAutoCancel(true);
        this.f3170metgxyhuhe.start();
    }

    private CharSequence lqeggnwhkg(CharSequence charSequence) {
        TransformationMethod transformationMethodGxszxtbevo = getEmojiTextViewHelper().gxszxtbevo(this.f3185xrmfcynszj);
        return transformationMethodGxszxtbevo != null ? transformationMethodGxszxtbevo.getTransformation(charSequence, this) : charSequence;
    }

    private boolean nufgyqmvbu(float f13, float f14) {
        if (this.f3189zdlpuopuiu == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f3189zdlpuopuiu.getPadding(this.f3181uwvvkdfqfp);
        int i13 = this.f3151crxdokpmqz;
        int i14 = this.f3149cllcsxoeiz;
        int i15 = i13 - i14;
        int i16 = (this.f3177sopmlzcsov + thumbOffset) - i14;
        int i17 = this.f3180ulzqkzuiru + i16;
        Rect rect = this.f3181uwvvkdfqfp;
        return f13 > ((float) i16) && f13 < ((float) (((i17 + rect.left) + rect.right) + i14)) && f14 > ((float) i15) && f14 < ((float) (this.f3175ribwqtqdhb + i14));
    }

    private void ojitshcjhn() {
        if (this.f3152czzsidtyhn.zoijcleaow() && i2.iobyxmoadg.wkgbmnqykc()) {
            i2.iobyxmoadg.iobyxmoadg();
            throw null;
        }
    }

    private void ppxfxbqfkf() {
        Drawable drawable = this.f3154esjtqupxsv;
        if (drawable != null) {
            if (this.f3190zynmafqrjb || this.f3159istkbnxepw) {
                Drawable drawableMutate = k1.iobyxmoadg.oxmwwwfdhm(drawable).mutate();
                this.f3154esjtqupxsv = drawableMutate;
                if (this.f3190zynmafqrjb) {
                    k1.iobyxmoadg.ojitshcjhn(drawableMutate, this.f3167lereixgezr);
                }
                if (this.f3159istkbnxepw) {
                    k1.iobyxmoadg.rgvfuqvkyq(this.f3154esjtqupxsv, this.f3174pmvmpeiblj);
                }
                if (this.f3154esjtqupxsv.isStateful()) {
                    this.f3154esjtqupxsv.setState(getDrawableState());
                }
            }
        }
    }

    private void rgvfuqvkyq(MotionEvent motionEvent) {
        this.f3156hkdspvbjdz = 0;
        boolean targetCheckedState = true;
        boolean z13 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z13) {
            this.f3178stevsuqkhv.computeCurrentVelocity(1000);
            float xVelocity = this.f3178stevsuqkhv.getXVelocity();
            if (Math.abs(xVelocity) <= this.f3166kegysxyocb) {
                targetCheckedState = getTargetCheckedState();
            } else if (!vipkmwdibw.zoijcleaow(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        eablkybsjg(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f3173pkzmftpjix = charSequence;
        this.f3155hcddaimhww = lqeggnwhkg(charSequence);
        this.f3165jztzpxfvev = null;
        if (this.f3163jpowsppfya) {
            ojitshcjhn();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f3183wwaezpbzkn = charSequence;
        this.f3188ylkuphrtab = lqeggnwhkg(charSequence);
        this.f3172okpsazkaxt = null;
        if (this.f3163jpowsppfya) {
            ojitshcjhn();
        }
    }

    private void wkgbmnqykc() {
        ObjectAnimator objectAnimator = this.f3170metgxyhuhe;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void zoijcleaow() {
        Drawable drawable = this.f3189zdlpuopuiu;
        if (drawable != null) {
            if (this.f3160iwizpuwonk || this.f3150cqumvgiudr) {
                Drawable drawableMutate = k1.iobyxmoadg.oxmwwwfdhm(drawable).mutate();
                this.f3189zdlpuopuiu = drawableMutate;
                if (this.f3160iwizpuwonk) {
                    k1.iobyxmoadg.ojitshcjhn(drawableMutate, this.f3187yggfygwlhe);
                }
                if (this.f3150cqumvgiudr) {
                    k1.iobyxmoadg.rgvfuqvkyq(this.f3189zdlpuopuiu, this.f3164jyumaefscl);
                }
                if (this.f3189zdlpuopuiu.isStateful()) {
                    this.f3189zdlpuopuiu.setState(getDrawableState());
                }
            }
        }
    }

    public void draadjrbmk(Context context, int i13) {
        mbcevpiqjq mbcevpiqjqVarZdlpuopuiu = mbcevpiqjq.zdlpuopuiu(context, i13, lqeggnwhkg.btonecajqb.TextAppearance);
        ColorStateList colorStateListPpxfxbqfkf = mbcevpiqjqVarZdlpuopuiu.ppxfxbqfkf(lqeggnwhkg.btonecajqb.TextAppearance_android_textColor);
        if (colorStateListPpxfxbqfkf != null) {
            this.f3157ikoacuggdj = colorStateListPpxfxbqfkf;
        } else {
            this.f3157ikoacuggdj = getTextColors();
        }
        int iGxszxtbevo = mbcevpiqjqVarZdlpuopuiu.gxszxtbevo(lqeggnwhkg.btonecajqb.TextAppearance_android_textSize, 0);
        if (iGxszxtbevo != 0) {
            float f13 = iGxszxtbevo;
            if (f13 != this.f3161jhduphickx.getTextSize()) {
                this.f3161jhduphickx.setTextSize(f13);
                requestLayout();
            }
        }
        agtfadlqog(mbcevpiqjqVarZdlpuopuiu.gtknphoqwx(lqeggnwhkg.btonecajqb.TextAppearance_android_typeface, -1), mbcevpiqjqVarZdlpuopuiu.gtknphoqwx(lqeggnwhkg.btonecajqb.TextAppearance_android_textStyle, -1));
        if (mbcevpiqjqVarZdlpuopuiu.iobyxmoadg(lqeggnwhkg.btonecajqb.TextAppearance_textAllCaps, false)) {
            this.f3185xrmfcynszj = new gtknphoqwx.iobyxmoadg(getContext());
        } else {
            this.f3185xrmfcynszj = null;
        }
        setTextOnInternal(this.f3183wwaezpbzkn);
        setTextOffInternal(this.f3173pkzmftpjix);
        mbcevpiqjqVarZdlpuopuiu.cqumvgiudr();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i13;
        int i14;
        Rect rect = this.f3181uwvvkdfqfp;
        int i15 = this.f3177sopmlzcsov;
        int i16 = this.f3151crxdokpmqz;
        int i17 = this.f3162jlmebxxoox;
        int i18 = this.f3175ribwqtqdhb;
        int thumbOffset = getThumbOffset() + i15;
        Drawable drawable = this.f3189zdlpuopuiu;
        Rect rectWkgbmnqykc = drawable != null ? yadqdtsiqt.wkgbmnqykc(drawable) : yadqdtsiqt.f3436ppxfxbqfkf;
        Drawable drawable2 = this.f3154esjtqupxsv;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i19 = rect.left;
            thumbOffset += i19;
            if (rectWkgbmnqykc != null) {
                int i23 = rectWkgbmnqykc.left;
                if (i23 > i19) {
                    i15 += i23 - i19;
                }
                int i24 = rectWkgbmnqykc.top;
                int i25 = rect.top;
                i13 = i24 > i25 ? (i24 - i25) + i16 : i16;
                int i26 = rectWkgbmnqykc.right;
                int i27 = rect.right;
                if (i26 > i27) {
                    i17 -= i26 - i27;
                }
                int i28 = rectWkgbmnqykc.bottom;
                int i29 = rect.bottom;
                if (i28 > i29) {
                    i14 = i18 - (i28 - i29);
                }
                this.f3154esjtqupxsv.setBounds(i15, i13, i17, i14);
            } else {
                i13 = i16;
            }
            i14 = i18;
            this.f3154esjtqupxsv.setBounds(i15, i13, i17, i14);
        }
        Drawable drawable3 = this.f3189zdlpuopuiu;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i33 = thumbOffset - rect.left;
            int i34 = thumbOffset + this.f3180ulzqkzuiru + rect.right;
            this.f3189zdlpuopuiu.setBounds(i33, i16, i34, i18);
            Drawable background = getBackground();
            if (background != null) {
                k1.iobyxmoadg.draadjrbmk(background, i33, i16, i34, i18);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f13, float f14) {
        super.drawableHotspotChanged(f13, f14);
        Drawable drawable = this.f3189zdlpuopuiu;
        if (drawable != null) {
            k1.iobyxmoadg.gtknphoqwx(drawable, f13, f14);
        }
        Drawable drawable2 = this.f3154esjtqupxsv;
        if (drawable2 != null) {
            k1.iobyxmoadg.gtknphoqwx(drawable2, f13, f14);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3189zdlpuopuiu;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f3154esjtqupxsv;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!vipkmwdibw.zoijcleaow(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f3169mbcevpiqjq;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f3158iozdgvuglv : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (vipkmwdibw.zoijcleaow(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f3169mbcevpiqjq;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f3158iozdgvuglv : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.dxjokdxxww.oxmwwwfdhm(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f3163jpowsppfya;
    }

    public boolean getSplitTrack() {
        return this.f3168lmojexxdyd;
    }

    public int getSwitchMinWidth() {
        return this.f3186yadqdtsiqt;
    }

    public int getSwitchPadding() {
        return this.f3158iozdgvuglv;
    }

    public CharSequence getTextOff() {
        return this.f3173pkzmftpjix;
    }

    public CharSequence getTextOn() {
        return this.f3183wwaezpbzkn;
    }

    public Drawable getThumbDrawable() {
        return this.f3189zdlpuopuiu;
    }

    protected final float getThumbPosition() {
        return this.f3179tzroggbefp;
    }

    public int getThumbTextPadding() {
        return this.f3148cdpycssgdh;
    }

    public ColorStateList getThumbTintList() {
        return this.f3187yggfygwlhe;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f3164jyumaefscl;
    }

    public Drawable getTrackDrawable() {
        return this.f3154esjtqupxsv;
    }

    public ColorStateList getTrackTintList() {
        return this.f3167lereixgezr;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f3174pmvmpeiblj;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3189zdlpuopuiu;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3154esjtqupxsv;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f3170metgxyhuhe;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f3170metgxyhuhe.end();
        this.f3170metgxyhuhe = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i13) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i13 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3146ydmasvzmpa);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f3181uwvvkdfqfp;
        Drawable drawable = this.f3154esjtqupxsv;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i13 = this.f3151crxdokpmqz;
        int i14 = this.f3175ribwqtqdhb;
        int i15 = i13 + rect.top;
        int i16 = i14 - rect.bottom;
        Drawable drawable2 = this.f3189zdlpuopuiu;
        if (drawable != null) {
            if (!this.f3168lmojexxdyd || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectWkgbmnqykc = yadqdtsiqt.wkgbmnqykc(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectWkgbmnqykc.left;
                rect.right -= rectWkgbmnqykc.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f3172okpsazkaxt : this.f3165jztzpxfvev;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f3157ikoacuggdj;
            if (colorStateList != null) {
                this.f3161jhduphickx.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f3161jhduphickx.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i15 + i16) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f3183wwaezpbzkn : this.f3173pkzmftpjix;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(text);
            sb3.append(' ');
            sb3.append(charSequence);
            accessibilityNodeInfo.setText(sb3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int iMax;
        int width;
        int paddingLeft;
        int i17;
        int paddingTop;
        int height;
        super.onLayout(z13, i13, i14, i15, i16);
        int iMax2 = 0;
        if (this.f3189zdlpuopuiu != null) {
            Rect rect = this.f3181uwvvkdfqfp;
            Drawable drawable = this.f3154esjtqupxsv;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectWkgbmnqykc = yadqdtsiqt.wkgbmnqykc(this.f3189zdlpuopuiu);
            iMax = Math.max(0, rectWkgbmnqykc.left - rect.left);
            iMax2 = Math.max(0, rectWkgbmnqykc.right - rect.right);
        } else {
            iMax = 0;
        }
        if (vipkmwdibw.zoijcleaow(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f3169mbcevpiqjq + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f3169mbcevpiqjq) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i17 = this.f3171ntlheqmsrt;
            } else {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f3171ntlheqmsrt;
            }
            this.f3177sopmlzcsov = paddingLeft;
            this.f3151crxdokpmqz = paddingTop;
            this.f3175ribwqtqdhb = height;
            this.f3162jlmebxxoox = width;
        }
        int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
        i17 = this.f3171ntlheqmsrt;
        paddingTop = paddingTop2 - (i17 / 2);
        height = i17 + paddingTop;
        this.f3177sopmlzcsov = paddingLeft;
        this.f3151crxdokpmqz = paddingTop;
        this.f3175ribwqtqdhb = height;
        this.f3162jlmebxxoox = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i13, int i14) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f3163jpowsppfya) {
            if (this.f3172okpsazkaxt == null) {
                this.f3172okpsazkaxt = dxjokdxxww(this.f3188ylkuphrtab);
            }
            if (this.f3165jztzpxfvev == null) {
                this.f3165jztzpxfvev = dxjokdxxww(this.f3155hcddaimhww);
            }
        }
        Rect rect = this.f3181uwvvkdfqfp;
        Drawable drawable = this.f3189zdlpuopuiu;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f3189zdlpuopuiu.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f3189zdlpuopuiu.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f3180ulzqkzuiru = Math.max(this.f3163jpowsppfya ? Math.max(this.f3172okpsazkaxt.getWidth(), this.f3165jztzpxfvev.getWidth()) + (this.f3148cdpycssgdh * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f3154esjtqupxsv;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f3154esjtqupxsv.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f3189zdlpuopuiu;
        if (drawable3 != null) {
            Rect rectWkgbmnqykc = yadqdtsiqt.wkgbmnqykc(drawable3);
            iMax = Math.max(iMax, rectWkgbmnqykc.left);
            iMax2 = Math.max(iMax2, rectWkgbmnqykc.right);
        }
        int iMax3 = this.f3182vipkmwdibw ? Math.max(this.f3186yadqdtsiqt, (this.f3180ulzqkzuiru * 2) + iMax + iMax2) : this.f3186yadqdtsiqt;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f3169mbcevpiqjq = iMax3;
        this.f3171ntlheqmsrt = iMax4;
        super.onMeasure(i13, i14);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f3183wwaezpbzkn : this.f3173pkzmftpjix;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f13;
        this.f3178stevsuqkhv.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x13 = motionEvent.getX();
            float y13 = motionEvent.getY();
            if (isEnabled() && nufgyqmvbu(x13, y13)) {
                this.f3156hkdspvbjdz = 1;
                this.f3153dsvhmnatus = x13;
                this.f3184wypolnanlu = y13;
            }
        } else if (actionMasked == 1) {
            if (this.f3156hkdspvbjdz == 2) {
                rgvfuqvkyq(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f3156hkdspvbjdz = 0;
            this.f3178stevsuqkhv.clear();
        } else if (actionMasked == 2) {
            int i13 = this.f3156hkdspvbjdz;
            if (i13 == 1) {
                float x14 = motionEvent.getX();
                float y14 = motionEvent.getY();
                if (Math.abs(x14 - this.f3153dsvhmnatus) > this.f3149cllcsxoeiz || Math.abs(y14 - this.f3184wypolnanlu) > this.f3149cllcsxoeiz) {
                    this.f3156hkdspvbjdz = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.f3153dsvhmnatus = x14;
                    this.f3184wypolnanlu = y14;
                    return true;
                }
            } else if (i13 == 2) {
                float x15 = motionEvent.getX();
                int thumbScrollRange = getThumbScrollRange();
                float f14 = x15 - this.f3153dsvhmnatus;
                if (thumbScrollRange != 0) {
                    f13 = f14 / thumbScrollRange;
                } else {
                    f13 = f14 > 0.0f ? 1.0f : -1.0f;
                }
                if (vipkmwdibw.zoijcleaow(this)) {
                    f13 = -f13;
                }
                float fGxszxtbevo = gxszxtbevo(this.f3179tzroggbefp + f13, 0.0f, 1.0f);
                if (fGxszxtbevo != this.f3179tzroggbefp) {
                    this.f3153dsvhmnatus = x15;
                    setThumbPosition(fGxszxtbevo);
                }
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.f3156hkdspvbjdz == 2) {
                rgvfuqvkyq(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f3156hkdspvbjdz = 0;
            this.f3178stevsuqkhv.clear();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z13) {
        super.setAllCaps(z13);
        getEmojiTextViewHelper().wkgbmnqykc(z13);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z13) {
        super.setChecked(z13);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            gtknphoqwx();
        } else {
            btonecajqb();
        }
        if (getWindowToken() != null && isLaidOut()) {
            iobyxmoadg(zIsChecked);
        } else {
            wkgbmnqykc();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.dxjokdxxww.kcexrzcfyt(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z13) {
        getEmojiTextViewHelper().eablkybsjg(z13);
        setTextOnInternal(this.f3183wwaezpbzkn);
        setTextOffInternal(this.f3173pkzmftpjix);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z13) {
        this.f3182vipkmwdibw = z13;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().iobyxmoadg(inputFilterArr));
    }

    public void setShowText(boolean z13) {
        if (this.f3163jpowsppfya != z13) {
            this.f3163jpowsppfya = z13;
            requestLayout();
            if (z13) {
                ojitshcjhn();
            }
        }
    }

    public void setSplitTrack(boolean z13) {
        this.f3168lmojexxdyd = z13;
        invalidate();
    }

    public void setSwitchMinWidth(int i13) {
        this.f3186yadqdtsiqt = i13;
        requestLayout();
    }

    public void setSwitchPadding(int i13) {
        this.f3158iozdgvuglv = i13;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f3161jhduphickx.getTypeface() == null || this.f3161jhduphickx.getTypeface().equals(typeface)) && (this.f3161jhduphickx.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f3161jhduphickx.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        btonecajqb();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            gtknphoqwx();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3189zdlpuopuiu;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3189zdlpuopuiu = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f13) {
        this.f3179tzroggbefp = f13;
        invalidate();
    }

    public void setThumbResource(int i13) {
        setThumbDrawable(nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13));
    }

    public void setThumbTextPadding(int i13) {
        this.f3148cdpycssgdh = i13;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f3187yggfygwlhe = colorStateList;
        this.f3160iwizpuwonk = true;
        zoijcleaow();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f3164jyumaefscl = mode;
        this.f3150cqumvgiudr = true;
        zoijcleaow();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3154esjtqupxsv;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3154esjtqupxsv = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i13) {
        setTrackDrawable(nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f3167lereixgezr = colorStateList;
        this.f3190zynmafqrjb = true;
        ppxfxbqfkf();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f3174pmvmpeiblj = mode;
        this.f3159istkbnxepw = true;
        ppxfxbqfkf();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3189zdlpuopuiu || drawable == this.f3154esjtqupxsv;
    }

    public void wflxmlrfwp(Typeface typeface, int i13) {
        if (i13 <= 0) {
            this.f3161jhduphickx.setFakeBoldText(false);
            this.f3161jhduphickx.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i13) : Typeface.create(typeface, i13);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i14 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i13;
            this.f3161jhduphickx.setFakeBoldText((i14 & 1) != 0);
            this.f3161jhduphickx.setTextSkewX((i14 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f3187yggfygwlhe = null;
        this.f3164jyumaefscl = null;
        this.f3160iwizpuwonk = false;
        this.f3150cqumvgiudr = false;
        this.f3167lereixgezr = null;
        this.f3174pmvmpeiblj = null;
        this.f3190zynmafqrjb = false;
        this.f3159istkbnxepw = false;
        this.f3178stevsuqkhv = VelocityTracker.obtain();
        this.f3182vipkmwdibw = true;
        this.f3181uwvvkdfqfp = new Rect();
        wypolnanlu.iobyxmoadg(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f3161jhduphickx = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        mbcevpiqjq mbcevpiqjqVarJyumaefscl = mbcevpiqjq.jyumaefscl(context, attributeSet, lqeggnwhkg.btonecajqb.SwitchCompat, i13, 0);
        jhduphickx.sflfametgt(this, context, lqeggnwhkg.btonecajqb.SwitchCompat, attributeSet, mbcevpiqjqVarJyumaefscl.oxmwwwfdhm(), i13, 0);
        Drawable drawableLqeggnwhkg = mbcevpiqjqVarJyumaefscl.lqeggnwhkg(lqeggnwhkg.btonecajqb.SwitchCompat_android_thumb);
        this.f3189zdlpuopuiu = drawableLqeggnwhkg;
        if (drawableLqeggnwhkg != null) {
            drawableLqeggnwhkg.setCallback(this);
        }
        Drawable drawableLqeggnwhkg2 = mbcevpiqjqVarJyumaefscl.lqeggnwhkg(lqeggnwhkg.btonecajqb.SwitchCompat_track);
        this.f3154esjtqupxsv = drawableLqeggnwhkg2;
        if (drawableLqeggnwhkg2 != null) {
            drawableLqeggnwhkg2.setCallback(this);
        }
        setTextOnInternal(mbcevpiqjqVarJyumaefscl.rgvfuqvkyq(lqeggnwhkg.btonecajqb.SwitchCompat_android_textOn));
        setTextOffInternal(mbcevpiqjqVarJyumaefscl.rgvfuqvkyq(lqeggnwhkg.btonecajqb.SwitchCompat_android_textOff));
        this.f3163jpowsppfya = mbcevpiqjqVarJyumaefscl.iobyxmoadg(lqeggnwhkg.btonecajqb.SwitchCompat_showText, true);
        this.f3148cdpycssgdh = mbcevpiqjqVarJyumaefscl.gxszxtbevo(lqeggnwhkg.btonecajqb.SwitchCompat_thumbTextPadding, 0);
        this.f3186yadqdtsiqt = mbcevpiqjqVarJyumaefscl.gxszxtbevo(lqeggnwhkg.btonecajqb.SwitchCompat_switchMinWidth, 0);
        this.f3158iozdgvuglv = mbcevpiqjqVarJyumaefscl.gxszxtbevo(lqeggnwhkg.btonecajqb.SwitchCompat_switchPadding, 0);
        this.f3168lmojexxdyd = mbcevpiqjqVarJyumaefscl.iobyxmoadg(lqeggnwhkg.btonecajqb.SwitchCompat_splitTrack, false);
        ColorStateList colorStateListPpxfxbqfkf = mbcevpiqjqVarJyumaefscl.ppxfxbqfkf(lqeggnwhkg.btonecajqb.SwitchCompat_thumbTint);
        if (colorStateListPpxfxbqfkf != null) {
            this.f3187yggfygwlhe = colorStateListPpxfxbqfkf;
            this.f3160iwizpuwonk = true;
        }
        PorterDuff.Mode modeEablkybsjg = yadqdtsiqt.eablkybsjg(mbcevpiqjqVarJyumaefscl.gtknphoqwx(lqeggnwhkg.btonecajqb.SwitchCompat_thumbTintMode, -1), null);
        if (this.f3164jyumaefscl != modeEablkybsjg) {
            this.f3164jyumaefscl = modeEablkybsjg;
            this.f3150cqumvgiudr = true;
        }
        if (this.f3160iwizpuwonk || this.f3150cqumvgiudr) {
            zoijcleaow();
        }
        ColorStateList colorStateListPpxfxbqfkf2 = mbcevpiqjqVarJyumaefscl.ppxfxbqfkf(lqeggnwhkg.btonecajqb.SwitchCompat_trackTint);
        if (colorStateListPpxfxbqfkf2 != null) {
            this.f3167lereixgezr = colorStateListPpxfxbqfkf2;
            this.f3190zynmafqrjb = true;
        }
        PorterDuff.Mode modeEablkybsjg2 = yadqdtsiqt.eablkybsjg(mbcevpiqjqVarJyumaefscl.gtknphoqwx(lqeggnwhkg.btonecajqb.SwitchCompat_trackTintMode, -1), null);
        if (this.f3174pmvmpeiblj != modeEablkybsjg2) {
            this.f3174pmvmpeiblj = modeEablkybsjg2;
            this.f3159istkbnxepw = true;
        }
        if (this.f3190zynmafqrjb || this.f3159istkbnxepw) {
            ppxfxbqfkf();
        }
        int iAgtfadlqog = mbcevpiqjqVarJyumaefscl.agtfadlqog(lqeggnwhkg.btonecajqb.SwitchCompat_switchTextAppearance, 0);
        if (iAgtfadlqog != 0) {
            draadjrbmk(context, iAgtfadlqog);
        }
        zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(this);
        this.f3176rlfsiqarku = zdlpuopuiuVar;
        zdlpuopuiuVar.wflxmlrfwp(attributeSet, i13);
        mbcevpiqjqVarJyumaefscl.cqumvgiudr();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3149cllcsxoeiz = viewConfiguration.getScaledTouchSlop();
        this.f3166kegysxyocb = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().ppxfxbqfkf(attributeSet, i13);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
