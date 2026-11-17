package modern.payments.ecomAndroid.data.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.data.dto.base.DataDtoInterface;
import modern.payments.ecomAndroid.domain.model.response.EcomSbpConfig;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001'B!\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0010¨\u0006("}, d2 = {"Lmodern/payments/ecomAndroid/data/dto/EcomSbpConfigDto;", "Lmodern/payments/ecomAndroid/data/dto/base/DataDtoInterface;", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig;", "Landroid/os/Parcelable;", "", "Lmodern/payments/ecomAndroid/data/dto/EcomSbpConfigDto$BankSbpDto;", "dictionary", "", "version", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toModel", "()Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig;", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lmodern/payments/ecomAndroid/data/dto/EcomSbpConfigDto;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getDictionary", "Ljava/lang/String;", "getVersion", "BankSbpDto", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class EcomSbpConfigDto implements DataDtoInterface<EcomSbpConfig>, Parcelable {
    public static final Parcelable.Creator<EcomSbpConfigDto> CREATOR = new Creator();
    private final List<BankSbpDto> dictionary;
    private final String version;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B[\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJj\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u0010\u0010!\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010\"J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b0\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b1\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b2\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b3\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b\u000b\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u0010\u001d¨\u00068"}, d2 = {"Lmodern/payments/ecomAndroid/data/dto/EcomSbpConfigDto$BankSbpDto;", "Lmodern/payments/ecomAndroid/data/dto/base/DataDtoInterface;", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;", "Landroid/os/Parcelable;", "", "bankName", "logoURL", "schema", "packageName", "webClientUrl", "", "isWebClientActive", "showMain", "", "position", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "toModel", "()Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lmodern/payments/ecomAndroid/data/dto/EcomSbpConfigDto$BankSbpDto;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBankName", "getLogoURL", "getSchema", "getPackageName", "getWebClientUrl", "Ljava/lang/Boolean;", "getShowMain", "Ljava/lang/Integer;", "getPosition", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BankSbpDto implements DataDtoInterface<EcomSbpConfig.SbpBankInfo>, Parcelable {
        public static final Parcelable.Creator<BankSbpDto> CREATOR = new Creator();
        private final String bankName;
        private final Boolean isWebClientActive;
        private final String logoURL;

        @ppxfxbqfkf("package_name")
        private final String packageName;
        private final Integer position;
        private final String schema;

        @ppxfxbqfkf("show_main")
        private final Boolean showMain;
        private final String webClientUrl;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BankSbpDto> {
            @Override // android.os.Parcelable.Creator
            public final BankSbpDto createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new BankSbpDto(string, string2, string3, string4, string5, boolValueOf, boolValueOf2, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final BankSbpDto[] newArray(int i13) {
                return new BankSbpDto[i13];
            }
        }

        public BankSbpDto(String bankName, String logoURL, String schema, String str, String str2, Boolean bool, Boolean bool2, Integer num) {
            zdlpuopuiu.btonecajqb(bankName, "bankName");
            zdlpuopuiu.btonecajqb(logoURL, "logoURL");
            zdlpuopuiu.btonecajqb(schema, "schema");
            this.bankName = bankName;
            this.logoURL = logoURL;
            this.schema = schema;
            this.packageName = str;
            this.webClientUrl = str2;
            this.isWebClientActive = bool;
            this.showMain = bool2;
            this.position = num;
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

        public final BankSbpDto copy(String bankName, String logoURL, String schema, String packageName, String webClientUrl, Boolean isWebClientActive, Boolean showMain, Integer position) {
            zdlpuopuiu.btonecajqb(bankName, "bankName");
            zdlpuopuiu.btonecajqb(logoURL, "logoURL");
            zdlpuopuiu.btonecajqb(schema, "schema");
            return new BankSbpDto(bankName, logoURL, schema, packageName, webClientUrl, isWebClientActive, showMain, position);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BankSbpDto)) {
                return false;
            }
            BankSbpDto bankSbpDto = (BankSbpDto) other;
            return zdlpuopuiu.eablkybsjg(this.bankName, bankSbpDto.bankName) && zdlpuopuiu.eablkybsjg(this.logoURL, bankSbpDto.logoURL) && zdlpuopuiu.eablkybsjg(this.schema, bankSbpDto.schema) && zdlpuopuiu.eablkybsjg(this.packageName, bankSbpDto.packageName) && zdlpuopuiu.eablkybsjg(this.webClientUrl, bankSbpDto.webClientUrl) && zdlpuopuiu.eablkybsjg(this.isWebClientActive, bankSbpDto.isWebClientActive) && zdlpuopuiu.eablkybsjg(this.showMain, bankSbpDto.showMain) && zdlpuopuiu.eablkybsjg(this.position, bankSbpDto.position);
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
            return iHashCode5 + (num != null ? num.hashCode() : 0);
        }

        public final Boolean isWebClientActive() {
            return this.isWebClientActive;
        }

        public String toString() {
            return "BankSbpDto(bankName=" + this.bankName + ", logoURL=" + this.logoURL + ", schema=" + this.schema + ", packageName=" + this.packageName + ", webClientUrl=" + this.webClientUrl + ", isWebClientActive=" + this.isWebClientActive + ", showMain=" + this.showMain + ", position=" + this.position + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.bankName);
            parcel.writeString(this.logoURL);
            parcel.writeString(this.schema);
            parcel.writeString(this.packageName);
            parcel.writeString(this.webClientUrl);
            Boolean bool = this.isWebClientActive;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.showMain;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            Integer num = this.position;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
        }

        @Override // modern.payments.ecomAndroid.data.dto.base.DataDtoInterface
        public EcomSbpConfig.SbpBankInfo toModel() {
            String str = this.bankName;
            return new EcomSbpConfig.SbpBankInfo(str, this.logoURL, this.schema, this.packageName, this.webClientUrl, this.isWebClientActive, this.showMain, this.position, kcexrzcfyt.ixidwrxhsl(str, new String[]{" ", "-"}, false, 0, 6, null));
        }

        public /* synthetic */ BankSbpDto(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Integer num, int i13, gtknphoqwx gtknphoqwxVar) {
            this(str, str2, str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : bool, (i13 & 64) != 0 ? null : bool2, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : num);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EcomSbpConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final EcomSbpConfigDto createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(BankSbpDto.CREATOR.createFromParcel(parcel));
            }
            return new EcomSbpConfigDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EcomSbpConfigDto[] newArray(int i13) {
            return new EcomSbpConfigDto[i13];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EcomSbpConfigDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EcomSbpConfigDto copy$default(EcomSbpConfigDto ecomSbpConfigDto, List list, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = ecomSbpConfigDto.dictionary;
        }
        if ((i13 & 2) != 0) {
            str = ecomSbpConfigDto.version;
        }
        return ecomSbpConfigDto.copy(list, str);
    }

    public final List<BankSbpDto> component1() {
        return this.dictionary;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final EcomSbpConfigDto copy(List<BankSbpDto> dictionary, String version) {
        zdlpuopuiu.btonecajqb(dictionary, "dictionary");
        zdlpuopuiu.btonecajqb(version, "version");
        return new EcomSbpConfigDto(dictionary, version);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcomSbpConfigDto)) {
            return false;
        }
        EcomSbpConfigDto ecomSbpConfigDto = (EcomSbpConfigDto) other;
        return zdlpuopuiu.eablkybsjg(this.dictionary, ecomSbpConfigDto.dictionary) && zdlpuopuiu.eablkybsjg(this.version, ecomSbpConfigDto.version);
    }

    public final List<BankSbpDto> getDictionary() {
        return this.dictionary;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.dictionary.hashCode() * 31) + this.version.hashCode();
    }

    public String toString() {
        return "EcomSbpConfigDto(dictionary=" + this.dictionary + ", version=" + this.version + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
        List<BankSbpDto> list = this.dictionary;
        parcel.writeInt(list.size());
        Iterator<BankSbpDto> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        parcel.writeString(this.version);
    }

    public EcomSbpConfigDto(List<BankSbpDto> dictionary, String version) {
        zdlpuopuiu.btonecajqb(dictionary, "dictionary");
        zdlpuopuiu.btonecajqb(version, "version");
        this.dictionary = dictionary;
        this.version = version;
    }

    @Override // modern.payments.ecomAndroid.data.dto.base.DataDtoInterface
    public EcomSbpConfig toModel() {
        List<BankSbpDto> list = this.dictionary;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((BankSbpDto) it.next()).toModel());
        }
        return new EcomSbpConfig(arrayList, this.version);
    }

    public /* synthetic */ EcomSbpConfigDto(List list, String str, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 2) != 0 ? "1.0" : str);
    }
}
