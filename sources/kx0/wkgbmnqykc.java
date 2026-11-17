package kx0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import cy0.CommentReferencesDto;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jy0.LoadInfoDto;
import kotlin.jvm.internal.zdlpuopuiu;
import ny0.PromocodeDto;
import px0.OrderPropertiesDto;
import ru.myspar.proloyalty.core.domain.models.LoadInfo;
import ru.myspar.proloyalty.core.domain.models.OrderProperties;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.domain.models.cart.CartBonuses;
import ru.myspar.proloyalty.core.domain.models.cart.CartEvropolis;
import ru.myspar.proloyalty.core.domain.models.cart.CartInfoItem;
import ru.myspar.proloyalty.core.domain.models.cart.CartProgressBar;
import ru.myspar.proloyalty.core.domain.models.cart.CartProgressBarDeliveryTerms;
import ru.myspar.proloyalty.core.domain.models.cart.CartReceiver;
import ru.myspar.proloyalty.core.domain.models.cart.CartSum;
import ru.myspar.proloyalty.core.domain.models.cart.CartUnavailableOrderReason;
import ru.myspar.proloyalty.core.domain.models.cart.DeliveryInfo;
import ru.myspar.proloyalty.core.domain.models.cart.IntervalInfo;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.progress_bar.CartProgressBarRapid;
import ru.myspar.proloyalty.core.models.promocode.Promocode;
import tx0.CartBonusesDto;
import tx0.CartDto;
import tx0.CartEvropolisDto;
import tx0.CartProductDto;
import tx0.CartProgressBarDto;
import tx0.CartProgressDeliveryTermsDto;
import tx0.CartReceiverDto;
import tx0.CartReferencesDto;
import tx0.CartSumDto;
import tx0.CartTotalListItemDto;
import tx0.CartUnavailableOrderReasonDto;
import tx0.DeliveryInfoDto;
import tx0.IntervalInfoDto;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final eablkybsjg f60796iobyxmoadg;

    public wkgbmnqykc(eablkybsjg cartProductDtoToDomainModelMapper) {
        zdlpuopuiu.btonecajqb(cartProductDtoToDomainModelMapper, "cartProductDtoToDomainModelMapper");
        this.f60796iobyxmoadg = cartProductDtoToDomainModelMapper;
    }

    private final CartUnavailableOrderReason btonecajqb(CartUnavailableOrderReasonDto cartUnavailableOrderReasonDto) {
        Boolean canCreateOrder = cartUnavailableOrderReasonDto.getCanCreateOrder();
        boolean zBooleanValue = canCreateOrder != null ? canCreateOrder.booleanValue() : true;
        String textReason = cartUnavailableOrderReasonDto.getTextReason();
        if (textReason == null) {
            textReason = "";
        }
        return new CartUnavailableOrderReason(zBooleanValue, textReason);
    }

    private final IntervalInfo draadjrbmk(IntervalInfoDto intervalInfoDto) {
        return new IntervalInfo(intervalInfoDto.getTitle(), intervalInfoDto.getSubtitle(), intervalInfoDto.getDate(), intervalInfoDto.getTime(), intervalInfoDto.getIsOnlyOne());
    }

    private final CartSum dxjokdxxww(CartSumDto cartSumDto) {
        Double basket = cartSumDto.getBasket();
        double dDoubleValue = basket != null ? basket.doubleValue() : 0.0d;
        Double discount = cartSumDto.getDiscount();
        double dDoubleValue2 = discount != null ? discount.doubleValue() : 0.0d;
        Double delivery = cartSumDto.getDelivery();
        double dDoubleValue3 = delivery != null ? delivery.doubleValue() : 0.0d;
        Double overweight = cartSumDto.getOverweight();
        double dDoubleValue4 = overweight != null ? overweight.doubleValue() : 0.0d;
        Double weight = cartSumDto.getWeight();
        double dDoubleValue5 = weight != null ? weight.doubleValue() : 0.0d;
        Double total = cartSumDto.getTotal();
        double dDoubleValue6 = total != null ? total.doubleValue() : 0.0d;
        Integer count = cartSumDto.getCount();
        return new CartSum(dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, dDoubleValue6, count != null ? count.intValue() : 0);
    }

    private final CartEvropolis eablkybsjg(CartEvropolisDto cartEvropolisDto) {
        return new CartEvropolis(cartEvropolisDto.getProgress(), cartEvropolisDto.getImage(), cartEvropolisDto.getText());
    }

    private final DeliveryInfo gtknphoqwx(DeliveryInfoDto deliveryInfoDto) {
        return new DeliveryInfo(deliveryInfoDto.getTitle(), deliveryInfoDto.getSubtitle(), deliveryInfoDto.getPrice(), DeliveryCode.INSTANCE.iobyxmoadg(deliveryInfoDto.getDeliveryType()), deliveryInfoDto.getShopId());
    }

    private final CartInfoItem gxszxtbevo(CartTotalListItemDto cartTotalListItemDto) {
        String title = cartTotalListItemDto.getTitle();
        if (title == null) {
            title = "";
        }
        String value = cartTotalListItemDto.getValue();
        if (value == null) {
            value = "";
        }
        String tooltip = cartTotalListItemDto.getTooltip();
        return new CartInfoItem(title, value, tooltip != null ? tooltip : "");
    }

    private final CartProgressBar lqeggnwhkg(CartProgressBarDto cartProgressBarDto) {
        String title = cartProgressBarDto.getTitle();
        String str = title == null ? "" : title;
        Double currentValue = cartProgressBarDto.getCurrentValue();
        double dDoubleValue = currentValue != null ? currentValue.doubleValue() : 0.0d;
        Double neededValue = cartProgressBarDto.getNeededValue();
        double dDoubleValue2 = neededValue != null ? neededValue.doubleValue() : 0.0d;
        String valuesDifference = cartProgressBarDto.getValuesDifference();
        String str2 = valuesDifference == null ? "" : valuesDifference;
        String progressColor = cartProgressBarDto.getProgressColor();
        String str3 = progressColor == null ? "" : progressColor;
        CartProgressDeliveryTermsDto deliveryTerms = cartProgressBarDto.getDeliveryTerms();
        return new CartProgressBar(str, dDoubleValue, dDoubleValue2, str2, str3, deliveryTerms != null ? nufgyqmvbu(deliveryTerms) : null);
    }

    private final CartProgressBarDeliveryTerms nufgyqmvbu(CartProgressDeliveryTermsDto cartProgressDeliveryTermsDto) {
        CartProgressDeliveryTermsDto.ReceiptInfoDto receiptInfo = cartProgressDeliveryTermsDto.getReceiptInfo();
        String titleType = receiptInfo != null ? receiptInfo.getTitleType() : null;
        if (titleType == null) {
            titleType = "";
        }
        CartProgressDeliveryTermsDto.ReceiptInfoDto receiptInfo2 = cartProgressDeliveryTermsDto.getReceiptInfo();
        String titlePrice = receiptInfo2 != null ? receiptInfo2.getTitlePrice() : null;
        if (titlePrice == null) {
            titlePrice = "";
        }
        String sumForFreeDelivery = cartProgressDeliveryTermsDto.getSumForFreeDelivery();
        if (sumForFreeDelivery == null) {
            sumForFreeDelivery = "";
        }
        List<CartProgressDeliveryTermsDto.RapidItemDto> rapids = cartProgressDeliveryTermsDto.getRapids();
        if (rapids == null) {
            rapids = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(rapids, 10));
        for (CartProgressDeliveryTermsDto.RapidItemDto rapidItemDto : rapids) {
            String icon = rapidItemDto.getIcon();
            if (icon == null) {
                icon = "";
            }
            String title = rapidItemDto.getTitle();
            if (title == null) {
                title = "";
            }
            List value = rapidItemDto.getValue();
            if (value == null) {
                value = jyumaefscl.wflxmlrfwp();
            }
            arrayList.add(new CartProgressBarRapid(icon, title, value));
        }
        return new CartProgressBarDeliveryTerms(titleType, titlePrice, sumForFreeDelivery, arrayList);
    }

    private final Cart ppxfxbqfkf(CartDto cartDto) {
        ArrayList arrayList;
        List listWflxmlrfwp;
        CartUnavailableOrderReason cartUnavailableOrderReasonIobyxmoadg;
        DeliveryInfo deliveryInfoGtknphoqwx = gtknphoqwx(cartDto.getDeliveryInfo());
        IntervalInfoDto intervalInfoDto = cartDto.getIntervalInfoDto();
        IntervalInfo intervalInfoDraadjrbmk = intervalInfoDto != null ? draadjrbmk(intervalInfoDto) : null;
        String partnerCode = cartDto.getPartnerCode();
        String payment = cartDto.getPayment();
        CartSumDto sum = cartDto.getSum();
        CartSum cartSumDxjokdxxww = sum != null ? dxjokdxxww(sum) : null;
        PromocodeDto promocode = cartDto.getPromocode();
        Promocode promocodeWflxmlrfwp = promocode != null ? wflxmlrfwp(promocode) : null;
        OrderPropertiesDto orderProperties = cartDto.getOrderProperties();
        OrderProperties orderPropertiesZoijcleaow = orderProperties != null ? zoijcleaow(orderProperties) : null;
        List<CartProductDto> basket = cartDto.getBasket();
        if (basket == null) {
            basket = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(basket, 10));
        for (CartProductDto cartProductDto : basket) {
            eablkybsjg eablkybsjgVar = this.f60796iobyxmoadg;
            CartReferencesDto refs = cartDto.getRefs();
            arrayList2.add(eablkybsjgVar.invoke(cartProductDto, refs != null ? refs.getHints() : null));
        }
        Boolean isWalletPayNeedVerify = cartDto.getIsWalletPayNeedVerify();
        CartEvropolisDto evropolis = cartDto.getEvropolis();
        CartEvropolis cartEvropolisEablkybsjg = evropolis != null ? eablkybsjg(evropolis) : null;
        CartBonusesDto bonuses = cartDto.getBonuses();
        CartBonuses cartBonusesWkgbmnqykc = bonuses != null ? wkgbmnqykc(bonuses) : null;
        LoadInfoDto loadInfo = cartDto.getLoadInfo();
        LoadInfo loadInfoIobyxmoadg = loadInfo != null ? jx0.gxszxtbevo.iobyxmoadg(loadInfo) : null;
        CartReceiverDto receiver = cartDto.getReceiver();
        CartReceiver cartReceiverIobyxmoadg = receiver != null ? gxszxtbevo.iobyxmoadg(receiver) : null;
        CartProgressBarDto progressBar = cartDto.getProgressBar();
        CartProgressBar cartProgressBarLqeggnwhkg = progressBar != null ? lqeggnwhkg(progressBar) : null;
        List total = cartDto.getTotal();
        if (total != null) {
            ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(total, 10));
            Iterator it = total.iterator();
            while (it.hasNext()) {
                arrayList3.add(gxszxtbevo((CartTotalListItemDto) it.next()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List selectedComments = cartDto.getSelectedComments();
        if (selectedComments != null) {
            ArrayList arrayList4 = new ArrayList(jyumaefscl.cqumvgiudr(selectedComments, 10));
            Iterator it2 = selectedComments.iterator();
            while (it2.hasNext()) {
                arrayList4.add(lqeggnwhkg.iobyxmoadg((CommentReferencesDto) it2.next()));
            }
            listWflxmlrfwp = arrayList4;
        } else {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        Double orderSum = cartDto.getOrderSum();
        double dDoubleValue = orderSum != null ? orderSum.doubleValue() : 0.0d;
        String orderSumNoDiscounts = cartDto.getOrderSumNoDiscounts();
        if (orderSumNoDiscounts == null) {
            orderSumNoDiscounts = "";
        }
        String str = orderSumNoDiscounts;
        CartUnavailableOrderReasonDto unavailableOrderReason = cartDto.getUnavailableOrderReason();
        if (unavailableOrderReason == null || (cartUnavailableOrderReasonIobyxmoadg = btonecajqb(unavailableOrderReason)) == null) {
            cartUnavailableOrderReasonIobyxmoadg = CartUnavailableOrderReason.INSTANCE.iobyxmoadg();
        }
        CartUnavailableOrderReason cartUnavailableOrderReason = cartUnavailableOrderReasonIobyxmoadg;
        List payments = cartDto.getPayments();
        List listIobyxmoadg = payments != null ? xu0.iobyxmoadg.iobyxmoadg(payments) : null;
        return new Cart(0L, deliveryInfoGtknphoqwx, intervalInfoDraadjrbmk, partnerCode, payment, cartSumDxjokdxxww, promocodeWflxmlrfwp, orderPropertiesZoijcleaow, arrayList2, isWalletPayNeedVerify, false, null, cartEvropolisEablkybsjg, loadInfoIobyxmoadg, cartBonusesWkgbmnqykc, cartReceiverIobyxmoadg, cartProgressBarLqeggnwhkg, arrayList, listWflxmlrfwp, dDoubleValue, str, cartUnavailableOrderReason, listIobyxmoadg == null ? jyumaefscl.wflxmlrfwp() : listIobyxmoadg, null, 8391681, null);
    }

    private final Promocode wflxmlrfwp(PromocodeDto promocodeDto) {
        String value = promocodeDto.getValue();
        if (value == null) {
            value = "";
        }
        Boolean status = promocodeDto.getStatus();
        boolean zBooleanValue = status != null ? status.booleanValue() : false;
        String statusText = promocodeDto.getStatusText();
        return new Promocode(value, zBooleanValue, statusText != null ? statusText : "");
    }

    private final CartBonuses wkgbmnqykc(CartBonusesDto cartBonusesDto) {
        Integer available = cartBonusesDto.getAvailable();
        int iIntValue = available != null ? available.intValue() : 0;
        Integer balance = cartBonusesDto.getBalance();
        int iIntValue2 = balance != null ? balance.intValue() : 0;
        Integer applied = cartBonusesDto.getApplied();
        int iIntValue3 = applied != null ? applied.intValue() : 0;
        String tooltip = cartBonusesDto.getTooltip();
        if (tooltip == null) {
            tooltip = "";
        }
        return new CartBonuses(iIntValue, iIntValue2, iIntValue3, tooltip);
    }

    private final OrderProperties zoijcleaow(OrderPropertiesDto orderPropertiesDto) {
        Double minPrice = orderPropertiesDto.getMinPrice();
        double dDoubleValue = minPrice != null ? minPrice.doubleValue() : 0.0d;
        Double freeDeliveryFrom = orderPropertiesDto.getFreeDeliveryFrom();
        double dDoubleValue2 = freeDeliveryFrom != null ? freeDeliveryFrom.doubleValue() : 0.0d;
        Double basketSum = orderPropertiesDto.getBasketSum();
        return new OrderProperties(dDoubleValue, dDoubleValue2, basketSum != null ? basketSum.doubleValue() : 0.0d);
    }

    public final Cart iobyxmoadg(CartDto cartDto, Warning warning) {
        Cart cart;
        zdlpuopuiu.btonecajqb(warning, "warning");
        if (cartDto == null || (cart = ppxfxbqfkf(cartDto)) == null) {
            cart = new Cart(0L, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 0.0d, null, null, null, null, 16777215, null);
        }
        Cart cart2 = cart;
        return cart2.zoijcleaow((16776959 & 1) != 0 ? cart2.id : 0L, (16776959 & 2) != 0 ? cart2.deliveryInfo : null, (16776959 & 4) != 0 ? cart2.intervalInfo : null, (16776959 & 8) != 0 ? cart2.partnerCode : null, (16776959 & 16) != 0 ? cart2.payment : null, (16776959 & 32) != 0 ? cart2.sum : null, (16776959 & 64) != 0 ? cart2.promocode : null, (16776959 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cart2.orderProperties : null, (16776959 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? cart2.basket : null, (16776959 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cart2.isWalletPayNeedVerify : null, (16776959 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cart2.isMappedValid : false, (16776959 & 2048) != 0 ? cart2.warning : warning, (16776959 & 4096) != 0 ? cart2.evropolis : null, (16776959 & 8192) != 0 ? cart2.loadInfo : null, (16776959 & 16384) != 0 ? cart2.cartBonuses : null, (16776959 & 32768) != 0 ? cart2.receiver : null, (16776959 & 65536) != 0 ? cart2.progressBar : null, (16776959 & 131072) != 0 ? cart2.cartInfoList : null, (16776959 & 262144) != 0 ? cart2.selectedComments : null, (16776959 & 524288) != 0 ? cart2.orderSum : 0.0d, (16776959 & 1048576) != 0 ? cart2.orderSumNoDiscounts : null, (2097152 & 16776959) != 0 ? cart2.unavailableOrderReason : null, (16776959 & 4194304) != 0 ? cart2.payments : null, (16776959 & 8388608) != 0 ? cart2.change : null);
    }
}
