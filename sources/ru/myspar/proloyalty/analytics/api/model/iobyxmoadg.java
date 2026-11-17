package ru.myspar.proloyalty.analytics.api.model;

import gg.cqumvgiudr;
import gg.wwaezpbzkn;
import hg.tzroggbefp;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    public static final void eablkybsjg(Map map, AnalyticsPage analyticsPage) {
        zdlpuopuiu.btonecajqb(map, "<this>");
        if (analyticsPage != null) {
            map.put("target_page", tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg("type", analyticsPage.getType()), cqumvgiudr.iobyxmoadg("id", analyticsPage.getId()), cqumvgiudr.iobyxmoadg(ExternalMetricsManagerImpl.NAME, analyticsPage.getModern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl.NAME java.lang.String())));
        }
    }

    public static final void iobyxmoadg(Map map, AnalyticElement analyticElement) {
        zdlpuopuiu.btonecajqb(map, "<this>");
        if (analyticElement == null) {
            return;
        }
        Map mapPpxfxbqfkf = tzroggbefp.ppxfxbqfkf();
        mapPpxfxbqfkf.put("type", analyticElement.getType());
        mapPpxfxbqfkf.put("id", analyticElement.getId());
        mapPpxfxbqfkf.put(ExternalMetricsManagerImpl.NAME, analyticElement.getModern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl.NAME java.lang.String());
        if (analyticElement instanceof AnalyticElement.ChangeItemElement) {
            AnalyticElement.ChangeItemElement changeItemElement = (AnalyticElement.ChangeItemElement) analyticElement;
            mapPpxfxbqfkf.put("new_quant", Double.valueOf(changeItemElement.getNewQuality()));
            mapPpxfxbqfkf.put("measure", changeItemElement.getMeasure());
        } else if (analyticElement instanceof AnalyticElement.BannerItemElement) {
            mapPpxfxbqfkf.put("sort", ((AnalyticElement.BannerItemElement) analyticElement).getSort());
        } else {
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
        map.put("element", tzroggbefp.zoijcleaow(mapPpxfxbqfkf));
    }

    public static final void ppxfxbqfkf(Map map, AnalyticsLocation analyticsLocation) {
        zdlpuopuiu.btonecajqb(map, "<this>");
        if (analyticsLocation != null) {
            map.put("location", tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg("type", analyticsLocation.getType()), cqumvgiudr.iobyxmoadg("id", analyticsLocation.getId()), cqumvgiudr.iobyxmoadg(ExternalMetricsManagerImpl.NAME, analyticsLocation.getModern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl.NAME java.lang.String())));
        }
    }

    public static final void wkgbmnqykc(Map map, AnalyticsPage analyticsPage) {
        zdlpuopuiu.btonecajqb(map, "<this>");
        if (analyticsPage != null) {
            map.put("page", tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg("type", analyticsPage.getType()), cqumvgiudr.iobyxmoadg("id", analyticsPage.getId()), cqumvgiudr.iobyxmoadg(ExternalMetricsManagerImpl.NAME, analyticsPage.getModern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl.NAME java.lang.String())));
        }
    }

    public static final void zoijcleaow(Map map, AnalyticsLink analyticsLink) {
        zdlpuopuiu.btonecajqb(map, "<this>");
        if (analyticsLink != null) {
            map.put("link", tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg("type", analyticsLink.getType()), cqumvgiudr.iobyxmoadg("reference", analyticsLink.getReference()), cqumvgiudr.iobyxmoadg("transition", analyticsLink.getTransition())));
        }
    }
}
