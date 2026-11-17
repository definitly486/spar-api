package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatDialogFragment;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    private boolean waitingForDismissAllowingStateLoss;

    private class zoijcleaow extends BottomSheetBehavior.lqeggnwhkg {
        private zoijcleaow() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.lqeggnwhkg
        public void ppxfxbqfkf(View view, int i13) {
            if (i13 == 5) {
                BottomSheetDialogFragment.this.iozdgvuglv();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.lqeggnwhkg
        public void zoijcleaow(View view, float f13) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iozdgvuglv() {
        if (this.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void lmojexxdyd(BottomSheetBehavior bottomSheetBehavior, boolean z13) {
        this.waitingForDismissAllowingStateLoss = z13;
        if (bottomSheetBehavior.nuxfzjnpeb() == 5) {
            iozdgvuglv();
            return;
        }
        if (getDialog() instanceof ppxfxbqfkf) {
            ((ppxfxbqfkf) getDialog()).vdvldrhtss();
        }
        bottomSheetBehavior.ikoacuggdj(new zoijcleaow());
        bottomSheetBehavior.c(5);
    }

    private boolean wwaezpbzkn(boolean z13) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) dialog;
        BottomSheetBehavior bottomSheetBehaviorOjitshcjhn = ppxfxbqfkfVar.ojitshcjhn();
        if (!bottomSheetBehaviorOjitshcjhn.dvvnrvtcbc() || !ppxfxbqfkfVar.rgvfuqvkyq()) {
            return false;
        }
        lmojexxdyd(bottomSheetBehaviorOjitshcjhn, z13);
        return true;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (wwaezpbzkn(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (wwaezpbzkn(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new ppxfxbqfkf(getContext(), getTheme());
    }
}
