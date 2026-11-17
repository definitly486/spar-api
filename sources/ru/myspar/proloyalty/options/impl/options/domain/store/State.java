package ru.myspar.proloyalty.options.impl.options.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: ru.myspar.proloyalty.options.impl.options.domain.store.OptionsStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0019Jp\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH×\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0013H×\u0001¢\u0006\u0004\b \u0010\u0019J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!H×\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b6\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010&\u001a\u0004\b<\u0010(¨\u0006="}, d2 = {"ru/myspar/proloyalty/options/impl/options/domain/store/OptionsStore$State", "Landroid/os/Parcelable;", "", "isEmailNotificationEnabled", "isSmsNotificationEnabled", "isPushNotificationEnabled", "isAutoBrightnessEnabled", "isShowQrEnabled", "", "Lru/myspar/proloyalty/user/domain/model/UserSubscriptionSetting;", "userSubscriptions", "isDarkModeOptionVisible", "Loz0/iobyxmoadg;", "darkModeState", "isLoading", "<init>", "(ZZZZZLjava/util/List;ZLoz0/iobyxmoadg;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/options/impl/options/domain/store/OptionsStore$State;", "zoijcleaow", "(ZZZZZLjava/util/List;ZLoz0/iobyxmoadg;Z)Lru/myspar/proloyalty/options/impl/options/domain/store/OptionsStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "dxjokdxxww", "()Z", "yggfygwlhe", "oxmwwwfdhm", "jyumaefscl", "gtknphoqwx", "iwizpuwonk", "lqeggnwhkg", "cqumvgiudr", "wflxmlrfwp", "esjtqupxsv", "Ljava/util/List;", "gxszxtbevo", "()Ljava/util/List;", "lereixgezr", "nufgyqmvbu", "pmvmpeiblj", "Loz0/iobyxmoadg;", "eablkybsjg", "()Loz0/iobyxmoadg;", "zynmafqrjb", "btonecajqb", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShowQrEnabled;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final List userSubscriptions;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAutoBrightnessEnabled;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPushNotificationEnabled;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDarkModeOptionVisible;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final oz0.iobyxmoadg darkModeState;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSmsNotificationEnabled;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEmailNotificationEnabled;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.options.impl.options.domain.store.OptionsStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            return new State(z13, z14, z15, z16, z17, arrayList, parcel.readInt() != 0, oz0.iobyxmoadg.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, List userSubscriptions, boolean z18, oz0.iobyxmoadg darkModeState, boolean z19) {
        zdlpuopuiu.btonecajqb(userSubscriptions, "userSubscriptions");
        zdlpuopuiu.btonecajqb(darkModeState, "darkModeState");
        this.isEmailNotificationEnabled = z13;
        this.isSmsNotificationEnabled = z14;
        this.isPushNotificationEnabled = z15;
        this.isAutoBrightnessEnabled = z16;
        this.isShowQrEnabled = z17;
        this.userSubscriptions = userSubscriptions;
        this.isDarkModeOptionVisible = z18;
        this.darkModeState = darkModeState;
        this.isLoading = z19;
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
    public final boolean getIsEmailNotificationEnabled() {
        return this.isEmailNotificationEnabled;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final oz0.iobyxmoadg getDarkModeState() {
        return this.darkModeState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isEmailNotificationEnabled == state.isEmailNotificationEnabled && this.isSmsNotificationEnabled == state.isSmsNotificationEnabled && this.isPushNotificationEnabled == state.isPushNotificationEnabled && this.isAutoBrightnessEnabled == state.isAutoBrightnessEnabled && this.isShowQrEnabled == state.isShowQrEnabled && zdlpuopuiu.eablkybsjg(this.userSubscriptions, state.userSubscriptions) && this.isDarkModeOptionVisible == state.isDarkModeOptionVisible && this.darkModeState == state.darkModeState && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final boolean getIsPushNotificationEnabled() {
        return this.isPushNotificationEnabled;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final List getUserSubscriptions() {
        return this.userSubscriptions;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isEmailNotificationEnabled) * 31) + Boolean.hashCode(this.isSmsNotificationEnabled)) * 31) + Boolean.hashCode(this.isPushNotificationEnabled)) * 31) + Boolean.hashCode(this.isAutoBrightnessEnabled)) * 31) + Boolean.hashCode(this.isShowQrEnabled)) * 31) + this.userSubscriptions.hashCode()) * 31) + Boolean.hashCode(this.isDarkModeOptionVisible)) * 31) + this.darkModeState.hashCode()) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getIsAutoBrightnessEnabled() {
        return this.isAutoBrightnessEnabled;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getIsDarkModeOptionVisible() {
        return this.isDarkModeOptionVisible;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final boolean getIsSmsNotificationEnabled() {
        return this.isSmsNotificationEnabled;
    }

    public String toString() {
        return "State(isEmailNotificationEnabled=" + this.isEmailNotificationEnabled + ", isSmsNotificationEnabled=" + this.isSmsNotificationEnabled + ", isPushNotificationEnabled=" + this.isPushNotificationEnabled + ", isAutoBrightnessEnabled=" + this.isAutoBrightnessEnabled + ", isShowQrEnabled=" + this.isShowQrEnabled + ", userSubscriptions=" + this.userSubscriptions + ", isDarkModeOptionVisible=" + this.isDarkModeOptionVisible + ", darkModeState=" + this.darkModeState + ", isLoading=" + this.isLoading + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getIsShowQrEnabled() {
        return this.isShowQrEnabled;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isEmailNotificationEnabled ? 1 : 0);
        dest.writeInt(this.isSmsNotificationEnabled ? 1 : 0);
        dest.writeInt(this.isPushNotificationEnabled ? 1 : 0);
        dest.writeInt(this.isAutoBrightnessEnabled ? 1 : 0);
        dest.writeInt(this.isShowQrEnabled ? 1 : 0);
        List list = this.userSubscriptions;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeInt(this.isDarkModeOptionVisible ? 1 : 0);
        dest.writeString(this.darkModeState.name());
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public final State zoijcleaow(boolean isEmailNotificationEnabled, boolean isSmsNotificationEnabled, boolean isPushNotificationEnabled, boolean isAutoBrightnessEnabled, boolean isShowQrEnabled, List userSubscriptions, boolean isDarkModeOptionVisible, oz0.iobyxmoadg darkModeState, boolean isLoading) {
        zdlpuopuiu.btonecajqb(userSubscriptions, "userSubscriptions");
        zdlpuopuiu.btonecajqb(darkModeState, "darkModeState");
        return new State(isEmailNotificationEnabled, isSmsNotificationEnabled, isPushNotificationEnabled, isAutoBrightnessEnabled, isShowQrEnabled, userSubscriptions, isDarkModeOptionVisible, darkModeState, isLoading);
    }

    public /* synthetic */ State(boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, List list, boolean z18, oz0.iobyxmoadg iobyxmoadgVar, boolean z19, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? false : z14, (i13 & 4) != 0 ? false : z15, (i13 & 8) != 0 ? false : z16, (i13 & 16) != 0 ? false : z17, (i13 & 32) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 64) == 0 ? z18 : false, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oz0.iobyxmoadg.DARK_MODE_SYSTEM : iobyxmoadgVar, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? true : z19);
    }
}
