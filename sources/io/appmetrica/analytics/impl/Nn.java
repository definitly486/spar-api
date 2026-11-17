package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Nn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dn f46292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f46293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f46294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f46296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f46297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f46298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f46299h;

    public Nn(Dn dn2, U u13, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.f46292a = dn2;
        this.f46293b = u13;
        this.f46294c = arrayList;
        this.f46295d = str;
        this.f46296e = str2;
        this.f46297f = map;
        this.f46298g = str3;
        this.f46299h = bool;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        Dn dn2 = this.f46292a;
        if (dn2 != null) {
            for (Dl dl2 : dn2.f45669c) {
                sb3.append("at " + dl2.f45660a + "." + dl2.f45664e + "(" + dl2.f45661b + StringUtils.PROCESS_POSTFIX_DELIMITER + dl2.f45662c + StringUtils.PROCESS_POSTFIX_DELIMITER + dl2.f45663d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f46292a + "\n" + sb3.toString() + '}';
    }
}
