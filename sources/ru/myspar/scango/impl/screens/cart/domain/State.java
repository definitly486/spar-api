package ru.myspar.scango.impl.screens.cart.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.screens.cart.domain.model.ScanGoCartDeletedProduct;

/* JADX INFO: renamed from: ru.myspar.scango.impl.screens.cart.domain.ScanGoCartStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001:\u0001LB\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0092\u0001\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÇ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001aH×\u0001¢\u0006\u0004\b&\u0010 J\u001a\u0010(\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\tH×\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b/\u0010%R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010%R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\b8\u0010-R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010+\u001a\u0004\b2\u0010-R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010.\u001a\u0004\bC\u0010%R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"ru/myspar/scango/impl/screens/cart/domain/ScanGoCartStore$State", "Landroid/os/Parcelable;", "", "isLoadingVisible", "", "totalPriceInt", "totalPriceFractional", "isCheckoutBtnEnabled", "", "", "content", "Lru/myspar/scango/impl/screens/cart/domain/ScanGoCartStore$State$iobyxmoadg;", "cartState", "isTutorialCart", "isReturnProductFlatEnabled", "", "timerValue", "startText", "Lru/myspar/scango/impl/screens/cart/domain/model/ScanGoCartDeletedProduct;", "deletedProduct", "Lo22/iobyxmoadg;", "currentTutorialOption", "<init>", "(ZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Lru/myspar/scango/impl/screens/cart/domain/ScanGoCartStore$State$iobyxmoadg;ZZJLjava/lang/String;Lru/myspar/scango/impl/screens/cart/domain/model/ScanGoCartDeletedProduct;Lo22/iobyxmoadg;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/scango/impl/screens/cart/domain/ScanGoCartStore$State;", "zoijcleaow", "(ZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Lru/myspar/scango/impl/screens/cart/domain/ScanGoCartStore$State$iobyxmoadg;ZZJLjava/lang/String;Lru/myspar/scango/impl/screens/cart/domain/model/ScanGoCartDeletedProduct;Lo22/iobyxmoadg;)Lru/myspar/scango/impl/screens/cart/domain/ScanGoCartStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "yggfygwlhe", "()Z", "Ljava/lang/String;", "wflxmlrfwp", "jyumaefscl", "gtknphoqwx", "iwizpuwonk", "oxmwwwfdhm", "cqumvgiudr", "Ljava/util/List;", "gxszxtbevo", "()Ljava/util/List;", "esjtqupxsv", "Lru/myspar/scango/impl/screens/cart/domain/ScanGoCartStore$State$iobyxmoadg;", "eablkybsjg", "()Lru/myspar/scango/impl/screens/cart/domain/ScanGoCartStore$State$iobyxmoadg;", "lereixgezr", "pmvmpeiblj", "zynmafqrjb", "J", "btonecajqb", "()J", "istkbnxepw", "dxjokdxxww", "cdpycssgdh", "Lru/myspar/scango/impl/screens/cart/domain/model/ScanGoCartDeletedProduct;", "nufgyqmvbu", "()Lru/myspar/scango/impl/screens/cart/domain/model/ScanGoCartDeletedProduct;", "yadqdtsiqt", "Lo22/iobyxmoadg;", "lqeggnwhkg", "()Lo22/iobyxmoadg;", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new zoijcleaow();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final ScanGoCartDeletedProduct deletedProduct;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final List content;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final iobyxmoadg cartState;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final String startText;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCheckoutBtnEnabled;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String totalPriceFractional;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isTutorialCart;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isReturnProductFlatEnabled;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final o22.iobyxmoadg currentTutorialOption;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String totalPriceInt;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoadingVisible;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timerValue;

    /* JADX INFO: renamed from: ru.myspar.scango.impl.screens.cart.domain.ScanGoCartStore$State$iobyxmoadg */
    public enum iobyxmoadg {
        FILL,
        EMPTY;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f103254iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    /* JADX INFO: renamed from: ru.myspar.scango.impl.screens.cart.domain.ScanGoCartStore$State$zoijcleaow */
    public static final class zoijcleaow implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            boolean z13 = parcel.readInt() != 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z14 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readValue(State.class.getClassLoader()));
            }
            return new State(z13, string, string2, z14, arrayList, iobyxmoadg.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : ScanGoCartDeletedProduct.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : o22.iobyxmoadg.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, String totalPriceInt, String totalPriceFractional, boolean z14, List content, iobyxmoadg cartState, boolean z15, boolean z16, long j13, String startText, ScanGoCartDeletedProduct scanGoCartDeletedProduct, o22.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(totalPriceInt, "totalPriceInt");
        zdlpuopuiu.btonecajqb(totalPriceFractional, "totalPriceFractional");
        zdlpuopuiu.btonecajqb(content, "content");
        zdlpuopuiu.btonecajqb(cartState, "cartState");
        zdlpuopuiu.btonecajqb(startText, "startText");
        this.isLoadingVisible = z13;
        this.totalPriceInt = totalPriceInt;
        this.totalPriceFractional = totalPriceFractional;
        this.isCheckoutBtnEnabled = z14;
        this.content = content;
        this.cartState = cartState;
        this.isTutorialCart = z15;
        this.isReturnProductFlatEnabled = z16;
        this.timerValue = j13;
        this.startText = startText;
        this.deletedProduct = scanGoCartDeletedProduct;
        this.currentTutorialOption = iobyxmoadgVar;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final long getTimerValue() {
        return this.timerValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getStartText() {
        return this.startText;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final iobyxmoadg getCartState() {
        return this.cartState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isLoadingVisible == state.isLoadingVisible && zdlpuopuiu.eablkybsjg(this.totalPriceInt, state.totalPriceInt) && zdlpuopuiu.eablkybsjg(this.totalPriceFractional, state.totalPriceFractional) && this.isCheckoutBtnEnabled == state.isCheckoutBtnEnabled && zdlpuopuiu.eablkybsjg(this.content, state.content) && this.cartState == state.cartState && this.isTutorialCart == state.isTutorialCart && this.isReturnProductFlatEnabled == state.isReturnProductFlatEnabled && this.timerValue == state.timerValue && zdlpuopuiu.eablkybsjg(this.startText, state.startText) && zdlpuopuiu.eablkybsjg(this.deletedProduct, state.deletedProduct) && this.currentTutorialOption == state.currentTutorialOption;
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final boolean getIsTutorialCart() {
        return this.isTutorialCart;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final String getTotalPriceFractional() {
        return this.totalPriceFractional;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final List getContent() {
        return this.content;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((Boolean.hashCode(this.isLoadingVisible) * 31) + this.totalPriceInt.hashCode()) * 31) + this.totalPriceFractional.hashCode()) * 31) + Boolean.hashCode(this.isCheckoutBtnEnabled)) * 31) + this.content.hashCode()) * 31) + this.cartState.hashCode()) * 31) + Boolean.hashCode(this.isTutorialCart)) * 31) + Boolean.hashCode(this.isReturnProductFlatEnabled)) * 31) + Long.hashCode(this.timerValue)) * 31) + this.startText.hashCode()) * 31;
        ScanGoCartDeletedProduct scanGoCartDeletedProduct = this.deletedProduct;
        int iHashCode2 = (iHashCode + (scanGoCartDeletedProduct == null ? 0 : scanGoCartDeletedProduct.hashCode())) * 31;
        o22.iobyxmoadg iobyxmoadgVar = this.currentTutorialOption;
        return iHashCode2 + (iobyxmoadgVar != null ? iobyxmoadgVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final boolean getIsReturnProductFlatEnabled() {
        return this.isReturnProductFlatEnabled;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final o22.iobyxmoadg getCurrentTutorialOption() {
        return this.currentTutorialOption;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final ScanGoCartDeletedProduct getDeletedProduct() {
        return this.deletedProduct;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final boolean getIsCheckoutBtnEnabled() {
        return this.isCheckoutBtnEnabled;
    }

    public String toString() {
        return "State(isLoadingVisible=" + this.isLoadingVisible + ", totalPriceInt=" + this.totalPriceInt + ", totalPriceFractional=" + this.totalPriceFractional + ", isCheckoutBtnEnabled=" + this.isCheckoutBtnEnabled + ", content=" + this.content + ", cartState=" + this.cartState + ", isTutorialCart=" + this.isTutorialCart + ", isReturnProductFlatEnabled=" + this.isReturnProductFlatEnabled + ", timerValue=" + this.timerValue + ", startText=" + this.startText + ", deletedProduct=" + this.deletedProduct + ", currentTutorialOption=" + this.currentTutorialOption + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final String getTotalPriceInt() {
        return this.totalPriceInt;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isLoadingVisible ? 1 : 0);
        dest.writeString(this.totalPriceInt);
        dest.writeString(this.totalPriceFractional);
        dest.writeInt(this.isCheckoutBtnEnabled ? 1 : 0);
        List list = this.content;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeValue(it.next());
        }
        dest.writeString(this.cartState.name());
        dest.writeInt(this.isTutorialCart ? 1 : 0);
        dest.writeInt(this.isReturnProductFlatEnabled ? 1 : 0);
        dest.writeLong(this.timerValue);
        dest.writeString(this.startText);
        ScanGoCartDeletedProduct scanGoCartDeletedProduct = this.deletedProduct;
        if (scanGoCartDeletedProduct == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            scanGoCartDeletedProduct.writeToParcel(dest, flags);
        }
        o22.iobyxmoadg iobyxmoadgVar = this.currentTutorialOption;
        if (iobyxmoadgVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iobyxmoadgVar.name());
        }
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final boolean getIsLoadingVisible() {
        return this.isLoadingVisible;
    }

    public final State zoijcleaow(boolean isLoadingVisible, String totalPriceInt, String totalPriceFractional, boolean isCheckoutBtnEnabled, List content, iobyxmoadg cartState, boolean isTutorialCart, boolean isReturnProductFlatEnabled, long timerValue, String startText, ScanGoCartDeletedProduct deletedProduct, o22.iobyxmoadg currentTutorialOption) {
        zdlpuopuiu.btonecajqb(totalPriceInt, "totalPriceInt");
        zdlpuopuiu.btonecajqb(totalPriceFractional, "totalPriceFractional");
        zdlpuopuiu.btonecajqb(content, "content");
        zdlpuopuiu.btonecajqb(cartState, "cartState");
        zdlpuopuiu.btonecajqb(startText, "startText");
        return new State(isLoadingVisible, totalPriceInt, totalPriceFractional, isCheckoutBtnEnabled, content, cartState, isTutorialCart, isReturnProductFlatEnabled, timerValue, startText, deletedProduct, currentTutorialOption);
    }

    public /* synthetic */ State(boolean z13, String str, String str2, boolean z14, List list, iobyxmoadg iobyxmoadgVar, boolean z15, boolean z16, long j13, String str3, ScanGoCartDeletedProduct scanGoCartDeletedProduct, o22.iobyxmoadg iobyxmoadgVar2, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? CommonUrlParts.Values.FALSE_INTEGER : str, (i13 & 4) != 0 ? "00" : str2, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 32) != 0 ? iobyxmoadg.EMPTY : iobyxmoadgVar, (i13 & 64) != 0 ? false : z15, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? z16 : false, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 0L : j13, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? "" : str3, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : scanGoCartDeletedProduct, (i13 & 2048) == 0 ? iobyxmoadgVar2 : null);
    }
}
