package ru.myspar.proloyalty.payment.impl.web.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.payment.impl.web.presentation.PaymentFlowParams;

/* JADX INFO: renamed from: ru.myspar.proloyalty.payment.impl.web.domain.store.PaymentStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH×\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\u0018¨\u0006,"}, d2 = {"ru/myspar/proloyalty/payment/impl/web/domain/store/PaymentStore$State", "Landroid/os/Parcelable;", "", ImagesContract.URL, "", "totalPrice", "Lru/myspar/proloyalty/payment/impl/web/presentation/PaymentFlowParams;", "params", "jwt", "<init>", "(Ljava/lang/String;DLru/myspar/proloyalty/payment/impl/web/presentation/PaymentFlowParams;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/payment/impl/web/domain/store/PaymentStore$State;", "zoijcleaow", "(Ljava/lang/String;DLru/myspar/proloyalty/payment/impl/web/presentation/PaymentFlowParams;Ljava/lang/String;)Lru/myspar/proloyalty/payment/impl/web/domain/store/PaymentStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "agtfadlqog", "yggfygwlhe", "D", "getTotalPrice", "()D", "jyumaefscl", "Lru/myspar/proloyalty/payment/impl/web/presentation/PaymentFlowParams;", "gxszxtbevo", "()Lru/myspar/proloyalty/payment/impl/web/presentation/PaymentFlowParams;", "iwizpuwonk", "eablkybsjg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String jwt;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentFlowParams params;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final double totalPrice;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.payment.impl.web.domain.store.PaymentStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readString(), parcel.readDouble(), (PaymentFlowParams) parcel.readParcelable(State.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(String url, double d13, PaymentFlowParams params, String str) {
        zdlpuopuiu.btonecajqb(url, "url");
        zdlpuopuiu.btonecajqb(params, "params");
        this.url = url;
        this.totalPrice = d13;
        this.params = params;
        this.jwt = str;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, String str, double d13, PaymentFlowParams paymentFlowParams, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = state.url;
        }
        if ((i13 & 2) != 0) {
            d13 = state.totalPrice;
        }
        double d14 = d13;
        if ((i13 & 4) != 0) {
            paymentFlowParams = state.params;
        }
        PaymentFlowParams paymentFlowParams2 = paymentFlowParams;
        if ((i13 & 8) != 0) {
            str2 = state.jwt;
        }
        return state.zoijcleaow(str, d14, paymentFlowParams2, str2);
    }

    /* JADX INFO: renamed from: agtfadlqog, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getJwt() {
        return this.jwt;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.url, state.url) && Double.compare(this.totalPrice, state.totalPrice) == 0 && zdlpuopuiu.eablkybsjg(this.params, state.params) && zdlpuopuiu.eablkybsjg(this.jwt, state.jwt);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final PaymentFlowParams getParams() {
        return this.params;
    }

    public int hashCode() {
        int iHashCode = ((((this.url.hashCode() * 31) + Double.hashCode(this.totalPrice)) * 31) + this.params.hashCode()) * 31;
        String str = this.jwt;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "State(url=" + this.url + ", totalPrice=" + this.totalPrice + ", params=" + this.params + ", jwt=" + this.jwt + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.url);
        dest.writeDouble(this.totalPrice);
        dest.writeParcelable(this.params, flags);
        dest.writeString(this.jwt);
    }

    public final State zoijcleaow(String url, double totalPrice, PaymentFlowParams params, String jwt) {
        zdlpuopuiu.btonecajqb(url, "url");
        zdlpuopuiu.btonecajqb(params, "params");
        return new State(url, totalPrice, params, jwt);
    }

    public /* synthetic */ State(String str, double d13, PaymentFlowParams paymentFlowParams, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? 0.0d : d13, paymentFlowParams, str2);
    }
}
