package b;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: loaded from: classes.dex */
public final class wflxmlrfwp extends AutofillManager.AutofillCallback {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wflxmlrfwp f14882iobyxmoadg = new wflxmlrfwp();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final int f14883zoijcleaow = 8;

    private wflxmlrfwp() {
    }

    public final void iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.iobyxmoadg().registerCallback(this);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(View view, int i13, int i14) {
        String str;
        super.onAutofillEvent(view, i13, i14);
        if (i14 == 1) {
            str = "Autofill popup was shown.";
        } else if (i14 != 2) {
            str = i14 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
        } else {
            str = "Autofill popup was hidden.";
        }
        Log.d("Autofill Status", str);
    }

    public final void zoijcleaow(iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.iobyxmoadg().unregisterCallback(this);
    }
}
