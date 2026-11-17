package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3941wi implements InterfaceC3710nb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pf f48339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ji f48340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f48341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ol f48342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Nc f48343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f48344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bn f48345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f48346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Cc f48347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public H6 f48348k;

    public C3941wi(Context context, Pf pf2, Ji ji2, Handler handler, Ol ol2) {
        this.f48338a = context;
        this.f48339b = pf2;
        this.f48340c = ji2;
        this.f48341d = handler;
        this.f48342e = ol2;
        this.f48343f = new Nc(context, pf2, ji2, ol2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f48344g = linkedHashMap;
        this.f48345h = new Bn(new C3991yi(linkedHashMap));
        this.f48346i = hg.jyumaefscl.rgvfuqvkyq("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3710nb, io.appmetrica.analytics.impl.InterfaceC3735ob
    public final InterfaceC3710nb a() {
        return this;
    }

    public final C3941wi b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3710nb
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized Cc a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z13) {
        Cc cc3;
        try {
            cc3 = this.f48347j;
            if (cc3 == null) {
                this.f48345h.a(appMetricaConfig.apiKey);
                this.f48343f.a(appMetricaConfig, publicLogger);
                cc3 = new Cc(this.f48343f);
                cc3.f46650i = new Jb(this.f48341d, cc3);
                Ol ol2 = this.f48342e;
                Sh sh2 = cc3.f46643b;
                if (ol2 != null) {
                    sh2.f47066b.setUuid(ol2.g());
                } else {
                    sh2.getClass();
                }
                cc3.a(appMetricaConfig, z13);
                cc3.k();
                this.f48340c.f46109f.f47457c = new C3916vi(cc3);
                this.f48344g.put(appMetricaConfig.apiKey, cc3);
                this.f48347j = cc3;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return cc3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3710nb
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized Cc b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z13) {
        Cc cc3;
        try {
            cc3 = this.f48347j;
            if (cc3 != null) {
                this.f48343f.a(appMetricaConfig, publicLogger);
                cc3.a(appMetricaConfig, z13);
                C3952x4.l().getClass();
                this.f48344g.put(appMetricaConfig.apiKey, cc3);
            } else {
                this.f48345h.a(appMetricaConfig.apiKey);
                this.f48343f.a(appMetricaConfig, publicLogger);
                cc3 = new Cc(this.f48343f);
                cc3.f46650i = new Jb(this.f48341d, cc3);
                Ol ol2 = this.f48342e;
                Sh sh2 = cc3.f46643b;
                if (ol2 != null) {
                    sh2.f47066b.setUuid(ol2.g());
                } else {
                    sh2.getClass();
                }
                cc3.a(appMetricaConfig, z13);
                cc3.k();
                this.f48340c.f46109f.f47457c = new C3916vi(cc3);
                this.f48344g.put(appMetricaConfig.apiKey, cc3);
                C3952x4.l().getClass();
                this.f48347j = cc3;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return cc3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3710nb
    public final synchronized void a(ReporterConfig reporterConfig) {
        try {
            if (this.f48344g.containsKey(reporterConfig.apiKey)) {
                LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey));
            } else {
                b(reporterConfig);
                ImportantLogger.INSTANCE.info("AppMetrica", "Activate reporter with APIKey " + ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey), new Object[0]);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3710nb
    public final synchronized InterfaceC3685mb b(ReporterConfig reporterConfig) {
        InterfaceC3685mb interfaceC3685mb;
        try {
            interfaceC3685mb = (InterfaceC3685mb) this.f48344g.get(reporterConfig.apiKey);
            if (interfaceC3685mb == null) {
                if (!this.f48346i.contains(reporterConfig.apiKey)) {
                    this.f48342e.i();
                }
                Context context = this.f48338a;
                Tc tc2 = new Tc(context, this.f48339b, reporterConfig, this.f48340c, new C3560ha(context));
                tc2.f46650i = new Jb(this.f48341d, tc2);
                Ol ol2 = this.f48342e;
                Sh sh2 = tc2.f46643b;
                if (ol2 != null) {
                    sh2.f47066b.setUuid(ol2.g());
                } else {
                    sh2.getClass();
                }
                tc2.k();
                this.f48344g.put(reporterConfig.apiKey, tc2);
                interfaceC3685mb = tc2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return interfaceC3685mb;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3710nb
    public final synchronized InterfaceC3760pb a(AppMetricaConfig appMetricaConfig) {
        H6 h13;
        try {
            h13 = this.f48348k;
            if (h13 != null) {
                h13.a(appMetricaConfig);
            } else {
                H6 h14 = new H6(new I6(this.f48339b, this.f48343f.f46267e, this.f48340c, appMetricaConfig));
                this.f48348k = h14;
                h13 = h14;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return h13;
    }
}
