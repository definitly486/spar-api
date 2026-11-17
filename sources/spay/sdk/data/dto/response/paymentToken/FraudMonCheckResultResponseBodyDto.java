package spay.sdk.data.dto.response.paymentToken;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.pd;
import spay.sdk.data.dto.response.DataDtoInterface;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001-B/\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J@\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b\u0007\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b*\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0015¨\u0006."}, d2 = {"Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;", "Landroid/os/Parcelable;", "", "actionCode", "", "isClientBlock", "confirmMethodFactor", "Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto$FormParametersResponseBodyDto;", "formParametersResponseBodyDto", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto$FormParametersResponseBodyDto;)V", "toModel", "()Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "()Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto$FormParametersResponseBodyDto;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto$FormParametersResponseBodyDto;)Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getActionCode", "Ljava/lang/Boolean;", "getConfirmMethodFactor", "Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto$FormParametersResponseBodyDto;", "getFormParametersResponseBodyDto", "FormParametersResponseBodyDto", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FraudMonCheckResultResponseBodyDto implements DataDtoInterface<FraudMonCheckResult>, Parcelable {
    public static final Parcelable.Creator<FraudMonCheckResultResponseBodyDto> CREATOR = new Creator();

    @ppxfxbqfkf("actionCode")
    private final String actionCode;

    @ppxfxbqfkf("confirmMethodFactor")
    private final String confirmMethodFactor;

    @ppxfxbqfkf("formParameters")
    private final FormParametersResponseBodyDto formParametersResponseBodyDto;

    @ppxfxbqfkf("isClientBlock")
    private final Boolean isClientBlock;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FraudMonCheckResultResponseBodyDto> {
        @Override // android.os.Parcelable.Creator
        public final FraudMonCheckResultResponseBodyDto createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FraudMonCheckResultResponseBodyDto(string, boolValueOf, parcel.readString(), parcel.readInt() != 0 ? FormParametersResponseBodyDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final FraudMonCheckResultResponseBodyDto[] newArray(int i13) {
            return new FraudMonCheckResultResponseBodyDto[i13];
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BW\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012Jp\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b/\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b0\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b1\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b2\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b3\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b4\u0010\u0012¨\u00065"}, d2 = {"Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto$FormParametersResponseBodyDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult$FormParameters;", "Landroid/os/Parcelable;", "", "header", "text", "textDecline", "buttonConfirmText", "buttonDeclineText", "buttonInformText", "cybercabinetUrlAndroid", "cybercabinetUrlIOS", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toModel", "()Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult$FormParameters;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lspay/sdk/data/dto/response/paymentToken/FraudMonCheckResultResponseBodyDto$FormParametersResponseBodyDto;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getHeader", "getText", "getTextDecline", "getButtonConfirmText", "getButtonDeclineText", "getButtonInformText", "getCybercabinetUrlAndroid", "getCybercabinetUrlIOS", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FormParametersResponseBodyDto implements DataDtoInterface<FraudMonCheckResult.FormParameters>, Parcelable {
        public static final Parcelable.Creator<FormParametersResponseBodyDto> CREATOR = new Creator();

        @ppxfxbqfkf("buttonConfirmText")
        private final String buttonConfirmText;

        @ppxfxbqfkf("buttonDeclineText")
        private final String buttonDeclineText;

        @ppxfxbqfkf("buttonInformText")
        private final String buttonInformText;

        @ppxfxbqfkf("cybercabinetUrlAndroid")
        private final String cybercabinetUrlAndroid;

        @ppxfxbqfkf("cybercabinetUrlIOS")
        private final String cybercabinetUrlIOS;

        @ppxfxbqfkf("header")
        private final String header;

        @ppxfxbqfkf("text")
        private final String text;

        @ppxfxbqfkf("textDecline")
        private final String textDecline;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FormParametersResponseBodyDto> {
            @Override // android.os.Parcelable.Creator
            public final FormParametersResponseBodyDto createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new FormParametersResponseBodyDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FormParametersResponseBodyDto[] newArray(int i13) {
                return new FormParametersResponseBodyDto[i13];
            }
        }

        public FormParametersResponseBodyDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.header = str;
            this.text = str2;
            this.textDecline = str3;
            this.buttonConfirmText = str4;
            this.buttonDeclineText = str5;
            this.buttonInformText = str6;
            this.cybercabinetUrlAndroid = str7;
            this.cybercabinetUrlIOS = str8;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getTextDecline() {
            return this.textDecline;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getButtonConfirmText() {
            return this.buttonConfirmText;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getButtonDeclineText() {
            return this.buttonDeclineText;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getButtonInformText() {
            return this.buttonInformText;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getCybercabinetUrlAndroid() {
            return this.cybercabinetUrlAndroid;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getCybercabinetUrlIOS() {
            return this.cybercabinetUrlIOS;
        }

        public final FormParametersResponseBodyDto copy(String header, String text, String textDecline, String buttonConfirmText, String buttonDeclineText, String buttonInformText, String cybercabinetUrlAndroid, String cybercabinetUrlIOS) {
            return new FormParametersResponseBodyDto(header, text, textDecline, buttonConfirmText, buttonDeclineText, buttonInformText, cybercabinetUrlAndroid, cybercabinetUrlIOS);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormParametersResponseBodyDto)) {
                return false;
            }
            FormParametersResponseBodyDto formParametersResponseBodyDto = (FormParametersResponseBodyDto) other;
            return zdlpuopuiu.eablkybsjg(this.header, formParametersResponseBodyDto.header) && zdlpuopuiu.eablkybsjg(this.text, formParametersResponseBodyDto.text) && zdlpuopuiu.eablkybsjg(this.textDecline, formParametersResponseBodyDto.textDecline) && zdlpuopuiu.eablkybsjg(this.buttonConfirmText, formParametersResponseBodyDto.buttonConfirmText) && zdlpuopuiu.eablkybsjg(this.buttonDeclineText, formParametersResponseBodyDto.buttonDeclineText) && zdlpuopuiu.eablkybsjg(this.buttonInformText, formParametersResponseBodyDto.buttonInformText) && zdlpuopuiu.eablkybsjg(this.cybercabinetUrlAndroid, formParametersResponseBodyDto.cybercabinetUrlAndroid) && zdlpuopuiu.eablkybsjg(this.cybercabinetUrlIOS, formParametersResponseBodyDto.cybercabinetUrlIOS);
        }

        public final String getButtonConfirmText() {
            return this.buttonConfirmText;
        }

        public final String getButtonDeclineText() {
            return this.buttonDeclineText;
        }

        public final String getButtonInformText() {
            return this.buttonInformText;
        }

        public final String getCybercabinetUrlAndroid() {
            return this.cybercabinetUrlAndroid;
        }

        public final String getCybercabinetUrlIOS() {
            return this.cybercabinetUrlIOS;
        }

        public final String getHeader() {
            return this.header;
        }

        public final String getText() {
            return this.text;
        }

        public final String getTextDecline() {
            return this.textDecline;
        }

        public int hashCode() {
            String str = this.header;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.text;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.textDecline;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.buttonConfirmText;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.buttonDeclineText;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.buttonInformText;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.cybercabinetUrlAndroid;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.cybercabinetUrlIOS;
            return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        }

        public String toString() {
            return "FormParametersResponseBodyDto(header=" + this.header + ", text=" + this.text + ", textDecline=" + this.textDecline + ", buttonConfirmText=" + this.buttonConfirmText + ", buttonDeclineText=" + this.buttonDeclineText + ", buttonInformText=" + this.buttonInformText + ", cybercabinetUrlAndroid=" + this.cybercabinetUrlAndroid + ", cybercabinetUrlIOS=" + this.cybercabinetUrlIOS + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "out");
            parcel.writeString(this.header);
            parcel.writeString(this.text);
            parcel.writeString(this.textDecline);
            parcel.writeString(this.buttonConfirmText);
            parcel.writeString(this.buttonDeclineText);
            parcel.writeString(this.buttonInformText);
            parcel.writeString(this.cybercabinetUrlAndroid);
            parcel.writeString(this.cybercabinetUrlIOS);
        }

        @Override // spay.sdk.data.dto.response.DataDtoInterface
        public FraudMonCheckResult.FormParameters toModel() {
            return new FraudMonCheckResult.FormParameters(this.header, this.text, this.textDecline, this.buttonConfirmText, this.buttonDeclineText, this.buttonInformText, this.cybercabinetUrlAndroid, this.cybercabinetUrlIOS);
        }
    }

    public FraudMonCheckResultResponseBodyDto(String str, Boolean bool, String str2, FormParametersResponseBodyDto formParametersResponseBodyDto) {
        this.actionCode = str;
        this.isClientBlock = bool;
        this.confirmMethodFactor = str2;
        this.formParametersResponseBodyDto = formParametersResponseBodyDto;
    }

    public static /* synthetic */ FraudMonCheckResultResponseBodyDto copy$default(FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto, String str, Boolean bool, String str2, FormParametersResponseBodyDto formParametersResponseBodyDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = fraudMonCheckResultResponseBodyDto.actionCode;
        }
        if ((i13 & 2) != 0) {
            bool = fraudMonCheckResultResponseBodyDto.isClientBlock;
        }
        if ((i13 & 4) != 0) {
            str2 = fraudMonCheckResultResponseBodyDto.confirmMethodFactor;
        }
        if ((i13 & 8) != 0) {
            formParametersResponseBodyDto = fraudMonCheckResultResponseBodyDto.formParametersResponseBodyDto;
        }
        return fraudMonCheckResultResponseBodyDto.copy(str, bool, str2, formParametersResponseBodyDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActionCode() {
        return this.actionCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsClientBlock() {
        return this.isClientBlock;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConfirmMethodFactor() {
        return this.confirmMethodFactor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FormParametersResponseBodyDto getFormParametersResponseBodyDto() {
        return this.formParametersResponseBodyDto;
    }

    public final FraudMonCheckResultResponseBodyDto copy(String actionCode, Boolean isClientBlock, String confirmMethodFactor, FormParametersResponseBodyDto formParametersResponseBodyDto) {
        return new FraudMonCheckResultResponseBodyDto(actionCode, isClientBlock, confirmMethodFactor, formParametersResponseBodyDto);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FraudMonCheckResultResponseBodyDto)) {
            return false;
        }
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto = (FraudMonCheckResultResponseBodyDto) other;
        return zdlpuopuiu.eablkybsjg(this.actionCode, fraudMonCheckResultResponseBodyDto.actionCode) && zdlpuopuiu.eablkybsjg(this.isClientBlock, fraudMonCheckResultResponseBodyDto.isClientBlock) && zdlpuopuiu.eablkybsjg(this.confirmMethodFactor, fraudMonCheckResultResponseBodyDto.confirmMethodFactor) && zdlpuopuiu.eablkybsjg(this.formParametersResponseBodyDto, fraudMonCheckResultResponseBodyDto.formParametersResponseBodyDto);
    }

    public final String getActionCode() {
        return this.actionCode;
    }

    public final String getConfirmMethodFactor() {
        return this.confirmMethodFactor;
    }

    public final FormParametersResponseBodyDto getFormParametersResponseBodyDto() {
        return this.formParametersResponseBodyDto;
    }

    public int hashCode() {
        String str = this.actionCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isClientBlock;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.confirmMethodFactor;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FormParametersResponseBodyDto formParametersResponseBodyDto = this.formParametersResponseBodyDto;
        return iHashCode3 + (formParametersResponseBodyDto != null ? formParametersResponseBodyDto.hashCode() : 0);
    }

    public final Boolean isClientBlock() {
        return this.isClientBlock;
    }

    public String toString() {
        return "FraudMonCheckResultResponseBodyDto(actionCode=" + this.actionCode + ", isClientBlock=" + this.isClientBlock + ", confirmMethodFactor=" + this.confirmMethodFactor + ", formParametersResponseBodyDto=" + this.formParametersResponseBodyDto + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
        parcel.writeString(this.actionCode);
        Boolean bool = this.isClientBlock;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.confirmMethodFactor);
        FormParametersResponseBodyDto formParametersResponseBodyDto = this.formParametersResponseBodyDto;
        if (formParametersResponseBodyDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formParametersResponseBodyDto.writeToParcel(parcel, flags);
        }
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    public FraudMonCheckResult toModel() {
        FraudMonCheckResult.FormParameters model;
        String str = this.actionCode;
        if (str == null) {
            throw new pd("actionCode");
        }
        Boolean bool = this.isClientBlock;
        if (bool == null) {
            throw new pd("isClientBlock");
        }
        boolean zBooleanValue = bool.booleanValue();
        String str2 = this.confirmMethodFactor;
        FormParametersResponseBodyDto formParametersResponseBodyDto = this.formParametersResponseBodyDto;
        if (formParametersResponseBodyDto == null || (model = formParametersResponseBodyDto.toModel()) == null) {
            throw new pd("formParametersResponseBodyDto");
        }
        return new FraudMonCheckResult(str, zBooleanValue, str2, model);
    }
}
