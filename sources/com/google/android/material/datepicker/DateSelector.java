package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public interface DateSelector<S> extends Parcelable {
    static void B(final EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.google.android.material.datepicker.gxszxtbevo
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z13) {
                DateSelector.b(editTextArr, view, z13);
            }
        };
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
        final EditText editText2 = editTextArr[0];
        editText2.postDelayed(new Runnable() { // from class: com.google.android.material.datepicker.lqeggnwhkg
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.internal.ojitshcjhn.draadjrbmk(editText2, false);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void b(EditText[] editTextArr, View view, boolean z13) {
        for (EditText editText : editTextArr) {
            if (editText.hasFocus()) {
                return;
            }
        }
        com.google.android.material.internal.ojitshcjhn.lqeggnwhkg(view, false);
    }

    View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, wflxmlrfwp wflxmlrfwpVar);

    boolean O();

    Collection W();

    Object Z();

    String g(Context context);

    void h0(long j13);

    String opjhrmiecq(Context context);

    Collection q();

    int weqkydbzbr(Context context);
}
