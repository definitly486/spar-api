package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Td implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Sd f46557a = new Sd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f46558b = hg.tzroggbefp.draadjrbmk(gg.cqumvgiudr.iobyxmoadg(NativeCrashSource.UNKNOWN, 0), gg.cqumvgiudr.iobyxmoadg(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3804r6 fromModel(Zd zd2) {
        C3804r6 c3804r6 = new C3804r6();
        c3804r6.f47972f = 1;
        C3780q6 c3780q6 = new C3780q6();
        c3780q6.f47912a = zd2.f46861a;
        C3879u6 c3879u6 = new C3879u6();
        Integer num = (Integer) f46558b.get(zd2.f46862b.f46717a);
        if (num != null) {
            c3879u6.f48160a = num.intValue();
        }
        String str = zd2.f46862b.f46718b;
        if (str == null) {
            str = "";
        }
        c3879u6.f48161b = str;
        c3780q6.f47913b = c3879u6;
        c3804r6.f47973g = c3780q6;
        return c3804r6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Zd a(C3804r6 c3804r6) {
        throw new UnsupportedOperationException();
    }
}
