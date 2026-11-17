package kk;

import kotlin.Metadata;
import spay.sdk.data.dto.response.PartsPaymentPlanBnplResponseBodyDto;
import spay.sdk.data.dto.response.PaymentOrderResponseBodyDto;
import spay.sdk.data.dto.response.PaymentPlanBnplResponseBodyDto;
import spay.sdk.data.dto.response.PaymentTokenResponseBodyDto;
import spay.sdk.data.dto.response.SdkAuthResponseBodyDto;
import spay.sdk.data.dto.response.SessionIdResponseBodyDto;
import spay.sdk.data.dto.response.binding.BindingSessionResponseBodyDto;
import spay.sdk.data.dto.response.binding.CreateBindingOtpResponseBodyDto;
import spay.sdk.data.dto.response.listOfCards.ListOfCardsResponseBodyDto;
import spay.sdk.data.dto.response.otp.ConfirmOtpResponseBodyDto;
import spay.sdk.data.dto.response.otp.CreateOtpSdkResponseBodyDto;
import spay.sdk.data.dto.response.spasibo.SpasiboBonusesResponseBodyDto;
import spay.sdk.domain.model.request.BindingSessionIdRequestBody;
import spay.sdk.domain.model.request.ConfirmBindingOtpRequestBody;
import spay.sdk.domain.model.request.ConfirmOtpRequestBody;
import spay.sdk.domain.model.request.CreateBindingOtpRequestBody;
import spay.sdk.domain.model.request.CreateOtpSdkRequestBody;
import spay.sdk.domain.model.request.ListOfCardsRequestBody;
import spay.sdk.domain.model.request.PayBindingOtpRequestBody;
import spay.sdk.domain.model.request.PayOnlineRequestBody;
import spay.sdk.domain.model.request.PaymentBnplPlanRequestBody;
import spay.sdk.domain.model.request.PaymentOrderRequestBody;
import spay.sdk.domain.model.request.PaymentTokenRequestBody;
import spay.sdk.domain.model.request.SdkAuthRequestBody;
import spay.sdk.domain.model.request.SessionIdRequestBody;
import spay.sdk.domain.model.request.SpasiboBonusesRequestBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011J-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u001aH§@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\b\b\u0001\u0010 \u001a\u00020\u001fH§@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00042\b\b\u0001\u0010%\u001a\u00020$H§@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J#\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00042\b\b\u0001\u0010*\u001a\u00020)H§@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J#\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00042\b\b\u0001\u0010*\u001a\u00020)H§@ø\u0001\u0000¢\u0006\u0004\b/\u0010-J#\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00042\b\b\u0001\u00101\u001a\u000200H§@ø\u0001\u0000¢\u0006\u0004\b3\u00104J#\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00042\b\b\u0001\u00106\u001a\u000205H§@ø\u0001\u0000¢\u0006\u0004\b8\u00109J#\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00042\b\b\u0001\u0010;\u001a\u00020:H§@ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u0019\u0010?\u001a\b\u0012\u0004\u0012\u00020&0\u0004H§@ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u001d\u0010A\u001a\u00020&2\b\b\u0001\u0010\u001b\u001a\u00020\u001aH§@ø\u0001\u0000¢\u0006\u0004\bA\u0010\u001eJ#\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00042\b\b\u0001\u0010C\u001a\u00020BH§@ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ#\u0010I\u001a\b\u0012\u0004\u0012\u00020&0\u00042\b\b\u0001\u0010H\u001a\u00020GH§@ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ#\u0010M\u001a\b\u0012\u0004\u0012\u00020&0\u00042\b\b\u0001\u0010L\u001a\u00020KH§@ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006O"}, d2 = {"Lkk/sf;", "", "Lspay/sdk/domain/model/request/SessionIdRequestBody;", "sessionIdRequestBody", "Llm/kcexrzcfyt;", "Lspay/sdk/data/dto/response/SessionIdResponseBodyDto;", "btonecajqb", "(Lspay/sdk/domain/model/request/SessionIdRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/BindingSessionIdRequestBody;", "bindingSessionIdRequestBody", "Lspay/sdk/data/dto/response/binding/BindingSessionResponseBodyDto;", "wflxmlrfwp", "(Lspay/sdk/domain/model/request/BindingSessionIdRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/ListOfCardsRequestBody;", "listOfCardsRequestBody", "Lspay/sdk/data/dto/response/listOfCards/ListOfCardsResponseBodyDto;", "lqeggnwhkg", "(Lspay/sdk/domain/model/request/ListOfCardsRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "eablkybsjg", "Lspay/sdk/domain/model/request/SpasiboBonusesRequestBody;", "spasiboBonusesRequestBody", "", "endPointVersion", "Lspay/sdk/data/dto/response/spasibo/SpasiboBonusesResponseBodyDto;", "vdvldrhtss", "(Lspay/sdk/domain/model/request/SpasiboBonusesRequestBody;Ljava/lang/String;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/PaymentTokenRequestBody;", "paymentTokenRequestBody", "Lspay/sdk/data/dto/response/PaymentTokenResponseBodyDto;", "rgvfuqvkyq", "(Lspay/sdk/domain/model/request/PaymentTokenRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/PaymentOrderRequestBody;", "paymentOrderRequestBody", "Lspay/sdk/data/dto/response/PaymentOrderResponseBodyDto;", "ojitshcjhn", "(Lspay/sdk/domain/model/request/PaymentOrderRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/PayOnlineRequestBody;", "payOnlineRequestBody", "Lgg/wwaezpbzkn;", "draadjrbmk", "(Lspay/sdk/domain/model/request/PayOnlineRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/PaymentBnplPlanRequestBody;", "paymentBnplPlanRequestBody", "Lspay/sdk/data/dto/response/PaymentPlanBnplResponseBodyDto;", "gxszxtbevo", "(Lspay/sdk/domain/model/request/PaymentBnplPlanRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lspay/sdk/data/dto/response/PartsPaymentPlanBnplResponseBodyDto;", "zoijcleaow", "Lspay/sdk/domain/model/request/SdkAuthRequestBody;", "sdkAuthRequestBody", "Lspay/sdk/data/dto/response/SdkAuthResponseBodyDto;", "wkgbmnqykc", "(Lspay/sdk/domain/model/request/SdkAuthRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/ConfirmOtpRequestBody;", "confirmOtpRequestBody", "Lspay/sdk/data/dto/response/otp/ConfirmOtpResponseBodyDto;", "dxjokdxxww", "(Lspay/sdk/domain/model/request/ConfirmOtpRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/CreateOtpSdkRequestBody;", "createOtpSdkRequestBody", "Lspay/sdk/data/dto/response/otp/CreateOtpSdkResponseBodyDto;", "agtfadlqog", "(Lspay/sdk/domain/model/request/CreateOtpSdkRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "iobyxmoadg", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "oxmwwwfdhm", "Lspay/sdk/domain/model/request/CreateBindingOtpRequestBody;", "createBindingOtpRequestBody", "Lspay/sdk/data/dto/response/binding/CreateBindingOtpResponseBodyDto;", "gtknphoqwx", "(Lspay/sdk/domain/model/request/CreateBindingOtpRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/ConfirmBindingOtpRequestBody;", "confirmBindingOtpRequestBody", "ppxfxbqfkf", "(Lspay/sdk/domain/model/request/ConfirmBindingOtpRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lspay/sdk/domain/model/request/PayBindingOtpRequestBody;", "payBindingOtpRequestBody", "nufgyqmvbu", "(Lspay/sdk/domain/model/request/PayBindingOtpRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface sf {
    @om.ojitshcjhn("sdk-gateway/v1/createOtp")
    Object agtfadlqog(@om.iobyxmoadg CreateOtpSdkRequestBody createOtpSdkRequestBody, lg.gxszxtbevo<? super lm.kcexrzcfyt<CreateOtpSdkResponseBodyDto>> gxszxtbevoVar);

    @om.ojitshcjhn("sdk-gateway/v1/sessionId")
    Object btonecajqb(@om.iobyxmoadg SessionIdRequestBody sessionIdRequestBody, lg.gxszxtbevo<? super lm.kcexrzcfyt<SessionIdResponseBodyDto>> gxszxtbevoVar);

    @om.ojitshcjhn("sdk-gateway/v1/payOnline")
    Object draadjrbmk(@om.iobyxmoadg PayOnlineRequestBody payOnlineRequestBody, lg.gxszxtbevo<? super lm.kcexrzcfyt<gg.wwaezpbzkn>> gxszxtbevoVar);

    @om.ojitshcjhn("sdk-gateway/v1/confirmOtp")
    Object dxjokdxxww(@om.iobyxmoadg ConfirmOtpRequestBody confirmOtpRequestBody, lg.gxszxtbevo<? super lm.kcexrzcfyt<ConfirmOtpResponseBodyDto>> gxszxtbevoVar);

    @om.ojitshcjhn("sdk-gateway/v1/listPaymentAccounts")
    Object eablkybsjg(@om.iobyxmoadg ListOfCardsRequestBody listOfCardsRequestBody, lg.gxszxtbevo<? super lm.kcexrzcfyt<ListOfCardsResponseBodyDto>> gxszxtbevoVar);

    @om.ojitshcjhn("sdk-gateway/v1/createBindingOtp")
    Object gtknphoqwx(@om.iobyxmoadg CreateBindingOtpRequestBody createBindingOtpRequestBody, lg.gxszxtbevo<? super lm.kcexrzcfyt<CreateBindingOtpResponseBodyDto>> gxszxtbevoVar);

    @om.ojitshcjhn("sdk-gateway/v2/paymentPlanBnpl")
    Object gxszxtbevo(@om.iobyxmoadg PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, lg.gxszxtbevo<? super lm.kcexrzcfyt<PaymentPlanBnplResponseBodyDto>> gxszxtbevoVar);

    @om.ojitshcjhn("sdk-gateway/v1/revokeTokenSdk")
    Object iobyxmoadg(lg.gxszxtbevo<? super lm.kcexrzcfyt<gg.wwaezpbzkn>> gxszxtbevoVar);

    @om.ojitshcjhn("sdk-gateway/v3/listCards")
    Object lqeggnwhkg(@om.iobyxmoadg ListOfCardsRequestBody listOfCardsRequestBody, lg.gxszxtbevo<? super lm.kcexrzcfyt<ListOfCardsResponseBodyDto>> gxszxtbevoVar);

    @om.ojitshcjhn("sdk-gateway/v1/payBinding")
    Object nufgyqmvbu(@om.iobyxmoadg PayBindingOtpRequestBody payBindingOtpRequestBody, lg.gxszxtbevo<? super lm.kcexrzcfyt<gg.wwaezpbzkn>> gxszxtbevoVar);

    @om.ojitshcjhn("sdk-gateway/v1/paymentOrder")
    Object ojitshcjhn(@om.iobyxmoadg PaymentOrderRequestBody paymentOrderRequestBody, lg.gxszxtbevo<? super lm.kcexrzcfyt<PaymentOrderResponseBodyDto>> gxszxtbevoVar);

    @om.ojitshcjhn("sdk-gateway/v1/paymentToken")
    Object oxmwwwfdhm(@om.iobyxmoadg PaymentTokenRequestBody paymentTokenRequestBody, lg.gxszxtbevo<? super gg.wwaezpbzkn> gxszxtbevoVar);

    @om.ojitshcjhn("sdk-gateway/v1/confirmBindingOtp")
    Object ppxfxbqfkf(@om.iobyxmoadg ConfirmBindingOtpRequestBody confirmBindingOtpRequestBody, lg.gxszxtbevo<? super lm.kcexrzcfyt<gg.wwaezpbzkn>> gxszxtbevoVar);

    @om.ojitshcjhn("sdk-gateway/v1/paymentToken")
    Object rgvfuqvkyq(@om.iobyxmoadg PaymentTokenRequestBody paymentTokenRequestBody, lg.gxszxtbevo<? super lm.kcexrzcfyt<PaymentTokenResponseBodyDto>> gxszxtbevoVar);

    @om.ojitshcjhn("sdk-gateway/{version}/orderSpasiboBonuses")
    Object vdvldrhtss(@om.iobyxmoadg SpasiboBonusesRequestBody spasiboBonusesRequestBody, @om.kcexrzcfyt("version") String str, lg.gxszxtbevo<? super lm.kcexrzcfyt<SpasiboBonusesResponseBodyDto>> gxszxtbevoVar);

    @om.ojitshcjhn("sdk-gateway/v1/bindingSession")
    Object wflxmlrfwp(@om.iobyxmoadg BindingSessionIdRequestBody bindingSessionIdRequestBody, lg.gxszxtbevo<? super lm.kcexrzcfyt<BindingSessionResponseBodyDto>> gxszxtbevoVar);

    @om.ojitshcjhn("sberpay-auth/v2/sdkAuth")
    Object wkgbmnqykc(@om.iobyxmoadg SdkAuthRequestBody sdkAuthRequestBody, lg.gxszxtbevo<? super lm.kcexrzcfyt<SdkAuthResponseBodyDto>> gxszxtbevoVar);

    @om.ojitshcjhn("sdk-gateway/v1/createPaymentPlan")
    Object zoijcleaow(@om.iobyxmoadg PaymentBnplPlanRequestBody paymentBnplPlanRequestBody, lg.gxszxtbevo<? super lm.kcexrzcfyt<PartsPaymentPlanBnplResponseBodyDto>> gxszxtbevoVar);
}
