package sz;

import ew.PaymentModelDto;
import fk.dvvnrvtcbc;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: renamed from: sz.wkgbmnqykc, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@bk.wflxmlrfwp
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002 \"B?\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b-\u0010%\u001a\u0004\b*\u0010,¨\u0006/"}, d2 = {"Lsz/wkgbmnqykc;", "", "", "seen0", "Lsz/eablkybsjg;", "order", "Lsz/rgvfuqvkyq;", "reference", "", "Lew/gxszxtbevo;", "payments", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(ILsz/eablkybsjg;Lsz/rgvfuqvkyq;Ljava/util/List;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "eablkybsjg", "(Lsz/wkgbmnqykc;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Lsz/eablkybsjg;", "zoijcleaow", "()Lsz/eablkybsjg;", "getOrder$annotations", "()V", "Lsz/rgvfuqvkyq;", "wkgbmnqykc", "()Lsz/rgvfuqvkyq;", "getReference$annotations", "ppxfxbqfkf", "Ljava/util/List;", "()Ljava/util/List;", "getPayments$annotations", "Companion", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrderDetailsDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final bk.zoijcleaow[] f108998wkgbmnqykc = {null, null, new fk.gxszxtbevo(PaymentModelDto.iobyxmoadg.f32218iobyxmoadg)};

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderDto order;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata and from toString */
    private final List payments;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderReferencesDto reference;

    /* JADX INFO: renamed from: sz.wkgbmnqykc$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return iobyxmoadg.f109002iobyxmoadg;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ OrderDetailsDto(int i13, OrderDto eablkybsjgVar, OrderReferencesDto rgvfuqvkyqVar, List list, dvvnrvtcbc dvvnrvtcbcVar) {
        if ((i13 & 1) == 0) {
            this.order = null;
        } else {
            this.order = eablkybsjgVar;
        }
        if ((i13 & 2) == 0) {
            this.reference = null;
        } else {
            this.reference = rgvfuqvkyqVar;
        }
        if ((i13 & 4) == 0) {
            this.payments = null;
        } else {
            this.payments = list;
        }
    }

    public static final /* synthetic */ void eablkybsjg(OrderDetailsDto self, ek.wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
        bk.zoijcleaow[] zoijcleaowVarArr = f108998wkgbmnqykc;
        if (output.zdlpuopuiu(serialDesc, 0) || self.order != null) {
            output.yggfygwlhe(serialDesc, 0, OrderDto.iobyxmoadg.f108844iobyxmoadg, self.order);
        }
        if (output.zdlpuopuiu(serialDesc, 1) || self.reference != null) {
            output.yggfygwlhe(serialDesc, 1, OrderReferencesDto.iobyxmoadg.f108982iobyxmoadg, self.reference);
        }
        if (!output.zdlpuopuiu(serialDesc, 2) && self.payments == null) {
            return;
        }
        output.yggfygwlhe(serialDesc, 2, zoijcleaowVarArr[2], self.payments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailsDto)) {
            return false;
        }
        OrderDetailsDto orderDetailsDto = (OrderDetailsDto) other;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.order, orderDetailsDto.order) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.reference, orderDetailsDto.reference) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.payments, orderDetailsDto.payments);
    }

    public int hashCode() {
        OrderDto eablkybsjgVar = this.order;
        int iHashCode = (eablkybsjgVar == null ? 0 : eablkybsjgVar.hashCode()) * 31;
        OrderReferencesDto rgvfuqvkyqVar = this.reference;
        int iHashCode2 = (iHashCode + (rgvfuqvkyqVar == null ? 0 : rgvfuqvkyqVar.hashCode())) * 31;
        List list = this.payments;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final List getPayments() {
        return this.payments;
    }

    public String toString() {
        return "OrderDetailsDto(order=" + this.order + ", reference=" + this.reference + ", payments=" + this.payments + ")";
    }

    /* JADX INFO: renamed from: wkgbmnqykc, reason: from getter */
    public final OrderReferencesDto getReference() {
        return this.reference;
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final OrderDto getOrder() {
        return this.order;
    }
}
