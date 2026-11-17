package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3507f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeferredDeeplinkListener f47210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DeferredDeeplinkParametersListener f47211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C3456d8 f47212d;

    public C3507f8(boolean z13) {
        this.f47209a = z13;
    }

    public final void a(int i13) {
        DeferredDeeplinkParametersListener.Error error;
        DeferredDeeplinkListener.Error error2;
        C3456d8 c3456d8 = this.f47212d;
        String str = c3456d8 == null ? null : c3456d8.f47093c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f47210b;
        if (deferredDeeplinkListener != null) {
            if (i13 == 0) {
                throw null;
            }
            int i14 = i13 - 1;
            if (i14 == 0) {
                error2 = DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH;
            } else if (i14 != 1) {
                error2 = i14 != 2 ? DeferredDeeplinkListener.Error.UNKNOWN : DeferredDeeplinkListener.Error.NO_REFERRER;
            } else {
                error2 = DeferredDeeplinkListener.Error.PARSE_ERROR;
            }
            deferredDeeplinkListener.onError(error2, (String) WrapUtils.getOrDefault(str, ""));
            this.f47210b = null;
        }
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f47211c;
        if (deferredDeeplinkParametersListener != null) {
            if (i13 == 0) {
                throw null;
            }
            int i15 = i13 - 1;
            if (i15 == 0) {
                error = DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH;
            } else if (i15 != 1) {
                error = i15 != 2 ? DeferredDeeplinkParametersListener.Error.UNKNOWN : DeferredDeeplinkParametersListener.Error.NO_REFERRER;
            } else {
                error = DeferredDeeplinkParametersListener.Error.PARSE_ERROR;
            }
            deferredDeeplinkParametersListener.onError(error, (String) WrapUtils.getOrDefault(str, ""));
            this.f47211c = null;
        }
    }

    public final void a() {
        C3456d8 c3456d8 = this.f47212d;
        if (c3456d8 != null) {
            String str = c3456d8.f47092b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f47210b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f47210b = null;
                }
                if (!io.a(this.f47212d.f47091a)) {
                    Map<String, String> map = this.f47212d.f47091a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f47211c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f47211c = null;
                        return;
                    }
                    return;
                }
                String str2 = this.f47212d.f47093c;
                DeferredDeeplinkParametersListener deferredDeeplinkParametersListener2 = this.f47211c;
                if (deferredDeeplinkParametersListener2 != null) {
                    deferredDeeplinkParametersListener2.onError(DeferredDeeplinkParametersListener.Error.PARSE_ERROR, (String) WrapUtils.getOrDefault(str2, ""));
                    this.f47211c = null;
                    return;
                }
                return;
            }
            if (c3456d8.f47093c != null) {
                a(2);
            } else {
                a(3);
            }
        }
    }
}
