package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AdType;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3909vb implements InternalClientModuleFacade {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3612jd f48238a = new C3612jd();

    @Override // io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade
    public final void reportAdRevenue(ModuleAdRevenue moduleAdRevenue) {
        AdType adType;
        Map<String, String> linkedHashMap;
        C3612jd c3612jd = this.f48238a;
        c3612jd.getClass();
        AdRevenue.Builder builderNewBuilder = AdRevenue.newBuilder(moduleAdRevenue.getAdRevenue(), moduleAdRevenue.getCurrency());
        ModuleAdType adType2 = moduleAdRevenue.getAdType();
        ModuleAdType.values();
        switch (adType2 == null ? -1 : AbstractC3588id.f47437a[adType2.ordinal()]) {
            case -1:
                adType = null;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                adType = AdType.NATIVE;
                break;
            case 2:
                adType = AdType.BANNER;
                break;
            case 3:
                adType = AdType.REWARDED;
                break;
            case 4:
                adType = AdType.INTERSTITIAL;
                break;
            case 5:
                adType = AdType.MREC;
                break;
            case 6:
                adType = AdType.APP_OPEN;
                break;
            case 7:
                adType = AdType.OTHER;
                break;
        }
        AdRevenue.Builder builderWithPrecision = builderNewBuilder.withAdType(adType).withAdNetwork(moduleAdRevenue.getAdNetwork()).withAdUnitId(moduleAdRevenue.getAdUnitId()).withAdUnitName(moduleAdRevenue.getAdUnitName()).withAdPlacementId(moduleAdRevenue.getAdPlacementId()).withAdPlacementName(moduleAdRevenue.getAdPlacementName()).withPrecision(moduleAdRevenue.getPrecision());
        Map<String, String> payload = moduleAdRevenue.getPayload();
        if (payload == null || (linkedHashMap = hg.tzroggbefp.iwizpuwonk(payload)) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        c3612jd.f47517a.getClass();
        linkedHashMap.put(AdRevenueConstants.LAYER_KEY, "native");
        ModulesFacade.reportAdRevenue(builderWithPrecision.withPayload(linkedHashMap).build(), Boolean.valueOf(moduleAdRevenue.getAutoCollected()));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade
    public final void reportEvent(InternalModuleEvent internalModuleEvent) {
        ModuleEvent.Category category;
        ModuleEvent.Builder builderWithValue = ModuleEvent.newBuilder(internalModuleEvent.getType()).withName(internalModuleEvent.getModern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl.NAME java.lang.String()).withValue(internalModuleEvent.getValue());
        Integer serviceDataReporterType = internalModuleEvent.getServiceDataReporterType();
        if (serviceDataReporterType != null) {
            builderWithValue.withServiceDataReporterType(serviceDataReporterType.intValue());
        }
        InternalModuleEvent.Category category2 = internalModuleEvent.getCategory();
        if (category2 != null) {
            int i13 = AbstractC3884ub.f48198a[category2.ordinal()];
            if (i13 != 1) {
                category = i13 != 2 ? null : ModuleEvent.Category.GENERAL;
            } else {
                category = ModuleEvent.Category.SYSTEM;
            }
            if (category != null) {
                builderWithValue.withCategory(category);
            }
        }
        ModulesFacade.reportEvent(builderWithValue.withExtras(internalModuleEvent.getExtras()).withAttributes(internalModuleEvent.getAttributes()).withEnvironment(internalModuleEvent.getEnvironment()).build());
    }
}
