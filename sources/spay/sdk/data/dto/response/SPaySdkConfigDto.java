package spay.sdk.data.dto.response;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import npi.spay.pd;
import spay.sdk.domain.model.response.SPaySdkConfig;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005/0123B\u0089\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bj\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u0001`\n\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\bj\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u0001`\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\n¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J!\u0010!\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bj\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u0001`\nHÆ\u0003J!\u0010\"\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\bj\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u0001`\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u001d\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\nHÆ\u0003J\u009b\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bj\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u0001`\n2 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\bj\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u0001`\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\nHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\b\u0010-\u001a\u00020\u0002H\u0016J\t\u0010.\u001a\u00020\u0004HÖ\u0001R.\u0010\u000b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\bj\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R.\u0010\u0007\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bj\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R*\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00064"}, d2 = {"Lspay/sdk/data/dto/response/SPaySdkConfigDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/SPaySdkConfig;", "version", "", "localization", "Lspay/sdk/data/dto/response/SPaySdkConfigDto$LocalizationDto;", "schemas", "Ljava/util/ArrayList;", "Lspay/sdk/data/dto/response/SPaySdkConfigDto$SchemaDto;", "Lkotlin/collections/ArrayList;", "featuresToggle", "Lspay/sdk/data/dto/response/SPaySdkConfigDto$FeatureToggleDto;", "images", "Lspay/sdk/data/dto/response/SPaySdkConfigDto$ImagesDto;", "versionInfoDto", "Lspay/sdk/data/dto/response/SPaySdkConfigDto$VersionInfoDto;", "sslPins", "(Ljava/lang/String;Lspay/sdk/data/dto/response/SPaySdkConfigDto$LocalizationDto;Ljava/util/ArrayList;Ljava/util/ArrayList;Lspay/sdk/data/dto/response/SPaySdkConfigDto$ImagesDto;Lspay/sdk/data/dto/response/SPaySdkConfigDto$VersionInfoDto;Ljava/util/ArrayList;)V", "getFeaturesToggle", "()Ljava/util/ArrayList;", "getImages", "()Lspay/sdk/data/dto/response/SPaySdkConfigDto$ImagesDto;", "getLocalization", "()Lspay/sdk/data/dto/response/SPaySdkConfigDto$LocalizationDto;", "getSchemas", "getSslPins", "getVersion", "()Ljava/lang/String;", "getVersionInfoDto", "()Lspay/sdk/data/dto/response/SPaySdkConfigDto$VersionInfoDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "FeatureToggleDto", "ImagesDto", "LocalizationDto", "SchemaDto", "VersionInfoDto", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SPaySdkConfigDto implements DataDtoInterface<SPaySdkConfig> {

    @ppxfxbqfkf("featuresToggle")
    private final ArrayList<FeatureToggleDto> featuresToggle;

    @ppxfxbqfkf("images")
    private final ImagesDto images;

    @ppxfxbqfkf("localization")
    private final LocalizationDto localization;

    @ppxfxbqfkf("schemas")
    private final ArrayList<SchemaDto> schemas;

    @ppxfxbqfkf("sslPins")
    private final ArrayList<String> sslPins;

    @ppxfxbqfkf("version")
    private final String version;

    @ppxfxbqfkf("versionInfo")
    private final VersionInfoDto versionInfoDto;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lspay/sdk/data/dto/response/SPaySdkConfigDto$FeatureToggleDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/SPaySdkConfig$FeatureToggle;", ExternalMetricsManagerImpl.NAME, "", "value", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getName", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lspay/sdk/data/dto/response/SPaySdkConfigDto$FeatureToggleDto;", "equals", "other", "", "hashCode", "", "toModel", "toString", "Companion", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FeatureToggleDto implements DataDtoInterface<SPaySdkConfig.FeatureToggle> {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @ppxfxbqfkf(ExternalMetricsManagerImpl.NAME)
        private final String name;

        @ppxfxbqfkf("value")
        private final Boolean value;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0005`\u0006*\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007`\u0006¨\u0006\b"}, d2 = {"Lspay/sdk/data/dto/response/SPaySdkConfigDto$FeatureToggleDto$Companion;", "", "()V", "toModelArray", "Ljava/util/ArrayList;", "Lspay/sdk/domain/model/response/SPaySdkConfig$FeatureToggle;", "Lkotlin/collections/ArrayList;", "Lspay/sdk/data/dto/response/SPaySdkConfigDto$FeatureToggleDto;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
                this();
            }

            public final ArrayList<SPaySdkConfig.FeatureToggle> toModelArray(ArrayList<FeatureToggleDto> arrayList) {
                zdlpuopuiu.btonecajqb(arrayList, "<this>");
                ArrayList<SPaySdkConfig.FeatureToggle> arrayList2 = new ArrayList<>();
                Iterator<FeatureToggleDto> it = arrayList.iterator();
                while (it.hasNext()) {
                    FeatureToggleDto next = it.next();
                    arrayList2.add(next != null ? next.toModel() : null);
                }
                return arrayList2;
            }

            private Companion() {
            }
        }

        public FeatureToggleDto(String str, Boolean bool) {
            this.name = str;
            this.value = bool;
        }

        public static /* synthetic */ FeatureToggleDto copy$default(FeatureToggleDto featureToggleDto, String str, Boolean bool, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = featureToggleDto.name;
            }
            if ((i13 & 2) != 0) {
                bool = featureToggleDto.value;
            }
            return featureToggleDto.copy(str, bool);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getValue() {
            return this.value;
        }

        public final FeatureToggleDto copy(String name, Boolean value) {
            return new FeatureToggleDto(name, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeatureToggleDto)) {
                return false;
            }
            FeatureToggleDto featureToggleDto = (FeatureToggleDto) other;
            return zdlpuopuiu.eablkybsjg(this.name, featureToggleDto.name) && zdlpuopuiu.eablkybsjg(this.value, featureToggleDto.value);
        }

        public final String getName() {
            return this.name;
        }

        public final Boolean getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.value;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "FeatureToggleDto(name=" + this.name + ", value=" + this.value + ")";
        }

        @Override // spay.sdk.data.dto.response.DataDtoInterface
        public SPaySdkConfig.FeatureToggle toModel() {
            String str = this.name;
            if (str == null) {
                throw new pd(ExternalMetricsManagerImpl.NAME);
            }
            Boolean bool = this.value;
            if (bool != null) {
                return new SPaySdkConfig.FeatureToggle(str, bool.booleanValue());
            }
            throw new pd("value");
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lspay/sdk/data/dto/response/SPaySdkConfigDto$ImagesDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/SPaySdkConfig$Images;", "logoIcon", "", "(Ljava/lang/String;)V", "getLogoIcon", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ImagesDto implements DataDtoInterface<SPaySdkConfig.Images> {

        @ppxfxbqfkf("logoIcon")
        private final String logoIcon;

        public ImagesDto(String str) {
            this.logoIcon = str;
        }

        public static /* synthetic */ ImagesDto copy$default(ImagesDto imagesDto, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = imagesDto.logoIcon;
            }
            return imagesDto.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLogoIcon() {
            return this.logoIcon;
        }

        public final ImagesDto copy(String logoIcon) {
            return new ImagesDto(logoIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ImagesDto) && zdlpuopuiu.eablkybsjg(this.logoIcon, ((ImagesDto) other).logoIcon);
        }

        public final String getLogoIcon() {
            return this.logoIcon;
        }

        public int hashCode() {
            String str = this.logoIcon;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "ImagesDto(logoIcon=" + this.logoIcon + ")";
        }

        @Override // spay.sdk.data.dto.response.DataDtoInterface
        public SPaySdkConfig.Images toModel() {
            String str = this.logoIcon;
            if (str != null) {
                return new SPaySdkConfig.Images(str);
            }
            throw new pd("logoIcon");
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003Ju\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\b\u0010(\u001a\u00020\u0002H\u0016J\t\u0010)\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006*"}, d2 = {"Lspay/sdk/data/dto/response/SPaySdkConfigDto$LocalizationDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/SPaySdkConfig$Localization;", "bankApp", "", "bankAppLoading", "payLoading", "payError", "enableSPay", "successEnableSPay", "userProfileInfo", "noPaymentsAccount", "payBindingErrorDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankApp", "()Ljava/lang/String;", "getBankAppLoading", "getEnableSPay", "getNoPaymentsAccount", "getPayBindingErrorDescription", "getPayError", "getPayLoading", "getSuccessEnableSPay", "getUserProfileInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LocalizationDto implements DataDtoInterface<SPaySdkConfig.Localization> {

        @ppxfxbqfkf("bankApp")
        private final String bankApp;

        @ppxfxbqfkf("bankAppLoading")
        private final String bankAppLoading;

        @ppxfxbqfkf("enableSPay")
        private final String enableSPay;

        @ppxfxbqfkf("noPaymentsAccountsSubtitle")
        private final String noPaymentsAccount;

        @ppxfxbqfkf("payBindingErrorDescription")
        private final String payBindingErrorDescription;

        @ppxfxbqfkf("payError")
        private final String payError;

        @ppxfxbqfkf("payLoading")
        private final String payLoading;

        @ppxfxbqfkf("successEnableSPay")
        private final String successEnableSPay;

        @ppxfxbqfkf("userProfileInfo")
        private final String userProfileInfo;

        public LocalizationDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.bankApp = str;
            this.bankAppLoading = str2;
            this.payLoading = str3;
            this.payError = str4;
            this.enableSPay = str5;
            this.successEnableSPay = str6;
            this.userProfileInfo = str7;
            this.noPaymentsAccount = str8;
            this.payBindingErrorDescription = str9;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBankApp() {
            return this.bankApp;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBankAppLoading() {
            return this.bankAppLoading;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPayLoading() {
            return this.payLoading;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPayError() {
            return this.payError;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getEnableSPay() {
            return this.enableSPay;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getSuccessEnableSPay() {
            return this.successEnableSPay;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getUserProfileInfo() {
            return this.userProfileInfo;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getNoPaymentsAccount() {
            return this.noPaymentsAccount;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getPayBindingErrorDescription() {
            return this.payBindingErrorDescription;
        }

        public final LocalizationDto copy(String bankApp, String bankAppLoading, String payLoading, String payError, String enableSPay, String successEnableSPay, String userProfileInfo, String noPaymentsAccount, String payBindingErrorDescription) {
            return new LocalizationDto(bankApp, bankAppLoading, payLoading, payError, enableSPay, successEnableSPay, userProfileInfo, noPaymentsAccount, payBindingErrorDescription);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocalizationDto)) {
                return false;
            }
            LocalizationDto localizationDto = (LocalizationDto) other;
            return zdlpuopuiu.eablkybsjg(this.bankApp, localizationDto.bankApp) && zdlpuopuiu.eablkybsjg(this.bankAppLoading, localizationDto.bankAppLoading) && zdlpuopuiu.eablkybsjg(this.payLoading, localizationDto.payLoading) && zdlpuopuiu.eablkybsjg(this.payError, localizationDto.payError) && zdlpuopuiu.eablkybsjg(this.enableSPay, localizationDto.enableSPay) && zdlpuopuiu.eablkybsjg(this.successEnableSPay, localizationDto.successEnableSPay) && zdlpuopuiu.eablkybsjg(this.userProfileInfo, localizationDto.userProfileInfo) && zdlpuopuiu.eablkybsjg(this.noPaymentsAccount, localizationDto.noPaymentsAccount) && zdlpuopuiu.eablkybsjg(this.payBindingErrorDescription, localizationDto.payBindingErrorDescription);
        }

        public final String getBankApp() {
            return this.bankApp;
        }

        public final String getBankAppLoading() {
            return this.bankAppLoading;
        }

        public final String getEnableSPay() {
            return this.enableSPay;
        }

        public final String getNoPaymentsAccount() {
            return this.noPaymentsAccount;
        }

        public final String getPayBindingErrorDescription() {
            return this.payBindingErrorDescription;
        }

        public final String getPayError() {
            return this.payError;
        }

        public final String getPayLoading() {
            return this.payLoading;
        }

        public final String getSuccessEnableSPay() {
            return this.successEnableSPay;
        }

        public final String getUserProfileInfo() {
            return this.userProfileInfo;
        }

        public int hashCode() {
            String str = this.bankApp;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bankAppLoading;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.payLoading;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.payError;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.enableSPay;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.successEnableSPay;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.userProfileInfo;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.noPaymentsAccount;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.payBindingErrorDescription;
            return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        }

        public String toString() {
            return "LocalizationDto(bankApp=" + this.bankApp + ", bankAppLoading=" + this.bankAppLoading + ", payLoading=" + this.payLoading + ", payError=" + this.payError + ", enableSPay=" + this.enableSPay + ", successEnableSPay=" + this.successEnableSPay + ", userProfileInfo=" + this.userProfileInfo + ", noPaymentsAccount=" + this.noPaymentsAccount + ", payBindingErrorDescription=" + this.payBindingErrorDescription + ")";
        }

        @Override // spay.sdk.data.dto.response.DataDtoInterface
        public SPaySdkConfig.Localization toModel() {
            String str = this.bankApp;
            if (str == null) {
                throw new pd("bankApp");
            }
            String str2 = this.bankAppLoading;
            if (str2 == null) {
                throw new pd("bankAppLoading");
            }
            String str3 = this.payLoading;
            if (str3 == null) {
                throw new pd("payLoading");
            }
            String str4 = this.payError;
            if (str4 == null) {
                throw new pd("payError");
            }
            String str5 = this.enableSPay;
            if (str5 == null) {
                throw new pd("enableSPay");
            }
            String str6 = this.successEnableSPay;
            if (str6 == null) {
                throw new pd("successEnableSPay");
            }
            String str7 = this.userProfileInfo;
            String str8 = str7 == null ? "" : str7;
            String str9 = this.noPaymentsAccount;
            String str10 = str9 == null ? "" : str9;
            String str11 = this.payBindingErrorDescription;
            return new SPaySdkConfig.Localization(str, str2, str3, str4, str5, str6, str8, str10, str11 == null ? "" : str11);
        }

        public /* synthetic */ LocalizationDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i13, gtknphoqwx gtknphoqwxVar) {
            this(str, str2, str3, str4, str5, str6, str7, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str8, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : str9);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\b\u0010\"\u001a\u00020\u0002H\u0016J\t\u0010#\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006%"}, d2 = {"Lspay/sdk/data/dto/response/SPaySdkConfigDto$SchemaDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/SPaySdkConfig$Schema;", ExternalMetricsManagerImpl.NAME, "", "bankAppAuthUri", "dynatraceBeaconUri", "dynatraceApplicationId", "getIpServiceUrl", "clickStreamUrl", "clickStreamAppId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankAppAuthUri", "()Ljava/lang/String;", "getClickStreamAppId", "getClickStreamUrl", "getDynatraceApplicationId", "getDynatraceBeaconUri", "getGetIpServiceUrl", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "Companion", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SchemaDto implements DataDtoInterface<SPaySdkConfig.Schema> {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @ppxfxbqfkf("baau")
        private final String bankAppAuthUri;

        @ppxfxbqfkf("clsai")
        private final String clickStreamAppId;

        @ppxfxbqfkf("clsu")
        private final String clickStreamUrl;

        @ppxfxbqfkf("dtaid")
        private final String dynatraceApplicationId;

        @ppxfxbqfkf("dtbu")
        private final String dynatraceBeaconUri;

        @ppxfxbqfkf("giu")
        private final String getIpServiceUrl;

        @ppxfxbqfkf(ExternalMetricsManagerImpl.NAME)
        private final String name;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0005`\u0006*\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007`\u0006¨\u0006\b"}, d2 = {"Lspay/sdk/data/dto/response/SPaySdkConfigDto$SchemaDto$Companion;", "", "()V", "toModelArray", "Ljava/util/ArrayList;", "Lspay/sdk/domain/model/response/SPaySdkConfig$Schema;", "Lkotlin/collections/ArrayList;", "Lspay/sdk/data/dto/response/SPaySdkConfigDto$SchemaDto;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
                this();
            }

            public final ArrayList<SPaySdkConfig.Schema> toModelArray(ArrayList<SchemaDto> arrayList) {
                zdlpuopuiu.btonecajqb(arrayList, "<this>");
                ArrayList<SPaySdkConfig.Schema> arrayList2 = new ArrayList<>();
                Iterator<SchemaDto> it = arrayList.iterator();
                while (it.hasNext()) {
                    SchemaDto next = it.next();
                    arrayList2.add(next != null ? next.toModel() : null);
                }
                return arrayList2;
            }

            private Companion() {
            }
        }

        public SchemaDto(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.name = str;
            this.bankAppAuthUri = str2;
            this.dynatraceBeaconUri = str3;
            this.dynatraceApplicationId = str4;
            this.getIpServiceUrl = str5;
            this.clickStreamUrl = str6;
            this.clickStreamAppId = str7;
        }

        public static /* synthetic */ SchemaDto copy$default(SchemaDto schemaDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = schemaDto.name;
            }
            if ((i13 & 2) != 0) {
                str2 = schemaDto.bankAppAuthUri;
            }
            String str8 = str2;
            if ((i13 & 4) != 0) {
                str3 = schemaDto.dynatraceBeaconUri;
            }
            String str9 = str3;
            if ((i13 & 8) != 0) {
                str4 = schemaDto.dynatraceApplicationId;
            }
            String str10 = str4;
            if ((i13 & 16) != 0) {
                str5 = schemaDto.getIpServiceUrl;
            }
            String str11 = str5;
            if ((i13 & 32) != 0) {
                str6 = schemaDto.clickStreamUrl;
            }
            String str12 = str6;
            if ((i13 & 64) != 0) {
                str7 = schemaDto.clickStreamAppId;
            }
            return schemaDto.copy(str, str8, str9, str10, str11, str12, str7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBankAppAuthUri() {
            return this.bankAppAuthUri;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDynatraceBeaconUri() {
            return this.dynatraceBeaconUri;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getDynatraceApplicationId() {
            return this.dynatraceApplicationId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getGetIpServiceUrl() {
            return this.getIpServiceUrl;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getClickStreamUrl() {
            return this.clickStreamUrl;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getClickStreamAppId() {
            return this.clickStreamAppId;
        }

        public final SchemaDto copy(String name, String bankAppAuthUri, String dynatraceBeaconUri, String dynatraceApplicationId, String getIpServiceUrl, String clickStreamUrl, String clickStreamAppId) {
            return new SchemaDto(name, bankAppAuthUri, dynatraceBeaconUri, dynatraceApplicationId, getIpServiceUrl, clickStreamUrl, clickStreamAppId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SchemaDto)) {
                return false;
            }
            SchemaDto schemaDto = (SchemaDto) other;
            return zdlpuopuiu.eablkybsjg(this.name, schemaDto.name) && zdlpuopuiu.eablkybsjg(this.bankAppAuthUri, schemaDto.bankAppAuthUri) && zdlpuopuiu.eablkybsjg(this.dynatraceBeaconUri, schemaDto.dynatraceBeaconUri) && zdlpuopuiu.eablkybsjg(this.dynatraceApplicationId, schemaDto.dynatraceApplicationId) && zdlpuopuiu.eablkybsjg(this.getIpServiceUrl, schemaDto.getIpServiceUrl) && zdlpuopuiu.eablkybsjg(this.clickStreamUrl, schemaDto.clickStreamUrl) && zdlpuopuiu.eablkybsjg(this.clickStreamAppId, schemaDto.clickStreamAppId);
        }

        public final String getBankAppAuthUri() {
            return this.bankAppAuthUri;
        }

        public final String getClickStreamAppId() {
            return this.clickStreamAppId;
        }

        public final String getClickStreamUrl() {
            return this.clickStreamUrl;
        }

        public final String getDynatraceApplicationId() {
            return this.dynatraceApplicationId;
        }

        public final String getDynatraceBeaconUri() {
            return this.dynatraceBeaconUri;
        }

        public final String getGetIpServiceUrl() {
            return this.getIpServiceUrl;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bankAppAuthUri;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.dynatraceBeaconUri;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.dynatraceApplicationId;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.getIpServiceUrl;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.clickStreamUrl;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.clickStreamAppId;
            return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        public String toString() {
            return "SchemaDto(name=" + this.name + ", bankAppAuthUri=" + this.bankAppAuthUri + ", dynatraceBeaconUri=" + this.dynatraceBeaconUri + ", dynatraceApplicationId=" + this.dynatraceApplicationId + ", getIpServiceUrl=" + this.getIpServiceUrl + ", clickStreamUrl=" + this.clickStreamUrl + ", clickStreamAppId=" + this.clickStreamAppId + ")";
        }

        @Override // spay.sdk.data.dto.response.DataDtoInterface
        public SPaySdkConfig.Schema toModel() {
            String str = this.name;
            if (str == null) {
                throw new pd(ExternalMetricsManagerImpl.NAME);
            }
            String str2 = this.bankAppAuthUri;
            if (str2 == null) {
                throw new pd("bankAppAuthUri");
            }
            String str3 = this.dynatraceBeaconUri;
            if (str3 == null) {
                throw new pd("dynatraceBeaconUri");
            }
            String str4 = this.dynatraceApplicationId;
            if (str4 == null) {
                throw new pd("dynatraceApplicationId");
            }
            String str5 = this.getIpServiceUrl;
            if (str5 != null) {
                return new SPaySdkConfig.Schema(str, str2, str3, str4, str5, this.clickStreamUrl, this.clickStreamAppId);
            }
            throw new pd("getIpServiceUrl");
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0013\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lspay/sdk/data/dto/response/SPaySdkConfigDto$VersionInfoDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/SPaySdkConfig$VersionInfo;", "active", "", "deprecated", "", "(Ljava/lang/String;Ljava/util/List;)V", "getActive", "()Ljava/lang/String;", "getDeprecated", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class VersionInfoDto implements DataDtoInterface<SPaySdkConfig.VersionInfo> {

        @ppxfxbqfkf("active")
        private final String active;

        @ppxfxbqfkf("deprecated")
        private final List<String> deprecated;

        public VersionInfoDto(String str, List<String> list) {
            this.active = str;
            this.deprecated = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VersionInfoDto copy$default(VersionInfoDto versionInfoDto, String str, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = versionInfoDto.active;
            }
            if ((i13 & 2) != 0) {
                list = versionInfoDto.deprecated;
            }
            return versionInfoDto.copy(str, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getActive() {
            return this.active;
        }

        public final List<String> component2() {
            return this.deprecated;
        }

        public final VersionInfoDto copy(String active, List<String> deprecated) {
            return new VersionInfoDto(active, deprecated);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VersionInfoDto)) {
                return false;
            }
            VersionInfoDto versionInfoDto = (VersionInfoDto) other;
            return zdlpuopuiu.eablkybsjg(this.active, versionInfoDto.active) && zdlpuopuiu.eablkybsjg(this.deprecated, versionInfoDto.deprecated);
        }

        public final String getActive() {
            return this.active;
        }

        public final List<String> getDeprecated() {
            return this.deprecated;
        }

        public int hashCode() {
            String str = this.active;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.deprecated;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "VersionInfoDto(active=" + this.active + ", deprecated=" + this.deprecated + ")";
        }

        @Override // spay.sdk.data.dto.response.DataDtoInterface
        public SPaySdkConfig.VersionInfo toModel() {
            List listWflxmlrfwp;
            String str = this.active;
            if (str == null) {
                str = "";
            }
            List<String> list = this.deprecated;
            if (list == null || (listWflxmlrfwp = jyumaefscl.zfvoamnweg(list)) == null) {
                listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
            }
            return new SPaySdkConfig.VersionInfo(str, listWflxmlrfwp);
        }
    }

    public SPaySdkConfigDto(String str, LocalizationDto localizationDto, ArrayList<SchemaDto> arrayList, ArrayList<FeatureToggleDto> arrayList2, ImagesDto imagesDto, VersionInfoDto versionInfoDto, ArrayList<String> arrayList3) {
        this.version = str;
        this.localization = localizationDto;
        this.schemas = arrayList;
        this.featuresToggle = arrayList2;
        this.images = imagesDto;
        this.versionInfoDto = versionInfoDto;
        this.sslPins = arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SPaySdkConfigDto copy$default(SPaySdkConfigDto sPaySdkConfigDto, String str, LocalizationDto localizationDto, ArrayList arrayList, ArrayList arrayList2, ImagesDto imagesDto, VersionInfoDto versionInfoDto, ArrayList arrayList3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sPaySdkConfigDto.version;
        }
        if ((i13 & 2) != 0) {
            localizationDto = sPaySdkConfigDto.localization;
        }
        LocalizationDto localizationDto2 = localizationDto;
        if ((i13 & 4) != 0) {
            arrayList = sPaySdkConfigDto.schemas;
        }
        ArrayList arrayList4 = arrayList;
        if ((i13 & 8) != 0) {
            arrayList2 = sPaySdkConfigDto.featuresToggle;
        }
        ArrayList arrayList5 = arrayList2;
        if ((i13 & 16) != 0) {
            imagesDto = sPaySdkConfigDto.images;
        }
        ImagesDto imagesDto2 = imagesDto;
        if ((i13 & 32) != 0) {
            versionInfoDto = sPaySdkConfigDto.versionInfoDto;
        }
        VersionInfoDto versionInfoDto2 = versionInfoDto;
        if ((i13 & 64) != 0) {
            arrayList3 = sPaySdkConfigDto.sslPins;
        }
        return sPaySdkConfigDto.copy(str, localizationDto2, arrayList4, arrayList5, imagesDto2, versionInfoDto2, arrayList3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LocalizationDto getLocalization() {
        return this.localization;
    }

    public final ArrayList<SchemaDto> component3() {
        return this.schemas;
    }

    public final ArrayList<FeatureToggleDto> component4() {
        return this.featuresToggle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ImagesDto getImages() {
        return this.images;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final VersionInfoDto getVersionInfoDto() {
        return this.versionInfoDto;
    }

    public final ArrayList<String> component7() {
        return this.sslPins;
    }

    public final SPaySdkConfigDto copy(String version, LocalizationDto localization, ArrayList<SchemaDto> schemas, ArrayList<FeatureToggleDto> featuresToggle, ImagesDto images, VersionInfoDto versionInfoDto, ArrayList<String> sslPins) {
        return new SPaySdkConfigDto(version, localization, schemas, featuresToggle, images, versionInfoDto, sslPins);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SPaySdkConfigDto)) {
            return false;
        }
        SPaySdkConfigDto sPaySdkConfigDto = (SPaySdkConfigDto) other;
        return zdlpuopuiu.eablkybsjg(this.version, sPaySdkConfigDto.version) && zdlpuopuiu.eablkybsjg(this.localization, sPaySdkConfigDto.localization) && zdlpuopuiu.eablkybsjg(this.schemas, sPaySdkConfigDto.schemas) && zdlpuopuiu.eablkybsjg(this.featuresToggle, sPaySdkConfigDto.featuresToggle) && zdlpuopuiu.eablkybsjg(this.images, sPaySdkConfigDto.images) && zdlpuopuiu.eablkybsjg(this.versionInfoDto, sPaySdkConfigDto.versionInfoDto) && zdlpuopuiu.eablkybsjg(this.sslPins, sPaySdkConfigDto.sslPins);
    }

    public final ArrayList<FeatureToggleDto> getFeaturesToggle() {
        return this.featuresToggle;
    }

    public final ImagesDto getImages() {
        return this.images;
    }

    public final LocalizationDto getLocalization() {
        return this.localization;
    }

    public final ArrayList<SchemaDto> getSchemas() {
        return this.schemas;
    }

    public final ArrayList<String> getSslPins() {
        return this.sslPins;
    }

    public final String getVersion() {
        return this.version;
    }

    public final VersionInfoDto getVersionInfoDto() {
        return this.versionInfoDto;
    }

    public int hashCode() {
        String str = this.version;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LocalizationDto localizationDto = this.localization;
        int iHashCode2 = (iHashCode + (localizationDto == null ? 0 : localizationDto.hashCode())) * 31;
        ArrayList<SchemaDto> arrayList = this.schemas;
        int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<FeatureToggleDto> arrayList2 = this.featuresToggle;
        int iHashCode4 = (iHashCode3 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ImagesDto imagesDto = this.images;
        int iHashCode5 = (iHashCode4 + (imagesDto == null ? 0 : imagesDto.hashCode())) * 31;
        VersionInfoDto versionInfoDto = this.versionInfoDto;
        int iHashCode6 = (iHashCode5 + (versionInfoDto == null ? 0 : versionInfoDto.hashCode())) * 31;
        ArrayList<String> arrayList3 = this.sslPins;
        return iHashCode6 + (arrayList3 != null ? arrayList3.hashCode() : 0);
    }

    public String toString() {
        return "SPaySdkConfigDto(version=" + this.version + ", localization=" + this.localization + ", schemas=" + this.schemas + ", featuresToggle=" + this.featuresToggle + ", images=" + this.images + ", versionInfoDto=" + this.versionInfoDto + ", sslPins=" + this.sslPins + ")";
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    public SPaySdkConfig toModel() {
        SPaySdkConfig.Localization model;
        ArrayList<SPaySdkConfig.Schema> modelArray;
        ArrayList<SPaySdkConfig.FeatureToggle> modelArray2;
        SPaySdkConfig.Images model2;
        String str = this.version;
        if (str == null) {
            throw new pd("version");
        }
        LocalizationDto localizationDto = this.localization;
        if (localizationDto == null || (model = localizationDto.toModel()) == null) {
            throw new pd("localization");
        }
        ArrayList<SchemaDto> arrayList = this.schemas;
        if (arrayList == null || (modelArray = SchemaDto.INSTANCE.toModelArray(arrayList)) == null) {
            throw new pd("schemas");
        }
        ArrayList<FeatureToggleDto> arrayList2 = this.featuresToggle;
        if (arrayList2 == null || (modelArray2 = FeatureToggleDto.INSTANCE.toModelArray(arrayList2)) == null) {
            throw new pd("featuresToggle");
        }
        ImagesDto imagesDto = this.images;
        if (imagesDto == null || (model2 = imagesDto.toModel()) == null) {
            throw new pd("images");
        }
        VersionInfoDto versionInfoDto = this.versionInfoDto;
        return new SPaySdkConfig(str, model, modelArray, modelArray2, versionInfoDto != null ? versionInfoDto.toModel() : null, model2, this.sslPins);
    }
}
