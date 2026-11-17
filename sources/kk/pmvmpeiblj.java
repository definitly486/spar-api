package kk;

import android.text.Editable;
import android.text.TextWatcher;
import spay.sdk.R;
import spay.sdk.view.otpTextView.SpayOtpTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class pmvmpeiblj implements TextWatcher {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ SpayOtpTextView f58102zdlpuopuiu;

    public pmvmpeiblj(SpayOtpTextView spayOtpTextView) {
        this.f58102zdlpuopuiu = spayOtpTextView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(s13, "s");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s13, int i13, int i14, int i15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(s13, "s");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s13, int i13, int i14, int i15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(s13, "s");
        if (i14 > i15) {
            ag0 ag0Var = this.f58102zdlpuopuiu.f107892b;
            if (ag0Var != null) {
                ag0Var.setText(R.string.spay_empty_string);
            }
        } else {
            this.f58102zdlpuopuiu.setOTP(s13);
            this.f58102zdlpuopuiu.setFocus(s13.length());
        }
        ji0 spayOtpListener = this.f58102zdlpuopuiu.getSpayOtpListener();
        if (spayOtpListener != null) {
            SpayOtpTextView spayOtpTextView = this.f58102zdlpuopuiu;
            String code = s13.toString();
            iu iuVar = (iu) spayOtpListener;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(code, "code");
            ((rgvfuqvkyq) iuVar.f57097iobyxmoadg.yadqdtsiqt()).agtfadlqog(new stevsuqkhv(code));
            if (s13.length() == spayOtpTextView.f107896f) {
                String otp = s13.toString();
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(otp, "otp");
                ((rgvfuqvkyq) iuVar.f57097iobyxmoadg.yadqdtsiqt()).agtfadlqog(new stevsuqkhv(otp));
            }
        }
    }
}
