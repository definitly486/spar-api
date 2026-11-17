package modern.payments.ecomAndroid.domain.model.request;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsMethodRequestBody;", "", "orderId", "", "transactionId", "threeDSCompInd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getThreeDSCompInd", "getTransactionId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Finish3dsMethodRequestBody {

    @ppxfxbqfkf("mdOrder")
    private final String orderId;
    private final String threeDSCompInd;

    @ppxfxbqfkf("threeDSServerTransId")
    private final String transactionId;

    public Finish3dsMethodRequestBody(String orderId, String transactionId, String threeDSCompInd) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        zdlpuopuiu.btonecajqb(transactionId, "transactionId");
        zdlpuopuiu.btonecajqb(threeDSCompInd, "threeDSCompInd");
        this.orderId = orderId;
        this.transactionId = transactionId;
        this.threeDSCompInd = threeDSCompInd;
    }

    public static /* synthetic */ Finish3dsMethodRequestBody copy$default(Finish3dsMethodRequestBody finish3dsMethodRequestBody, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = finish3dsMethodRequestBody.orderId;
        }
        if ((i13 & 2) != 0) {
            str2 = finish3dsMethodRequestBody.transactionId;
        }
        if ((i13 & 4) != 0) {
            str3 = finish3dsMethodRequestBody.threeDSCompInd;
        }
        return finish3dsMethodRequestBody.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getThreeDSCompInd() {
        return this.threeDSCompInd;
    }

    public final Finish3dsMethodRequestBody copy(String orderId, String transactionId, String threeDSCompInd) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        zdlpuopuiu.btonecajqb(transactionId, "transactionId");
        zdlpuopuiu.btonecajqb(threeDSCompInd, "threeDSCompInd");
        return new Finish3dsMethodRequestBody(orderId, transactionId, threeDSCompInd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Finish3dsMethodRequestBody)) {
            return false;
        }
        Finish3dsMethodRequestBody finish3dsMethodRequestBody = (Finish3dsMethodRequestBody) other;
        return zdlpuopuiu.eablkybsjg(this.orderId, finish3dsMethodRequestBody.orderId) && zdlpuopuiu.eablkybsjg(this.transactionId, finish3dsMethodRequestBody.transactionId) && zdlpuopuiu.eablkybsjg(this.threeDSCompInd, finish3dsMethodRequestBody.threeDSCompInd);
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getThreeDSCompInd() {
        return this.threeDSCompInd;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        return (((this.orderId.hashCode() * 31) + this.transactionId.hashCode()) * 31) + this.threeDSCompInd.hashCode();
    }

    public String toString() {
        return "Finish3dsMethodRequestBody(orderId=" + this.orderId + ", transactionId=" + this.transactionId + ", threeDSCompInd=" + this.threeDSCompInd + ')';
    }
}
