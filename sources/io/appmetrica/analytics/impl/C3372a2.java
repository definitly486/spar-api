package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3372a2 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H2 f46901a;

    public C3372a2() {
        this(new H2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3450d2 fromModel(Z1 z13) {
        C3450d2 c3450d2 = new C3450d2();
        c3450d2.f47061a = new C3424c2[z13.f46837a.size()];
        int i13 = 0;
        int i14 = 0;
        for (PermissionState permissionState : z13.f46837a) {
            C3424c2[] c3424c2Arr = c3450d2.f47061a;
            C3424c2 c3424c2 = new C3424c2();
            c3424c2.f47004a = permissionState.name;
            c3424c2.f47005b = permissionState.granted;
            c3424c2Arr[i14] = c3424c2;
            i14++;
        }
        J2 j13 = z13.f46838b;
        if (j13 != null) {
            c3450d2.f47062b = this.f46901a.fromModel(j13);
        }
        c3450d2.f47063c = new String[z13.f46839c.size()];
        Iterator it = z13.f46839c.iterator();
        while (it.hasNext()) {
            c3450d2.f47063c[i13] = (String) it.next();
            i13++;
        }
        return c3450d2;
    }

    public C3372a2(H2 h13) {
        this.f46901a = h13;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z1 toModel(C3450d2 c3450d2) {
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            C3424c2[] c3424c2Arr = c3450d2.f47061a;
            if (i14 >= c3424c2Arr.length) {
                break;
            }
            C3424c2 c3424c2 = c3424c2Arr[i14];
            arrayList.add(new PermissionState(c3424c2.f47004a, c3424c2.f47005b));
            i14++;
        }
        C3398b2 c3398b2 = c3450d2.f47062b;
        J2 model = c3398b2 != null ? this.f46901a.toModel(c3398b2) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = c3450d2.f47063c;
            if (i13 < strArr.length) {
                arrayList2.add(strArr[i13]);
                i13++;
            } else {
                return new Z1(arrayList, model, arrayList2);
            }
        }
    }
}
