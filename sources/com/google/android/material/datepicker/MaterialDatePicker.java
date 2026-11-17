package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.yggfygwlhe;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.jpowsppfya;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import v1.jhduphickx;
import v1.pkzmftpjix;
import v1.skhdrjzrfn;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialDatePicker<S> extends DialogFragment {

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    static final Object f22590crxdokpmqz = "CONFIRM_BUTTON_TAG";

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    static final Object f22591jlmebxxoox = "CANCEL_BUTTON_TAG";

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    static final Object f22592ribwqtqdhb = "TOGGLE_BUTTON_TAG";

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f22593cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private int f22594cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f22595cqumvgiudr;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private CharSequence f22596dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private DateSelector f22597esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private CharSequence f22598hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private CharSequence f22599hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private boolean f22600iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private MaterialCalendar f22601istkbnxepw;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private int f22603jpowsppfya;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private CheckableImageButton f22605kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private agtfadlqog f22606lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private int f22607lmojexxdyd;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private Button f22608mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private boolean f22609ntlheqmsrt;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private int f22610pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private CalendarConstraints f22611pmvmpeiblj;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private CharSequence f22612sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private TextView f22613stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private ra.lqeggnwhkg f22614tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private CharSequence f22615ulzqkzuiru;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private int f22616wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private TextView f22617wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private CharSequence f22618yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private CharSequence f22620ylkuphrtab;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private DayViewDecorator f22622zynmafqrjb;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final LinkedHashSet f22621zdlpuopuiu = new LinkedHashSet();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final LinkedHashSet f22619yggfygwlhe = new LinkedHashSet();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final LinkedHashSet f22604jyumaefscl = new LinkedHashSet();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final LinkedHashSet f22602iwizpuwonk = new LinkedHashSet();

    class iobyxmoadg implements View.OnClickListener {
        iobyxmoadg() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.f22621zdlpuopuiu.iterator();
            if (!it.hasNext()) {
                MaterialDatePicker.this.dismiss();
            } else {
                yggfygwlhe.iobyxmoadg(it.next());
                MaterialDatePicker.this.kegysxyocb();
                throw null;
            }
        }
    }

    class ppxfxbqfkf implements pkzmftpjix {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ int f22625jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ View f22626yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ int f22627zdlpuopuiu;

        ppxfxbqfkf(int i13, View view, int i14) {
            this.f22627zdlpuopuiu = i13;
            this.f22626yggfygwlhe = view;
            this.f22625jyumaefscl = i14;
        }

        @Override // v1.pkzmftpjix
        public skhdrjzrfn iobyxmoadg(View view, skhdrjzrfn skhdrjzrfnVar) {
            int i13 = skhdrjzrfnVar.gxszxtbevo(skhdrjzrfn.draadjrbmk.dxjokdxxww()).f50508zoijcleaow;
            if (this.f22627zdlpuopuiu >= 0) {
                this.f22626yggfygwlhe.getLayoutParams().height = this.f22627zdlpuopuiu + i13;
                View view2 = this.f22626yggfygwlhe;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f22626yggfygwlhe;
            view3.setPadding(view3.getPaddingLeft(), this.f22625jyumaefscl + i13, this.f22626yggfygwlhe.getPaddingRight(), this.f22626yggfygwlhe.getPaddingBottom());
            return skhdrjzrfnVar;
        }
    }

    class wkgbmnqykc extends wflxmlrfwp {
        wkgbmnqykc() {
        }

        @Override // com.google.android.material.datepicker.wflxmlrfwp
        public void iobyxmoadg() {
            MaterialDatePicker.this.f22608mbcevpiqjq.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.wflxmlrfwp
        public void zoijcleaow(Object obj) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            materialDatePicker.vipkmwdibw(materialDatePicker.wypolnanlu());
            MaterialDatePicker.this.f22608mbcevpiqjq.setEnabled(MaterialDatePicker.this.hkdspvbjdz().O());
        }
    }

    class zoijcleaow implements View.OnClickListener {
        zoijcleaow() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.f22619yggfygwlhe.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialDatePicker.this.dismiss();
        }
    }

    private static CharSequence cllcsxoeiz(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void crxdokpmqz(View view) {
        this.f22608mbcevpiqjq.setEnabled(hkdspvbjdz().O());
        this.f22605kegysxyocb.toggle();
        this.f22607lmojexxdyd = this.f22607lmojexxdyd == 1 ? 0 : 1;
        ikoacuggdj(this.f22605kegysxyocb);
        ribwqtqdhb();
    }

    private String dsvhmnatus() {
        return hkdspvbjdz().opjhrmiecq(requireContext());
    }

    private static Drawable hcddaimhww(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, nufgyqmvbu.iobyxmoadg.zoijcleaow(context, da.eablkybsjg.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], nufgyqmvbu.iobyxmoadg.zoijcleaow(context, da.eablkybsjg.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DateSelector hkdspvbjdz() {
        if (this.f22597esjtqupxsv == null) {
            this.f22597esjtqupxsv = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f22597esjtqupxsv;
    }

    private void ikoacuggdj(CheckableImageButton checkableImageButton) {
        this.f22605kegysxyocb.setContentDescription(this.f22607lmojexxdyd == 1 ? checkableImageButton.getContext().getString(da.btonecajqb.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(da.btonecajqb.mtrl_picker_toggle_to_text_input_mode));
    }

    private void jhduphickx() {
        this.f22617wypolnanlu.setText((this.f22607lmojexxdyd == 1 && ulzqkzuiru()) ? this.f22612sopmlzcsov : this.f22615ulzqkzuiru);
    }

    static boolean jlmebxxoox(Context context, int i13) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(oa.zoijcleaow.wkgbmnqykc(context, da.zoijcleaow.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{i13});
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z13;
    }

    private void jpowsppfya(Window window) {
        if (this.f22609ntlheqmsrt) {
            return;
        }
        View viewFindViewById = requireView().findViewById(da.gxszxtbevo.fullscreen_header);
        com.google.android.material.internal.ppxfxbqfkf.iobyxmoadg(window, true, com.google.android.material.internal.ojitshcjhn.wkgbmnqykc(viewFindViewById), null);
        jhduphickx.igdgnonuha(viewFindViewById, new ppxfxbqfkf(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.f22609ntlheqmsrt = true;
    }

    private void mbcevpiqjq(Context context) {
        this.f22605kegysxyocb.setTag(f22592ribwqtqdhb);
        this.f22605kegysxyocb.setImageDrawable(hcddaimhww(context));
        this.f22605kegysxyocb.setChecked(this.f22607lmojexxdyd != 0);
        jhduphickx.oipsdeybqn(this.f22605kegysxyocb, null);
        ikoacuggdj(this.f22605kegysxyocb);
        this.f22605kegysxyocb.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.btonecajqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22664zdlpuopuiu.crxdokpmqz(view);
            }
        });
    }

    static boolean ntlheqmsrt(Context context) {
        return jlmebxxoox(context, R.attr.windowFullscreen);
    }

    private void ribwqtqdhb() {
        int iTzroggbefp = tzroggbefp(requireContext());
        MaterialCalendar materialCalendarUlzqkzuiru = MaterialCalendar.ulzqkzuiru(hkdspvbjdz(), iTzroggbefp, this.f22611pmvmpeiblj, this.f22622zynmafqrjb);
        this.f22601istkbnxepw = materialCalendarUlzqkzuiru;
        agtfadlqog agtfadlqogVarIozdgvuglv = materialCalendarUlzqkzuiru;
        if (this.f22607lmojexxdyd == 1) {
            agtfadlqogVarIozdgvuglv = MaterialTextInputPicker.iozdgvuglv(hkdspvbjdz(), iTzroggbefp, this.f22611pmvmpeiblj);
        }
        this.f22606lereixgezr = agtfadlqogVarIozdgvuglv;
        jhduphickx();
        vipkmwdibw(wypolnanlu());
        jpowsppfya jpowsppfyaVarKcexrzcfyt = getChildFragmentManager().kcexrzcfyt();
        jpowsppfyaVarKcexrzcfyt.vdvldrhtss(da.gxszxtbevo.mtrl_calendar_frame, this.f22606lereixgezr);
        jpowsppfyaVarKcexrzcfyt.gtknphoqwx();
        this.f22606lereixgezr.cdpycssgdh(new wkgbmnqykc());
    }

    static boolean sopmlzcsov(Context context) {
        return jlmebxxoox(context, da.zoijcleaow.nestedScrollable);
    }

    private static int stevsuqkhv(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(da.wkgbmnqykc.mtrl_calendar_content_padding);
        int i13 = Month.gxszxtbevo().f22636iwizpuwonk;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(da.wkgbmnqykc.mtrl_calendar_day_width) * i13) + ((i13 - 1) * resources.getDimensionPixelOffset(da.wkgbmnqykc.mtrl_calendar_month_horizontal_padding));
    }

    private int tzroggbefp(Context context) {
        int i13 = this.f22595cqumvgiudr;
        return i13 != 0 ? i13 : hkdspvbjdz().weqkydbzbr(context);
    }

    private boolean ulzqkzuiru() {
        return getResources().getConfiguration().orientation == 2;
    }

    public final Object kegysxyocb() {
        return hkdspvbjdz().Z();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f22604jyumaefscl.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f22595cqumvgiudr = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f22597esjtqupxsv = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f22611pmvmpeiblj = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f22622zynmafqrjb = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f22593cdpycssgdh = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f22618yadqdtsiqt = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f22607lmojexxdyd = bundle.getInt("INPUT_MODE_KEY");
        this.f22616wwaezpbzkn = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f22620ylkuphrtab = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f22610pkzmftpjix = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f22598hcddaimhww = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f22603jpowsppfya = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f22599hkdspvbjdz = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f22594cllcsxoeiz = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f22596dsvhmnatus = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f22618yadqdtsiqt;
        if (text == null) {
            text = requireContext().getResources().getText(this.f22593cdpycssgdh);
        }
        this.f22615ulzqkzuiru = text;
        this.f22612sopmlzcsov = cllcsxoeiz(text);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), tzroggbefp(requireContext()));
        Context context = dialog.getContext();
        this.f22600iozdgvuglv = ntlheqmsrt(context);
        this.f22614tzroggbefp = new ra.lqeggnwhkg(context, null, da.zoijcleaow.materialCalendarStyle, da.gtknphoqwx.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, da.draadjrbmk.MaterialCalendar, da.zoijcleaow.materialCalendarStyle, da.gtknphoqwx.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(da.draadjrbmk.MaterialCalendar_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f22614tzroggbefp.hkdspvbjdz(context);
        this.f22614tzroggbefp.crxdokpmqz(ColorStateList.valueOf(color));
        this.f22614tzroggbefp.sopmlzcsov(jhduphickx.yggfygwlhe(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f22600iozdgvuglv ? da.nufgyqmvbu.mtrl_picker_fullscreen : da.nufgyqmvbu.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        DayViewDecorator dayViewDecorator = this.f22622zynmafqrjb;
        if (dayViewDecorator != null) {
            dayViewDecorator.btonecajqb(context);
        }
        if (this.f22600iozdgvuglv) {
            viewInflate.findViewById(da.gxszxtbevo.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(stevsuqkhv(context), -2));
        } else {
            viewInflate.findViewById(da.gxszxtbevo.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(stevsuqkhv(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(da.gxszxtbevo.mtrl_picker_header_selection_text);
        this.f22613stevsuqkhv = textView;
        jhduphickx.opjhrmiecq(textView, 1);
        this.f22605kegysxyocb = (CheckableImageButton) viewInflate.findViewById(da.gxszxtbevo.mtrl_picker_header_toggle);
        this.f22617wypolnanlu = (TextView) viewInflate.findViewById(da.gxszxtbevo.mtrl_picker_title_text);
        mbcevpiqjq(context);
        this.f22608mbcevpiqjq = (Button) viewInflate.findViewById(da.gxszxtbevo.confirm_button);
        if (hkdspvbjdz().O()) {
            this.f22608mbcevpiqjq.setEnabled(true);
        } else {
            this.f22608mbcevpiqjq.setEnabled(false);
        }
        this.f22608mbcevpiqjq.setTag(f22590crxdokpmqz);
        CharSequence charSequence = this.f22620ylkuphrtab;
        if (charSequence != null) {
            this.f22608mbcevpiqjq.setText(charSequence);
        } else {
            int i13 = this.f22616wwaezpbzkn;
            if (i13 != 0) {
                this.f22608mbcevpiqjq.setText(i13);
            }
        }
        CharSequence charSequence2 = this.f22598hcddaimhww;
        if (charSequence2 != null) {
            this.f22608mbcevpiqjq.setContentDescription(charSequence2);
        } else if (this.f22610pkzmftpjix != 0) {
            this.f22608mbcevpiqjq.setContentDescription(getContext().getResources().getText(this.f22610pkzmftpjix));
        }
        this.f22608mbcevpiqjq.setOnClickListener(new iobyxmoadg());
        Button button = (Button) viewInflate.findViewById(da.gxszxtbevo.cancel_button);
        button.setTag(f22591jlmebxxoox);
        CharSequence charSequence3 = this.f22599hkdspvbjdz;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i14 = this.f22603jpowsppfya;
            if (i14 != 0) {
                button.setText(i14);
            }
        }
        CharSequence charSequence4 = this.f22596dsvhmnatus;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f22594cllcsxoeiz != 0) {
            button.setContentDescription(getContext().getResources().getText(this.f22594cllcsxoeiz));
        }
        button.setOnClickListener(new zoijcleaow());
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f22602iwizpuwonk.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f22595cqumvgiudr);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f22597esjtqupxsv);
        CalendarConstraints.zoijcleaow zoijcleaowVar = new CalendarConstraints.zoijcleaow(this.f22611pmvmpeiblj);
        MaterialCalendar materialCalendar = this.f22601istkbnxepw;
        Month monthStevsuqkhv = materialCalendar == null ? null : materialCalendar.stevsuqkhv();
        if (monthStevsuqkhv != null) {
            zoijcleaowVar.zoijcleaow(monthStevsuqkhv.f22635esjtqupxsv);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", zoijcleaowVar.iobyxmoadg());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f22622zynmafqrjb);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f22593cdpycssgdh);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f22618yadqdtsiqt);
        bundle.putInt("INPUT_MODE_KEY", this.f22607lmojexxdyd);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f22616wwaezpbzkn);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f22620ylkuphrtab);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f22610pkzmftpjix);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f22598hcddaimhww);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f22603jpowsppfya);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f22599hkdspvbjdz);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f22594cllcsxoeiz);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f22596dsvhmnatus);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f22600iozdgvuglv) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f22614tzroggbefp);
            jpowsppfya(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(da.wkgbmnqykc.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f22614tzroggbefp, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ja.iobyxmoadg(requireDialog(), rect));
        }
        ribwqtqdhb();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.f22606lereixgezr.yadqdtsiqt();
        super.onStop();
    }

    void vipkmwdibw(String str) {
        this.f22613stevsuqkhv.setContentDescription(dsvhmnatus());
        this.f22613stevsuqkhv.setText(str);
    }

    public String wypolnanlu() {
        return hkdspvbjdz().g(getContext());
    }
}
