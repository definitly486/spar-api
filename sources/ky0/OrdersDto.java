package ky0;

import d21.PagingDto;
import fk.dvvnrvtcbc;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: renamed from: ky0.zdlpuopuiu, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@bk.wflxmlrfwp
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002 &B?\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010%\u001a\u0004\b(\u0010)R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010+\u0012\u0004\b-\u0010%\u001a\u0004\b&\u0010,¨\u0006/"}, d2 = {"Lky0/zdlpuopuiu;", "", "", "seen0", "", "Lky0/gxszxtbevo;", "orders", "Ld21/iobyxmoadg;", "paging", "Lky0/vdvldrhtss;", "orderReferences", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ld21/iobyxmoadg;Lky0/vdvldrhtss;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "eablkybsjg", "(Lky0/zdlpuopuiu;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Ljava/util/List;", "ppxfxbqfkf", "()Ljava/util/List;", "getOrders$annotations", "()V", "zoijcleaow", "Ld21/iobyxmoadg;", "wkgbmnqykc", "()Ld21/iobyxmoadg;", "getPaging$annotations", "Lky0/vdvldrhtss;", "()Lky0/vdvldrhtss;", "getOrderReferences$annotations", "Companion", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrdersDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final bk.zoijcleaow[] f61052wkgbmnqykc = {new fk.gxszxtbevo(OrderDto.iobyxmoadg.f60912iobyxmoadg), null, null};

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final List orders;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderReferencesDto orderReferences;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final PagingDto paging;

    /* JADX INFO: renamed from: ky0.zdlpuopuiu$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return iobyxmoadg.f61056iobyxmoadg;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ OrdersDto(int i13, List list, PagingDto pagingDto, OrderReferencesDto vdvldrhtssVar, dvvnrvtcbc dvvnrvtcbcVar) {
        if ((i13 & 1) == 0) {
            this.orders = null;
        } else {
            this.orders = list;
        }
        if ((i13 & 2) == 0) {
            this.paging = null;
        } else {
            this.paging = pagingDto;
        }
        if ((i13 & 4) == 0) {
            this.orderReferences = null;
        } else {
            this.orderReferences = vdvldrhtssVar;
        }
    }

    public static final /* synthetic */ void eablkybsjg(OrdersDto self, ek.wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
        bk.zoijcleaow[] zoijcleaowVarArr = f61052wkgbmnqykc;
        if (output.zdlpuopuiu(serialDesc, 0) || self.orders != null) {
            output.yggfygwlhe(serialDesc, 0, zoijcleaowVarArr[0], self.orders);
        }
        if (output.zdlpuopuiu(serialDesc, 1) || self.paging != null) {
            output.yggfygwlhe(serialDesc, 1, PagingDto.C0486iobyxmoadg.f26840iobyxmoadg, self.paging);
        }
        if (!output.zdlpuopuiu(serialDesc, 2) && self.orderReferences == null) {
            return;
        }
        output.yggfygwlhe(serialDesc, 2, OrderReferencesDto.iobyxmoadg.f61012iobyxmoadg, self.orderReferences);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrdersDto)) {
            return false;
        }
        OrdersDto ordersDto = (OrdersDto) other;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.orders, ordersDto.orders) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.paging, ordersDto.paging) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.orderReferences, ordersDto.orderReferences);
    }

    public int hashCode() {
        List list = this.orders;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        PagingDto pagingDto = this.paging;
        int iHashCode2 = (iHashCode + (pagingDto == null ? 0 : pagingDto.hashCode())) * 31;
        OrderReferencesDto vdvldrhtssVar = this.orderReferences;
        return iHashCode2 + (vdvldrhtssVar != null ? vdvldrhtssVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final List getOrders() {
        return this.orders;
    }

    public String toString() {
        return "OrdersDto(orders=" + this.orders + ", paging=" + this.paging + ", orderReferences=" + this.orderReferences + ")";
    }

    /* JADX INFO: renamed from: wkgbmnqykc, reason: from getter */
    public final PagingDto getPaging() {
        return this.paging;
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final OrderReferencesDto getOrderReferences() {
        return this.orderReferences;
    }
}
