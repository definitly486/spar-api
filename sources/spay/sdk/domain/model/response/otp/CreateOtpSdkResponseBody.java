package spay.sdk.domain.model.response.otp;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lspay/sdk/domain/model/response/otp/CreateOtpSdkResponseBody;", "", "errorCode", "", "errorMessage", "", "mobilePhone", "(ILjava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "getMobilePhone", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CreateOtpSdkResponseBody {
    private final int errorCode;
    private final String errorMessage;
    private final String mobilePhone;

    public CreateOtpSdkResponseBody(int i13, String str, String mobilePhone) {
        zdlpuopuiu.btonecajqb(mobilePhone, "mobilePhone");
        this.errorCode = i13;
        this.errorMessage = str;
        this.mobilePhone = mobilePhone;
    }

    public static /* synthetic */ CreateOtpSdkResponseBody copy$default(CreateOtpSdkResponseBody createOtpSdkResponseBody, int i13, String str, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = createOtpSdkResponseBody.errorCode;
        }
        if ((i14 & 2) != 0) {
            str = createOtpSdkResponseBody.errorMessage;
        }
        if ((i14 & 4) != 0) {
            str2 = createOtpSdkResponseBody.mobilePhone;
        }
        return createOtpSdkResponseBody.copy(i13, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMobilePhone() {
        return this.mobilePhone;
    }

    public final CreateOtpSdkResponseBody copy(int errorCode, String errorMessage, String mobilePhone) {
        zdlpuopuiu.btonecajqb(mobilePhone, "mobilePhone");
        return new CreateOtpSdkResponseBody(errorCode, errorMessage, mobilePhone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateOtpSdkResponseBody)) {
            return false;
        }
        CreateOtpSdkResponseBody createOtpSdkResponseBody = (CreateOtpSdkResponseBody) other;
        return this.errorCode == createOtpSdkResponseBody.errorCode && zdlpuopuiu.eablkybsjg(this.errorMessage, createOtpSdkResponseBody.errorMessage) && zdlpuopuiu.eablkybsjg(this.mobilePhone, createOtpSdkResponseBody.mobilePhone);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getMobilePhone() {
        return this.mobilePhone;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.errorCode) * 31;
        String str = this.errorMessage;
        return this.mobilePhone.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "CreateOtpSdkResponseBody(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", mobilePhone=" + this.mobilePhone + ")";
    }
}
