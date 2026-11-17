package dd;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ld.gtknphoqwx;

/* JADX INFO: loaded from: classes2.dex */
public class eablkybsjg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final gd.iobyxmoadg f27839dxjokdxxww = gd.iobyxmoadg.eablkybsjg();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final com.google.firebase.gxszxtbevo f27840eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final tc.zoijcleaow f27841gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f27842iobyxmoadg = new ConcurrentHashMap();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final uc.eablkybsjg f27843lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final tc.zoijcleaow f27844nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final md.gxszxtbevo f27845ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Boolean f27846wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final com.google.firebase.perf.config.iobyxmoadg f27847zoijcleaow;

    eablkybsjg(com.google.firebase.gxszxtbevo gxszxtbevoVar, tc.zoijcleaow zoijcleaowVar, uc.eablkybsjg eablkybsjgVar, tc.zoijcleaow zoijcleaowVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.iobyxmoadg iobyxmoadgVar, SessionManager sessionManager) {
        this.f27846wkgbmnqykc = null;
        this.f27840eablkybsjg = gxszxtbevoVar;
        this.f27841gxszxtbevo = zoijcleaowVar;
        this.f27843lqeggnwhkg = eablkybsjgVar;
        this.f27844nufgyqmvbu = zoijcleaowVar2;
        if (gxszxtbevoVar == null) {
            this.f27846wkgbmnqykc = Boolean.FALSE;
            this.f27847zoijcleaow = iobyxmoadgVar;
            this.f27845ppxfxbqfkf = new md.gxszxtbevo(new Bundle());
            return;
        }
        gtknphoqwx.gtknphoqwx().oxmwwwfdhm(gxszxtbevoVar, eablkybsjgVar, zoijcleaowVar2);
        Context contextGtknphoqwx = gxszxtbevoVar.gtknphoqwx();
        md.gxszxtbevo gxszxtbevoVarIobyxmoadg = iobyxmoadg(contextGtknphoqwx);
        this.f27845ppxfxbqfkf = gxszxtbevoVarIobyxmoadg;
        remoteConfigManager.setFirebaseRemoteConfigProvider(zoijcleaowVar);
        this.f27847zoijcleaow = iobyxmoadgVar;
        iobyxmoadgVar.wypolnanlu(gxszxtbevoVarIobyxmoadg);
        iobyxmoadgVar.dsvhmnatus(contextGtknphoqwx);
        sessionManager.setApplicationContext(contextGtknphoqwx);
        this.f27846wkgbmnqykc = iobyxmoadgVar.btonecajqb();
        gd.iobyxmoadg iobyxmoadgVar2 = f27839dxjokdxxww;
        if (iobyxmoadgVar2.nufgyqmvbu() && wkgbmnqykc()) {
            iobyxmoadgVar2.gxszxtbevo(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", gd.zoijcleaow.zoijcleaow(gxszxtbevoVar.agtfadlqog().eablkybsjg(), contextGtknphoqwx.getPackageName())));
        }
    }

    private static md.gxszxtbevo iobyxmoadg(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e13) {
            Log.d("isEnabled", "No perf enable meta data found " + e13.getMessage());
            bundle = null;
        }
        return bundle != null ? new md.gxszxtbevo(bundle) : new md.gxszxtbevo();
    }

    public static eablkybsjg ppxfxbqfkf() {
        return (eablkybsjg) com.google.firebase.gxszxtbevo.draadjrbmk().btonecajqb(eablkybsjg.class);
    }

    public Trace eablkybsjg(String str) {
        return Trace.eablkybsjg(str);
    }

    public boolean wkgbmnqykc() {
        Boolean bool = this.f27846wkgbmnqykc;
        return bool != null ? bool.booleanValue() : com.google.firebase.gxszxtbevo.draadjrbmk().zdlpuopuiu();
    }

    public Map zoijcleaow() {
        return new HashMap(this.f27842iobyxmoadg);
    }
}
