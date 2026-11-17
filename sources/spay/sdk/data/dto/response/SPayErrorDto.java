package spay.sdk.data.dto.response;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.pd;
import spay.sdk.data.dto.response.paymentToken.FraudMonCheckResultResponseBodyDto;
import spay.sdk.domain.model.response.SPayApiError;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B9\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010JL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b-\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b.\u0010\u0010¨\u0006/"}, d2 = {"Lspay/sdk/data/dto/response/SPayErrorDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/SPayApiError;", "Landroid/os/Parcelable;", "", "errorCode", "description", "Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto;", "fraudMonCheckResultResponseBodyDto", "oldFraudMonCheckResultResponseBodyDto", "info", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto;Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto;Ljava/lang/String;)V", "toModel", "()Lspay/sdk/domain/model/response/SPayApiError;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto;Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto;Ljava/lang/String;)Lspay/sdk/data/dto/response/SPayErrorDto;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getErrorCode", "getDescription", "Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto;", "getFraudMonCheckResultResponseBodyDto", "getOldFraudMonCheckResultResponseBodyDto", "getInfo", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SPayErrorDto implements DataDtoInterface<SPayApiError>, Parcelable {
    public static final Parcelable.Creator<SPayErrorDto> CREATOR = new Creator();

    @ppxfxbqfkf("description")
    private final String description;

    @ppxfxbqfkf("errorCode")
    private final String errorCode;

    @ppxfxbqfkf("fraudMonCheckResult")
    private final FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto;

    @ppxfxbqfkf("info")
    private final String info;

    @ppxfxbqfkf("fraudMonСheckResult")
    private final FraudMonCheckResultResponseBodyDto oldFraudMonCheckResultResponseBodyDto;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SPayErrorDto> {
        @Override // android.os.Parcelable.Creator
        public final SPayErrorDto createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new SPayErrorDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FraudMonCheckResultResponseBodyDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FraudMonCheckResultResponseBodyDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SPayErrorDto[] newArray(int i13) {
            return new SPayErrorDto[i13];
        }
    }

    public SPayErrorDto(String str, String str2, FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto, FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto2, String str3) {
        this.errorCode = str;
        this.description = str2;
        this.fraudMonCheckResultResponseBodyDto = fraudMonCheckResultResponseBodyDto;
        this.oldFraudMonCheckResultResponseBodyDto = fraudMonCheckResultResponseBodyDto2;
        this.info = str3;
    }

    public static /* synthetic */ SPayErrorDto copy$default(SPayErrorDto sPayErrorDto, String str, String str2, FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto, FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sPayErrorDto.errorCode;
        }
        if ((i13 & 2) != 0) {
            str2 = sPayErrorDto.description;
        }
        String str4 = str2;
        if ((i13 & 4) != 0) {
            fraudMonCheckResultResponseBodyDto = sPayErrorDto.fraudMonCheckResultResponseBodyDto;
        }
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto3 = fraudMonCheckResultResponseBodyDto;
        if ((i13 & 8) != 0) {
            fraudMonCheckResultResponseBodyDto2 = sPayErrorDto.oldFraudMonCheckResultResponseBodyDto;
        }
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto4 = fraudMonCheckResultResponseBodyDto2;
        if ((i13 & 16) != 0) {
            str3 = sPayErrorDto.info;
        }
        return sPayErrorDto.copy(str, str4, fraudMonCheckResultResponseBodyDto3, fraudMonCheckResultResponseBodyDto4, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FraudMonCheckResultResponseBodyDto getFraudMonCheckResultResponseBodyDto() {
        return this.fraudMonCheckResultResponseBodyDto;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FraudMonCheckResultResponseBodyDto getOldFraudMonCheckResultResponseBodyDto() {
        return this.oldFraudMonCheckResultResponseBodyDto;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    public final SPayErrorDto copy(String errorCode, String description, FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto, FraudMonCheckResultResponseBodyDto oldFraudMonCheckResultResponseBodyDto, String info) {
        return new SPayErrorDto(errorCode, description, fraudMonCheckResultResponseBodyDto, oldFraudMonCheckResultResponseBodyDto, info);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SPayErrorDto)) {
            return false;
        }
        SPayErrorDto sPayErrorDto = (SPayErrorDto) other;
        return zdlpuopuiu.eablkybsjg(this.errorCode, sPayErrorDto.errorCode) && zdlpuopuiu.eablkybsjg(this.description, sPayErrorDto.description) && zdlpuopuiu.eablkybsjg(this.fraudMonCheckResultResponseBodyDto, sPayErrorDto.fraudMonCheckResultResponseBodyDto) && zdlpuopuiu.eablkybsjg(this.oldFraudMonCheckResultResponseBodyDto, sPayErrorDto.oldFraudMonCheckResultResponseBodyDto) && zdlpuopuiu.eablkybsjg(this.info, sPayErrorDto.info);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final FraudMonCheckResultResponseBodyDto getFraudMonCheckResultResponseBodyDto() {
        return this.fraudMonCheckResultResponseBodyDto;
    }

    public final String getInfo() {
        return this.info;
    }

    public final FraudMonCheckResultResponseBodyDto getOldFraudMonCheckResultResponseBodyDto() {
        return this.oldFraudMonCheckResultResponseBodyDto;
    }

    public int hashCode() {
        String str = this.errorCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto = this.fraudMonCheckResultResponseBodyDto;
        int iHashCode3 = (iHashCode2 + (fraudMonCheckResultResponseBodyDto == null ? 0 : fraudMonCheckResultResponseBodyDto.hashCode())) * 31;
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto2 = this.oldFraudMonCheckResultResponseBodyDto;
        int iHashCode4 = (iHashCode3 + (fraudMonCheckResultResponseBodyDto2 == null ? 0 : fraudMonCheckResultResponseBodyDto2.hashCode())) * 31;
        String str3 = this.info;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SPayErrorDto(errorCode=" + this.errorCode + ", description=" + this.description + ", fraudMonCheckResultResponseBodyDto=" + this.fraudMonCheckResultResponseBodyDto + ", oldFraudMonCheckResultResponseBodyDto=" + this.oldFraudMonCheckResultResponseBodyDto + ", info=" + this.info + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
        parcel.writeString(this.errorCode);
        parcel.writeString(this.description);
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto = this.fraudMonCheckResultResponseBodyDto;
        if (fraudMonCheckResultResponseBodyDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fraudMonCheckResultResponseBodyDto.writeToParcel(parcel, flags);
        }
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto2 = this.oldFraudMonCheckResultResponseBodyDto;
        if (fraudMonCheckResultResponseBodyDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fraudMonCheckResultResponseBodyDto2.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.info);
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    public SPayApiError toModel() {
        String str = this.errorCode;
        if (str == null) {
            throw new pd("errorCode");
        }
        String str2 = this.description;
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDtoFindOutCurrentVerdict = SPayErrorDtoKt.findOutCurrentVerdict(this);
        return new SPayApiError(str, str2, fraudMonCheckResultResponseBodyDtoFindOutCurrentVerdict != null ? fraudMonCheckResultResponseBodyDtoFindOutCurrentVerdict.toModel() : null, this.info);
    }
}
