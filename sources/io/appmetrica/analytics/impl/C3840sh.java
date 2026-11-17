package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3840sh extends BaseRequestConfig.BaseRequestArguments {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f48067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f48068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f48069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<String, String> f48070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f48071j;

    public C3840sh(J4 j13) {
        this(j13.f46054a, j13.f46055b, j13.f46057d, j13.f46058e, j13.f46059f, j13.f46060g, j13.f46061h, j13.f46062i, j13.f46063j, j13.f46064k);
    }

    public static C3840sh a() {
        return new C3840sh(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C3840sh mergeFrom(J4 j13) {
        return new C3840sh((String) WrapUtils.getOrDefaultNullable(j13.f46054a, this.f48062a), (Boolean) WrapUtils.getOrDefaultNullable(j13.f46055b, Boolean.valueOf(this.f48063b)), (Boolean) WrapUtils.getOrDefaultNullable(j13.f46057d, Boolean.valueOf(this.f48064c)), (Integer) WrapUtils.getOrDefaultNullable(j13.f46058e, Integer.valueOf(this.f48065d)), (Integer) WrapUtils.getOrDefaultNullable(j13.f46059f, Integer.valueOf(this.f48066e)), (Integer) WrapUtils.getOrDefaultNullable(j13.f46060g, Integer.valueOf(this.f48067f)), (Boolean) WrapUtils.getOrDefaultNullable(j13.f46061h, Boolean.valueOf(this.f48068g)), (Boolean) WrapUtils.getOrDefaultNullable(j13.f46062i, Boolean.valueOf(this.f48069h)), (Map) WrapUtils.getOrDefaultNullable(j13.f46063j, this.f48070i), (Integer) WrapUtils.getOrDefaultNullable(j13.f46064k, Integer.valueOf(this.f48071j)));
    }

    public C3840sh(String str, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4) {
        this.f48062a = str;
        Boolean bool5 = Boolean.FALSE;
        this.f48063b = ((Boolean) WrapUtils.getOrDefault(bool, bool5)).booleanValue();
        this.f48064c = ((Boolean) WrapUtils.getOrDefault(bool2, bool5)).booleanValue();
        this.f48065d = Math.max(10, ((Integer) WrapUtils.getOrDefault(num, 10)).intValue());
        this.f48066e = ((Integer) WrapUtils.getOrDefault(num2, 7)).intValue();
        this.f48067f = ((Integer) WrapUtils.getOrDefault(num3, 90)).intValue();
        this.f48068g = ((Boolean) WrapUtils.getOrDefault(bool3, bool5)).booleanValue();
        this.f48069h = ((Boolean) WrapUtils.getOrDefault(bool4, Boolean.TRUE)).booleanValue();
        this.f48070i = map;
        this.f48071j = ((Integer) WrapUtils.getOrDefault(num4, 1000)).intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(J4 j13) {
        Map<String, String> map;
        String str;
        Boolean bool = j13.f46055b;
        if (bool != null && this.f48063b != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = j13.f46057d;
        if (bool2 != null && this.f48064c != bool2.booleanValue()) {
            return false;
        }
        Integer num = j13.f46058e;
        if (num != null && this.f48065d != num.intValue()) {
            return false;
        }
        Integer num2 = j13.f46059f;
        if (num2 != null && this.f48066e != num2.intValue()) {
            return false;
        }
        Integer num3 = j13.f46060g;
        if (num3 != null && this.f48067f != num3.intValue()) {
            return false;
        }
        Boolean bool3 = j13.f46061h;
        if (bool3 != null && this.f48068g != bool3.booleanValue()) {
            return false;
        }
        Boolean bool4 = j13.f46062i;
        if (bool4 != null && this.f48069h != bool4.booleanValue()) {
            return false;
        }
        String str2 = j13.f46054a;
        if (str2 != null && ((str = this.f48062a) == null || !str.equals(str2))) {
            return false;
        }
        Map<String, String> map2 = j13.f46063j;
        if (map2 != null && ((map = this.f48070i) == null || !map.equals(map2))) {
            return false;
        }
        Integer num4 = j13.f46064k;
        return num4 == null || this.f48071j == num4.intValue();
    }
}
