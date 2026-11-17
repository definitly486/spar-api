package modern.payments.ecomAndroid.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ<\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lmodern/payments/ecomAndroid/domain/model/EcomApiError;", "Landroid/os/Parcelable;", "", "httpCode", "errorCode", "description", "info", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lmodern/payments/ecomAndroid/domain/model/EcomApiError;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getHttpCode", "getErrorCode", "getDescription", "getInfo", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class EcomApiError implements Parcelable {
    public static final Parcelable.Creator<EcomApiError> CREATOR = new Creator();
    private final String description;
    private final String errorCode;
    private final String httpCode;
    private final String info;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EcomApiError> {
        @Override // android.os.Parcelable.Creator
        public final EcomApiError createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new EcomApiError(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EcomApiError[] newArray(int i13) {
            return new EcomApiError[i13];
        }
    }

    public EcomApiError(String httpCode, String errorCode, String str, String str2) {
        zdlpuopuiu.btonecajqb(httpCode, "httpCode");
        zdlpuopuiu.btonecajqb(errorCode, "errorCode");
        this.httpCode = httpCode;
        this.errorCode = errorCode;
        this.description = str;
        this.info = str2;
    }

    public static /* synthetic */ EcomApiError copy$default(EcomApiError ecomApiError, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = ecomApiError.httpCode;
        }
        if ((i13 & 2) != 0) {
            str2 = ecomApiError.errorCode;
        }
        if ((i13 & 4) != 0) {
            str3 = ecomApiError.description;
        }
        if ((i13 & 8) != 0) {
            str4 = ecomApiError.info;
        }
        return ecomApiError.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHttpCode() {
        return this.httpCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    public final EcomApiError copy(String httpCode, String errorCode, String description, String info) {
        zdlpuopuiu.btonecajqb(httpCode, "httpCode");
        zdlpuopuiu.btonecajqb(errorCode, "errorCode");
        return new EcomApiError(httpCode, errorCode, description, info);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcomApiError)) {
            return false;
        }
        EcomApiError ecomApiError = (EcomApiError) other;
        return zdlpuopuiu.eablkybsjg(this.httpCode, ecomApiError.httpCode) && zdlpuopuiu.eablkybsjg(this.errorCode, ecomApiError.errorCode) && zdlpuopuiu.eablkybsjg(this.description, ecomApiError.description) && zdlpuopuiu.eablkybsjg(this.info, ecomApiError.info);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getHttpCode() {
        return this.httpCode;
    }

    public final String getInfo() {
        return this.info;
    }

    public int hashCode() {
        int iHashCode = ((this.httpCode.hashCode() * 31) + this.errorCode.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.info;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "EcomApiError(httpCode=" + this.httpCode + ", errorCode=" + this.errorCode + ", description=" + this.description + ", info=" + this.info + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
        parcel.writeString(this.httpCode);
        parcel.writeString(this.errorCode);
        parcel.writeString(this.description);
        parcel.writeString(this.info);
    }
}
