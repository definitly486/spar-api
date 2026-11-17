package io.appmetrica.analytics.plugins;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class PluginErrorDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f48869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f48870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f48871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f48872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f48873f;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f48874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f48875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f48876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f48877d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f48878e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f48879f;

        public PluginErrorDetails build() {
            return new PluginErrorDetails(this.f48874a, this.f48875b, (List) WrapUtils.getOrDefault(this.f48876c, new ArrayList()), this.f48877d, this.f48878e, (Map) WrapUtils.getOrDefault(this.f48879f, new HashMap()), 0);
        }

        public Builder withExceptionClass(String str) {
            this.f48874a = str;
            return this;
        }

        public Builder withMessage(String str) {
            this.f48875b = str;
            return this;
        }

        public Builder withPlatform(String str) {
            this.f48877d = str;
            return this;
        }

        public Builder withPluginEnvironment(Map<String, String> map) {
            this.f48879f = map;
            return this;
        }

        public Builder withStacktrace(List<StackTraceItem> list) {
            this.f48876c = list;
            return this;
        }

        public Builder withVirtualMachineVersion(String str) {
            this.f48878e = str;
            return this;
        }
    }

    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    /* synthetic */ PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, int i13) {
        this(str, str2, list, str3, str4, map);
    }

    public String getExceptionClass() {
        return this.f48868a;
    }

    public String getMessage() {
        return this.f48869b;
    }

    public String getPlatform() {
        return this.f48871d;
    }

    public Map<String, String> getPluginEnvironment() {
        return this.f48873f;
    }

    public List<StackTraceItem> getStacktrace() {
        return this.f48870c;
    }

    public String getVirtualMachineVersion() {
        return this.f48872e;
    }

    private PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map) {
        this.f48868a = str;
        this.f48869b = str2;
        this.f48870c = new ArrayList(list);
        this.f48871d = str3;
        this.f48872e = str4;
        this.f48873f = CollectionUtils.getMapFromList(CollectionUtils.getListFromMap(map));
    }
}
