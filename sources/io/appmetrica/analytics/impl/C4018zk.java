package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4018zk implements ServiceStorageProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3894ul f48627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SQLiteOpenHelper f48628c;

    public C4018zk(Context context, InterfaceC3894ul interfaceC3894ul, SQLiteOpenHelper sQLiteOpenHelper) {
        this.f48626a = context;
        this.f48627b = interfaceC3894ul;
        this.f48628c = sQLiteOpenHelper;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppDataStorage() {
        return FileUtils.getAppDataDir(this.f48626a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppFileStorage() {
        return FileUtils.getAppStorageDirectory(this.f48626a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final SQLiteOpenHelper getDbStorage() {
        return this.f48628c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getSdkDataStorage() {
        return FileUtils.sdkStorage(this.f48626a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final TempCacheStorage getTempCacheStorage() {
        C3797qn c3797qn;
        C3880u7 c3880u7A = C3880u7.a(this.f48626a);
        synchronized (c3880u7A) {
            try {
                if (c3880u7A.f48177o == null) {
                    Context context = c3880u7A.f48167e;
                    Sm sm2 = Sm.SERVICE;
                    if (c3880u7A.f48176n == null) {
                        c3880u7A.f48176n = new C3772pn(new C3795ql(c3880u7A.h()), "temp_cache");
                    }
                    c3880u7A.f48177o = new C3797qn(context, sm2, c3880u7A.f48176n);
                }
                c3797qn = c3880u7A.f48177o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c3797qn;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences legacyModulePreferences() {
        return new Ub(this.f48627b);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new C3836sd(str, this.f48627b);
    }
}
