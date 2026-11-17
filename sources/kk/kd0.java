package kk;

import android.text.Editable;
import android.text.TextWatcher;
import spay.sdk.view.PhoneNumberCompositeView;

/* JADX INFO: loaded from: classes3.dex */
public final class kd0 implements TextWatcher {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberCompositeView f57292zdlpuopuiu;

    public kd0(PhoneNumberCompositeView phoneNumberCompositeView) {
        this.f57292zdlpuopuiu = phoneNumberCompositeView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        PhoneNumberCompositeView phoneNumberCompositeView = this.f57292zdlpuopuiu;
        if (phoneNumberCompositeView.f107865b || editable == null) {
            return;
        }
        phoneNumberCompositeView.f107865b = true;
        String strA = PhoneNumberCompositeView.a(editable.toString());
        strA.getClass();
        this.f57292zdlpuopuiu.setText(strA);
        this.f57292zdlpuopuiu.setSelection(strA.length());
        this.f57292zdlpuopuiu.f107865b = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
    }
}
