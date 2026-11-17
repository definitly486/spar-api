package io.appmetrica.analytics.impl;

import android.util.Base64;
import android.util.Pair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3579i4 extends C3655l6 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashMap f47418q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Wm f47419r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Um f47420s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Um f47421t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C3901v3 f47422u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Wm f47423v;

    public C3579i4(PublicLogger publicLogger) {
        this.f47418q = new HashMap();
        a(publicLogger);
    }

    public static C3655l6 b(String str, String str2) {
        C3655l6 c3655l6 = new C3655l6("", 0);
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        c3655l6.f47634d = 5376;
        c3655l6.a(str, str2);
        return c3655l6;
    }

    public static C3655l6 n() {
        C3655l6 c3655l6 = new C3655l6("", 0);
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        c3655l6.f47634d = 5632;
        return c3655l6;
    }

    public static C3655l6 o() {
        C3655l6 c3655l6 = new C3655l6("", 0);
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        c3655l6.f47634d = 40961;
        return c3655l6;
    }

    public final void a(String str, String str2, EnumC3554h4 enumC3554h4) {
        if (StringUtils.equalsNullSafety(str, str2)) {
            this.f47418q.remove(enumC3554h4);
        } else {
            this.f47418q.put(enumC3554h4, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        }
        Iterator it = this.f47418q.values().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        this.f47637g = iIntValue;
    }

    @Override // io.appmetrica.analytics.impl.C3655l6
    public final void c(String str) {
        Wm wm2 = this.f47423v;
        wm2.getClass();
        this.f47638h = wm2.a(str);
    }

    public final String d(String str) {
        Wm wm2 = this.f47419r;
        wm2.getClass();
        String strA = wm2.a(str);
        a(str, strA, EnumC3554h4.NAME);
        return strA;
    }

    public final String e(String str) {
        Um um2 = this.f47420s;
        um2.getClass();
        String strA = um2.a(str);
        a(str, strA, EnumC3554h4.VALUE);
        return strA;
    }

    public final C3579i4 f(String str) {
        Um um2 = this.f47421t;
        um2.getClass();
        String strA = um2.a(str);
        a(str, strA, EnumC3554h4.VALUE);
        this.f47632b = strA;
        return this;
    }

    public final HashMap<EnumC3554h4, Integer> p() {
        return this.f47418q;
    }

    @Override // io.appmetrica.analytics.impl.C3655l6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(String str) {
        this.f47631a = d(str);
    }

    @Override // io.appmetrica.analytics.impl.C3655l6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(String str) {
        this.f47632b = e(str);
    }

    @Override // io.appmetrica.analytics.impl.C3655l6, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValueBytes(byte[] bArr) {
        a(bArr);
    }

    public C3579i4(String str, int i13, PublicLogger publicLogger) {
        this("", str, i13, publicLogger);
    }

    public C3579i4(String str, String str2, int i13, PublicLogger publicLogger) {
        this(str, str2, i13, 0, publicLogger);
    }

    public C3579i4(String str, String str2, int i13, int i14, PublicLogger publicLogger) {
        this.f47418q = new HashMap();
        a(publicLogger);
        this.f47632b = e(str);
        this.f47631a = d(str2);
        setType(i13);
        setCustomType(i14);
    }

    public final C3579i4 a(HashMap<EnumC3554h4, Integer> map) {
        this.f47418q = map;
        return this;
    }

    public final void a(PublicLogger publicLogger) {
        this.f47419r = new Wm(1000, "event name", publicLogger);
        this.f47420s = new Um(245760, "event value", publicLogger);
        this.f47421t = new Um(1024000, "event extended value", publicLogger);
        this.f47422u = new C3901v3(245760, "event value bytes", publicLogger);
        this.f47423v = new Wm(200, "user profile id", publicLogger);
    }

    public C3579i4(byte[] bArr, String str, int i13, PublicLogger publicLogger) {
        this.f47418q = new HashMap();
        a(publicLogger);
        a(bArr);
        this.f47631a = d(str);
        setType(i13);
    }

    public final void a(byte[] bArr) {
        C3901v3 c3901v3 = this.f47422u;
        c3901v3.getClass();
        byte[] bArrA = c3901v3.a(bArr);
        EnumC3554h4 enumC3554h4 = EnumC3554h4.VALUE;
        if (bArr.length != bArrA.length) {
            this.f47418q.put(enumC3554h4, Integer.valueOf(bArr.length - bArrA.length));
        } else {
            this.f47418q.remove(enumC3554h4);
        }
        Iterator it = this.f47418q.values().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        this.f47637g = iIntValue;
        super.setValueBytes(bArrA);
    }

    public static C3655l6 a(C3523fo c3523fo) {
        C3655l6 c3655l6O = o();
        c3655l6O.setValue(new String(Base64.encode(MessageNano.toByteArray(c3523fo), 0)));
        return c3655l6O;
    }

    public static C3579i4 a(PublicLogger publicLogger, C3415bj c3415bj) {
        int length;
        C3579i4 c3579i4 = new C3579i4(publicLogger);
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        c3579i4.f47634d = 40976;
        Zi zi2 = new Zi();
        zi2.f46878b = c3415bj.f46976a.currency.getCurrencyCode().getBytes();
        zi2.f46882f = c3415bj.f46976a.priceMicros;
        zi2.f46879c = StringUtils.stringToBytesForProtobuf(new Wm(200, "revenue productID", c3415bj.f46980e).a(c3415bj.f46976a.productID));
        zi2.f46877a = ((Integer) WrapUtils.getOrDefault(c3415bj.f46976a.quantity, 1)).intValue();
        Um um2 = c3415bj.f46977b;
        String str = c3415bj.f46976a.payload;
        um2.getClass();
        zi2.f46880d = StringUtils.stringToBytesForProtobuf(um2.a(str));
        if (io.a(c3415bj.f46976a.receipt)) {
            Ui ui2 = new Ui();
            String str2 = (String) c3415bj.f46978c.a(c3415bj.f46976a.receipt.data);
            length = !StringUtils.equalsNullSafety(c3415bj.f46976a.receipt.data, str2) ? c3415bj.f46976a.receipt.data.length() : 0;
            String str3 = (String) c3415bj.f46979d.a(c3415bj.f46976a.receipt.signature);
            ui2.f46627a = StringUtils.stringToBytesForProtobuf(str2);
            ui2.f46628b = StringUtils.stringToBytesForProtobuf(str3);
            zi2.f46881e = ui2;
        } else {
            length = 0;
        }
        Pair pair = new Pair(MessageNano.toByteArray(zi2), Integer.valueOf(length));
        c3579i4.f47632b = c3579i4.e(new String(Base64.encode((byte[]) pair.first, 0)));
        c3579i4.f47637g = ((Integer) pair.second).intValue();
        return c3579i4;
    }

    public static C3579i4 a(PublicLogger publicLogger, D d13) {
        C3579i4 c3579i4 = new C3579i4(publicLogger);
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        c3579i4.f47634d = 40977;
        gg.vdvldrhtss vdvldrhtssVarA = d13.a();
        c3579i4.f47632b = c3579i4.e(new String(Base64.encode((byte[]) vdvldrhtssVarA.lqeggnwhkg(), 0)));
        c3579i4.f47637g = ((Integer) vdvldrhtssVarA.nufgyqmvbu()).intValue();
        return c3579i4;
    }
}
