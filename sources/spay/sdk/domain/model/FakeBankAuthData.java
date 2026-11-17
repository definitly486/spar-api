package spay.sdk.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJX\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b#\u0010$R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010%\u001a\u0004\b\u0003\u0010\r\"\u0004\b&\u0010'R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010+R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u000f\"\u0004\b-\u0010+R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010(\u001a\u0004\b.\u0010\u000f\"\u0004\b/\u0010+R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010(\u001a\u0004\b0\u0010\u000f\"\u0004\b1\u0010+R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010(\u001a\u0004\b2\u0010\u000f\"\u0004\b3\u0010+¨\u00064"}, d2 = {"Lspay/sdk/domain/model/FakeBankAuthData;", "Landroid/os/Parcelable;", "", "isSuccess", "", "state", "nonce", "authCode", "errorDescription", "errorCode", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lspay/sdk/domain/model/FakeBankAuthData;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "setSuccess", "(Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getState", "setState", "(Ljava/lang/String;)V", "getNonce", "setNonce", "getAuthCode", "setAuthCode", "getErrorDescription", "setErrorDescription", "getErrorCode", "setErrorCode", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FakeBankAuthData implements Parcelable {
    public static final Parcelable.Creator<FakeBankAuthData> CREATOR = new Creator();
    private String authCode;
    private String errorCode;
    private String errorDescription;
    private Boolean isSuccess;
    private String nonce;
    private String state;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FakeBankAuthData> {
        @Override // android.os.Parcelable.Creator
        public final FakeBankAuthData createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FakeBankAuthData(boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FakeBankAuthData[] newArray(int i13) {
            return new FakeBankAuthData[i13];
        }
    }

    public FakeBankAuthData() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ FakeBankAuthData copy$default(FakeBankAuthData fakeBankAuthData, Boolean bool, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = fakeBankAuthData.isSuccess;
        }
        if ((i13 & 2) != 0) {
            str = fakeBankAuthData.state;
        }
        String str6 = str;
        if ((i13 & 4) != 0) {
            str2 = fakeBankAuthData.nonce;
        }
        String str7 = str2;
        if ((i13 & 8) != 0) {
            str3 = fakeBankAuthData.authCode;
        }
        String str8 = str3;
        if ((i13 & 16) != 0) {
            str4 = fakeBankAuthData.errorDescription;
        }
        String str9 = str4;
        if ((i13 & 32) != 0) {
            str5 = fakeBankAuthData.errorCode;
        }
        return fakeBankAuthData.copy(bool, str6, str7, str8, str9, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAuthCode() {
        return this.authCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    public final FakeBankAuthData copy(Boolean isSuccess, String state, String nonce, String authCode, String errorDescription, String errorCode) {
        return new FakeBankAuthData(isSuccess, state, nonce, authCode, errorDescription, errorCode);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FakeBankAuthData)) {
            return false;
        }
        FakeBankAuthData fakeBankAuthData = (FakeBankAuthData) other;
        return zdlpuopuiu.eablkybsjg(this.isSuccess, fakeBankAuthData.isSuccess) && zdlpuopuiu.eablkybsjg(this.state, fakeBankAuthData.state) && zdlpuopuiu.eablkybsjg(this.nonce, fakeBankAuthData.nonce) && zdlpuopuiu.eablkybsjg(this.authCode, fakeBankAuthData.authCode) && zdlpuopuiu.eablkybsjg(this.errorDescription, fakeBankAuthData.errorDescription) && zdlpuopuiu.eablkybsjg(this.errorCode, fakeBankAuthData.errorCode);
    }

    public final String getAuthCode() {
        return this.authCode;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        Boolean bool = this.isSuccess;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.state;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nonce;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.authCode;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorDescription;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.errorCode;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final Boolean isSuccess() {
        return this.isSuccess;
    }

    public final void setAuthCode(String str) {
        this.authCode = str;
    }

    public final void setErrorCode(String str) {
        this.errorCode = str;
    }

    public final void setErrorDescription(String str) {
        this.errorDescription = str;
    }

    public final void setNonce(String str) {
        this.nonce = str;
    }

    public final void setState(String str) {
        this.state = str;
    }

    public final void setSuccess(Boolean bool) {
        this.isSuccess = bool;
    }

    public String toString() {
        return "FakeBankAuthData(isSuccess=" + this.isSuccess + ", state=" + this.state + ", nonce=" + this.nonce + ", authCode=" + this.authCode + ", errorDescription=" + this.errorDescription + ", errorCode=" + this.errorCode + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        ?? BooleanValue;
        zdlpuopuiu.btonecajqb(parcel, "out");
        Boolean bool = this.isSuccess;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.state);
        parcel.writeString(this.nonce);
        parcel.writeString(this.authCode);
        parcel.writeString(this.errorDescription);
        parcel.writeString(this.errorCode);
    }

    public FakeBankAuthData(Boolean bool, String str, String str2, String str3, String str4, String str5) {
        this.isSuccess = bool;
        this.state = str;
        this.nonce = str2;
        this.authCode = str3;
        this.errorDescription = str4;
        this.errorCode = str5;
    }

    public /* synthetic */ FakeBankAuthData(Boolean bool, String str, String str2, String str3, String str4, String str5, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5);
    }
}
