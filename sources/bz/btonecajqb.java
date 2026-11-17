package bz;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
class btonecajqb extends metgxyhuhe {
    btonecajqb() {
        super(kc2.lqeggnwhkg.AgentBrand);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        Locale locale = Locale.ROOT;
        return str2.toLowerCase(locale).startsWith(str.toLowerCase(locale)) ? t6.pmvmpeiblj.ppxfxbqfkf(str2) : t6.pmvmpeiblj.ppxfxbqfkf(str);
    }
}
