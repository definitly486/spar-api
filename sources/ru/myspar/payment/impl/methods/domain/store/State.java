package ru.myspar.payment.impl.methods.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.components.payment.api.models.PaymentModel;
import ru.myspar.payment.api.model.PaymentType;

/* JADX INFO: renamed from: ru.myspar.payment.impl.methods.domain.store.PaymentMethodsStore$State, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J`\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\rHÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH×\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0013H×\u0001¢\u0006\u0004\b \u0010\u0019J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!H×\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b6\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"ru/myspar/payment/impl/methods/domain/store/PaymentMethodsStore$State", "Landroid/os/Parcelable;", "", "isLoading", "", "price", "Lru/myspar/payment/api/model/PaymentType;", "type", "", "Lru/myspar/components/payment/api/models/PaymentModel;", "methods", "isPaymentBonuses", "selectedMethod", "Lp0/tzroggbefp;", "nominal", "<init>", "(ZLjava/lang/Double;Lru/myspar/payment/api/model/PaymentType;Ljava/util/List;ZLru/myspar/components/payment/api/models/PaymentModel;Lp0/tzroggbefp;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/payment/impl/methods/domain/store/PaymentMethodsStore$State;", "zoijcleaow", "(ZLjava/lang/Double;Lru/myspar/payment/api/model/PaymentType;Ljava/util/List;ZLru/myspar/components/payment/api/models/PaymentModel;Lp0/tzroggbefp;)Lru/myspar/payment/impl/methods/domain/store/PaymentMethodsStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "btonecajqb", "()Z", "yggfygwlhe", "Ljava/lang/Double;", "lqeggnwhkg", "()Ljava/lang/Double;", "jyumaefscl", "Lru/myspar/payment/api/model/PaymentType;", "dxjokdxxww", "()Lru/myspar/payment/api/model/PaymentType;", "iwizpuwonk", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "cqumvgiudr", "gtknphoqwx", "esjtqupxsv", "Lru/myspar/components/payment/api/models/PaymentModel;", "nufgyqmvbu", "()Lru/myspar/components/payment/api/models/PaymentModel;", "lereixgezr", "Lp0/tzroggbefp;", "gxszxtbevo", "()Lp0/tzroggbefp;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPaymentBonuses;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentModel selectedMethod;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final List methods;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentType type;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp nominal;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double price;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: ru.myspar.payment.impl.methods.domain.store.PaymentMethodsStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            boolean z13 = parcel.readInt() != 0;
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            PaymentType paymentType = (PaymentType) parcel.readParcelable(State.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            return new State(z13, dValueOf, paymentType, arrayList, parcel.readInt() != 0, (PaymentModel) parcel.readParcelable(State.class.getClassLoader()), et.iobyxmoadg.f31924iobyxmoadg.iobyxmoadg(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, Double d13, PaymentType type, List methods, boolean z14, PaymentModel paymentModel, tzroggbefp nominal) {
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(methods, "methods");
        zdlpuopuiu.btonecajqb(nominal, "nominal");
        this.isLoading = z13;
        this.price = d13;
        this.type = type;
        this.methods = methods;
        this.isPaymentBonuses = z14;
        this.selectedMethod = paymentModel;
        this.nominal = nominal;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, boolean z13, Double d13, PaymentType paymentType, List list, boolean z14, PaymentModel paymentModel, tzroggbefp tzroggbefpVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = state.isLoading;
        }
        if ((i13 & 2) != 0) {
            d13 = state.price;
        }
        Double d14 = d13;
        if ((i13 & 4) != 0) {
            paymentType = state.type;
        }
        PaymentType paymentType2 = paymentType;
        if ((i13 & 8) != 0) {
            list = state.methods;
        }
        List list2 = list;
        if ((i13 & 16) != 0) {
            z14 = state.isPaymentBonuses;
        }
        boolean z15 = z14;
        if ((i13 & 32) != 0) {
            paymentModel = state.selectedMethod;
        }
        PaymentModel paymentModel2 = paymentModel;
        if ((i13 & 64) != 0) {
            tzroggbefpVar = state.nominal;
        }
        return state.zoijcleaow(z13, d14, paymentType2, list2, z15, paymentModel2, tzroggbefpVar);
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final PaymentType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getMethods() {
        return this.methods;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.price, state.price) && zdlpuopuiu.eablkybsjg(this.type, state.type) && zdlpuopuiu.eablkybsjg(this.methods, state.methods) && this.isPaymentBonuses == state.isPaymentBonuses && zdlpuopuiu.eablkybsjg(this.selectedMethod, state.selectedMethod) && zdlpuopuiu.eablkybsjg(this.nominal, state.nominal);
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final boolean getIsPaymentBonuses() {
        return this.isPaymentBonuses;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final tzroggbefp getNominal() {
        return this.nominal;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        Double d13 = this.price;
        int iHashCode2 = (((((((iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31) + this.type.hashCode()) * 31) + this.methods.hashCode()) * 31) + Boolean.hashCode(this.isPaymentBonuses)) * 31;
        PaymentModel paymentModel = this.selectedMethod;
        return ((iHashCode2 + (paymentModel != null ? paymentModel.hashCode() : 0)) * 31) + this.nominal.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final Double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final PaymentModel getSelectedMethod() {
        return this.selectedMethod;
    }

    public String toString() {
        return "State(isLoading=" + this.isLoading + ", price=" + this.price + ", type=" + this.type + ", methods=" + this.methods + ", isPaymentBonuses=" + this.isPaymentBonuses + ", selectedMethod=" + this.selectedMethod + ", nominal=" + this.nominal + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isLoading ? 1 : 0);
        Double d13 = this.price;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
        dest.writeParcelable(this.type, flags);
        List list = this.methods;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeInt(this.isPaymentBonuses ? 1 : 0);
        dest.writeParcelable(this.selectedMethod, flags);
        et.iobyxmoadg.f31924iobyxmoadg.zoijcleaow(this.nominal, dest, flags);
    }

    public final State zoijcleaow(boolean isLoading, Double price, PaymentType type, List methods, boolean isPaymentBonuses, PaymentModel selectedMethod, tzroggbefp nominal) {
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(methods, "methods");
        zdlpuopuiu.btonecajqb(nominal, "nominal");
        return new State(isLoading, price, type, methods, isPaymentBonuses, selectedMethod, nominal);
    }
}
