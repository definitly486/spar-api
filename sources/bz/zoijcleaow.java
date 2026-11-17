package bz;

import android.content.Context;
import android.provider.Settings;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes2.dex */
class zoijcleaow extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17695eablkybsjg;

    zoijcleaow(Context context) {
        super(kc2.lqeggnwhkg.AccessibilityServices);
        this.f17695eablkybsjg = context;
    }

    private String iozdgvuglv() {
        return Settings.Secure.getString(this.f17695eablkybsjg.getApplicationContext().getContentResolver(), "enabled_accessibility_services");
    }

    private boolean yadqdtsiqt() {
        return Settings.Secure.getInt(this.f17695eablkybsjg.getApplicationContext().getContentResolver(), "accessibility_enabled") == 1;
    }

    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public oc2.iobyxmoadg zynmafqrjb() throws u4 {
        String strIozdgvuglv;
        oc2.iobyxmoadg iobyxmoadgVar = (oc2.iobyxmoadg) super.zynmafqrjb();
        if (iobyxmoadgVar != null) {
            try {
                boolean zYadqdtsiqt = yadqdtsiqt();
                if (zYadqdtsiqt) {
                    strIozdgvuglv = iozdgvuglv();
                    if (strIozdgvuglv != null && strIozdgvuglv.length() > 300) {
                        strIozdgvuglv = t6.pmvmpeiblj.wkgbmnqykc(strIozdgvuglv, StringUtils.PROCESS_POSTFIX_DELIMITER);
                    }
                } else {
                    strIozdgvuglv = null;
                }
                iobyxmoadgVar.put("enabled", Boolean.valueOf(zYadqdtsiqt));
                if (t6.pmvmpeiblj.iobyxmoadg(strIozdgvuglv)) {
                    iobyxmoadgVar.put("packages", strIozdgvuglv);
                }
            } catch (Settings.SettingNotFoundException e13) {
                throw new u4(e13.getMessage());
            }
        }
        return iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: lmojexxdyd, reason: merged with bridge method [inline-methods] */
    public oc2.iobyxmoadg lereixgezr() {
        return new oc2.iobyxmoadg();
    }
}
