package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3720nl implements InterfaceC3747on {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f47778d = TimeUnit.SECONDS.toMillis(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f47780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CachedDataProvider.CachedData f47781c;

    public C3720nl(Context context) {
        long j13 = f47778d;
        this.f47781c = new CachedDataProvider.CachedData(j13, j13, "sim-info");
        this.f47779a = context;
        this.f47780b = Ia.j().i();
    }

    public final C3595il b() {
        return new C3595il((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f47779a, "phone", "getting SimMcc", "TelephonyManager", new C3620jl()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f47779a, "phone", "getting SimMnc", "TelephonyManager", new C3645kl()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.f47779a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new C3695ml(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.f47779a, "phone", "getting SimOperatorName", "TelephonyManager", new C3670ll()));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0011, B:12:0x001c, B:14:0x002f, B:16:0x0037, B:18:0x0043, B:19:0x004c, B:21:0x0052, B:22:0x005a, B:23:0x0061), top: B:28:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0011, B:12:0x001c, B:14:0x002f, B:16:0x0037, B:18:0x0043, B:19:0x004c, B:21:0x0052, B:22:0x005a, B:23:0x0061), top: B:28:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0043 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0011, B:12:0x001c, B:14:0x002f, B:16:0x0037, B:18:0x0043, B:19:0x004c, B:21:0x0052, B:22:0x005a, B:23:0x0061), top: B:28:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0011, B:12:0x001c, B:14:0x002f, B:16:0x0037, B:18:0x0043, B:19:0x004c, B:21:0x0052, B:22:0x005a, B:23:0x0061), top: B:28:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x005a A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0011, B:12:0x001c, B:14:0x002f, B:16:0x0037, B:18:0x0043, B:19:0x004c, B:21:0x0052, B:22:0x005a, B:23:0x0061), top: B:28:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC3747on
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized List<C3595il> a() {
        ArrayList arrayList;
        List<C3595il> list;
        try {
            List<C3595il> list2 = (List) this.f47781c.getData();
            if (list2 == null) {
                arrayList = new ArrayList();
                if (Ia.F.f46024u.b().f47241n.f45840d) {
                    if (AndroidUtils.isApiAchieved(23)) {
                        if (this.f47780b.hasPermission(this.f47779a, "android.permission.READ_PHONE_STATE")) {
                            arrayList.addAll(C3745ol.a(this.f47779a));
                        }
                        if (arrayList.size() == 0) {
                            arrayList.add(b());
                        }
                    } else {
                        arrayList.add(b());
                    }
                }
                this.f47781c.setData(arrayList);
                list = arrayList;
            } else if (list2.isEmpty() && this.f47781c.shouldUpdateData()) {
                list = list2;
                list = list2;
                arrayList = new ArrayList();
                if (Ia.F.f46024u.b().f47241n.f45840d) {
                    if (AndroidUtils.isApiAchieved(23)) {
                        if (this.f47780b.hasPermission(this.f47779a, "android.permission.READ_PHONE_STATE")) {
                            arrayList.addAll(C3745ol.a(this.f47779a));
                        }
                        if (arrayList.size() == 0) {
                            arrayList.add(b());
                        }
                    } else {
                        arrayList.add(b());
                    }
                }
                this.f47781c.setData(arrayList);
                list = arrayList;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return list;
    }
}
