package ic;

import ac.esjtqupxsv;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModuleKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class ppxfxbqfkf implements draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f42375iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final xb.lqeggnwhkg f42376ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final fc.zoijcleaow f42377zoijcleaow;

    public ppxfxbqfkf(String str, fc.zoijcleaow zoijcleaowVar) {
        this(str, zoijcleaowVar, xb.lqeggnwhkg.gxszxtbevo());
    }

    private JSONObject eablkybsjg(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e13) {
            this.f42376ppxfxbqfkf.draadjrbmk("Failed to parse settings JSON from " + this.f42375iobyxmoadg, e13);
            this.f42376ppxfxbqfkf.gtknphoqwx("Settings response " + str);
            return null;
        }
    }

    private Map gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        HashMap map = new HashMap();
        map.put("build_version", gtknphoqwxVar.f42357nufgyqmvbu);
        map.put("display_version", gtknphoqwxVar.f42356lqeggnwhkg);
        map.put(AdRevenueConstants.SOURCE_KEY, Integer.toString(gtknphoqwxVar.f42352dxjokdxxww));
        String str = gtknphoqwxVar.f42354gxszxtbevo;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    private void ppxfxbqfkf(fc.iobyxmoadg iobyxmoadgVar, String str, String str2) {
        if (str2 != null) {
            iobyxmoadgVar.wkgbmnqykc(str, str2);
        }
    }

    private fc.iobyxmoadg zoijcleaow(fc.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
        ppxfxbqfkf(iobyxmoadgVar, "X-CRASHLYTICS-GOOGLE-APP-ID", gtknphoqwxVar.f42355iobyxmoadg);
        ppxfxbqfkf(iobyxmoadgVar, "X-CRASHLYTICS-API-CLIENT-TYPE", ConstantDeviceInfo.APP_PLATFORM);
        ppxfxbqfkf(iobyxmoadgVar, "X-CRASHLYTICS-API-CLIENT-VERSION", esjtqupxsv.draadjrbmk());
        ppxfxbqfkf(iobyxmoadgVar, "Accept", PaymentFlowNetworkModuleKt.REQUEST_TYPE);
        ppxfxbqfkf(iobyxmoadgVar, "X-CRASHLYTICS-DEVICE-MODEL", gtknphoqwxVar.f42360zoijcleaow);
        ppxfxbqfkf(iobyxmoadgVar, "X-CRASHLYTICS-OS-BUILD-VERSION", gtknphoqwxVar.f42358ppxfxbqfkf);
        ppxfxbqfkf(iobyxmoadgVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", gtknphoqwxVar.f42359wkgbmnqykc);
        ppxfxbqfkf(iobyxmoadgVar, "X-CRASHLYTICS-INSTALLATION-ID", gtknphoqwxVar.f42353eablkybsjg.iobyxmoadg().ppxfxbqfkf());
        return iobyxmoadgVar;
    }

    @Override // ic.draadjrbmk
    public JSONObject iobyxmoadg(gtknphoqwx gtknphoqwxVar, boolean z13) {
        bc.gxszxtbevo.wkgbmnqykc();
        if (!z13) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map mapGxszxtbevo = gxszxtbevo(gtknphoqwxVar);
            fc.iobyxmoadg iobyxmoadgVarZoijcleaow = zoijcleaow(wkgbmnqykc(mapGxszxtbevo), gtknphoqwxVar);
            this.f42376ppxfxbqfkf.zoijcleaow("Requesting settings from " + this.f42375iobyxmoadg);
            this.f42376ppxfxbqfkf.dxjokdxxww("Settings query params were: " + mapGxszxtbevo);
            return lqeggnwhkg(iobyxmoadgVarZoijcleaow.ppxfxbqfkf());
        } catch (IOException e13) {
            this.f42376ppxfxbqfkf.eablkybsjg("Settings request failed.", e13);
            return null;
        }
    }

    JSONObject lqeggnwhkg(fc.ppxfxbqfkf ppxfxbqfkfVar) {
        int iZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        this.f42376ppxfxbqfkf.dxjokdxxww("Settings response code was: " + iZoijcleaow);
        if (nufgyqmvbu(iZoijcleaow)) {
            return eablkybsjg(ppxfxbqfkfVar.iobyxmoadg());
        }
        this.f42376ppxfxbqfkf.wkgbmnqykc("Settings request failed; (status: " + iZoijcleaow + ") from " + this.f42375iobyxmoadg);
        return null;
    }

    boolean nufgyqmvbu(int i13) {
        return i13 == 200 || i13 == 201 || i13 == 202 || i13 == 203;
    }

    protected fc.iobyxmoadg wkgbmnqykc(Map map) {
        return this.f42377zoijcleaow.iobyxmoadg(this.f42375iobyxmoadg, map).wkgbmnqykc("User-Agent", "Crashlytics Android SDK/" + esjtqupxsv.draadjrbmk()).wkgbmnqykc("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    ppxfxbqfkf(String str, fc.zoijcleaow zoijcleaowVar, xb.lqeggnwhkg lqeggnwhkgVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f42376ppxfxbqfkf = lqeggnwhkgVar;
        this.f42377zoijcleaow = zoijcleaowVar;
        this.f42375iobyxmoadg = str;
    }
}
