package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public class RangeDateSelector implements DateSelector<u1.ppxfxbqfkf> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new ppxfxbqfkf();

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private SimpleDateFormat f22646pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private String f22647yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private CharSequence f22648zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f22644jyumaefscl = " ";

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private Long f22643iwizpuwonk = null;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private Long f22641cqumvgiudr = null;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private Long f22642esjtqupxsv = null;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private Long f22645lereixgezr = null;

    class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        final /* synthetic */ wflxmlrfwp f22649cdpycssgdh;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f22650istkbnxepw;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f22652zynmafqrjb;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, wflxmlrfwp wflxmlrfwpVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f22652zynmafqrjb = textInputLayout2;
            this.f22650istkbnxepw = textInputLayout3;
            this.f22649cdpycssgdh = wflxmlrfwpVar;
        }

        @Override // com.google.android.material.datepicker.eablkybsjg
        void gxszxtbevo() {
            RangeDateSelector.this.f22642esjtqupxsv = null;
            RangeDateSelector.this.oxmwwwfdhm(this.f22652zynmafqrjb, this.f22650istkbnxepw, this.f22649cdpycssgdh);
        }

        @Override // com.google.android.material.datepicker.eablkybsjg
        void lqeggnwhkg(Long l13) {
            RangeDateSelector.this.f22642esjtqupxsv = l13;
            RangeDateSelector.this.oxmwwwfdhm(this.f22652zynmafqrjb, this.f22650istkbnxepw, this.f22649cdpycssgdh);
        }
    }

    class ppxfxbqfkf implements Parcelable.Creator {
        ppxfxbqfkf() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector createFromParcel(Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f22643iwizpuwonk = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f22641cqumvgiudr = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public RangeDateSelector[] newArray(int i13) {
            return new RangeDateSelector[i13];
        }
    }

    class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        final /* synthetic */ wflxmlrfwp f22653cdpycssgdh;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f22654istkbnxepw;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f22656zynmafqrjb;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, wflxmlrfwp wflxmlrfwpVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f22656zynmafqrjb = textInputLayout2;
            this.f22654istkbnxepw = textInputLayout3;
            this.f22653cdpycssgdh = wflxmlrfwpVar;
        }

        @Override // com.google.android.material.datepicker.eablkybsjg
        void gxszxtbevo() {
            RangeDateSelector.this.f22645lereixgezr = null;
            RangeDateSelector.this.oxmwwwfdhm(this.f22656zynmafqrjb, this.f22654istkbnxepw, this.f22653cdpycssgdh);
        }

        @Override // com.google.android.material.datepicker.eablkybsjg
        void lqeggnwhkg(Long l13) {
            RangeDateSelector.this.f22645lereixgezr = l13;
            RangeDateSelector.this.oxmwwwfdhm(this.f22656zynmafqrjb, this.f22654istkbnxepw, this.f22653cdpycssgdh);
        }
    }

    private boolean btonecajqb(long j13, long j14) {
        return j13 <= j14;
    }

    private void gtknphoqwx(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f22647yggfygwlhe);
        textInputLayout2.setError(" ");
    }

    private void nufgyqmvbu(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f22647yggfygwlhe.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !" ".contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oxmwwwfdhm(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, wflxmlrfwp wflxmlrfwpVar) {
        Long l13 = this.f22642esjtqupxsv;
        if (l13 == null || this.f22645lereixgezr == null) {
            nufgyqmvbu(textInputLayout, textInputLayout2);
            wflxmlrfwpVar.iobyxmoadg();
        } else if (btonecajqb(l13.longValue(), this.f22645lereixgezr.longValue())) {
            this.f22643iwizpuwonk = this.f22642esjtqupxsv;
            this.f22641cqumvgiudr = this.f22645lereixgezr;
            wflxmlrfwpVar.zoijcleaow(Z());
        } else {
            gtknphoqwx(textInputLayout, textInputLayout2);
            wflxmlrfwpVar.iobyxmoadg();
        }
        wflxmlrfwp(textInputLayout, textInputLayout2);
    }

    private void wflxmlrfwp(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            this.f22648zdlpuopuiu = textInputLayout.getError();
        } else if (TextUtils.isEmpty(textInputLayout2.getError())) {
            this.f22648zdlpuopuiu = null;
        } else {
            this.f22648zdlpuopuiu = textInputLayout2.getError();
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, wflxmlrfwp wflxmlrfwpVar) {
        View viewInflate = layoutInflater.inflate(da.nufgyqmvbu.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(da.gxszxtbevo.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(da.gxszxtbevo.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (com.google.android.material.internal.eablkybsjg.zoijcleaow()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f22647yggfygwlhe = viewInflate.getResources().getString(da.btonecajqb.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormatGxszxtbevo = this.f22646pmvmpeiblj;
        boolean z13 = simpleDateFormatGxszxtbevo != null;
        if (!z13) {
            simpleDateFormatGxszxtbevo = vdvldrhtss.gxszxtbevo();
        }
        SimpleDateFormat simpleDateFormat = simpleDateFormatGxszxtbevo;
        Long l13 = this.f22643iwizpuwonk;
        if (l13 != null) {
            editText.setText(simpleDateFormat.format(l13));
            this.f22642esjtqupxsv = this.f22643iwizpuwonk;
        }
        Long l14 = this.f22641cqumvgiudr;
        if (l14 != null) {
            editText2.setText(simpleDateFormat.format(l14));
            this.f22645lereixgezr = this.f22641cqumvgiudr;
        }
        String pattern = z13 ? simpleDateFormat.toPattern() : vdvldrhtss.lqeggnwhkg(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        textInputLayout2.setPlaceholderText(pattern);
        editText.addTextChangedListener(new iobyxmoadg(pattern, simpleDateFormat, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, wflxmlrfwpVar));
        editText2.addTextChangedListener(new zoijcleaow(pattern, simpleDateFormat, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, wflxmlrfwpVar));
        DateSelector.B(editText, editText2);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean O() {
        Long l13 = this.f22643iwizpuwonk;
        return (l13 == null || this.f22641cqumvgiudr == null || !btonecajqb(l13.longValue(), this.f22641cqumvgiudr.longValue())) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection W() {
        ArrayList arrayList = new ArrayList();
        Long l13 = this.f22643iwizpuwonk;
        if (l13 != null) {
            arrayList.add(l13);
        }
        Long l14 = this.f22641cqumvgiudr;
        if (l14 != null) {
            arrayList.add(l14);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public u1.ppxfxbqfkf Z() {
        return new u1.ppxfxbqfkf(this.f22643iwizpuwonk, this.f22641cqumvgiudr);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String g(Context context) {
        Resources resources = context.getResources();
        Long l13 = this.f22643iwizpuwonk;
        if (l13 == null && this.f22641cqumvgiudr == null) {
            return resources.getString(da.btonecajqb.mtrl_picker_range_header_unselected);
        }
        Long l14 = this.f22641cqumvgiudr;
        if (l14 == null) {
            return resources.getString(da.btonecajqb.mtrl_picker_range_header_only_start_selected, nufgyqmvbu.ppxfxbqfkf(l13.longValue()));
        }
        if (l13 == null) {
            return resources.getString(da.btonecajqb.mtrl_picker_range_header_only_end_selected, nufgyqmvbu.ppxfxbqfkf(l14.longValue()));
        }
        u1.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = nufgyqmvbu.iobyxmoadg(l13, l14);
        return resources.getString(da.btonecajqb.mtrl_picker_range_header_selected, ppxfxbqfkfVarIobyxmoadg.f112467iobyxmoadg, ppxfxbqfkfVarIobyxmoadg.f112468zoijcleaow);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void h0(long j13) {
        Long l13 = this.f22643iwizpuwonk;
        if (l13 == null) {
            this.f22643iwizpuwonk = Long.valueOf(j13);
        } else if (this.f22641cqumvgiudr == null && btonecajqb(l13.longValue(), j13)) {
            this.f22641cqumvgiudr = Long.valueOf(j13);
        } else {
            this.f22641cqumvgiudr = null;
            this.f22643iwizpuwonk = Long.valueOf(j13);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String opjhrmiecq(Context context) {
        Resources resources = context.getResources();
        u1.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = nufgyqmvbu.iobyxmoadg(this.f22643iwizpuwonk, this.f22641cqumvgiudr);
        Object obj = ppxfxbqfkfVarIobyxmoadg.f112467iobyxmoadg;
        String string = obj == null ? resources.getString(da.btonecajqb.mtrl_picker_announce_current_selection_none) : (String) obj;
        Object obj2 = ppxfxbqfkfVarIobyxmoadg.f112468zoijcleaow;
        return resources.getString(da.btonecajqb.mtrl_picker_announce_current_range_selection, string, obj2 == null ? resources.getString(da.btonecajqb.mtrl_picker_announce_current_selection_none) : (String) obj2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new u1.ppxfxbqfkf(this.f22643iwizpuwonk, this.f22641cqumvgiudr));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int weqkydbzbr(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return oa.zoijcleaow.wkgbmnqykc(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(da.wkgbmnqykc.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? da.zoijcleaow.materialCalendarTheme : da.zoijcleaow.materialCalendarFullscreenTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeValue(this.f22643iwizpuwonk);
        parcel.writeValue(this.f22641cqumvgiudr);
    }
}
