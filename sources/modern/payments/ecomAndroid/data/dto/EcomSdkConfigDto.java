package modern.payments.ecomAndroid.data.dto;

import gg.cqumvgiudr;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.common.Constants;
import modern.payments.ecomAndroid.data.dto.base.DataDtoInterface;
import modern.payments.ecomAndroid.domain.model.response.EcomSdkConfig;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f !BE\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u001e\u0010\b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tj\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u0001`\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003J!\u0010\u0014\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tj\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u0001`\u000bHÆ\u0003JO\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042 \b\u0002\u0010\b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tj\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u0001`\u000bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001JL\u0010\u001c\u001a*\u0012\u0004\u0012\u00020\u0007\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001e0\u001e\u0018\u00010\u001e*\u001a\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tj\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u0001`\u000bH\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR)\u0010\b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tj\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u0001`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\""}, d2 = {"Lmodern/payments/ecomAndroid/data/dto/EcomSdkConfigDto;", "Lmodern/payments/ecomAndroid/data/dto/base/DataDtoInterface;", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig;", "featuresToggle", "", "Lmodern/payments/ecomAndroid/data/dto/EcomSdkConfigDto$FeatureToggleDto;", "sslPins", "", "schemas", "Ljava/util/ArrayList;", "Lmodern/payments/ecomAndroid/data/dto/EcomSdkConfigDto$SchemaDto;", "Lkotlin/collections/ArrayList;", "(Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;)V", "getFeaturesToggle", "()Ljava/util/List;", "getSchemas", "()Ljava/util/ArrayList;", "getSslPins", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "", "FeatureToggleDto", "SchemaDto", "ServiceDto", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class EcomSdkConfigDto implements DataDtoInterface<EcomSdkConfig> {
    private final List<FeatureToggleDto> featuresToggle;
    private final ArrayList<SchemaDto> schemas;
    private final List<String> sslPins;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lmodern/payments/ecomAndroid/data/dto/EcomSdkConfigDto$FeatureToggleDto;", "Lmodern/payments/ecomAndroid/data/dto/base/DataDtoInterface;", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig$FeatureToggle;", ExternalMetricsManagerImpl.NAME, "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FeatureToggleDto implements DataDtoInterface<EcomSdkConfig.FeatureToggle> {
        private final String name;

        public FeatureToggleDto(String name) {
            zdlpuopuiu.btonecajqb(name, "name");
            this.name = name;
        }

        public static /* synthetic */ FeatureToggleDto copy$default(FeatureToggleDto featureToggleDto, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = featureToggleDto.name;
            }
            return featureToggleDto.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final FeatureToggleDto copy(String name) {
            zdlpuopuiu.btonecajqb(name, "name");
            return new FeatureToggleDto(name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FeatureToggleDto) && zdlpuopuiu.eablkybsjg(this.name, ((FeatureToggleDto) other).name);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return "FeatureToggleDto(name=" + this.name + ')';
        }

        @Override // modern.payments.ecomAndroid.data.dto.base.DataDtoInterface
        public EcomSdkConfig.FeatureToggle toModel() {
            return new EcomSdkConfig.FeatureToggle(this.name);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002.\u0012*\u0012(\u0012\u0004\u0012\u00020\u0003\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J.\u0010\u0016\u001a(\u0012\u0004\u0012\u00020\u0003\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u00020\u0002H\u0016J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lmodern/payments/ecomAndroid/data/dto/EcomSdkConfigDto$SchemaDto;", "Lmodern/payments/ecomAndroid/data/dto/base/DataDtoInterface;", "", "", "stand", "service", "", "Lmodern/payments/ecomAndroid/data/dto/EcomSdkConfigDto$ServiceDto;", "(Ljava/lang/String;Ljava/util/List;)V", "getService", "()Ljava/util/List;", "getStand", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SchemaDto implements DataDtoInterface<Map<String, ? extends Map<String, ? extends Map<String, ? extends String>>>> {
        private final List<ServiceDto> service;
        private final String stand;

        public SchemaDto(String stand, List<ServiceDto> service) {
            zdlpuopuiu.btonecajqb(stand, "stand");
            zdlpuopuiu.btonecajqb(service, "service");
            this.stand = stand;
            this.service = service;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SchemaDto copy$default(SchemaDto schemaDto, String str, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = schemaDto.stand;
            }
            if ((i13 & 2) != 0) {
                list = schemaDto.service;
            }
            return schemaDto.copy(str, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getStand() {
            return this.stand;
        }

        public final List<ServiceDto> component2() {
            return this.service;
        }

        public final SchemaDto copy(String stand, List<ServiceDto> service) {
            zdlpuopuiu.btonecajqb(stand, "stand");
            zdlpuopuiu.btonecajqb(service, "service");
            return new SchemaDto(stand, service);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SchemaDto)) {
                return false;
            }
            SchemaDto schemaDto = (SchemaDto) other;
            return zdlpuopuiu.eablkybsjg(this.stand, schemaDto.stand) && zdlpuopuiu.eablkybsjg(this.service, schemaDto.service);
        }

        public final List<ServiceDto> getService() {
            return this.service;
        }

        public final String getStand() {
            return this.stand;
        }

        public int hashCode() {
            return (this.stand.hashCode() * 31) + this.service.hashCode();
        }

        public String toString() {
            return "SchemaDto(stand=" + this.stand + ", service=" + this.service + ')';
        }

        @Override // modern.payments.ecomAndroid.data.dto.base.DataDtoInterface
        public Map<String, ? extends Map<String, ? extends Map<String, ? extends String>>> toModel() {
            return tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg(this.stand, EcomSdkConfigDtoKt.toModel(this.service)));
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\"\u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0002H\u0016J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lmodern/payments/ecomAndroid/data/dto/EcomSdkConfigDto$ServiceDto;", "Lmodern/payments/ecomAndroid/data/dto/base/DataDtoInterface;", "", "", "service", "uri", "appId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "getService", "getUri", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServiceDto implements DataDtoInterface<Map<String, ? extends Map<String, ? extends String>>> {
        private final String appId;
        private final String service;
        private final String uri;

        public ServiceDto(String service, String str, String str2) {
            zdlpuopuiu.btonecajqb(service, "service");
            this.service = service;
            this.uri = str;
            this.appId = str2;
        }

        public static /* synthetic */ ServiceDto copy$default(ServiceDto serviceDto, String str, String str2, String str3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = serviceDto.service;
            }
            if ((i13 & 2) != 0) {
                str2 = serviceDto.uri;
            }
            if ((i13 & 4) != 0) {
                str3 = serviceDto.appId;
            }
            return serviceDto.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getService() {
            return this.service;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAppId() {
            return this.appId;
        }

        public final ServiceDto copy(String service, String uri, String appId) {
            zdlpuopuiu.btonecajqb(service, "service");
            return new ServiceDto(service, uri, appId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServiceDto)) {
                return false;
            }
            ServiceDto serviceDto = (ServiceDto) other;
            return zdlpuopuiu.eablkybsjg(this.service, serviceDto.service) && zdlpuopuiu.eablkybsjg(this.uri, serviceDto.uri) && zdlpuopuiu.eablkybsjg(this.appId, serviceDto.appId);
        }

        public final String getAppId() {
            return this.appId;
        }

        public final String getService() {
            return this.service;
        }

        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            int iHashCode = this.service.hashCode() * 31;
            String str = this.uri;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.appId;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ServiceDto(service=" + this.service + ", uri=" + this.uri + ", appId=" + this.appId + ')';
        }

        @Override // modern.payments.ecomAndroid.data.dto.base.DataDtoInterface
        public Map<String, ? extends Map<String, ? extends String>> toModel() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (this.uri != null) {
                linkedHashMap.put(Constants.EcomServiceParam.URI.getKey(), this.uri);
            }
            if (this.appId != null) {
                linkedHashMap.put(Constants.EcomServiceParam.APP_ID.getKey(), this.appId);
            }
            return tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg(this.service, linkedHashMap));
        }
    }

    public EcomSdkConfigDto(List<FeatureToggleDto> list, List<String> list2, ArrayList<SchemaDto> arrayList) {
        this.featuresToggle = list;
        this.sslPins = list2;
        this.schemas = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EcomSdkConfigDto copy$default(EcomSdkConfigDto ecomSdkConfigDto, List list, List list2, ArrayList arrayList, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = ecomSdkConfigDto.featuresToggle;
        }
        if ((i13 & 2) != 0) {
            list2 = ecomSdkConfigDto.sslPins;
        }
        if ((i13 & 4) != 0) {
            arrayList = ecomSdkConfigDto.schemas;
        }
        return ecomSdkConfigDto.copy(list, list2, arrayList);
    }

    public final List<FeatureToggleDto> component1() {
        return this.featuresToggle;
    }

    public final List<String> component2() {
        return this.sslPins;
    }

    public final ArrayList<SchemaDto> component3() {
        return this.schemas;
    }

    public final EcomSdkConfigDto copy(List<FeatureToggleDto> featuresToggle, List<String> sslPins, ArrayList<SchemaDto> schemas) {
        return new EcomSdkConfigDto(featuresToggle, sslPins, schemas);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcomSdkConfigDto)) {
            return false;
        }
        EcomSdkConfigDto ecomSdkConfigDto = (EcomSdkConfigDto) other;
        return zdlpuopuiu.eablkybsjg(this.featuresToggle, ecomSdkConfigDto.featuresToggle) && zdlpuopuiu.eablkybsjg(this.sslPins, ecomSdkConfigDto.sslPins) && zdlpuopuiu.eablkybsjg(this.schemas, ecomSdkConfigDto.schemas);
    }

    public final List<FeatureToggleDto> getFeaturesToggle() {
        return this.featuresToggle;
    }

    public final ArrayList<SchemaDto> getSchemas() {
        return this.schemas;
    }

    public final List<String> getSslPins() {
        return this.sslPins;
    }

    public int hashCode() {
        List<FeatureToggleDto> list = this.featuresToggle;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.sslPins;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        ArrayList<SchemaDto> arrayList = this.schemas;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public String toString() {
        return "EcomSdkConfigDto(featuresToggle=" + this.featuresToggle + ", sslPins=" + this.sslPins + ", schemas=" + this.schemas + ')';
    }

    @Override // modern.payments.ecomAndroid.data.dto.base.DataDtoInterface
    public EcomSdkConfig toModel() {
        ArrayList arrayList;
        List<FeatureToggleDto> list = this.featuresToggle;
        if (list != null) {
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((FeatureToggleDto) it.next()).toModel());
            }
        } else {
            arrayList = null;
        }
        return new EcomSdkConfig(arrayList, this.sslPins, toModel(this.schemas));
    }

    private final Map<String, Map<String, Map<String, String>>> toModel(ArrayList<SchemaDto> arrayList) {
        Map<String, ? extends Map<String, ? extends Map<String, ? extends String>>> model;
        if (arrayList == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (SchemaDto schemaDto : arrayList) {
            if (schemaDto != null && (model = schemaDto.toModel()) != null) {
                linkedHashMap.putAll(model);
            }
        }
        return linkedHashMap;
    }
}
