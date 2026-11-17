package modern.payments.ecomAndroid.util;

import android.os.Parcel;
import android.os.Parcelable;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B)\u0012 \b\u0002\u0010\u0006\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R5\u0010\u0006\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00028\u0006¢\u0006\u0012\n\u0004\b\u0006\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lmodern/payments/ecomAndroid/util/TryAgainListener;", "Landroid/os/Parcelable;", "Lkotlin/Function1;", "Llg/gxszxtbevo;", "Lgg/wwaezpbzkn;", "", "clickAction", "<init>", "(Ltg/draadjrbmk;)V", "onTryAgainClicked", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ltg/draadjrbmk;", "getClickAction", "()Ltg/draadjrbmk;", "getClickAction$annotations", "()V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TryAgainListener implements Parcelable {
    public static final Parcelable.Creator<TryAgainListener> CREATOR = new Creator();
    private final draadjrbmk clickAction;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TryAgainListener> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final TryAgainListener createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new TryAgainListener(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TryAgainListener[] newArray(int i13) {
            return new TryAgainListener[i13];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TryAgainListener() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void getClickAction$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final draadjrbmk getClickAction() {
        return this.clickAction;
    }

    public final Object onTryAgainClicked(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        draadjrbmk draadjrbmkVar = this.clickAction;
        if (draadjrbmkVar == null) {
            return null;
        }
        Object objInvoke = draadjrbmkVar.invoke(gxszxtbevoVar);
        return objInvoke == zoijcleaow.gxszxtbevo() ? objInvoke : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
    }

    public TryAgainListener(draadjrbmk draadjrbmkVar) {
        this.clickAction = draadjrbmkVar;
    }

    public /* synthetic */ TryAgainListener(draadjrbmk draadjrbmkVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : draadjrbmkVar);
    }
}
