package spay.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import gg.eablkybsjg;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0013\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\n\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lspay/sdk/api/MerchantError;", "Landroid/os/Parcelable;", "description", "", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "InnerSdkComponentsError", "IsReadyCheckHasNotBeenCalled", "NoInternetConnection", "PayWithBindingError", "PayWithBonusesError", "RequiredDataNotSent", "SPayApiError", "SdkClosedByUser", "TimeoutException", "UnexpectedError", "Lspay/sdk/api/MerchantError$InnerSdkComponentsError;", "Lspay/sdk/api/MerchantError$IsReadyCheckHasNotBeenCalled;", "Lspay/sdk/api/MerchantError$NoInternetConnection;", "Lspay/sdk/api/MerchantError$PayWithBindingError;", "Lspay/sdk/api/MerchantError$PayWithBonusesError;", "Lspay/sdk/api/MerchantError$RequiredDataNotSent;", "Lspay/sdk/api/MerchantError$SPayApiError;", "Lspay/sdk/api/MerchantError$SdkClosedByUser;", "Lspay/sdk/api/MerchantError$TimeoutException;", "Lspay/sdk/api/MerchantError$UnexpectedError;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class MerchantError implements Parcelable {
    private final String description;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lspay/sdk/api/MerchantError$InnerSdkComponentsError;", "Lspay/sdk/api/MerchantError;", "", "description", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lspay/sdk/api/MerchantError$InnerSdkComponentsError;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDescription", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class InnerSdkComponentsError extends MerchantError {
        public static final Parcelable.Creator<InnerSdkComponentsError> CREATOR = new Creator();
        private final String description;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InnerSdkComponentsError> {
            @Override // android.os.Parcelable.Creator
            public final InnerSdkComponentsError createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new InnerSdkComponentsError(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InnerSdkComponentsError[] newArray(int i13) {
                return new InnerSdkComponentsError[i13];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InnerSdkComponentsError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ InnerSdkComponentsError copy$default(InnerSdkComponentsError innerSdkComponentsError, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = innerSdkComponentsError.getDescription();
            }
            return innerSdkComponentsError.copy(str);
        }

        public final String component1() {
            return getDescription();
        }

        public final InnerSdkComponentsError copy(String description) {
            zdlpuopuiu.btonecajqb(description, "description");
            return new InnerSdkComponentsError(description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InnerSdkComponentsError) && zdlpuopuiu.eablkybsjg(getDescription(), ((InnerSdkComponentsError) other).getDescription());
        }

        @Override // spay.sdk.api.MerchantError
        public String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return getDescription().hashCode();
        }

        public String toString() {
            return "InnerSdkComponentsError(description=" + getDescription() + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.description);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InnerSdkComponentsError(String description) {
            super(description, null);
            zdlpuopuiu.btonecajqb(description, "description");
            this.description = description;
        }

        public /* synthetic */ InnerSdkComponentsError(String str, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? "Ошибка внутренних компонентов SPaySdk" : str);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lspay/sdk/api/MerchantError$IsReadyCheckHasNotBeenCalled;", "Lspay/sdk/api/MerchantError;", "", "description", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lspay/sdk/api/MerchantError$IsReadyCheckHasNotBeenCalled;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDescription", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class IsReadyCheckHasNotBeenCalled extends MerchantError {
        public static final Parcelable.Creator<IsReadyCheckHasNotBeenCalled> CREATOR = new Creator();
        private final String description;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IsReadyCheckHasNotBeenCalled> {
            @Override // android.os.Parcelable.Creator
            public final IsReadyCheckHasNotBeenCalled createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new IsReadyCheckHasNotBeenCalled(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IsReadyCheckHasNotBeenCalled[] newArray(int i13) {
                return new IsReadyCheckHasNotBeenCalled[i13];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IsReadyCheckHasNotBeenCalled() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ IsReadyCheckHasNotBeenCalled copy$default(IsReadyCheckHasNotBeenCalled isReadyCheckHasNotBeenCalled, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = isReadyCheckHasNotBeenCalled.getDescription();
            }
            return isReadyCheckHasNotBeenCalled.copy(str);
        }

        public final String component1() {
            return getDescription();
        }

        public final IsReadyCheckHasNotBeenCalled copy(String description) {
            zdlpuopuiu.btonecajqb(description, "description");
            return new IsReadyCheckHasNotBeenCalled(description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IsReadyCheckHasNotBeenCalled) && zdlpuopuiu.eablkybsjg(getDescription(), ((IsReadyCheckHasNotBeenCalled) other).getDescription());
        }

        @Override // spay.sdk.api.MerchantError
        public String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return getDescription().hashCode();
        }

        public String toString() {
            return "IsReadyCheckHasNotBeenCalled(description=" + getDescription() + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.description);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IsReadyCheckHasNotBeenCalled(String description) {
            super(description, null);
            zdlpuopuiu.btonecajqb(description, "description");
            this.description = description;
        }

        public /* synthetic */ IsReadyCheckHasNotBeenCalled(String str, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? "Перед проведением оплаты необходимо вызвать метод isReadyForSPaySdk()" : str);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lspay/sdk/api/MerchantError$NoInternetConnection;", "Lspay/sdk/api/MerchantError;", "", "description", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lspay/sdk/api/MerchantError$NoInternetConnection;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDescription", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class NoInternetConnection extends MerchantError {
        public static final Parcelable.Creator<NoInternetConnection> CREATOR = new Creator();
        private final String description;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NoInternetConnection> {
            @Override // android.os.Parcelable.Creator
            public final NoInternetConnection createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new NoInternetConnection(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NoInternetConnection[] newArray(int i13) {
                return new NoInternetConnection[i13];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NoInternetConnection() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NoInternetConnection copy$default(NoInternetConnection noInternetConnection, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = noInternetConnection.getDescription();
            }
            return noInternetConnection.copy(str);
        }

        public final String component1() {
            return getDescription();
        }

        public final NoInternetConnection copy(String description) {
            zdlpuopuiu.btonecajqb(description, "description");
            return new NoInternetConnection(description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NoInternetConnection) && zdlpuopuiu.eablkybsjg(getDescription(), ((NoInternetConnection) other).getDescription());
        }

        @Override // spay.sdk.api.MerchantError
        public String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return getDescription().hashCode();
        }

        public String toString() {
            return "NoInternetConnection(description=" + getDescription() + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.description);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoInternetConnection(String description) {
            super(description, null);
            zdlpuopuiu.btonecajqb(description, "description");
            this.description = description;
        }

        public /* synthetic */ NoInternetConnection(String str, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? "Отсутствует подключение к интернету" : str);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lspay/sdk/api/MerchantError$PayWithBindingError;", "Lspay/sdk/api/MerchantError;", "", "description", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lspay/sdk/api/MerchantError$PayWithBindingError;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDescription", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PayWithBindingError extends MerchantError {
        public static final Parcelable.Creator<PayWithBindingError> CREATOR = new Creator();
        private final String description;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PayWithBindingError> {
            @Override // android.os.Parcelable.Creator
            public final PayWithBindingError createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new PayWithBindingError(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PayWithBindingError[] newArray(int i13) {
                return new PayWithBindingError[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PayWithBindingError(String description) {
            super(description, null);
            zdlpuopuiu.btonecajqb(description, "description");
            this.description = description;
        }

        public static /* synthetic */ PayWithBindingError copy$default(PayWithBindingError payWithBindingError, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = payWithBindingError.getDescription();
            }
            return payWithBindingError.copy(str);
        }

        public final String component1() {
            return getDescription();
        }

        public final PayWithBindingError copy(String description) {
            zdlpuopuiu.btonecajqb(description, "description");
            return new PayWithBindingError(description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PayWithBindingError) && zdlpuopuiu.eablkybsjg(getDescription(), ((PayWithBindingError) other).getDescription());
        }

        @Override // spay.sdk.api.MerchantError
        public String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return getDescription().hashCode();
        }

        public String toString() {
            return "PayWithBindingError(description=" + getDescription() + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.description);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lspay/sdk/api/MerchantError$PayWithBonusesError;", "Lspay/sdk/api/MerchantError;", "", "description", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lspay/sdk/api/MerchantError$PayWithBonusesError;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDescription", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PayWithBonusesError extends MerchantError {
        public static final Parcelable.Creator<PayWithBonusesError> CREATOR = new Creator();
        private final String description;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PayWithBonusesError> {
            @Override // android.os.Parcelable.Creator
            public final PayWithBonusesError createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new PayWithBonusesError(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PayWithBonusesError[] newArray(int i13) {
                return new PayWithBonusesError[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PayWithBonusesError(String description) {
            super(description, null);
            zdlpuopuiu.btonecajqb(description, "description");
            this.description = description;
        }

        public static /* synthetic */ PayWithBonusesError copy$default(PayWithBonusesError payWithBonusesError, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = payWithBonusesError.getDescription();
            }
            return payWithBonusesError.copy(str);
        }

        public final String component1() {
            return getDescription();
        }

        public final PayWithBonusesError copy(String description) {
            zdlpuopuiu.btonecajqb(description, "description");
            return new PayWithBonusesError(description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PayWithBonusesError) && zdlpuopuiu.eablkybsjg(getDescription(), ((PayWithBonusesError) other).getDescription());
        }

        @Override // spay.sdk.api.MerchantError
        public String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return getDescription().hashCode();
        }

        public String toString() {
            return "PayWithBonusesError(description=" + getDescription() + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.description);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lspay/sdk/api/MerchantError$RequiredDataNotSent;", "Lspay/sdk/api/MerchantError;", "", "description", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lspay/sdk/api/MerchantError$RequiredDataNotSent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDescription", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RequiredDataNotSent extends MerchantError {
        public static final Parcelable.Creator<RequiredDataNotSent> CREATOR = new Creator();
        private final String description;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RequiredDataNotSent> {
            @Override // android.os.Parcelable.Creator
            public final RequiredDataNotSent createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new RequiredDataNotSent(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RequiredDataNotSent[] newArray(int i13) {
                return new RequiredDataNotSent[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequiredDataNotSent(String description) {
            super(description, null);
            zdlpuopuiu.btonecajqb(description, "description");
            this.description = description;
        }

        public static /* synthetic */ RequiredDataNotSent copy$default(RequiredDataNotSent requiredDataNotSent, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = requiredDataNotSent.getDescription();
            }
            return requiredDataNotSent.copy(str);
        }

        public final String component1() {
            return getDescription();
        }

        public final RequiredDataNotSent copy(String description) {
            zdlpuopuiu.btonecajqb(description, "description");
            return new RequiredDataNotSent(description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RequiredDataNotSent) && zdlpuopuiu.eablkybsjg(getDescription(), ((RequiredDataNotSent) other).getDescription());
        }

        @Override // spay.sdk.api.MerchantError
        public String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return getDescription().hashCode();
        }

        public String toString() {
            return "RequiredDataNotSent(description=" + getDescription() + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.description);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lspay/sdk/api/MerchantError$SPayApiError;", "Lspay/sdk/api/MerchantError;", "", "description", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lspay/sdk/api/MerchantError$SPayApiError;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDescription", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SPayApiError extends MerchantError {
        public static final Parcelable.Creator<SPayApiError> CREATOR = new Creator();
        private final String description;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SPayApiError> {
            @Override // android.os.Parcelable.Creator
            public final SPayApiError createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new SPayApiError(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SPayApiError[] newArray(int i13) {
                return new SPayApiError[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SPayApiError(String description) {
            super(description, null);
            zdlpuopuiu.btonecajqb(description, "description");
            this.description = description;
        }

        public static /* synthetic */ SPayApiError copy$default(SPayApiError sPayApiError, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = sPayApiError.getDescription();
            }
            return sPayApiError.copy(str);
        }

        public final String component1() {
            return getDescription();
        }

        public final SPayApiError copy(String description) {
            zdlpuopuiu.btonecajqb(description, "description");
            return new SPayApiError(description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SPayApiError) && zdlpuopuiu.eablkybsjg(getDescription(), ((SPayApiError) other).getDescription());
        }

        @Override // spay.sdk.api.MerchantError
        public String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return getDescription().hashCode();
        }

        public String toString() {
            return "SPayApiError(description=" + getDescription() + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.description);
        }
    }

    @eablkybsjg
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lspay/sdk/api/MerchantError$SdkClosedByUser;", "Lspay/sdk/api/MerchantError;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SdkClosedByUser extends MerchantError {
        public static final SdkClosedByUser INSTANCE = new SdkClosedByUser();
        public static final Parcelable.Creator<SdkClosedByUser> CREATOR = new Creator();

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SdkClosedByUser> {
            @Override // android.os.Parcelable.Creator
            public final SdkClosedByUser createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                parcel.readInt();
                return SdkClosedByUser.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final SdkClosedByUser[] newArray(int i13) {
                return new SdkClosedByUser[i13];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private SdkClosedByUser() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lspay/sdk/api/MerchantError$TimeoutException;", "Lspay/sdk/api/MerchantError;", "", "description", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lspay/sdk/api/MerchantError$TimeoutException;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDescription", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TimeoutException extends MerchantError {
        public static final Parcelable.Creator<TimeoutException> CREATOR = new Creator();
        private final String description;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TimeoutException> {
            @Override // android.os.Parcelable.Creator
            public final TimeoutException createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new TimeoutException(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TimeoutException[] newArray(int i13) {
                return new TimeoutException[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TimeoutException(String description) {
            super(description, null);
            zdlpuopuiu.btonecajqb(description, "description");
            this.description = description;
        }

        public static /* synthetic */ TimeoutException copy$default(TimeoutException timeoutException, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = timeoutException.getDescription();
            }
            return timeoutException.copy(str);
        }

        public final String component1() {
            return getDescription();
        }

        public final TimeoutException copy(String description) {
            zdlpuopuiu.btonecajqb(description, "description");
            return new TimeoutException(description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TimeoutException) && zdlpuopuiu.eablkybsjg(getDescription(), ((TimeoutException) other).getDescription());
        }

        @Override // spay.sdk.api.MerchantError
        public String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return getDescription().hashCode();
        }

        public String toString() {
            return "TimeoutException(description=" + getDescription() + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.description);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lspay/sdk/api/MerchantError$UnexpectedError;", "Lspay/sdk/api/MerchantError;", "", "description", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lspay/sdk/api/MerchantError$UnexpectedError;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDescription", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class UnexpectedError extends MerchantError {
        public static final Parcelable.Creator<UnexpectedError> CREATOR = new Creator();
        private final String description;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UnexpectedError> {
            @Override // android.os.Parcelable.Creator
            public final UnexpectedError createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new UnexpectedError(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final UnexpectedError[] newArray(int i13) {
                return new UnexpectedError[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnexpectedError(String description) {
            super(description, null);
            zdlpuopuiu.btonecajqb(description, "description");
            this.description = description;
        }

        public static /* synthetic */ UnexpectedError copy$default(UnexpectedError unexpectedError, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = unexpectedError.getDescription();
            }
            return unexpectedError.copy(str);
        }

        public final String component1() {
            return getDescription();
        }

        public final UnexpectedError copy(String description) {
            zdlpuopuiu.btonecajqb(description, "description");
            return new UnexpectedError(description);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnexpectedError) && zdlpuopuiu.eablkybsjg(getDescription(), ((UnexpectedError) other).getDescription());
        }

        @Override // spay.sdk.api.MerchantError
        public String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return getDescription().hashCode();
        }

        public String toString() {
            return "UnexpectedError(description=" + getDescription() + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.description);
        }
    }

    public /* synthetic */ MerchantError(String str, gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    public String getDescription() {
        return this.description;
    }

    private MerchantError(String str) {
        this.description = str;
    }

    public /* synthetic */ MerchantError(String str, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : str, null);
    }
}
