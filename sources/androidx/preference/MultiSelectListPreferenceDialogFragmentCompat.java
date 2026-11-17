package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    CharSequence[] f12376cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    boolean f12377istkbnxepw;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    CharSequence[] f12378yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    Set f12379zynmafqrjb = new HashSet();

    class iobyxmoadg implements DialogInterface.OnMultiChoiceClickListener {
        iobyxmoadg() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i13, boolean z13) {
            if (z13) {
                MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = MultiSelectListPreferenceDialogFragmentCompat.this;
                multiSelectListPreferenceDialogFragmentCompat.f12377istkbnxepw = multiSelectListPreferenceDialogFragmentCompat.f12379zynmafqrjb.add(multiSelectListPreferenceDialogFragmentCompat.f12378yadqdtsiqt[i13].toString()) | multiSelectListPreferenceDialogFragmentCompat.f12377istkbnxepw;
            } else {
                MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat2 = MultiSelectListPreferenceDialogFragmentCompat.this;
                multiSelectListPreferenceDialogFragmentCompat2.f12377istkbnxepw = multiSelectListPreferenceDialogFragmentCompat2.f12379zynmafqrjb.remove(multiSelectListPreferenceDialogFragmentCompat2.f12378yadqdtsiqt[i13].toString()) | multiSelectListPreferenceDialogFragmentCompat2.f12377istkbnxepw;
            }
        }
    }

    private MultiSelectListPreference cllcsxoeiz() {
        return (MultiSelectListPreference) iozdgvuglv();
    }

    public static MultiSelectListPreferenceDialogFragmentCompat dsvhmnatus(String str) {
        MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = new MultiSelectListPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle);
        return multiSelectListPreferenceDialogFragmentCompat;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    protected void hcddaimhww(androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        super.hcddaimhww(iobyxmoadgVar);
        int length = this.f12378yadqdtsiqt.length;
        boolean[] zArr = new boolean[length];
        for (int i13 = 0; i13 < length; i13++) {
            zArr[i13] = this.f12379zynmafqrjb.contains(this.f12378yadqdtsiqt[i13].toString());
        }
        iobyxmoadgVar.eablkybsjg(this.f12376cdpycssgdh, zArr, new iobyxmoadg());
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f12379zynmafqrjb.clear();
            this.f12379zynmafqrjb.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f12377istkbnxepw = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f12376cdpycssgdh = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f12378yadqdtsiqt = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreferenceCllcsxoeiz = cllcsxoeiz();
        if (multiSelectListPreferenceCllcsxoeiz.auzgnhcxok() == null || multiSelectListPreferenceCllcsxoeiz.iwxlajgraz() == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f12379zynmafqrjb.clear();
        this.f12379zynmafqrjb.addAll(multiSelectListPreferenceCllcsxoeiz.dvvnrvtcbc());
        this.f12377istkbnxepw = false;
        this.f12376cdpycssgdh = multiSelectListPreferenceCllcsxoeiz.auzgnhcxok();
        this.f12378yadqdtsiqt = multiSelectListPreferenceCllcsxoeiz.iwxlajgraz();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f12379zynmafqrjb));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f12377istkbnxepw);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f12376cdpycssgdh);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f12378yadqdtsiqt);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void pkzmftpjix(boolean z13) {
        if (z13 && this.f12377istkbnxepw) {
            MultiSelectListPreference multiSelectListPreferenceCllcsxoeiz = cllcsxoeiz();
            if (multiSelectListPreferenceCllcsxoeiz.iobyxmoadg(this.f12379zynmafqrjb)) {
                multiSelectListPreferenceCllcsxoeiz.skhdrjzrfn(this.f12379zynmafqrjb);
            }
        }
        this.f12377istkbnxepw = false;
    }
}
