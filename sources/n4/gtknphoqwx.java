package n4;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
abstract class gtknphoqwx {
    public static String iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        String str = iobyxmoadgVar.f9769ojitshcjhn;
        if (v2.iwizpuwonk.vdvldrhtss(str)) {
            return "video/mp4";
        }
        if (v2.iwizpuwonk.agtfadlqog(str)) {
            return "audio/mp4";
        }
        if (!v2.iwizpuwonk.ojitshcjhn(str)) {
            return "application/mp4";
        }
        if (Objects.equals(str, "image/heic")) {
            return "image/heif";
        }
        return Objects.equals(str, "image/avif") ? "image/avif" : "application/mp4";
    }

    public static String zoijcleaow(List list) {
        Iterator it = list.iterator();
        boolean z13 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((iwizpuwonk) it.next()).f68600iobyxmoadg.f68719lqeggnwhkg.f9769ojitshcjhn;
            if (v2.iwizpuwonk.vdvldrhtss(str2)) {
                return "video/mp4";
            }
            if (v2.iwizpuwonk.agtfadlqog(str2)) {
                z13 = true;
            } else if (v2.iwizpuwonk.ojitshcjhn(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z13) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }
}
