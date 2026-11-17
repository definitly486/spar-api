package po;

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
import oa0.lqeggnwhkg;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo implements lo.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f77024iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gk.zoijcleaow f77025ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f77026zoijcleaow;

    public gxszxtbevo(Context context, lqeggnwhkg isAppMetricaAnalyticsEnabledUseCase) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(isAppMetricaAnalyticsEnabledUseCase, "isAppMetricaAnalyticsEnabledUseCase");
        this.f77024iobyxmoadg = context;
        this.f77026zoijcleaow = isAppMetricaAnalyticsEnabledUseCase;
        this.f77025ppxfxbqfkf = jyumaefscl.zoijcleaow(null, new draadjrbmk() { // from class: po.eablkybsjg
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

    @Override // lo.iobyxmoadg
    public void init() {
        xx.iobyxmoadg iobyxmoadgVar = xx.iobyxmoadg.f123319iobyxmoadg;
        AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder(iobyxmoadgVar.kcexrzcfyt());
        if (iobyxmoadgVar.iozdgvuglv()) {
            builderNewConfigBuilder.withLogs();
        }
        AppMetricaConfig appMetricaConfigBuild = builderNewConfigBuilder.build();
        zdlpuopuiu.dxjokdxxww(appMetricaConfigBuild, "build(...)");
        AppMetrica.activate(this.f77024iobyxmoadg, appMetricaConfigBuild);
    }

    @Override // lo.iobyxmoadg
    public void iobyxmoadg(String eventName, Map params) {
        zdlpuopuiu.btonecajqb(eventName, "eventName");
        zdlpuopuiu.btonecajqb(params, "params");
        String strZoijcleaow = this.f77025ppxfxbqfkf.zoijcleaow(wkgbmnqykc.f77042iobyxmoadg, params);
        Log.d("ANALYTIC", eventName + StringUtils.PROCESS_POSTFIX_DELIMITER + strZoijcleaow);
        AppMetrica.reportEvent(eventName, strZoijcleaow);
    }

    @Override // lo.iobyxmoadg
    public void ppxfxbqfkf(String str, String str2, Integer num) {
        GenderAttribute.Gender gender;
        if (zdlpuopuiu.eablkybsjg(str2, b10.iobyxmoadg.MALE.wkgbmnqykc())) {
            gender = GenderAttribute.Gender.MALE;
        } else {
            gender = zdlpuopuiu.eablkybsjg(str2, b10.iobyxmoadg.FEMALE.wkgbmnqykc()) ? GenderAttribute.Gender.FEMALE : null;
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

    @Override // lo.iobyxmoadg
    public Object zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
        return this.f77026zoijcleaow.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg, gxszxtbevoVar);
    }
}
