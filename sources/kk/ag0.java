package kk;

import android.content.Context;
import android.text.Editable;
import androidx.appcompat.widget.AppCompatEditText;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ag0 extends AppCompatEditText {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag0(Context context) {
        super(context);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        setCursorVisible(false);
        setTextColor(context.getResources().getColor(R.color.spay_transparent));
        setBackgroundDrawable(null);
        setInputType(2);
        setSelectAllOnFocus(false);
        setTextIsSelectable(false);
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i13, int i14) {
        Editable text = getText();
        if (text == null || (i13 == text.length() && i14 == text.length())) {
            super.onSelectionChanged(i13, i14);
        } else {
            setSelection(text.length(), text.length());
        }
    }
}
