package lb0;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: lb0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1262iobyxmoadg implements TextWatcher {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ draadjrbmk f62037zdlpuopuiu;

        C1262iobyxmoadg(draadjrbmk draadjrbmkVar) {
            this.f62037zdlpuopuiu = draadjrbmkVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f62037zdlpuopuiu.invoke(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        }
    }

    public static final void iobyxmoadg(EditText editText, draadjrbmk afterTextChanged) {
        zdlpuopuiu.btonecajqb(editText, "<this>");
        zdlpuopuiu.btonecajqb(afterTextChanged, "afterTextChanged");
        editText.addTextChangedListener(new C1262iobyxmoadg(afterTextChanged));
    }
}
