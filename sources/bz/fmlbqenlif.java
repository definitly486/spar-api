package bz;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
class fmlbqenlif extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17419eablkybsjg;

    fmlbqenlif(Context context) {
        super(kc2.lqeggnwhkg.DeveloperTools);
        this.f17419eablkybsjg = context;
    }

    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public Integer lereixgezr() throws u4 {
        int i13 = Settings.Secure.getInt(this.f17419eablkybsjg.getContentResolver(), "development_settings_enabled", 0);
        if (i13 == 1 || i13 == 0) {
            return Integer.valueOf(i13);
        }
        throw new u4("Unknown result state: " + i13);
    }
}
