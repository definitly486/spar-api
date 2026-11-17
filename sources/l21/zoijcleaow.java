package l21;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.core.navigation.model.AnalyticsPayload;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final zoijcleaow f61377iobyxmoadg = new zoijcleaow();

    private zoijcleaow() {
    }

    public final NavigationPayload iobyxmoadg(Intent intent) {
        NavigationPayload navigationPayload;
        Set<String> setKeySet;
        Map mapDxjokdxxww = null;
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null || (navigationPayload = (NavigationPayload) extras.getParcelable("payload")) == null) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null && (setKeySet = extras2.keySet()) != null) {
                Set<String> set = setKeySet;
                LinkedHashMap linkedHashMap = new LinkedHashMap(gtknphoqwx.gxszxtbevo(tzroggbefp.eablkybsjg(jyumaefscl.cqumvgiudr(set, 10)), 16));
                for (Object obj : set) {
                    String str = (String) obj;
                    Bundle extras3 = intent.getExtras();
                    linkedHashMap.put(obj, extras3 != null ? extras3.get(str) : null);
                }
                mapDxjokdxxww = linkedHashMap;
            }
            if (mapDxjokdxxww == null) {
                mapDxjokdxxww = tzroggbefp.dxjokdxxww();
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : mapDxjokdxxww.entrySet()) {
                if (entry.getValue() instanceof String) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(tzroggbefp.eablkybsjg(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                zdlpuopuiu.nufgyqmvbu(value, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap3.put(key, (String) value);
            }
            NavigationPayload navigationPayloadWkgbmnqykc = ppxfxbqfkf.f61375iobyxmoadg.wkgbmnqykc(linkedHashMap3, (String) linkedHashMap3.get("google.message_id"));
            if (navigationPayloadWkgbmnqykc == null) {
                NavigationPayload navigationPayloadZoijcleaow = iobyxmoadg.f61374iobyxmoadg.zoijcleaow(intent.getData());
                if (navigationPayloadZoijcleaow == null) {
                    navigationPayloadZoijcleaow = new NavigationPayload(null, null, null, null, false, null, null, false, KotlinVersion.MAX_COMPONENT_VALUE, null);
                }
                navigationPayload = navigationPayloadZoijcleaow;
            } else {
                navigationPayload = navigationPayloadWkgbmnqykc;
            }
        }
        NavigationPayload navigationPayload2 = navigationPayload;
        return navigationPayload2.ppxfxbqfkf((191 & 1) != 0 ? navigationPayload2.navigationLink : null, (191 & 2) != 0 ? navigationPayload2.reference : null, (191 & 4) != 0 ? navigationPayload2.title : null, (191 & 8) != 0 ? navigationPayload2.message : null, (191 & 16) != 0 ? navigationPayload2.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayload2.deepLink : null, (191 & 64) != 0 ? navigationPayload2.analyticsPayload : new AnalyticsPayload(AnalyticsPage.External.f92323iwizpuwonk, null, null, 6, null), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayload2.isPushPayload : false);
    }
}
