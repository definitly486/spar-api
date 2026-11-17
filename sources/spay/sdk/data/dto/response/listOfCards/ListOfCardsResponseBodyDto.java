package spay.sdk.data.dto.response.listOfCards;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.pd;
import spay.sdk.data.dto.response.AmountDataDto;
import spay.sdk.data.dto.response.DataDtoInterface;
import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000689:;<=BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003JQ\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\b\u00105\u001a\u00020\u0002H\u0016J\t\u00106\u001a\u000207HÖ\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006>"}, d2 = {"Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody;", "paymentToolInfoDto", "Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$PaymentToolInfoDto;", "merchantInfoDto", "Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$MerchantInfoDto;", "formInfoDto", "Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$FormInfoDto;", "promoInfoDto", "Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$PromoInfoDto;", "orderInfoDto", "Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$OrderInfoDto;", "userInfoDto", "Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$UserInfoDto;", "(Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$PaymentToolInfoDto;Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$MerchantInfoDto;Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$FormInfoDto;Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$PromoInfoDto;Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$OrderInfoDto;Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$UserInfoDto;)V", "getFormInfoDto", "()Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$FormInfoDto;", "setFormInfoDto", "(Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$FormInfoDto;)V", "getMerchantInfoDto", "()Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$MerchantInfoDto;", "setMerchantInfoDto", "(Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$MerchantInfoDto;)V", "getOrderInfoDto", "()Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$OrderInfoDto;", "setOrderInfoDto", "(Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$OrderInfoDto;)V", "getPaymentToolInfoDto", "()Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$PaymentToolInfoDto;", "setPaymentToolInfoDto", "(Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$PaymentToolInfoDto;)V", "getPromoInfoDto", "()Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$PromoInfoDto;", "setPromoInfoDto", "(Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$PromoInfoDto;)V", "getUserInfoDto", "()Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$UserInfoDto;", "setUserInfoDto", "(Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$UserInfoDto;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "", "FormInfoDto", "MerchantInfoDto", "OrderInfoDto", "PaymentToolInfoDto", "PromoInfoDto", "UserInfoDto", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ListOfCardsResponseBodyDto implements DataDtoInterface<ListOfCardsResponseBody> {

    @ppxfxbqfkf("formInfo")
    private FormInfoDto formInfoDto;

    @ppxfxbqfkf("merchantInfo")
    private MerchantInfoDto merchantInfoDto;

    @ppxfxbqfkf("orderInfo")
    private OrderInfoDto orderInfoDto;

    @ppxfxbqfkf("paymentToolInfo")
    private PaymentToolInfoDto paymentToolInfoDto;

    @ppxfxbqfkf("promoInfo")
    private PromoInfoDto promoInfoDto;

    @ppxfxbqfkf("userInfo")
    private UserInfoDto userInfoDto;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$FormInfoDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$FormInfo;", "notEnoughBalanceText", "", "onlyPartPayText", "(Ljava/lang/String;Ljava/lang/String;)V", "getNotEnoughBalanceText", "()Ljava/lang/String;", "getOnlyPartPayText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FormInfoDto implements DataDtoInterface<ListOfCardsResponseBody.FormInfo> {

        @ppxfxbqfkf("notEnoughBalanceText")
        private final String notEnoughBalanceText;

        @ppxfxbqfkf("onlyPartPayText")
        private final String onlyPartPayText;

        public FormInfoDto(String str, String str2) {
            this.notEnoughBalanceText = str;
            this.onlyPartPayText = str2;
        }

        public static /* synthetic */ FormInfoDto copy$default(FormInfoDto formInfoDto, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = formInfoDto.notEnoughBalanceText;
            }
            if ((i13 & 2) != 0) {
                str2 = formInfoDto.onlyPartPayText;
            }
            return formInfoDto.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getNotEnoughBalanceText() {
            return this.notEnoughBalanceText;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getOnlyPartPayText() {
            return this.onlyPartPayText;
        }

        public final FormInfoDto copy(String notEnoughBalanceText, String onlyPartPayText) {
            return new FormInfoDto(notEnoughBalanceText, onlyPartPayText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormInfoDto)) {
                return false;
            }
            FormInfoDto formInfoDto = (FormInfoDto) other;
            return zdlpuopuiu.eablkybsjg(this.notEnoughBalanceText, formInfoDto.notEnoughBalanceText) && zdlpuopuiu.eablkybsjg(this.onlyPartPayText, formInfoDto.onlyPartPayText);
        }

        public final String getNotEnoughBalanceText() {
            return this.notEnoughBalanceText;
        }

        public final String getOnlyPartPayText() {
            return this.onlyPartPayText;
        }

        public int hashCode() {
            String str = this.notEnoughBalanceText;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.onlyPartPayText;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "FormInfoDto(notEnoughBalanceText=" + this.notEnoughBalanceText + ", onlyPartPayText=" + this.onlyPartPayText + ")";
        }

        @Override // spay.sdk.data.dto.response.DataDtoInterface
        public ListOfCardsResponseBody.FormInfo toModel() {
            return new ListOfCardsResponseBody.FormInfo(this.notEnoughBalanceText, this.onlyPartPayText);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\tJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J>\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\b\u0010\"\u001a\u00020\u0002H\u0016J\t\u0010#\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012¨\u0006$"}, d2 = {"Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$MerchantInfoDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$MerchantInfo;", "merchantName", "", "merchantLogoUrl", "bindingIsNeeded", "", "bindingSafeText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getBindingIsNeeded", "()Ljava/lang/Boolean;", "setBindingIsNeeded", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getBindingSafeText", "()Ljava/lang/String;", "setBindingSafeText", "(Ljava/lang/String;)V", "getMerchantLogoUrl", "setMerchantLogoUrl", "getMerchantName", "setMerchantName", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$MerchantInfoDto;", "equals", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class MerchantInfoDto implements DataDtoInterface<ListOfCardsResponseBody.MerchantInfo> {

        @ppxfxbqfkf("bindingIsNeeded")
        private Boolean bindingIsNeeded;

        @ppxfxbqfkf("bindingSafeText")
        private String bindingSafeText;

        @ppxfxbqfkf("logoUrl")
        private String merchantLogoUrl;

        @ppxfxbqfkf("merchantName")
        private String merchantName;

        public MerchantInfoDto() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ MerchantInfoDto copy$default(MerchantInfoDto merchantInfoDto, String str, String str2, Boolean bool, String str3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = merchantInfoDto.merchantName;
            }
            if ((i13 & 2) != 0) {
                str2 = merchantInfoDto.merchantLogoUrl;
            }
            if ((i13 & 4) != 0) {
                bool = merchantInfoDto.bindingIsNeeded;
            }
            if ((i13 & 8) != 0) {
                str3 = merchantInfoDto.bindingSafeText;
            }
            return merchantInfoDto.copy(str, str2, bool, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMerchantName() {
            return this.merchantName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getBindingIsNeeded() {
            return this.bindingIsNeeded;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getBindingSafeText() {
            return this.bindingSafeText;
        }

        public final MerchantInfoDto copy(String merchantName, String merchantLogoUrl, Boolean bindingIsNeeded, String bindingSafeText) {
            return new MerchantInfoDto(merchantName, merchantLogoUrl, bindingIsNeeded, bindingSafeText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MerchantInfoDto)) {
                return false;
            }
            MerchantInfoDto merchantInfoDto = (MerchantInfoDto) other;
            return zdlpuopuiu.eablkybsjg(this.merchantName, merchantInfoDto.merchantName) && zdlpuopuiu.eablkybsjg(this.merchantLogoUrl, merchantInfoDto.merchantLogoUrl) && zdlpuopuiu.eablkybsjg(this.bindingIsNeeded, merchantInfoDto.bindingIsNeeded) && zdlpuopuiu.eablkybsjg(this.bindingSafeText, merchantInfoDto.bindingSafeText);
        }

        public final Boolean getBindingIsNeeded() {
            return this.bindingIsNeeded;
        }

        public final String getBindingSafeText() {
            return this.bindingSafeText;
        }

        public final String getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        public final String getMerchantName() {
            return this.merchantName;
        }

        public int hashCode() {
            String str = this.merchantName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.merchantLogoUrl;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.bindingIsNeeded;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.bindingSafeText;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setBindingIsNeeded(Boolean bool) {
            this.bindingIsNeeded = bool;
        }

        public final void setBindingSafeText(String str) {
            this.bindingSafeText = str;
        }

        public final void setMerchantLogoUrl(String str) {
            this.merchantLogoUrl = str;
        }

        public final void setMerchantName(String str) {
            this.merchantName = str;
        }

        public String toString() {
            return "MerchantInfoDto(merchantName=" + this.merchantName + ", merchantLogoUrl=" + this.merchantLogoUrl + ", bindingIsNeeded=" + this.bindingIsNeeded + ", bindingSafeText=" + this.bindingSafeText + ")";
        }

        public MerchantInfoDto(String str, String str2, Boolean bool, String str3) {
            this.merchantName = str;
            this.merchantLogoUrl = str2;
            this.bindingIsNeeded = bool;
            this.bindingSafeText = str3;
        }

        @Override // spay.sdk.data.dto.response.DataDtoInterface
        public ListOfCardsResponseBody.MerchantInfo toModel() {
            String str = this.merchantName;
            String str2 = this.merchantLogoUrl;
            Boolean boolValueOf = Boolean.valueOf(zdlpuopuiu.eablkybsjg(this.bindingIsNeeded, Boolean.TRUE));
            String str3 = this.bindingSafeText;
            if (str3 == null) {
                str3 = "";
            }
            return new ListOfCardsResponseBody.MerchantInfo(str, str2, boolValueOf, str3);
        }

        public /* synthetic */ MerchantInfoDto(String str, String str2, Boolean bool, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : bool, (i13 & 8) != 0 ? null : str3);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$OrderInfoDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo;", "orderAmountDto", "Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$OrderInfoDto$OrderAmountDto;", "(Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$OrderInfoDto$OrderAmountDto;)V", "getOrderAmountDto", "()Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$OrderInfoDto$OrderAmountDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "", "OrderAmountDto", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class OrderInfoDto implements DataDtoInterface<ListOfCardsResponseBody.OrderInfo> {

        @ppxfxbqfkf("orderAmount")
        private final OrderAmountDto orderAmountDto;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$OrderInfoDto$OrderAmountDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo$OrderAmount;", "amount", "", "currency", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$OrderInfoDto$OrderAmountDto;", "equals", "", "other", "", "hashCode", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class OrderAmountDto implements DataDtoInterface<ListOfCardsResponseBody.OrderInfo.OrderAmount> {

            @ppxfxbqfkf("amount")
            private final Integer amount;

            @ppxfxbqfkf("currency")
            private final String currency;

            public OrderAmountDto(Integer num, String str) {
                this.amount = num;
                this.currency = str;
            }

            public static /* synthetic */ OrderAmountDto copy$default(OrderAmountDto orderAmountDto, Integer num, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    num = orderAmountDto.amount;
                }
                if ((i13 & 2) != 0) {
                    str = orderAmountDto.currency;
                }
                return orderAmountDto.copy(num, str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Integer getAmount() {
                return this.amount;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getCurrency() {
                return this.currency;
            }

            public final OrderAmountDto copy(Integer amount, String currency) {
                return new OrderAmountDto(amount, currency);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OrderAmountDto)) {
                    return false;
                }
                OrderAmountDto orderAmountDto = (OrderAmountDto) other;
                return zdlpuopuiu.eablkybsjg(this.amount, orderAmountDto.amount) && zdlpuopuiu.eablkybsjg(this.currency, orderAmountDto.currency);
            }

            public final Integer getAmount() {
                return this.amount;
            }

            public final String getCurrency() {
                return this.currency;
            }

            public int hashCode() {
                Integer num = this.amount;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.currency;
                return iHashCode + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                return "OrderAmountDto(amount=" + this.amount + ", currency=" + this.currency + ")";
            }

            @Override // spay.sdk.data.dto.response.DataDtoInterface
            public ListOfCardsResponseBody.OrderInfo.OrderAmount toModel() {
                Integer num = this.amount;
                if (num == null) {
                    throw new pd("amount");
                }
                int iIntValue = num.intValue();
                String str = this.currency;
                if (str == null) {
                    throw new pd("currency");
                }
                zdlpuopuiu.btonecajqb(str, "<this>");
                return new ListOfCardsResponseBody.OrderInfo.OrderAmount(iIntValue, zdlpuopuiu.eablkybsjg(str, "643") ? "₽" : "");
            }
        }

        public OrderInfoDto(OrderAmountDto orderAmountDto) {
            this.orderAmountDto = orderAmountDto;
        }

        public static /* synthetic */ OrderInfoDto copy$default(OrderInfoDto orderInfoDto, OrderAmountDto orderAmountDto, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                orderAmountDto = orderInfoDto.orderAmountDto;
            }
            return orderInfoDto.copy(orderAmountDto);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final OrderAmountDto getOrderAmountDto() {
            return this.orderAmountDto;
        }

        public final OrderInfoDto copy(OrderAmountDto orderAmountDto) {
            return new OrderInfoDto(orderAmountDto);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OrderInfoDto) && zdlpuopuiu.eablkybsjg(this.orderAmountDto, ((OrderInfoDto) other).orderAmountDto);
        }

        public final OrderAmountDto getOrderAmountDto() {
            return this.orderAmountDto;
        }

        public int hashCode() {
            OrderAmountDto orderAmountDto = this.orderAmountDto;
            if (orderAmountDto == null) {
                return 0;
            }
            return orderAmountDto.hashCode();
        }

        public String toString() {
            return "OrderInfoDto(orderAmountDto=" + this.orderAmountDto + ")";
        }

        @Override // spay.sdk.data.dto.response.DataDtoInterface
        public ListOfCardsResponseBody.OrderInfo toModel() {
            OrderAmountDto orderAmountDto = this.orderAmountDto;
            return new ListOfCardsResponseBody.OrderInfo(orderAmountDto != null ? orderAmountDto.toModel() : null);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB)\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000bJ8\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\b\u0010\u000bR\u001e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$PaymentToolInfoDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo;", "toolList", "", "Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$PaymentToolInfoDto$ToolDto;", "additionalCards", "", "isSpPaymentToolsNeedUpdate", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAdditionalCards", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getToolList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$PaymentToolInfoDto;", "equals", "other", "", "hashCode", "", "toModel", "toString", "", "ToolDto", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PaymentToolInfoDto implements DataDtoInterface<ListOfCardsResponseBody.PaymentToolInfo> {

        @ppxfxbqfkf("additionalCards")
        private final Boolean additionalCards;

        @ppxfxbqfkf("isSpPaymentToolsNeedUpdate")
        private final Boolean isSpPaymentToolsNeedUpdate;

        @ppxfxbqfkf("paymentToolList")
        private final List<ToolDto> toolList;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u009f\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0014J\u0010\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00108\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010$Jª\u0001\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020\u00042\b\u0010F\u001a\u0004\u0018\u00010GHÖ\u0003J\t\u0010H\u001a\u00020\fHÖ\u0001J\b\u0010I\u001a\u00020\u0002H\u0016J\t\u0010J\u001a\u00020\u0006HÖ\u0001R \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R \u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b\u000e\u0010$\"\u0004\b%\u0010&R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b\u0003\u0010$\"\u0004\b(\u0010&R\"\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b)\u0010 \"\u0004\b*\u0010+R \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001cR \u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010\u001cR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b2\u0010$\"\u0004\b3\u0010&R \u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001a\"\u0004\b5\u0010\u001c¨\u0006K"}, d2 = {"Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$PaymentToolInfoDto$ToolDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo$Tool;", "isSpPaymentToolsPriority", "", "precalculateBonuses", "", "paymentSourceType", "financialProductId", "cardLogoUrl", "productName", "paymentId", "", "cardNumber", "isSpPaymentTools", "countAdditionalCards", "amountData", "Lspay/sdk/data/dto/response/AmountDataDto;", "priorityCard", "paymentSystemType", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lspay/sdk/data/dto/response/AmountDataDto;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAmountData", "()Lspay/sdk/data/dto/response/AmountDataDto;", "setAmountData", "(Lspay/sdk/data/dto/response/AmountDataDto;)V", "getCardLogoUrl", "()Ljava/lang/String;", "setCardLogoUrl", "(Ljava/lang/String;)V", "getCardNumber", "setCardNumber", "getCountAdditionalCards", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFinancialProductId", "setFinancialProductId", "()Ljava/lang/Boolean;", "setSpPaymentTools", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setSpPaymentToolsPriority", "getPaymentId", "setPaymentId", "(Ljava/lang/Integer;)V", "getPaymentSourceType", "setPaymentSourceType", "getPaymentSystemType", "setPaymentSystemType", "getPrecalculateBonuses", "setPrecalculateBonuses", "getPriorityCard", "setPriorityCard", "getProductName", "setProductName", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lspay/sdk/data/dto/response/AmountDataDto;Ljava/lang/Boolean;Ljava/lang/String;)Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$PaymentToolInfoDto$ToolDto;", "equals", "other", "", "hashCode", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class ToolDto implements DataDtoInterface<ListOfCardsResponseBody.PaymentToolInfo.Tool> {

            @ppxfxbqfkf("amountData")
            private AmountDataDto amountData;

            @ppxfxbqfkf("cardLogoUrl")
            private String cardLogoUrl;

            @ppxfxbqfkf("cardNumber")
            private String cardNumber;

            @ppxfxbqfkf("countAdditionalCards")
            private final Integer countAdditionalCards;

            @ppxfxbqfkf("financialProductId")
            private String financialProductId;

            @ppxfxbqfkf("isSpPaymentTools")
            private Boolean isSpPaymentTools;

            @ppxfxbqfkf("isSpPaymentToolsPriority")
            private Boolean isSpPaymentToolsPriority;

            @ppxfxbqfkf("paymentId")
            private Integer paymentId;

            @ppxfxbqfkf("paymentSourceType")
            private String paymentSourceType;

            @ppxfxbqfkf("paymentSystemType")
            private String paymentSystemType;

            @ppxfxbqfkf("precalculateBonuses")
            private String precalculateBonuses;

            @ppxfxbqfkf("priorityCard")
            private Boolean priorityCard;

            @ppxfxbqfkf("productName")
            private String productName;

            public ToolDto(Boolean bool, String str, String str2, String str3, String str4, String str5, Integer num, String str6, Boolean bool2, Integer num2, AmountDataDto amountDataDto, Boolean bool3, String str7) {
                this.isSpPaymentToolsPriority = bool;
                this.precalculateBonuses = str;
                this.paymentSourceType = str2;
                this.financialProductId = str3;
                this.cardLogoUrl = str4;
                this.productName = str5;
                this.paymentId = num;
                this.cardNumber = str6;
                this.isSpPaymentTools = bool2;
                this.countAdditionalCards = num2;
                this.amountData = amountDataDto;
                this.priorityCard = bool3;
                this.paymentSystemType = str7;
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Boolean getIsSpPaymentToolsPriority() {
                return this.isSpPaymentToolsPriority;
            }

            /* JADX INFO: renamed from: component10, reason: from getter */
            public final Integer getCountAdditionalCards() {
                return this.countAdditionalCards;
            }

            /* JADX INFO: renamed from: component11, reason: from getter */
            public final AmountDataDto getAmountData() {
                return this.amountData;
            }

            /* JADX INFO: renamed from: component12, reason: from getter */
            public final Boolean getPriorityCard() {
                return this.priorityCard;
            }

            /* JADX INFO: renamed from: component13, reason: from getter */
            public final String getPaymentSystemType() {
                return this.paymentSystemType;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getPrecalculateBonuses() {
                return this.precalculateBonuses;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getPaymentSourceType() {
                return this.paymentSourceType;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getFinancialProductId() {
                return this.financialProductId;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getCardLogoUrl() {
                return this.cardLogoUrl;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final String getProductName() {
                return this.productName;
            }

            /* JADX INFO: renamed from: component7, reason: from getter */
            public final Integer getPaymentId() {
                return this.paymentId;
            }

            /* JADX INFO: renamed from: component8, reason: from getter */
            public final String getCardNumber() {
                return this.cardNumber;
            }

            /* JADX INFO: renamed from: component9, reason: from getter */
            public final Boolean getIsSpPaymentTools() {
                return this.isSpPaymentTools;
            }

            public final ToolDto copy(Boolean isSpPaymentToolsPriority, String precalculateBonuses, String paymentSourceType, String financialProductId, String cardLogoUrl, String productName, Integer paymentId, String cardNumber, Boolean isSpPaymentTools, Integer countAdditionalCards, AmountDataDto amountData, Boolean priorityCard, String paymentSystemType) {
                return new ToolDto(isSpPaymentToolsPriority, precalculateBonuses, paymentSourceType, financialProductId, cardLogoUrl, productName, paymentId, cardNumber, isSpPaymentTools, countAdditionalCards, amountData, priorityCard, paymentSystemType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ToolDto)) {
                    return false;
                }
                ToolDto toolDto = (ToolDto) other;
                return zdlpuopuiu.eablkybsjg(this.isSpPaymentToolsPriority, toolDto.isSpPaymentToolsPriority) && zdlpuopuiu.eablkybsjg(this.precalculateBonuses, toolDto.precalculateBonuses) && zdlpuopuiu.eablkybsjg(this.paymentSourceType, toolDto.paymentSourceType) && zdlpuopuiu.eablkybsjg(this.financialProductId, toolDto.financialProductId) && zdlpuopuiu.eablkybsjg(this.cardLogoUrl, toolDto.cardLogoUrl) && zdlpuopuiu.eablkybsjg(this.productName, toolDto.productName) && zdlpuopuiu.eablkybsjg(this.paymentId, toolDto.paymentId) && zdlpuopuiu.eablkybsjg(this.cardNumber, toolDto.cardNumber) && zdlpuopuiu.eablkybsjg(this.isSpPaymentTools, toolDto.isSpPaymentTools) && zdlpuopuiu.eablkybsjg(this.countAdditionalCards, toolDto.countAdditionalCards) && zdlpuopuiu.eablkybsjg(this.amountData, toolDto.amountData) && zdlpuopuiu.eablkybsjg(this.priorityCard, toolDto.priorityCard) && zdlpuopuiu.eablkybsjg(this.paymentSystemType, toolDto.paymentSystemType);
            }

            public final AmountDataDto getAmountData() {
                return this.amountData;
            }

            public final String getCardLogoUrl() {
                return this.cardLogoUrl;
            }

            public final String getCardNumber() {
                return this.cardNumber;
            }

            public final Integer getCountAdditionalCards() {
                return this.countAdditionalCards;
            }

            public final String getFinancialProductId() {
                return this.financialProductId;
            }

            public final Integer getPaymentId() {
                return this.paymentId;
            }

            public final String getPaymentSourceType() {
                return this.paymentSourceType;
            }

            public final String getPaymentSystemType() {
                return this.paymentSystemType;
            }

            public final String getPrecalculateBonuses() {
                return this.precalculateBonuses;
            }

            public final Boolean getPriorityCard() {
                return this.priorityCard;
            }

            public final String getProductName() {
                return this.productName;
            }

            public int hashCode() {
                Boolean bool = this.isSpPaymentToolsPriority;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                String str = this.precalculateBonuses;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.paymentSourceType;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.financialProductId;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.cardLogoUrl;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.productName;
                int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                Integer num = this.paymentId;
                int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
                String str6 = this.cardNumber;
                int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
                Boolean bool2 = this.isSpPaymentTools;
                int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Integer num2 = this.countAdditionalCards;
                int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
                AmountDataDto amountDataDto = this.amountData;
                int iHashCode11 = (iHashCode10 + (amountDataDto == null ? 0 : amountDataDto.hashCode())) * 31;
                Boolean bool3 = this.priorityCard;
                int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                String str7 = this.paymentSystemType;
                return iHashCode12 + (str7 != null ? str7.hashCode() : 0);
            }

            public final Boolean isSpPaymentTools() {
                return this.isSpPaymentTools;
            }

            public final Boolean isSpPaymentToolsPriority() {
                return this.isSpPaymentToolsPriority;
            }

            public final void setAmountData(AmountDataDto amountDataDto) {
                this.amountData = amountDataDto;
            }

            public final void setCardLogoUrl(String str) {
                this.cardLogoUrl = str;
            }

            public final void setCardNumber(String str) {
                this.cardNumber = str;
            }

            public final void setFinancialProductId(String str) {
                this.financialProductId = str;
            }

            public final void setPaymentId(Integer num) {
                this.paymentId = num;
            }

            public final void setPaymentSourceType(String str) {
                this.paymentSourceType = str;
            }

            public final void setPaymentSystemType(String str) {
                this.paymentSystemType = str;
            }

            public final void setPrecalculateBonuses(String str) {
                this.precalculateBonuses = str;
            }

            public final void setPriorityCard(Boolean bool) {
                this.priorityCard = bool;
            }

            public final void setProductName(String str) {
                this.productName = str;
            }

            public final void setSpPaymentTools(Boolean bool) {
                this.isSpPaymentTools = bool;
            }

            public final void setSpPaymentToolsPriority(Boolean bool) {
                this.isSpPaymentToolsPriority = bool;
            }

            public String toString() {
                return "ToolDto(isSpPaymentToolsPriority=" + this.isSpPaymentToolsPriority + ", precalculateBonuses=" + this.precalculateBonuses + ", paymentSourceType=" + this.paymentSourceType + ", financialProductId=" + this.financialProductId + ", cardLogoUrl=" + this.cardLogoUrl + ", productName=" + this.productName + ", paymentId=" + this.paymentId + ", cardNumber=" + this.cardNumber + ", isSpPaymentTools=" + this.isSpPaymentTools + ", countAdditionalCards=" + this.countAdditionalCards + ", amountData=" + this.amountData + ", priorityCard=" + this.priorityCard + ", paymentSystemType=" + this.paymentSystemType + ")";
            }

            @Override // spay.sdk.data.dto.response.DataDtoInterface
            public ListOfCardsResponseBody.PaymentToolInfo.Tool toModel() {
                String str = this.productName;
                if (str == null) {
                    throw new pd("productName");
                }
                Integer num = this.paymentId;
                if (num == null) {
                    throw new pd("paymentId");
                }
                int iIntValue = num.intValue();
                Boolean bool = this.priorityCard;
                if (bool == null) {
                    throw new pd("priorityCard");
                }
                boolean zBooleanValue = bool.booleanValue();
                String str2 = this.paymentSourceType;
                if (str2 == null) {
                    throw new pd("paymentSourceType");
                }
                String str3 = this.financialProductId;
                String str4 = this.cardNumber;
                String str5 = this.paymentSystemType;
                String str6 = this.cardLogoUrl;
                Integer num2 = this.countAdditionalCards;
                Boolean bool2 = this.isSpPaymentTools;
                Boolean bool3 = this.isSpPaymentToolsPriority;
                String str7 = this.precalculateBonuses;
                AmountDataDto amountDataDto = this.amountData;
                return new ListOfCardsResponseBody.PaymentToolInfo.Tool(str, iIntValue, zBooleanValue, str2, str3, str4, str5, str6, num2, bool2, bool3, str7, amountDataDto != null ? amountDataDto.toModel() : null);
            }

            public /* synthetic */ ToolDto(Boolean bool, String str, String str2, String str3, String str4, String str5, Integer num, String str6, Boolean bool2, Integer num2, AmountDataDto amountDataDto, Boolean bool3, String str7, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? null : num, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str6, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : bool2, num2, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : amountDataDto, (i13 & 2048) != 0 ? null : bool3, (i13 & 4096) != 0 ? null : str7);
            }
        }

        public PaymentToolInfoDto(List<ToolDto> list, Boolean bool, Boolean bool2) {
            this.toolList = list;
            this.additionalCards = bool;
            this.isSpPaymentToolsNeedUpdate = bool2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentToolInfoDto copy$default(PaymentToolInfoDto paymentToolInfoDto, List list, Boolean bool, Boolean bool2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = paymentToolInfoDto.toolList;
            }
            if ((i13 & 2) != 0) {
                bool = paymentToolInfoDto.additionalCards;
            }
            if ((i13 & 4) != 0) {
                bool2 = paymentToolInfoDto.isSpPaymentToolsNeedUpdate;
            }
            return paymentToolInfoDto.copy(list, bool, bool2);
        }

        public final List<ToolDto> component1() {
            return this.toolList;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getAdditionalCards() {
            return this.additionalCards;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getIsSpPaymentToolsNeedUpdate() {
            return this.isSpPaymentToolsNeedUpdate;
        }

        public final PaymentToolInfoDto copy(List<ToolDto> toolList, Boolean additionalCards, Boolean isSpPaymentToolsNeedUpdate) {
            return new PaymentToolInfoDto(toolList, additionalCards, isSpPaymentToolsNeedUpdate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentToolInfoDto)) {
                return false;
            }
            PaymentToolInfoDto paymentToolInfoDto = (PaymentToolInfoDto) other;
            return zdlpuopuiu.eablkybsjg(this.toolList, paymentToolInfoDto.toolList) && zdlpuopuiu.eablkybsjg(this.additionalCards, paymentToolInfoDto.additionalCards) && zdlpuopuiu.eablkybsjg(this.isSpPaymentToolsNeedUpdate, paymentToolInfoDto.isSpPaymentToolsNeedUpdate);
        }

        public final Boolean getAdditionalCards() {
            return this.additionalCards;
        }

        public final List<ToolDto> getToolList() {
            return this.toolList;
        }

        public int hashCode() {
            List<ToolDto> list = this.toolList;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            Boolean bool = this.additionalCards;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isSpPaymentToolsNeedUpdate;
            return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final Boolean isSpPaymentToolsNeedUpdate() {
            return this.isSpPaymentToolsNeedUpdate;
        }

        public String toString() {
            return "PaymentToolInfoDto(toolList=" + this.toolList + ", additionalCards=" + this.additionalCards + ", isSpPaymentToolsNeedUpdate=" + this.isSpPaymentToolsNeedUpdate + ")";
        }

        @Override // spay.sdk.data.dto.response.DataDtoInterface
        public ListOfCardsResponseBody.PaymentToolInfo toModel() {
            List<ToolDto> list = this.toolList;
            return new ListOfCardsResponseBody.PaymentToolInfo(list != null ? ListOfCardsResponseBodyDtoKt.toModelList(list) : null, this.additionalCards, this.isSpPaymentToolsNeedUpdate);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002R&\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$PromoInfoDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo;", "hint", "", "bannerList", "", "Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$PromoInfoDto$BannerDataDto;", "(Ljava/lang/String;Ljava/util/List;)V", "getBannerList", "()Ljava/util/List;", "setBannerList", "(Ljava/util/List;)V", "getHint", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "toModelList", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo$BannerData;", "BannerDataDto", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PromoInfoDto implements DataDtoInterface<ListOfCardsResponseBody.PromoInfo> {

        @ppxfxbqfkf("bannerList")
        private List<BannerDataDto> bannerList;

        @ppxfxbqfkf("hint")
        private final String hint;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,BS\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003JW\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\b\u0010*\u001a\u00020\u0002H\u0016J\t\u0010+\u001a\u00020\u0004HÖ\u0001R&\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R \u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014¨\u0006-"}, d2 = {"Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$PromoInfoDto$BannerDataDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo$BannerData;", "iconUrl", "", "buttons", "", "Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$PromoInfoDto$BannerDataDto$ButtonsDto;", "hint", "type", "header", "text", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtons", "()Ljava/util/List;", "setButtons", "(Ljava/util/List;)V", "getHeader", "()Ljava/lang/String;", "setHeader", "(Ljava/lang/String;)V", "getHint", "setHint", "getIconUrl", "setIconUrl", "getText", "setText", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "ButtonsDto", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class BannerDataDto implements DataDtoInterface<ListOfCardsResponseBody.PromoInfo.BannerData> {

            @ppxfxbqfkf("buttons")
            private List<ButtonsDto> buttons;

            @ppxfxbqfkf("header")
            private String header;

            @ppxfxbqfkf("hint")
            private String hint;

            @ppxfxbqfkf("iconUrl")
            private String iconUrl;

            @ppxfxbqfkf("text")
            private String text;

            @ppxfxbqfkf("type")
            private String type;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$PromoInfoDto$BannerDataDto$ButtonsDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo$BannerData$Buttons;", "type", "", "deeplinkAndroid", "title", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeeplinkAndroid", "()Ljava/lang/String;", "setDeeplinkAndroid", "(Ljava/lang/String;)V", "getTitle", "setTitle", "getType", "setType", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class ButtonsDto implements DataDtoInterface<ListOfCardsResponseBody.PromoInfo.BannerData.Buttons> {

                @ppxfxbqfkf("deeplinkAndroid")
                private String deeplinkAndroid;

                @ppxfxbqfkf("title")
                private String title;

                @ppxfxbqfkf("type")
                private String type;

                public ButtonsDto() {
                    this(null, null, null, 7, null);
                }

                public static /* synthetic */ ButtonsDto copy$default(ButtonsDto buttonsDto, String str, String str2, String str3, int i13, Object obj) {
                    if ((i13 & 1) != 0) {
                        str = buttonsDto.type;
                    }
                    if ((i13 & 2) != 0) {
                        str2 = buttonsDto.deeplinkAndroid;
                    }
                    if ((i13 & 4) != 0) {
                        str3 = buttonsDto.title;
                    }
                    return buttonsDto.copy(str, str2, str3);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getType() {
                    return this.type;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getDeeplinkAndroid() {
                    return this.deeplinkAndroid;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                public final ButtonsDto copy(String type, String deeplinkAndroid, String title) {
                    return new ButtonsDto(type, deeplinkAndroid, title);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ButtonsDto)) {
                        return false;
                    }
                    ButtonsDto buttonsDto = (ButtonsDto) other;
                    return zdlpuopuiu.eablkybsjg(this.type, buttonsDto.type) && zdlpuopuiu.eablkybsjg(this.deeplinkAndroid, buttonsDto.deeplinkAndroid) && zdlpuopuiu.eablkybsjg(this.title, buttonsDto.title);
                }

                public final String getDeeplinkAndroid() {
                    return this.deeplinkAndroid;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getType() {
                    return this.type;
                }

                public int hashCode() {
                    String str = this.type;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.deeplinkAndroid;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.title;
                    return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
                }

                public final void setDeeplinkAndroid(String str) {
                    this.deeplinkAndroid = str;
                }

                public final void setTitle(String str) {
                    this.title = str;
                }

                public final void setType(String str) {
                    this.type = str;
                }

                public String toString() {
                    return "ButtonsDto(type=" + this.type + ", deeplinkAndroid=" + this.deeplinkAndroid + ", title=" + this.title + ")";
                }

                public ButtonsDto(String str, String str2, String str3) {
                    this.type = str;
                    this.deeplinkAndroid = str2;
                    this.title = str3;
                }

                @Override // spay.sdk.data.dto.response.DataDtoInterface
                public ListOfCardsResponseBody.PromoInfo.BannerData.Buttons toModel() {
                    String str = this.type;
                    if (str != null) {
                        return new ListOfCardsResponseBody.PromoInfo.BannerData.Buttons(str, this.title, this.deeplinkAndroid);
                    }
                    throw new pd("type");
                }

                public /* synthetic */ ButtonsDto(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
                    this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
                }
            }

            public BannerDataDto() {
                this(null, null, null, null, null, null, 63, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ BannerDataDto copy$default(BannerDataDto bannerDataDto, String str, List list, String str2, String str3, String str4, String str5, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = bannerDataDto.iconUrl;
                }
                if ((i13 & 2) != 0) {
                    list = bannerDataDto.buttons;
                }
                List list2 = list;
                if ((i13 & 4) != 0) {
                    str2 = bannerDataDto.hint;
                }
                String str6 = str2;
                if ((i13 & 8) != 0) {
                    str3 = bannerDataDto.type;
                }
                String str7 = str3;
                if ((i13 & 16) != 0) {
                    str4 = bannerDataDto.header;
                }
                String str8 = str4;
                if ((i13 & 32) != 0) {
                    str5 = bannerDataDto.text;
                }
                return bannerDataDto.copy(str, list2, str6, str7, str8, str5);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getIconUrl() {
                return this.iconUrl;
            }

            public final List<ButtonsDto> component2() {
                return this.buttons;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getHint() {
                return this.hint;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getHeader() {
                return this.header;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final BannerDataDto copy(String iconUrl, List<ButtonsDto> buttons, String hint, String type, String header, String text) {
                return new BannerDataDto(iconUrl, buttons, hint, type, header, text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BannerDataDto)) {
                    return false;
                }
                BannerDataDto bannerDataDto = (BannerDataDto) other;
                return zdlpuopuiu.eablkybsjg(this.iconUrl, bannerDataDto.iconUrl) && zdlpuopuiu.eablkybsjg(this.buttons, bannerDataDto.buttons) && zdlpuopuiu.eablkybsjg(this.hint, bannerDataDto.hint) && zdlpuopuiu.eablkybsjg(this.type, bannerDataDto.type) && zdlpuopuiu.eablkybsjg(this.header, bannerDataDto.header) && zdlpuopuiu.eablkybsjg(this.text, bannerDataDto.text);
            }

            public final List<ButtonsDto> getButtons() {
                return this.buttons;
            }

            public final String getHeader() {
                return this.header;
            }

            public final String getHint() {
                return this.hint;
            }

            public final String getIconUrl() {
                return this.iconUrl;
            }

            public final String getText() {
                return this.text;
            }

            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                String str = this.iconUrl;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                List<ButtonsDto> list = this.buttons;
                int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
                String str2 = this.hint;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.type;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.header;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.text;
                return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
            }

            public final void setButtons(List<ButtonsDto> list) {
                this.buttons = list;
            }

            public final void setHeader(String str) {
                this.header = str;
            }

            public final void setHint(String str) {
                this.hint = str;
            }

            public final void setIconUrl(String str) {
                this.iconUrl = str;
            }

            public final void setText(String str) {
                this.text = str;
            }

            public final void setType(String str) {
                this.type = str;
            }

            public String toString() {
                return "BannerDataDto(iconUrl=" + this.iconUrl + ", buttons=" + this.buttons + ", hint=" + this.hint + ", type=" + this.type + ", header=" + this.header + ", text=" + this.text + ")";
            }

            public BannerDataDto(String str, List<ButtonsDto> list, String str2, String str3, String str4, String str5) {
                this.iconUrl = str;
                this.buttons = list;
                this.hint = str2;
                this.type = str3;
                this.header = str4;
                this.text = str5;
            }

            @Override // spay.sdk.data.dto.response.DataDtoInterface
            public ListOfCardsResponseBody.PromoInfo.BannerData toModel() {
                String str = this.type;
                if (str == null) {
                    throw new pd("type");
                }
                String str2 = this.hint;
                String str3 = this.header;
                String str4 = this.text;
                String str5 = this.iconUrl;
                List<ButtonsDto> list = this.buttons;
                return new ListOfCardsResponseBody.PromoInfo.BannerData(str, str2, str3, str4, str5, list != null ? ListOfCardsResponseBodyDtoKt.toButtonsModelList(list) : null);
            }

            public /* synthetic */ BannerDataDto(String str, List list, String str2, String str3, String str4, String str5, int i13, gtknphoqwx gtknphoqwxVar) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : list, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5);
            }
        }

        public PromoInfoDto(String str, List<BannerDataDto> list) {
            this.hint = str;
            this.bannerList = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PromoInfoDto copy$default(PromoInfoDto promoInfoDto, String str, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = promoInfoDto.hint;
            }
            if ((i13 & 2) != 0) {
                list = promoInfoDto.bannerList;
            }
            return promoInfoDto.copy(str, list);
        }

        private final List<ListOfCardsResponseBody.PromoInfo.BannerData> toModelList(List<BannerDataDto> list) {
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((BannerDataDto) it.next()).toModel());
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        public final List<BannerDataDto> component2() {
            return this.bannerList;
        }

        public final PromoInfoDto copy(String hint, List<BannerDataDto> bannerList) {
            return new PromoInfoDto(hint, bannerList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PromoInfoDto)) {
                return false;
            }
            PromoInfoDto promoInfoDto = (PromoInfoDto) other;
            return zdlpuopuiu.eablkybsjg(this.hint, promoInfoDto.hint) && zdlpuopuiu.eablkybsjg(this.bannerList, promoInfoDto.bannerList);
        }

        public final List<BannerDataDto> getBannerList() {
            return this.bannerList;
        }

        public final String getHint() {
            return this.hint;
        }

        public int hashCode() {
            String str = this.hint;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<BannerDataDto> list = this.bannerList;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public final void setBannerList(List<BannerDataDto> list) {
            this.bannerList = list;
        }

        public String toString() {
            return "PromoInfoDto(hint=" + this.hint + ", bannerList=" + this.bannerList + ")";
        }

        @Override // spay.sdk.data.dto.response.DataDtoInterface
        public ListOfCardsResponseBody.PromoInfo toModel() {
            String str = this.hint;
            List<BannerDataDto> list = this.bannerList;
            return new ListOfCardsResponseBody.PromoInfo(str, list != null ? toModelList(list) : null);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$UserInfoDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$UserInfo;", "lastName", "", "firstName", "gender", "", "sub", "ucpId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "getGender", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLastName", "getSub", "getUcpId", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto$UserInfoDto;", "equals", "", "other", "", "hashCode", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class UserInfoDto implements DataDtoInterface<ListOfCardsResponseBody.UserInfo> {

        @ppxfxbqfkf("firstName")
        private final String firstName;

        @ppxfxbqfkf("gender")
        private final Integer gender;

        @ppxfxbqfkf("lastName")
        private final String lastName;

        @ppxfxbqfkf("sub")
        private final String sub;

        @ppxfxbqfkf("ucpId")
        private final String ucpId;

        public UserInfoDto(String str, String str2, Integer num, String str3, String str4) {
            this.lastName = str;
            this.firstName = str2;
            this.gender = num;
            this.sub = str3;
            this.ucpId = str4;
        }

        public static /* synthetic */ UserInfoDto copy$default(UserInfoDto userInfoDto, String str, String str2, Integer num, String str3, String str4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = userInfoDto.lastName;
            }
            if ((i13 & 2) != 0) {
                str2 = userInfoDto.firstName;
            }
            String str5 = str2;
            if ((i13 & 4) != 0) {
                num = userInfoDto.gender;
            }
            Integer num2 = num;
            if ((i13 & 8) != 0) {
                str3 = userInfoDto.sub;
            }
            String str6 = str3;
            if ((i13 & 16) != 0) {
                str4 = userInfoDto.ucpId;
            }
            return userInfoDto.copy(str, str5, num2, str6, str4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getGender() {
            return this.gender;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getSub() {
            return this.sub;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getUcpId() {
            return this.ucpId;
        }

        public final UserInfoDto copy(String lastName, String firstName, Integer gender, String sub, String ucpId) {
            return new UserInfoDto(lastName, firstName, gender, sub, ucpId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserInfoDto)) {
                return false;
            }
            UserInfoDto userInfoDto = (UserInfoDto) other;
            return zdlpuopuiu.eablkybsjg(this.lastName, userInfoDto.lastName) && zdlpuopuiu.eablkybsjg(this.firstName, userInfoDto.firstName) && zdlpuopuiu.eablkybsjg(this.gender, userInfoDto.gender) && zdlpuopuiu.eablkybsjg(this.sub, userInfoDto.sub) && zdlpuopuiu.eablkybsjg(this.ucpId, userInfoDto.ucpId);
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final Integer getGender() {
            return this.gender;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public final String getSub() {
            return this.sub;
        }

        public final String getUcpId() {
            return this.ucpId;
        }

        public int hashCode() {
            String str = this.lastName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.firstName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.gender;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.sub;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.ucpId;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "UserInfoDto(lastName=" + this.lastName + ", firstName=" + this.firstName + ", gender=" + this.gender + ", sub=" + this.sub + ", ucpId=" + this.ucpId + ")";
        }

        @Override // spay.sdk.data.dto.response.DataDtoInterface
        public ListOfCardsResponseBody.UserInfo toModel() {
            String str = this.lastName;
            if (str == null) {
                throw new pd("lastName");
            }
            String str2 = this.firstName;
            if (str2 != null) {
                return new ListOfCardsResponseBody.UserInfo(str, str2, this.gender, this.sub, this.ucpId);
            }
            throw new pd("firstName");
        }
    }

    public ListOfCardsResponseBodyDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ ListOfCardsResponseBodyDto copy$default(ListOfCardsResponseBodyDto listOfCardsResponseBodyDto, PaymentToolInfoDto paymentToolInfoDto, MerchantInfoDto merchantInfoDto, FormInfoDto formInfoDto, PromoInfoDto promoInfoDto, OrderInfoDto orderInfoDto, UserInfoDto userInfoDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            paymentToolInfoDto = listOfCardsResponseBodyDto.paymentToolInfoDto;
        }
        if ((i13 & 2) != 0) {
            merchantInfoDto = listOfCardsResponseBodyDto.merchantInfoDto;
        }
        MerchantInfoDto merchantInfoDto2 = merchantInfoDto;
        if ((i13 & 4) != 0) {
            formInfoDto = listOfCardsResponseBodyDto.formInfoDto;
        }
        FormInfoDto formInfoDto2 = formInfoDto;
        if ((i13 & 8) != 0) {
            promoInfoDto = listOfCardsResponseBodyDto.promoInfoDto;
        }
        PromoInfoDto promoInfoDto2 = promoInfoDto;
        if ((i13 & 16) != 0) {
            orderInfoDto = listOfCardsResponseBodyDto.orderInfoDto;
        }
        OrderInfoDto orderInfoDto2 = orderInfoDto;
        if ((i13 & 32) != 0) {
            userInfoDto = listOfCardsResponseBodyDto.userInfoDto;
        }
        return listOfCardsResponseBodyDto.copy(paymentToolInfoDto, merchantInfoDto2, formInfoDto2, promoInfoDto2, orderInfoDto2, userInfoDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PaymentToolInfoDto getPaymentToolInfoDto() {
        return this.paymentToolInfoDto;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MerchantInfoDto getMerchantInfoDto() {
        return this.merchantInfoDto;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FormInfoDto getFormInfoDto() {
        return this.formInfoDto;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PromoInfoDto getPromoInfoDto() {
        return this.promoInfoDto;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OrderInfoDto getOrderInfoDto() {
        return this.orderInfoDto;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final UserInfoDto getUserInfoDto() {
        return this.userInfoDto;
    }

    public final ListOfCardsResponseBodyDto copy(PaymentToolInfoDto paymentToolInfoDto, MerchantInfoDto merchantInfoDto, FormInfoDto formInfoDto, PromoInfoDto promoInfoDto, OrderInfoDto orderInfoDto, UserInfoDto userInfoDto) {
        return new ListOfCardsResponseBodyDto(paymentToolInfoDto, merchantInfoDto, formInfoDto, promoInfoDto, orderInfoDto, userInfoDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListOfCardsResponseBodyDto)) {
            return false;
        }
        ListOfCardsResponseBodyDto listOfCardsResponseBodyDto = (ListOfCardsResponseBodyDto) other;
        return zdlpuopuiu.eablkybsjg(this.paymentToolInfoDto, listOfCardsResponseBodyDto.paymentToolInfoDto) && zdlpuopuiu.eablkybsjg(this.merchantInfoDto, listOfCardsResponseBodyDto.merchantInfoDto) && zdlpuopuiu.eablkybsjg(this.formInfoDto, listOfCardsResponseBodyDto.formInfoDto) && zdlpuopuiu.eablkybsjg(this.promoInfoDto, listOfCardsResponseBodyDto.promoInfoDto) && zdlpuopuiu.eablkybsjg(this.orderInfoDto, listOfCardsResponseBodyDto.orderInfoDto) && zdlpuopuiu.eablkybsjg(this.userInfoDto, listOfCardsResponseBodyDto.userInfoDto);
    }

    public final FormInfoDto getFormInfoDto() {
        return this.formInfoDto;
    }

    public final MerchantInfoDto getMerchantInfoDto() {
        return this.merchantInfoDto;
    }

    public final OrderInfoDto getOrderInfoDto() {
        return this.orderInfoDto;
    }

    public final PaymentToolInfoDto getPaymentToolInfoDto() {
        return this.paymentToolInfoDto;
    }

    public final PromoInfoDto getPromoInfoDto() {
        return this.promoInfoDto;
    }

    public final UserInfoDto getUserInfoDto() {
        return this.userInfoDto;
    }

    public int hashCode() {
        PaymentToolInfoDto paymentToolInfoDto = this.paymentToolInfoDto;
        int iHashCode = (paymentToolInfoDto == null ? 0 : paymentToolInfoDto.hashCode()) * 31;
        MerchantInfoDto merchantInfoDto = this.merchantInfoDto;
        int iHashCode2 = (iHashCode + (merchantInfoDto == null ? 0 : merchantInfoDto.hashCode())) * 31;
        FormInfoDto formInfoDto = this.formInfoDto;
        int iHashCode3 = (iHashCode2 + (formInfoDto == null ? 0 : formInfoDto.hashCode())) * 31;
        PromoInfoDto promoInfoDto = this.promoInfoDto;
        int iHashCode4 = (iHashCode3 + (promoInfoDto == null ? 0 : promoInfoDto.hashCode())) * 31;
        OrderInfoDto orderInfoDto = this.orderInfoDto;
        int iHashCode5 = (iHashCode4 + (orderInfoDto == null ? 0 : orderInfoDto.hashCode())) * 31;
        UserInfoDto userInfoDto = this.userInfoDto;
        return iHashCode5 + (userInfoDto != null ? userInfoDto.hashCode() : 0);
    }

    public final void setFormInfoDto(FormInfoDto formInfoDto) {
        this.formInfoDto = formInfoDto;
    }

    public final void setMerchantInfoDto(MerchantInfoDto merchantInfoDto) {
        this.merchantInfoDto = merchantInfoDto;
    }

    public final void setOrderInfoDto(OrderInfoDto orderInfoDto) {
        this.orderInfoDto = orderInfoDto;
    }

    public final void setPaymentToolInfoDto(PaymentToolInfoDto paymentToolInfoDto) {
        this.paymentToolInfoDto = paymentToolInfoDto;
    }

    public final void setPromoInfoDto(PromoInfoDto promoInfoDto) {
        this.promoInfoDto = promoInfoDto;
    }

    public final void setUserInfoDto(UserInfoDto userInfoDto) {
        this.userInfoDto = userInfoDto;
    }

    public String toString() {
        return "ListOfCardsResponseBodyDto(paymentToolInfoDto=" + this.paymentToolInfoDto + ", merchantInfoDto=" + this.merchantInfoDto + ", formInfoDto=" + this.formInfoDto + ", promoInfoDto=" + this.promoInfoDto + ", orderInfoDto=" + this.orderInfoDto + ", userInfoDto=" + this.userInfoDto + ")";
    }

    public ListOfCardsResponseBodyDto(PaymentToolInfoDto paymentToolInfoDto, MerchantInfoDto merchantInfoDto, FormInfoDto formInfoDto, PromoInfoDto promoInfoDto, OrderInfoDto orderInfoDto, UserInfoDto userInfoDto) {
        this.paymentToolInfoDto = paymentToolInfoDto;
        this.merchantInfoDto = merchantInfoDto;
        this.formInfoDto = formInfoDto;
        this.promoInfoDto = promoInfoDto;
        this.orderInfoDto = orderInfoDto;
        this.userInfoDto = userInfoDto;
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    public ListOfCardsResponseBody toModel() {
        ListOfCardsResponseBody.UserInfo model;
        ListOfCardsResponseBody.OrderInfo model2;
        ListOfCardsResponseBody.PaymentToolInfo model3;
        UserInfoDto userInfoDto = this.userInfoDto;
        if (userInfoDto == null || (model = userInfoDto.toModel()) == null) {
            throw new pd("userInfoDto");
        }
        OrderInfoDto orderInfoDto = this.orderInfoDto;
        if (orderInfoDto == null || (model2 = orderInfoDto.toModel()) == null) {
            throw new pd("userInfoDto");
        }
        PaymentToolInfoDto paymentToolInfoDto = this.paymentToolInfoDto;
        if (paymentToolInfoDto == null || (model3 = paymentToolInfoDto.toModel()) == null) {
            throw new pd("paymentToolInfoDto");
        }
        MerchantInfoDto merchantInfoDto = this.merchantInfoDto;
        ListOfCardsResponseBody.MerchantInfo model4 = merchantInfoDto != null ? merchantInfoDto.toModel() : null;
        PromoInfoDto promoInfoDto = this.promoInfoDto;
        ListOfCardsResponseBody.PromoInfo model5 = promoInfoDto != null ? promoInfoDto.toModel() : null;
        FormInfoDto formInfoDto = this.formInfoDto;
        return new ListOfCardsResponseBody(model, model2, model3, model4, null, model5, formInfoDto != null ? formInfoDto.toModel() : null, 16, null);
    }

    public /* synthetic */ ListOfCardsResponseBodyDto(PaymentToolInfoDto paymentToolInfoDto, MerchantInfoDto merchantInfoDto, FormInfoDto formInfoDto, PromoInfoDto promoInfoDto, OrderInfoDto orderInfoDto, UserInfoDto userInfoDto, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : paymentToolInfoDto, (i13 & 2) != 0 ? null : merchantInfoDto, (i13 & 4) != 0 ? null : formInfoDto, (i13 & 8) != 0 ? null : promoInfoDto, (i13 & 16) != 0 ? null : orderInfoDto, (i13 & 32) != 0 ? null : userInfoDto);
    }
}
