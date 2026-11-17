package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class Do {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f45672a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PublicLogger f45673b;

    public final synchronized void a(Consumer consumer) {
        try {
            PublicLogger publicLogger = this.f45673b;
            if (publicLogger == null) {
                this.f45672a.add(consumer);
            } else {
                consumer.consume(publicLogger);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
