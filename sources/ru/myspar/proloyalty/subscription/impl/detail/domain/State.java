package ru.myspar.proloyalty.subscription.impl.detail.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.tzroggbefp;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import q11.dxjokdxxww;
import ru.myspar.proloyalty.common.view.promo_code.PromoCodeEditorState;
import ru.myspar.proloyalty.subscription.api.model.detail.SubscriptionDetailInfo;

/* JADX INFO: renamed from: ru.myspar.proloyalty.subscription.impl.detail.domain.SubscriptionDetailStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJx\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0014H×\u0001¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!H×\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010&\u001a\u0004\b=\u0010\u001fR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b>\u0010)\u001a\u0004\b?\u0010+¨\u0006@"}, d2 = {"ru/myspar/proloyalty/subscription/impl/detail/domain/SubscriptionDetailStore$State", "Landroid/os/Parcelable;", "", "subscriptionId", "", "isNeededShowSkeleton", "isLoading", "isAutoRenewalLoading", "Lru/myspar/proloyalty/subscription/api/model/detail/SubscriptionDetailInfo;", "detailInfo", "Lru/myspar/proloyalty/common/view/promo_code/PromoCodeEditorState;", "promoCodeEditorState", "", "changedParamsBuffer", "additionalInfoSettingId", "openSettingsBottomSheet", "<init>", "(Ljava/lang/String;ZZZLru/myspar/proloyalty/subscription/api/model/detail/SubscriptionDetailInfo;Lru/myspar/proloyalty/common/view/promo_code/PromoCodeEditorState;Ljava/util/Map;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/subscription/impl/detail/domain/SubscriptionDetailStore$State;", "zoijcleaow", "(Ljava/lang/String;ZZZLru/myspar/proloyalty/subscription/api/model/detail/SubscriptionDetailInfo;Lru/myspar/proloyalty/common/view/promo_code/PromoCodeEditorState;Ljava/util/Map;Ljava/lang/String;Z)Lru/myspar/proloyalty/subscription/impl/detail/domain/SubscriptionDetailStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "btonecajqb", "yggfygwlhe", "Z", "oxmwwwfdhm", "()Z", "jyumaefscl", "wflxmlrfwp", "iwizpuwonk", "gtknphoqwx", "cqumvgiudr", "Lru/myspar/proloyalty/subscription/api/model/detail/SubscriptionDetailInfo;", "lqeggnwhkg", "()Lru/myspar/proloyalty/subscription/api/model/detail/SubscriptionDetailInfo;", "esjtqupxsv", "Lru/myspar/proloyalty/common/view/promo_code/PromoCodeEditorState;", "dxjokdxxww", "()Lru/myspar/proloyalty/common/view/promo_code/PromoCodeEditorState;", "lereixgezr", "Ljava/util/Map;", "gxszxtbevo", "()Ljava/util/Map;", "pmvmpeiblj", "eablkybsjg", "zynmafqrjb", "nufgyqmvbu", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubscriptionDetailInfo detailInfo;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final PromoCodeEditorState promoCodeEditorState;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAutoRenewalLoading;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map changedParamsBuffer;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String additionalInfoSettingId;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNeededShowSkeleton;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subscriptionId;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean openSettingsBottomSheet;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.subscription.impl.detail.domain.SubscriptionDetailStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            SubscriptionDetailInfo subscriptionDetailInfo = (SubscriptionDetailInfo) parcel.readParcelable(State.class.getClassLoader());
            PromoCodeEditorState promoCodeEditorState = (PromoCodeEditorState) parcel.readParcelable(State.class.getClassLoader());
            int i13 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new State(string, z13, z14, z15, subscriptionDetailInfo, promoCodeEditorState, linkedHashMap, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(String subscriptionId, boolean z13, boolean z14, boolean z15, SubscriptionDetailInfo subscriptionDetailInfo, PromoCodeEditorState promoCodeEditorState, Map changedParamsBuffer, String additionalInfoSettingId, boolean z16) {
        zdlpuopuiu.btonecajqb(subscriptionId, "subscriptionId");
        zdlpuopuiu.btonecajqb(promoCodeEditorState, "promoCodeEditorState");
        zdlpuopuiu.btonecajqb(changedParamsBuffer, "changedParamsBuffer");
        zdlpuopuiu.btonecajqb(additionalInfoSettingId, "additionalInfoSettingId");
        this.subscriptionId = subscriptionId;
        this.isNeededShowSkeleton = z13;
        this.isLoading = z14;
        this.isAutoRenewalLoading = z15;
        this.detailInfo = subscriptionDetailInfo;
        this.promoCodeEditorState = promoCodeEditorState;
        this.changedParamsBuffer = changedParamsBuffer;
        this.additionalInfoSettingId = additionalInfoSettingId;
        this.openSettingsBottomSheet = z16;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final PromoCodeEditorState getPromoCodeEditorState() {
        return this.promoCodeEditorState;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getAdditionalInfoSettingId() {
        return this.additionalInfoSettingId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.subscriptionId, state.subscriptionId) && this.isNeededShowSkeleton == state.isNeededShowSkeleton && this.isLoading == state.isLoading && this.isAutoRenewalLoading == state.isAutoRenewalLoading && zdlpuopuiu.eablkybsjg(this.detailInfo, state.detailInfo) && zdlpuopuiu.eablkybsjg(this.promoCodeEditorState, state.promoCodeEditorState) && zdlpuopuiu.eablkybsjg(this.changedParamsBuffer, state.changedParamsBuffer) && zdlpuopuiu.eablkybsjg(this.additionalInfoSettingId, state.additionalInfoSettingId) && this.openSettingsBottomSheet == state.openSettingsBottomSheet;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final boolean getIsAutoRenewalLoading() {
        return this.isAutoRenewalLoading;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Map getChangedParamsBuffer() {
        return this.changedParamsBuffer;
    }

    public int hashCode() {
        int iHashCode = ((((((this.subscriptionId.hashCode() * 31) + Boolean.hashCode(this.isNeededShowSkeleton)) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isAutoRenewalLoading)) * 31;
        SubscriptionDetailInfo subscriptionDetailInfo = this.detailInfo;
        return ((((((((iHashCode + (subscriptionDetailInfo == null ? 0 : subscriptionDetailInfo.hashCode())) * 31) + this.promoCodeEditorState.hashCode()) * 31) + this.changedParamsBuffer.hashCode()) * 31) + this.additionalInfoSettingId.hashCode()) * 31) + Boolean.hashCode(this.openSettingsBottomSheet);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final SubscriptionDetailInfo getDetailInfo() {
        return this.detailInfo;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getOpenSettingsBottomSheet() {
        return this.openSettingsBottomSheet;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final boolean getIsNeededShowSkeleton() {
        return this.isNeededShowSkeleton;
    }

    public String toString() {
        return "State(subscriptionId=" + this.subscriptionId + ", isNeededShowSkeleton=" + this.isNeededShowSkeleton + ", isLoading=" + this.isLoading + ", isAutoRenewalLoading=" + this.isAutoRenewalLoading + ", detailInfo=" + this.detailInfo + ", promoCodeEditorState=" + this.promoCodeEditorState + ", changedParamsBuffer=" + this.changedParamsBuffer + ", additionalInfoSettingId=" + this.additionalInfoSettingId + ", openSettingsBottomSheet=" + this.openSettingsBottomSheet + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.subscriptionId);
        dest.writeInt(this.isNeededShowSkeleton ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeInt(this.isAutoRenewalLoading ? 1 : 0);
        dest.writeParcelable(this.detailInfo, flags);
        dest.writeParcelable(this.promoCodeEditorState, flags);
        Map map = this.changedParamsBuffer;
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
        dest.writeString(this.additionalInfoSettingId);
        dest.writeInt(this.openSettingsBottomSheet ? 1 : 0);
    }

    public final State zoijcleaow(String subscriptionId, boolean isNeededShowSkeleton, boolean isLoading, boolean isAutoRenewalLoading, SubscriptionDetailInfo detailInfo, PromoCodeEditorState promoCodeEditorState, Map changedParamsBuffer, String additionalInfoSettingId, boolean openSettingsBottomSheet) {
        zdlpuopuiu.btonecajqb(subscriptionId, "subscriptionId");
        zdlpuopuiu.btonecajqb(promoCodeEditorState, "promoCodeEditorState");
        zdlpuopuiu.btonecajqb(changedParamsBuffer, "changedParamsBuffer");
        zdlpuopuiu.btonecajqb(additionalInfoSettingId, "additionalInfoSettingId");
        return new State(subscriptionId, isNeededShowSkeleton, isLoading, isAutoRenewalLoading, detailInfo, promoCodeEditorState, changedParamsBuffer, additionalInfoSettingId, openSettingsBottomSheet);
    }

    public /* synthetic */ State(String str, boolean z13, boolean z14, boolean z15, SubscriptionDetailInfo subscriptionDetailInfo, PromoCodeEditorState promoCodeEditorState, Map map, String str2, boolean z16, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? true : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? false : z15, (i13 & 16) != 0 ? null : subscriptionDetailInfo, (i13 & 32) != 0 ? PromoCodeEditorState.INSTANCE.iobyxmoadg() : promoCodeEditorState, (i13 & 64) != 0 ? tzroggbefp.dxjokdxxww() : map, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? dxjokdxxww.ppxfxbqfkf() : str2, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? z16 : false);
    }
}
