package io.appmetrica.analytics.adrevenue.applovin.v12.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import hg.agtfadlqog;
import hg.tzroggbefp;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ModuleAdRevenueProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f45153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClientContext f45154b;

    public b(a aVar, ClientContext clientContext) {
        this.f45153a = aVar;
        this.f45154b = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final String getDescription() {
        return "AppLovin";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        ModuleAdType moduleAdType;
        String label;
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, MaxAd.class, AppLovinSdk.class)) {
            return false;
        }
        Object objWeqkydbzbr = agtfadlqog.weqkydbzbr(objArr, 0);
        if (objWeqkydbzbr == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.mediation.MaxAd");
        }
        MaxAd maxAd = (MaxAd) objWeqkydbzbr;
        Object objWeqkydbzbr2 = agtfadlqog.weqkydbzbr(objArr, 1);
        if (objWeqkydbzbr2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.sdk.AppLovinSdk");
        }
        AppLovinSdk appLovinSdk = (AppLovinSdk) objWeqkydbzbr2;
        this.f45153a.getClass();
        MaxAdFormat format = maxAd.getFormat();
        if (format == null) {
            moduleAdType = null;
        } else if (zdlpuopuiu.eablkybsjg(format, MaxAdFormat.NATIVE)) {
            moduleAdType = ModuleAdType.NATIVE;
        } else if (zdlpuopuiu.eablkybsjg(format, MaxAdFormat.BANNER)) {
            moduleAdType = ModuleAdType.BANNER;
        } else if (zdlpuopuiu.eablkybsjg(format, MaxAdFormat.REWARDED)) {
            moduleAdType = ModuleAdType.REWARDED;
        } else if (zdlpuopuiu.eablkybsjg(format, MaxAdFormat.INTERSTITIAL)) {
            moduleAdType = ModuleAdType.INTERSTITIAL;
        } else {
            moduleAdType = zdlpuopuiu.eablkybsjg(format, MaxAdFormat.MREC) ? ModuleAdType.MREC : ModuleAdType.OTHER;
        }
        ModuleAdType moduleAdType2 = moduleAdType;
        vdvldrhtss vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg("countryCode", appLovinSdk.getConfiguration().getCountryCode());
        vdvldrhtss vdvldrhtssVarIobyxmoadg2 = cqumvgiudr.iobyxmoadg(AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-applovin-v12");
        MaxAdFormat format2 = maxAd.getFormat();
        if (format2 == null || (label = format2.getLabel()) == null) {
            label = "null";
        }
        this.f45154b.getInternalClientModuleFacade().reportAdRevenue(new ModuleAdRevenue(BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(maxAd.getRevenue(), 0.0d)), Currency.getInstance("USD"), moduleAdType2, maxAd.getNetworkName(), maxAd.getAdUnitId(), null, maxAd.getNetworkPlacement(), maxAd.getPlacement(), maxAd.getRevenuePrecision(), tzroggbefp.draadjrbmk(vdvldrhtssVarIobyxmoadg, vdvldrhtssVarIobyxmoadg2, cqumvgiudr.iobyxmoadg(AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, label), cqumvgiudr.iobyxmoadg(AdRevenueConstants.SOURCE_KEY, "applovin")), false, 32, null));
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AppLovin with values " + Arrays.toString(objArr) + " was reported", new Object[0]);
        return true;
    }
}
