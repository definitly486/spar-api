package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ModuleEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f45105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f45106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Category f45107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f45108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f45109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f45110h;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f45111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f45112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f45113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f45114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Category f45115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private HashMap f45116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private HashMap f45117g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private HashMap f45118h;

        /* synthetic */ Builder(int i13, int i14) {
            this(i13);
        }

        public ModuleEvent build() {
            return new ModuleEvent(this, 0);
        }

        public Builder withAttributes(Map<String, Object> map) {
            if (map != null) {
                this.f45118h = new HashMap(map);
            }
            return this;
        }

        public Builder withCategory(Category category) {
            this.f45115e = category;
            return this;
        }

        public Builder withEnvironment(Map<String, Object> map) {
            if (map != null) {
                this.f45116f = new HashMap(map);
            }
            return this;
        }

        public Builder withExtras(Map<String, byte[]> map) {
            if (map != null) {
                this.f45117g = new HashMap(map);
            }
            return this;
        }

        public Builder withName(String str) {
            this.f45112b = str;
            return this;
        }

        public Builder withServiceDataReporterType(int i13) {
            this.f45114d = i13;
            return this;
        }

        public Builder withValue(String str) {
            this.f45113c = str;
            return this;
        }

        private Builder(int i13) {
            this.f45114d = 1;
            this.f45115e = Category.GENERAL;
            this.f45111a = i13;
        }
    }

    public enum Category {
        GENERAL,
        SYSTEM
    }

    /* synthetic */ ModuleEvent(Builder builder, int i13) {
        this(builder);
    }

    public static Builder newBuilder(int i13) {
        return new Builder(i13, 0);
    }

    public Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f45110h);
    }

    public Category getCategory() {
        return this.f45107e;
    }

    public Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f45108f);
    }

    public Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f45109g);
    }

    public String getName() {
        return this.f45104b;
    }

    public int getServiceDataReporterType() {
        return this.f45106d;
    }

    public int getType() {
        return this.f45103a;
    }

    public String getValue() {
        return this.f45105c;
    }

    public String toString() {
        return "ModuleEvent{type=" + this.f45103a + ", name='" + this.f45104b + "', value='" + this.f45105c + "', serviceDataReporterType=" + this.f45106d + ", category=" + this.f45107e + ", environment=" + this.f45108f + ", extras=" + this.f45109g + ", attributes=" + this.f45110h + '}';
    }

    private ModuleEvent(Builder builder) {
        this.f45103a = builder.f45111a;
        this.f45104b = builder.f45112b;
        this.f45105c = builder.f45113c;
        this.f45106d = builder.f45114d;
        this.f45107e = builder.f45115e;
        this.f45108f = CollectionUtils.getListFromMap(builder.f45116f);
        this.f45109g = CollectionUtils.getListFromMap(builder.f45117g);
        this.f45110h = CollectionUtils.getListFromMap(builder.f45118h);
    }
}
