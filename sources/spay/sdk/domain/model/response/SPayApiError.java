package spay.sdk.domain.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000b¨\u0006("}, d2 = {"Lspay/sdk/domain/model/response/SPayApiError;", "Landroid/os/Parcelable;", "", "errorCode", "description", "Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;", "fraudMonCheckResult", "info", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;Ljava/lang/String;)Lspay/sdk/domain/model/response/SPayApiError;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getErrorCode", "getDescription", "Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;", "getFraudMonCheckResult", "getInfo", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SPayApiError implements Parcelable {
    public static final Parcelable.Creator<SPayApiError> CREATOR = new Creator();
    private final String description;
    private final String errorCode;
    private final FraudMonCheckResult fraudMonCheckResult;
    private final String info;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SPayApiError> {
        @Override // android.os.Parcelable.Creator
        public final SPayApiError createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new SPayApiError(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FraudMonCheckResult.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SPayApiError[] newArray(int i13) {
            return new SPayApiError[i13];
        }
    }

    public SPayApiError(String errorCode, String str, FraudMonCheckResult fraudMonCheckResult, String str2) {
        zdlpuopuiu.btonecajqb(errorCode, "errorCode");
        this.errorCode = errorCode;
        this.description = str;
        this.fraudMonCheckResult = fraudMonCheckResult;
        this.info = str2;
    }

    public static /* synthetic */ SPayApiError copy$default(SPayApiError sPayApiError, String str, String str2, FraudMonCheckResult fraudMonCheckResult, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sPayApiError.errorCode;
        }
        if ((i13 & 2) != 0) {
            str2 = sPayApiError.description;
        }
        if ((i13 & 4) != 0) {
            fraudMonCheckResult = sPayApiError.fraudMonCheckResult;
        }
        if ((i13 & 8) != 0) {
            str3 = sPayApiError.info;
        }
        return sPayApiError.copy(str, str2, fraudMonCheckResult, str3);
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
    public final FraudMonCheckResult getFraudMonCheckResult() {
        return this.fraudMonCheckResult;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    public final SPayApiError copy(String errorCode, String description, FraudMonCheckResult fraudMonCheckResult, String info) {
        zdlpuopuiu.btonecajqb(errorCode, "errorCode");
        return new SPayApiError(errorCode, description, fraudMonCheckResult, info);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SPayApiError)) {
            return false;
        }
        SPayApiError sPayApiError = (SPayApiError) other;
        return zdlpuopuiu.eablkybsjg(this.errorCode, sPayApiError.errorCode) && zdlpuopuiu.eablkybsjg(this.description, sPayApiError.description) && zdlpuopuiu.eablkybsjg(this.fraudMonCheckResult, sPayApiError.fraudMonCheckResult) && zdlpuopuiu.eablkybsjg(this.info, sPayApiError.info);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final FraudMonCheckResult getFraudMonCheckResult() {
        return this.fraudMonCheckResult;
    }

    public final String getInfo() {
        return this.info;
    }

    public int hashCode() {
        int iHashCode = this.errorCode.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        FraudMonCheckResult fraudMonCheckResult = this.fraudMonCheckResult;
        int iHashCode3 = (iHashCode2 + (fraudMonCheckResult == null ? 0 : fraudMonCheckResult.hashCode())) * 31;
        String str2 = this.info;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SPayApiError(errorCode=" + this.errorCode + ", description=" + this.description + ", fraudMonCheckResult=" + this.fraudMonCheckResult + ", info=" + this.info + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
        parcel.writeString(this.errorCode);
        parcel.writeString(this.description);
        FraudMonCheckResult fraudMonCheckResult = this.fraudMonCheckResult;
        if (fraudMonCheckResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fraudMonCheckResult.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.info);
    }
}
