package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Eh implements InterfaceC3697mn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E9 f45732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Hh f45733b;

    public Eh(Hh hh2, E9 e13) {
        this.f45733b = hh2;
        this.f45732a = e13;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3697mn
    public final void a(Object obj) {
        List list = (List) obj;
        E9 e13 = this.f45732a;
        if (io.a((Collection) list)) {
            return;
        }
        e13.f45709d = new C9[list.size()];
        for (int i13 = 0; i13 < list.size(); i13++) {
            C3595il c3595il = (C3595il) list.get(i13);
            C9[] c9Arr = e13.f45709d;
            Map map = AbstractC3438cg.f47021a;
            C9 c13 = new C9();
            Integer num = c3595il.f47458a;
            if (num != null) {
                c13.f45567a = num.intValue();
            }
            Integer num2 = c3595il.f47459b;
            if (num2 != null) {
                c13.f45568b = num2.intValue();
            }
            if (!TextUtils.isEmpty(c3595il.f47461d)) {
                c13.f45569c = c3595il.f47461d;
            }
            c13.f45570d = c3595il.f47460c;
            c9Arr[i13] = c13;
            this.f45733b.f45919g += CodedOutputByteBufferNano.computeMessageSizeNoTag(e13.f45709d[i13]);
            this.f45733b.f45919g += CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
