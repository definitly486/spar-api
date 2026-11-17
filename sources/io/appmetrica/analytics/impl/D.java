package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdRevenue f45611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3822s f45613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Wm f45614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Um f45615e;

    public D(AdRevenue adRevenue, boolean z13, C3496en c3496en, PublicLogger publicLogger) {
        this.f45611a = adRevenue;
        this.f45612b = z13;
        this.f45613c = c3496en;
        this.f45614d = new Wm(100, "ad revenue strings", publicLogger);
        this.f45615e = new Um(30720, "ad revenue payload", publicLogger);
    }

    public final gg.vdvldrhtss a() {
        Map linkedHashMap;
        r rVar = new r();
        int length = 0;
        for (gg.vdvldrhtss vdvldrhtssVar : hg.jyumaefscl.rgvfuqvkyq(gg.cqumvgiudr.iobyxmoadg(this.f45611a.adNetwork, new C3922w(rVar)), gg.cqumvgiudr.iobyxmoadg(this.f45611a.adPlacementId, new C3947x(rVar)), gg.cqumvgiudr.iobyxmoadg(this.f45611a.adPlacementName, new C3972y(rVar)), gg.cqumvgiudr.iobyxmoadg(this.f45611a.adUnitId, new C3997z(rVar)), gg.cqumvgiudr.iobyxmoadg(this.f45611a.adUnitName, new A(rVar)), gg.cqumvgiudr.iobyxmoadg(this.f45611a.precision, new B(rVar)), gg.cqumvgiudr.iobyxmoadg(this.f45611a.currency.getCurrencyCode(), new C(rVar)))) {
            String str = (String) vdvldrhtssVar.lqeggnwhkg();
            tg.draadjrbmk draadjrbmkVar = (tg.draadjrbmk) vdvldrhtssVar.nufgyqmvbu();
            Wm wm2 = this.f45614d;
            wm2.getClass();
            String strA = wm2.a(str);
            byte[] bArrStringToBytesForProtobuf = StringUtils.stringToBytesForProtobuf(str);
            byte[] bArrStringToBytesForProtobuf2 = StringUtils.stringToBytesForProtobuf(strA);
            draadjrbmkVar.invoke(bArrStringToBytesForProtobuf2);
            length += bArrStringToBytesForProtobuf.length - bArrStringToBytesForProtobuf2.length;
        }
        Integer num = (Integer) E.f45674a.get(this.f45611a.adType);
        rVar.f47946d = num != null ? num.intValue() : 0;
        C3773q c3773q = new C3773q();
        BigDecimal bigDecimal = this.f45611a.adRevenue;
        BigInteger bigInteger = T7.f46550a;
        int i13 = -bigDecimal.scale();
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (bigIntegerUnscaledValue.compareTo(T7.f46550a) <= 0 && bigIntegerUnscaledValue.compareTo(T7.f46551b) >= 0) {
                break;
            }
            bigIntegerUnscaledValue = bigIntegerUnscaledValue.divide(BigInteger.TEN);
            i13++;
        }
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(Long.valueOf(bigIntegerUnscaledValue.longValue()), Integer.valueOf(i13));
        long jLongValue = ((Number) vdvldrhtssVarIobyxmoadg.lqeggnwhkg()).longValue();
        int iIntValue = ((Number) vdvldrhtssVarIobyxmoadg.nufgyqmvbu()).intValue();
        c3773q.f47903a = jLongValue;
        c3773q.f47904b = iIntValue;
        rVar.f47944b = c3773q;
        Map<String, String> map = this.f45611a.payload;
        InterfaceC3822s interfaceC3822s = this.f45613c;
        if (map == null || (linkedHashMap = hg.tzroggbefp.iwizpuwonk(map)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        String strB = Bb.b(interfaceC3822s.a(linkedHashMap));
        Um um2 = this.f45615e;
        um2.getClass();
        byte[] bArrStringToBytesForProtobuf3 = StringUtils.stringToBytesForProtobuf(um2.a(strB));
        rVar.f47953k = bArrStringToBytesForProtobuf3;
        int length2 = (StringUtils.stringToBytesForProtobuf(strB).length - bArrStringToBytesForProtobuf3.length) + length;
        if (this.f45612b) {
            rVar.f47943a = "autocollected".getBytes(mj.wkgbmnqykc.f67326zoijcleaow);
        }
        return gg.cqumvgiudr.iobyxmoadg(MessageNano.toByteArray(rVar), Integer.valueOf(length2));
    }
}
