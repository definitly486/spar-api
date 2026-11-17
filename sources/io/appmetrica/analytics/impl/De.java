package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class De implements InterfaceC3906v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ge f45647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F3 f45648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Na f45649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Wf f45650d;

    public De() {
        this(new Ge(), new F3(), new Na(100), new Wf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Qi> fromModel(Ce ce2) {
        Qi qiFromModel;
        O8 o13 = new O8();
        o13.f46323a = ce2.f45581a;
        o13.f46328f = new D8();
        Ee ee2 = ce2.f45582b;
        B8 b13 = new B8();
        b13.f45497a = StringUtils.getUTF8Bytes(ee2.f45723a);
        Jn jnA = this.f45649c.a(ee2.f45724b);
        b13.f45498b = StringUtils.getUTF8Bytes((String) jnA.f46116a);
        b13.f45501e = ee2.f45725c.size();
        Map<String, String> map = ee2.f45726d;
        if (map != null) {
            qiFromModel = this.f45647a.fromModel(map);
            b13.f45499c = (F8) qiFromModel.f46427a;
        } else {
            qiFromModel = null;
        }
        o13.f46328f.f45634a = b13;
        C3926w3 c3926w3 = new C3926w3(C3926w3.b(jnA, qiFromModel));
        List list = ee2.f45725c;
        ArrayList arrayList = new ArrayList();
        this.f45650d.getClass();
        int iComputeInt32Size = o13.f46323a != new O8().f46323a ? CodedOutputByteBufferNano.computeInt32Size(1, o13.f46323a) : 0;
        N8 n13 = o13.f46324b;
        if (n13 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, n13);
        }
        L8 l13 = o13.f46325c;
        if (l13 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, l13);
        }
        M8 m13 = o13.f46326d;
        int i13 = 4;
        if (m13 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, m13);
        }
        C3956x8 c3956x8 = o13.f46327e;
        if (c3956x8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c3956x8);
        }
        D8 d13 = o13.f46328f;
        if (d13 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, d13);
        }
        ArrayList arrayList2 = new ArrayList();
        O8 o14 = new O8();
        o14.f46323a = o13.f46323a;
        D8 d14 = new D8();
        o14.f46328f = d14;
        d14.f45634a = new B8();
        B8 b14 = o14.f46328f.f45634a;
        B8 b15 = o13.f46328f.f45634a;
        b14.f45498b = b15.f45498b;
        b14.f45497a = b15.f45497a;
        b14.f45501e = b15.f45501e;
        b14.f45499c = b15.f45499c;
        int i14 = 0;
        C3926w3 c3926w4 = c3926w3;
        int i15 = iComputeInt32Size;
        while (i14 < list.size()) {
            G3 g13 = (G3) list.get(i14);
            C8 c13 = new C8();
            c13.f45564a = i14;
            Qi qiFromModel2 = this.f45648b.fromModel(g13);
            c13.f45565b = (C3981y8) qiFromModel2.f46427a;
            qiFromModel2.f46428b.getBytesTruncated();
            Qi qi2 = new Qi(c13, qiFromModel2);
            Wf wf2 = this.f45650d;
            C8 c14 = (C8) qi2.f46427a;
            wf2.getClass();
            int iComputeTagSize = CodedOutputByteBufferNano.computeTagSize(i13);
            int iComputeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c14);
            int iComputeRawVarint32Size = iComputeTagSize + iComputeMessageSizeNoTag + ((iComputeMessageSizeNoTag & (-128)) == 0 ? 0 : CodedOutputByteBufferNano.computeRawVarint32Size(iComputeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i15 + iComputeRawVarint32Size > 204800) {
                o14.f46328f.f45634a.f45500d = (C8[]) arrayList2.toArray(new C8[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new Qi(o14, c3926w4));
                O8 o15 = new O8();
                o15.f46323a = o13.f46323a;
                D8 d15 = new D8();
                o15.f46328f = d15;
                d15.f45634a = new B8();
                B8 b16 = o15.f46328f.f45634a;
                B8 b17 = o13.f46328f.f45634a;
                b16.f45498b = b17.f45498b;
                b16.f45497a = b17.f45497a;
                b16.f45501e = b17.f45501e;
                b16.f45499c = b17.f45499c;
                c3926w4 = c3926w3;
                i15 = iComputeInt32Size;
                o14 = o15;
                arrayList2 = arrayList3;
            }
            arrayList2.add((C8) qi2.f46427a);
            c3926w4 = new C3926w3(C3926w3.b(c3926w4, qi2.f46428b));
            i15 += iComputeRawVarint32Size;
            i14++;
            i13 = 4;
        }
        o14.f46328f.f45634a.f45500d = (C8[]) arrayList2.toArray(new C8[arrayList2.size()]);
        arrayList.add(new Qi(o14, c3926w4));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public De(Ge ge2, F3 f13, Na na3, Wf wf2) {
        this.f45647a = ge2;
        this.f45648b = f13;
        this.f45649c = na3;
        this.f45650d = wf2;
    }

    public final Ce a(List<Qi> list) {
        throw new UnsupportedOperationException();
    }
}
