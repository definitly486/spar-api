package modern.payments.ecomAndroid.domain.model.response;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019BU\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012.\u0010\u0007\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b0\b\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J1\u0010\u0011\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b0\b\u0018\u00010\bHÆ\u0003J_\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000320\b\u0002\u0010\u0007\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b0\b\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR9\u0010\u0007\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b0\b\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, d2 = {"Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig;", "", "featuresToggle", "", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig$FeatureToggle;", "sslPins", "", "schemas", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "getFeaturesToggle", "()Ljava/util/List;", "getSchemas", "()Ljava/util/Map;", "getSslPins", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "FeatureToggle", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class EcomSdkConfig {
    private final List<FeatureToggle> featuresToggle;
    private final Map<String, Map<String, Map<String, String>>> schemas;
    private final List<String> sslPins;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig$FeatureToggle;", "", ExternalMetricsManagerImpl.NAME, "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FeatureToggle {
        private final String name;

        public FeatureToggle(String name) {
            zdlpuopuiu.btonecajqb(name, "name");
            this.name = name;
        }

        public static /* synthetic */ FeatureToggle copy$default(FeatureToggle featureToggle, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = featureToggle.name;
            }
            return featureToggle.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final FeatureToggle copy(String name) {
            zdlpuopuiu.btonecajqb(name, "name");
            return new FeatureToggle(name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FeatureToggle) && zdlpuopuiu.eablkybsjg(this.name, ((FeatureToggle) other).name);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return "FeatureToggle(name=" + this.name + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EcomSdkConfig(List<FeatureToggle> list, List<String> list2, Map<String, ? extends Map<String, ? extends Map<String, String>>> map) {
        this.featuresToggle = list;
        this.sslPins = list2;
        this.schemas = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EcomSdkConfig copy$default(EcomSdkConfig ecomSdkConfig, List list, List list2, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = ecomSdkConfig.featuresToggle;
        }
        if ((i13 & 2) != 0) {
            list2 = ecomSdkConfig.sslPins;
        }
        if ((i13 & 4) != 0) {
            map = ecomSdkConfig.schemas;
        }
        return ecomSdkConfig.copy(list, list2, map);
    }

    public final List<FeatureToggle> component1() {
        return this.featuresToggle;
    }

    public final List<String> component2() {
        return this.sslPins;
    }

    public final Map<String, Map<String, Map<String, String>>> component3() {
        return this.schemas;
    }

    public final EcomSdkConfig copy(List<FeatureToggle> featuresToggle, List<String> sslPins, Map<String, ? extends Map<String, ? extends Map<String, String>>> schemas) {
        return new EcomSdkConfig(featuresToggle, sslPins, schemas);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcomSdkConfig)) {
            return false;
        }
        EcomSdkConfig ecomSdkConfig = (EcomSdkConfig) other;
        return zdlpuopuiu.eablkybsjg(this.featuresToggle, ecomSdkConfig.featuresToggle) && zdlpuopuiu.eablkybsjg(this.sslPins, ecomSdkConfig.sslPins) && zdlpuopuiu.eablkybsjg(this.schemas, ecomSdkConfig.schemas);
    }

    public final List<FeatureToggle> getFeaturesToggle() {
        return this.featuresToggle;
    }

    public final Map<String, Map<String, Map<String, String>>> getSchemas() {
        return this.schemas;
    }

    public final List<String> getSslPins() {
        return this.sslPins;
    }

    public int hashCode() {
        List<FeatureToggle> list = this.featuresToggle;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.sslPins;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, Map<String, Map<String, String>>> map = this.schemas;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "EcomSdkConfig(featuresToggle=" + this.featuresToggle + ", sslPins=" + this.sslPins + ", schemas=" + this.schemas + ')';
    }
}
