package lx0;

import kotlin.jvm.internal.zdlpuopuiu;
import ky0.DeliveryDto;
import ky0.OrderSumDto;
import ky0.RecipientDto;
import ru.myspar.proloyalty.core.domain.models.delivery.Delivery;
import ru.myspar.proloyalty.core.domain.models.order.edit.OrderSum;
import ru.myspar.proloyalty.core.domain.models.recipient.Recipient;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {
    public static final Delivery iobyxmoadg(DeliveryDto deliveryDto) {
        zdlpuopuiu.btonecajqb(deliveryDto, "<this>");
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

    public static final Recipient ppxfxbqfkf(RecipientDto recipientDto) {
        zdlpuopuiu.btonecajqb(recipientDto, "<this>");
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

    public static final OrderSum zoijcleaow(OrderSumDto orderSumDto) {
        zdlpuopuiu.btonecajqb(orderSumDto, "<this>");
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
}
