package spay.sdk.domain.model.response.listOfCards;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kk.xg;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.domain.model.response.bnpl.ButtonBnpl;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001:\u0006BCDEFGBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ^\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020%HÖ\u0001¢\u0006\u0004\b-\u0010'J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020%HÖ\u0001¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bA\u0010\u001f¨\u0006H"}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody;", "Landroid/os/Parcelable;", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$UserInfo;", "userInfo", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo;", "orderInfo", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo;", "paymentToolInfo", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$MerchantInfo;", "merchantInfo", "Lspay/sdk/domain/model/response/bnpl/ButtonBnpl;", "buttonBnpl", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo;", "promoInfo", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$FormInfo;", "formInfo", "<init>", "(Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$UserInfo;Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo;Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo;Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$MerchantInfo;Lspay/sdk/domain/model/response/bnpl/ButtonBnpl;Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo;Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$FormInfo;)V", "component1", "()Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$UserInfo;", "component2", "()Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo;", "component3", "()Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo;", "component4", "()Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$MerchantInfo;", "component5", "()Lspay/sdk/domain/model/response/bnpl/ButtonBnpl;", "component6", "()Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo;", "component7", "()Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$FormInfo;", "copy", "(Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$UserInfo;Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo;Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo;Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$MerchantInfo;Lspay/sdk/domain/model/response/bnpl/ButtonBnpl;Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo;Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$FormInfo;)Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$UserInfo;", "getUserInfo", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo;", "getOrderInfo", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo;", "getPaymentToolInfo", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$MerchantInfo;", "getMerchantInfo", "Lspay/sdk/domain/model/response/bnpl/ButtonBnpl;", "getButtonBnpl", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo;", "getPromoInfo", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$FormInfo;", "getFormInfo", "FormInfo", "MerchantInfo", "OrderInfo", "PaymentToolInfo", "PromoInfo", "UserInfo", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ListOfCardsResponseBody implements Parcelable {
    public static final Parcelable.Creator<ListOfCardsResponseBody> CREATOR = new Creator();
    private final ButtonBnpl buttonBnpl;
    private final FormInfo formInfo;
    private final MerchantInfo merchantInfo;
    private final OrderInfo orderInfo;
    private final PaymentToolInfo paymentToolInfo;
    private final PromoInfo promoInfo;
    private final UserInfo userInfo;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ListOfCardsResponseBody> {
        @Override // android.os.Parcelable.Creator
        public final ListOfCardsResponseBody createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ListOfCardsResponseBody(UserInfo.CREATOR.createFromParcel(parcel), OrderInfo.CREATOR.createFromParcel(parcel), PaymentToolInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MerchantInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ButtonBnpl.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PromoInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FormInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ListOfCardsResponseBody[] newArray(int i13) {
            return new ListOfCardsResponseBody[i13];
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$FormInfo;", "Landroid/os/Parcelable;", "", "notEnoughBalanceText", "onlyPartPayText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$FormInfo;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getNotEnoughBalanceText", "getOnlyPartPayText", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FormInfo implements Parcelable {
        public static final Parcelable.Creator<FormInfo> CREATOR = new Creator();
        private final String notEnoughBalanceText;
        private final String onlyPartPayText;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FormInfo> {
            @Override // android.os.Parcelable.Creator
            public final FormInfo createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new FormInfo(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FormInfo[] newArray(int i13) {
                return new FormInfo[i13];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FormInfo() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ FormInfo copy$default(FormInfo formInfo, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = formInfo.notEnoughBalanceText;
            }
            if ((i13 & 2) != 0) {
                str2 = formInfo.onlyPartPayText;
            }
            return formInfo.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getNotEnoughBalanceText() {
            return this.notEnoughBalanceText;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getOnlyPartPayText() {
            return this.onlyPartPayText;
        }

        public final FormInfo copy(String notEnoughBalanceText, String onlyPartPayText) {
            return new FormInfo(notEnoughBalanceText, onlyPartPayText);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormInfo)) {
                return false;
            }
            FormInfo formInfo = (FormInfo) other;
            return zdlpuopuiu.eablkybsjg(this.notEnoughBalanceText, formInfo.notEnoughBalanceText) && zdlpuopuiu.eablkybsjg(this.onlyPartPayText, formInfo.onlyPartPayText);
        }

        public final String getNotEnoughBalanceText() {
            return this.notEnoughBalanceText;
        }

        public final String getOnlyPartPayText() {
            return this.onlyPartPayText;
        }

        public int hashCode() {
            String str = this.notEnoughBalanceText;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.onlyPartPayText;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "FormInfo(notEnoughBalanceText=" + this.notEnoughBalanceText + ", onlyPartPayText=" + this.onlyPartPayText + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.notEnoughBalanceText);
            parcel.writeString(this.onlyPartPayText);
        }

        public FormInfo(String str, String str2) {
            this.notEnoughBalanceText = str;
            this.onlyPartPayText = str2;
        }

        public /* synthetic */ FormInfo(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b&\u0010\u000b¨\u0006'"}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$MerchantInfo;", "Landroid/os/Parcelable;", "", "merchantName", "merchantLogoUrl", "", "bindingIsNeeded", "bindingSafeText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$MerchantInfo;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMerchantName", "getMerchantLogoUrl", "Ljava/lang/Boolean;", "getBindingIsNeeded", "getBindingSafeText", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class MerchantInfo implements Parcelable {
        public static final Parcelable.Creator<MerchantInfo> CREATOR = new Creator();
        private final Boolean bindingIsNeeded;
        private final String bindingSafeText;
        private final String merchantLogoUrl;
        private final String merchantName;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MerchantInfo> {
            @Override // android.os.Parcelable.Creator
            public final MerchantInfo createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new MerchantInfo(string, string2, boolValueOf, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MerchantInfo[] newArray(int i13) {
                return new MerchantInfo[i13];
            }
        }

        public MerchantInfo() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ MerchantInfo copy$default(MerchantInfo merchantInfo, String str, String str2, Boolean bool, String str3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = merchantInfo.merchantName;
            }
            if ((i13 & 2) != 0) {
                str2 = merchantInfo.merchantLogoUrl;
            }
            if ((i13 & 4) != 0) {
                bool = merchantInfo.bindingIsNeeded;
            }
            if ((i13 & 8) != 0) {
                str3 = merchantInfo.bindingSafeText;
            }
            return merchantInfo.copy(str, str2, bool, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMerchantName() {
            return this.merchantName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getBindingIsNeeded() {
            return this.bindingIsNeeded;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getBindingSafeText() {
            return this.bindingSafeText;
        }

        public final MerchantInfo copy(String merchantName, String merchantLogoUrl, Boolean bindingIsNeeded, String bindingSafeText) {
            return new MerchantInfo(merchantName, merchantLogoUrl, bindingIsNeeded, bindingSafeText);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MerchantInfo)) {
                return false;
            }
            MerchantInfo merchantInfo = (MerchantInfo) other;
            return zdlpuopuiu.eablkybsjg(this.merchantName, merchantInfo.merchantName) && zdlpuopuiu.eablkybsjg(this.merchantLogoUrl, merchantInfo.merchantLogoUrl) && zdlpuopuiu.eablkybsjg(this.bindingIsNeeded, merchantInfo.bindingIsNeeded) && zdlpuopuiu.eablkybsjg(this.bindingSafeText, merchantInfo.bindingSafeText);
        }

        public final Boolean getBindingIsNeeded() {
            return this.bindingIsNeeded;
        }

        public final String getBindingSafeText() {
            return this.bindingSafeText;
        }

        public final String getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        public final String getMerchantName() {
            return this.merchantName;
        }

        public int hashCode() {
            String str = this.merchantName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.merchantLogoUrl;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.bindingIsNeeded;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.bindingSafeText;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "MerchantInfo(merchantName=" + this.merchantName + ", merchantLogoUrl=" + this.merchantLogoUrl + ", bindingIsNeeded=" + this.bindingIsNeeded + ", bindingSafeText=" + this.bindingSafeText + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v6, types: [int] */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            ?? BooleanValue;
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.merchantName);
            parcel.writeString(this.merchantLogoUrl);
            Boolean bool = this.bindingIsNeeded;
            if (bool == null) {
                BooleanValue = 0;
            } else {
                parcel.writeInt(1);
                BooleanValue = bool.booleanValue();
            }
            parcel.writeInt(BooleanValue);
            parcel.writeString(this.bindingSafeText);
        }

        public MerchantInfo(String str, String str2, Boolean bool, String str3) {
            this.merchantName = str;
            this.merchantLogoUrl = str2;
            this.bindingIsNeeded = bool;
            this.bindingSafeText = str3;
        }

        public /* synthetic */ MerchantInfo(String str, String str2, Boolean bool, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : bool, (i13 & 8) != 0 ? null : str3);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001f"}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo;", "Landroid/os/Parcelable;", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo$OrderAmount;", "orderAmount", "<init>", "(Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo$OrderAmount;)V", "component1", "()Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo$OrderAmount;", "copy", "(Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo$OrderAmount;)Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo$OrderAmount;", "getOrderAmount", "OrderAmount", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class OrderInfo implements Parcelable {
        public static final Parcelable.Creator<OrderInfo> CREATOR = new Creator();
        private final OrderAmount orderAmount;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OrderInfo> {
            @Override // android.os.Parcelable.Creator
            public final OrderInfo createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new OrderInfo(parcel.readInt() == 0 ? null : OrderAmount.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final OrderInfo[] newArray(int i13) {
                return new OrderInfo[i13];
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b¨\u0006 "}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo$OrderAmount;", "Landroid/os/Parcelable;", "", "amount", "", "currency", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$OrderInfo$OrderAmount;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getAmount", "Ljava/lang/String;", "getCurrency", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class OrderAmount implements Parcelable {
            public static final Parcelable.Creator<OrderAmount> CREATOR = new Creator();
            private final int amount;
            private final String currency;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OrderAmount> {
                @Override // android.os.Parcelable.Creator
                public final OrderAmount createFromParcel(Parcel parcel) {
                    zdlpuopuiu.btonecajqb(parcel, "parcel");
                    return new OrderAmount(parcel.readInt(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final OrderAmount[] newArray(int i13) {
                    return new OrderAmount[i13];
                }
            }

            public OrderAmount(int i13, String currency) {
                zdlpuopuiu.btonecajqb(currency, "currency");
                this.amount = i13;
                this.currency = currency;
            }

            public static /* synthetic */ OrderAmount copy$default(OrderAmount orderAmount, int i13, String str, int i14, Object obj) {
                if ((i14 & 1) != 0) {
                    i13 = orderAmount.amount;
                }
                if ((i14 & 2) != 0) {
                    str = orderAmount.currency;
                }
                return orderAmount.copy(i13, str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getAmount() {
                return this.amount;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getCurrency() {
                return this.currency;
            }

            public final OrderAmount copy(int amount, String currency) {
                zdlpuopuiu.btonecajqb(currency, "currency");
                return new OrderAmount(amount, currency);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OrderAmount)) {
                    return false;
                }
                OrderAmount orderAmount = (OrderAmount) other;
                return this.amount == orderAmount.amount && zdlpuopuiu.eablkybsjg(this.currency, orderAmount.currency);
            }

            public final int getAmount() {
                return this.amount;
            }

            public final String getCurrency() {
                return this.currency;
            }

            public int hashCode() {
                return this.currency.hashCode() + (Integer.hashCode(this.amount) * 31);
            }

            public String toString() {
                return "OrderAmount(amount=" + this.amount + ", currency=" + this.currency + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                zdlpuopuiu.btonecajqb(parcel, "out");
                parcel.writeInt(this.amount);
                parcel.writeString(this.currency);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OrderInfo() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ OrderInfo copy$default(OrderInfo orderInfo, OrderAmount orderAmount, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                orderAmount = orderInfo.orderAmount;
            }
            return orderInfo.copy(orderAmount);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final OrderAmount getOrderAmount() {
            return this.orderAmount;
        }

        public final OrderInfo copy(OrderAmount orderAmount) {
            return new OrderInfo(orderAmount);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OrderInfo) && zdlpuopuiu.eablkybsjg(this.orderAmount, ((OrderInfo) other).orderAmount);
        }

        public final OrderAmount getOrderAmount() {
            return this.orderAmount;
        }

        public int hashCode() {
            OrderAmount orderAmount = this.orderAmount;
            if (orderAmount == null) {
                return 0;
            }
            return orderAmount.hashCode();
        }

        public String toString() {
            return "OrderInfo(orderAmount=" + this.orderAmount + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            OrderAmount orderAmount = this.orderAmount;
            if (orderAmount == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                orderAmount.writeToParcel(parcel, flags);
            }
        }

        public OrderInfo(OrderAmount orderAmount) {
            this.orderAmount = orderAmount;
        }

        public /* synthetic */ OrderInfo(OrderAmount orderAmount, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : orderAmount);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001&B1\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ:\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010!R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b\u0007\u0010\r¨\u0006'"}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo;", "Landroid/os/Parcelable;", "", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo$Tool;", "toolList", "", "additionalCards", "isSpPaymentToolsNeedUpdate", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Boolean;", "component3", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getToolList", "Ljava/lang/Boolean;", "getAdditionalCards", "Tool", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PaymentToolInfo implements Parcelable {
        public static final Parcelable.Creator<PaymentToolInfo> CREATOR = new Creator();
        private final Boolean additionalCards;
        private final Boolean isSpPaymentToolsNeedUpdate;
        private final List<Tool> toolList;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PaymentToolInfo> {
            @Override // android.os.Parcelable.Creator
            public final PaymentToolInfo createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i13 = parcel.readInt();
                    arrayList = new ArrayList(i13);
                    for (int i14 = 0; i14 != i13; i14++) {
                        arrayList.add(Tool.CREATOR.createFromParcel(parcel));
                    }
                }
                return new PaymentToolInfo(arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final PaymentToolInfo[] newArray(int i13) {
                return new PaymentToolInfo[i13];
            }
        }

        public PaymentToolInfo() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentToolInfo copy$default(PaymentToolInfo paymentToolInfo, List list, Boolean bool, Boolean bool2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = paymentToolInfo.toolList;
            }
            if ((i13 & 2) != 0) {
                bool = paymentToolInfo.additionalCards;
            }
            if ((i13 & 4) != 0) {
                bool2 = paymentToolInfo.isSpPaymentToolsNeedUpdate;
            }
            return paymentToolInfo.copy(list, bool, bool2);
        }

        public final List<Tool> component1() {
            return this.toolList;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getAdditionalCards() {
            return this.additionalCards;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getIsSpPaymentToolsNeedUpdate() {
            return this.isSpPaymentToolsNeedUpdate;
        }

        public final PaymentToolInfo copy(List<Tool> toolList, Boolean additionalCards, Boolean isSpPaymentToolsNeedUpdate) {
            return new PaymentToolInfo(toolList, additionalCards, isSpPaymentToolsNeedUpdate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentToolInfo)) {
                return false;
            }
            PaymentToolInfo paymentToolInfo = (PaymentToolInfo) other;
            return zdlpuopuiu.eablkybsjg(this.toolList, paymentToolInfo.toolList) && zdlpuopuiu.eablkybsjg(this.additionalCards, paymentToolInfo.additionalCards) && zdlpuopuiu.eablkybsjg(this.isSpPaymentToolsNeedUpdate, paymentToolInfo.isSpPaymentToolsNeedUpdate);
        }

        public final Boolean getAdditionalCards() {
            return this.additionalCards;
        }

        public final List<Tool> getToolList() {
            return this.toolList;
        }

        public int hashCode() {
            List<Tool> list = this.toolList;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            Boolean bool = this.additionalCards;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isSpPaymentToolsNeedUpdate;
            return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final Boolean isSpPaymentToolsNeedUpdate() {
            return this.isSpPaymentToolsNeedUpdate;
        }

        public String toString() {
            return "PaymentToolInfo(toolList=" + this.toolList + ", additionalCards=" + this.additionalCards + ", isSpPaymentToolsNeedUpdate=" + this.isSpPaymentToolsNeedUpdate + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            List<Tool> list = this.toolList;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<Tool> it = list.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(parcel, flags);
                }
            }
            Boolean bool = this.additionalCards;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.isSpPaymentToolsNeedUpdate;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            }
        }

        public PaymentToolInfo(List<Tool> list, Boolean bool, Boolean bool2) {
            this.toolList = list;
            this.additionalCards = bool;
            this.isSpPaymentToolsNeedUpdate = bool2;
        }

        public /* synthetic */ PaymentToolInfo(List list, Boolean bool, Boolean bool2, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : list, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? null : bool2);
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00020\u0001:\u0001HB\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0016J\u0012\u0010&\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b&\u0010'J¤\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0016J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010\u0018J\u001a\u0010.\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b0\u0010\u0018J \u00105\u001a\u0002042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b=\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b>\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b?\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b@\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\bA\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\b\u000e\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\b\u000f\u0010#R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\bE\u0010\u0016R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010F\u001a\u0004\bG\u0010'¨\u0006I"}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo$Tool;", "Landroid/os/Parcelable;", "", "productName", "", "paymentId", "", "priorityCard", "paymentSourceType", "financialProductId", "cardNumber", "paymentSystemType", "cardLogoUrl", "countAdditionalCards", "isSpPaymentTools", "isSpPaymentToolsPriority", "precalculateBonuses", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo$Tool$AmountData;", "amountData", "<init>", "(Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo$Tool$AmountData;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Z", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Integer;", "component10", "()Ljava/lang/Boolean;", "component11", "component12", "component13", "()Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo$Tool$AmountData;", "copy", "(Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo$Tool$AmountData;)Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo$Tool;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getProductName", "I", "getPaymentId", "Z", "getPriorityCard", "getPaymentSourceType", "getFinancialProductId", "getCardNumber", "getPaymentSystemType", "getCardLogoUrl", "Ljava/lang/Integer;", "getCountAdditionalCards", "Ljava/lang/Boolean;", "getPrecalculateBonuses", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo$Tool$AmountData;", "getAmountData", "AmountData", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Tool implements Parcelable {
            public static final Parcelable.Creator<Tool> CREATOR = new Creator();
            private final AmountData amountData;
            private final String cardLogoUrl;
            private final String cardNumber;
            private final Integer countAdditionalCards;
            private final String financialProductId;
            private final Boolean isSpPaymentTools;
            private final Boolean isSpPaymentToolsPriority;
            private final int paymentId;
            private final String paymentSourceType;
            private final String paymentSystemType;
            private final String precalculateBonuses;
            private final boolean priorityCard;
            private final String productName;

            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo$Tool$AmountData;", "Landroid/os/Parcelable;", "", "amount", "", "currency", "<init>", "(JLjava/lang/String;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "copy", "(JLjava/lang/String;)Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PaymentToolInfo$Tool$AmountData;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getAmount", "Ljava/lang/String;", "getCurrency", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class AmountData implements Parcelable {
                public static final Parcelable.Creator<AmountData> CREATOR = new Creator();
                private final long amount;
                private final String currency;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<AmountData> {
                    @Override // android.os.Parcelable.Creator
                    public final AmountData createFromParcel(Parcel parcel) {
                        zdlpuopuiu.btonecajqb(parcel, "parcel");
                        return new AmountData(parcel.readLong(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final AmountData[] newArray(int i13) {
                        return new AmountData[i13];
                    }
                }

                public AmountData(long j13, String currency) {
                    zdlpuopuiu.btonecajqb(currency, "currency");
                    this.amount = j13;
                    this.currency = currency;
                }

                public static /* synthetic */ AmountData copy$default(AmountData amountData, long j13, String str, int i13, Object obj) {
                    if ((i13 & 1) != 0) {
                        j13 = amountData.amount;
                    }
                    if ((i13 & 2) != 0) {
                        str = amountData.currency;
                    }
                    return amountData.copy(j13, str);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final long getAmount() {
                    return this.amount;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getCurrency() {
                    return this.currency;
                }

                public final AmountData copy(long amount, String currency) {
                    zdlpuopuiu.btonecajqb(currency, "currency");
                    return new AmountData(amount, currency);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AmountData)) {
                        return false;
                    }
                    AmountData amountData = (AmountData) other;
                    return this.amount == amountData.amount && zdlpuopuiu.eablkybsjg(this.currency, amountData.currency);
                }

                public final long getAmount() {
                    return this.amount;
                }

                public final String getCurrency() {
                    return this.currency;
                }

                public int hashCode() {
                    return this.currency.hashCode() + (Long.hashCode(this.amount) * 31);
                }

                public String toString() {
                    return "AmountData(amount=" + this.amount + ", currency=" + this.currency + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    zdlpuopuiu.btonecajqb(parcel, "out");
                    parcel.writeLong(this.amount);
                    parcel.writeString(this.currency);
                }
            }

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Tool> {
                @Override // android.os.Parcelable.Creator
                public final Tool createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    zdlpuopuiu.btonecajqb(parcel, "parcel");
                    String string = parcel.readString();
                    int i13 = parcel.readInt();
                    boolean z13 = parcel.readInt() != 0;
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    String string6 = parcel.readString();
                    Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Tool(string, i13, z13, string2, string3, string4, string5, string6, numValueOf, boolValueOf, boolValueOf2, parcel.readString(), parcel.readInt() != 0 ? AmountData.CREATOR.createFromParcel(parcel) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final Tool[] newArray(int i13) {
                    return new Tool[i13];
                }
            }

            public Tool(String productName, int i13, boolean z13, String paymentSourceType, String str, String str2, String str3, String str4, Integer num, Boolean bool, Boolean bool2, String str5, AmountData amountData) {
                zdlpuopuiu.btonecajqb(productName, "productName");
                zdlpuopuiu.btonecajqb(paymentSourceType, "paymentSourceType");
                this.productName = productName;
                this.paymentId = i13;
                this.priorityCard = z13;
                this.paymentSourceType = paymentSourceType;
                this.financialProductId = str;
                this.cardNumber = str2;
                this.paymentSystemType = str3;
                this.cardLogoUrl = str4;
                this.countAdditionalCards = num;
                this.isSpPaymentTools = bool;
                this.isSpPaymentToolsPriority = bool2;
                this.precalculateBonuses = str5;
                this.amountData = amountData;
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getProductName() {
                return this.productName;
            }

            /* JADX INFO: renamed from: component10, reason: from getter */
            public final Boolean getIsSpPaymentTools() {
                return this.isSpPaymentTools;
            }

            /* JADX INFO: renamed from: component11, reason: from getter */
            public final Boolean getIsSpPaymentToolsPriority() {
                return this.isSpPaymentToolsPriority;
            }

            /* JADX INFO: renamed from: component12, reason: from getter */
            public final String getPrecalculateBonuses() {
                return this.precalculateBonuses;
            }

            /* JADX INFO: renamed from: component13, reason: from getter */
            public final AmountData getAmountData() {
                return this.amountData;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getPaymentId() {
                return this.paymentId;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final boolean getPriorityCard() {
                return this.priorityCard;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getPaymentSourceType() {
                return this.paymentSourceType;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getFinancialProductId() {
                return this.financialProductId;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final String getCardNumber() {
                return this.cardNumber;
            }

            /* JADX INFO: renamed from: component7, reason: from getter */
            public final String getPaymentSystemType() {
                return this.paymentSystemType;
            }

            /* JADX INFO: renamed from: component8, reason: from getter */
            public final String getCardLogoUrl() {
                return this.cardLogoUrl;
            }

            /* JADX INFO: renamed from: component9, reason: from getter */
            public final Integer getCountAdditionalCards() {
                return this.countAdditionalCards;
            }

            public final Tool copy(String productName, int paymentId, boolean priorityCard, String paymentSourceType, String financialProductId, String cardNumber, String paymentSystemType, String cardLogoUrl, Integer countAdditionalCards, Boolean isSpPaymentTools, Boolean isSpPaymentToolsPriority, String precalculateBonuses, AmountData amountData) {
                zdlpuopuiu.btonecajqb(productName, "productName");
                zdlpuopuiu.btonecajqb(paymentSourceType, "paymentSourceType");
                return new Tool(productName, paymentId, priorityCard, paymentSourceType, financialProductId, cardNumber, paymentSystemType, cardLogoUrl, countAdditionalCards, isSpPaymentTools, isSpPaymentToolsPriority, precalculateBonuses, amountData);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Tool)) {
                    return false;
                }
                Tool tool = (Tool) other;
                return zdlpuopuiu.eablkybsjg(this.productName, tool.productName) && this.paymentId == tool.paymentId && this.priorityCard == tool.priorityCard && zdlpuopuiu.eablkybsjg(this.paymentSourceType, tool.paymentSourceType) && zdlpuopuiu.eablkybsjg(this.financialProductId, tool.financialProductId) && zdlpuopuiu.eablkybsjg(this.cardNumber, tool.cardNumber) && zdlpuopuiu.eablkybsjg(this.paymentSystemType, tool.paymentSystemType) && zdlpuopuiu.eablkybsjg(this.cardLogoUrl, tool.cardLogoUrl) && zdlpuopuiu.eablkybsjg(this.countAdditionalCards, tool.countAdditionalCards) && zdlpuopuiu.eablkybsjg(this.isSpPaymentTools, tool.isSpPaymentTools) && zdlpuopuiu.eablkybsjg(this.isSpPaymentToolsPriority, tool.isSpPaymentToolsPriority) && zdlpuopuiu.eablkybsjg(this.precalculateBonuses, tool.precalculateBonuses) && zdlpuopuiu.eablkybsjg(this.amountData, tool.amountData);
            }

            public final AmountData getAmountData() {
                return this.amountData;
            }

            public final String getCardLogoUrl() {
                return this.cardLogoUrl;
            }

            public final String getCardNumber() {
                return this.cardNumber;
            }

            public final Integer getCountAdditionalCards() {
                return this.countAdditionalCards;
            }

            public final String getFinancialProductId() {
                return this.financialProductId;
            }

            public final int getPaymentId() {
                return this.paymentId;
            }

            public final String getPaymentSourceType() {
                return this.paymentSourceType;
            }

            public final String getPaymentSystemType() {
                return this.paymentSystemType;
            }

            public final String getPrecalculateBonuses() {
                return this.precalculateBonuses;
            }

            public final boolean getPriorityCard() {
                return this.priorityCard;
            }

            public final String getProductName() {
                return this.productName;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v24 */
            /* JADX WARN: Type inference failed for: r0v25 */
            /* JADX WARN: Type inference failed for: r0v4, types: [int] */
            /* JADX WARN: Type inference failed for: r2v4, types: [int] */
            public int hashCode() {
                int iHashCode = (Integer.hashCode(this.paymentId) + (this.productName.hashCode() * 31)) * 31;
                boolean z13 = this.priorityCard;
                ?? r13 = z13;
                if (z13) {
                    r13 = 1;
                }
                int iIobyxmoadg = xg.iobyxmoadg(this.paymentSourceType, (iHashCode + r13) * 31, 31);
                String str = this.financialProductId;
                int iHashCode2 = (iIobyxmoadg + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.cardNumber;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.paymentSystemType;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.cardLogoUrl;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Integer num = this.countAdditionalCards;
                int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                Boolean bool = this.isSpPaymentTools;
                int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.isSpPaymentToolsPriority;
                int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                String str5 = this.precalculateBonuses;
                int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
                AmountData amountData = this.amountData;
                return iHashCode9 + (amountData != null ? amountData.hashCode() : 0);
            }

            public final Boolean isSpPaymentTools() {
                return this.isSpPaymentTools;
            }

            public final Boolean isSpPaymentToolsPriority() {
                return this.isSpPaymentToolsPriority;
            }

            public String toString() {
                return "Tool(productName=" + this.productName + ", paymentId=" + this.paymentId + ", priorityCard=" + this.priorityCard + ", paymentSourceType=" + this.paymentSourceType + ", financialProductId=" + this.financialProductId + ", cardNumber=" + this.cardNumber + ", paymentSystemType=" + this.paymentSystemType + ", cardLogoUrl=" + this.cardLogoUrl + ", countAdditionalCards=" + this.countAdditionalCards + ", isSpPaymentTools=" + this.isSpPaymentTools + ", isSpPaymentToolsPriority=" + this.isSpPaymentToolsPriority + ", precalculateBonuses=" + this.precalculateBonuses + ", amountData=" + this.amountData + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                zdlpuopuiu.btonecajqb(parcel, "out");
                parcel.writeString(this.productName);
                parcel.writeInt(this.paymentId);
                parcel.writeInt(this.priorityCard ? 1 : 0);
                parcel.writeString(this.paymentSourceType);
                parcel.writeString(this.financialProductId);
                parcel.writeString(this.cardNumber);
                parcel.writeString(this.paymentSystemType);
                parcel.writeString(this.cardLogoUrl);
                Integer num = this.countAdditionalCards;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(num.intValue());
                }
                Boolean bool = this.isSpPaymentTools;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(bool.booleanValue() ? 1 : 0);
                }
                Boolean bool2 = this.isSpPaymentToolsPriority;
                if (bool2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(bool2.booleanValue() ? 1 : 0);
                }
                parcel.writeString(this.precalculateBonuses);
                AmountData amountData = this.amountData;
                if (amountData == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    amountData.writeToParcel(parcel, flags);
                }
            }

            public /* synthetic */ Tool(String str, int i13, boolean z13, String str2, String str3, String str4, String str5, String str6, Integer num, Boolean bool, Boolean bool2, String str7, AmountData amountData, int i14, gtknphoqwx gtknphoqwxVar) {
                this(str, i13, z13, str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : str5, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str6, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : num, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : bool, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : bool2, (i14 & 2048) != 0 ? null : str7, (i14 & 4096) != 0 ? null : amountData);
            }
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001#B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006$"}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo;", "Landroid/os/Parcelable;", "", "hint", "", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo$BannerData;", "bannerList", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getHint", "Ljava/util/List;", "getBannerList", "BannerData", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PromoInfo implements Parcelable {
        public static final Parcelable.Creator<PromoInfo> CREATOR = new Creator();
        private final List<BannerData> bannerList;
        private final String hint;

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001:\u0001/BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\\\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u000eR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0014¨\u00060"}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo$BannerData;", "Landroid/os/Parcelable;", "", "type", "hint", "header", "text", "iconUrl", "", "Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo$BannerData$Buttons;", "buttons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo$BannerData;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "getHint", "getHeader", "getText", "getIconUrl", "Ljava/util/List;", "getButtons", "Buttons", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class BannerData implements Parcelable {
            public static final Parcelable.Creator<BannerData> CREATOR = new Creator();
            private final List<Buttons> buttons;
            private final String header;
            private final String hint;
            private final String iconUrl;
            private final String text;
            private final String type;

            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo$BannerData$Buttons;", "Landroid/os/Parcelable;", "", "type", "title", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$PromoInfo$BannerData$Buttons;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "getTitle", "getDeeplink", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final /* data */ class Buttons implements Parcelable {
                public static final Parcelable.Creator<Buttons> CREATOR = new Creator();
                private final String deeplink;
                private final String title;
                private final String type;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Buttons> {
                    @Override // android.os.Parcelable.Creator
                    public final Buttons createFromParcel(Parcel parcel) {
                        zdlpuopuiu.btonecajqb(parcel, "parcel");
                        return new Buttons(parcel.readString(), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Buttons[] newArray(int i13) {
                        return new Buttons[i13];
                    }
                }

                public Buttons(String type, String str, String str2) {
                    zdlpuopuiu.btonecajqb(type, "type");
                    this.type = type;
                    this.title = str;
                    this.deeplink = str2;
                }

                public static /* synthetic */ Buttons copy$default(Buttons buttons, String str, String str2, String str3, int i13, Object obj) {
                    if ((i13 & 1) != 0) {
                        str = buttons.type;
                    }
                    if ((i13 & 2) != 0) {
                        str2 = buttons.title;
                    }
                    if ((i13 & 4) != 0) {
                        str3 = buttons.deeplink;
                    }
                    return buttons.copy(str, str2, str3);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getType() {
                    return this.type;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final String getDeeplink() {
                    return this.deeplink;
                }

                public final Buttons copy(String type, String title, String deeplink) {
                    zdlpuopuiu.btonecajqb(type, "type");
                    return new Buttons(type, title, deeplink);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Buttons)) {
                        return false;
                    }
                    Buttons buttons = (Buttons) other;
                    return zdlpuopuiu.eablkybsjg(this.type, buttons.type) && zdlpuopuiu.eablkybsjg(this.title, buttons.title) && zdlpuopuiu.eablkybsjg(this.deeplink, buttons.deeplink);
                }

                public final String getDeeplink() {
                    return this.deeplink;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getType() {
                    return this.type;
                }

                public int hashCode() {
                    int iHashCode = this.type.hashCode() * 31;
                    String str = this.title;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.deeplink;
                    return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    return "Buttons(type=" + this.type + ", title=" + this.title + ", deeplink=" + this.deeplink + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int flags) {
                    zdlpuopuiu.btonecajqb(parcel, "out");
                    parcel.writeString(this.type);
                    parcel.writeString(this.title);
                    parcel.writeString(this.deeplink);
                }
            }

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BannerData> {
                @Override // android.os.Parcelable.Creator
                public final BannerData createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    zdlpuopuiu.btonecajqb(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i13 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(i13);
                        for (int i14 = 0; i14 != i13; i14++) {
                            arrayList2.add(Buttons.CREATOR.createFromParcel(parcel));
                        }
                        arrayList = arrayList2;
                    }
                    return new BannerData(string, string2, string3, string4, string5, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final BannerData[] newArray(int i13) {
                    return new BannerData[i13];
                }
            }

            public BannerData(String type, String str, String str2, String str3, String str4, List<Buttons> list) {
                zdlpuopuiu.btonecajqb(type, "type");
                this.type = type;
                this.hint = str;
                this.header = str2;
                this.text = str3;
                this.iconUrl = str4;
                this.buttons = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ BannerData copy$default(BannerData bannerData, String str, String str2, String str3, String str4, String str5, List list, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = bannerData.type;
                }
                if ((i13 & 2) != 0) {
                    str2 = bannerData.hint;
                }
                String str6 = str2;
                if ((i13 & 4) != 0) {
                    str3 = bannerData.header;
                }
                String str7 = str3;
                if ((i13 & 8) != 0) {
                    str4 = bannerData.text;
                }
                String str8 = str4;
                if ((i13 & 16) != 0) {
                    str5 = bannerData.iconUrl;
                }
                String str9 = str5;
                if ((i13 & 32) != 0) {
                    list = bannerData.buttons;
                }
                return bannerData.copy(str, str6, str7, str8, str9, list);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getHint() {
                return this.hint;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getHeader() {
                return this.header;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getIconUrl() {
                return this.iconUrl;
            }

            public final List<Buttons> component6() {
                return this.buttons;
            }

            public final BannerData copy(String type, String hint, String header, String text, String iconUrl, List<Buttons> buttons) {
                zdlpuopuiu.btonecajqb(type, "type");
                return new BannerData(type, hint, header, text, iconUrl, buttons);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BannerData)) {
                    return false;
                }
                BannerData bannerData = (BannerData) other;
                return zdlpuopuiu.eablkybsjg(this.type, bannerData.type) && zdlpuopuiu.eablkybsjg(this.hint, bannerData.hint) && zdlpuopuiu.eablkybsjg(this.header, bannerData.header) && zdlpuopuiu.eablkybsjg(this.text, bannerData.text) && zdlpuopuiu.eablkybsjg(this.iconUrl, bannerData.iconUrl) && zdlpuopuiu.eablkybsjg(this.buttons, bannerData.buttons);
            }

            public final List<Buttons> getButtons() {
                return this.buttons;
            }

            public final String getHeader() {
                return this.header;
            }

            public final String getHint() {
                return this.hint;
            }

            public final String getIconUrl() {
                return this.iconUrl;
            }

            public final String getText() {
                return this.text;
            }

            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                String str = this.hint;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.header;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.text;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.iconUrl;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                List<Buttons> list = this.buttons;
                return iHashCode5 + (list != null ? list.hashCode() : 0);
            }

            public String toString() {
                return "BannerData(type=" + this.type + ", hint=" + this.hint + ", header=" + this.header + ", text=" + this.text + ", iconUrl=" + this.iconUrl + ", buttons=" + this.buttons + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                zdlpuopuiu.btonecajqb(parcel, "out");
                parcel.writeString(this.type);
                parcel.writeString(this.hint);
                parcel.writeString(this.header);
                parcel.writeString(this.text);
                parcel.writeString(this.iconUrl);
                List<Buttons> list = this.buttons;
                if (list == null) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<Buttons> it = list.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(parcel, flags);
                }
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PromoInfo> {
            @Override // android.os.Parcelable.Creator
            public final PromoInfo createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i13 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i13);
                    for (int i14 = 0; i14 != i13; i14++) {
                        arrayList2.add(BannerData.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new PromoInfo(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final PromoInfo[] newArray(int i13) {
                return new PromoInfo[i13];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PromoInfo() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PromoInfo copy$default(PromoInfo promoInfo, String str, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = promoInfo.hint;
            }
            if ((i13 & 2) != 0) {
                list = promoInfo.bannerList;
            }
            return promoInfo.copy(str, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        public final List<BannerData> component2() {
            return this.bannerList;
        }

        public final PromoInfo copy(String hint, List<BannerData> bannerList) {
            return new PromoInfo(hint, bannerList);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PromoInfo)) {
                return false;
            }
            PromoInfo promoInfo = (PromoInfo) other;
            return zdlpuopuiu.eablkybsjg(this.hint, promoInfo.hint) && zdlpuopuiu.eablkybsjg(this.bannerList, promoInfo.bannerList);
        }

        public final List<BannerData> getBannerList() {
            return this.bannerList;
        }

        public final String getHint() {
            return this.hint;
        }

        public int hashCode() {
            String str = this.hint;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<BannerData> list = this.bannerList;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "PromoInfo(hint=" + this.hint + ", bannerList=" + this.bannerList + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.hint);
            List<BannerData> list = this.bannerList;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<BannerData> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }

        public PromoInfo(String str, List<BannerData> list) {
            this.hint = str;
            this.bannerList = list;
        }

        public /* synthetic */ PromoInfo(String str, List list, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : list);
        }
    }

    public ListOfCardsResponseBody(UserInfo userInfo, OrderInfo orderInfo, PaymentToolInfo paymentToolInfo, MerchantInfo merchantInfo, ButtonBnpl buttonBnpl, PromoInfo promoInfo, FormInfo formInfo) {
        zdlpuopuiu.btonecajqb(userInfo, "userInfo");
        zdlpuopuiu.btonecajqb(orderInfo, "orderInfo");
        zdlpuopuiu.btonecajqb(paymentToolInfo, "paymentToolInfo");
        this.userInfo = userInfo;
        this.orderInfo = orderInfo;
        this.paymentToolInfo = paymentToolInfo;
        this.merchantInfo = merchantInfo;
        this.buttonBnpl = buttonBnpl;
        this.promoInfo = promoInfo;
        this.formInfo = formInfo;
    }

    public static /* synthetic */ ListOfCardsResponseBody copy$default(ListOfCardsResponseBody listOfCardsResponseBody, UserInfo userInfo, OrderInfo orderInfo, PaymentToolInfo paymentToolInfo, MerchantInfo merchantInfo, ButtonBnpl buttonBnpl, PromoInfo promoInfo, FormInfo formInfo, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            userInfo = listOfCardsResponseBody.userInfo;
        }
        if ((i13 & 2) != 0) {
            orderInfo = listOfCardsResponseBody.orderInfo;
        }
        OrderInfo orderInfo2 = orderInfo;
        if ((i13 & 4) != 0) {
            paymentToolInfo = listOfCardsResponseBody.paymentToolInfo;
        }
        PaymentToolInfo paymentToolInfo2 = paymentToolInfo;
        if ((i13 & 8) != 0) {
            merchantInfo = listOfCardsResponseBody.merchantInfo;
        }
        MerchantInfo merchantInfo2 = merchantInfo;
        if ((i13 & 16) != 0) {
            buttonBnpl = listOfCardsResponseBody.buttonBnpl;
        }
        ButtonBnpl buttonBnpl2 = buttonBnpl;
        if ((i13 & 32) != 0) {
            promoInfo = listOfCardsResponseBody.promoInfo;
        }
        PromoInfo promoInfo2 = promoInfo;
        if ((i13 & 64) != 0) {
            formInfo = listOfCardsResponseBody.formInfo;
        }
        return listOfCardsResponseBody.copy(userInfo, orderInfo2, paymentToolInfo2, merchantInfo2, buttonBnpl2, promoInfo2, formInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PaymentToolInfo getPaymentToolInfo() {
        return this.paymentToolInfo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ButtonBnpl getButtonBnpl() {
        return this.buttonBnpl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PromoInfo getPromoInfo() {
        return this.promoInfo;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final FormInfo getFormInfo() {
        return this.formInfo;
    }

    public final ListOfCardsResponseBody copy(UserInfo userInfo, OrderInfo orderInfo, PaymentToolInfo paymentToolInfo, MerchantInfo merchantInfo, ButtonBnpl buttonBnpl, PromoInfo promoInfo, FormInfo formInfo) {
        zdlpuopuiu.btonecajqb(userInfo, "userInfo");
        zdlpuopuiu.btonecajqb(orderInfo, "orderInfo");
        zdlpuopuiu.btonecajqb(paymentToolInfo, "paymentToolInfo");
        return new ListOfCardsResponseBody(userInfo, orderInfo, paymentToolInfo, merchantInfo, buttonBnpl, promoInfo, formInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListOfCardsResponseBody)) {
            return false;
        }
        ListOfCardsResponseBody listOfCardsResponseBody = (ListOfCardsResponseBody) other;
        return zdlpuopuiu.eablkybsjg(this.userInfo, listOfCardsResponseBody.userInfo) && zdlpuopuiu.eablkybsjg(this.orderInfo, listOfCardsResponseBody.orderInfo) && zdlpuopuiu.eablkybsjg(this.paymentToolInfo, listOfCardsResponseBody.paymentToolInfo) && zdlpuopuiu.eablkybsjg(this.merchantInfo, listOfCardsResponseBody.merchantInfo) && zdlpuopuiu.eablkybsjg(this.buttonBnpl, listOfCardsResponseBody.buttonBnpl) && zdlpuopuiu.eablkybsjg(this.promoInfo, listOfCardsResponseBody.promoInfo) && zdlpuopuiu.eablkybsjg(this.formInfo, listOfCardsResponseBody.formInfo);
    }

    public final ButtonBnpl getButtonBnpl() {
        return this.buttonBnpl;
    }

    public final FormInfo getFormInfo() {
        return this.formInfo;
    }

    public final MerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }

    public final OrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    public final PaymentToolInfo getPaymentToolInfo() {
        return this.paymentToolInfo;
    }

    public final PromoInfo getPromoInfo() {
        return this.promoInfo;
    }

    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        int iHashCode = (this.paymentToolInfo.hashCode() + ((this.orderInfo.hashCode() + (this.userInfo.hashCode() * 31)) * 31)) * 31;
        MerchantInfo merchantInfo = this.merchantInfo;
        int iHashCode2 = (iHashCode + (merchantInfo == null ? 0 : merchantInfo.hashCode())) * 31;
        ButtonBnpl buttonBnpl = this.buttonBnpl;
        int iHashCode3 = (iHashCode2 + (buttonBnpl == null ? 0 : buttonBnpl.hashCode())) * 31;
        PromoInfo promoInfo = this.promoInfo;
        int iHashCode4 = (iHashCode3 + (promoInfo == null ? 0 : promoInfo.hashCode())) * 31;
        FormInfo formInfo = this.formInfo;
        return iHashCode4 + (formInfo != null ? formInfo.hashCode() : 0);
    }

    public String toString() {
        return "ListOfCardsResponseBody(userInfo=" + this.userInfo + ", orderInfo=" + this.orderInfo + ", paymentToolInfo=" + this.paymentToolInfo + ", merchantInfo=" + this.merchantInfo + ", buttonBnpl=" + this.buttonBnpl + ", promoInfo=" + this.promoInfo + ", formInfo=" + this.formInfo + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
        this.userInfo.writeToParcel(parcel, flags);
        this.orderInfo.writeToParcel(parcel, flags);
        this.paymentToolInfo.writeToParcel(parcel, flags);
        MerchantInfo merchantInfo = this.merchantInfo;
        if (merchantInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            merchantInfo.writeToParcel(parcel, flags);
        }
        ButtonBnpl buttonBnpl = this.buttonBnpl;
        if (buttonBnpl == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonBnpl.writeToParcel(parcel, flags);
        }
        PromoInfo promoInfo = this.promoInfo;
        if (promoInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoInfo.writeToParcel(parcel, flags);
        }
        FormInfo formInfo = this.formInfo;
        if (formInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formInfo.writeToParcel(parcel, flags);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJH\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\f¨\u0006*"}, d2 = {"Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$UserInfo;", "Landroid/os/Parcelable;", "", "lastName", "firstName", "", "gender", "sub", "ucpId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lspay/sdk/domain/model/response/listOfCards/ListOfCardsResponseBody$UserInfo;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLastName", "getFirstName", "Ljava/lang/Integer;", "getGender", "getSub", "getUcpId", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class UserInfo implements Parcelable {
        public static final Parcelable.Creator<UserInfo> CREATOR = new Creator();
        private final String firstName;
        private final Integer gender;
        private final String lastName;
        private final String sub;
        private final String ucpId;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UserInfo> {
            @Override // android.os.Parcelable.Creator
            public final UserInfo createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new UserInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final UserInfo[] newArray(int i13) {
                return new UserInfo[i13];
            }
        }

        public UserInfo(String lastName, String firstName, Integer num, String str, String str2) {
            zdlpuopuiu.btonecajqb(lastName, "lastName");
            zdlpuopuiu.btonecajqb(firstName, "firstName");
            this.lastName = lastName;
            this.firstName = firstName;
            this.gender = num;
            this.sub = str;
            this.ucpId = str2;
        }

        public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, String str2, Integer num, String str3, String str4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = userInfo.lastName;
            }
            if ((i13 & 2) != 0) {
                str2 = userInfo.firstName;
            }
            String str5 = str2;
            if ((i13 & 4) != 0) {
                num = userInfo.gender;
            }
            Integer num2 = num;
            if ((i13 & 8) != 0) {
                str3 = userInfo.sub;
            }
            String str6 = str3;
            if ((i13 & 16) != 0) {
                str4 = userInfo.ucpId;
            }
            return userInfo.copy(str, str5, num2, str6, str4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getGender() {
            return this.gender;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getSub() {
            return this.sub;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getUcpId() {
            return this.ucpId;
        }

        public final UserInfo copy(String lastName, String firstName, Integer gender, String sub, String ucpId) {
            zdlpuopuiu.btonecajqb(lastName, "lastName");
            zdlpuopuiu.btonecajqb(firstName, "firstName");
            return new UserInfo(lastName, firstName, gender, sub, ucpId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserInfo)) {
                return false;
            }
            UserInfo userInfo = (UserInfo) other;
            return zdlpuopuiu.eablkybsjg(this.lastName, userInfo.lastName) && zdlpuopuiu.eablkybsjg(this.firstName, userInfo.firstName) && zdlpuopuiu.eablkybsjg(this.gender, userInfo.gender) && zdlpuopuiu.eablkybsjg(this.sub, userInfo.sub) && zdlpuopuiu.eablkybsjg(this.ucpId, userInfo.ucpId);
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final Integer getGender() {
            return this.gender;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public final String getSub() {
            return this.sub;
        }

        public final String getUcpId() {
            return this.ucpId;
        }

        public int hashCode() {
            int iIobyxmoadg = xg.iobyxmoadg(this.firstName, this.lastName.hashCode() * 31, 31);
            Integer num = this.gender;
            int iHashCode = (iIobyxmoadg + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.sub;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.ucpId;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "UserInfo(lastName=" + this.lastName + ", firstName=" + this.firstName + ", gender=" + this.gender + ", sub=" + this.sub + ", ucpId=" + this.ucpId + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            int iIntValue;
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.lastName);
            parcel.writeString(this.firstName);
            Integer num = this.gender;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeString(this.sub);
            parcel.writeString(this.ucpId);
        }

        public /* synthetic */ UserInfo(String str, String str2, Integer num, String str3, String str4, int i13, gtknphoqwx gtknphoqwxVar) {
            this(str, str2, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4);
        }
    }

    public /* synthetic */ ListOfCardsResponseBody(UserInfo userInfo, OrderInfo orderInfo, PaymentToolInfo paymentToolInfo, MerchantInfo merchantInfo, ButtonBnpl buttonBnpl, PromoInfo promoInfo, FormInfo formInfo, int i13, gtknphoqwx gtknphoqwxVar) {
        this(userInfo, orderInfo, paymentToolInfo, (i13 & 8) != 0 ? null : merchantInfo, (i13 & 16) != 0 ? null : buttonBnpl, (i13 & 32) != 0 ? null : promoInfo, (i13 & 64) != 0 ? null : formInfo);
    }
}
