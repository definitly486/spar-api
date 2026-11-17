package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.ylkuphrtab;
import java.util.List;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
public class jyumaefscl extends androidx.appcompat.widget.ppxfxbqfkf {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f23307cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final ylkuphrtab f23308cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final AccessibilityManager f23309esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private ColorStateList f23310istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final Rect f23311lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final int f23312pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private ColorStateList f23313yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final float f23314zynmafqrjb;

    class iobyxmoadg implements AdapterView.OnItemClickListener {
        iobyxmoadg() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
            jyumaefscl jyumaefsclVar = jyumaefscl.this;
            jyumaefscl.this.draadjrbmk(i13 < 0 ? jyumaefsclVar.f23308cqumvgiudr.jyumaefscl() : jyumaefsclVar.getAdapter().getItem(i13));
            AdapterView.OnItemClickListener onItemClickListener = jyumaefscl.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i13 < 0) {
                    view = jyumaefscl.this.f23308cqumvgiudr.esjtqupxsv();
                    i13 = jyumaefscl.this.f23308cqumvgiudr.cqumvgiudr();
                    j13 = jyumaefscl.this.f23308cqumvgiudr.iwizpuwonk();
                }
                onItemClickListener.onItemClick(jyumaefscl.this.f23308cqumvgiudr.rgvfuqvkyq(), view, i13, j13);
            }
            jyumaefscl.this.f23308cqumvgiudr.dismiss();
        }
    }

    private class zoijcleaow extends ArrayAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private ColorStateList f23316iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private ColorStateList f23318zoijcleaow;

        zoijcleaow(Context context, int i13, String[] strArr) {
            super(context, i13, strArr);
            gxszxtbevo();
        }

        private ColorStateList eablkybsjg() {
            if (!wkgbmnqykc()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{jyumaefscl.this.f23313yadqdtsiqt.getColorForState(iArr, 0), 0});
        }

        private ColorStateList iobyxmoadg() {
            if (!ppxfxbqfkf() || !wkgbmnqykc()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            int colorForState = jyumaefscl.this.f23313yadqdtsiqt.getColorForState(iArr2, 0);
            int colorForState2 = jyumaefscl.this.f23313yadqdtsiqt.getColorForState(iArr, 0);
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{ia.iobyxmoadg.dxjokdxxww(jyumaefscl.this.f23307cdpycssgdh, colorForState), ia.iobyxmoadg.dxjokdxxww(jyumaefscl.this.f23307cdpycssgdh, colorForState2), jyumaefscl.this.f23307cdpycssgdh});
        }

        private boolean ppxfxbqfkf() {
            return jyumaefscl.this.f23307cdpycssgdh != 0;
        }

        private boolean wkgbmnqykc() {
            return jyumaefscl.this.f23313yadqdtsiqt != null;
        }

        private Drawable zoijcleaow() {
            if (!ppxfxbqfkf()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(jyumaefscl.this.f23307cdpycssgdh);
            if (this.f23318zoijcleaow == null) {
                return colorDrawable;
            }
            k1.iobyxmoadg.ojitshcjhn(colorDrawable, this.f23316iobyxmoadg);
            return new RippleDrawable(this.f23318zoijcleaow, colorDrawable, null);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i13, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i13, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                jhduphickx.weqkydbzbr(textView, jyumaefscl.this.getText().toString().contentEquals(textView.getText()) ? zoijcleaow() : null);
            }
            return view2;
        }

        void gxszxtbevo() {
            this.f23318zoijcleaow = eablkybsjg();
            this.f23316iobyxmoadg = iobyxmoadg();
        }
    }

    public jyumaefscl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, da.zoijcleaow.autoCompleteTextViewStyle);
    }

    private int btonecajqb() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutGxszxtbevo = gxszxtbevo();
        int i13 = 0;
        if (adapter == null || textInputLayoutGxszxtbevo == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f23308cqumvgiudr.cqumvgiudr()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutGxszxtbevo);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableNufgyqmvbu = this.f23308cqumvgiudr.nufgyqmvbu();
        if (drawableNufgyqmvbu != null) {
            drawableNufgyqmvbu.getPadding(this.f23311lereixgezr);
            Rect rect = this.f23311lereixgezr;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutGxszxtbevo.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void draadjrbmk(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    private boolean dxjokdxxww() {
        AccessibilityManager accessibilityManager = this.f23309esjtqupxsv;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private void gtknphoqwx() {
        TextInputLayout textInputLayoutGxszxtbevo = gxszxtbevo();
        if (textInputLayoutGxszxtbevo != null) {
            textInputLayoutGxszxtbevo.iyctptxqzt();
        }
    }

    private TextInputLayout gxszxtbevo() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean lqeggnwhkg() {
        return dxjokdxxww() || nufgyqmvbu();
    }

    private boolean nufgyqmvbu() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f23309esjtqupxsv;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f23309esjtqupxsv.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (lqeggnwhkg()) {
            this.f23308cqumvgiudr.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f23310istkbnxepw;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutGxszxtbevo = gxszxtbevo();
        return (textInputLayoutGxszxtbevo == null || !textInputLayoutGxszxtbevo.kegysxyocb()) ? super.getHint() : textInputLayoutGxszxtbevo.getHint();
    }

    public float getPopupElevation() {
        return this.f23314zynmafqrjb;
    }

    public int getSimpleItemSelectedColor() {
        return this.f23307cdpycssgdh;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f23313yadqdtsiqt;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutGxszxtbevo = gxszxtbevo();
        if (textInputLayoutGxszxtbevo != null && textInputLayoutGxszxtbevo.kegysxyocb() && super.getHint() == null && com.google.android.material.internal.eablkybsjg.wkgbmnqykc()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23308cqumvgiudr.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (View.MeasureSpec.getMode(i13) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), btonecajqb()), View.MeasureSpec.getSize(i13)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z13) {
        if (lqeggnwhkg()) {
            return;
        }
        super.onWindowFocusChanged(z13);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t13) {
        super.setAdapter(t13);
        this.f23308cqumvgiudr.agtfadlqog(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ylkuphrtab ylkuphrtabVar = this.f23308cqumvgiudr;
        if (ylkuphrtabVar != null) {
            ylkuphrtabVar.ppxfxbqfkf(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i13) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i13));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f23310istkbnxepw = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof ra.lqeggnwhkg) {
            ((ra.lqeggnwhkg) dropDownBackground).crxdokpmqz(this.f23310istkbnxepw);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f23308cqumvgiudr.hkdspvbjdz(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i13) {
        super.setRawInputType(i13);
        gtknphoqwx();
    }

    public void setSimpleItemSelectedColor(int i13) {
        this.f23307cdpycssgdh = i13;
        if (getAdapter() instanceof zoijcleaow) {
            ((zoijcleaow) getAdapter()).gxszxtbevo();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f23313yadqdtsiqt = colorStateList;
        if (getAdapter() instanceof zoijcleaow) {
            ((zoijcleaow) getAdapter()).gxszxtbevo();
        }
    }

    public void setSimpleItems(int i13) {
        setSimpleItems(getResources().getStringArray(i13));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (lqeggnwhkg()) {
            this.f23308cqumvgiudr.iobyxmoadg();
        } else {
            super.showDropDown();
        }
    }

    public jyumaefscl(Context context, AttributeSet attributeSet, int i13) {
        super(ta.iobyxmoadg.ppxfxbqfkf(context, attributeSet, i13, 0), attributeSet, i13);
        this.f23311lereixgezr = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayDxjokdxxww = com.google.android.material.internal.draadjrbmk.dxjokdxxww(context2, attributeSet, da.draadjrbmk.MaterialAutoCompleteTextView, i13, da.gtknphoqwx.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.MaterialAutoCompleteTextView_android_inputType) && typedArrayDxjokdxxww.getInt(da.draadjrbmk.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.f23312pmvmpeiblj = typedArrayDxjokdxxww.getResourceId(da.draadjrbmk.MaterialAutoCompleteTextView_simpleItemLayout, da.nufgyqmvbu.mtrl_auto_complete_simple_item);
        this.f23314zynmafqrjb = typedArrayDxjokdxxww.getDimensionPixelOffset(da.draadjrbmk.MaterialAutoCompleteTextView_android_popupElevation, da.wkgbmnqykc.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.MaterialAutoCompleteTextView_dropDownBackgroundTint)) {
            this.f23310istkbnxepw = ColorStateList.valueOf(typedArrayDxjokdxxww.getColor(da.draadjrbmk.MaterialAutoCompleteTextView_dropDownBackgroundTint, 0));
        }
        this.f23307cdpycssgdh = typedArrayDxjokdxxww.getColor(da.draadjrbmk.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.f23313yadqdtsiqt = oa.ppxfxbqfkf.iobyxmoadg(context2, typedArrayDxjokdxxww, da.draadjrbmk.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.f23309esjtqupxsv = (AccessibilityManager) context2.getSystemService("accessibility");
        ylkuphrtab ylkuphrtabVar = new ylkuphrtab(context2);
        this.f23308cqumvgiudr = ylkuphrtabVar;
        ylkuphrtabVar.pkzmftpjix(true);
        ylkuphrtabVar.cdpycssgdh(this);
        ylkuphrtabVar.ylkuphrtab(2);
        ylkuphrtabVar.agtfadlqog(getAdapter());
        ylkuphrtabVar.jpowsppfya(new iobyxmoadg());
        if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.MaterialAutoCompleteTextView_simpleItems)) {
            setSimpleItems(typedArrayDxjokdxxww.getResourceId(da.draadjrbmk.MaterialAutoCompleteTextView_simpleItems, 0));
        }
        typedArrayDxjokdxxww.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new zoijcleaow(getContext(), this.f23312pmvmpeiblj, strArr));
    }
}
