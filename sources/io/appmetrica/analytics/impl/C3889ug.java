package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3889ug implements InstallReferrerStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3914vg f48206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fg f48207b;

    public C3889ug(C3914vg c3914vg, Fg fg2) {
        this.f48206a = c3914vg;
        this.f48207b = fg2;
    }

    public static final void a(C3914vg c3914vg, Fg fg2) {
        InstallReferrerClient installReferrerClient;
        try {
            try {
                ReferrerDetails installReferrer = c3914vg.f48242b.getInstallReferrer();
                fg2.a(new Ag(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC4014zg.f48613c));
                installReferrerClient = c3914vg.f48242b;
            } catch (Throwable th2) {
                try {
                    fg2.a(th2);
                    installReferrerClient = c3914vg.f48242b;
                } catch (Throwable th3) {
                    try {
                        c3914vg.f48242b.endConnection();
                    } catch (Throwable unused) {
                    }
                    throw th3;
                }
            }
            installReferrerClient.endConnection();
        } catch (Throwable unused2) {
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i13) {
        if (i13 == 0) {
            final C3914vg c3914vg = this.f48206a;
            ICommonExecutor iCommonExecutor = c3914vg.f48241a;
            final Fg fg2 = this.f48207b;
            iCommonExecutor.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.mbcevpiqjq
                @Override // java.lang.Runnable
                public final void run() {
                    C3889ug.a(c3914vg, fg2);
                }
            });
            return;
        }
        this.f48206a.a(this.f48207b, new IllegalStateException("Referrer check failed with error " + i13));
    }
}
