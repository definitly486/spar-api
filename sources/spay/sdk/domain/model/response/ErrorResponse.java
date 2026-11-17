package spay.sdk.domain.model.response;

import kk.xg;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lspay/sdk/domain/model/response/ErrorResponse;", "", "code", "", "message", "", "errorData", "(ILjava/lang/String;Ljava/lang/String;)V", "getCode", "()I", "getErrorData", "()Ljava/lang/String;", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ErrorResponse {
    private final int code;
    private final String errorData;
    private final String message;

    public ErrorResponse() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, int i13, String str, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = errorResponse.code;
        }
        if ((i14 & 2) != 0) {
            str = errorResponse.message;
        }
        if ((i14 & 4) != 0) {
            str2 = errorResponse.errorData;
        }
        return errorResponse.copy(i13, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorData() {
        return this.errorData;
    }

    public final ErrorResponse copy(int code, String message, String errorData) {
        zdlpuopuiu.btonecajqb(message, "message");
        return new ErrorResponse(code, message, errorData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) other;
        return this.code == errorResponse.code && zdlpuopuiu.eablkybsjg(this.message, errorResponse.message) && zdlpuopuiu.eablkybsjg(this.errorData, errorResponse.errorData);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getErrorData() {
        return this.errorData;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iIobyxmoadg = xg.iobyxmoadg(this.message, Integer.hashCode(this.code) * 31, 31);
        String str = this.errorData;
        return iIobyxmoadg + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ErrorResponse(code=" + this.code + ", message=" + this.message + ", errorData=" + this.errorData + ")";
    }

    public ErrorResponse(int i13, String message, String str) {
        zdlpuopuiu.btonecajqb(message, "message");
        this.code = i13;
        this.message = message;
        this.errorData = str;
    }

    public /* synthetic */ ErrorResponse(int i13, String str, String str2, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? null : str2);
    }
}
