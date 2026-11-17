package m10;

import kotlin.jvm.internal.zdlpuopuiu;
import ng.zoijcleaow;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final EnumC1353iobyxmoadg f64930iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final DeliveryCode f64931zoijcleaow;

    /* JADX INFO: renamed from: m10.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public enum EnumC1353iobyxmoadg {
        POSITIVE("evaluation_positive"),
        NEGATIVE("evaluation_negative"),
        CANCEL("cancel"),
        ADDITIONAL("additional"),
        FOR_STOCK_PACKER("for_stock_packer");


        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f64937pmvmpeiblj = zoijcleaow.iobyxmoadg(iobyxmoadg());

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f64939zdlpuopuiu;

        EnumC1353iobyxmoadg(String str) {
            this.f64939zdlpuopuiu = str;
        }

        public final String wkgbmnqykc() {
            return this.f64939zdlpuopuiu;
        }
    }

    public iobyxmoadg(EnumC1353iobyxmoadg type, DeliveryCode deliveryCode) {
        zdlpuopuiu.btonecajqb(type, "type");
        this.f64930iobyxmoadg = type;
        this.f64931zoijcleaow = deliveryCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f64930iobyxmoadg == iobyxmoadgVar.f64930iobyxmoadg && this.f64931zoijcleaow == iobyxmoadgVar.f64931zoijcleaow;
    }

    public int hashCode() {
        int iHashCode = this.f64930iobyxmoadg.hashCode() * 31;
        DeliveryCode deliveryCode = this.f64931zoijcleaow;
        return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
    }

    public final DeliveryCode iobyxmoadg() {
        return this.f64931zoijcleaow;
    }

    public String toString() {
        return "RateVariantModel(type=" + this.f64930iobyxmoadg + ", deliveryType=" + this.f64931zoijcleaow + ")";
    }

    public final EnumC1353iobyxmoadg zoijcleaow() {
        return this.f64930iobyxmoadg;
    }
}
