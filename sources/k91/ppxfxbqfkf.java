package k91;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {
    public static final void iobyxmoadg(TextView textView, int i13, Integer num, Integer num2, int i14) {
        zdlpuopuiu.btonecajqb(textView, "<this>");
        Drawable drawable = androidx.core.content.iobyxmoadg.getDrawable(textView.getContext(), i13);
        if (num != null && drawable != null) {
            drawable.setBounds(0, 0, num.intValue(), num.intValue());
        }
        if (num2 != null && drawable != null) {
            drawable.setTint(num2.intValue());
        }
        textView.setCompoundDrawablePadding(i14);
        textView.setCompoundDrawables(null, null, drawable, null);
    }
}
