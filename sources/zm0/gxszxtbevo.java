package zm0;

import android.content.Context;
import android.util.Log;
import gg.wwaezpbzkn;
import gk.jyumaefscl;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.profile.Attribute;
import io.appmetrica.analytics.profile.GenderAttribute;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo implements vm0.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f130423iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gk.zoijcleaow f130424ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final t81.iobyxmoadg f130425zoijcleaow;

    public gxszxtbevo(Context context, t81.iobyxmoadg featureManager) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        this.f130423iobyxmoadg = context;
        this.f130425zoijcleaow = featureManager;
        this.f130424ppxfxbqfkf = jyumaefscl.zoijcleaow(null, new draadjrbmk() { // from class: zm0.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return gxszxtbevo.eablkybsjg((gk.eablkybsjg) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(gk.eablkybsjg Json) {
        zdlpuopuiu.btonecajqb(Json, "$this$Json");
        Json.wkgbmnqykc(true);
        Json.eablkybsjg(true);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // vm0.iobyxmoadg
    public void init() {
        uw0.ppxfxbqfkf ppxfxbqfkfVar = uw0.ppxfxbqfkf.f114521iobyxmoadg;
        AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder(ppxfxbqfkfVar.draadjrbmk());
        if (ppxfxbqfkfVar.kcexrzcfyt()) {
            builderNewConfigBuilder.withLogs();
        }
        AppMetricaConfig appMetricaConfigBuild = builderNewConfigBuilder.build();
        zdlpuopuiu.dxjokdxxww(appMetricaConfigBuild, "build(...)");
        AppMetrica.activate(this.f130423iobyxmoadg, appMetricaConfigBuild);
    }

    @Override // vm0.iobyxmoadg
    public void iobyxmoadg(String eventName, Map params) {
        zdlpuopuiu.btonecajqb(eventName, "eventName");
        zdlpuopuiu.btonecajqb(params, "params");
        String strZoijcleaow = this.f130424ppxfxbqfkf.zoijcleaow(wkgbmnqykc.f130440iobyxmoadg, params);
        Log.d("ANALYTIC", eventName + StringUtils.PROCESS_POSTFIX_DELIMITER + strZoijcleaow);
        AppMetrica.reportEvent(eventName, strZoijcleaow);
    }

    @Override // vm0.iobyxmoadg
    public void ppxfxbqfkf(String str, String str2, Integer num) {
        GenderAttribute.Gender gender;
        if (zdlpuopuiu.eablkybsjg(str2, lr0.zoijcleaow.MALE.wkgbmnqykc())) {
            gender = GenderAttribute.Gender.MALE;
        } else {
            gender = zdlpuopuiu.eablkybsjg(str2, lr0.zoijcleaow.FEMALE.wkgbmnqykc()) ? GenderAttribute.Gender.FEMALE : null;
        }
        UserProfile.Builder builderNewBuilder = UserProfile.newBuilder();
        if (num != null) {
            builderNewBuilder.apply(Attribute.birthDate().withAge(num.intValue()));
        }
        if (gender != null) {
            builderNewBuilder.apply(Attribute.gender().withValue(gender));
        }
        AppMetrica.reportUserProfile(builderNewBuilder.build());
        AppMetrica.setUserProfileID(str);
    }

    @Override // vm0.iobyxmoadg
    public Object zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
        return this.f130425zoijcleaow.ppxfxbqfkf(s81.iobyxmoadg.f105720cllcsxoeiz, gxszxtbevoVar);
    }
}
