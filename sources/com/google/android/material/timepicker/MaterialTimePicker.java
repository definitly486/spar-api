package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialTimePicker extends DialogFragment implements TimePickerView.wkgbmnqykc {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f23466cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private TimeModel f23467cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private TimePickerView f23468cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private ViewStub f23470esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private MaterialButton f23471hcddaimhww;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private CharSequence f23473iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private int f23474istkbnxepw;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private Button f23476jpowsppfya;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private lqeggnwhkg f23478lereixgezr;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private CharSequence f23480pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private gtknphoqwx f23481pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private CharSequence f23482wwaezpbzkn;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private nufgyqmvbu f23487zynmafqrjb;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Set f23486zdlpuopuiu = new LinkedHashSet();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Set f23484yggfygwlhe = new LinkedHashSet();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Set f23477jyumaefscl = new LinkedHashSet();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Set f23475iwizpuwonk = new LinkedHashSet();

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private int f23483yadqdtsiqt = 0;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private int f23479lmojexxdyd = 0;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private int f23485ylkuphrtab = 0;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private int f23472hkdspvbjdz = 0;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private int f23469dsvhmnatus = 0;

    class iobyxmoadg implements View.OnClickListener {
        iobyxmoadg() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialTimePicker.this.f23486zdlpuopuiu.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialTimePicker.this.dismiss();
        }
    }

    class ppxfxbqfkf implements View.OnClickListener {
        ppxfxbqfkf() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
            materialTimePicker.f23472hkdspvbjdz = materialTimePicker.f23472hkdspvbjdz == 0 ? 1 : 0;
            MaterialTimePicker materialTimePicker2 = MaterialTimePicker.this;
            materialTimePicker2.tzroggbefp(materialTimePicker2.f23471hcddaimhww);
        }
    }

    class zoijcleaow implements View.OnClickListener {
        zoijcleaow() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialTimePicker.this.f23484yggfygwlhe.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialTimePicker.this.dismiss();
        }
    }

    private int cllcsxoeiz() {
        int i13 = this.f23469dsvhmnatus;
        if (i13 != 0) {
            return i13;
        }
        TypedValue typedValueIobyxmoadg = oa.zoijcleaow.iobyxmoadg(requireContext(), da.zoijcleaow.materialTimePickerTheme);
        if (typedValueIobyxmoadg == null) {
            return 0;
        }
        return typedValueIobyxmoadg.data;
    }

    private nufgyqmvbu dsvhmnatus(int i13, TimePickerView timePickerView, ViewStub viewStub) {
        if (i13 != 0) {
            if (this.f23481pmvmpeiblj == null) {
                this.f23481pmvmpeiblj = new gtknphoqwx((LinearLayout) viewStub.inflate(), this.f23467cllcsxoeiz);
            }
            this.f23481pmvmpeiblj.lqeggnwhkg();
            return this.f23481pmvmpeiblj;
        }
        lqeggnwhkg lqeggnwhkgVar = this.f23478lereixgezr;
        if (lqeggnwhkgVar == null) {
            lqeggnwhkgVar = new lqeggnwhkg(timePickerView, this.f23467cllcsxoeiz);
        }
        this.f23478lereixgezr = lqeggnwhkgVar;
        return lqeggnwhkgVar;
    }

    private Pair hkdspvbjdz(int i13) {
        if (i13 == 0) {
            return new Pair(Integer.valueOf(this.f23474istkbnxepw), Integer.valueOf(da.btonecajqb.material_timepicker_text_input_mode_description));
        }
        if (i13 == 1) {
            return new Pair(Integer.valueOf(this.f23466cdpycssgdh), Integer.valueOf(da.btonecajqb.material_timepicker_clock_mode_description));
        }
        throw new IllegalArgumentException("no icon for mode: " + i13);
    }

    private void kegysxyocb() {
        Button button = this.f23476jpowsppfya;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }

    private void stevsuqkhv(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.f23467cllcsxoeiz = timeModel;
        if (timeModel == null) {
            this.f23467cllcsxoeiz = new TimeModel();
        }
        this.f23472hkdspvbjdz = bundle.getInt("TIME_PICKER_INPUT_MODE", this.f23467cllcsxoeiz.f23494jyumaefscl != 1 ? 0 : 1);
        this.f23483yadqdtsiqt = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.f23473iozdgvuglv = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.f23479lmojexxdyd = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.f23482wwaezpbzkn = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.f23485ylkuphrtab = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.f23480pkzmftpjix = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.f23469dsvhmnatus = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tzroggbefp(MaterialButton materialButton) {
        if (materialButton == null || this.f23468cqumvgiudr == null || this.f23470esjtqupxsv == null) {
            return;
        }
        nufgyqmvbu nufgyqmvbuVar = this.f23487zynmafqrjb;
        if (nufgyqmvbuVar != null) {
            nufgyqmvbuVar.zoijcleaow();
        }
        nufgyqmvbu nufgyqmvbuVarDsvhmnatus = dsvhmnatus(this.f23472hkdspvbjdz, this.f23468cqumvgiudr, this.f23470esjtqupxsv);
        this.f23487zynmafqrjb = nufgyqmvbuVarDsvhmnatus;
        nufgyqmvbuVarDsvhmnatus.iobyxmoadg();
        this.f23487zynmafqrjb.invalidate();
        Pair pairHkdspvbjdz = hkdspvbjdz(this.f23472hkdspvbjdz);
        materialButton.setIconResource(((Integer) pairHkdspvbjdz.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pairHkdspvbjdz.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wypolnanlu() {
        nufgyqmvbu nufgyqmvbuVar = this.f23487zynmafqrjb;
        if (nufgyqmvbuVar instanceof gtknphoqwx) {
            ((gtknphoqwx) nufgyqmvbuVar).gtknphoqwx();
        }
    }

    @Override // com.google.android.material.timepicker.TimePickerView.wkgbmnqykc
    public void gtknphoqwx() {
        this.f23472hkdspvbjdz = 1;
        tzroggbefp(this.f23471hcddaimhww);
        this.f23481pmvmpeiblj.gtknphoqwx();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f23477jyumaefscl.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        stevsuqkhv(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), cllcsxoeiz());
        Context context = dialog.getContext();
        ra.lqeggnwhkg lqeggnwhkgVar = new ra.lqeggnwhkg(context, null, da.zoijcleaow.materialTimePickerStyle, da.gtknphoqwx.Widget_MaterialComponents_TimePicker);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, da.draadjrbmk.MaterialTimePicker, da.zoijcleaow.materialTimePickerStyle, da.gtknphoqwx.Widget_MaterialComponents_TimePicker);
        this.f23466cdpycssgdh = typedArrayObtainStyledAttributes.getResourceId(da.draadjrbmk.MaterialTimePicker_clockIcon, 0);
        this.f23474istkbnxepw = typedArrayObtainStyledAttributes.getResourceId(da.draadjrbmk.MaterialTimePicker_keyboardIcon, 0);
        int color = typedArrayObtainStyledAttributes.getColor(da.draadjrbmk.MaterialTimePicker_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        lqeggnwhkgVar.hkdspvbjdz(context);
        lqeggnwhkgVar.crxdokpmqz(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(lqeggnwhkgVar);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        lqeggnwhkgVar.sopmlzcsov(jhduphickx.yggfygwlhe(window.getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(da.nufgyqmvbu.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(da.gxszxtbevo.material_timepicker_view);
        this.f23468cqumvgiudr = timePickerView;
        timePickerView.istkbnxepw(this);
        this.f23470esjtqupxsv = (ViewStub) viewGroup2.findViewById(da.gxszxtbevo.material_textinput_timepicker);
        this.f23471hcddaimhww = (MaterialButton) viewGroup2.findViewById(da.gxszxtbevo.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(da.gxszxtbevo.header_title);
        int i13 = this.f23483yadqdtsiqt;
        if (i13 != 0) {
            textView.setText(i13);
        } else if (!TextUtils.isEmpty(this.f23473iozdgvuglv)) {
            textView.setText(this.f23473iozdgvuglv);
        }
        tzroggbefp(this.f23471hcddaimhww);
        Button button = (Button) viewGroup2.findViewById(da.gxszxtbevo.material_timepicker_ok_button);
        button.setOnClickListener(new iobyxmoadg());
        int i14 = this.f23479lmojexxdyd;
        if (i14 != 0) {
            button.setText(i14);
        } else if (!TextUtils.isEmpty(this.f23482wwaezpbzkn)) {
            button.setText(this.f23482wwaezpbzkn);
        }
        Button button2 = (Button) viewGroup2.findViewById(da.gxszxtbevo.material_timepicker_cancel_button);
        this.f23476jpowsppfya = button2;
        button2.setOnClickListener(new zoijcleaow());
        int i15 = this.f23485ylkuphrtab;
        if (i15 != 0) {
            this.f23476jpowsppfya.setText(i15);
        } else if (!TextUtils.isEmpty(this.f23480pkzmftpjix)) {
            this.f23476jpowsppfya.setText(this.f23480pkzmftpjix);
        }
        kegysxyocb();
        this.f23471hcddaimhww.setOnClickListener(new ppxfxbqfkf());
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f23487zynmafqrjb = null;
        this.f23478lereixgezr = null;
        this.f23481pmvmpeiblj = null;
        TimePickerView timePickerView = this.f23468cqumvgiudr;
        if (timePickerView != null) {
            timePickerView.istkbnxepw(null);
            this.f23468cqumvgiudr = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f23475iwizpuwonk.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.f23467cllcsxoeiz);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.f23472hkdspvbjdz);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.f23483yadqdtsiqt);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.f23473iozdgvuglv);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.f23479lmojexxdyd);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.f23482wwaezpbzkn);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.f23485ylkuphrtab);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.f23480pkzmftpjix);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.f23469dsvhmnatus);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f23487zynmafqrjb instanceof gtknphoqwx) {
            view.postDelayed(new Runnable() { // from class: com.google.android.material.timepicker.ppxfxbqfkf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23549zdlpuopuiu.wypolnanlu();
                }
            }, 100L);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean z13) {
        super.setCancelable(z13);
        kegysxyocb();
    }
}
