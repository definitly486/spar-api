package b;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final nufgyqmvbu f14835iobyxmoadg = new nufgyqmvbu();

    private nufgyqmvbu() {
    }

    public final void agtfadlqog(ViewStructure viewStructure, String str) {
        viewStructure.setClassName(str);
    }

    public final void btonecajqb(ViewStructure viewStructure, int i13) {
        viewStructure.setAutofillType(i13);
    }

    public final void cqumvgiudr(ViewStructure viewStructure, boolean z13) {
        viewStructure.setLongClickable(z13);
    }

    public final void draadjrbmk(ViewStructure viewStructure, boolean z13) {
        viewStructure.setCheckable(z13);
    }

    public final void dxjokdxxww(ViewStructure viewStructure, AutofillId autofillId, int i13) {
        viewStructure.setAutofillId(autofillId, i13);
    }

    public final boolean eablkybsjg(AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    public final void esjtqupxsv(ViewStructure viewStructure, boolean z13) {
        viewStructure.setSelected(z13);
    }

    public final void gtknphoqwx(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    public final boolean gxszxtbevo(AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    public final int iobyxmoadg(ViewStructure viewStructure, int i13) {
        return viewStructure.addChildCount(i13);
    }

    public final void iwizpuwonk(ViewStructure viewStructure, int i13) {
        viewStructure.setInputType(i13);
    }

    public final void jyumaefscl(ViewStructure viewStructure, int i13, String str, String str2, String str3) {
        viewStructure.setId(i13, str, str2, str3);
    }

    public final void kcexrzcfyt(ViewStructure viewStructure, boolean z13) {
        viewStructure.setEnabled(z13);
    }

    public final void lereixgezr(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }

    public final ViewStructure lqeggnwhkg(ViewStructure viewStructure, int i13) {
        return viewStructure.newChild(i13);
    }

    public final void nufgyqmvbu(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public final void ojitshcjhn(ViewStructure viewStructure, boolean z13) {
        viewStructure.setClickable(z13);
    }

    public final void oxmwwwfdhm(ViewStructure viewStructure, int i13, int i14, int i15, int i16, int i17, int i18) {
        viewStructure.setDimens(i13, i14, i15, i16, i17, i18);
    }

    public final void pmvmpeiblj(ViewStructure viewStructure, int i13) {
        viewStructure.setVisibility(i13);
    }

    public final boolean ppxfxbqfkf(AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    public final void rgvfuqvkyq(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setContentDescription(charSequence);
    }

    public final void vdvldrhtss(ViewStructure viewStructure, boolean z13) {
        viewStructure.setDataIsSensitive(z13);
    }

    public final void wflxmlrfwp(ViewStructure viewStructure, boolean z13) {
        viewStructure.setChecked(z13);
    }

    public final boolean wkgbmnqykc(AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    public final void yggfygwlhe(ViewStructure viewStructure, boolean z13) {
        viewStructure.setFocused(z13);
    }

    public final void zdlpuopuiu(ViewStructure viewStructure, boolean z13) {
        viewStructure.setFocusable(z13);
    }

    public final AutofillValue zoijcleaow(String str) {
        return AutofillValue.forText(str);
    }

    public final CharSequence zynmafqrjb(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }
}
