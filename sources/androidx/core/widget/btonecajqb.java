package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import v1.hcddaimhww;

/* JADX INFO: loaded from: classes.dex */
public final class btonecajqb implements hcddaimhww {
    private static void ppxfxbqfkf(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    private static CharSequence zoijcleaow(Context context, ClipData.Item item, int i13) {
        if ((i13 & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence charSequenceCoerceToText = item.coerceToText(context);
        return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
    }

    @Override // v1.hcddaimhww
    public v1.wkgbmnqykc iobyxmoadg(View view, v1.wkgbmnqykc wkgbmnqykcVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + wkgbmnqykcVar);
        }
        if (wkgbmnqykcVar.wkgbmnqykc() == 2) {
            return wkgbmnqykcVar;
        }
        ClipData clipDataZoijcleaow = wkgbmnqykcVar.zoijcleaow();
        int iPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z13 = false;
        for (int i13 = 0; i13 < clipDataZoijcleaow.getItemCount(); i13++) {
            CharSequence charSequenceZoijcleaow = zoijcleaow(context, clipDataZoijcleaow.getItemAt(i13), iPpxfxbqfkf);
            if (charSequenceZoijcleaow != null) {
                if (z13) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceZoijcleaow);
                } else {
                    ppxfxbqfkf(editable, charSequenceZoijcleaow);
                    z13 = true;
                }
            }
        }
        return null;
    }
}
