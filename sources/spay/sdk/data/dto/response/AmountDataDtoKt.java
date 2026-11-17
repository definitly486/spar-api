package spay.sdk.data.dto.response;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"takeKopecksFromDouble", "", "", "SPaySDK_baseRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AmountDataDtoKt {
    /* JADX WARN: Code duplicated, block: B:22:0x006e A[Catch: NumberFormatException -> 0x009f, TryCatch #0 {NumberFormatException -> 0x009f, blocks: (B:3:0x0003, B:6:0x000b, B:12:0x001a, B:25:0x009a, B:13:0x002c, B:15:0x003c, B:16:0x004e, B:19:0x005d, B:22:0x006e, B:24:0x007b, B:9:0x0014), top: B:28:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x007b A[Catch: NumberFormatException -> 0x009f, TryCatch #0 {NumberFormatException -> 0x009f, blocks: (B:3:0x0003, B:6:0x000b, B:12:0x001a, B:25:0x009a, B:13:0x002c, B:15:0x003c, B:16:0x004e, B:19:0x005d, B:22:0x006e, B:24:0x007b, B:9:0x0014), top: B:28:0x0003 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x007b, please report this as an issue */
    private static final int takeKopecksFromDouble(String str) {
        String strSubstring;
        try {
            int length = str.length();
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    i13 = -1;
                    break;
                }
                if (str.charAt(i13) == '.') {
                    break;
                }
                i13++;
            }
            if (i13 == -1) {
                str = str + "00";
            } else {
                int i14 = i13 + 1;
                String strSubstring2 = str.substring(i14);
                zdlpuopuiu.dxjokdxxww(strSubstring2, "this as java.lang.String).substring(startIndex)");
                if (strSubstring2.length() >= 2) {
                    str = kcexrzcfyt.y(kcexrzcfyt.hcddaimhww(str, ".", "", false, 4, null), i13 + 2);
                } else {
                    String strSubstring3 = str.substring(i14);
                    zdlpuopuiu.dxjokdxxww(strSubstring3, "this as java.lang.String).substring(startIndex)");
                    if (strSubstring3.length() < 2) {
                        String strSubstring4 = str.substring(0, i13);
                        zdlpuopuiu.dxjokdxxww(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                        if (zdlpuopuiu.eablkybsjg(strSubstring4, CommonUrlParts.Values.FALSE_INTEGER)) {
                            str = CommonUrlParts.Values.FALSE_INTEGER;
                        } else {
                            strSubstring = str.substring(i14);
                            zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String).substring(startIndex)");
                            if (strSubstring.length() < 2) {
                                str = kcexrzcfyt.y(kcexrzcfyt.hcddaimhww(str, ".", "", false, 4, null), i14) + CommonUrlParts.Values.FALSE_INTEGER;
                            }
                        }
                    } else {
                        strSubstring = str.substring(i14);
                        zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String).substring(startIndex)");
                        if (strSubstring.length() < 2) {
                            str = kcexrzcfyt.y(kcexrzcfyt.hcddaimhww(str, ".", "", false, 4, null), i14) + CommonUrlParts.Values.FALSE_INTEGER;
                        }
                    }
                }
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
