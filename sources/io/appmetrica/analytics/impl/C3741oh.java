package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.oh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3741oh extends AbstractC3490eh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ke f47834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProtobufStateStorage f47835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K2 f47836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3577i2 f47837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final D2 f47838f;

    public C3741oh(C3828s5 c3828s5, Ke ke2) {
        this(c3828s5, ke2, Qm.a(Z1.class).a(c3828s5.getContext()), new K2(c3828s5.getContext()), new C3577i2(), new D2(c3828s5.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3490eh
    public final boolean a(C3655l6 c3655l6) {
        C3828s5 c3828s5 = this.f47182a;
        c3828s5.f48031b.toString();
        if (!c3828s5.f48049t.c() || !c3828s5.w()) {
            return false;
        }
        Z1 z13 = (Z1) this.f47835c.read();
        List list = z13.f46837a;
        J2 j13 = z13.f46838b;
        K2 k13 = this.f47836d;
        k13.getClass();
        Z1 z14 = null;
        J2 j2A = AndroidUtils.isApiAchieved(28) ? G2.a(k13.f46122a, k13.f46123b) : null;
        List list2 = z13.f46839c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f47838f.f45618a, "getting available providers", "location manager", Collections.emptyList(), new C2());
        Ke ke2 = this.f47834b;
        Context context = this.f47182a.f48030a;
        ke2.getClass();
        ArrayList arrayListA = new C3441cj(context, new SafePackageManager()).a();
        if (CollectionUtils.areCollectionsEqual(arrayListA, list)) {
            arrayListA = null;
        }
        if (arrayListA != null || !io.a(j13, j2A) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (arrayListA != null) {
                list = arrayListA;
            }
            z14 = new Z1(list, j2A, list3);
        }
        if (z14 != null) {
            F9 f13 = c3828s5.f48043n;
            C3655l6 c3655l6A = C3655l6.a(c3655l6, z14.f46837a, z14.f46838b, this.f47837e, z14.f46839c);
            f13.a(c3655l6A, Sk.a(f13.f45800c.b(c3655l6A), c3655l6A.f47639i));
            long jCurrentTimeSeconds = f13.f45807j.currentTimeSeconds();
            f13.f45809l = jCurrentTimeSeconds;
            f13.f45798a.a(jCurrentTimeSeconds).b();
            this.f47835c.save(z14);
            return false;
        }
        if (!c3828s5.z()) {
            return false;
        }
        F9 f14 = c3828s5.f48043n;
        C3655l6 c3655l6A2 = C3655l6.a(c3655l6, z13.f46837a, z13.f46838b, this.f47837e, z13.f46839c);
        f14.a(c3655l6A2, Sk.a(f14.f45800c.b(c3655l6A2), c3655l6A2.f47639i));
        long jCurrentTimeSeconds2 = f14.f45807j.currentTimeSeconds();
        f14.f45809l = jCurrentTimeSeconds2;
        f14.f45798a.a(jCurrentTimeSeconds2).b();
        return false;
    }

    public C3741oh(C3828s5 c3828s5, Ke ke2, ProtobufStateStorage protobufStateStorage, K2 k13, C3577i2 c3577i2, D2 d13) {
        super(c3828s5);
        this.f47834b = ke2;
        this.f47835c = protobufStateStorage;
        this.f47836d = k13;
        this.f47837e = c3577i2;
        this.f47838f = d13;
    }
}
