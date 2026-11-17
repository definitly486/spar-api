package q1;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class eablkybsjg {

    static class iobyxmoadg {
        static LocaleList iobyxmoadg(Configuration configuration) {
            return configuration.getLocales();
        }

        static void zoijcleaow(Configuration configuration, nufgyqmvbu nufgyqmvbuVar) {
            configuration.setLocales((LocaleList) nufgyqmvbuVar.nufgyqmvbu());
        }
    }

    public static nufgyqmvbu iobyxmoadg(Configuration configuration) {
        return nufgyqmvbu.dxjokdxxww(iobyxmoadg.iobyxmoadg(configuration));
    }

    public static void zoijcleaow(Configuration configuration, nufgyqmvbu nufgyqmvbuVar) {
        iobyxmoadg.zoijcleaow(configuration, nufgyqmvbuVar);
    }
}
