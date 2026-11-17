package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class R9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f46441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumSet f46442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumSet f46443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumSet f46444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumSet f46445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumSet f46446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumSet f46447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumSet f46448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List f46449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List f46450j;

    static {
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        EnumC3934wb enumC3934wb2 = EnumC3934wb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        EnumC3934wb enumC3934wb3 = EnumC3934wb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        EnumC3934wb enumC3934wb4 = EnumC3934wb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC3934wb enumC3934wb5 = EnumC3934wb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC3934wb enumC3934wb6 = EnumC3934wb.EVENT_TYPE_ANR;
        f46441a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC3934wb enumC3934wb7 = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        EnumC3934wb enumC3934wb8 = EnumC3934wb.EVENT_TYPE_PURGE_BUFFER;
        EnumC3934wb enumC3934wb9 = EnumC3934wb.EVENT_TYPE_SEND_REFERRER;
        EnumC3934wb enumC3934wb10 = EnumC3934wb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC3934wb enumC3934wb11 = EnumC3934wb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC3934wb enumC3934wb12 = EnumC3934wb.EVENT_TYPE_ACTIVATION;
        EnumC3934wb enumC3934wb13 = EnumC3934wb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC3934wb enumC3934wb14 = EnumC3934wb.EVENT_TYPE_SET_SESSION_EXTRA;
        f46442b = EnumSet.of(enumC3934wb7, enumC3934wb8, enumC3934wb9, enumC3934wb10, enumC3934wb11, enumC3934wb12, enumC3934wb13, enumC3934wb5, enumC3934wb14);
        EnumC3934wb enumC3934wb15 = EnumC3934wb.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC3934wb enumC3934wb16 = EnumC3934wb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        f46443c = EnumSet.of(enumC3934wb15, enumC3934wb4, enumC3934wb5, enumC3934wb13, enumC3934wb16);
        EnumC3934wb enumC3934wb17 = EnumC3934wb.EVENT_TYPE_REGULAR;
        f46444d = EnumSet.of(enumC3934wb4, enumC3934wb5, enumC3934wb3, enumC3934wb, enumC3934wb2, enumC3934wb16, enumC3934wb13, enumC3934wb17, EnumC3934wb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC3934wb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC3934wb.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC3934wb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC3934wb8, EnumC3934wb.EVENT_TYPE_INIT, EnumC3934wb.EVENT_TYPE_SEND_USER_PROFILE, EnumC3934wb.EVENT_TYPE_SET_USER_PROFILE_ID, enumC3934wb9, enumC3934wb10, enumC3934wb11, EnumC3934wb.EVENT_TYPE_FIRST_ACTIVATION, EnumC3934wb.EVENT_TYPE_START, EnumC3934wb.EVENT_TYPE_APP_OPEN, EnumC3934wb.EVENT_TYPE_APP_UPDATE, enumC3934wb6);
        f46445e = EnumSet.of(enumC3934wb17);
        f46446f = EnumSet.of(enumC3934wb17);
        f46447g = EnumSet.of(enumC3934wb13);
        f46448h = EnumSet.of(EnumC3934wb.EVENT_TYPE_ALIVE, enumC3934wb8, enumC3934wb14, enumC3934wb5, enumC3934wb13);
        f46449i = Arrays.asList(0, 6145, 4097, 8224);
        f46450j = Arrays.asList(12290);
    }
}
