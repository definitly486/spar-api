package c3;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public interface wkgbmnqykc {
    static long iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar.ppxfxbqfkf("exo_len", -1L);
    }

    static Uri zoijcleaow(wkgbmnqykc wkgbmnqykcVar) {
        String strWkgbmnqykc = wkgbmnqykcVar.wkgbmnqykc("exo_redir", null);
        if (strWkgbmnqykc == null) {
            return null;
        }
        return Uri.parse(strWkgbmnqykc);
    }

    long ppxfxbqfkf(String str, long j13);

    String wkgbmnqykc(String str, String str2);
}
