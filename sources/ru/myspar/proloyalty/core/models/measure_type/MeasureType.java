package ru.myspar.proloyalty.core.models.measure_type;

import android.os.Parcel;
import android.os.Parcelable;
import bk.wflxmlrfwp;
import bk.zoijcleaow;
import dk.gxszxtbevo;
import ek.eablkybsjg;
import ek.wkgbmnqykc;
import fk.dvvnrvtcbc;
import fk.iozdgvuglv;
import fk.iyctptxqzt;
import fk.sflfametgt;
import fk.yggfygwlhe;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
@wflxmlrfwp
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00122\u00020\u0001:\u0003\u0013\u0014\u0015J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0016\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lru/myspar/proloyalty/core/models/measure_type/MeasureType;", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "other", "mbcevpiqjq", "(Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;)Lru/myspar/proloyalty/core/models/measure_type/MeasureType;", "", "kcexrzcfyt", "()D", "basketDefault", "zdlpuopuiu", "minAvailable", "lereixgezr", "ratio", "", "getValue", "()Ljava/lang/String;", "value", "Companion", "AMOUNT", "WEIGHT", "iobyxmoadg", "Lru/myspar/proloyalty/core/models/measure_type/MeasureType$AMOUNT;", "Lru/myspar/proloyalty/core/models/measure_type/MeasureType$WEIGHT;", "models_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MeasureType extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f95275iobyxmoadg;

    @wflxmlrfwp
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u00021\u001cB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b'\u0010*R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u0014\u0010/\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010 ¨\u00062"}, d2 = {"Lru/myspar/proloyalty/core/models/measure_type/MeasureType$AMOUNT;", "Lru/myspar/proloyalty/core/models/measure_type/MeasureType;", "", "basketDefault", "minAvailable", "ratio", "<init>", "(DDD)V", "", "seen0", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "(IDDDLfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "eablkybsjg", "(Lru/myspar/proloyalty/core/models/measure_type/MeasureType$AMOUNT;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(DDD)Lru/myspar/proloyalty/core/models/measure_type/MeasureType$AMOUNT;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "D", "kcexrzcfyt", "()D", "yggfygwlhe", "jyumaefscl", "lereixgezr", "getValue", "value", "Companion", "iobyxmoadg", "models_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AMOUNT implements MeasureType {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final double ratio;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final double minAvailable;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final double basketDefault;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<AMOUNT> CREATOR = new ppxfxbqfkf();

        public /* synthetic */ class iobyxmoadg implements iozdgvuglv {
            private static final gxszxtbevo descriptor;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final iobyxmoadg f95270iobyxmoadg;

            static {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
                f95270iobyxmoadg = iobyxmoadgVar;
                iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.proloyalty.core.models.measure_type.MeasureType.AMOUNT", iobyxmoadgVar, 3);
                iyctptxqztVar.ojitshcjhn("basketDefault", false);
                iyctptxqztVar.ojitshcjhn("minAvailable", false);
                iyctptxqztVar.ojitshcjhn("ratio", false);
                descriptor = iyctptxqztVar;
            }

            private iobyxmoadg() {
            }

            @Override // fk.iozdgvuglv
            public final zoijcleaow[] eablkybsjg() {
                yggfygwlhe yggfygwlheVar = yggfygwlhe.f34253iobyxmoadg;
                return new zoijcleaow[]{yggfygwlheVar, yggfygwlheVar, yggfygwlheVar};
            }

            @Override // bk.iobyxmoadg
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public final AMOUNT zoijcleaow(eablkybsjg decoder) {
                int i13;
                double dZdlpuopuiu;
                double d13;
                double d14;
                zdlpuopuiu.btonecajqb(decoder, "decoder");
                gxszxtbevo gxszxtbevoVar = descriptor;
                ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
                if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                    double dZdlpuopuiu2 = ppxfxbqfkfVarPpxfxbqfkf.zdlpuopuiu(gxszxtbevoVar, 0);
                    double dZdlpuopuiu3 = ppxfxbqfkfVarPpxfxbqfkf.zdlpuopuiu(gxszxtbevoVar, 1);
                    dZdlpuopuiu = ppxfxbqfkfVarPpxfxbqfkf.zdlpuopuiu(gxszxtbevoVar, 2);
                    i13 = 7;
                    d13 = dZdlpuopuiu2;
                    d14 = dZdlpuopuiu3;
                } else {
                    double dZdlpuopuiu4 = 0.0d;
                    boolean z13 = true;
                    int i14 = 0;
                    double dZdlpuopuiu5 = 0.0d;
                    double dZdlpuopuiu6 = 0.0d;
                    while (z13) {
                        int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                        if (iYadqdtsiqt == -1) {
                            z13 = false;
                        } else if (iYadqdtsiqt == 0) {
                            dZdlpuopuiu5 = ppxfxbqfkfVarPpxfxbqfkf.zdlpuopuiu(gxszxtbevoVar, 0);
                            i14 |= 1;
                        } else if (iYadqdtsiqt == 1) {
                            dZdlpuopuiu6 = ppxfxbqfkfVarPpxfxbqfkf.zdlpuopuiu(gxszxtbevoVar, 1);
                            i14 |= 2;
                        } else {
                            if (iYadqdtsiqt != 2) {
                                throw new UnknownFieldException(iYadqdtsiqt);
                            }
                            dZdlpuopuiu4 = ppxfxbqfkfVarPpxfxbqfkf.zdlpuopuiu(gxszxtbevoVar, 2);
                            i14 |= 4;
                        }
                    }
                    i13 = i14;
                    dZdlpuopuiu = dZdlpuopuiu4;
                    d13 = dZdlpuopuiu5;
                    d14 = dZdlpuopuiu6;
                }
                ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
                return new AMOUNT(i13, d13, d14, dZdlpuopuiu, null);
            }

            @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
            public final gxszxtbevo iobyxmoadg() {
                return descriptor;
            }

            @Override // bk.agtfadlqog
            /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
            public final void wkgbmnqykc(ek.gxszxtbevo encoder, AMOUNT value) {
                zdlpuopuiu.btonecajqb(encoder, "encoder");
                zdlpuopuiu.btonecajqb(value, "value");
                gxszxtbevo gxszxtbevoVar = descriptor;
                wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
                AMOUNT.eablkybsjg(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
                wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
            }

            @Override // fk.iozdgvuglv
            public zoijcleaow[] ppxfxbqfkf() {
                return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
            }
        }

        public static final class ppxfxbqfkf implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final AMOUNT createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new AMOUNT(parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final AMOUNT[] newArray(int i13) {
                return new AMOUNT[i13];
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.models.measure_type.MeasureType$AMOUNT$zoijcleaow, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final zoijcleaow serializer() {
                return iobyxmoadg.f95270iobyxmoadg;
            }

            public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
                this();
            }
        }

        public /* synthetic */ AMOUNT(int i13, double d13, double d14, double d15, dvvnrvtcbc dvvnrvtcbcVar) {
            if (7 != (i13 & 7)) {
                sflfametgt.zoijcleaow(i13, 7, iobyxmoadg.f95270iobyxmoadg.iobyxmoadg());
            }
            this.basketDefault = d13;
            this.minAvailable = d14;
            this.ratio = d15;
        }

        public static final /* synthetic */ void eablkybsjg(AMOUNT self, wkgbmnqykc output, gxszxtbevo serialDesc) {
            output.ojitshcjhn(serialDesc, 0, self.getBasketDefault());
            output.ojitshcjhn(serialDesc, 1, self.getMinAvailable());
            output.ojitshcjhn(serialDesc, 2, self.getRatio());
        }

        public static /* synthetic */ AMOUNT ppxfxbqfkf(AMOUNT amount, double d13, double d14, double d15, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                d13 = amount.basketDefault;
            }
            double d16 = d13;
            if ((i13 & 2) != 0) {
                d14 = amount.minAvailable;
            }
            double d17 = d14;
            if ((i13 & 4) != 0) {
                d15 = amount.ratio;
            }
            return amount.zoijcleaow(d16, d17, d15);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AMOUNT)) {
                return false;
            }
            AMOUNT amount = (AMOUNT) other;
            return Double.compare(this.basketDefault, amount.basketDefault) == 0 && Double.compare(this.minAvailable, amount.minAvailable) == 0 && Double.compare(this.ratio, amount.ratio) == 0;
        }

        @Override // ru.myspar.proloyalty.core.models.measure_type.MeasureType
        public String getValue() {
            return "шт";
        }

        public int hashCode() {
            return (((Double.hashCode(this.basketDefault) * 31) + Double.hashCode(this.minAvailable)) * 31) + Double.hashCode(this.ratio);
        }

        @Override // ru.myspar.proloyalty.core.models.measure_type.MeasureType
        /* JADX INFO: renamed from: kcexrzcfyt, reason: from getter */
        public double getBasketDefault() {
            return this.basketDefault;
        }

        @Override // ru.myspar.proloyalty.core.models.measure_type.MeasureType
        /* JADX INFO: renamed from: lereixgezr, reason: from getter */
        public double getRatio() {
            return this.ratio;
        }

        public String toString() {
            return "AMOUNT(basketDefault=" + this.basketDefault + ", minAvailable=" + this.minAvailable + ", ratio=" + this.ratio + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeDouble(this.basketDefault);
            dest.writeDouble(this.minAvailable);
            dest.writeDouble(this.ratio);
        }

        @Override // ru.myspar.proloyalty.core.models.measure_type.MeasureType
        /* JADX INFO: renamed from: zdlpuopuiu, reason: from getter */
        public double getMinAvailable() {
            return this.minAvailable;
        }

        public final AMOUNT zoijcleaow(double basketDefault, double minAvailable, double ratio) {
            return new AMOUNT(basketDefault, minAvailable, ratio);
        }

        public AMOUNT(double d13, double d14, double d15) {
            this.basketDefault = d13;
            this.minAvailable = d14;
            this.ratio = d15;
        }
    }

    @wflxmlrfwp
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u00021\u001cB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b'\u0010*R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u0014\u0010/\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010 ¨\u00062"}, d2 = {"Lru/myspar/proloyalty/core/models/measure_type/MeasureType$WEIGHT;", "Lru/myspar/proloyalty/core/models/measure_type/MeasureType;", "", "basketDefault", "minAvailable", "ratio", "<init>", "(DDD)V", "", "seen0", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "(IDDDLfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "eablkybsjg", "(Lru/myspar/proloyalty/core/models/measure_type/MeasureType$WEIGHT;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(DDD)Lru/myspar/proloyalty/core/models/measure_type/MeasureType$WEIGHT;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "D", "kcexrzcfyt", "()D", "yggfygwlhe", "jyumaefscl", "lereixgezr", "getValue", "value", "Companion", "iobyxmoadg", "models_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WEIGHT implements MeasureType {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final double ratio;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final double minAvailable;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final double basketDefault;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<WEIGHT> CREATOR = new ppxfxbqfkf();

        public /* synthetic */ class iobyxmoadg implements iozdgvuglv {
            private static final gxszxtbevo descriptor;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final iobyxmoadg f95274iobyxmoadg;

            static {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
                f95274iobyxmoadg = iobyxmoadgVar;
                iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.proloyalty.core.models.measure_type.MeasureType.WEIGHT", iobyxmoadgVar, 3);
                iyctptxqztVar.ojitshcjhn("basketDefault", false);
                iyctptxqztVar.ojitshcjhn("minAvailable", false);
                iyctptxqztVar.ojitshcjhn("ratio", false);
                descriptor = iyctptxqztVar;
            }

            private iobyxmoadg() {
            }

            @Override // fk.iozdgvuglv
            public final zoijcleaow[] eablkybsjg() {
                yggfygwlhe yggfygwlheVar = yggfygwlhe.f34253iobyxmoadg;
                return new zoijcleaow[]{yggfygwlheVar, yggfygwlheVar, yggfygwlheVar};
            }

            @Override // bk.iobyxmoadg
            /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
            public final WEIGHT zoijcleaow(eablkybsjg decoder) {
                int i13;
                double dZdlpuopuiu;
                double d13;
                double d14;
                zdlpuopuiu.btonecajqb(decoder, "decoder");
                gxszxtbevo gxszxtbevoVar = descriptor;
                ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
                if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                    double dZdlpuopuiu2 = ppxfxbqfkfVarPpxfxbqfkf.zdlpuopuiu(gxszxtbevoVar, 0);
                    double dZdlpuopuiu3 = ppxfxbqfkfVarPpxfxbqfkf.zdlpuopuiu(gxszxtbevoVar, 1);
                    dZdlpuopuiu = ppxfxbqfkfVarPpxfxbqfkf.zdlpuopuiu(gxszxtbevoVar, 2);
                    i13 = 7;
                    d13 = dZdlpuopuiu2;
                    d14 = dZdlpuopuiu3;
                } else {
                    double dZdlpuopuiu4 = 0.0d;
                    boolean z13 = true;
                    int i14 = 0;
                    double dZdlpuopuiu5 = 0.0d;
                    double dZdlpuopuiu6 = 0.0d;
                    while (z13) {
                        int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                        if (iYadqdtsiqt == -1) {
                            z13 = false;
                        } else if (iYadqdtsiqt == 0) {
                            dZdlpuopuiu5 = ppxfxbqfkfVarPpxfxbqfkf.zdlpuopuiu(gxszxtbevoVar, 0);
                            i14 |= 1;
                        } else if (iYadqdtsiqt == 1) {
                            dZdlpuopuiu6 = ppxfxbqfkfVarPpxfxbqfkf.zdlpuopuiu(gxszxtbevoVar, 1);
                            i14 |= 2;
                        } else {
                            if (iYadqdtsiqt != 2) {
                                throw new UnknownFieldException(iYadqdtsiqt);
                            }
                            dZdlpuopuiu4 = ppxfxbqfkfVarPpxfxbqfkf.zdlpuopuiu(gxszxtbevoVar, 2);
                            i14 |= 4;
                        }
                    }
                    i13 = i14;
                    dZdlpuopuiu = dZdlpuopuiu4;
                    d13 = dZdlpuopuiu5;
                    d14 = dZdlpuopuiu6;
                }
                ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
                return new WEIGHT(i13, d13, d14, dZdlpuopuiu, null);
            }

            @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
            public final gxszxtbevo iobyxmoadg() {
                return descriptor;
            }

            @Override // bk.agtfadlqog
            /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
            public final void wkgbmnqykc(ek.gxszxtbevo encoder, WEIGHT value) {
                zdlpuopuiu.btonecajqb(encoder, "encoder");
                zdlpuopuiu.btonecajqb(value, "value");
                gxszxtbevo gxszxtbevoVar = descriptor;
                wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
                WEIGHT.eablkybsjg(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
                wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
            }

            @Override // fk.iozdgvuglv
            public zoijcleaow[] ppxfxbqfkf() {
                return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
            }
        }

        public static final class ppxfxbqfkf implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final WEIGHT createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new WEIGHT(parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final WEIGHT[] newArray(int i13) {
                return new WEIGHT[i13];
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.models.measure_type.MeasureType$WEIGHT$zoijcleaow, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final zoijcleaow serializer() {
                return iobyxmoadg.f95274iobyxmoadg;
            }

            public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
                this();
            }
        }

        public /* synthetic */ WEIGHT(int i13, double d13, double d14, double d15, dvvnrvtcbc dvvnrvtcbcVar) {
            if (7 != (i13 & 7)) {
                sflfametgt.zoijcleaow(i13, 7, iobyxmoadg.f95274iobyxmoadg.iobyxmoadg());
            }
            this.basketDefault = d13;
            this.minAvailable = d14;
            this.ratio = d15;
        }

        public static final /* synthetic */ void eablkybsjg(WEIGHT self, wkgbmnqykc output, gxszxtbevo serialDesc) {
            output.ojitshcjhn(serialDesc, 0, self.getBasketDefault());
            output.ojitshcjhn(serialDesc, 1, self.getMinAvailable());
            output.ojitshcjhn(serialDesc, 2, self.getRatio());
        }

        public static /* synthetic */ WEIGHT ppxfxbqfkf(WEIGHT weight, double d13, double d14, double d15, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                d13 = weight.basketDefault;
            }
            double d16 = d13;
            if ((i13 & 2) != 0) {
                d14 = weight.minAvailable;
            }
            double d17 = d14;
            if ((i13 & 4) != 0) {
                d15 = weight.ratio;
            }
            return weight.zoijcleaow(d16, d17, d15);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WEIGHT)) {
                return false;
            }
            WEIGHT weight = (WEIGHT) other;
            return Double.compare(this.basketDefault, weight.basketDefault) == 0 && Double.compare(this.minAvailable, weight.minAvailable) == 0 && Double.compare(this.ratio, weight.ratio) == 0;
        }

        @Override // ru.myspar.proloyalty.core.models.measure_type.MeasureType
        public String getValue() {
            return "кг";
        }

        public int hashCode() {
            return (((Double.hashCode(this.basketDefault) * 31) + Double.hashCode(this.minAvailable)) * 31) + Double.hashCode(this.ratio);
        }

        @Override // ru.myspar.proloyalty.core.models.measure_type.MeasureType
        /* JADX INFO: renamed from: kcexrzcfyt, reason: from getter */
        public double getBasketDefault() {
            return this.basketDefault;
        }

        @Override // ru.myspar.proloyalty.core.models.measure_type.MeasureType
        /* JADX INFO: renamed from: lereixgezr, reason: from getter */
        public double getRatio() {
            return this.ratio;
        }

        public String toString() {
            return "WEIGHT(basketDefault=" + this.basketDefault + ", minAvailable=" + this.minAvailable + ", ratio=" + this.ratio + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeDouble(this.basketDefault);
            dest.writeDouble(this.minAvailable);
            dest.writeDouble(this.ratio);
        }

        @Override // ru.myspar.proloyalty.core.models.measure_type.MeasureType
        /* JADX INFO: renamed from: zdlpuopuiu, reason: from getter */
        public double getMinAvailable() {
            return this.minAvailable;
        }

        public final WEIGHT zoijcleaow(double basketDefault, double minAvailable, double ratio) {
            return new WEIGHT(basketDefault, minAvailable, ratio);
        }

        public WEIGHT(double d13, double d14, double d15) {
            this.basketDefault = d13;
            this.minAvailable = d14;
            this.ratio = d15;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.core.models.measure_type.MeasureType$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ Companion f95275iobyxmoadg = new Companion();

        private Companion() {
        }

        public final MeasureType iobyxmoadg(String str) {
            if (zdlpuopuiu.eablkybsjg(str, "шт")) {
                return new AMOUNT(1.0d, 1.0d, 1.0d);
            }
            return zdlpuopuiu.eablkybsjg(str, "кг") ? zoijcleaow() : zoijcleaow();
        }

        public final zoijcleaow serializer() {
            return new bk.gtknphoqwx("ru.myspar.proloyalty.core.models.measure_type.MeasureType", cllcsxoeiz.zoijcleaow(MeasureType.class), new ah.wkgbmnqykc[]{cllcsxoeiz.zoijcleaow(AMOUNT.class), cllcsxoeiz.zoijcleaow(WEIGHT.class)}, new zoijcleaow[]{AMOUNT.iobyxmoadg.f95270iobyxmoadg, WEIGHT.iobyxmoadg.f95274iobyxmoadg}, new Annotation[0]);
        }

        public final MeasureType zoijcleaow() {
            return new WEIGHT(1.0d, 0.1d, 0.1d);
        }
    }

    String getValue();

    /* JADX INFO: renamed from: kcexrzcfyt */
    double getBasketDefault();

    /* JADX INFO: renamed from: lereixgezr */
    double getRatio();

    default MeasureType mbcevpiqjq(MeasureTypeModel other) {
        zdlpuopuiu.btonecajqb(other, "other");
        Object obj = null;
        if (this instanceof AMOUNT) {
            for (Object obj2 : other.getUnits()) {
                if (((MeasureType) obj2) instanceof AMOUNT) {
                    obj = obj2;
                    break;
                }
            }
            MeasureType measureType = (MeasureType) obj;
            return AMOUNT.ppxfxbqfkf((AMOUNT) this, measureType != null ? measureType.getBasketDefault() : ((AMOUNT) this).getBasketDefault(), 0.0d, 0.0d, 6, null);
        }
        if (!(this instanceof WEIGHT)) {
            throw new NoWhenBranchMatchedException();
        }
        for (Object obj3 : other.getUnits()) {
            if (((MeasureType) obj3) instanceof WEIGHT) {
                obj = obj3;
                break;
            }
        }
        MeasureType measureType2 = (MeasureType) obj;
        return WEIGHT.ppxfxbqfkf((WEIGHT) this, measureType2 != null ? measureType2.getBasketDefault() : ((WEIGHT) this).getBasketDefault(), 0.0d, 0.0d, 6, null);
    }

    /* JADX INFO: renamed from: zdlpuopuiu */
    double getMinAvailable();
}
