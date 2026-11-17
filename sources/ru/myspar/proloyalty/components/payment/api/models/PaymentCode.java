package ru.myspar.proloyalty.components.payment.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ng.iobyxmoadg;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lru/myspar/proloyalty/components/payment/api/models/PaymentCode;", "Landroid/os/Parcelable;", "", "", "serverValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zdlpuopuiu", "Ljava/lang/String;", "dxjokdxxww", "()Ljava/lang/String;", "yggfygwlhe", "iobyxmoadg", "jyumaefscl", "iwizpuwonk", "cqumvgiudr", "esjtqupxsv", "lereixgezr", "pmvmpeiblj", "zynmafqrjb", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum PaymentCode implements Parcelable {
    CASH("cash"),
    CARD("card"),
    ONLINE("online"),
    SBP("sbp"),
    SBER_PAY("sber_pay"),
    SBP_RECURRING("sbp_online"),
    UNDEFINED(StringUtils.UNDEFINED);


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final String serverValue;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private static final /* synthetic */ iobyxmoadg f94073cdpycssgdh = ng.zoijcleaow.iobyxmoadg(lqeggnwhkg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<PaymentCode> CREATOR = new Parcelable.Creator() { // from class: ru.myspar.proloyalty.components.payment.api.models.PaymentCode.zoijcleaow
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final PaymentCode createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return PaymentCode.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final PaymentCode[] newArray(int i13) {
            return new PaymentCode[i13];
        }
    };

    /* JADX INFO: renamed from: ru.myspar.proloyalty.components.payment.api.models.PaymentCode$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final PaymentCode iobyxmoadg(String value) {
            Object next;
            zdlpuopuiu.btonecajqb(value, "value");
            Iterator<E> it = PaymentCode.nufgyqmvbu().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!zdlpuopuiu.eablkybsjg(((PaymentCode) next).getServerValue(), value));
            PaymentCode paymentCode = (PaymentCode) next;
            return paymentCode == null ? PaymentCode.UNDEFINED : paymentCode;
        }

        private Companion() {
        }
    }

    PaymentCode(String str) {
        this.serverValue = str;
    }

    public static iobyxmoadg nufgyqmvbu() {
        return f94073cdpycssgdh;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getServerValue() {
        return this.serverValue;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(name());
    }
}
