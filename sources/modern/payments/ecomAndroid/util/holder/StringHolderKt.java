package modern.payments.ecomAndroid.util.holder;

import android.content.Context;
import hg.agtfadlqog;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0000\u001a+\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0000¢\u0006\u0002\u0010\t\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\nH\u0000\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\f\u0010\u000e\u001a\u00020\u0001*\u00020\u0003H\u0000¨\u0006\u000f"}, d2 = {"StringHolder", "Lmodern/payments/ecomAndroid/util/holder/StringHolder;", "text", "", "resource", "", "args", "", "", "(I[Ljava/lang/Object;)Lmodern/payments/ecomAndroid/util/holder/StringHolder;", "", "getText", "context", "Landroid/content/Context;", "toStringHolder", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StringHolderKt {
    public static final StringHolder StringHolder(int i13) {
        return new StringHolder.Resource(i13, null, 2, null);
    }

    public static final String getText(StringHolder stringHolder, Context context) {
        String string;
        zdlpuopuiu.btonecajqb(stringHolder, "<this>");
        zdlpuopuiu.btonecajqb(context, "context");
        if (stringHolder instanceof StringHolder.Text) {
            return ((StringHolder.Text) stringHolder).getText().toString();
        }
        if (!(stringHolder instanceof StringHolder.Resource)) {
            throw new NoWhenBranchMatchedException();
        }
        StringHolder.Resource resource = (StringHolder.Resource) stringHolder;
        if (resource.getArgs().isEmpty()) {
            string = context.getString(resource.getResId());
        } else {
            int size = resource.getArgs().size();
            Object[] objArr = new Object[size];
            for (int i13 = 0; i13 < size; i13++) {
                Object text = resource.getArgs().get(i13);
                if (text instanceof StringHolder) {
                    text = getText((StringHolder) text, context);
                }
                objArr[i13] = text;
            }
            string = context.getString(resource.getResId(), Arrays.copyOf(objArr, size));
        }
        zdlpuopuiu.lqeggnwhkg(string);
        return string;
    }

    public static final StringHolder toStringHolder(CharSequence charSequence) {
        zdlpuopuiu.btonecajqb(charSequence, "<this>");
        return new StringHolder.Text(charSequence);
    }

    public static final StringHolder StringHolder(int i13, Object... args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return new StringHolder.Resource(i13, agtfadlqog.i(args));
    }

    public static final StringHolder StringHolder(CharSequence text) {
        zdlpuopuiu.btonecajqb(text, "text");
        return new StringHolder.Text(text);
    }

    public static final StringHolder StringHolder(String text) {
        zdlpuopuiu.btonecajqb(text, "text");
        return new StringHolder.Text(text);
    }
}
