package ac;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes2.dex */
public class pkzmftpjix implements hcddaimhww {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final Pattern f1397lqeggnwhkg = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final String f1398nufgyqmvbu = Pattern.quote(CardDateFormatTextWatcher.DIVIDER_CHARACTER);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yadqdtsiqt f1399eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private hcddaimhww.iobyxmoadg f1400gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jpowsppfya f1401iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f1402ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final uc.eablkybsjg f1403wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Context f1404zoijcleaow;

    public pkzmftpjix(Context context, String str, uc.eablkybsjg eablkybsjgVar, yadqdtsiqt yadqdtsiqtVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f1404zoijcleaow = context;
        this.f1402ppxfxbqfkf = str;
        this.f1403wkgbmnqykc = eablkybsjgVar;
        this.f1399eablkybsjg = yadqdtsiqtVar;
        this.f1401iobyxmoadg = new jpowsppfya();
    }

    private boolean agtfadlqog() {
        hcddaimhww.iobyxmoadg iobyxmoadgVar = this.f1400gxszxtbevo;
        return iobyxmoadgVar == null || (iobyxmoadgVar.eablkybsjg() == null && this.f1399eablkybsjg.wkgbmnqykc());
    }

    private String draadjrbmk(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private static String eablkybsjg(String str) {
        return f1397lqeggnwhkg.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean gtknphoqwx(String str) {
        return str != null && str.startsWith("SYN_");
    }

    static String ppxfxbqfkf() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private String wflxmlrfwp(String str) {
        return str.replaceAll(f1398nufgyqmvbu, "");
    }

    private synchronized String zoijcleaow(String str, SharedPreferences sharedPreferences) {
        String strEablkybsjg;
        strEablkybsjg = eablkybsjg(UUID.randomUUID().toString());
        xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Created new Crashlytics installation ID: " + strEablkybsjg + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strEablkybsjg).putString("firebase.installation.id", str).apply();
        return strEablkybsjg;
    }

    public String btonecajqb() {
        return wflxmlrfwp(Build.VERSION.RELEASE);
    }

    public String dxjokdxxww() {
        return wflxmlrfwp(Build.VERSION.INCREMENTAL);
    }

    public String gxszxtbevo() {
        return this.f1402ppxfxbqfkf;
    }

    @Override // ac.hcddaimhww
    public synchronized hcddaimhww.iobyxmoadg iobyxmoadg() {
        if (!agtfadlqog()) {
            return this.f1400gxszxtbevo;
        }
        xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesVdvldrhtss = btonecajqb.vdvldrhtss(this.f1404zoijcleaow);
        String string = sharedPreferencesVdvldrhtss.getString("firebase.installation.id", null);
        xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Cached Firebase Installation ID: " + string);
        if (this.f1399eablkybsjg.wkgbmnqykc()) {
            ylkuphrtab ylkuphrtabVarWkgbmnqykc = wkgbmnqykc(false);
            xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Fetched Firebase Installation ID: " + ylkuphrtabVarWkgbmnqykc.zoijcleaow());
            if (ylkuphrtabVarWkgbmnqykc.zoijcleaow() == null) {
                ylkuphrtabVarWkgbmnqykc = new ylkuphrtab(string == null ? ppxfxbqfkf() : string, null);
            }
            if (Objects.equals(ylkuphrtabVarWkgbmnqykc.zoijcleaow(), string)) {
                this.f1400gxszxtbevo = hcddaimhww.iobyxmoadg.iobyxmoadg(draadjrbmk(sharedPreferencesVdvldrhtss), ylkuphrtabVarWkgbmnqykc);
            } else {
                this.f1400gxszxtbevo = hcddaimhww.iobyxmoadg.iobyxmoadg(zoijcleaow(ylkuphrtabVarWkgbmnqykc.zoijcleaow(), sharedPreferencesVdvldrhtss), ylkuphrtabVarWkgbmnqykc);
            }
        } else if (gtknphoqwx(string)) {
            this.f1400gxszxtbevo = hcddaimhww.iobyxmoadg.zoijcleaow(draadjrbmk(sharedPreferencesVdvldrhtss));
        } else {
            this.f1400gxszxtbevo = hcddaimhww.iobyxmoadg.zoijcleaow(zoijcleaow(ppxfxbqfkf(), sharedPreferencesVdvldrhtss));
        }
        xb.lqeggnwhkg.gxszxtbevo().dxjokdxxww("Install IDs: " + this.f1400gxszxtbevo);
        return this.f1400gxszxtbevo;
    }

    public String lqeggnwhkg() {
        return this.f1401iobyxmoadg.iobyxmoadg(this.f1404zoijcleaow);
    }

    public String nufgyqmvbu() {
        return String.format(Locale.US, "%s/%s", wflxmlrfwp(Build.MANUFACTURER), wflxmlrfwp(Build.MODEL));
    }

    public ylkuphrtab wkgbmnqykc(boolean z13) {
        String strZoijcleaow;
        bc.gxszxtbevo.eablkybsjg();
        String str = null;
        if (z13) {
            try {
                strZoijcleaow = ((com.google.firebase.installations.gxszxtbevo) Tasks.await(this.f1403wkgbmnqykc.iobyxmoadg(false), DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, TimeUnit.MILLISECONDS)).zoijcleaow();
            } catch (Exception e13) {
                xb.lqeggnwhkg.gxszxtbevo().draadjrbmk("Error getting Firebase authentication token.", e13);
                strZoijcleaow = null;
            }
        } else {
            strZoijcleaow = null;
        }
        try {
            str = (String) Tasks.await(this.f1403wkgbmnqykc.getId(), DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, TimeUnit.MILLISECONDS);
        } catch (Exception e14) {
            xb.lqeggnwhkg.gxszxtbevo().draadjrbmk("Error getting Firebase installation id.", e14);
        }
        return new ylkuphrtab(str, strZoijcleaow);
    }
}
