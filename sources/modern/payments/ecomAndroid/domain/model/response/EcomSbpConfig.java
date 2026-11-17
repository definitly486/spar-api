package modern.payments.ecomAndroid.domain.model.response;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.extension.NumeralExtensionsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig;", "", "dictionary", "", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;", "version", "", "(Ljava/util/List;Ljava/lang/String;)V", "getDictionary", "()Ljava/util/List;", "getVersion", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "SbpBankInfo", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class EcomSbpConfig {
    private final List<SbpBankInfo> dictionary;
    private final String version;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0000H\u0096\u0002J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003Jx\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\fHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\b\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006/"}, d2 = {"Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;", "", "bankName", "", "logoURL", "schema", "packageName", "webClientUrl", "isWebClientActive", "", "showMain", "position", "", "wordList", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;)V", "getBankName", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLogoURL", "getPackageName", "getPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSchema", "getShowMain", "getWebClientUrl", "getWordList", "()Ljava/util/List;", "compareTo", "other", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;)Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;", "equals", "", "hashCode", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SbpBankInfo implements Comparable<SbpBankInfo> {
        private final String bankName;
        private final Boolean isWebClientActive;
        private final String logoURL;
        private final String packageName;
        private final Integer position;
        private final String schema;
        private final Boolean showMain;
        private final String webClientUrl;
        private final List<String> wordList;

        public SbpBankInfo(String bankName, String logoURL, String schema, String str, String str2, Boolean bool, Boolean bool2, Integer num, List<String> wordList) {
            zdlpuopuiu.btonecajqb(bankName, "bankName");
            zdlpuopuiu.btonecajqb(logoURL, "logoURL");
            zdlpuopuiu.btonecajqb(schema, "schema");
            zdlpuopuiu.btonecajqb(wordList, "wordList");
            this.bankName = bankName;
            this.logoURL = logoURL;
            this.schema = schema;
            this.packageName = str;
            this.webClientUrl = str2;
            this.isWebClientActive = bool;
            this.showMain = bool2;
            this.position = num;
            this.wordList = wordList;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBankName() {
            return this.bankName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLogoURL() {
            return this.logoURL;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSchema() {
            return this.schema;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPackageName() {
            return this.packageName;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getWebClientUrl() {
            return this.webClientUrl;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Boolean getIsWebClientActive() {
            return this.isWebClientActive;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Boolean getShowMain() {
            return this.showMain;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Integer getPosition() {
            return this.position;
        }

        public final List<String> component9() {
            return this.wordList;
        }

        public final SbpBankInfo copy(String bankName, String logoURL, String schema, String packageName, String webClientUrl, Boolean isWebClientActive, Boolean showMain, Integer position, List<String> wordList) {
            zdlpuopuiu.btonecajqb(bankName, "bankName");
            zdlpuopuiu.btonecajqb(logoURL, "logoURL");
            zdlpuopuiu.btonecajqb(schema, "schema");
            zdlpuopuiu.btonecajqb(wordList, "wordList");
            return new SbpBankInfo(bankName, logoURL, schema, packageName, webClientUrl, isWebClientActive, showMain, position, wordList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SbpBankInfo)) {
                return false;
            }
            SbpBankInfo sbpBankInfo = (SbpBankInfo) other;
            return zdlpuopuiu.eablkybsjg(this.bankName, sbpBankInfo.bankName) && zdlpuopuiu.eablkybsjg(this.logoURL, sbpBankInfo.logoURL) && zdlpuopuiu.eablkybsjg(this.schema, sbpBankInfo.schema) && zdlpuopuiu.eablkybsjg(this.packageName, sbpBankInfo.packageName) && zdlpuopuiu.eablkybsjg(this.webClientUrl, sbpBankInfo.webClientUrl) && zdlpuopuiu.eablkybsjg(this.isWebClientActive, sbpBankInfo.isWebClientActive) && zdlpuopuiu.eablkybsjg(this.showMain, sbpBankInfo.showMain) && zdlpuopuiu.eablkybsjg(this.position, sbpBankInfo.position) && zdlpuopuiu.eablkybsjg(this.wordList, sbpBankInfo.wordList);
        }

        public final String getBankName() {
            return this.bankName;
        }

        public final String getLogoURL() {
            return this.logoURL;
        }

        public final String getPackageName() {
            return this.packageName;
        }

        public final Integer getPosition() {
            return this.position;
        }

        public final String getSchema() {
            return this.schema;
        }

        public final Boolean getShowMain() {
            return this.showMain;
        }

        public final String getWebClientUrl() {
            return this.webClientUrl;
        }

        public final List<String> getWordList() {
            return this.wordList;
        }

        public int hashCode() {
            int iHashCode = ((((this.bankName.hashCode() * 31) + this.logoURL.hashCode()) * 31) + this.schema.hashCode()) * 31;
            String str = this.packageName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.webClientUrl;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.isWebClientActive;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.showMain;
            int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Integer num = this.position;
            return ((iHashCode5 + (num != null ? num.hashCode() : 0)) * 31) + this.wordList.hashCode();
        }

        public final Boolean isWebClientActive() {
            return this.isWebClientActive;
        }

        public String toString() {
            return "SbpBankInfo(bankName=" + this.bankName + ", logoURL=" + this.logoURL + ", schema=" + this.schema + ", packageName=" + this.packageName + ", webClientUrl=" + this.webClientUrl + ", isWebClientActive=" + this.isWebClientActive + ", showMain=" + this.showMain + ", position=" + this.position + ", wordList=" + this.wordList + ')';
        }

        @Override // java.lang.Comparable
        public int compareTo(SbpBankInfo other) {
            zdlpuopuiu.btonecajqb(other, "other");
            Boolean bool = this.showMain;
            Boolean bool2 = Boolean.TRUE;
            if (zdlpuopuiu.eablkybsjg(bool, bool2) && zdlpuopuiu.eablkybsjg(other.showMain, bool2)) {
                if (NumeralExtensionsKt.orDefault(this.position, Integer.MAX_VALUE) >= NumeralExtensionsKt.orDefault(other.position, Integer.MAX_VALUE)) {
                    if (NumeralExtensionsKt.orDefault(this.position, Integer.MAX_VALUE) > NumeralExtensionsKt.orDefault(other.position, Integer.MAX_VALUE)) {
                        return 1;
                    }
                    return this.bankName.compareTo(other.bankName);
                }
            } else if (!zdlpuopuiu.eablkybsjg(this.showMain, bool2) || zdlpuopuiu.eablkybsjg(other.showMain, bool2)) {
                if (!zdlpuopuiu.eablkybsjg(this.showMain, bool2) && zdlpuopuiu.eablkybsjg(other.showMain, bool2)) {
                    return 1;
                }
                String str = this.bankName;
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                zdlpuopuiu.dxjokdxxww(lowerCase, "toLowerCase(...)");
                String lowerCase2 = other.bankName.toLowerCase(locale);
                zdlpuopuiu.dxjokdxxww(lowerCase2, "toLowerCase(...)");
                return lowerCase.compareTo(lowerCase2);
            }
            return -1;
        }

        public /* synthetic */ SbpBankInfo(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Integer num, List list, int i13, gtknphoqwx gtknphoqwxVar) {
            this(str, str2, str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : bool, (i13 & 64) != 0 ? null : bool2, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : num, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? jyumaefscl.wflxmlrfwp() : list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EcomSbpConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EcomSbpConfig copy$default(EcomSbpConfig ecomSbpConfig, List list, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = ecomSbpConfig.dictionary;
        }
        if ((i13 & 2) != 0) {
            str = ecomSbpConfig.version;
        }
        return ecomSbpConfig.copy(list, str);
    }

    public final List<SbpBankInfo> component1() {
        return this.dictionary;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final EcomSbpConfig copy(List<SbpBankInfo> dictionary, String version) {
        zdlpuopuiu.btonecajqb(dictionary, "dictionary");
        zdlpuopuiu.btonecajqb(version, "version");
        return new EcomSbpConfig(dictionary, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcomSbpConfig)) {
            return false;
        }
        EcomSbpConfig ecomSbpConfig = (EcomSbpConfig) other;
        return zdlpuopuiu.eablkybsjg(this.dictionary, ecomSbpConfig.dictionary) && zdlpuopuiu.eablkybsjg(this.version, ecomSbpConfig.version);
    }

    public final List<SbpBankInfo> getDictionary() {
        return this.dictionary;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.dictionary.hashCode() * 31) + this.version.hashCode();
    }

    public String toString() {
        return "EcomSbpConfig(dictionary=" + this.dictionary + ", version=" + this.version + ')';
    }

    public EcomSbpConfig(List<SbpBankInfo> dictionary, String version) {
        zdlpuopuiu.btonecajqb(dictionary, "dictionary");
        zdlpuopuiu.btonecajqb(version, "version");
        this.dictionary = dictionary;
        this.version = version;
    }

    public /* synthetic */ EcomSbpConfig(List list, String str, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 2) != 0 ? "1.0" : str);
    }
}
