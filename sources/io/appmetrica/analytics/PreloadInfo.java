package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class PreloadInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f45122b;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f45123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap f45124b;

        /* synthetic */ Builder(String str, int i13) {
            this(str);
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, 0);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f45124b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f45123a = str;
            this.f45124b = new HashMap();
        }
    }

    /* synthetic */ PreloadInfo(Builder builder, int i13) {
        this(builder);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, 0);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f45122b;
    }

    public String getTrackingId() {
        return this.f45121a;
    }

    private PreloadInfo(Builder builder) {
        this.f45121a = builder.f45123a;
        this.f45122b = CollectionUtils.unmodifiableMapCopy(builder.f45124b);
    }
}
