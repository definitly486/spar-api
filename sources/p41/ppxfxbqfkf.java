package p41;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.TypedValue;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {
    public static final boolean eablkybsjg(Context context) {
        zdlpuopuiu.btonecajqb(context, "<this>");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final void iobyxmoadg(Context context, CharSequence charSequence, CharSequence text) {
        zdlpuopuiu.btonecajqb(context, "<this>");
        zdlpuopuiu.btonecajqb(text, "text");
        Object systemService = context.getSystemService("clipboard");
        zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        if (charSequence == null) {
            charSequence = text;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText(charSequence, text));
    }

    public static final int ppxfxbqfkf(Context context, int i13) {
        zdlpuopuiu.btonecajqb(context, "<this>");
        TypedValue typedValue = new TypedValue();
        boolean zResolveAttribute = context.getTheme().resolveAttribute(i13, typedValue, true);
        if (zResolveAttribute) {
            return androidx.core.content.iobyxmoadg.getColor(context, typedValue.resourceId);
        }
        if (zResolveAttribute) {
            throw new NoWhenBranchMatchedException();
        }
        return -16777216;
    }

    public static final int wkgbmnqykc(Context context, int i13) {
        zdlpuopuiu.btonecajqb(context, "<this>");
        return context.getResources().getDimensionPixelSize(i13);
    }

    public static /* synthetic */ void zoijcleaow(Context context, CharSequence charSequence, CharSequence charSequence2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            charSequence = null;
        }
        iobyxmoadg(context, charSequence, charSequence2);
    }
}
