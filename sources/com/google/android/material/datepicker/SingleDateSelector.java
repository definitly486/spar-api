package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
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
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new zoijcleaow();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private SimpleDateFormat f22657jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Long f22658yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private CharSequence f22659zdlpuopuiu;

    class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f22661istkbnxepw;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        final /* synthetic */ wflxmlrfwp f22662zynmafqrjb;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, wflxmlrfwp wflxmlrfwpVar, TextInputLayout textInputLayout2) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f22662zynmafqrjb = wflxmlrfwpVar;
            this.f22661istkbnxepw = textInputLayout2;
        }

        @Override // com.google.android.material.datepicker.eablkybsjg
        void gxszxtbevo() {
            SingleDateSelector.this.f22659zdlpuopuiu = this.f22661istkbnxepw.getError();
            this.f22662zynmafqrjb.iobyxmoadg();
        }

        @Override // com.google.android.material.datepicker.eablkybsjg
        void lqeggnwhkg(Long l13) {
            if (l13 == null) {
                SingleDateSelector.this.gxszxtbevo();
            } else {
                SingleDateSelector.this.h0(l13.longValue());
            }
            SingleDateSelector.this.f22659zdlpuopuiu = null;
            this.f22662zynmafqrjb.zoijcleaow(SingleDateSelector.this.Z());
        }
    }

    class zoijcleaow implements Parcelable.Creator {
        zoijcleaow() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f22658yggfygwlhe = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public SingleDateSelector[] newArray(int i13) {
            return new SingleDateSelector[i13];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gxszxtbevo() {
        this.f22658yggfygwlhe = null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, wflxmlrfwp wflxmlrfwpVar) {
        View viewInflate = layoutInflater.inflate(da.nufgyqmvbu.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(da.gxszxtbevo.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (com.google.android.material.internal.eablkybsjg.zoijcleaow()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormatGxszxtbevo = this.f22657jyumaefscl;
        boolean z13 = simpleDateFormatGxszxtbevo != null;
        if (!z13) {
            simpleDateFormatGxszxtbevo = vdvldrhtss.gxszxtbevo();
        }
        SimpleDateFormat simpleDateFormat = simpleDateFormatGxszxtbevo;
        String pattern = z13 ? simpleDateFormat.toPattern() : vdvldrhtss.lqeggnwhkg(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        Long l13 = this.f22658yggfygwlhe;
        if (l13 != null) {
            editText.setText(simpleDateFormat.format(l13));
        }
        editText.addTextChangedListener(new iobyxmoadg(pattern, simpleDateFormat, textInputLayout, calendarConstraints, wflxmlrfwpVar, textInputLayout));
        DateSelector.B(editText);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean O() {
        return this.f22658yggfygwlhe != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection W() {
        ArrayList arrayList = new ArrayList();
        Long l13 = this.f22658yggfygwlhe;
        if (l13 != null) {
            arrayList.add(l13);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String g(Context context) {
        Resources resources = context.getResources();
        Long l13 = this.f22658yggfygwlhe;
        if (l13 == null) {
            return resources.getString(da.btonecajqb.mtrl_picker_date_header_unselected);
        }
        return resources.getString(da.btonecajqb.mtrl_picker_date_header_selected, nufgyqmvbu.wflxmlrfwp(l13.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void h0(long j13) {
        this.f22658yggfygwlhe = Long.valueOf(j13);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public Long Z() {
        return this.f22658yggfygwlhe;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String opjhrmiecq(Context context) {
        Resources resources = context.getResources();
        Long l13 = this.f22658yggfygwlhe;
        return resources.getString(da.btonecajqb.mtrl_picker_announce_current_selection, l13 == null ? resources.getString(da.btonecajqb.mtrl_picker_announce_current_selection_none) : nufgyqmvbu.wflxmlrfwp(l13.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection q() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int weqkydbzbr(Context context) {
        return oa.zoijcleaow.wkgbmnqykc(context, da.zoijcleaow.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeValue(this.f22658yggfygwlhe);
    }
}
