package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3768pj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f47885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f47887d;

    public C3768pj(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        return "ScreenWrapper{name='" + this.f47884a + "', categoriesPath=" + this.f47885b + ", searchQuery='" + this.f47886c + "', payload=" + this.f47887d + '}';
    }

    public C3768pj(String str, String str2, List list, Map map) {
        this.f47884a = str;
        this.f47885b = list;
        this.f47886c = str2;
        this.f47887d = map;
    }
}
