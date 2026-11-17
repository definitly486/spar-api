package bz;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
class iwxlajgraz extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17477eablkybsjg;

    iwxlajgraz(Context context) {
        super(kc2.lqeggnwhkg.OS_ID);
        this.f17477eablkybsjg = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() {
        return Settings.Secure.getString(this.f17477eablkybsjg.getContentResolver(), "android_id");
    }
}
