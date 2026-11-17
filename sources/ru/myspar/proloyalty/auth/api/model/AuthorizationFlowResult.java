package ru.myspar.proloyalty.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0003\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/myspar/proloyalty/auth/api/model/AuthorizationFlowResult;", "Landroid/os/Parcelable;", "", "resultKey", "<init>", "(Ljava/lang/String;)V", "zdlpuopuiu", "Ljava/lang/String;", "getResultKey", "()Ljava/lang/String;", "yggfygwlhe", "PurchaseListSharedWithYou", "PurchasesListsScreen", "iobyxmoadg", "Lru/myspar/proloyalty/auth/api/model/AuthorizationFlowResult$PurchaseListSharedWithYou;", "Lru/myspar/proloyalty/auth/api/model/AuthorizationFlowResult$PurchasesListsScreen;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AuthorizationFlowResult implements Parcelable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final iobyxmoadg f92398yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final String resultKey;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lru/myspar/proloyalty/auth/api/model/AuthorizationFlowResult$PurchaseListSharedWithYou;", "Lru/myspar/proloyalty/auth/api/model/AuthorizationFlowResult;", "", "purchaseListId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "jyumaefscl", "Ljava/lang/String;", "getPurchaseListId", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PurchaseListSharedWithYou extends AuthorizationFlowResult {
        public static final Parcelable.Creator<PurchaseListSharedWithYou> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final String purchaseListId;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final PurchaseListSharedWithYou createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new PurchaseListSharedWithYou(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final PurchaseListSharedWithYou[] newArray(int i13) {
                return new PurchaseListSharedWithYou[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PurchaseListSharedWithYou(String purchaseListId) {
            super("purchase_list_shared_with_you_key_result", null);
            zdlpuopuiu.btonecajqb(purchaseListId, "purchaseListId");
            this.purchaseListId = purchaseListId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PurchaseListSharedWithYou) && zdlpuopuiu.eablkybsjg(this.purchaseListId, ((PurchaseListSharedWithYou) other).purchaseListId);
        }

        public int hashCode() {
            return this.purchaseListId.hashCode();
        }

        public String toString() {
            return "PurchaseListSharedWithYou(purchaseListId=" + this.purchaseListId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.purchaseListId);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/myspar/proloyalty/auth/api/model/AuthorizationFlowResult$PurchasesListsScreen;", "Lru/myspar/proloyalty/auth/api/model/AuthorizationFlowResult;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PurchasesListsScreen extends AuthorizationFlowResult {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        public static final PurchasesListsScreen f92401jyumaefscl = new PurchasesListsScreen();
        public static final Parcelable.Creator<PurchasesListsScreen> CREATOR = new iobyxmoadg();

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final PurchasesListsScreen createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                parcel.readInt();
                return PurchasesListsScreen.f92401jyumaefscl;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final PurchasesListsScreen[] newArray(int i13) {
                return new PurchasesListsScreen[i13];
            }
        }

        private PurchasesListsScreen() {
            super("purchases_lists_screen_key", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeInt(1);
        }
    }

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ AuthorizationFlowResult(String str, gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    private AuthorizationFlowResult(String str) {
        this.resultKey = str;
    }
}
