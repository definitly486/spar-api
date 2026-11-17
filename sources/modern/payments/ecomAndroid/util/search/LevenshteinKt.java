package modern.payments.ecomAndroid.util.search;

import com.google.android.gms.actions.SearchIntents;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0005"}, d2 = {"levenshteinDistance", "", SearchIntents.EXTRA_QUERY, "", "word", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LevenshteinKt {
    public static final double levenshteinDistance(String query, String word) {
        zdlpuopuiu.btonecajqb(query, "query");
        zdlpuopuiu.btonecajqb(word, "word");
        if (zdlpuopuiu.eablkybsjg(query, word) || zdlpuopuiu.eablkybsjg(query, word)) {
            return 0.0d;
        }
        if (query.length() == 0 || word.length() == 0) {
            return 1.0d;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = query.toLowerCase(locale);
        zdlpuopuiu.dxjokdxxww(lowerCase, "toLowerCase(...)");
        String lowerCase2 = kcexrzcfyt.y(word, gtknphoqwx.btonecajqb(lowerCase.length(), word.length())).toLowerCase(locale);
        zdlpuopuiu.dxjokdxxww(lowerCase2, "toLowerCase(...)");
        int i13 = 1;
        int length = lowerCase2.length() + 1;
        int[] iArr = new int[length];
        int[] iArr2 = new int[lowerCase2.length() + 1];
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            iArr[i15] = i15;
        }
        int length2 = lowerCase.length();
        int i16 = 0;
        while (i16 < length2) {
            int i17 = i16 + 1;
            iArr2[i14] = i17;
            int length3 = lowerCase2.length();
            int i18 = i14;
            int iMin = i17;
            while (i18 < length3) {
                int i19 = i18 + 1;
                int i23 = length2;
                int iMin2 = (int) Math.min(iArr2[i18] + i13, Math.min(iArr[i19] + 1, iArr[i18] + (lowerCase.charAt(i16) == lowerCase2.charAt(i18) ? i14 : i13)));
                iArr2[i19] = iMin2;
                iMin = (int) Math.min(iMin, iMin2);
                i16 = i16;
                i18 = i19;
                length2 = i23;
                i13 = 1;
                i14 = 0;
            }
            i16 = i17;
            int[] iArr3 = iArr2;
            iArr2 = iArr;
            iArr = iArr3;
        }
        return ((double) iArr[lowerCase2.length()]) / ((double) Math.max(lowerCase.length(), lowerCase2.length()));
    }
}
