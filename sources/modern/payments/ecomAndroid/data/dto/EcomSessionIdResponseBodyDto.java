package modern.payments.ecomAndroid.data.dto;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.dto.base.DataDtoInterface;
import modern.payments.ecomAndroid.domain.model.EcomBindingInfo;
import modern.payments.ecomAndroid.domain.model.OrderInfo;
import modern.payments.ecomAndroid.domain.model.response.SessionIdResponseBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\b\u0010!\u001a\u00020\u0002H\u0016J\t\u0010\"\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006$"}, d2 = {"Lmodern/payments/ecomAndroid/data/dto/EcomSessionIdResponseBodyDto;", "Lmodern/payments/ecomAndroid/data/dto/base/DataDtoInterface;", "Lmodern/payments/ecomAndroid/domain/model/response/SessionIdResponseBody;", "ecomPublicKey", "", "sessionId", "orderInfo", "Lmodern/payments/ecomAndroid/data/dto/EcomSessionIdResponseBodyDto$OrderInfoResponse;", "sbpPayload", "bindings", "", "Lmodern/payments/ecomAndroid/domain/model/EcomBindingInfo;", "(Ljava/lang/String;Ljava/lang/String;Lmodern/payments/ecomAndroid/data/dto/EcomSessionIdResponseBodyDto$OrderInfoResponse;Ljava/lang/String;Ljava/util/List;)V", "getBindings", "()Ljava/util/List;", "getEcomPublicKey", "()Ljava/lang/String;", "getOrderInfo", "()Lmodern/payments/ecomAndroid/data/dto/EcomSessionIdResponseBodyDto$OrderInfoResponse;", "getSbpPayload", "getSessionId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "OrderInfoResponse", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class EcomSessionIdResponseBodyDto implements DataDtoInterface<SessionIdResponseBody> {
    private final List<EcomBindingInfo> bindings;
    private final String ecomPublicKey;
    private final OrderInfoResponse orderInfo;
    private final String sbpPayload;
    private final String sessionId;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lmodern/payments/ecomAndroid/data/dto/EcomSessionIdResponseBodyDto$OrderInfoResponse;", "", "merchantName", "", "logoUrl", "orderAmount", "Lmodern/payments/ecomAndroid/domain/model/OrderInfo$OrderAmount;", "(Ljava/lang/String;Ljava/lang/String;Lmodern/payments/ecomAndroid/domain/model/OrderInfo$OrderAmount;)V", "getLogoUrl", "()Ljava/lang/String;", "getMerchantName", "getOrderAmount", "()Lmodern/payments/ecomAndroid/domain/model/OrderInfo$OrderAmount;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OrderInfoResponse {
        private final String logoUrl;
        private final String merchantName;
        private final OrderInfo.OrderAmount orderAmount;

        public OrderInfoResponse(String merchantName, String logoUrl, OrderInfo.OrderAmount orderAmount) {
            zdlpuopuiu.btonecajqb(merchantName, "merchantName");
            zdlpuopuiu.btonecajqb(logoUrl, "logoUrl");
            zdlpuopuiu.btonecajqb(orderAmount, "orderAmount");
            this.merchantName = merchantName;
            this.logoUrl = logoUrl;
            this.orderAmount = orderAmount;
        }

        public static /* synthetic */ OrderInfoResponse copy$default(OrderInfoResponse orderInfoResponse, String str, String str2, OrderInfo.OrderAmount orderAmount, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = orderInfoResponse.merchantName;
            }
            if ((i13 & 2) != 0) {
                str2 = orderInfoResponse.logoUrl;
            }
            if ((i13 & 4) != 0) {
                orderAmount = orderInfoResponse.orderAmount;
            }
            return orderInfoResponse.copy(str, str2, orderAmount);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMerchantName() {
            return this.merchantName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLogoUrl() {
            return this.logoUrl;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final OrderInfo.OrderAmount getOrderAmount() {
            return this.orderAmount;
        }

        public final OrderInfoResponse copy(String merchantName, String logoUrl, OrderInfo.OrderAmount orderAmount) {
            zdlpuopuiu.btonecajqb(merchantName, "merchantName");
            zdlpuopuiu.btonecajqb(logoUrl, "logoUrl");
            zdlpuopuiu.btonecajqb(orderAmount, "orderAmount");
            return new OrderInfoResponse(merchantName, logoUrl, orderAmount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderInfoResponse)) {
                return false;
            }
            OrderInfoResponse orderInfoResponse = (OrderInfoResponse) other;
            return zdlpuopuiu.eablkybsjg(this.merchantName, orderInfoResponse.merchantName) && zdlpuopuiu.eablkybsjg(this.logoUrl, orderInfoResponse.logoUrl) && zdlpuopuiu.eablkybsjg(this.orderAmount, orderInfoResponse.orderAmount);
        }

        public final String getLogoUrl() {
            return this.logoUrl;
        }

        public final String getMerchantName() {
            return this.merchantName;
        }

        public final OrderInfo.OrderAmount getOrderAmount() {
            return this.orderAmount;
        }

        public int hashCode() {
            return (((this.merchantName.hashCode() * 31) + this.logoUrl.hashCode()) * 31) + this.orderAmount.hashCode();
        }

        public String toString() {
            return "OrderInfoResponse(merchantName=" + this.merchantName + ", logoUrl=" + this.logoUrl + ", orderAmount=" + this.orderAmount + ')';
        }
    }

    public EcomSessionIdResponseBodyDto(String ecomPublicKey, String sessionId, OrderInfoResponse orderInfoResponse, String str, List<EcomBindingInfo> bindings) {
        zdlpuopuiu.btonecajqb(ecomPublicKey, "ecomPublicKey");
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        zdlpuopuiu.btonecajqb(bindings, "bindings");
        this.ecomPublicKey = ecomPublicKey;
        this.sessionId = sessionId;
        this.orderInfo = orderInfoResponse;
        this.sbpPayload = str;
        this.bindings = bindings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EcomSessionIdResponseBodyDto copy$default(EcomSessionIdResponseBodyDto ecomSessionIdResponseBodyDto, String str, String str2, OrderInfoResponse orderInfoResponse, String str3, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = ecomSessionIdResponseBodyDto.ecomPublicKey;
        }
        if ((i13 & 2) != 0) {
            str2 = ecomSessionIdResponseBodyDto.sessionId;
        }
        String str4 = str2;
        if ((i13 & 4) != 0) {
            orderInfoResponse = ecomSessionIdResponseBodyDto.orderInfo;
        }
        OrderInfoResponse orderInfoResponse2 = orderInfoResponse;
        if ((i13 & 8) != 0) {
            str3 = ecomSessionIdResponseBodyDto.sbpPayload;
        }
        String str5 = str3;
        if ((i13 & 16) != 0) {
            list = ecomSessionIdResponseBodyDto.bindings;
        }
        return ecomSessionIdResponseBodyDto.copy(str, str4, orderInfoResponse2, str5, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEcomPublicKey() {
        return this.ecomPublicKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrderInfoResponse getOrderInfo() {
        return this.orderInfo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSbpPayload() {
        return this.sbpPayload;
    }

    public final List<EcomBindingInfo> component5() {
        return this.bindings;
    }

    public final EcomSessionIdResponseBodyDto copy(String ecomPublicKey, String sessionId, OrderInfoResponse orderInfo, String sbpPayload, List<EcomBindingInfo> bindings) {
        zdlpuopuiu.btonecajqb(ecomPublicKey, "ecomPublicKey");
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        zdlpuopuiu.btonecajqb(bindings, "bindings");
        return new EcomSessionIdResponseBodyDto(ecomPublicKey, sessionId, orderInfo, sbpPayload, bindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcomSessionIdResponseBodyDto)) {
            return false;
        }
        EcomSessionIdResponseBodyDto ecomSessionIdResponseBodyDto = (EcomSessionIdResponseBodyDto) other;
        return zdlpuopuiu.eablkybsjg(this.ecomPublicKey, ecomSessionIdResponseBodyDto.ecomPublicKey) && zdlpuopuiu.eablkybsjg(this.sessionId, ecomSessionIdResponseBodyDto.sessionId) && zdlpuopuiu.eablkybsjg(this.orderInfo, ecomSessionIdResponseBodyDto.orderInfo) && zdlpuopuiu.eablkybsjg(this.sbpPayload, ecomSessionIdResponseBodyDto.sbpPayload) && zdlpuopuiu.eablkybsjg(this.bindings, ecomSessionIdResponseBodyDto.bindings);
    }

    public final List<EcomBindingInfo> getBindings() {
        return this.bindings;
    }

    public final String getEcomPublicKey() {
        return this.ecomPublicKey;
    }

    public final OrderInfoResponse getOrderInfo() {
        return this.orderInfo;
    }

    public final String getSbpPayload() {
        return this.sbpPayload;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int iHashCode = ((this.ecomPublicKey.hashCode() * 31) + this.sessionId.hashCode()) * 31;
        OrderInfoResponse orderInfoResponse = this.orderInfo;
        int iHashCode2 = (iHashCode + (orderInfoResponse == null ? 0 : orderInfoResponse.hashCode())) * 31;
        String str = this.sbpPayload;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.bindings.hashCode();
    }

    public String toString() {
        return "EcomSessionIdResponseBodyDto(ecomPublicKey=" + this.ecomPublicKey + ", sessionId=" + this.sessionId + ", orderInfo=" + this.orderInfo + ", sbpPayload=" + this.sbpPayload + ", bindings=" + this.bindings + ')';
    }

    @Override // modern.payments.ecomAndroid.data.dto.base.DataDtoInterface
    public SessionIdResponseBody toModel() {
        String str = this.ecomPublicKey;
        String str2 = this.sessionId;
        OrderInfoResponse orderInfoResponse = this.orderInfo;
        OrderInfo.OrderAmount orderAmount = orderInfoResponse != null ? orderInfoResponse.getOrderAmount() : null;
        OrderInfoResponse orderInfoResponse2 = this.orderInfo;
        String merchantName = orderInfoResponse2 != null ? orderInfoResponse2.getMerchantName() : null;
        OrderInfoResponse orderInfoResponse3 = this.orderInfo;
        return new SessionIdResponseBody(str, str2, new OrderInfo(orderAmount, new OrderInfo.MerchantInfo(merchantName, orderInfoResponse3 != null ? orderInfoResponse3.getLogoUrl() : null)), this.bindings, this.sbpPayload);
    }

    public /* synthetic */ EcomSessionIdResponseBodyDto(String str, String str2, OrderInfoResponse orderInfoResponse, String str3, List list, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, (i13 & 4) != 0 ? null : orderInfoResponse, (i13 & 8) != 0 ? null : str3, list);
    }
}
