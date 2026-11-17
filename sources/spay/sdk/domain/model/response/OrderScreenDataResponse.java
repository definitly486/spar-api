package spay.sdk.domain.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import spay.sdk.domain.model.response.spasibo.SpasiboBonusesResponseBody;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0013¨\u0006/"}, d2 = {"Lspay/sdk/domain/model/response/OrderScreenDataResponse;", "Landroid/os/Parcelable;", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody;", "listOfCardsResponseBody", "Lspay/sdk/domain/model/response/PaymentPlanBnplResponseBody;", "paymentPlanBnplResponseBody", "Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody;", "spasiboBonusesResponseBody", "", "moreThanOneCard", "<init>", "(Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody;Lspay/sdk/domain/model/response/PaymentPlanBnplResponseBody;Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody;Z)V", "component1", "()Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody;", "component2", "()Lspay/sdk/domain/model/response/PaymentPlanBnplResponseBody;", "component3", "()Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody;", "component4", "()Z", "copy", "(Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody;Lspay/sdk/domain/model/response/PaymentPlanBnplResponseBody;Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody;Z)Lspay/sdk/domain/model/response/OrderScreenDataResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody;", "getListOfCardsResponseBody", "Lspay/sdk/domain/model/response/PaymentPlanBnplResponseBody;", "getPaymentPlanBnplResponseBody", "Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody;", "getSpasiboBonusesResponseBody", "Z", "getMoreThanOneCard", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OrderScreenDataResponse implements Parcelable {
    public static final Parcelable.Creator<OrderScreenDataResponse> CREATOR = new Creator();
    private final ListOfCardsResponseBody listOfCardsResponseBody;
    private final boolean moreThanOneCard;
    private final PaymentPlanBnplResponseBody paymentPlanBnplResponseBody;
    private final SpasiboBonusesResponseBody spasiboBonusesResponseBody;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderScreenDataResponse> {
        @Override // android.os.Parcelable.Creator
        public final OrderScreenDataResponse createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new OrderScreenDataResponse(ListOfCardsResponseBody.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PaymentPlanBnplResponseBody.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SpasiboBonusesResponseBody.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final OrderScreenDataResponse[] newArray(int i13) {
            return new OrderScreenDataResponse[i13];
        }
    }

    public OrderScreenDataResponse(ListOfCardsResponseBody listOfCardsResponseBody, PaymentPlanBnplResponseBody paymentPlanBnplResponseBody, SpasiboBonusesResponseBody spasiboBonusesResponseBody, boolean z13) {
        zdlpuopuiu.btonecajqb(listOfCardsResponseBody, "listOfCardsResponseBody");
        this.listOfCardsResponseBody = listOfCardsResponseBody;
        this.paymentPlanBnplResponseBody = paymentPlanBnplResponseBody;
        this.spasiboBonusesResponseBody = spasiboBonusesResponseBody;
        this.moreThanOneCard = z13;
    }

    public static /* synthetic */ OrderScreenDataResponse copy$default(OrderScreenDataResponse orderScreenDataResponse, ListOfCardsResponseBody listOfCardsResponseBody, PaymentPlanBnplResponseBody paymentPlanBnplResponseBody, SpasiboBonusesResponseBody spasiboBonusesResponseBody, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            listOfCardsResponseBody = orderScreenDataResponse.listOfCardsResponseBody;
        }
        if ((i13 & 2) != 0) {
            paymentPlanBnplResponseBody = orderScreenDataResponse.paymentPlanBnplResponseBody;
        }
        if ((i13 & 4) != 0) {
            spasiboBonusesResponseBody = orderScreenDataResponse.spasiboBonusesResponseBody;
        }
        if ((i13 & 8) != 0) {
            z13 = orderScreenDataResponse.moreThanOneCard;
        }
        return orderScreenDataResponse.copy(listOfCardsResponseBody, paymentPlanBnplResponseBody, spasiboBonusesResponseBody, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ListOfCardsResponseBody getListOfCardsResponseBody() {
        return this.listOfCardsResponseBody;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PaymentPlanBnplResponseBody getPaymentPlanBnplResponseBody() {
        return this.paymentPlanBnplResponseBody;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SpasiboBonusesResponseBody getSpasiboBonusesResponseBody() {
        return this.spasiboBonusesResponseBody;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getMoreThanOneCard() {
        return this.moreThanOneCard;
    }

    public final OrderScreenDataResponse copy(ListOfCardsResponseBody listOfCardsResponseBody, PaymentPlanBnplResponseBody paymentPlanBnplResponseBody, SpasiboBonusesResponseBody spasiboBonusesResponseBody, boolean moreThanOneCard) {
        zdlpuopuiu.btonecajqb(listOfCardsResponseBody, "listOfCardsResponseBody");
        return new OrderScreenDataResponse(listOfCardsResponseBody, paymentPlanBnplResponseBody, spasiboBonusesResponseBody, moreThanOneCard);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderScreenDataResponse)) {
            return false;
        }
        OrderScreenDataResponse orderScreenDataResponse = (OrderScreenDataResponse) other;
        return zdlpuopuiu.eablkybsjg(this.listOfCardsResponseBody, orderScreenDataResponse.listOfCardsResponseBody) && zdlpuopuiu.eablkybsjg(this.paymentPlanBnplResponseBody, orderScreenDataResponse.paymentPlanBnplResponseBody) && zdlpuopuiu.eablkybsjg(this.spasiboBonusesResponseBody, orderScreenDataResponse.spasiboBonusesResponseBody) && this.moreThanOneCard == orderScreenDataResponse.moreThanOneCard;
    }

    public final ListOfCardsResponseBody getListOfCardsResponseBody() {
        return this.listOfCardsResponseBody;
    }

    public final boolean getMoreThanOneCard() {
        return this.moreThanOneCard;
    }

    public final PaymentPlanBnplResponseBody getPaymentPlanBnplResponseBody() {
        return this.paymentPlanBnplResponseBody;
    }

    public final SpasiboBonusesResponseBody getSpasiboBonusesResponseBody() {
        return this.spasiboBonusesResponseBody;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        int iHashCode = this.listOfCardsResponseBody.hashCode() * 31;
        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = this.paymentPlanBnplResponseBody;
        int iHashCode2 = (iHashCode + (paymentPlanBnplResponseBody == null ? 0 : paymentPlanBnplResponseBody.hashCode())) * 31;
        SpasiboBonusesResponseBody spasiboBonusesResponseBody = this.spasiboBonusesResponseBody;
        int iHashCode3 = (iHashCode2 + (spasiboBonusesResponseBody != null ? spasiboBonusesResponseBody.hashCode() : 0)) * 31;
        boolean z13 = this.moreThanOneCard;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        return iHashCode3 + r13;
    }

    public String toString() {
        return "OrderScreenDataResponse(listOfCardsResponseBody=" + this.listOfCardsResponseBody + ", paymentPlanBnplResponseBody=" + this.paymentPlanBnplResponseBody + ", spasiboBonusesResponseBody=" + this.spasiboBonusesResponseBody + ", moreThanOneCard=" + this.moreThanOneCard + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
        this.listOfCardsResponseBody.writeToParcel(parcel, flags);
        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = this.paymentPlanBnplResponseBody;
        if (paymentPlanBnplResponseBody == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentPlanBnplResponseBody.writeToParcel(parcel, flags);
        }
        SpasiboBonusesResponseBody spasiboBonusesResponseBody = this.spasiboBonusesResponseBody;
        if (spasiboBonusesResponseBody == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            spasiboBonusesResponseBody.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.moreThanOneCard ? 1 : 0);
    }

    public /* synthetic */ OrderScreenDataResponse(ListOfCardsResponseBody listOfCardsResponseBody, PaymentPlanBnplResponseBody paymentPlanBnplResponseBody, SpasiboBonusesResponseBody spasiboBonusesResponseBody, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this(listOfCardsResponseBody, paymentPlanBnplResponseBody, spasiboBonusesResponseBody, (i13 & 8) != 0 ? false : z13);
    }
}
