package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.jlmebxxoox;
import androidx.appcompat.widget.wwaezpbzkn;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements gtknphoqwx.iobyxmoadg, View.OnClickListener, ActionMenuView.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    eablkybsjg.zoijcleaow f2746cdpycssgdh;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private int f2747hcddaimhww;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    zoijcleaow f2748iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private Drawable f2749istkbnxepw;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f2750lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private int f2751pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    lqeggnwhkg f2752pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private boolean f2753wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private wwaezpbzkn f2754yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private int f2755ylkuphrtab;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private CharSequence f2756zynmafqrjb;

    private class iobyxmoadg extends wwaezpbzkn {
        public iobyxmoadg() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.wwaezpbzkn
        protected boolean ppxfxbqfkf() {
            draadjrbmk.eablkybsjg eablkybsjgVarZoijcleaow;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            eablkybsjg.zoijcleaow zoijcleaowVar = actionMenuItemView.f2746cdpycssgdh;
            return zoijcleaowVar != null && zoijcleaowVar.wkgbmnqykc(actionMenuItemView.f2752pmvmpeiblj) && (eablkybsjgVarZoijcleaow = zoijcleaow()) != null && eablkybsjgVarZoijcleaow.zoijcleaow();
        }

        @Override // androidx.appcompat.widget.wwaezpbzkn
        public draadjrbmk.eablkybsjg zoijcleaow() {
            zoijcleaow zoijcleaowVar = ActionMenuItemView.this.f2748iozdgvuglv;
            if (zoijcleaowVar != null) {
                return zoijcleaowVar.iobyxmoadg();
            }
            return null;
        }
    }

    public static abstract class zoijcleaow {
        public abstract draadjrbmk.eablkybsjg iobyxmoadg();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void yggfygwlhe() {
        boolean z13 = true;
        boolean z14 = !TextUtils.isEmpty(this.f2756zynmafqrjb);
        if (this.f2749istkbnxepw != null && (!this.f2752pmvmpeiblj.zynmafqrjb() || (!this.f2750lmojexxdyd && !this.f2753wwaezpbzkn))) {
            z13 = false;
        }
        boolean z15 = z14 & z13;
        setText(z15 ? this.f2756zynmafqrjb : null);
        CharSequence contentDescription = this.f2752pmvmpeiblj.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z15 ? null : this.f2752pmvmpeiblj.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f2752pmvmpeiblj.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            jlmebxxoox.iobyxmoadg(this, z15 ? null : this.f2752pmvmpeiblj.getTitle());
        } else {
            jlmebxxoox.iobyxmoadg(this, tooltipText);
        }
    }

    private boolean zdlpuopuiu() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i13 = configuration.screenWidthDp;
        return i13 >= 480 || (i13 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // androidx.appcompat.view.menu.gtknphoqwx.iobyxmoadg
    public boolean eablkybsjg() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.gtknphoqwx.iobyxmoadg
    public lqeggnwhkg getItemData() {
        return this.f2752pmvmpeiblj;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.iobyxmoadg
    public boolean iobyxmoadg() {
        return kcexrzcfyt();
    }

    public boolean kcexrzcfyt() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        eablkybsjg.zoijcleaow zoijcleaowVar = this.f2746cdpycssgdh;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.wkgbmnqykc(this.f2752pmvmpeiblj);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2750lmojexxdyd = zdlpuopuiu();
        yggfygwlhe();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i13, int i14) {
        int i15;
        boolean zKcexrzcfyt = kcexrzcfyt();
        if (zKcexrzcfyt && (i15 = this.f2751pkzmftpjix) >= 0) {
            super.setPadding(i15, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i13, i14);
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f2755ylkuphrtab) : this.f2755ylkuphrtab;
        if (mode != 1073741824 && this.f2755ylkuphrtab > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i14);
        }
        if (zKcexrzcfyt || this.f2749istkbnxepw == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f2749istkbnxepw.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        wwaezpbzkn wwaezpbzknVar;
        if (this.f2752pmvmpeiblj.hasSubMenu() && (wwaezpbzknVar = this.f2754yadqdtsiqt) != null && wwaezpbzknVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.gtknphoqwx.iobyxmoadg
    public void ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar, int i13) {
        this.f2752pmvmpeiblj = lqeggnwhkgVar;
        setIcon(lqeggnwhkgVar.getIcon());
        setTitle(lqeggnwhkgVar.dxjokdxxww(this));
        setId(lqeggnwhkgVar.getItemId());
        setVisibility(lqeggnwhkgVar.isVisible() ? 0 : 8);
        setEnabled(lqeggnwhkgVar.isEnabled());
        if (lqeggnwhkgVar.hasSubMenu() && this.f2754yadqdtsiqt == null) {
            this.f2754yadqdtsiqt = new iobyxmoadg();
        }
    }

    public void setCheckable(boolean z13) {
    }

    public void setChecked(boolean z13) {
    }

    public void setExpandedFormat(boolean z13) {
        if (this.f2753wwaezpbzkn != z13) {
            this.f2753wwaezpbzkn = z13;
            lqeggnwhkg lqeggnwhkgVar = this.f2752pmvmpeiblj;
            if (lqeggnwhkgVar != null) {
                lqeggnwhkgVar.ppxfxbqfkf();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2749istkbnxepw = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i13 = this.f2747hcddaimhww;
            if (intrinsicWidth > i13) {
                intrinsicHeight = (int) (intrinsicHeight * (i13 / intrinsicWidth));
                intrinsicWidth = i13;
            }
            if (intrinsicHeight > i13) {
                intrinsicWidth = (int) (intrinsicWidth * (i13 / intrinsicHeight));
            } else {
                i13 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i13);
        }
        setCompoundDrawables(drawable, null, null, null);
        yggfygwlhe();
    }

    public void setItemInvoker(eablkybsjg.zoijcleaow zoijcleaowVar) {
        this.f2746cdpycssgdh = zoijcleaowVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i13, int i14, int i15, int i16) {
        this.f2751pkzmftpjix = i13;
        super.setPadding(i13, i14, i15, i16);
    }

    public void setPopupCallback(zoijcleaow zoijcleaowVar) {
        this.f2748iozdgvuglv = zoijcleaowVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2756zynmafqrjb = charSequence;
        yggfygwlhe();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.iobyxmoadg
    public boolean zoijcleaow() {
        return kcexrzcfyt() && this.f2752pmvmpeiblj.getIcon() == null;
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Resources resources = context.getResources();
        this.f2750lmojexxdyd = zdlpuopuiu();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lqeggnwhkg.btonecajqb.ActionMenuItemView, i13, 0);
        this.f2755ylkuphrtab = typedArrayObtainStyledAttributes.getDimensionPixelSize(lqeggnwhkg.btonecajqb.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f2747hcddaimhww = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2751pkzmftpjix = -1;
        setSaveEnabled(false);
    }
}
