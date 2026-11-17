package modern.payments.ecomAndroid.util.extension;

import android.content.res.Resources;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0002\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\n\u001a\u001d\u0010\u000b\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0004*\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"dpToPx", "", "formatToStringAmount", "", "", "getResultOrNull", "(Ljava/lang/Integer;)Ljava/lang/Integer;", "isGreaterThan", "", "value", "(Ljava/lang/Integer;I)Z", "orDefault", "(Ljava/lang/Integer;I)I", "orZero", "(Ljava/lang/Long;)J", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class NumeralExtensionsKt {
    public static final int dpToPx(int i13) {
        return (int) (i13 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final String formatToStringAmount(long j13) {
        int i13 = 0;
        boolean z13 = j13 < 0;
        String strLxfrhoxuzk = kcexrzcfyt.lxfrhoxuzk(String.valueOf(j13), "-");
        if (strLxfrhoxuzk.length() == 2 && j13 != 0) {
            return StringExtensionsKt.addNegativeSymbol("0," + strLxfrhoxuzk, z13);
        }
        if (strLxfrhoxuzk.length() <= 2 || j13 == 0) {
            if (j13 == 0) {
                return CommonUrlParts.Values.FALSE_INTEGER;
            }
            return StringExtensionsKt.addNegativeSymbol(strLxfrhoxuzk + ",0", z13);
        }
        String string = kcexrzcfyt.fiwbwshyhd(strLxfrhoxuzk, strLxfrhoxuzk.length() - 2, strLxfrhoxuzk.length() - 2, StringUtils.COMMA).toString();
        for (int length = string.length() - 4; -1 < length; length--) {
            i13++;
            if (i13 != 0 && i13 % 3 == 0 && length != 0) {
                string = kcexrzcfyt.fiwbwshyhd(string, length, length, " ").toString();
            }
        }
        if (string.charAt(string.length() - 1) == '0' && string.charAt(string.length() - 2) == '0') {
            string = kcexrzcfyt.wizcaqwiak(string, string.length() - 3, string.length()).toString();
        }
        return StringExtensionsKt.addNegativeSymbol(string, z13);
    }

    public static final Integer getResultOrNull(Integer num) {
        if (num != null && num.intValue() == -1) {
            return null;
        }
        return num;
    }

    public static final boolean isGreaterThan(Integer num, int i13) {
        return num != null && num.intValue() > i13;
    }

    public static /* synthetic */ boolean isGreaterThan$default(Integer num, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = 0;
        }
        return isGreaterThan(num, i13);
    }

    public static final int orDefault(Integer num, int i13) {
        return num != null ? num.intValue() : i13;
    }

    public static /* synthetic */ int orDefault$default(Integer num, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = 0;
        }
        return orDefault(num, i13);
    }

    public static final long orZero(Long l13) {
        if (l13 != null) {
            return l13.longValue();
        }
        return 0L;
    }
}
