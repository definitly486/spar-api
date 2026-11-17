package modern.payments.ecomAndroid.domain.model.request;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsPaymentRequestBody;", "", "orderId", "", "cRes", "paRes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCRes", "()Ljava/lang/String;", "getOrderId", "getPaRes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Finish3dsPaymentRequestBody {
    private final String cRes;

    @ppxfxbqfkf("mdOrder")
    private final String orderId;
    private final String paRes;

    public Finish3dsPaymentRequestBody(String orderId, String str, String str2) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        this.orderId = orderId;
        this.cRes = str;
        this.paRes = str2;
    }

    public static /* synthetic */ Finish3dsPaymentRequestBody copy$default(Finish3dsPaymentRequestBody finish3dsPaymentRequestBody, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = finish3dsPaymentRequestBody.orderId;
        }
        if ((i13 & 2) != 0) {
            str2 = finish3dsPaymentRequestBody.cRes;
        }
        if ((i13 & 4) != 0) {
            str3 = finish3dsPaymentRequestBody.paRes;
        }
        return finish3dsPaymentRequestBody.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCRes() {
        return this.cRes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPaRes() {
        return this.paRes;
    }

    public final Finish3dsPaymentRequestBody copy(String orderId, String cRes, String paRes) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        return new Finish3dsPaymentRequestBody(orderId, cRes, paRes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Finish3dsPaymentRequestBody)) {
            return false;
        }
        Finish3dsPaymentRequestBody finish3dsPaymentRequestBody = (Finish3dsPaymentRequestBody) other;
        return zdlpuopuiu.eablkybsjg(this.orderId, finish3dsPaymentRequestBody.orderId) && zdlpuopuiu.eablkybsjg(this.cRes, finish3dsPaymentRequestBody.cRes) && zdlpuopuiu.eablkybsjg(this.paRes, finish3dsPaymentRequestBody.paRes);
    }

    public final String getCRes() {
        return this.cRes;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPaRes() {
        return this.paRes;
    }

    public int hashCode() {
        int iHashCode = this.orderId.hashCode() * 31;
        String str = this.cRes;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.paRes;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Finish3dsPaymentRequestBody(orderId=" + this.orderId + ", cRes=" + this.cRes + ", paRes=" + this.paRes + ')';
    }

    public /* synthetic */ Finish3dsPaymentRequestBody(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
    }
}
