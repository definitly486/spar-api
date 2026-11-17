package qy;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import kz.ChangeBasketLimitDto;
import oy.lqeggnwhkg;
import oy.nufgyqmvbu;
import ru.myspar.components.payment.api.models.PaymentCode;
import ru.myspar.core.domain.models.delivery.Delivery;
import ru.myspar.core.domain.models.order.FutureProduct;
import ru.myspar.core.domain.models.order.Order;
import ru.myspar.core.domain.models.order.OrderPartner;
import ru.myspar.core.domain.models.order.OrderPayment;
import ru.myspar.core.domain.models.order.OrderProduct;
import ru.myspar.core.domain.models.order.OrderStatus;
import ru.myspar.core.domain.models.order.OrderTotalInfoItem;
import ru.myspar.core.domain.models.order.Purchase;
import ru.myspar.core.domain.models.order.PurchaseFuture;
import ru.myspar.core.domain.models.order.PurchaseHistoryProduct;
import ru.myspar.core.domain.models.order.Purchases;
import ru.myspar.core.domain.models.order.edit.OrderEditBonuses;
import ru.myspar.core.domain.models.order.edit.OrderSum;
import ru.myspar.core.domain.models.order.productreplacement.ReplaceData;
import ru.myspar.core.domain.models.recipient.Recipient;
import ru.myspar.core.models.Warning;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import ru.myspar.core.models.paging.Paging;
import sz.ChangeOrderInfoDto;
import sz.DeliveryDto;
import sz.FutureProductDto;
import sz.OrderDetailsDto;
import sz.OrderDto;
import sz.OrderEditCartSumDto;
import sz.OrderEditOrderPropertiesDto;
import sz.OrderEditProductsDto;
import sz.OrderEditPropertiesDto;
import sz.OrderEditReferencesDto;
import sz.OrderEditResultDto;
import sz.OrderPartnerDto;
import sz.OrderPaymentDto;
import sz.OrderProductDto;
import sz.OrderSumDto;
import sz.OrderTotalItemInfoDto;
import sz.OrdersDto;
import sz.PurchaseFutureDto;
import sz.PurchaseHistoryDetailsDto;
import sz.PurchaseHistoryDto;
import sz.PurchaseProductDto;
import sz.PurchasesDto;
import sz.RecipientDto;
import sz.ReplaceDto;
import uy.OrderBonusesDto;
import vz.PromocodeDto;
import y30.PagingDto;
import zy.CartReferencesDto;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final DateTimeFormatter f80964eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dt.zoijcleaow f80965iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final nufgyqmvbu f80966ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final DateTimeFormatter f80967wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lqeggnwhkg f80968zoijcleaow;

    public gxszxtbevo(dt.zoijcleaow dateUtils, lqeggnwhkg measureTypeModelMapper, nufgyqmvbu productLimitMapper) {
        zdlpuopuiu.btonecajqb(dateUtils, "dateUtils");
        zdlpuopuiu.btonecajqb(measureTypeModelMapper, "measureTypeModelMapper");
        zdlpuopuiu.btonecajqb(productLimitMapper, "productLimitMapper");
        this.f80965iobyxmoadg = dateUtils;
        this.f80968zoijcleaow = measureTypeModelMapper;
        this.f80966ppxfxbqfkf = productLimitMapper;
        this.f80967wkgbmnqykc = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        this.f80964eablkybsjg = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    }

    private final e10.wkgbmnqykc agtfadlqog(OrderEditOrderPropertiesDto orderEditOrderPropertiesDto) {
        Double minPrice = orderEditOrderPropertiesDto.getMinPrice();
        double dDoubleValue = minPrice != null ? minPrice.doubleValue() : 0.0d;
        dt.zoijcleaow zoijcleaowVar = this.f80965iobyxmoadg;
        String dateLeft = orderEditOrderPropertiesDto.getDateLeft();
        if (dateLeft == null) {
            dateLeft = "";
        }
        DateTimeFormatter orderEditDateFormatter = this.f80967wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(orderEditDateFormatter, "orderEditDateFormatter");
        return new e10.wkgbmnqykc(dDoubleValue, zoijcleaowVar.ppxfxbqfkf(dateLeft, orderEditDateFormatter));
    }

    private final List btonecajqb(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(cdpycssgdh((ReplaceDto) it.next()));
        }
        return arrayList;
    }

    private final ReplaceData cdpycssgdh(ReplaceDto replaceDto) {
        String id2 = replaceDto.getId();
        String name = replaceDto.getName();
        double quantity = replaceDto.getQuantity();
        MeasureTypeModel measureTypeModelIobyxmoadg = this.f80968zoijcleaow.iobyxmoadg(replaceDto.getMeasure());
        double price = replaceDto.getPrice();
        String pic = replaceDto.getPic();
        Double rating = replaceDto.getRating();
        Integer reviews = replaceDto.getReviews();
        int iIntValue = reviews != null ? reviews.intValue() : 0;
        String country = replaceDto.getCountry();
        String str = country == null ? "" : country;
        String region = replaceDto.getRegion();
        String str2 = region == null ? "" : region;
        String countryFlagEmoji = replaceDto.getCountryFlagEmoji();
        return new ReplaceData(id2, name, quantity, measureTypeModelIobyxmoadg, price, pic, rating, iIntValue, str, str2, countryFlagEmoji == null ? "" : countryFlagEmoji);
    }

    private final Purchase cqumvgiudr(PurchaseHistoryDetailsDto purchaseHistoryDetailsDto) {
        List listWflxmlrfwp;
        PurchaseHistoryDto purchaseInfo = purchaseHistoryDetailsDto.getPurchaseInfo();
        List products = purchaseInfo.getProducts();
        if (products != null) {
            listWflxmlrfwp = new ArrayList(jyumaefscl.cqumvgiudr(products, 10));
            Iterator it = products.iterator();
            while (it.hasNext()) {
                listWflxmlrfwp.add(wwaezpbzkn((PurchaseProductDto) it.next()));
            }
        } else {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        List list = listWflxmlrfwp;
        String id2 = purchaseInfo.getId();
        String str = id2 == null ? "" : id2;
        dt.zoijcleaow zoijcleaowVar = this.f80965iobyxmoadg;
        String dateCreate = purchaseInfo.getDateCreate();
        DateTimeFormatter purchasesDateFormatter = this.f80964eablkybsjg;
        zdlpuopuiu.dxjokdxxww(purchasesDateFormatter, "purchasesDateFormatter");
        LocalDateTime localDateTimePpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf(dateCreate, purchasesDateFormatter);
        OrderStatus.Companion companion = OrderStatus.INSTANCE;
        String statusId = purchaseInfo.getStatusId();
        if (statusId == null) {
            statusId = "";
        }
        OrderStatus orderStatusIobyxmoadg = companion.iobyxmoadg(statusId);
        boolean canRepeat = purchaseInfo.getCanRepeat();
        Float bonuses = purchaseInfo.getBonuses();
        String deliveryType = purchaseInfo.getDeliveryType();
        Double price = purchaseInfo.getPrice();
        double dDoubleValue = price != null ? price.doubleValue() : 0.0d;
        String address = purchaseInfo.getAddress();
        return new Purchase(str, localDateTimePpxfxbqfkf, orderStatusIobyxmoadg, canRepeat, bonuses, null, deliveryType, dDoubleValue, address == null ? "" : address, 0, list, null, 2592, null);
    }

    private final e10.iobyxmoadg draadjrbmk(OrderEditResultDto orderEditResultDto, String str, Warning warning) {
        e10.nufgyqmvbu nufgyqmvbuVar;
        e10.lqeggnwhkg lqeggnwhkgVar;
        e10.wkgbmnqykc wkgbmnqykcVar;
        ArrayList arrayList;
        List listWflxmlrfwp;
        List hints;
        e10.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp;
        OrderEditPropertiesDto properties = orderEditResultDto.getProperties();
        if (properties == null || (nufgyqmvbuVar = vdvldrhtss(properties)) == null) {
            nufgyqmvbuVar = new e10.nufgyqmvbu(null, null, null, null, null, null, null, null, null, 511, null);
        }
        e10.nufgyqmvbu nufgyqmvbuVar2 = nufgyqmvbuVar;
        OrderEditCartSumDto sum = orderEditResultDto.getSum();
        e10.ppxfxbqfkf ppxfxbqfkfVar = (sum == null || (ppxfxbqfkfVarWflxmlrfwp = wflxmlrfwp(sum)) == null) ? new e10.ppxfxbqfkf(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0.0d, 0.0d, 511, null) : ppxfxbqfkfVarWflxmlrfwp;
        PromocodeDto promocode = orderEditResultDto.getPromocode();
        if (promocode == null || (lqeggnwhkgVar = rgvfuqvkyq(promocode)) == null) {
            lqeggnwhkgVar = new e10.lqeggnwhkg(null, false, 3, null);
        }
        e10.lqeggnwhkg lqeggnwhkgVar2 = lqeggnwhkgVar;
        OrderEditOrderPropertiesDto orderProperties = orderEditResultDto.getOrderProperties();
        if (orderProperties == null || (wkgbmnqykcVar = agtfadlqog(orderProperties)) == null) {
            wkgbmnqykcVar = new e10.wkgbmnqykc(0.0d, null, 3, null);
        }
        e10.wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar;
        List<OrderEditProductsDto> basket = orderEditResultDto.getBasket();
        if (basket == null) {
            basket = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(basket, 10));
        for (OrderEditProductsDto orderEditProductsDto : basket) {
            OrderEditReferencesDto refs = orderEditResultDto.getRefs();
            if (refs == null || (hints = refs.getHints()) == null) {
                listWflxmlrfwp = null;
            } else {
                List hints2 = orderEditProductsDto.getHints();
                if (hints2 == null) {
                    hints2 = jyumaefscl.wflxmlrfwp();
                }
                listWflxmlrfwp = mq.iobyxmoadg.eablkybsjg(hints, hints2);
            }
            if (listWflxmlrfwp == null) {
                listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
            }
            arrayList2.add(ojitshcjhn(orderEditProductsDto, listWflxmlrfwp));
        }
        String shopId = orderEditResultDto.getShopId();
        String str2 = shopId == null ? "" : shopId;
        OrderStatus orderStatusIobyxmoadg = OrderStatus.INSTANCE.iobyxmoadg(orderEditResultDto.getStatusId());
        String deliveryArea = orderEditResultDto.getDeliveryArea();
        PaymentCode.Companion companion = PaymentCode.INSTANCE;
        String payment = orderEditResultDto.getPayment();
        if (payment == null) {
            payment = "";
        }
        PaymentCode paymentCodeIobyxmoadg = companion.iobyxmoadg(payment);
        DeliveryCode deliveryCodeIobyxmoadg = DeliveryCode.INSTANCE.iobyxmoadg(orderEditResultDto.getDelivery());
        OrderBonusesDto bonuses = orderEditResultDto.getBonuses();
        OrderEditBonuses orderEditBonusesZynmafqrjb = bonuses != null ? zynmafqrjb(bonuses) : null;
        String groups = orderEditResultDto.getGroups();
        String str3 = groups == null ? "" : groups;
        List totalInfo = orderEditResultDto.getTotalInfo();
        if (totalInfo != null) {
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(totalInfo, 10));
            Iterator it = totalInfo.iterator();
            while (it.hasNext()) {
                arrayList.add(iwizpuwonk((OrderTotalItemInfoDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        List listWflxmlrfwp2 = arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList;
        List payments = orderEditResultDto.getPayments();
        List listIobyxmoadg = payments != null ? dw.iobyxmoadg.iobyxmoadg(payments) : null;
        return new e10.iobyxmoadg(str, null, orderStatusIobyxmoadg, str2, deliveryArea, paymentCodeIobyxmoadg, nufgyqmvbuVar2, ppxfxbqfkfVar, deliveryCodeIobyxmoadg, lqeggnwhkgVar2, wkgbmnqykcVar2, arrayList2, warning, orderEditBonusesZynmafqrjb, str3, listWflxmlrfwp2, listIobyxmoadg == null ? jyumaefscl.wflxmlrfwp() : listIobyxmoadg, 2, null);
    }

    private final List dxjokdxxww(List list, Integer num) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(esjtqupxsv((PurchaseHistoryDto) it.next(), num));
        }
        return arrayList;
    }

    private final Purchase esjtqupxsv(PurchaseHistoryDto purchaseHistoryDto, Integer num) {
        String id2 = purchaseHistoryDto.getId();
        String str = id2 == null ? "" : id2;
        dt.zoijcleaow zoijcleaowVar = this.f80965iobyxmoadg;
        String dateCreate = purchaseHistoryDto.getDateCreate();
        DateTimeFormatter purchasesDateFormatter = this.f80964eablkybsjg;
        zdlpuopuiu.dxjokdxxww(purchasesDateFormatter, "purchasesDateFormatter");
        LocalDateTime localDateTimePpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf(dateCreate, purchasesDateFormatter);
        OrderStatus.Companion companion = OrderStatus.INSTANCE;
        String statusId = purchaseHistoryDto.getStatusId();
        if (statusId == null) {
            statusId = "";
        }
        OrderStatus orderStatusIobyxmoadg = companion.iobyxmoadg(statusId);
        boolean canRepeat = purchaseHistoryDto.getCanRepeat();
        Float bonuses = purchaseHistoryDto.getBonuses();
        Float appliedBonuses = purchaseHistoryDto.getAppliedBonuses();
        String deliveryType = purchaseHistoryDto.getDeliveryType();
        Double price = purchaseHistoryDto.getPrice();
        double dDoubleValue = price != null ? price.doubleValue() : 0.0d;
        String address = purchaseHistoryDto.getAddress();
        String str2 = address == null ? "" : address;
        int iIntValue = num != null ? num.intValue() : 1;
        String npsUrl = purchaseHistoryDto.getNpsUrl();
        return new Purchase(str, localDateTimePpxfxbqfkf, orderStatusIobyxmoadg, canRepeat, bonuses, appliedBonuses, deliveryType, dDoubleValue, str2, iIntValue, null, npsUrl == null ? "" : npsUrl, UserVerificationMethods.USER_VERIFY_ALL, null);
    }

    private final c10.eablkybsjg gtknphoqwx(OrdersDto ordersDto) {
        Paging paging;
        List listNufgyqmvbu = nufgyqmvbu(ordersDto.getOrders());
        if (listNufgyqmvbu == null) {
            listNufgyqmvbu = jyumaefscl.wflxmlrfwp();
        }
        PagingDto paging2 = ordersDto.getPaging();
        if (paging2 == null || (paging = y30.zoijcleaow.iobyxmoadg(paging2)) == null) {
            paging = new Paging(0, 0, 0, 7, null);
        }
        return new c10.eablkybsjg(listNufgyqmvbu, paging, eablkybsjg.iobyxmoadg(ordersDto.getOrderReferences()));
    }

    static /* synthetic */ Order iozdgvuglv(gxszxtbevo gxszxtbevoVar, OrderDto orderDto, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = null;
        }
        return gxszxtbevoVar.kcexrzcfyt(orderDto, list);
    }

    private final OrderSum istkbnxepw(OrderSumDto orderSumDto) {
        Double products = orderSumDto.getProducts();
        double dDoubleValue = products != null ? products.doubleValue() : 0.0d;
        Double discount = orderSumDto.getDiscount();
        double dDoubleValue2 = discount != null ? discount.doubleValue() : 0.0d;
        Double weight = orderSumDto.getWeight();
        double dDoubleValue3 = weight != null ? weight.doubleValue() : 0.0d;
        Double delivery = orderSumDto.getDelivery();
        double dDoubleValue4 = delivery != null ? delivery.doubleValue() : 0.0d;
        Double deliveryOver = orderSumDto.getDeliveryOver();
        double dDoubleValue5 = deliveryOver != null ? deliveryOver.doubleValue() : 0.0d;
        Double sum = orderSumDto.getSum();
        return new OrderSum(dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, sum != null ? sum.doubleValue() : 0.0d, orderSumDto.getBonuses());
    }

    private final OrderTotalInfoItem iwizpuwonk(OrderTotalItemInfoDto orderTotalItemInfoDto) {
        return new OrderTotalInfoItem(orderTotalItemInfoDto.getTitle(), orderTotalItemInfoDto.getValue(), orderTotalItemInfoDto.getTooltip());
    }

    private final OrderProduct jyumaefscl(OrderProductDto orderProductDto, List list) {
        String id2 = orderProductDto.getId();
        String article = orderProductDto.getArticle();
        String name = orderProductDto.getName();
        double quantity = orderProductDto.getQuantity();
        double price = orderProductDto.getPrice();
        Double oldPrice = orderProductDto.getOldPrice();
        double sum = orderProductDto.getSum();
        Double oldSum = orderProductDto.getOldSum();
        double dDoubleValue = oldSum != null ? oldSum.doubleValue() : 0.0d;
        Integer discount = orderProductDto.getDiscount();
        String pic = orderProductDto.getPic();
        String str = pic == null ? "" : pic;
        Boolean available = orderProductDto.getAvailable();
        boolean zBooleanValue = available != null ? available.booleanValue() : true;
        Double rating = orderProductDto.getRating();
        Integer reviews = orderProductDto.getReviews();
        int iIntValue = reviews != null ? reviews.intValue() : 0;
        String country = orderProductDto.getCountry();
        String str2 = country == null ? "" : country;
        String region = orderProductDto.getRegion();
        String str3 = region == null ? "" : region;
        String countryFlagEmoji = orderProductDto.getCountryFlagEmoji();
        List listBtonecajqb = btonecajqb(orderProductDto.getReplaces());
        if (listBtonecajqb == null) {
            listBtonecajqb = jyumaefscl.wflxmlrfwp();
        }
        List list2 = listBtonecajqb;
        List listWflxmlrfwp = list == null ? jyumaefscl.wflxmlrfwp() : list;
        List hints = orderProductDto.getHints();
        if (hints == null) {
            hints = jyumaefscl.wflxmlrfwp();
        }
        return new OrderProduct(id2, article, name, quantity, price, oldPrice, sum, dDoubleValue, discount, str, zBooleanValue, rating, iIntValue, str2, str3, countryFlagEmoji, list2, mq.iobyxmoadg.eablkybsjg(listWflxmlrfwp, hints), this.f80968zoijcleaow.iobyxmoadg(orderProductDto.getMeasure()));
    }

    private final Order kcexrzcfyt(OrderDto orderDto, List list) {
        List listWflxmlrfwp;
        Delivery delivery;
        OrderPayment orderPayment;
        Recipient recipient;
        OrderPartner orderPartner;
        ArrayList arrayList;
        OrderSum orderSumIstkbnxepw;
        List cart = orderDto.getCart();
        if (cart != null) {
            listWflxmlrfwp = new ArrayList(jyumaefscl.cqumvgiudr(cart, 10));
            Iterator it = cart.iterator();
            while (it.hasNext()) {
                listWflxmlrfwp.add(jyumaefscl((OrderProductDto) it.next(), orderDto.getHints()));
            }
        } else {
            listWflxmlrfwp = null;
        }
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        List list2 = listWflxmlrfwp;
        String id2 = orderDto.getId();
        String str = id2 == null ? "" : id2;
        String dateCreate = orderDto.getDateCreate();
        String str2 = dateCreate == null ? "" : dateCreate;
        String blockingTime = orderDto.getBlockingTime();
        String str3 = blockingTime == null ? "" : blockingTime;
        OrderStatus.Companion companion = OrderStatus.INSTANCE;
        String statusId = orderDto.getStatusId();
        if (statusId == null) {
            statusId = "";
        }
        OrderStatus orderStatusIobyxmoadg = companion.iobyxmoadg(statusId);
        Double price = orderDto.getPrice();
        double dDoubleValue = price != null ? price.doubleValue() : 0.0d;
        Double oldPrice = orderDto.getOldPrice();
        double dDoubleValue2 = oldPrice != null ? oldPrice.doubleValue() : 0.0d;
        Boolean isTrackOrder = orderDto.getIsTrackOrder();
        boolean zBooleanValue = isTrackOrder != null ? isTrackOrder.booleanValue() : false;
        Boolean canRate = orderDto.getCanRate();
        boolean zBooleanValue2 = canRate != null ? canRate.booleanValue() : false;
        Boolean canChangePayment = orderDto.getCanChangePayment();
        boolean zBooleanValue3 = canChangePayment != null ? canChangePayment.booleanValue() : false;
        Boolean canEdit = orderDto.getCanEdit();
        boolean zBooleanValue4 = canEdit != null ? canEdit.booleanValue() : false;
        Boolean canRepeat = orderDto.getCanRepeat();
        boolean zBooleanValue5 = canRepeat != null ? canRepeat.booleanValue() : false;
        Integer rating = orderDto.getRating();
        int iIntValue = rating != null ? rating.intValue() : 0;
        Boolean isCancelable = orderDto.getIsCancelable();
        boolean zBooleanValue6 = isCancelable != null ? isCancelable.booleanValue() : false;
        DeliveryDto delivery2 = orderDto.getDelivery();
        if (delivery2 == null || (delivery = oxmwwwfdhm(delivery2)) == null) {
            delivery = new Delivery(null, null, null, null, null, null, null, 127, null);
        }
        Delivery delivery3 = delivery;
        OrderPaymentDto payment = orderDto.getPayment();
        if (payment == null || (orderPayment = yggfygwlhe(payment)) == null) {
            orderPayment = new OrderPayment(null, null, false, false, false, null, 63, null);
        }
        OrderPayment orderPayment2 = orderPayment;
        RecipientDto recipient2 = orderDto.getRecipient();
        if (recipient2 == null || (recipient = yadqdtsiqt(recipient2)) == null) {
            recipient = new Recipient(null, null, null, 7, null);
        }
        Recipient recipient3 = recipient;
        OrderPartnerDto partner = orderDto.getPartner();
        if (partner == null || (orderPartner = zdlpuopuiu(partner)) == null) {
            orderPartner = new OrderPartner(null, null, null, 7, null);
        }
        OrderPartner orderPartner2 = orderPartner;
        OrderSumDto sum = orderDto.getSum();
        OrderSum orderSum = (sum == null || (orderSumIstkbnxepw = istkbnxepw(sum)) == null) ? new OrderSum(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 127, null) : orderSumIstkbnxepw;
        Boolean isNeedPassport = orderDto.getIsNeedPassport();
        boolean zBooleanValue7 = isNeedPassport != null ? isNeedPassport.booleanValue() : false;
        String partnerCode = orderDto.getPartnerCode();
        String str4 = partnerCode == null ? "" : partnerCode;
        String currentTime = orderDto.getCurrentTime();
        String str5 = currentTime == null ? "" : currentTime;
        String waitTime = orderDto.getWaitTime();
        String str6 = waitTime == null ? "" : waitTime;
        Boolean hasReplaces = orderDto.getHasReplaces();
        boolean zBooleanValue8 = hasReplaces != null ? hasReplaces.booleanValue() : false;
        String message = orderDto.getMessage();
        String str7 = message != null ? message : "";
        Boolean tipsAvailable = orderDto.getTipsAvailable();
        boolean zBooleanValue9 = tipsAvailable != null ? tipsAvailable.booleanValue() : false;
        List totalInfo = orderDto.getTotalInfo();
        if (totalInfo != null) {
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(totalInfo, 10));
            Iterator it2 = totalInfo.iterator();
            while (it2.hasNext()) {
                arrayList.add(iwizpuwonk((OrderTotalItemInfoDto) it2.next()));
            }
        } else {
            arrayList = null;
        }
        List listWflxmlrfwp2 = arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList;
        List listIobyxmoadg = list != null ? dw.iobyxmoadg.iobyxmoadg(list) : null;
        return new Order(str, str2, str3, zBooleanValue5, orderStatusIobyxmoadg, dDoubleValue, dDoubleValue2, zBooleanValue2, zBooleanValue3, zBooleanValue4, iIntValue, zBooleanValue6, zBooleanValue, delivery3, orderPayment2, recipient3, orderPartner2, orderSum, list2, zBooleanValue7, false, null, str4, str5, str6, zBooleanValue8, str7, zBooleanValue9, listWflxmlrfwp2, listIobyxmoadg == null ? jyumaefscl.wflxmlrfwp() : listIobyxmoadg, 3145728, null);
    }

    private final PurchaseFuture lereixgezr(PurchaseFutureDto purchaseFutureDto) {
        List listLqeggnwhkg = lqeggnwhkg(purchaseFutureDto.getCart());
        if (listLqeggnwhkg == null) {
            listLqeggnwhkg = jyumaefscl.wflxmlrfwp();
        }
        Double price = purchaseFutureDto.getPrice();
        return new PurchaseFuture(price != null ? price.doubleValue() : 0.0d, listLqeggnwhkg);
    }

    private final FutureProduct lmojexxdyd(FutureProductDto futureProductDto) {
        String article = futureProductDto.getArticle();
        String name = futureProductDto.getName();
        double quantity = futureProductDto.getQuantity();
        MeasureTypeModel measureTypeModelIobyxmoadg = this.f80968zoijcleaow.iobyxmoadg(futureProductDto.getMeasure());
        double price = futureProductDto.getPrice();
        double sum = futureProductDto.getSum();
        String pic = futureProductDto.getPic();
        if (pic == null) {
            pic = "";
        }
        return new FutureProduct(article, name, price, sum, measureTypeModelIobyxmoadg, pic, quantity, false, futureProductDto.getOnlyForPicup(), !futureProductDto.getOnlyInShop(), UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }

    private final List lqeggnwhkg(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(lmojexxdyd((FutureProductDto) it.next()));
        }
        return arrayList;
    }

    private final List nufgyqmvbu(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(iozdgvuglv(this, (OrderDto) it.next(), null, 1, null));
        }
        return arrayList;
    }

    private final e10.eablkybsjg ojitshcjhn(OrderEditProductsDto orderEditProductsDto, List list) {
        MeasureTypeModel measureTypeModelPpxfxbqfkf = this.f80968zoijcleaow.ppxfxbqfkf(orderEditProductsDto.getUnits(), orderEditProductsDto.getMeasure());
        String id2 = orderEditProductsDto.getId();
        String article = orderEditProductsDto.getArticle();
        String pic = orderEditProductsDto.getPic();
        String name = orderEditProductsDto.getName();
        double price = orderEditProductsDto.getPrice();
        Double oldPrice = orderEditProductsDto.getOldPrice();
        double quantity = orderEditProductsDto.getQuantity();
        Double avgWeight = orderEditProductsDto.getAvgWeight();
        Integer percent = orderEditProductsDto.getPercent();
        int iIntValue = percent != null ? percent.intValue() : 0;
        boolean isDispPer100 = orderEditProductsDto.getIsDispPer100();
        Double rating = orderEditProductsDto.getRating();
        Integer reviewsCount = orderEditProductsDto.getReviewsCount();
        int iIntValue2 = reviewsCount != null ? reviewsCount.intValue() : 0;
        String country = orderEditProductsDto.getCountry();
        String str = country == null ? "" : country;
        String region = orderEditProductsDto.getRegion();
        String str2 = region == null ? "" : region;
        String countryFlagEmoji = orderEditProductsDto.getCountryFlagEmoji();
        double weight = orderEditProductsDto.getWeight();
        Boolean isFavorite = orderEditProductsDto.getIsFavorite();
        return new e10.eablkybsjg(id2, article, orderEditProductsDto.getIsAvailable(), name, price, oldPrice, iIntValue, list, rating, iIntValue2, str, str2, countryFlagEmoji, weight, isDispPer100, measureTypeModelPpxfxbqfkf, avgWeight, pic, quantity, isFavorite != null ? isFavorite.booleanValue() : false, this.f80966ppxfxbqfkf.invoke(orderEditProductsDto.getLimits(), measureTypeModelPpxfxbqfkf));
    }

    private final Delivery oxmwwwfdhm(DeliveryDto deliveryDto) {
        DeliveryCode deliveryCodeIobyxmoadg = DeliveryCode.INSTANCE.iobyxmoadg(deliveryDto.getCode());
        String title = deliveryDto.getTitle();
        String str = title == null ? "" : title;
        String date = deliveryDto.getDate();
        String str2 = date == null ? "" : date;
        String hours = deliveryDto.getHours();
        String str3 = hours == null ? "" : hours;
        String phone = deliveryDto.getPhone();
        String str4 = phone == null ? "" : phone;
        String address = deliveryDto.getAddress();
        String str5 = address == null ? "" : address;
        String postamatCode = deliveryDto.getPostamatCode();
        if (postamatCode == null) {
            postamatCode = "";
        }
        return new Delivery(deliveryCodeIobyxmoadg, str, str2, str3, str4, str5, postamatCode);
    }

    private final Purchases pmvmpeiblj(PurchasesDto purchasesDto, Integer num) {
        Paging paging;
        List listDxjokdxxww = dxjokdxxww(purchasesDto.getPurchases(), num);
        if (listDxjokdxxww == null) {
            listDxjokdxxww = jyumaefscl.wflxmlrfwp();
        }
        PurchaseFutureDto future = purchasesDto.getFuture();
        PurchaseFuture purchaseFutureLereixgezr = future != null ? lereixgezr(future) : null;
        PagingDto paging2 = purchasesDto.getPaging();
        if (paging2 == null || (paging = y30.zoijcleaow.iobyxmoadg(paging2)) == null) {
            paging = new Paging(0, 0, 0, 7, null);
        }
        Boolean isReviewsAvailable = purchasesDto.getIsReviewsAvailable();
        return new Purchases(listDxjokdxxww, purchaseFutureLereixgezr, paging, isReviewsAvailable != null ? isReviewsAvailable.booleanValue() : false);
    }

    private final e10.lqeggnwhkg rgvfuqvkyq(PromocodeDto promocodeDto) {
        String value = promocodeDto.getValue();
        if (value == null) {
            value = "";
        }
        Boolean status = promocodeDto.getStatus();
        return new e10.lqeggnwhkg(value, status != null ? status.booleanValue() : false);
    }

    private final e10.nufgyqmvbu vdvldrhtss(OrderEditPropertiesDto orderEditPropertiesDto) {
        String address = orderEditPropertiesDto.getAddress();
        String str = address == null ? "" : address;
        String recieverName = orderEditPropertiesDto.getRecieverName();
        String str2 = recieverName == null ? "" : recieverName;
        String recieverLastName = orderEditPropertiesDto.getRecieverLastName();
        String str3 = recieverLastName == null ? "" : recieverLastName;
        String recieverPhone = orderEditPropertiesDto.getRecieverPhone();
        String str4 = recieverPhone == null ? "" : recieverPhone;
        String recieverEmail = orderEditPropertiesDto.getRecieverEmail();
        String str5 = recieverEmail == null ? "" : recieverEmail;
        String dateReciept = orderEditPropertiesDto.getDateReciept();
        String str6 = dateReciept == null ? "" : dateReciept;
        String intervalDelivery = orderEditPropertiesDto.getIntervalDelivery();
        String str7 = intervalDelivery == null ? "" : intervalDelivery;
        String change = orderEditPropertiesDto.getChange();
        if (change == null) {
            change = "";
        }
        return new e10.nufgyqmvbu(str, str2, str3, str4, str5, str6, str7, change, null, UserVerificationMethods.USER_VERIFY_HANDPRINT, null);
    }

    private final e10.ppxfxbqfkf wflxmlrfwp(OrderEditCartSumDto orderEditCartSumDto) {
        Double basket = orderEditCartSumDto.getBasket();
        double dDoubleValue = basket != null ? basket.doubleValue() : 0.0d;
        Double discount = orderEditCartSumDto.getDiscount();
        double dDoubleValue2 = discount != null ? discount.doubleValue() : 0.0d;
        Double delivery = orderEditCartSumDto.getDelivery();
        double dDoubleValue3 = delivery != null ? delivery.doubleValue() : 0.0d;
        Double overweight = orderEditCartSumDto.getOverweight();
        double dDoubleValue4 = overweight != null ? overweight.doubleValue() : 0.0d;
        Double weight = orderEditCartSumDto.getWeight();
        double dDoubleValue5 = weight != null ? weight.doubleValue() : 0.0d;
        Double total = orderEditCartSumDto.getTotal();
        double dDoubleValue6 = total != null ? total.doubleValue() : 0.0d;
        Integer count = orderEditCartSumDto.getCount();
        int iIntValue = count != null ? count.intValue() : 0;
        Double oldTotal = orderEditCartSumDto.getOldTotal();
        double dDoubleValue7 = oldTotal != null ? oldTotal.doubleValue() : 0.0d;
        Double diffTotal = orderEditCartSumDto.getDiffTotal();
        return new e10.ppxfxbqfkf(dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, dDoubleValue6, iIntValue, dDoubleValue7, diffTotal != null ? diffTotal.doubleValue() : 0.0d);
    }

    private final PurchaseHistoryProduct wwaezpbzkn(PurchaseProductDto purchaseProductDto) {
        String article = purchaseProductDto.getArticle();
        String name = purchaseProductDto.getName();
        double quantity = purchaseProductDto.getQuantity();
        MeasureTypeModel measureTypeModelIobyxmoadg = this.f80968zoijcleaow.iobyxmoadg(purchaseProductDto.getMeasure());
        double price = purchaseProductDto.getPrice();
        double sum = purchaseProductDto.getSum();
        String pic = purchaseProductDto.getPic();
        if (pic == null) {
            pic = "";
        }
        String str = pic;
        Double rating = purchaseProductDto.getRating();
        Integer reviews = purchaseProductDto.getReviews();
        boolean onlyForPicup = purchaseProductDto.getOnlyForPicup();
        boolean z13 = !purchaseProductDto.getOnlyInShop();
        Integer userRating = purchaseProductDto.getUserRating();
        return new PurchaseHistoryProduct(article, name, price, sum, measureTypeModelIobyxmoadg, str, quantity, false, rating, reviews, onlyForPicup, z13, userRating != null ? userRating.intValue() : 0, UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }

    private final Recipient yadqdtsiqt(RecipientDto recipientDto) {
        String fio = recipientDto.getFio();
        if (fio == null) {
            fio = "";
        }
        String phone = recipientDto.getPhone();
        if (phone == null) {
            phone = "";
        }
        String email = recipientDto.getEmail();
        return new Recipient(fio, phone, email != null ? email : "");
    }

    private final OrderPayment yggfygwlhe(OrderPaymentDto orderPaymentDto) {
        PaymentCode.Companion companion = PaymentCode.INSTANCE;
        String code = orderPaymentDto.getCode();
        if (code == null) {
            code = "";
        }
        PaymentCode paymentCodeIobyxmoadg = companion.iobyxmoadg(code);
        String title = orderPaymentDto.getTitle();
        String str = title == null ? "" : title;
        Boolean isCanPay = orderPaymentDto.getIsCanPay();
        boolean zBooleanValue = isCanPay != null ? isCanPay.booleanValue() : false;
        Boolean isPaid = orderPaymentDto.getIsPaid();
        boolean zBooleanValue2 = isPaid != null ? isPaid.booleanValue() : false;
        Boolean isNeedVerify = orderPaymentDto.getIsNeedVerify();
        boolean zBooleanValue3 = isNeedVerify != null ? isNeedVerify.booleanValue() : false;
        String change = orderPaymentDto.getChange();
        if (change == null) {
            change = "";
        }
        return new OrderPayment(paymentCodeIobyxmoadg, str, zBooleanValue, zBooleanValue2, zBooleanValue3, change);
    }

    private final OrderPartner zdlpuopuiu(OrderPartnerDto orderPartnerDto) {
        String code = orderPartnerDto.getCode();
        if (code == null) {
            code = "";
        }
        String title = orderPartnerDto.getTitle();
        if (title == null) {
            title = "";
        }
        String name = orderPartnerDto.getName();
        return new OrderPartner(code, title, name != null ? name : "");
    }

    private final OrderEditBonuses zynmafqrjb(OrderBonusesDto orderBonusesDto) {
        Integer applied = orderBonusesDto.getApplied();
        return new OrderEditBonuses(applied != null ? applied.intValue() : 0);
    }

    public final Purchase eablkybsjg(PurchaseHistoryDetailsDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return cqumvgiudr(dto);
    }

    public final Purchases gxszxtbevo(PurchasesDto dto, Integer num) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return pmvmpeiblj(dto, num);
    }

    public final c10.eablkybsjg iobyxmoadg(OrdersDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return gtknphoqwx(dto);
    }

    public final e10.iobyxmoadg ppxfxbqfkf(String orderEditId, OrderEditResultDto dto, Warning warning) {
        zdlpuopuiu.btonecajqb(orderEditId, "orderEditId");
        zdlpuopuiu.btonecajqb(dto, "dto");
        zdlpuopuiu.btonecajqb(warning, "warning");
        return draadjrbmk(dto, orderEditId, warning);
    }

    public final Order wkgbmnqykc(OrderDetailsDto dto) {
        Order orderKcexrzcfyt;
        zdlpuopuiu.btonecajqb(dto, "dto");
        OrderDto order = dto.getOrder();
        if (order != null && (orderKcexrzcfyt = kcexrzcfyt(order, dto.getPayments())) != null) {
            return orderKcexrzcfyt;
        }
        return new Order(null, null, null, false, null, 0.0d, 0.0d, false, false, false, 0, false, false, null, null, null, null, null, null, false, false, null, null, null, null, false, null, false, null, null, 1073741823, null);
    }

    public final d10.iobyxmoadg zoijcleaow(ChangeOrderInfoDto changeOrderInfoDto, List warningList) {
        List listWflxmlrfwp;
        List hints;
        zdlpuopuiu.btonecajqb(changeOrderInfoDto, "changeOrderInfoDto");
        zdlpuopuiu.btonecajqb(warningList, "warningList");
        List items = changeOrderInfoDto.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (true) {
            listWflxmlrfwp = null;
            if (!it.hasNext()) {
                break;
            }
            OrderEditProductsDto orderEditProductsDto = (OrderEditProductsDto) it.next();
            CartReferencesDto refs = changeOrderInfoDto.getRefs();
            if (refs != null && (hints = refs.getHints()) != null) {
                List hints2 = orderEditProductsDto.getHints();
                if (hints2 == null) {
                    hints2 = jyumaefscl.wflxmlrfwp();
                }
                listWflxmlrfwp = mq.iobyxmoadg.eablkybsjg(hints, hints2);
            }
            if (listWflxmlrfwp == null) {
                listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
            }
            arrayList.add(ojitshcjhn(orderEditProductsDto, listWflxmlrfwp));
        }
        List limitProducts = changeOrderInfoDto.getLimitProducts();
        if (limitProducts != null) {
            listWflxmlrfwp = new ArrayList(jyumaefscl.cqumvgiudr(limitProducts, 10));
            Iterator it2 = limitProducts.iterator();
            while (it2.hasNext()) {
                listWflxmlrfwp.add(((ChangeBasketLimitDto) it2.next()).getId());
            }
        }
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        return new d10.iobyxmoadg(arrayList, warningList, listWflxmlrfwp);
    }
}
