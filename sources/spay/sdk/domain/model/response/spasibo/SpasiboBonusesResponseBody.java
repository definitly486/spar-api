package spay.sdk.domain.model.response.spasibo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001:\u0002$%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006&"}, d2 = {"Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody;", "Landroid/os/Parcelable;", "Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$LoyaltyAppInfo;", "loyaltyAppInfo", "Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$PrecalculateBonusesInfo;", "precalculateBonusesInfo", "<init>", "(Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$LoyaltyAppInfo;Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$PrecalculateBonusesInfo;)V", "component1", "()Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$LoyaltyAppInfo;", "component2", "()Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$PrecalculateBonusesInfo;", "copy", "(Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$LoyaltyAppInfo;Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$PrecalculateBonusesInfo;)Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$LoyaltyAppInfo;", "getLoyaltyAppInfo", "Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$PrecalculateBonusesInfo;", "getPrecalculateBonusesInfo", "LoyaltyAppInfo", "PrecalculateBonusesInfo", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SpasiboBonusesResponseBody implements Parcelable {
    public static final Parcelable.Creator<SpasiboBonusesResponseBody> CREATOR = new Creator();
    private final LoyaltyAppInfo loyaltyAppInfo;
    private final PrecalculateBonusesInfo precalculateBonusesInfo;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SpasiboBonusesResponseBody> {
        @Override // android.os.Parcelable.Creator
        public final SpasiboBonusesResponseBody createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new SpasiboBonusesResponseBody(LoyaltyAppInfo.CREATOR.createFromParcel(parcel), PrecalculateBonusesInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SpasiboBonusesResponseBody[] newArray(int i13) {
            return new SpasiboBonusesResponseBody[i13];
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\bJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$LoyaltyAppInfo;", "Landroid/os/Parcelable;", "", "maxPointsAmount", "pointsPaymentAmount", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$LoyaltyAppInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getMaxPointsAmount", "getPointsPaymentAmount", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LoyaltyAppInfo implements Parcelable {
        public static final Parcelable.Creator<LoyaltyAppInfo> CREATOR = new Creator();
        private final int maxPointsAmount;
        private final int pointsPaymentAmount;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LoyaltyAppInfo> {
            @Override // android.os.Parcelable.Creator
            public final LoyaltyAppInfo createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new LoyaltyAppInfo(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final LoyaltyAppInfo[] newArray(int i13) {
                return new LoyaltyAppInfo[i13];
            }
        }

        public LoyaltyAppInfo(int i13, int i14) {
            this.maxPointsAmount = i13;
            this.pointsPaymentAmount = i14;
        }

        public static /* synthetic */ LoyaltyAppInfo copy$default(LoyaltyAppInfo loyaltyAppInfo, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i13 = loyaltyAppInfo.maxPointsAmount;
            }
            if ((i15 & 2) != 0) {
                i14 = loyaltyAppInfo.pointsPaymentAmount;
            }
            return loyaltyAppInfo.copy(i13, i14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMaxPointsAmount() {
            return this.maxPointsAmount;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getPointsPaymentAmount() {
            return this.pointsPaymentAmount;
        }

        public final LoyaltyAppInfo copy(int maxPointsAmount, int pointsPaymentAmount) {
            return new LoyaltyAppInfo(maxPointsAmount, pointsPaymentAmount);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoyaltyAppInfo)) {
                return false;
            }
            LoyaltyAppInfo loyaltyAppInfo = (LoyaltyAppInfo) other;
            return this.maxPointsAmount == loyaltyAppInfo.maxPointsAmount && this.pointsPaymentAmount == loyaltyAppInfo.pointsPaymentAmount;
        }

        public final int getMaxPointsAmount() {
            return this.maxPointsAmount;
        }

        public final int getPointsPaymentAmount() {
            return this.pointsPaymentAmount;
        }

        public int hashCode() {
            return Integer.hashCode(this.pointsPaymentAmount) + (Integer.hashCode(this.maxPointsAmount) * 31);
        }

        public String toString() {
            return "LoyaltyAppInfo(maxPointsAmount=" + this.maxPointsAmount + ", pointsPaymentAmount=" + this.pointsPaymentAmount + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeInt(this.maxPointsAmount);
            parcel.writeInt(this.pointsPaymentAmount);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\b¨\u0006 "}, d2 = {"Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$PrecalculateBonusesInfo;", "Landroid/os/Parcelable;", "", "bonusesWithoutDeduction", "bonusesIsDeducted", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$PrecalculateBonusesInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getBonusesWithoutDeduction", "getBonusesIsDeducted", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PrecalculateBonusesInfo implements Parcelable {
        public static final Parcelable.Creator<PrecalculateBonusesInfo> CREATOR = new Creator();
        private final Integer bonusesIsDeducted;
        private final Integer bonusesWithoutDeduction;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PrecalculateBonusesInfo> {
            @Override // android.os.Parcelable.Creator
            public final PrecalculateBonusesInfo createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new PrecalculateBonusesInfo(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final PrecalculateBonusesInfo[] newArray(int i13) {
                return new PrecalculateBonusesInfo[i13];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PrecalculateBonusesInfo() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ PrecalculateBonusesInfo copy$default(PrecalculateBonusesInfo precalculateBonusesInfo, Integer num, Integer num2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                num = precalculateBonusesInfo.bonusesWithoutDeduction;
            }
            if ((i13 & 2) != 0) {
                num2 = precalculateBonusesInfo.bonusesIsDeducted;
            }
            return precalculateBonusesInfo.copy(num, num2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getBonusesWithoutDeduction() {
            return this.bonusesWithoutDeduction;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getBonusesIsDeducted() {
            return this.bonusesIsDeducted;
        }

        public final PrecalculateBonusesInfo copy(Integer bonusesWithoutDeduction, Integer bonusesIsDeducted) {
            return new PrecalculateBonusesInfo(bonusesWithoutDeduction, bonusesIsDeducted);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrecalculateBonusesInfo)) {
                return false;
            }
            PrecalculateBonusesInfo precalculateBonusesInfo = (PrecalculateBonusesInfo) other;
            return zdlpuopuiu.eablkybsjg(this.bonusesWithoutDeduction, precalculateBonusesInfo.bonusesWithoutDeduction) && zdlpuopuiu.eablkybsjg(this.bonusesIsDeducted, precalculateBonusesInfo.bonusesIsDeducted);
        }

        public final Integer getBonusesIsDeducted() {
            return this.bonusesIsDeducted;
        }

        public final Integer getBonusesWithoutDeduction() {
            return this.bonusesWithoutDeduction;
        }

        public int hashCode() {
            Integer num = this.bonusesWithoutDeduction;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.bonusesIsDeducted;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "PrecalculateBonusesInfo(bonusesWithoutDeduction=" + this.bonusesWithoutDeduction + ", bonusesIsDeducted=" + this.bonusesIsDeducted + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            Integer num = this.bonusesWithoutDeduction;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            Integer num2 = this.bonusesIsDeducted;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
        }

        public PrecalculateBonusesInfo(Integer num, Integer num2) {
            this.bonusesWithoutDeduction = num;
            this.bonusesIsDeducted = num2;
        }

        public /* synthetic */ PrecalculateBonusesInfo(Integer num, Integer num2, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : num2);
        }
    }

    public SpasiboBonusesResponseBody(LoyaltyAppInfo loyaltyAppInfo, PrecalculateBonusesInfo precalculateBonusesInfo) {
        zdlpuopuiu.btonecajqb(loyaltyAppInfo, "loyaltyAppInfo");
        zdlpuopuiu.btonecajqb(precalculateBonusesInfo, "precalculateBonusesInfo");
        this.loyaltyAppInfo = loyaltyAppInfo;
        this.precalculateBonusesInfo = precalculateBonusesInfo;
    }

    public static /* synthetic */ SpasiboBonusesResponseBody copy$default(SpasiboBonusesResponseBody spasiboBonusesResponseBody, LoyaltyAppInfo loyaltyAppInfo, PrecalculateBonusesInfo precalculateBonusesInfo, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            loyaltyAppInfo = spasiboBonusesResponseBody.loyaltyAppInfo;
        }
        if ((i13 & 2) != 0) {
            precalculateBonusesInfo = spasiboBonusesResponseBody.precalculateBonusesInfo;
        }
        return spasiboBonusesResponseBody.copy(loyaltyAppInfo, precalculateBonusesInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LoyaltyAppInfo getLoyaltyAppInfo() {
        return this.loyaltyAppInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PrecalculateBonusesInfo getPrecalculateBonusesInfo() {
        return this.precalculateBonusesInfo;
    }

    public final SpasiboBonusesResponseBody copy(LoyaltyAppInfo loyaltyAppInfo, PrecalculateBonusesInfo precalculateBonusesInfo) {
        zdlpuopuiu.btonecajqb(loyaltyAppInfo, "loyaltyAppInfo");
        zdlpuopuiu.btonecajqb(precalculateBonusesInfo, "precalculateBonusesInfo");
        return new SpasiboBonusesResponseBody(loyaltyAppInfo, precalculateBonusesInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpasiboBonusesResponseBody)) {
            return false;
        }
        SpasiboBonusesResponseBody spasiboBonusesResponseBody = (SpasiboBonusesResponseBody) other;
        return zdlpuopuiu.eablkybsjg(this.loyaltyAppInfo, spasiboBonusesResponseBody.loyaltyAppInfo) && zdlpuopuiu.eablkybsjg(this.precalculateBonusesInfo, spasiboBonusesResponseBody.precalculateBonusesInfo);
    }

    public final LoyaltyAppInfo getLoyaltyAppInfo() {
        return this.loyaltyAppInfo;
    }

    public final PrecalculateBonusesInfo getPrecalculateBonusesInfo() {
        return this.precalculateBonusesInfo;
    }

    public int hashCode() {
        return this.precalculateBonusesInfo.hashCode() + (this.loyaltyAppInfo.hashCode() * 31);
    }

    public String toString() {
        return "SpasiboBonusesResponseBody(loyaltyAppInfo=" + this.loyaltyAppInfo + ", precalculateBonusesInfo=" + this.precalculateBonusesInfo + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
        this.loyaltyAppInfo.writeToParcel(parcel, flags);
        this.precalculateBonusesInfo.writeToParcel(parcel, flags);
    }
}
