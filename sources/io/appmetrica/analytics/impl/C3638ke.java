package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;
import io.appmetrica.analytics.networktasks.internal.AESRSARequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3638ke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3638ke f47587a = new C3638ke();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f47588b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f47589c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "7.10.0", "50135769");

    public final synchronized ExponentialBackoffDataHolder a(EnumC3589ie enumC3589ie) {
        Object exponentialBackoffDataHolder;
        try {
            LinkedHashMap linkedHashMap = f47588b;
            exponentialBackoffDataHolder = linkedHashMap.get(enumC3589ie);
            if (exponentialBackoffDataHolder == null) {
                exponentialBackoffDataHolder = new ExponentialBackoffDataHolder(new Ra(Ia.F.x(), enumC3589ie), enumC3589ie.name());
                linkedHashMap.put(enumC3589ie, exponentialBackoffDataHolder);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (ExponentialBackoffDataHolder) exponentialBackoffDataHolder;
    }

    public static final NetworkTask a(C3828s5 c3828s5) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        C3691mh c3691mh = new C3691mh(aESRSARequestBodyEncrypter);
        Tb tb3 = new Tb(c3828s5);
        return new NetworkTask(new BlockingExecutor(), new K5(c3828s5.f48030a), new AllHostsExponentialBackoffPolicy(f47587a.a(EnumC3589ie.REPORT)), new Hh(c3828s5, c3691mh, tb3, new FullUrlFormer(c3691mh, tb3), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), c3828s5.h(), c3828s5.o(), c3828s5.t(), aESRSARequestBodyEncrypter), hg.jyumaefscl.eablkybsjg(new ho()), f47589c);
    }
}
