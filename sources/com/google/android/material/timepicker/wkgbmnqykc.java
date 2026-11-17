package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes2.dex */
class wkgbmnqykc implements InputFilter {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f23550iobyxmoadg;

    public wkgbmnqykc(int i13) {
        this.f23550iobyxmoadg = i13;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i13, int i14, Spanned spanned, int i15, int i16) {
        try {
            StringBuilder sb3 = new StringBuilder(spanned);
            sb3.replace(i15, i16, charSequence.subSequence(i13, i14).toString());
            if (Integer.parseInt(sb3.toString()) <= this.f23550iobyxmoadg) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
