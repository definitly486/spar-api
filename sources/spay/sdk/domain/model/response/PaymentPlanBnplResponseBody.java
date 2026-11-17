package spay.sdk.domain.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.domain.model.response.bnpl.ButtonBnpl;
import spay.sdk.domain.model.response.bnpl.GraphBnpl;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JJ\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b\b\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0015¨\u0006/"}, d2 = {"Lspay/sdk/domain/model/response/PaymentPlanBnplResponseBody;", "Landroid/os/Parcelable;", "Lspay/sdk/domain/model/response/bnpl/ButtonBnpl;", "buttonBnpl", "", "offerUrl", "offerText", "", "isBnplEnabled", "Lspay/sdk/domain/model/response/bnpl/GraphBnpl;", "graphBnpl", "<init>", "(Lspay/sdk/domain/model/response/bnpl/ButtonBnpl;Ljava/lang/String;Ljava/lang/String;ZLspay/sdk/domain/model/response/bnpl/GraphBnpl;)V", "component1", "()Lspay/sdk/domain/model/response/bnpl/ButtonBnpl;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Z", "component5", "()Lspay/sdk/domain/model/response/bnpl/GraphBnpl;", "copy", "(Lspay/sdk/domain/model/response/bnpl/ButtonBnpl;Ljava/lang/String;Ljava/lang/String;ZLspay/sdk/domain/model/response/bnpl/GraphBnpl;)Lspay/sdk/domain/model/response/PaymentPlanBnplResponseBody;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lspay/sdk/domain/model/response/bnpl/ButtonBnpl;", "getButtonBnpl", "Ljava/lang/String;", "getOfferUrl", "getOfferText", "Z", "Lspay/sdk/domain/model/response/bnpl/GraphBnpl;", "getGraphBnpl", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PaymentPlanBnplResponseBody implements Parcelable {
    public static final Parcelable.Creator<PaymentPlanBnplResponseBody> CREATOR = new Creator();
    private final ButtonBnpl buttonBnpl;
    private final GraphBnpl graphBnpl;
    private final boolean isBnplEnabled;
    private final String offerText;
    private final String offerUrl;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentPlanBnplResponseBody> {
        @Override // android.os.Parcelable.Creator
        public final PaymentPlanBnplResponseBody createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new PaymentPlanBnplResponseBody(parcel.readInt() == 0 ? null : ButtonBnpl.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? GraphBnpl.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentPlanBnplResponseBody[] newArray(int i13) {
            return new PaymentPlanBnplResponseBody[i13];
        }
    }

    public PaymentPlanBnplResponseBody(ButtonBnpl buttonBnpl, String str, String str2, boolean z13, GraphBnpl graphBnpl) {
        this.buttonBnpl = buttonBnpl;
        this.offerUrl = str;
        this.offerText = str2;
        this.isBnplEnabled = z13;
        this.graphBnpl = graphBnpl;
    }

    public static /* synthetic */ PaymentPlanBnplResponseBody copy$default(PaymentPlanBnplResponseBody paymentPlanBnplResponseBody, ButtonBnpl buttonBnpl, String str, String str2, boolean z13, GraphBnpl graphBnpl, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            buttonBnpl = paymentPlanBnplResponseBody.buttonBnpl;
        }
        if ((i13 & 2) != 0) {
            str = paymentPlanBnplResponseBody.offerUrl;
        }
        String str3 = str;
        if ((i13 & 4) != 0) {
            str2 = paymentPlanBnplResponseBody.offerText;
        }
        String str4 = str2;
        if ((i13 & 8) != 0) {
            z13 = paymentPlanBnplResponseBody.isBnplEnabled;
        }
        boolean z14 = z13;
        if ((i13 & 16) != 0) {
            graphBnpl = paymentPlanBnplResponseBody.graphBnpl;
        }
        return paymentPlanBnplResponseBody.copy(buttonBnpl, str3, str4, z14, graphBnpl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ButtonBnpl getButtonBnpl() {
        return this.buttonBnpl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOfferUrl() {
        return this.offerUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOfferText() {
        return this.offerText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsBnplEnabled() {
        return this.isBnplEnabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GraphBnpl getGraphBnpl() {
        return this.graphBnpl;
    }

    public final PaymentPlanBnplResponseBody copy(ButtonBnpl buttonBnpl, String offerUrl, String offerText, boolean isBnplEnabled, GraphBnpl graphBnpl) {
        return new PaymentPlanBnplResponseBody(buttonBnpl, offerUrl, offerText, isBnplEnabled, graphBnpl);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentPlanBnplResponseBody)) {
            return false;
        }
        PaymentPlanBnplResponseBody paymentPlanBnplResponseBody = (PaymentPlanBnplResponseBody) other;
        return zdlpuopuiu.eablkybsjg(this.buttonBnpl, paymentPlanBnplResponseBody.buttonBnpl) && zdlpuopuiu.eablkybsjg(this.offerUrl, paymentPlanBnplResponseBody.offerUrl) && zdlpuopuiu.eablkybsjg(this.offerText, paymentPlanBnplResponseBody.offerText) && this.isBnplEnabled == paymentPlanBnplResponseBody.isBnplEnabled && zdlpuopuiu.eablkybsjg(this.graphBnpl, paymentPlanBnplResponseBody.graphBnpl);
    }

    public final ButtonBnpl getButtonBnpl() {
        return this.buttonBnpl;
    }

    public final GraphBnpl getGraphBnpl() {
        return this.graphBnpl;
    }

    public final String getOfferText() {
        return this.offerText;
    }

    public final String getOfferUrl() {
        return this.offerUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        ButtonBnpl buttonBnpl = this.buttonBnpl;
        int iHashCode = (buttonBnpl == null ? 0 : buttonBnpl.hashCode()) * 31;
        String str = this.offerUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.offerText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z13 = this.isBnplEnabled;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = (iHashCode3 + r13) * 31;
        GraphBnpl graphBnpl = this.graphBnpl;
        return i13 + (graphBnpl != null ? graphBnpl.hashCode() : 0);
    }

    public final boolean isBnplEnabled() {
        return this.isBnplEnabled;
    }

    public String toString() {
        return "PaymentPlanBnplResponseBody(buttonBnpl=" + this.buttonBnpl + ", offerUrl=" + this.offerUrl + ", offerText=" + this.offerText + ", isBnplEnabled=" + this.isBnplEnabled + ", graphBnpl=" + this.graphBnpl + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
        ButtonBnpl buttonBnpl = this.buttonBnpl;
        if (buttonBnpl == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonBnpl.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.offerUrl);
        parcel.writeString(this.offerText);
        parcel.writeInt(this.isBnplEnabled ? 1 : 0);
        GraphBnpl graphBnpl = this.graphBnpl;
        if (graphBnpl == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            graphBnpl.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ PaymentPlanBnplResponseBody(ButtonBnpl buttonBnpl, String str, String str2, boolean z13, GraphBnpl graphBnpl, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : buttonBnpl, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, z13, (i13 & 16) != 0 ? null : graphBnpl);
    }
}
