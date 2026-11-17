package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.ojitshcjhn;
import java.util.Locale;
import w1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
class gtknphoqwx implements TimePickerView.gxszxtbevo, nufgyqmvbu {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final ChipTextInputComboView f23518cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final ChipTextInputComboView f23519esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private MaterialButtonToggleGroup f23520istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final dxjokdxxww f23523lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final EditText f23524pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final TimeModel f23525yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final LinearLayout f23526zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final EditText f23527zynmafqrjb;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final TextWatcher f23522jyumaefscl = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final TextWatcher f23521iwizpuwonk = new zoijcleaow();

    class eablkybsjg extends com.google.android.material.timepicker.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ TimeModel f23528eablkybsjg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(Context context, int i13, TimeModel timeModel) {
            super(context, i13);
            this.f23528eablkybsjg = timeModel;
        }

        @Override // com.google.android.material.timepicker.iobyxmoadg, v1.iobyxmoadg
        public void lqeggnwhkg(View view, zdlpuopuiu zdlpuopuiuVar) {
            super.lqeggnwhkg(view, zdlpuopuiuVar);
            zdlpuopuiuVar.zfvoamnweg(view.getResources().getString(da.btonecajqb.material_minute_suffix, String.valueOf(this.f23528eablkybsjg.f23491cqumvgiudr)));
        }
    }

    class iobyxmoadg extends com.google.android.material.internal.gtknphoqwx {
        iobyxmoadg() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    gtknphoqwx.this.f23525yggfygwlhe.gtknphoqwx(0);
                } else {
                    gtknphoqwx.this.f23525yggfygwlhe.gtknphoqwx(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    class ppxfxbqfkf implements View.OnClickListener {
        ppxfxbqfkf() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            gtknphoqwx.this.eablkybsjg(((Integer) view.getTag(da.gxszxtbevo.selection_type)).intValue());
        }
    }

    class wkgbmnqykc extends com.google.android.material.timepicker.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ TimeModel f23532eablkybsjg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(Context context, int i13, TimeModel timeModel) {
            super(context, i13);
            this.f23532eablkybsjg = timeModel;
        }

        @Override // com.google.android.material.timepicker.iobyxmoadg, v1.iobyxmoadg
        public void lqeggnwhkg(View view, zdlpuopuiu zdlpuopuiuVar) {
            super.lqeggnwhkg(view, zdlpuopuiuVar);
            zdlpuopuiuVar.zfvoamnweg(view.getResources().getString(this.f23532eablkybsjg.eablkybsjg(), String.valueOf(this.f23532eablkybsjg.gxszxtbevo())));
        }
    }

    class zoijcleaow extends com.google.android.material.internal.gtknphoqwx {
        zoijcleaow() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    gtknphoqwx.this.f23525yggfygwlhe.btonecajqb(0);
                } else {
                    gtknphoqwx.this.f23525yggfygwlhe.btonecajqb(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public gtknphoqwx(LinearLayout linearLayout, TimeModel timeModel) {
        this.f23526zdlpuopuiu = linearLayout;
        this.f23525yggfygwlhe = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(da.gxszxtbevo.material_minute_text_input);
        this.f23518cqumvgiudr = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(da.gxszxtbevo.material_hour_text_input);
        this.f23519esjtqupxsv = chipTextInputComboView2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(da.gxszxtbevo.material_label);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(da.gxszxtbevo.material_label);
        textView.setText(resources.getString(da.btonecajqb.material_timepicker_minute));
        textView2.setText(resources.getString(da.btonecajqb.material_timepicker_hour));
        chipTextInputComboView.setTag(da.gxszxtbevo.selection_type, 12);
        chipTextInputComboView2.setTag(da.gxszxtbevo.selection_type, 10);
        if (timeModel.f23494jyumaefscl == 0) {
            wflxmlrfwp();
        }
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
        chipTextInputComboView2.setOnClickListener(ppxfxbqfkfVar);
        chipTextInputComboView.setOnClickListener(ppxfxbqfkfVar);
        chipTextInputComboView2.ppxfxbqfkf(timeModel.lqeggnwhkg());
        chipTextInputComboView.ppxfxbqfkf(timeModel.nufgyqmvbu());
        this.f23524pmvmpeiblj = chipTextInputComboView2.eablkybsjg().getEditText();
        this.f23527zynmafqrjb = chipTextInputComboView.eablkybsjg().getEditText();
        this.f23523lereixgezr = new dxjokdxxww(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.gxszxtbevo(new wkgbmnqykc(linearLayout.getContext(), da.btonecajqb.material_hour_selection, timeModel));
        chipTextInputComboView.gxszxtbevo(new eablkybsjg(linearLayout.getContext(), da.btonecajqb.material_minute_selection, timeModel));
        nufgyqmvbu();
    }

    private void agtfadlqog() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f23520istkbnxepw;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.eablkybsjg(this.f23525yggfygwlhe.f23495lereixgezr == 0 ? da.gxszxtbevo.material_clock_period_am_button : da.gxszxtbevo.material_clock_period_pm_button);
    }

    private void btonecajqb() {
        this.f23524pmvmpeiblj.removeTextChangedListener(this.f23521iwizpuwonk);
        this.f23527zynmafqrjb.removeTextChangedListener(this.f23522jyumaefscl);
    }

    private void draadjrbmk(TimeModel timeModel) {
        btonecajqb();
        Locale locale = this.f23526zdlpuopuiu.getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(timeModel.f23491cqumvgiudr));
        String str2 = String.format(locale, "%02d", Integer.valueOf(timeModel.gxszxtbevo()));
        this.f23518cqumvgiudr.lqeggnwhkg(str);
        this.f23519esjtqupxsv.lqeggnwhkg(str2);
        gxszxtbevo();
        agtfadlqog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void dxjokdxxww(MaterialButtonToggleGroup materialButtonToggleGroup, int i13, boolean z13) {
        if (z13) {
            this.f23525yggfygwlhe.wflxmlrfwp(i13 == da.gxszxtbevo.material_clock_period_pm_button ? 1 : 0);
        }
    }

    private void gxszxtbevo() {
        this.f23524pmvmpeiblj.addTextChangedListener(this.f23521iwizpuwonk);
        this.f23527zynmafqrjb.addTextChangedListener(this.f23522jyumaefscl);
    }

    private void wflxmlrfwp() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f23526zdlpuopuiu.findViewById(da.gxszxtbevo.material_clock_period_toggle);
        this.f23520istkbnxepw = materialButtonToggleGroup;
        materialButtonToggleGroup.zoijcleaow(new MaterialButtonToggleGroup.wkgbmnqykc() { // from class: com.google.android.material.timepicker.btonecajqb
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.wkgbmnqykc
            public final void iobyxmoadg(MaterialButtonToggleGroup materialButtonToggleGroup2, int i13, boolean z13) {
                this.f23511iobyxmoadg.dxjokdxxww(materialButtonToggleGroup2, i13, z13);
            }
        });
        this.f23520istkbnxepw.setVisibility(0);
        agtfadlqog();
    }

    @Override // com.google.android.material.timepicker.TimePickerView.gxszxtbevo
    public void eablkybsjg(int i13) {
        this.f23525yggfygwlhe.f23492esjtqupxsv = i13;
        this.f23518cqumvgiudr.setChecked(i13 == 12);
        this.f23519esjtqupxsv.setChecked(i13 == 10);
        agtfadlqog();
    }

    public void gtknphoqwx() {
        this.f23518cqumvgiudr.setChecked(this.f23525yggfygwlhe.f23492esjtqupxsv == 12);
        this.f23519esjtqupxsv.setChecked(this.f23525yggfygwlhe.f23492esjtqupxsv == 10);
    }

    @Override // com.google.android.material.timepicker.nufgyqmvbu
    public void invalidate() {
        draadjrbmk(this.f23525yggfygwlhe);
    }

    @Override // com.google.android.material.timepicker.nufgyqmvbu
    public void iobyxmoadg() {
        this.f23526zdlpuopuiu.setVisibility(0);
        eablkybsjg(this.f23525yggfygwlhe.f23492esjtqupxsv);
    }

    public void lqeggnwhkg() {
        this.f23518cqumvgiudr.setChecked(false);
        this.f23519esjtqupxsv.setChecked(false);
    }

    public void nufgyqmvbu() {
        gxszxtbevo();
        draadjrbmk(this.f23525yggfygwlhe);
        this.f23523lereixgezr.iobyxmoadg();
    }

    @Override // com.google.android.material.timepicker.nufgyqmvbu
    public void zoijcleaow() {
        View focusedChild = this.f23526zdlpuopuiu.getFocusedChild();
        if (focusedChild != null) {
            ojitshcjhn.lqeggnwhkg(focusedChild, false);
        }
        this.f23526zdlpuopuiu.setVisibility(8);
    }
}
