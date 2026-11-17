package uy;

import fk.dvvnrvtcbc;
import fk.iozdgvuglv;
import fk.iyctptxqzt;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: uy.rgvfuqvkyq, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@bk.wflxmlrfwp
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002\u001d#B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001e\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001e\u0012\u0004\b%\u0010\"\u001a\u0004\b\u001d\u0010 ¨\u0006'"}, d2 = {"Luy/rgvfuqvkyq;", "", "", "seen0", "", "minPrice", "freeDeliveryFrom", "basketSum", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "wkgbmnqykc", "(Luy/rgvfuqvkyq;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Ljava/lang/Double;", "ppxfxbqfkf", "()Ljava/lang/Double;", "getMinPrice$annotations", "()V", "zoijcleaow", "getFreeDeliveryFrom$annotations", "getBasketSum$annotations", "Companion", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrderPropertiesDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double minPrice;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double basketSum;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double freeDeliveryFrom;

    /* JADX INFO: renamed from: uy.rgvfuqvkyq$iobyxmoadg */
    public /* synthetic */ class iobyxmoadg implements iozdgvuglv {
        private static final dk.gxszxtbevo descriptor;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f114714iobyxmoadg;

        static {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
            f114714iobyxmoadg = iobyxmoadgVar;
            iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.core.data.request.OrderPropertiesDto", iobyxmoadgVar, 3);
            iyctptxqztVar.ojitshcjhn("min_price", true);
            iyctptxqztVar.ojitshcjhn("free_delivery_from", true);
            iyctptxqztVar.ojitshcjhn("basket_sum", true);
            descriptor = iyctptxqztVar;
        }

        private iobyxmoadg() {
        }

        @Override // fk.iozdgvuglv
        public final bk.zoijcleaow[] eablkybsjg() {
            fk.yggfygwlhe yggfygwlheVar = fk.yggfygwlhe.f34253iobyxmoadg;
            return new bk.zoijcleaow[]{ck.iobyxmoadg.yggfygwlhe(yggfygwlheVar), ck.iobyxmoadg.yggfygwlhe(yggfygwlheVar), ck.iobyxmoadg.yggfygwlhe(yggfygwlheVar)};
        }

        @Override // bk.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public final OrderPropertiesDto zoijcleaow(ek.eablkybsjg decoder) {
            int i13;
            Double d13;
            Double d14;
            Double d15;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
            dk.gxszxtbevo gxszxtbevoVar = descriptor;
            ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
            Double d16 = null;
            if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                fk.yggfygwlhe yggfygwlheVar = fk.yggfygwlhe.f34253iobyxmoadg;
                Double d17 = (Double) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 0, yggfygwlheVar, null);
                Double d18 = (Double) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 1, yggfygwlheVar, null);
                d15 = (Double) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 2, yggfygwlheVar, null);
                i13 = 7;
                d14 = d18;
                d13 = d17;
            } else {
                boolean z13 = true;
                int i14 = 0;
                Double d19 = null;
                Double d23 = null;
                while (z13) {
                    int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                    if (iYadqdtsiqt == -1) {
                        z13 = false;
                    } else if (iYadqdtsiqt == 0) {
                        d16 = (Double) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 0, fk.yggfygwlhe.f34253iobyxmoadg, d16);
                        i14 |= 1;
                    } else if (iYadqdtsiqt == 1) {
                        d19 = (Double) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 1, fk.yggfygwlhe.f34253iobyxmoadg, d19);
                        i14 |= 2;
                    } else {
                        if (iYadqdtsiqt != 2) {
                            throw new UnknownFieldException(iYadqdtsiqt);
                        }
                        d23 = (Double) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 2, fk.yggfygwlhe.f34253iobyxmoadg, d23);
                        i14 |= 4;
                    }
                }
                i13 = i14;
                d13 = d16;
                d14 = d19;
                d15 = d23;
            }
            ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
            return new OrderPropertiesDto(i13, d13, d14, d15, null);
        }

        @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
        public final dk.gxszxtbevo iobyxmoadg() {
            return descriptor;
        }

        @Override // bk.agtfadlqog
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public final void wkgbmnqykc(ek.gxszxtbevo encoder, OrderPropertiesDto value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            dk.gxszxtbevo gxszxtbevoVar = descriptor;
            ek.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
            OrderPropertiesDto.wkgbmnqykc(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
            wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
        }

        @Override // fk.iozdgvuglv
        public bk.zoijcleaow[] ppxfxbqfkf() {
            return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
        }
    }

    /* JADX INFO: renamed from: uy.rgvfuqvkyq$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return iobyxmoadg.f114714iobyxmoadg;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ OrderPropertiesDto(int i13, Double d13, Double d14, Double d15, dvvnrvtcbc dvvnrvtcbcVar) {
        if ((i13 & 1) == 0) {
            this.minPrice = null;
        } else {
            this.minPrice = d13;
        }
        if ((i13 & 2) == 0) {
            this.freeDeliveryFrom = null;
        } else {
            this.freeDeliveryFrom = d14;
        }
        if ((i13 & 4) == 0) {
            this.basketSum = null;
        } else {
            this.basketSum = d15;
        }
    }

    public static final /* synthetic */ void wkgbmnqykc(OrderPropertiesDto self, ek.wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
        if (output.zdlpuopuiu(serialDesc, 0) || self.minPrice != null) {
            output.yggfygwlhe(serialDesc, 0, fk.yggfygwlhe.f34253iobyxmoadg, self.minPrice);
        }
        if (output.zdlpuopuiu(serialDesc, 1) || self.freeDeliveryFrom != null) {
            output.yggfygwlhe(serialDesc, 1, fk.yggfygwlhe.f34253iobyxmoadg, self.freeDeliveryFrom);
        }
        if (!output.zdlpuopuiu(serialDesc, 2) && self.basketSum == null) {
            return;
        }
        output.yggfygwlhe(serialDesc, 2, fk.yggfygwlhe.f34253iobyxmoadg, self.basketSum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderPropertiesDto)) {
            return false;
        }
        OrderPropertiesDto orderPropertiesDto = (OrderPropertiesDto) other;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.minPrice, orderPropertiesDto.minPrice) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.freeDeliveryFrom, orderPropertiesDto.freeDeliveryFrom) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.basketSum, orderPropertiesDto.basketSum);
    }

    public int hashCode() {
        Double d13 = this.minPrice;
        int iHashCode = (d13 == null ? 0 : d13.hashCode()) * 31;
        Double d14 = this.freeDeliveryFrom;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.basketSum;
        return iHashCode2 + (d15 != null ? d15.hashCode() : 0);
    }

    /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
    public final Double getBasketSum() {
        return this.basketSum;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final Double getMinPrice() {
        return this.minPrice;
    }

    public String toString() {
        return "OrderPropertiesDto(minPrice=" + this.minPrice + ", freeDeliveryFrom=" + this.freeDeliveryFrom + ", basketSum=" + this.basketSum + ")";
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final Double getFreeDeliveryFrom() {
        return this.freeDeliveryFrom;
    }
}
