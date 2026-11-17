package modern.payments.ecomAndroid.util.extension;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0001H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0001H\u0000¨\u0006\u0006"}, d2 = {"formatToLongOrderId", "", "formatToShortOrderId", "isLongOrderId", "", "isShortOrderId", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class OrderIdExtensionsKt {
    public static final String formatToLongOrderId(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        if (!isShortOrderId(str)) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(kcexrzcfyt.y(str, 8));
        sb3.append('-');
        String strSubstring = str.substring(8, 12);
        zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        sb3.append(strSubstring);
        sb3.append('-');
        String strSubstring2 = str.substring(12, 16);
        zdlpuopuiu.dxjokdxxww(strSubstring2, "substring(...)");
        sb3.append(strSubstring2);
        sb3.append('-');
        String strSubstring3 = str.substring(16, 20);
        zdlpuopuiu.dxjokdxxww(strSubstring3, "substring(...)");
        sb3.append(strSubstring3);
        sb3.append('-');
        sb3.append(kcexrzcfyt.z(str, 12));
        return sb3.toString();
    }

    public static final String formatToShortOrderId(String str) throws IOException {
        zdlpuopuiu.btonecajqb(str, "<this>");
        if (!isLongOrderId(str)) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt != '-') {
                sb3.append(cCharAt);
            }
        }
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public static final boolean isLongOrderId(String str) throws IOException {
        zdlpuopuiu.btonecajqb(str, "<this>");
        if (str.length() == 36) {
            List listMhtqkkgtqm = kcexrzcfyt.mhtqkkgtqm(str, new char[]{'-'}, false, 0, 6, null);
            if (listMhtqkkgtqm.size() == 5) {
                String str2 = (String) listMhtqkkgtqm.get(0);
                StringBuilder sb3 = new StringBuilder();
                int length = str2.length();
                for (int i13 = 0; i13 < length; i13++) {
                    char cCharAt = str2.charAt(i13);
                    if (Character.isLetterOrDigit(cCharAt)) {
                        sb3.append(cCharAt);
                    }
                }
                String string = sb3.toString();
                zdlpuopuiu.dxjokdxxww(string, "toString(...)");
                if (string.length() == 8) {
                    String str3 = (String) listMhtqkkgtqm.get(1);
                    StringBuilder sb4 = new StringBuilder();
                    int length2 = str3.length();
                    for (int i14 = 0; i14 < length2; i14++) {
                        char cCharAt2 = str3.charAt(i14);
                        if (Character.isLetterOrDigit(cCharAt2)) {
                            sb4.append(cCharAt2);
                        }
                    }
                    String string2 = sb4.toString();
                    zdlpuopuiu.dxjokdxxww(string2, "toString(...)");
                    if (string2.length() == 4) {
                        String str4 = (String) listMhtqkkgtqm.get(2);
                        StringBuilder sb5 = new StringBuilder();
                        int length3 = str4.length();
                        for (int i15 = 0; i15 < length3; i15++) {
                            char cCharAt3 = str4.charAt(i15);
                            if (Character.isLetterOrDigit(cCharAt3)) {
                                sb5.append(cCharAt3);
                            }
                        }
                        String string3 = sb5.toString();
                        zdlpuopuiu.dxjokdxxww(string3, "toString(...)");
                        if (string3.length() == 4) {
                            String str5 = (String) listMhtqkkgtqm.get(3);
                            StringBuilder sb6 = new StringBuilder();
                            int length4 = str5.length();
                            for (int i16 = 0; i16 < length4; i16++) {
                                char cCharAt4 = str5.charAt(i16);
                                if (Character.isLetterOrDigit(cCharAt4)) {
                                    sb6.append(cCharAt4);
                                }
                            }
                            String string4 = sb6.toString();
                            zdlpuopuiu.dxjokdxxww(string4, "toString(...)");
                            if (string4.length() == 4) {
                                String str6 = (String) listMhtqkkgtqm.get(4);
                                StringBuilder sb7 = new StringBuilder();
                                int length5 = str6.length();
                                for (int i17 = 0; i17 < length5; i17++) {
                                    char cCharAt5 = str6.charAt(i17);
                                    if (Character.isLetterOrDigit(cCharAt5)) {
                                        sb7.append(cCharAt5);
                                    }
                                }
                                String string5 = sb7.toString();
                                zdlpuopuiu.dxjokdxxww(string5, "toString(...)");
                                if (string5.length() == 12) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isShortOrderId(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        if (str.length() != 32) {
            return false;
        }
        for (int i13 = 0; i13 < str.length(); i13++) {
            if (!Character.isLetterOrDigit(str.charAt(i13))) {
                return false;
            }
        }
        return true;
    }
}
