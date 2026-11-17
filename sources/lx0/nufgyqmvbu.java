package lx0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import cy0.ChangeBasketLimitDto;
import d21.PagingDto;
import hg.jyumaefscl;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ky0.ChangeOrderInfoDto;
import ky0.DeliveryDto;
import ky0.FutureProductDto;
import ky0.OrderDetailDto;
import ky0.OrderDetailsDto;
import ky0.OrderEditCartSumDto;
import ky0.OrderEditOrderPropertiesDto;
import ky0.OrderEditProductsDto;
import ky0.OrderEditPropertiesDto;
import ky0.OrderEditReferencesDto;
import ky0.OrderEditResultDto;
import ky0.OrderPartnerDto;
import ky0.OrderPaymentDto;
import ky0.OrderProductDto;
import ky0.OrderSumDto;
import ky0.OrderTotalItemInfoDto;
import ky0.OrdersDto;
import ky0.PurchaseFutureDto;
import ky0.PurchaseHistoryDetailsDto;
import ky0.PurchaseHistoryDto;
import ky0.PurchaseProductDto;
import ky0.PurchasesDto;
import ky0.RecipientDto;
import ky0.RemovedOrderProductDto;
import ky0.ReplaceDto;
import ny0.PromocodeDto;
import px0.OrderBonusesDto;
import ru.myspar.proloyalty.components.payment.api.models.PaymentCode;
import ru.myspar.proloyalty.core.domain.models.delivery.Delivery;
import ru.myspar.proloyalty.core.domain.models.order.FutureProduct;
import ru.myspar.proloyalty.core.domain.models.order.OrderDetail;
import ru.myspar.proloyalty.core.domain.models.order.OrderPartner;
import ru.myspar.proloyalty.core.domain.models.order.OrderPayment;
import ru.myspar.proloyalty.core.domain.models.order.OrderProduct;
import ru.myspar.proloyalty.core.domain.models.order.OrderStatus;
import ru.myspar.proloyalty.core.domain.models.order.OrderTotalInfoItem;
import ru.myspar.proloyalty.core.domain.models.order.Purchase;
import ru.myspar.proloyalty.core.domain.models.order.PurchaseFuture;
import ru.myspar.proloyalty.core.domain.models.order.PurchaseHistoryProduct;
import ru.myspar.proloyalty.core.domain.models.order.Purchases;
import ru.myspar.proloyalty.core.domain.models.order.RemovedOrderProduct;
import ru.myspar.proloyalty.core.domain.models.order.edit.OrderEditBonuses;
import ru.myspar.proloyalty.core.domain.models.order.edit.OrderSum;
import ru.myspar.proloyalty.core.domain.models.order.productreplacement.ReplaceData;
import ru.myspar.proloyalty.core.domain.models.recipient.Recipient;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;
import ru.myspar.proloyalty.core.models.paging.Paging;
import tx0.CartReferencesDto;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final DateTimeFormatter f64354eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final DateTimeFormatter f64355gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final xr0.zoijcleaow f64356iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final jx0.nufgyqmvbu f64357ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final wkgbmnqykc f64358wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jx0.lqeggnwhkg f64359zoijcleaow;

    public nufgyqmvbu(xr0.zoijcleaow dateUtils, jx0.lqeggnwhkg measureTypeModelMapper, jx0.nufgyqmvbu productLimitMapper, wkgbmnqykc orderListDtoMapper) {
        zdlpuopuiu.btonecajqb(dateUtils, "dateUtils");
        zdlpuopuiu.btonecajqb(measureTypeModelMapper, "measureTypeModelMapper");
        zdlpuopuiu.btonecajqb(productLimitMapper, "productLimitMapper");
        zdlpuopuiu.btonecajqb(orderListDtoMapper, "orderListDtoMapper");
        this.f64356iobyxmoadg = dateUtils;
        this.f64359zoijcleaow = measureTypeModelMapper;
        this.f64357ppxfxbqfkf = productLimitMapper;
        this.f64358wkgbmnqykc = orderListDtoMapper;
        this.f64354eablkybsjg = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        this.f64355gxszxtbevo = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    }

    private final OrderTotalInfoItem agtfadlqog(OrderTotalItemInfoDto orderTotalItemInfoDto) {
        return new OrderTotalInfoItem(orderTotalItemInfoDto.getTitle(), orderTotalItemInfoDto.getValue(), orderTotalItemInfoDto.getTooltip());
    }

    private final OrderDetail btonecajqb(OrderDetailDto orderDetailDto, List list) {
        List listWflxmlrfwp;
        Delivery delivery;
        OrderPayment orderPayment;
        Recipient recipient;
        OrderPartner orderPartner;
        ArrayList arrayList;
        OrderSum orderSumZoijcleaow;
        List cart = orderDetailDto.getCart();
        ArrayList arrayList2 = null;
        if (cart != null) {
            listWflxmlrfwp = new ArrayList(jyumaefscl.cqumvgiudr(cart, 10));
            Iterator it = cart.iterator();
            while (it.hasNext()) {
                listWflxmlrfwp.add(wflxmlrfwp((OrderProductDto) it.next(), orderDetailDto.getHints()));
            }
        } else {
            listWflxmlrfwp = null;
        }
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        List list2 = listWflxmlrfwp;
        String id2 = orderDetailDto.getId();
        String str = id2 == null ? "" : id2;
        String dateCreate = orderDetailDto.getDateCreate();
        String str2 = dateCreate == null ? "" : dateCreate;
        String blockingTime = orderDetailDto.getBlockingTime();
        String str3 = blockingTime == null ? "" : blockingTime;
        OrderStatus.Companion companion = OrderStatus.INSTANCE;
        String statusId = orderDetailDto.getStatusId();
        if (statusId == null) {
            statusId = "";
        }
        OrderStatus orderStatusIobyxmoadg = companion.iobyxmoadg(statusId);
        Double price = orderDetailDto.getPrice();
        double dDoubleValue = price != null ? price.doubleValue() : 0.0d;
        Double oldPrice = orderDetailDto.getOldPrice();
        double dDoubleValue2 = oldPrice != null ? oldPrice.doubleValue() : 0.0d;
        Boolean isTrackOrder = orderDetailDto.getIsTrackOrder();
        boolean zBooleanValue = isTrackOrder != null ? isTrackOrder.booleanValue() : false;
        Boolean canRate = orderDetailDto.getCanRate();
        boolean zBooleanValue2 = canRate != null ? canRate.booleanValue() : false;
        Boolean canChangePayment = orderDetailDto.getCanChangePayment();
        boolean zBooleanValue3 = canChangePayment != null ? canChangePayment.booleanValue() : false;
        Boolean canEdit = orderDetailDto.getCanEdit();
        boolean zBooleanValue4 = canEdit != null ? canEdit.booleanValue() : false;
        Boolean canRepeat = orderDetailDto.getCanRepeat();
        boolean zBooleanValue5 = canRepeat != null ? canRepeat.booleanValue() : false;
        Integer rating = orderDetailDto.getRating();
        int iIntValue = rating != null ? rating.intValue() : 0;
        Boolean isCancelable = orderDetailDto.getIsCancelable();
        boolean zBooleanValue6 = isCancelable != null ? isCancelable.booleanValue() : false;
        DeliveryDto delivery2 = orderDetailDto.getDelivery();
        if (delivery2 == null || (delivery = eablkybsjg.iobyxmoadg(delivery2)) == null) {
            delivery = new Delivery(null, null, null, null, null, null, null, 127, null);
        }
        Delivery delivery3 = delivery;
        OrderPaymentDto payment = orderDetailDto.getPayment();
        if (payment == null || (orderPayment = draadjrbmk(payment)) == null) {
            orderPayment = new OrderPayment(null, null, false, false, false, null, 63, null);
        }
        OrderPayment orderPayment2 = orderPayment;
        RecipientDto recipient2 = orderDetailDto.getRecipient();
        if (recipient2 == null || (recipient = eablkybsjg.ppxfxbqfkf(recipient2)) == null) {
            recipient = new Recipient(null, null, null, 7, null);
        }
        Recipient recipient3 = recipient;
        OrderPartnerDto partner = orderDetailDto.getPartner();
        if (partner == null || (orderPartner = gtknphoqwx(partner)) == null) {
            orderPartner = new OrderPartner(null, null, null, 7, null);
        }
        OrderPartner orderPartner2 = orderPartner;
        OrderSumDto sum = orderDetailDto.getSum();
        OrderSum orderSum = (sum == null || (orderSumZoijcleaow = eablkybsjg.zoijcleaow(sum)) == null) ? new OrderSum(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 127, null) : orderSumZoijcleaow;
        Boolean isNeedPassport = orderDetailDto.getIsNeedPassport();
        boolean zBooleanValue7 = isNeedPassport != null ? isNeedPassport.booleanValue() : false;
        String partnerCode = orderDetailDto.getPartnerCode();
        String str4 = partnerCode == null ? "" : partnerCode;
        String currentTime = orderDetailDto.getCurrentTime();
        String str5 = currentTime == null ? "" : currentTime;
        String waitTime = orderDetailDto.getWaitTime();
        String str6 = waitTime == null ? "" : waitTime;
        Boolean hasReplaces = orderDetailDto.getHasReplaces();
        boolean zBooleanValue8 = hasReplaces != null ? hasReplaces.booleanValue() : false;
        String message = orderDetailDto.getMessage();
        String str7 = message == null ? "" : message;
        Boolean tipsAvailable = orderDetailDto.getTipsAvailable();
        boolean zBooleanValue9 = tipsAvailable != null ? tipsAvailable.booleanValue() : false;
        List totalInfo = orderDetailDto.getTotalInfo();
        if (totalInfo != null) {
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(totalInfo, 10));
            Iterator it2 = totalInfo.iterator();
            while (it2.hasNext()) {
                arrayList.add(agtfadlqog((OrderTotalItemInfoDto) it2.next()));
            }
        } else {
            arrayList = null;
        }
        List listWflxmlrfwp2 = arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList;
        List listIobyxmoadg = list != null ? xu0.iobyxmoadg.iobyxmoadg(list) : null;
        if (listIobyxmoadg == null) {
            listIobyxmoadg = jyumaefscl.wflxmlrfwp();
        }
        List list3 = listIobyxmoadg;
        List removedItems = orderDetailDto.getRemovedItems();
        if (removedItems != null) {
            arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(removedItems, 10));
            Iterator it3 = removedItems.iterator();
            while (it3.hasNext()) {
                arrayList2.add(kcexrzcfyt((RemovedOrderProductDto) it3.next()));
            }
        }
        return new OrderDetail(str, str2, str3, zBooleanValue5, orderStatusIobyxmoadg, dDoubleValue, dDoubleValue2, zBooleanValue2, zBooleanValue3, zBooleanValue4, iIntValue, zBooleanValue6, zBooleanValue, delivery3, orderPayment2, recipient3, orderPartner2, orderSum, list2, arrayList2 == null ? jyumaefscl.wflxmlrfwp() : arrayList2, zBooleanValue7, false, null, str4, str5, str6, zBooleanValue8, str7, zBooleanValue9, listWflxmlrfwp2, list3, 6291456, null);
    }

    private final uz0.wkgbmnqykc cqumvgiudr(OrderEditOrderPropertiesDto orderEditOrderPropertiesDto) {
        Double minPrice = orderEditOrderPropertiesDto.getMinPrice();
        double dDoubleValue = minPrice != null ? minPrice.doubleValue() : 0.0d;
        xr0.zoijcleaow zoijcleaowVar = this.f64356iobyxmoadg;
        String dateLeft = orderEditOrderPropertiesDto.getDateLeft();
        if (dateLeft == null) {
            dateLeft = "";
        }
        DateTimeFormatter orderEditDateFormatter = this.f64354eablkybsjg;
        zdlpuopuiu.dxjokdxxww(orderEditDateFormatter, "orderEditDateFormatter");
        return new uz0.wkgbmnqykc(dDoubleValue, zoijcleaowVar.ppxfxbqfkf(dateLeft, orderEditDateFormatter));
    }

    private final OrderPayment draadjrbmk(OrderPaymentDto orderPaymentDto) {
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

    private final List dxjokdxxww(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(yggfygwlhe((ReplaceDto) it.next()));
        }
        return arrayList;
    }

    private final uz0.eablkybsjg esjtqupxsv(OrderEditProductsDto orderEditProductsDto, List list) {
        MeasureTypeModel measureTypeModelPpxfxbqfkf = this.f64359zoijcleaow.ppxfxbqfkf(orderEditProductsDto.getUnits(), orderEditProductsDto.getMeasure());
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
        return new uz0.eablkybsjg(id2, article, orderEditProductsDto.getIsAvailable(), name, price, oldPrice, iIntValue, list, rating, iIntValue2, str, str2, countryFlagEmoji, weight, isDispPer100, measureTypeModelPpxfxbqfkf, avgWeight, pic, quantity, isFavorite != null ? isFavorite.booleanValue() : false, this.f64357ppxfxbqfkf.invoke(orderEditProductsDto.getLimits(), measureTypeModelPpxfxbqfkf));
    }

    private final OrderPartner gtknphoqwx(OrderPartnerDto orderPartnerDto) {
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

    private final PurchaseHistoryProduct istkbnxepw(PurchaseProductDto purchaseProductDto) {
        String article = purchaseProductDto.getArticle();
        String name = purchaseProductDto.getName();
        double quantity = purchaseProductDto.getQuantity();
        MeasureTypeModel measureTypeModelIobyxmoadg = this.f64359zoijcleaow.iobyxmoadg(purchaseProductDto.getMeasure());
        double price = purchaseProductDto.getPrice();
        double sum = purchaseProductDto.getSum();
        String pic = purchaseProductDto.getPic();
        if (pic == null) {
            pic = "";
        }
        String str = pic;
        Double rating = purchaseProductDto.getRating();
        Integer reviews = purchaseProductDto.getReviews();
        Integer userRating = purchaseProductDto.getUserRating();
        return new PurchaseHistoryProduct(article, name, price, sum, measureTypeModelIobyxmoadg, str, quantity, false, rating, reviews, userRating != null ? userRating.intValue() : 0, UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }

    private final uz0.ppxfxbqfkf iwizpuwonk(OrderEditCartSumDto orderEditCartSumDto) {
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
        return new uz0.ppxfxbqfkf(dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, dDoubleValue6, iIntValue, dDoubleValue7, diffTotal != null ? diffTotal.doubleValue() : 0.0d);
    }

    private final uz0.iobyxmoadg jyumaefscl(OrderEditResultDto orderEditResultDto, String str, Warning warning) {
        uz0.nufgyqmvbu nufgyqmvbuVar;
        uz0.lqeggnwhkg lqeggnwhkgVar;
        uz0.wkgbmnqykc wkgbmnqykcVar;
        ArrayList arrayList;
        List listWflxmlrfwp;
        List hints;
        uz0.ppxfxbqfkf ppxfxbqfkfVarIwizpuwonk;
        OrderEditPropertiesDto properties = orderEditResultDto.getProperties();
        if (properties == null || (nufgyqmvbuVar = pmvmpeiblj(properties)) == null) {
            nufgyqmvbuVar = new uz0.nufgyqmvbu(null, null, null, null, null, null, null, null, null, 511, null);
        }
        uz0.nufgyqmvbu nufgyqmvbuVar2 = nufgyqmvbuVar;
        OrderEditCartSumDto sum = orderEditResultDto.getSum();
        uz0.ppxfxbqfkf ppxfxbqfkfVar = (sum == null || (ppxfxbqfkfVarIwizpuwonk = iwizpuwonk(sum)) == null) ? new uz0.ppxfxbqfkf(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0.0d, 0.0d, 511, null) : ppxfxbqfkfVarIwizpuwonk;
        PromocodeDto promocode = orderEditResultDto.getPromocode();
        if (promocode == null || (lqeggnwhkgVar = lereixgezr(promocode)) == null) {
            lqeggnwhkgVar = new uz0.lqeggnwhkg(null, false, 3, null);
        }
        uz0.lqeggnwhkg lqeggnwhkgVar2 = lqeggnwhkgVar;
        OrderEditOrderPropertiesDto orderProperties = orderEditResultDto.getOrderProperties();
        if (orderProperties == null || (wkgbmnqykcVar = cqumvgiudr(orderProperties)) == null) {
            wkgbmnqykcVar = new uz0.wkgbmnqykc(0.0d, null, 3, null);
        }
        uz0.wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar;
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
                listWflxmlrfwp = yo0.iobyxmoadg.eablkybsjg(hints, hints2);
            }
            if (listWflxmlrfwp == null) {
                listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
            }
            arrayList2.add(esjtqupxsv(orderEditProductsDto, listWflxmlrfwp));
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
        OrderEditBonuses orderEditBonusesZdlpuopuiu = bonuses != null ? zdlpuopuiu(bonuses) : null;
        String groups = orderEditResultDto.getGroups();
        String str3 = groups == null ? "" : groups;
        List totalInfo = orderEditResultDto.getTotalInfo();
        if (totalInfo != null) {
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(totalInfo, 10));
            Iterator it = totalInfo.iterator();
            while (it.hasNext()) {
                arrayList.add(agtfadlqog((OrderTotalItemInfoDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        List listWflxmlrfwp2 = arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList;
        List payments = orderEditResultDto.getPayments();
        List listIobyxmoadg = payments != null ? xu0.iobyxmoadg.iobyxmoadg(payments) : null;
        return new uz0.iobyxmoadg(str, null, orderStatusIobyxmoadg, str2, deliveryArea, paymentCodeIobyxmoadg, nufgyqmvbuVar2, ppxfxbqfkfVar, deliveryCodeIobyxmoadg, lqeggnwhkgVar2, wkgbmnqykcVar2, arrayList2, warning, orderEditBonusesZdlpuopuiu, str3, listWflxmlrfwp2, listIobyxmoadg == null ? jyumaefscl.wflxmlrfwp() : listIobyxmoadg, 2, null);
    }

    private final RemovedOrderProduct kcexrzcfyt(RemovedOrderProductDto removedOrderProductDto) {
        return new RemovedOrderProduct(removedOrderProductDto.getId(), removedOrderProductDto.getArticle(), removedOrderProductDto.getName(), removedOrderProductDto.getImageUrl());
    }

    private final uz0.lqeggnwhkg lereixgezr(PromocodeDto promocodeDto) {
        String value = promocodeDto.getValue();
        if (value == null) {
            value = "";
        }
        Boolean status = promocodeDto.getStatus();
        return new uz0.lqeggnwhkg(value, status != null ? status.booleanValue() : false);
    }

    private final List lqeggnwhkg(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zynmafqrjb((FutureProductDto) it.next()));
        }
        return arrayList;
    }

    private final List nufgyqmvbu(List list, Integer num) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(rgvfuqvkyq((PurchaseHistoryDto) it.next(), num));
        }
        return arrayList;
    }

    private final Purchase ojitshcjhn(PurchaseHistoryDetailsDto purchaseHistoryDetailsDto) {
        List listWflxmlrfwp;
        PurchaseHistoryDto purchaseInfo = purchaseHistoryDetailsDto.getPurchaseInfo();
        List products = purchaseInfo.getProducts();
        if (products != null) {
            listWflxmlrfwp = new ArrayList(jyumaefscl.cqumvgiudr(products, 10));
            Iterator it = products.iterator();
            while (it.hasNext()) {
                listWflxmlrfwp.add(istkbnxepw((PurchaseProductDto) it.next()));
            }
        } else {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        List list = listWflxmlrfwp;
        String id2 = purchaseInfo.getId();
        String str = id2 == null ? "" : id2;
        xr0.zoijcleaow zoijcleaowVar = this.f64356iobyxmoadg;
        String dateCreate = purchaseInfo.getDateCreate();
        DateTimeFormatter purchasesDateFormatter = this.f64355gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(purchasesDateFormatter, "purchasesDateFormatter");
        LocalDateTime localDateTimePpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf(dateCreate, purchasesDateFormatter);
        OrderStatus orderStatusIobyxmoadg = OrderStatus.INSTANCE.iobyxmoadg(purchaseInfo.getStatusId());
        boolean canRepeat = purchaseInfo.getCanRepeat();
        Float bonuses = purchaseInfo.getBonuses();
        String deliveryType = purchaseInfo.getDeliveryType();
        Double price = purchaseInfo.getPrice();
        double dDoubleValue = price != null ? price.doubleValue() : 0.0d;
        String address = purchaseInfo.getAddress();
        return new Purchase(str, localDateTimePpxfxbqfkf, orderStatusIobyxmoadg, canRepeat, bonuses, null, deliveryType, dDoubleValue, address == null ? "" : address, 0, list, null, 2592, null);
    }

    private final Purchases oxmwwwfdhm(PurchasesDto purchasesDto, Integer num) {
        Paging paging;
        List listNufgyqmvbu = nufgyqmvbu(purchasesDto.getPurchases(), num);
        if (listNufgyqmvbu == null) {
            listNufgyqmvbu = jyumaefscl.wflxmlrfwp();
        }
        PurchaseFutureDto future = purchasesDto.getFuture();
        PurchaseFuture purchaseFutureVdvldrhtss = future != null ? vdvldrhtss(future) : null;
        PagingDto paging2 = purchasesDto.getPaging();
        if (paging2 == null || (paging = d21.zoijcleaow.iobyxmoadg(paging2)) == null) {
            paging = new Paging(0, 0, 0, 7, null);
        }
        Boolean isReviewsAvailable = purchasesDto.getIsReviewsAvailable();
        return new Purchases(listNufgyqmvbu, purchaseFutureVdvldrhtss, paging, isReviewsAvailable != null ? isReviewsAvailable.booleanValue() : false);
    }

    private final uz0.nufgyqmvbu pmvmpeiblj(OrderEditPropertiesDto orderEditPropertiesDto) {
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
        return new uz0.nufgyqmvbu(str, str2, str3, str4, str5, str6, str7, change, null, UserVerificationMethods.USER_VERIFY_HANDPRINT, null);
    }

    private final Purchase rgvfuqvkyq(PurchaseHistoryDto purchaseHistoryDto, Integer num) {
        String id2 = purchaseHistoryDto.getId();
        String str = id2 == null ? "" : id2;
        xr0.zoijcleaow zoijcleaowVar = this.f64356iobyxmoadg;
        String dateCreate = purchaseHistoryDto.getDateCreate();
        DateTimeFormatter purchasesDateFormatter = this.f64355gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(purchasesDateFormatter, "purchasesDateFormatter");
        LocalDateTime localDateTimePpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf(dateCreate, purchasesDateFormatter);
        OrderStatus orderStatusIobyxmoadg = OrderStatus.INSTANCE.iobyxmoadg(purchaseHistoryDto.getStatusId());
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

    private final PurchaseFuture vdvldrhtss(PurchaseFutureDto purchaseFutureDto) {
        List listLqeggnwhkg = lqeggnwhkg(purchaseFutureDto.getCart());
        if (listLqeggnwhkg == null) {
            listLqeggnwhkg = jyumaefscl.wflxmlrfwp();
        }
        Double price = purchaseFutureDto.getPrice();
        return new PurchaseFuture(price != null ? price.doubleValue() : 0.0d, listLqeggnwhkg);
    }

    private final OrderProduct wflxmlrfwp(OrderProductDto orderProductDto, List list) {
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
        List listDxjokdxxww = dxjokdxxww(orderProductDto.getReplaces());
        if (listDxjokdxxww == null) {
            listDxjokdxxww = jyumaefscl.wflxmlrfwp();
        }
        List list2 = listDxjokdxxww;
        List listWflxmlrfwp = list == null ? jyumaefscl.wflxmlrfwp() : list;
        List hints = orderProductDto.getHints();
        if (hints == null) {
            hints = jyumaefscl.wflxmlrfwp();
        }
        return new OrderProduct(id2, article, name, quantity, price, oldPrice, sum, dDoubleValue, discount, str, zBooleanValue, rating, iIntValue, str2, str3, countryFlagEmoji, list2, yo0.iobyxmoadg.eablkybsjg(listWflxmlrfwp, hints), this.f64359zoijcleaow.iobyxmoadg(orderProductDto.getMeasure()));
    }

    private final ReplaceData yggfygwlhe(ReplaceDto replaceDto) {
        String id2 = replaceDto.getId();
        String name = replaceDto.getName();
        double quantity = replaceDto.getQuantity();
        MeasureTypeModel measureTypeModelIobyxmoadg = this.f64359zoijcleaow.iobyxmoadg(replaceDto.getMeasure());
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

    private final OrderEditBonuses zdlpuopuiu(OrderBonusesDto orderBonusesDto) {
        Integer applied = orderBonusesDto.getApplied();
        return new OrderEditBonuses(applied != null ? applied.intValue() : 0);
    }

    private final FutureProduct zynmafqrjb(FutureProductDto futureProductDto) {
        String article = futureProductDto.getArticle();
        String name = futureProductDto.getName();
        double quantity = futureProductDto.getQuantity();
        MeasureTypeModel measureTypeModelIobyxmoadg = this.f64359zoijcleaow.iobyxmoadg(futureProductDto.getMeasure());
        double price = futureProductDto.getPrice();
        double sum = futureProductDto.getSum();
        String pic = futureProductDto.getPic();
        if (pic == null) {
            pic = "";
        }
        return new FutureProduct(article, name, price, sum, measureTypeModelIobyxmoadg, pic, quantity, false, UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }

    public final tz0.iobyxmoadg eablkybsjg(ChangeOrderInfoDto changeOrderInfoDto, List warningList) {
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
                listWflxmlrfwp = yo0.iobyxmoadg.eablkybsjg(hints, hints2);
            }
            if (listWflxmlrfwp == null) {
                listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
            }
            arrayList.add(esjtqupxsv(orderEditProductsDto, listWflxmlrfwp));
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
        return new tz0.iobyxmoadg(arrayList, warningList, listWflxmlrfwp);
    }

    public final uz0.iobyxmoadg gxszxtbevo(String orderEditId, OrderEditResultDto dto, Warning warning) {
        zdlpuopuiu.btonecajqb(orderEditId, "orderEditId");
        zdlpuopuiu.btonecajqb(dto, "dto");
        zdlpuopuiu.btonecajqb(warning, "warning");
        return jyumaefscl(dto, orderEditId, warning);
    }

    public final OrderDetail iobyxmoadg(OrderDetailsDto dto) {
        OrderDetail orderDetailBtonecajqb;
        zdlpuopuiu.btonecajqb(dto, "dto");
        OrderDetailDto order = dto.getOrder();
        if (order != null && (orderDetailBtonecajqb = btonecajqb(order, dto.getPayments())) != null) {
            return orderDetailBtonecajqb;
        }
        return new OrderDetail(null, null, null, false, null, 0.0d, 0.0d, false, false, false, 0, false, false, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, false, null, null, Integer.MAX_VALUE, null);
    }

    public final Purchases ppxfxbqfkf(PurchasesDto dto, Integer num) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return oxmwwwfdhm(dto, num);
    }

    public final sz0.wkgbmnqykc wkgbmnqykc(OrdersDto dto, sz0.eablkybsjg ordersStatus) {
        Paging paging;
        zdlpuopuiu.btonecajqb(dto, "dto");
        zdlpuopuiu.btonecajqb(ordersStatus, "ordersStatus");
        wkgbmnqykc wkgbmnqykcVar = this.f64358wkgbmnqykc;
        List orders = dto.getOrders();
        if (orders == null) {
            orders = jyumaefscl.wflxmlrfwp();
        }
        List listPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf(orders, ordersStatus);
        PagingDto paging2 = dto.getPaging();
        if (paging2 == null || (paging = d21.zoijcleaow.iobyxmoadg(paging2)) == null) {
            paging = new Paging(0, 0, 0, 7, null);
        }
        return new sz0.wkgbmnqykc(listPpxfxbqfkf, paging, lqeggnwhkg.iobyxmoadg(dto.getOrderReferences()));
    }

    public final Purchase zoijcleaow(PurchaseHistoryDetailsDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        return ojitshcjhn(dto);
    }
}
