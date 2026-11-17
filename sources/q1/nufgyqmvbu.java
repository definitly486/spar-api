package q1;

import android.os.LocaleList;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final nufgyqmvbu f77646zoijcleaow = iobyxmoadg(new Locale[0]);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dxjokdxxww f77647iobyxmoadg;

    static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private static final Locale[] f77648iobyxmoadg = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale iobyxmoadg(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    static class zoijcleaow {
        static LocaleList iobyxmoadg(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    private nufgyqmvbu(dxjokdxxww dxjokdxxwwVar) {
        this.f77647iobyxmoadg = dxjokdxxwwVar;
    }

    public static nufgyqmvbu dxjokdxxww(LocaleList localeList) {
        return new nufgyqmvbu(new btonecajqb(localeList));
    }

    public static nufgyqmvbu iobyxmoadg(Locale... localeArr) {
        return dxjokdxxww(zoijcleaow.iobyxmoadg(localeArr));
    }

    public static nufgyqmvbu wkgbmnqykc() {
        return f77646zoijcleaow;
    }

    public static nufgyqmvbu zoijcleaow(String str) {
        if (str == null || str.isEmpty()) {
            return wkgbmnqykc();
        }
        String[] strArrSplit = str.split(StringUtils.COMMA, -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i13 = 0; i13 < length; i13++) {
            localeArr[i13] = iobyxmoadg.iobyxmoadg(strArrSplit[i13]);
        }
        return iobyxmoadg(localeArr);
    }

    public boolean eablkybsjg() {
        return this.f77647iobyxmoadg.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof nufgyqmvbu) && this.f77647iobyxmoadg.equals(((nufgyqmvbu) obj).f77647iobyxmoadg);
    }

    public int gxszxtbevo() {
        return this.f77647iobyxmoadg.size();
    }

    public int hashCode() {
        return this.f77647iobyxmoadg.hashCode();
    }

    public String lqeggnwhkg() {
        return this.f77647iobyxmoadg.iobyxmoadg();
    }

    public Object nufgyqmvbu() {
        return this.f77647iobyxmoadg.zoijcleaow();
    }

    public Locale ppxfxbqfkf(int i13) {
        return this.f77647iobyxmoadg.get(i13);
    }

    public String toString() {
        return this.f77647iobyxmoadg.toString();
    }
}
