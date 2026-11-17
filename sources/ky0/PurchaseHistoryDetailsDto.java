package ky0;

import fk.dvvnrvtcbc;
import fk.iozdgvuglv;
import fk.iyctptxqzt;
import fk.sflfametgt;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: ky0.jyumaefscl, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@bk.wflxmlrfwp
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001b\u0010B%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010\u001d¨\u0006!"}, d2 = {"Lky0/jyumaefscl;", "", "", "seen0", "Lky0/iwizpuwonk;", "purchaseInfo", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(ILky0/iwizpuwonk;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "zoijcleaow", "(Lky0/jyumaefscl;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Lky0/iwizpuwonk;", "()Lky0/iwizpuwonk;", "getPurchaseInfo$annotations", "()V", "Companion", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PurchaseHistoryDetailsDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final PurchaseHistoryDto purchaseInfo;

    /* JADX INFO: renamed from: ky0.jyumaefscl$iobyxmoadg */
    public /* synthetic */ class iobyxmoadg implements iozdgvuglv {
        private static final dk.gxszxtbevo descriptor;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f60935iobyxmoadg;

        static {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
            f60935iobyxmoadg = iobyxmoadgVar;
            iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.proloyalty.core.data.response.order.PurchaseHistoryDetailsDto", iobyxmoadgVar, 1);
            iyctptxqztVar.ojitshcjhn("item", false);
            descriptor = iyctptxqztVar;
        }

        private iobyxmoadg() {
        }

        @Override // fk.iozdgvuglv
        public final bk.zoijcleaow[] eablkybsjg() {
            return new bk.zoijcleaow[]{PurchaseHistoryDto.iobyxmoadg.f60933iobyxmoadg};
        }

        @Override // bk.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public final PurchaseHistoryDetailsDto zoijcleaow(ek.eablkybsjg decoder) {
            PurchaseHistoryDto iwizpuwonkVar;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
            dk.gxszxtbevo gxszxtbevoVar = descriptor;
            ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
            int i13 = 1;
            dvvnrvtcbc dvvnrvtcbcVar = null;
            if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                iwizpuwonkVar = (PurchaseHistoryDto) ppxfxbqfkfVarPpxfxbqfkf.lereixgezr(gxszxtbevoVar, 0, PurchaseHistoryDto.iobyxmoadg.f60933iobyxmoadg, null);
            } else {
                boolean z13 = true;
                int i14 = 0;
                iwizpuwonkVar = null;
                while (z13) {
                    int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                    if (iYadqdtsiqt == -1) {
                        z13 = false;
                    } else {
                        if (iYadqdtsiqt != 0) {
                            throw new UnknownFieldException(iYadqdtsiqt);
                        }
                        iwizpuwonkVar = (PurchaseHistoryDto) ppxfxbqfkfVarPpxfxbqfkf.lereixgezr(gxszxtbevoVar, 0, PurchaseHistoryDto.iobyxmoadg.f60933iobyxmoadg, iwizpuwonkVar);
                        i14 = 1;
                    }
                }
                i13 = i14;
            }
            ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
            return new PurchaseHistoryDetailsDto(i13, iwizpuwonkVar, dvvnrvtcbcVar);
        }

        @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
        public final dk.gxszxtbevo iobyxmoadg() {
            return descriptor;
        }

        @Override // bk.agtfadlqog
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public final void wkgbmnqykc(ek.gxszxtbevo encoder, PurchaseHistoryDetailsDto value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            dk.gxszxtbevo gxszxtbevoVar = descriptor;
            ek.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
            PurchaseHistoryDetailsDto.zoijcleaow(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
            wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
        }

        @Override // fk.iozdgvuglv
        public bk.zoijcleaow[] ppxfxbqfkf() {
            return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
        }
    }

    /* JADX INFO: renamed from: ky0.jyumaefscl$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return iobyxmoadg.f60935iobyxmoadg;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ PurchaseHistoryDetailsDto(int i13, PurchaseHistoryDto iwizpuwonkVar, dvvnrvtcbc dvvnrvtcbcVar) {
        if (1 != (i13 & 1)) {
            sflfametgt.zoijcleaow(i13, 1, iobyxmoadg.f60935iobyxmoadg.iobyxmoadg());
        }
        this.purchaseInfo = iwizpuwonkVar;
    }

    public static final /* synthetic */ void zoijcleaow(PurchaseHistoryDetailsDto self, ek.wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
        output.lqeggnwhkg(serialDesc, 0, PurchaseHistoryDto.iobyxmoadg.f60933iobyxmoadg, self.purchaseInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PurchaseHistoryDetailsDto) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.purchaseInfo, ((PurchaseHistoryDetailsDto) other).purchaseInfo);
    }

    public int hashCode() {
        return this.purchaseInfo.hashCode();
    }

    /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
    public final PurchaseHistoryDto getPurchaseInfo() {
        return this.purchaseInfo;
    }

    public String toString() {
        return "PurchaseHistoryDetailsDto(purchaseInfo=" + this.purchaseInfo + ")";
    }
}
