package qa0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ma0.ppxfxbqfkf;
import ma0.wkgbmnqykc;
import ma0.zoijcleaow;
import ra0.FeatureToggleRemoteConfig;
import ra0.FeatureTogglesRemoteConfig;
import ra0.ForceUpdateRemoteConfig;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static final zoijcleaow iobyxmoadg(FeatureToggleRemoteConfig featureToggleRemoteConfig) {
        zdlpuopuiu.btonecajqb(featureToggleRemoteConfig, "<this>");
        return new zoijcleaow(featureToggleRemoteConfig.getName(), featureToggleRemoteConfig.getIsEnabled(), featureToggleRemoteConfig.getArgs());
    }

    public static final wkgbmnqykc ppxfxbqfkf(ForceUpdateRemoteConfig forceUpdateRemoteConfig) {
        zdlpuopuiu.btonecajqb(forceUpdateRemoteConfig, "<this>");
        return new wkgbmnqykc(forceUpdateRemoteConfig.getTitle(), forceUpdateRemoteConfig.getMessage(), forceUpdateRemoteConfig.getForceUpdate(), forceUpdateRemoteConfig.getIsEnabled(), forceUpdateRemoteConfig.getVersion());
    }

    public static final ppxfxbqfkf zoijcleaow(FeatureTogglesRemoteConfig featureTogglesRemoteConfig) {
        if (featureTogglesRemoteConfig == null) {
            return new ppxfxbqfkf(jyumaefscl.wflxmlrfwp());
        }
        List items = featureTogglesRemoteConfig.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(iobyxmoadg((FeatureToggleRemoteConfig) it.next()));
        }
        return new ppxfxbqfkf(arrayList);
    }
}
