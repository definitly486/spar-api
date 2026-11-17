package modern.payments.ecomAndroid.data;

import android.content.Context;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import xg.ppxfxbqfkf;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lmodern/payments/ecomAndroid/data/Utils;", "", "()V", "HEX_BASE", "", "dpToPx", "", "context", "Landroid/content/Context;", "dp", "generateHex", "", "length", "generateRqUID32Sym", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Utils {
    private static final int HEX_BASE = 16;
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    public final float dpToPx(Context context, float dp2) {
        zdlpuopuiu.btonecajqb(context, "context");
        return dp2 * context.getResources().getDisplayMetrics().density;
    }

    public final String generateHex(int length) {
        StringBuilder sb3 = new StringBuilder();
        for (int i13 = 0; i13 < length; i13++) {
            sb3.append(Integer.toHexString(ppxfxbqfkf.f122316zdlpuopuiu.lqeggnwhkg(16)));
        }
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public final String generateRqUID32Sym() {
        String string = UUID.randomUUID().toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return kcexrzcfyt.hcddaimhww(string, "-", "", false, 4, null);
    }
}
