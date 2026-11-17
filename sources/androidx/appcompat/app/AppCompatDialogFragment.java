package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatDialogFragment extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new rgvfuqvkyq(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setupDialog(Dialog dialog, int i13) {
        if (!(dialog instanceof rgvfuqvkyq)) {
            super.setupDialog(dialog, i13);
            return;
        }
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) dialog;
        if (i13 != 1 && i13 != 2) {
            if (i13 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        rgvfuqvkyqVar.dxjokdxxww(1);
    }
}
