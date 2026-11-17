package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3814rg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3989yg f47991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ua f47992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Jg f47993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gg.gtknphoqwx f47994d = gg.draadjrbmk.zoijcleaow(new C3740og(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gg.gtknphoqwx f47995e = gg.draadjrbmk.zoijcleaow(new C3690mg(this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gg.gtknphoqwx f47996f = gg.draadjrbmk.zoijcleaow(new C3790qg(this));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f47997g = new ArrayList();

    public C3814rg(C3989yg c3989yg, Ig ig2, Ua ua3, Jg jg2) {
        this.f47991a = c3989yg;
        this.f47992b = ua3;
        this.f47993c = jg2;
    }

    public static final InterfaceC3615jg a(C3814rg c3814rg) {
        return (InterfaceC3615jg) c3814rg.f47994d.getValue();
    }

    public static final void a(C3814rg c3814rg, Ag ag2, InterfaceC3615jg interfaceC3615jg) {
        boolean zEablkybsjg;
        c3814rg.f47997g.add(ag2);
        Jg jg2 = c3814rg.f47993c;
        if (ag2 == null) {
            jg2.getClass();
        } else {
            SafePackageManager safePackageManager = jg2.f46098b;
            Context context = jg2.f46097a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int iOrdinal = ag2.f45471d.ordinal();
            if (iOrdinal == 1) {
                zEablkybsjg = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(jg2.f46102f, installerPackageName);
            } else if (iOrdinal == 2) {
                zEablkybsjg = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(jg2.f46103g, installerPackageName);
            }
            if (zEablkybsjg) {
                c3814rg.a(ag2);
                return;
            }
        }
        interfaceC3615jg.a();
    }

    public final void a(Ag ag2) {
        C3989yg c3989yg = this.f47991a;
        synchronized (c3989yg) {
            c3989yg.f48527b = ag2;
            c3989yg.f48528c = true;
            c3989yg.f48529d.a(ag2);
            c3989yg.f48529d.d();
            c3989yg.a(c3989yg.f48527b);
        }
    }
}
