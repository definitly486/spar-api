package wl;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo {
    public static String iobyxmoadg(String str) {
        return str != null ? str.toLowerCase(Locale.ROOT) : "";
    }

    public static String ppxfxbqfkf(String str, boolean z13) {
        return z13 ? iobyxmoadg(str) : zoijcleaow(str);
    }

    public static String wkgbmnqykc(String str) {
        return xl.iobyxmoadg.ppxfxbqfkf(str, xl.gxszxtbevo.iobyxmoadg.EnumC3087iobyxmoadg.xml);
    }

    public static String zoijcleaow(String str) {
        return iobyxmoadg(str).trim();
    }
}
