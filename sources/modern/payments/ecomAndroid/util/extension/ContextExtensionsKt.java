package modern.payments.ecomAndroid.util.extension;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Landroid/content/Context;", "Landroid/view/View;", "view", "Lgg/wwaezpbzkn;", "hideKeyboard", "(Landroid/content/Context;Landroid/view/View;)V", "showKeyboard", "", "resId", "getPixelsFromDp", "(Landroid/content/Context;I)I", "getIntDimension", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ContextExtensionsKt {
    public static final int getIntDimension(Context context, int i13) {
        zdlpuopuiu.btonecajqb(context, "<this>");
        return vg.iobyxmoadg.wkgbmnqykc(context.getResources().getDimension(i13));
    }

    public static final int getPixelsFromDp(Context context, int i13) {
        zdlpuopuiu.btonecajqb(context, "<this>");
        return context.getResources().getDimensionPixelSize(i13);
    }

    public static final void hideKeyboard(Context context, View view) {
        zdlpuopuiu.btonecajqb(context, "<this>");
        zdlpuopuiu.btonecajqb(view, "view");
        Object systemService = context.getSystemService("input_method");
        zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final void showKeyboard(Context context, View view) {
        zdlpuopuiu.btonecajqb(context, "<this>");
        zdlpuopuiu.btonecajqb(view, "view");
        if (view.requestFocus()) {
            Object systemService = context.getSystemService("input_method");
            zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(view, 1);
        }
    }
}
