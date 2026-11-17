package ru.myspar.proloyalty.card.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.chrono.ChronoLocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/myspar/proloyalty/card/domain/model/UserBalanceBreakDown;", "Landroid/os/Parcelable;", "", "amount", "Ljava/time/LocalDate;", ExternalMetricsManagerImpl.DATE, "<init>", "(ILjava/time/LocalDate;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "I", "zoijcleaow", "yggfygwlhe", "Ljava/time/LocalDate;", "ppxfxbqfkf", "()Ljava/time/LocalDate;", "eablkybsjg", "()Z", "isExpired", "card_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserBalanceBreakDown implements Parcelable {
    public static final Parcelable.Creator<UserBalanceBreakDown> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate date;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final int amount;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final UserBalanceBreakDown createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new UserBalanceBreakDown(parcel.readInt(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final UserBalanceBreakDown[] newArray(int i13) {
            return new UserBalanceBreakDown[i13];
        }
    }

    public UserBalanceBreakDown(int i13, LocalDate date) {
        zdlpuopuiu.btonecajqb(date, "date");
        this.amount = i13;
        this.date = date;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean eablkybsjg() {
        return this.date.compareTo((ChronoLocalDate) LocalDate.now(Clock.system(ZoneOffset.UTC))) <= 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserBalanceBreakDown)) {
            return false;
        }
        UserBalanceBreakDown userBalanceBreakDown = (UserBalanceBreakDown) other;
        return this.amount == userBalanceBreakDown.amount && zdlpuopuiu.eablkybsjg(this.date, userBalanceBreakDown.date);
    }

    public int hashCode() {
        return (Integer.hashCode(this.amount) * 31) + this.date.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    public String toString() {
        return "UserBalanceBreakDown(amount=" + this.amount + ", date=" + this.date + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.amount);
        dest.writeSerializable(this.date);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }
}
