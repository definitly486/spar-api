package ru.tinkoff.decoro.watchers;

import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.inputmethod.BaseInputConnection;
import android.widget.EditText;
import android.widget.TextView;
import ru.tinkoff.decoro.Mask;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoijcleaow implements TextWatcher, ru.tinkoff.decoro.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f104869cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private TextView f104871iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Mask f104872jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private CharSequence f104875yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private iobyxmoadg f104876zdlpuopuiu = new iobyxmoadg();

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f104870esjtqupxsv = false;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f104873lereixgezr = false;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f104874pmvmpeiblj = false;

    protected zoijcleaow() {
    }

    private void dxjokdxxww(int i13) {
        TextView textView = this.f104871iwizpuwonk;
        if (!(textView instanceof EditText) || i13 > textView.length()) {
            return;
        }
        ((EditText) this.f104871iwizpuwonk).setSelection(i13);
    }

    private void zoijcleaow() {
        if (this.f104872jyumaefscl == null) {
            throw new IllegalStateException("Mask cannot be null at this point. Check maybe you forgot to call refreshMask()");
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        Mask mask;
        CharSequence charSequence;
        if (this.f104874pmvmpeiblj || this.f104870esjtqupxsv || (mask = this.f104872jyumaefscl) == null || this.f104873lereixgezr) {
            this.f104874pmvmpeiblj = false;
            this.f104873lereixgezr = false;
            return;
        }
        String string = mask.toString();
        int iZoijcleaow = this.f104876zdlpuopuiu.zoijcleaow();
        if (!string.equals(editable.toString())) {
            int composingSpanStart = BaseInputConnection.getComposingSpanStart(editable);
            int length = iZoijcleaow > editable.length() ? editable.length() : iZoijcleaow;
            if (composingSpanStart == -1 || length == -1) {
                charSequence = string;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) string.substring(0, composingSpanStart));
                SpannableString spannableString = new SpannableString(string.substring(composingSpanStart, length));
                BaseInputConnection.setComposingSpans(spannableString);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) string.substring(length, string.length()));
                charSequence = spannableStringBuilder;
            }
            this.f104870esjtqupxsv = true;
            editable.replace(0, editable.length(), charSequence, 0, string.length());
            this.f104870esjtqupxsv = false;
        }
        if (iZoijcleaow >= 0 && iZoijcleaow <= editable.length()) {
            dxjokdxxww(iZoijcleaow);
        }
        this.f104875yggfygwlhe = null;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        if (this.f104870esjtqupxsv || this.f104872jyumaefscl == null) {
            return;
        }
        this.f104875yggfygwlhe = new String(charSequence.toString());
        this.f104876zdlpuopuiu.iobyxmoadg(i13, i14, i15);
    }

    protected void eablkybsjg(TextView textView, boolean z13) {
        if (textView == null) {
            throw new IllegalArgumentException("text view cannot be null");
        }
        this.f104871iwizpuwonk = textView;
        this.f104869cqumvgiudr = z13;
        textView.removeTextChangedListener(this);
        textView.addTextChangedListener(this);
        this.f104872jyumaefscl = null;
        lqeggnwhkg();
    }

    public boolean gxszxtbevo() {
        return this.f104871iwizpuwonk != null;
    }

    public void lqeggnwhkg() {
        nufgyqmvbu(null);
    }

    public void nufgyqmvbu(CharSequence charSequence) {
        boolean z13 = this.f104872jyumaefscl == null;
        this.f104872jyumaefscl = iobyxmoadg();
        zoijcleaow();
        boolean z14 = charSequence != null;
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        this.f104876zdlpuopuiu = iobyxmoadgVar;
        if (z14) {
            iobyxmoadgVar.gtknphoqwx(this.f104872jyumaefscl.f0(charSequence));
        }
        if ((!z13 || this.f104869cqumvgiudr || z14) && gxszxtbevo()) {
            this.f104870esjtqupxsv = true;
            String string = this.f104872jyumaefscl.toString();
            TextView textView = this.f104871iwizpuwonk;
            if (textView instanceof EditText) {
                Editable editable = (Editable) textView.getText();
                editable.replace(0, editable.length(), string, 0, string.length());
            } else {
                textView.setText(string);
            }
            dxjokdxxww(this.f104872jyumaefscl.lxfrhoxuzk());
            this.f104870esjtqupxsv = false;
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        CharSequence charSequenceSubSequence;
        if (this.f104870esjtqupxsv || this.f104872jyumaefscl == null) {
            return;
        }
        if (this.f104876zdlpuopuiu.lqeggnwhkg()) {
            charSequenceSubSequence = charSequence.subSequence(this.f104876zdlpuopuiu.gxszxtbevo(), this.f104876zdlpuopuiu.ppxfxbqfkf());
            if (this.f104876zdlpuopuiu.dxjokdxxww() && this.f104875yggfygwlhe.subSequence(this.f104876zdlpuopuiu.gxszxtbevo(), this.f104876zdlpuopuiu.ppxfxbqfkf()).equals(charSequenceSubSequence)) {
                this.f104876zdlpuopuiu.btonecajqb(charSequenceSubSequence.length());
            }
        } else {
            charSequenceSubSequence = null;
        }
        boolean zEquals = this.f104875yggfygwlhe.equals(charSequence.toString());
        this.f104873lereixgezr = zEquals;
        if (zEquals) {
            return;
        }
        if (this.f104876zdlpuopuiu.nufgyqmvbu()) {
            if (this.f104876zdlpuopuiu.lqeggnwhkg()) {
                iobyxmoadg iobyxmoadgVar = this.f104876zdlpuopuiu;
                iobyxmoadgVar.gtknphoqwx(this.f104872jyumaefscl.rhgxfdycjh(iobyxmoadgVar.wkgbmnqykc(), this.f104876zdlpuopuiu.eablkybsjg()));
            } else {
                iobyxmoadg iobyxmoadgVar2 = this.f104876zdlpuopuiu;
                iobyxmoadgVar2.gtknphoqwx(this.f104872jyumaefscl.a(iobyxmoadgVar2.wkgbmnqykc(), this.f104876zdlpuopuiu.eablkybsjg()));
            }
        }
        if (this.f104876zdlpuopuiu.lqeggnwhkg()) {
            iobyxmoadg iobyxmoadgVar3 = this.f104876zdlpuopuiu;
            iobyxmoadgVar3.gtknphoqwx(this.f104872jyumaefscl.krqnebusok(iobyxmoadgVar3.gxszxtbevo(), charSequenceSubSequence));
        }
    }

    public Mask ppxfxbqfkf() {
        return new UnmodifiableMask(this.f104872jyumaefscl);
    }

    public String toString() {
        Mask mask = this.f104872jyumaefscl;
        return mask == null ? "" : mask.toString();
    }

    public void wkgbmnqykc(TextView textView) {
        eablkybsjg(textView, false);
    }
}
