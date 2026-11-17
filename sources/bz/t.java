package bz;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
public class t extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17637eablkybsjg;

    t(Context context) {
        super(kc2.lqeggnwhkg.BootCount);
        this.f17637eablkybsjg = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public Integer lereixgezr() throws u4 {
        try {
            return Integer.valueOf(Settings.Global.getInt(this.f17637eablkybsjg.getContentResolver(), "boot_count"));
        } catch (Settings.SettingNotFoundException e13) {
            throw new u4(e13.getMessage());
        }
    }
}
