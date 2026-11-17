package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.Bn;
import io.appmetrica.analytics.impl.C3499f0;
import io.appmetrica.analytics.impl.I5;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ReporterConfig {
    public final Map<String, Object> additionalConfig;
    public final String apiKey;
    public final Map<String, String> appEnvironment;
    public final Boolean dataSendingEnabled;
    public final Integer dispatchPeriodSeconds;
    public final Boolean logs;
    public final Integer maxReportsCount;
    public final Integer maxReportsInDatabaseCount;
    public final Integer sessionTimeout;
    public final String userProfileID;

    public static class Builder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final Bn f45125l = new Bn(new C3499f0());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final I5 f45126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f45127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f45128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f45129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f45130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f45131f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f45132g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f45133h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Integer f45134i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final HashMap f45135j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final HashMap f45136k;

        /* synthetic */ Builder(String str, int i13) {
            this(str);
        }

        public ReporterConfig build() {
            return new ReporterConfig(this, 0);
        }

        public Builder withAdditionalConfig(String str, Object obj) {
            this.f45136k.put(str, obj);
            return this;
        }

        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f45135j.put(str, str2);
            return this;
        }

        public Builder withDataSendingEnabled(boolean z13) {
            this.f45130e = Boolean.valueOf(z13);
            return this;
        }

        public Builder withDispatchPeriodSeconds(int i13) {
            this.f45133h = Integer.valueOf(i13);
            return this;
        }

        public Builder withLogs() {
            this.f45129d = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsCount(int i13) {
            this.f45134i = Integer.valueOf(i13);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i13) {
            this.f45131f = Integer.valueOf(this.f45126a.a(i13));
            return this;
        }

        public Builder withSessionTimeout(int i13) {
            this.f45128c = Integer.valueOf(i13);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f45132g = str;
            return this;
        }

        private Builder(String str) {
            this.f45135j = new HashMap();
            this.f45136k = new HashMap();
            f45125l.a(str);
            this.f45126a = new I5(str);
            this.f45127b = str;
        }
    }

    /* synthetic */ ReporterConfig(Builder builder, int i13) {
        this(builder);
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str, 0);
    }

    private ReporterConfig(Builder builder) {
        this.apiKey = builder.f45127b;
        this.sessionTimeout = builder.f45128c;
        this.logs = builder.f45129d;
        this.dataSendingEnabled = builder.f45130e;
        this.maxReportsInDatabaseCount = builder.f45131f;
        this.userProfileID = builder.f45132g;
        this.dispatchPeriodSeconds = builder.f45133h;
        this.maxReportsCount = builder.f45134i;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f45135j);
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f45136k);
    }
}
