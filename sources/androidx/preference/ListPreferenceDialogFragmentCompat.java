package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private CharSequence[] f12368cdpycssgdh;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private CharSequence[] f12369istkbnxepw;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    int f12370zynmafqrjb;

    class iobyxmoadg implements DialogInterface.OnClickListener {
        iobyxmoadg() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i13) {
            ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = ListPreferenceDialogFragmentCompat.this;
            listPreferenceDialogFragmentCompat.f12370zynmafqrjb = i13;
            listPreferenceDialogFragmentCompat.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    private ListPreference cllcsxoeiz() {
        return (ListPreference) iozdgvuglv();
    }

    public static ListPreferenceDialogFragmentCompat dsvhmnatus(String str) {
        ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = new ListPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        listPreferenceDialogFragmentCompat.setArguments(bundle);
        return listPreferenceDialogFragmentCompat;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    protected void hcddaimhww(androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        super.hcddaimhww(iobyxmoadgVar);
        iobyxmoadgVar.gtknphoqwx(this.f12369istkbnxepw, this.f12370zynmafqrjb, new iobyxmoadg());
        iobyxmoadgVar.dxjokdxxww(null, null);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f12370zynmafqrjb = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f12369istkbnxepw = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f12368cdpycssgdh = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreferenceCllcsxoeiz = cllcsxoeiz();
        if (listPreferenceCllcsxoeiz.iwxlajgraz() == null || listPreferenceCllcsxoeiz.skhdrjzrfn() == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f12370zynmafqrjb = listPreferenceCllcsxoeiz.auzgnhcxok(listPreferenceCllcsxoeiz.igdgnonuha());
        this.f12369istkbnxepw = listPreferenceCllcsxoeiz.iwxlajgraz();
        this.f12368cdpycssgdh = listPreferenceCllcsxoeiz.skhdrjzrfn();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f12370zynmafqrjb);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f12369istkbnxepw);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f12368cdpycssgdh);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void pkzmftpjix(boolean z13) {
        int i13;
        if (!z13 || (i13 = this.f12370zynmafqrjb) < 0) {
            return;
        }
        String string = this.f12368cdpycssgdh[i13].toString();
        ListPreference listPreferenceCllcsxoeiz = cllcsxoeiz();
        if (listPreferenceCllcsxoeiz.iobyxmoadg(string)) {
            listPreferenceCllcsxoeiz.wizcaqwiak(string);
        }
    }
}
