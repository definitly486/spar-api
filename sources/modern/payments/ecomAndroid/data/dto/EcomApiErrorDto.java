package modern.payments.ecomAndroid.data.dto;

import ak.iobyxmoadg;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.model.EcomApiError;
import modern.payments.ecomAndroid.util.exception.NullRequiredFieldException;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0001'B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010!\u001a\u00020 2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0010¨\u0006("}, d2 = {"Lmodern/payments/ecomAndroid/data/dto/EcomApiErrorDto;", "Landroid/os/Parcelable;", "", "errorCode", "description", "info", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "httpCode", "Lmodern/payments/ecomAndroid/domain/model/EcomApiError;", "toModel", "(Ljava/lang/String;)Lmodern/payments/ecomAndroid/domain/model/EcomApiError;", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lmodern/payments/ecomAndroid/data/dto/EcomApiErrorDto;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getErrorCode", "getDescription", "getInfo", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class EcomApiErrorDto implements Parcelable {

    @ppxfxbqfkf("description")
    private final String description;

    @ppxfxbqfkf("errorCode")
    private final String errorCode;

    @ppxfxbqfkf("info")
    private final String info;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<EcomApiErrorDto> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lmodern/payments/ecomAndroid/data/dto/EcomApiErrorDto$Companion;", "Lak/iobyxmoadg;", "Lmodern/payments/ecomAndroid/data/dto/EcomApiErrorDto;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lgg/wwaezpbzkn;", "write", "(Lmodern/payments/ecomAndroid/data/dto/EcomApiErrorDto;Landroid/os/Parcel;I)V", "create", "(Landroid/os/Parcel;)Lmodern/payments/ecomAndroid/data/dto/EcomApiErrorDto;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements iobyxmoadg {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private Companion() {
        }

        public EcomApiErrorDto create(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new EcomApiErrorDto(parcel);
        }

        public EcomApiErrorDto[] newArray(int i13) {
            return (EcomApiErrorDto[]) iobyxmoadg.C0049iobyxmoadg.iobyxmoadg(this, i13);
        }

        public void write(EcomApiErrorDto ecomApiErrorDto, Parcel parcel, int i13) {
            zdlpuopuiu.btonecajqb(ecomApiErrorDto, "<this>");
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            parcel.writeString(ecomApiErrorDto.getErrorCode());
            parcel.writeString(ecomApiErrorDto.getDescription());
            parcel.writeString(ecomApiErrorDto.getInfo());
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EcomApiErrorDto> {
        @Override // android.os.Parcelable.Creator
        public final EcomApiErrorDto createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return EcomApiErrorDto.INSTANCE.create(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EcomApiErrorDto[] newArray(int i13) {
            return new EcomApiErrorDto[i13];
        }
    }

    public EcomApiErrorDto(String str, String str2, String str3) {
        this.errorCode = str;
        this.description = str2;
        this.info = str3;
    }

    public static /* synthetic */ EcomApiErrorDto copy$default(EcomApiErrorDto ecomApiErrorDto, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = ecomApiErrorDto.errorCode;
        }
        if ((i13 & 2) != 0) {
            str2 = ecomApiErrorDto.description;
        }
        if ((i13 & 4) != 0) {
            str3 = ecomApiErrorDto.info;
        }
        return ecomApiErrorDto.copy(str, str2, str3);
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
    public final String getInfo() {
        return this.info;
    }

    public final EcomApiErrorDto copy(String errorCode, String description, String info) {
        return new EcomApiErrorDto(errorCode, description, info);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcomApiErrorDto)) {
            return false;
        }
        EcomApiErrorDto ecomApiErrorDto = (EcomApiErrorDto) other;
        return zdlpuopuiu.eablkybsjg(this.errorCode, ecomApiErrorDto.errorCode) && zdlpuopuiu.eablkybsjg(this.description, ecomApiErrorDto.description) && zdlpuopuiu.eablkybsjg(this.info, ecomApiErrorDto.info);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getInfo() {
        return this.info;
    }

    public int hashCode() {
        String str = this.errorCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.info;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final EcomApiError toModel(String httpCode) {
        zdlpuopuiu.btonecajqb(httpCode, "httpCode");
        String str = this.errorCode;
        if (str != null) {
            return new EcomApiError(httpCode, str, this.description, this.info);
        }
        throw new NullRequiredFieldException("errorCode");
    }

    public String toString() {
        return "EcomApiErrorDto(errorCode=" + this.errorCode + ", description=" + this.description + ", info=" + this.info + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
        INSTANCE.write(this, parcel, flags);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcomApiErrorDto(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString());
        zdlpuopuiu.btonecajqb(parcel, "parcel");
    }
}
