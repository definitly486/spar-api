package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
abstract class eablkybsjg extends com.google.android.material.internal.gtknphoqwx {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final String f22678cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final Runnable f22679esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final CalendarConstraints f22680iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final DateFormat f22681jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private Runnable f22682lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f22683pmvmpeiblj = 0;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String f22684yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final TextInputLayout f22685zdlpuopuiu;

    eablkybsjg(final String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f22684yggfygwlhe = str;
        this.f22681jyumaefscl = dateFormat;
        this.f22685zdlpuopuiu = textInputLayout;
        this.f22680iwizpuwonk = calendarConstraints;
        this.f22678cqumvgiudr = textInputLayout.getContext().getString(da.btonecajqb.mtrl_picker_out_of_range);
        this.f22679esjtqupxsv = new Runnable() { // from class: com.google.android.material.datepicker.ppxfxbqfkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f22708zdlpuopuiu.eablkybsjg(str);
            }
        };
    }

    private String dxjokdxxww(String str) {
        return str.replace(' ', (char) 160);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void eablkybsjg(String str) {
        TextInputLayout textInputLayout = this.f22685zdlpuopuiu;
        DateFormat dateFormat = this.f22681jyumaefscl;
        Context context = textInputLayout.getContext();
        textInputLayout.setError(context.getString(da.btonecajqb.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(da.btonecajqb.mtrl_picker_invalid_format_use), dxjokdxxww(str)) + "\n" + String.format(context.getString(da.btonecajqb.mtrl_picker_invalid_format_example), dxjokdxxww(dateFormat.format(new Date(vdvldrhtss.gtknphoqwx().getTimeInMillis())))));
        gxszxtbevo();
    }

    private Runnable ppxfxbqfkf(final long j13) {
        return new Runnable() { // from class: com.google.android.material.datepicker.wkgbmnqykc
            @Override // java.lang.Runnable
            public final void run() {
                this.f22714zdlpuopuiu.wkgbmnqykc(j13);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wkgbmnqykc(long j13) {
        this.f22685zdlpuopuiu.setError(String.format(this.f22678cqumvgiudr, dxjokdxxww(nufgyqmvbu.ppxfxbqfkf(j13))));
        gxszxtbevo();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0 && editable.length() < this.f22684yggfygwlhe.length() && editable.length() >= this.f22683pmvmpeiblj) {
            char cCharAt = this.f22684yggfygwlhe.charAt(editable.length());
            if (Character.isLetterOrDigit(cCharAt)) {
                return;
            }
            editable.append(cCharAt);
        }
    }

    @Override // com.google.android.material.internal.gtknphoqwx, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        this.f22683pmvmpeiblj = charSequence.length();
    }

    abstract void gxszxtbevo();

    abstract void lqeggnwhkg(Long l13);

    public void nufgyqmvbu(View view, Runnable runnable) {
        view.post(runnable);
    }

    @Override // com.google.android.material.internal.gtknphoqwx, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        this.f22685zdlpuopuiu.removeCallbacks(this.f22679esjtqupxsv);
        this.f22685zdlpuopuiu.removeCallbacks(this.f22682lereixgezr);
        this.f22685zdlpuopuiu.setError(null);
        lqeggnwhkg(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f22684yggfygwlhe.length()) {
            return;
        }
        try {
            Date date = this.f22681jyumaefscl.parse(charSequence.toString());
            this.f22685zdlpuopuiu.setError(null);
            long time = date.getTime();
            if (this.f22680iwizpuwonk.dxjokdxxww().nuxfzjnpeb(time) && this.f22680iwizpuwonk.esjtqupxsv(time)) {
                lqeggnwhkg(Long.valueOf(date.getTime()));
                return;
            }
            Runnable runnablePpxfxbqfkf = ppxfxbqfkf(time);
            this.f22682lereixgezr = runnablePpxfxbqfkf;
            nufgyqmvbu(this.f22685zdlpuopuiu, runnablePpxfxbqfkf);
        } catch (ParseException unused) {
            nufgyqmvbu(this.f22685zdlpuopuiu, this.f22679esjtqupxsv);
        }
    }
}
