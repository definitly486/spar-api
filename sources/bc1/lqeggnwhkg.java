package bc1;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lqeggnwhkg {

    public static final class iobyxmoadg implements TextWatcher {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f15757zdlpuopuiu;

        iobyxmoadg(tg.draadjrbmk draadjrbmkVar) {
            this.f15757zdlpuopuiu = draadjrbmkVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
            this.f15757zdlpuopuiu.invoke(charSequence);
        }
    }

    public static final void iobyxmoadg(EditText editText, tg.draadjrbmk onTextChanged) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(editText, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onTextChanged, "onTextChanged");
        editText.addTextChangedListener(new iobyxmoadg(onTextChanged));
    }

    public static final void zoijcleaow(EditText editText, String value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(editText, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        Editable text = editText.getText();
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(text != null ? text.toString() : null, value)) {
            return;
        }
        editText.setText(value);
    }
}
