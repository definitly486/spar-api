package androidx.preference;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: loaded from: classes2.dex */
public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private CharSequence f12357istkbnxepw;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private EditText f12359zynmafqrjb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final Runnable f12356cdpycssgdh = new iobyxmoadg();

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private long f12358yadqdtsiqt = -1;

    class iobyxmoadg implements Runnable {
        iobyxmoadg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EditTextPreferenceDialogFragmentCompat.this.stevsuqkhv();
        }
    }

    private EditTextPreference cllcsxoeiz() {
        return (EditTextPreference) iozdgvuglv();
    }

    private boolean dsvhmnatus() {
        long j13 = this.f12358yadqdtsiqt;
        return j13 != -1 && j13 + 1000 > SystemClock.currentThreadTimeMillis();
    }

    private void kegysxyocb(boolean z13) {
        this.f12358yadqdtsiqt = z13 ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    public static EditTextPreferenceDialogFragmentCompat wypolnanlu(String str) {
        EditTextPreferenceDialogFragmentCompat editTextPreferenceDialogFragmentCompat = new EditTextPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        editTextPreferenceDialogFragmentCompat.setArguments(bundle);
        return editTextPreferenceDialogFragmentCompat;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    protected void hkdspvbjdz() {
        kegysxyocb(true);
        stevsuqkhv();
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    protected boolean lmojexxdyd() {
        return true;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f12357istkbnxepw = cllcsxoeiz().iwxlajgraz();
        } else {
            this.f12357istkbnxepw = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f12357istkbnxepw);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void pkzmftpjix(boolean z13) {
        if (z13) {
            String string = this.f12359zynmafqrjb.getText().toString();
            EditTextPreference editTextPreferenceCllcsxoeiz = cllcsxoeiz();
            if (editTextPreferenceCllcsxoeiz.iobyxmoadg(string)) {
                editTextPreferenceCllcsxoeiz.dvvnrvtcbc(string);
            }
        }
    }

    void stevsuqkhv() {
        if (dsvhmnatus()) {
            EditText editText = this.f12359zynmafqrjb;
            if (editText == null || !editText.isFocused()) {
                kegysxyocb(false);
            } else if (((InputMethodManager) this.f12359zynmafqrjb.getContext().getSystemService("input_method")).showSoftInput(this.f12359zynmafqrjb, 0)) {
                kegysxyocb(false);
            } else {
                this.f12359zynmafqrjb.removeCallbacks(this.f12356cdpycssgdh);
                this.f12359zynmafqrjb.postDelayed(this.f12356cdpycssgdh, 50L);
            }
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    protected void wwaezpbzkn(View view) {
        super.wwaezpbzkn(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f12359zynmafqrjb = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f12359zynmafqrjb.setText(this.f12357istkbnxepw);
        EditText editText2 = this.f12359zynmafqrjb;
        editText2.setSelection(editText2.getText().length());
        cllcsxoeiz().auzgnhcxok();
    }
}
