package c01;

import kotlin.jvm.internal.zdlpuopuiu;
import ng.zoijcleaow;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final EnumC0336iobyxmoadg f18213iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final DeliveryCode f18214zoijcleaow;

    /* JADX INFO: renamed from: c01.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public enum EnumC0336iobyxmoadg {
        POSITIVE("evaluation_positive"),
        NEGATIVE("evaluation_negative"),
        CANCEL("cancel"),
        ADDITIONAL("additional"),
        FOR_STOCK_PACKER("for_stock_packer");


        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f18220pmvmpeiblj = zoijcleaow.iobyxmoadg(iobyxmoadg());

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f18222zdlpuopuiu;

        EnumC0336iobyxmoadg(String str) {
            this.f18222zdlpuopuiu = str;
        }

        public final String wkgbmnqykc() {
            return this.f18222zdlpuopuiu;
        }
    }

    public iobyxmoadg(EnumC0336iobyxmoadg type, DeliveryCode deliveryCode) {
        zdlpuopuiu.btonecajqb(type, "type");
        this.f18213iobyxmoadg = type;
        this.f18214zoijcleaow = deliveryCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f18213iobyxmoadg == iobyxmoadgVar.f18213iobyxmoadg && this.f18214zoijcleaow == iobyxmoadgVar.f18214zoijcleaow;
    }

    public int hashCode() {
        int iHashCode = this.f18213iobyxmoadg.hashCode() * 31;
        DeliveryCode deliveryCode = this.f18214zoijcleaow;
        return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
    }

    public final DeliveryCode iobyxmoadg() {
        return this.f18214zoijcleaow;
    }

    public String toString() {
        return "RateVariantModel(type=" + this.f18213iobyxmoadg + ", deliveryType=" + this.f18214zoijcleaow + ")";
    }

    public final EnumC0336iobyxmoadg zoijcleaow() {
        return this.f18213iobyxmoadg;
    }
}
