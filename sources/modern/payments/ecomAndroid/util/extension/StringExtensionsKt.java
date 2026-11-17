package modern.payments.ecomAndroid.util.extension;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import lj.btonecajqb;
import mj.kcexrzcfyt;
import mj.rgvfuqvkyq;
import modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001f\u0010\u0002\u001a\u00020\u0000*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0005\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\u0005\u001a\u0013\u0010\n\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u0005\u001a\u001d\u0010\u000e\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u001a\u0010\u0005\u001a\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u001b\u0010\u0005\u001a\u0013\u0010\u001c\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u0005\u001a\u0015\u0010\u001d\u001a\u00020\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u0005\u001a\u0011\u0010\u001e\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u0005\u001a\u0011\u0010\u001f\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u001f\u0010\u0005\u001a\u0013\u0010 \u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b \u0010\u0005\u001a\u0013\u0010!\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b!\u0010\u0005¨\u0006\""}, d2 = {"", "default", "orDefault", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "escapeLineBreaks", "(Ljava/lang/String;)Ljava/lang/String;", "toUrl", "iso4217ToSymbol", "symbolToIso4217", "codeToSymbol", "symbolToCode", "", "base64Flag", "Landroid/graphics/Bitmap;", "decodeToBitmap", "(Ljava/lang/String;I)Landroid/graphics/Bitmap;", "", "isNegative", "addNegativeSymbol", "(Ljava/lang/String;Z)Ljava/lang/String;", "Lmj/rgvfuqvkyq;", "regexPattern", "Llj/btonecajqb;", "Lmj/draadjrbmk;", "substrings", "(Ljava/lang/String;Lmj/rgvfuqvkyq;)Llj/btonecajqb;", "getValueOrNull", "getIfNotUnavailableOrNull", "toJsonView", "noExceptionMessage", "encodeBase64", "decodeBase64", "clearFromCodes", "maskData", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StringExtensionsKt {
    public static final String addNegativeSymbol(String str, boolean z13) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        if (!z13) {
            return str;
        }
        return '-' + str;
    }

    public static final String clearFromCodes(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        return kcexrzcfyt.hcddaimhww(kcexrzcfyt.hcddaimhww(kcexrzcfyt.hcddaimhww(kcexrzcfyt.hcddaimhww(str, "%2F", CardDateFormatTextWatcher.DIVIDER_CHARACTER, false, 4, null), "%3D", "=", false, 4, null), "%2B", "+", false, 4, null), "%3A", StringUtils.PROCESS_POSTFIX_DELIMITER, false, 4, null);
    }

    public static final String codeToSymbol(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        zdlpuopuiu.dxjokdxxww(upperCase, "toUpperCase(...)");
        return zdlpuopuiu.eablkybsjg(upperCase, "RUB") ? "₽" : "";
    }

    public static final String decodeBase64(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        byte[] bArrDecode = Base64.decode(str, 0);
        zdlpuopuiu.lqeggnwhkg(bArrDecode);
        return new String(bArrDecode, mj.wkgbmnqykc.f67326zoijcleaow);
    }

    public static final Bitmap decodeToBitmap(String str, int i13) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        byte[] bArrDecode = Base64.decode(str, i13);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        zdlpuopuiu.dxjokdxxww(bitmapDecodeByteArray, "decodeByteArray(...)");
        return bitmapDecodeByteArray;
    }

    public static /* synthetic */ Bitmap decodeToBitmap$default(String str, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = 0;
        }
        return decodeToBitmap(str, i13);
    }

    public static final String encodeBase64(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        byte[] bytes = str.getBytes(mj.wkgbmnqykc.f67326zoijcleaow);
        zdlpuopuiu.dxjokdxxww(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 1);
        zdlpuopuiu.dxjokdxxww(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public static final String escapeLineBreaks(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        return kcexrzcfyt.hcddaimhww(str, "\n", "", false, 4, null);
    }

    public static final String getIfNotUnavailableOrNull(String str) {
        if (zdlpuopuiu.eablkybsjg(str, "-1")) {
            return null;
        }
        return str;
    }

    public static final String getValueOrNull(String str) {
        if (str == null) {
            return null;
        }
        if (kcexrzcfyt.zfvoamnweg(str)) {
            str = null;
        }
        return str;
    }

    public static final String iso4217ToSymbol(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        return zdlpuopuiu.eablkybsjg(str, "643") ? "₽" : "";
    }

    public static final String maskData(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        return "***..." + kcexrzcfyt.z(str, 4) + " (" + str.length() + ')';
    }

    public static final String noExceptionMessage(String str) {
        return str == null ? "No Json or Exception message" : str;
    }

    public static final String orDefault(String str, String str2) {
        zdlpuopuiu.btonecajqb(str2, "default");
        return str == null ? str2 : str;
    }

    public static /* synthetic */ String orDefault$default(String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str2 = "";
        }
        return orDefault(str, str2);
    }

    public static final btonecajqb substrings(String str, rgvfuqvkyq regexPattern) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        zdlpuopuiu.btonecajqb(regexPattern, "regexPattern");
        return rgvfuqvkyq.btonecajqb(regexPattern, str, 0, 2, null);
    }

    public static final String symbolToCode(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        return zdlpuopuiu.eablkybsjg(str, "₽") ? "RUB" : "";
    }

    public static final String symbolToIso4217(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        return zdlpuopuiu.eablkybsjg(str, "₽") ? "643" : "";
    }

    public static final String toJsonView(String str) {
        Object objWkgbmnqykc;
        zdlpuopuiu.btonecajqb(str, "<this>");
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            String string = kcexrzcfyt.p(str).toString();
            String string2 = null;
            if (kcexrzcfyt.stevsuqkhv(string, "{", false, 2, null)) {
                string2 = new JSONObject(string).toString(2);
            } else if (kcexrzcfyt.stevsuqkhv(string, "[", false, 2, null)) {
                string2 = new JSONArray(string).toString(2);
            }
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(string2);
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        return noExceptionMessage((String) objWkgbmnqykc);
    }

    public static final String toUrl(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        return EcomSbpViewModel.HTTPS_PATTERN + str;
    }
}
