package j2;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
final class lqeggnwhkg implements TextWatcher {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private i2.iobyxmoadg.AbstractC0977iobyxmoadg f50554jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final boolean f50555yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final EditText f50556zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f50553iwizpuwonk = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f50551cqumvgiudr = 0;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f50552esjtqupxsv = true;

    lqeggnwhkg(EditText editText, boolean z13) {
        this.f50556zdlpuopuiu = editText;
        this.f50555yggfygwlhe = z13;
    }

    private boolean ppxfxbqfkf() {
        return (this.f50552esjtqupxsv && (this.f50555yggfygwlhe || i2.iobyxmoadg.wkgbmnqykc())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
    }

    public boolean iobyxmoadg() {
        return this.f50552esjtqupxsv;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        if (this.f50556zdlpuopuiu.isInEditMode() || ppxfxbqfkf() || i14 > i15 || !(charSequence instanceof Spannable)) {
            return;
        }
        i2.iobyxmoadg.iobyxmoadg();
        throw null;
    }

    public void zoijcleaow(boolean z13) {
        if (this.f50552esjtqupxsv != z13) {
            this.f50552esjtqupxsv = z13;
            if (z13) {
                i2.iobyxmoadg.iobyxmoadg();
                throw null;
            }
        }
    }
}
