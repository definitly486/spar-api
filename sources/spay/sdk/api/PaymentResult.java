package spay.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import kk.xg;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lspay/sdk/api/PaymentResult;", "Landroid/os/Parcelable;", "()V", "Cancel", "Error", "Processing", "Success", "Lspay/sdk/api/PaymentResult$Cancel;", "Lspay/sdk/api/PaymentResult$Error;", "Lspay/sdk/api/PaymentResult$Processing;", "Lspay/sdk/api/PaymentResult$Success;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class PaymentResult implements Parcelable {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lspay/sdk/api/PaymentResult$Cancel;", "Lspay/sdk/api/PaymentResult;", "", "userId", "localSessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lspay/sdk/api/PaymentResult$Cancel;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUserId", "getLocalSessionId", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Cancel extends PaymentResult {
        public static final Parcelable.Creator<Cancel> CREATOR = new Creator();
        private final String localSessionId;
        private final String userId;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Cancel> {
            @Override // android.os.Parcelable.Creator
            public final Cancel createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Cancel(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Cancel[] newArray(int i13) {
                return new Cancel[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cancel(String userId, String localSessionId) {
            super(null);
            zdlpuopuiu.btonecajqb(userId, "userId");
            zdlpuopuiu.btonecajqb(localSessionId, "localSessionId");
            this.userId = userId;
            this.localSessionId = localSessionId;
        }

        public static /* synthetic */ Cancel copy$default(Cancel cancel, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = cancel.userId;
            }
            if ((i13 & 2) != 0) {
                str2 = cancel.localSessionId;
            }
            return cancel.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLocalSessionId() {
            return this.localSessionId;
        }

        public final Cancel copy(String userId, String localSessionId) {
            zdlpuopuiu.btonecajqb(userId, "userId");
            zdlpuopuiu.btonecajqb(localSessionId, "localSessionId");
            return new Cancel(userId, localSessionId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cancel)) {
                return false;
            }
            Cancel cancel = (Cancel) other;
            return zdlpuopuiu.eablkybsjg(this.userId, cancel.userId) && zdlpuopuiu.eablkybsjg(this.localSessionId, cancel.localSessionId);
        }

        public final String getLocalSessionId() {
            return this.localSessionId;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.localSessionId.hashCode() + (this.userId.hashCode() * 31);
        }

        public String toString() {
            return "Cancel(userId=" + this.userId + ", localSessionId=" + this.localSessionId + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.userId);
            parcel.writeString(this.localSessionId);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lspay/sdk/api/PaymentResult$Error;", "Lspay/sdk/api/PaymentResult;", "", "userId", "localSessionId", "Lspay/sdk/api/MerchantError;", "merchantError", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lspay/sdk/api/MerchantError;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lspay/sdk/api/MerchantError;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lspay/sdk/api/MerchantError;)Lspay/sdk/api/PaymentResult$Error;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUserId", "getLocalSessionId", "Lspay/sdk/api/MerchantError;", "getMerchantError", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Error extends PaymentResult {
        public static final Parcelable.Creator<Error> CREATOR = new Creator();
        private final String localSessionId;
        private final MerchantError merchantError;
        private final String userId;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Error(parcel.readString(), parcel.readString(), (MerchantError) parcel.readParcelable(Error.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i13) {
                return new Error[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String userId, String localSessionId, MerchantError merchantError) {
            super(null);
            zdlpuopuiu.btonecajqb(userId, "userId");
            zdlpuopuiu.btonecajqb(localSessionId, "localSessionId");
            this.userId = userId;
            this.localSessionId = localSessionId;
            this.merchantError = merchantError;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, String str2, MerchantError merchantError, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = error.userId;
            }
            if ((i13 & 2) != 0) {
                str2 = error.localSessionId;
            }
            if ((i13 & 4) != 0) {
                merchantError = error.merchantError;
            }
            return error.copy(str, str2, merchantError);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLocalSessionId() {
            return this.localSessionId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final MerchantError getMerchantError() {
            return this.merchantError;
        }

        public final Error copy(String userId, String localSessionId, MerchantError merchantError) {
            zdlpuopuiu.btonecajqb(userId, "userId");
            zdlpuopuiu.btonecajqb(localSessionId, "localSessionId");
            return new Error(userId, localSessionId, merchantError);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return zdlpuopuiu.eablkybsjg(this.userId, error.userId) && zdlpuopuiu.eablkybsjg(this.localSessionId, error.localSessionId) && zdlpuopuiu.eablkybsjg(this.merchantError, error.merchantError);
        }

        public final String getLocalSessionId() {
            return this.localSessionId;
        }

        public final MerchantError getMerchantError() {
            return this.merchantError;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            int iIobyxmoadg = xg.iobyxmoadg(this.localSessionId, this.userId.hashCode() * 31, 31);
            MerchantError merchantError = this.merchantError;
            return iIobyxmoadg + (merchantError == null ? 0 : merchantError.hashCode());
        }

        public String toString() {
            return "Error(userId=" + this.userId + ", localSessionId=" + this.localSessionId + ", merchantError=" + this.merchantError + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.userId);
            parcel.writeString(this.localSessionId);
            parcel.writeParcelable(this.merchantError, flags);
        }

        public /* synthetic */ Error(String str, String str2, MerchantError merchantError, int i13, gtknphoqwx gtknphoqwxVar) {
            this(str, str2, (i13 & 4) != 0 ? null : merchantError);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lspay/sdk/api/PaymentResult$Processing;", "Lspay/sdk/api/PaymentResult;", "", "userId", "localSessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lspay/sdk/api/PaymentResult$Processing;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUserId", "getLocalSessionId", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Processing extends PaymentResult {
        public static final Parcelable.Creator<Processing> CREATOR = new Creator();
        private final String localSessionId;
        private final String userId;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Processing> {
            @Override // android.os.Parcelable.Creator
            public final Processing createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Processing(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Processing[] newArray(int i13) {
                return new Processing[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Processing(String userId, String localSessionId) {
            super(null);
            zdlpuopuiu.btonecajqb(userId, "userId");
            zdlpuopuiu.btonecajqb(localSessionId, "localSessionId");
            this.userId = userId;
            this.localSessionId = localSessionId;
        }

        public static /* synthetic */ Processing copy$default(Processing processing, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = processing.userId;
            }
            if ((i13 & 2) != 0) {
                str2 = processing.localSessionId;
            }
            return processing.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLocalSessionId() {
            return this.localSessionId;
        }

        public final Processing copy(String userId, String localSessionId) {
            zdlpuopuiu.btonecajqb(userId, "userId");
            zdlpuopuiu.btonecajqb(localSessionId, "localSessionId");
            return new Processing(userId, localSessionId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Processing)) {
                return false;
            }
            Processing processing = (Processing) other;
            return zdlpuopuiu.eablkybsjg(this.userId, processing.userId) && zdlpuopuiu.eablkybsjg(this.localSessionId, processing.localSessionId);
        }

        public final String getLocalSessionId() {
            return this.localSessionId;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.localSessionId.hashCode() + (this.userId.hashCode() * 31);
        }

        public String toString() {
            return "Processing(userId=" + this.userId + ", localSessionId=" + this.localSessionId + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.userId);
            parcel.writeString(this.localSessionId);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lspay/sdk/api/PaymentResult$Success;", "Lspay/sdk/api/PaymentResult;", "", "userId", "localSessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lspay/sdk/api/PaymentResult$Success;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUserId", "getLocalSessionId", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Success extends PaymentResult {
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        private final String localSessionId;
        private final String userId;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Success(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i13) {
                return new Success[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String userId, String localSessionId) {
            super(null);
            zdlpuopuiu.btonecajqb(userId, "userId");
            zdlpuopuiu.btonecajqb(localSessionId, "localSessionId");
            this.userId = userId;
            this.localSessionId = localSessionId;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = success.userId;
            }
            if ((i13 & 2) != 0) {
                str2 = success.localSessionId;
            }
            return success.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLocalSessionId() {
            return this.localSessionId;
        }

        public final Success copy(String userId, String localSessionId) {
            zdlpuopuiu.btonecajqb(userId, "userId");
            zdlpuopuiu.btonecajqb(localSessionId, "localSessionId");
            return new Success(userId, localSessionId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return zdlpuopuiu.eablkybsjg(this.userId, success.userId) && zdlpuopuiu.eablkybsjg(this.localSessionId, success.localSessionId);
        }

        public final String getLocalSessionId() {
            return this.localSessionId;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.localSessionId.hashCode() + (this.userId.hashCode() * 31);
        }

        public String toString() {
            return "Success(userId=" + this.userId + ", localSessionId=" + this.localSessionId + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.userId);
            parcel.writeString(this.localSessionId);
        }
    }

    public /* synthetic */ PaymentResult(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private PaymentResult() {
    }
}
