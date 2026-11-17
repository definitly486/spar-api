package spay.sdk.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import jc2.iobyxmoadg;
import kk.kd0;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.hkdspvbjdz;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import spay.sdk.domain.model.PayStrategy;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lspay/sdk/view/PhoneNumberCompositeView;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lspay/sdk/domain/model/PayStrategy;", "a", "Lspay/sdk/domain/model/PayStrategy;", "getPayStrategy", "()Lspay/sdk/domain/model/PayStrategy;", "setPayStrategy", "(Lspay/sdk/domain/model/PayStrategy;)V", "payStrategy", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PhoneNumberCompositeView extends AppCompatEditText {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public PayStrategy payStrategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f107865b;

    public /* synthetic */ PhoneNumberCompositeView(Context context, AttributeSet attributeSet, int i13, gtknphoqwx gtknphoqwxVar) {
        this(context, (i13 & 2) != 0 ? null : attributeSet);
    }

    public static String a(String str) {
        String strLxfrhoxuzk;
        int i13 = 0;
        if (kcexrzcfyt.stevsuqkhv(str, "+7", false, 2, null)) {
            strLxfrhoxuzk = kcexrzcfyt.lxfrhoxuzk(str, "+7");
        } else if (kcexrzcfyt.stevsuqkhv(str, "+", false, 2, null)) {
            strLxfrhoxuzk = kcexrzcfyt.lxfrhoxuzk(str, "+");
        } else {
            strLxfrhoxuzk = kcexrzcfyt.stevsuqkhv(str, "7", false, 2, null) ? kcexrzcfyt.lxfrhoxuzk(str, "7") : str;
        }
        hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz();
        StringBuilder sb3 = new StringBuilder();
        int length = strLxfrhoxuzk.length();
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = strLxfrhoxuzk.charAt(i14);
            if (Character.isDigit(cCharAt)) {
                sb3.append(cCharAt);
            }
        }
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "filterTo(StringBuilder(), predicate).toString()");
        hkdspvbjdzVar.f60015zdlpuopuiu = string;
        if (string.length() > 10) {
            iobyxmoadg.f51100iobyxmoadg.dxjokdxxww("Phone number " + str + " is greater than 11 allowed chars", new Object[0]);
            hkdspvbjdzVar.f60015zdlpuopuiu = kcexrzcfyt.y((String) hkdspvbjdzVar.f60015zdlpuopuiu, 10);
        }
        StringBuilder sb4 = new StringBuilder("+7");
        CharSequence charSequence = (CharSequence) hkdspvbjdzVar.f60015zdlpuopuiu;
        int i15 = 0;
        while (i13 < charSequence.length()) {
            char cCharAt2 = charSequence.charAt(i13);
            int i16 = i15 + 1;
            if (i15 == 0) {
                sb4.append(" " + cCharAt2);
            } else if (i15 == 3) {
                sb4.append(" " + cCharAt2);
            } else if (i15 == 6) {
                sb4.append("-" + cCharAt2);
            } else if (i15 != 8) {
                sb4.append(cCharAt2);
            } else {
                sb4.append("-" + cCharAt2);
            }
            i13++;
            i15 = i16;
        }
        String string2 = sb4.toString();
        zdlpuopuiu.dxjokdxxww(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public final PayStrategy getPayStrategy() {
        return this.payStrategy;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i13, int i14) {
        Editable text = getText();
        if (text == null || kcexrzcfyt.zfvoamnweg(text)) {
            return;
        }
        Editable text2 = getText();
        int length = text2 != null ? text2.length() : 0;
        Editable text3 = getText();
        int length2 = text3 != null ? text3.length() : 0;
        setSelection(length, length2);
        super.onSelectionChanged(length, length2);
    }

    public final void setPayStrategy(PayStrategy payStrategy) {
        zdlpuopuiu.btonecajqb(payStrategy, "<set-?>");
        this.payStrategy = payStrategy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberCompositeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        zdlpuopuiu.btonecajqb(context, "context");
        this.payStrategy = PayStrategy.PayWithPhoneNumber.INSTANCE;
        zdlpuopuiu.btonecajqb(this, "<this>");
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(16)});
        setInputType(3);
        setKeyListener(DigitsKeyListener.getInstance("0123456789"));
        addTextChangedListener(new kd0(this));
    }
}
