package io.appmetrica.analytics.billingv6.impl;

import gg.wwaezpbzkn;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.jyumaefscl;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends jyumaefscl implements iobyxmoadg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f45197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f45198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f45199c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.f45197a = linkedHashMap;
        this.f45198b = map;
        this.f45199c = iVar;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        Map map = this.f45197a;
        Map map2 = this.f45198b;
        i iVar = this.f45199c;
        m.a(map, map2, iVar.f45203d, iVar.f45202c.getBillingInfoManager());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
