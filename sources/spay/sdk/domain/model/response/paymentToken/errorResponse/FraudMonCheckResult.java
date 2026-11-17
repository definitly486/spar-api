package spay.sdk.domain.model.response.paymentToken.errorResponse;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001:\u0001)B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b\u0005\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b&\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0011¨\u0006*"}, d2 = {"Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;", "Landroid/os/Parcelable;", "", "actionCode", "", "isClientBlock", "confirmMethodFactor", "Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult$FormParameters;", "formParameters", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult$FormParameters;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult$FormParameters;", "copy", "(Ljava/lang/String;ZLjava/lang/String;Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult$FormParameters;)Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getActionCode", "Z", "getConfirmMethodFactor", "Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult$FormParameters;", "getFormParameters", "FormParameters", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FraudMonCheckResult implements Parcelable {
    public static final Parcelable.Creator<FraudMonCheckResult> CREATOR = new Creator();
    private final String actionCode;
    private final String confirmMethodFactor;
    private final FormParameters formParameters;
    private final boolean isClientBlock;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FraudMonCheckResult> {
        @Override // android.os.Parcelable.Creator
        public final FraudMonCheckResult createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new FraudMonCheckResult(parcel.readString(), parcel.readInt() != 0, parcel.readString(), FormParameters.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final FraudMonCheckResult[] newArray(int i13) {
            return new FraudMonCheckResult[i13];
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJp\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b/\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b0\u0010\u000e¨\u00061"}, d2 = {"Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult$FormParameters;", "Landroid/os/Parcelable;", "", "header", "text", "textDecline", "buttonConfirmText", "buttonDeclineText", "buttonInformText", "cybercabinetUrlAndroid", "cybercabinetUrlIOS", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lspay/sdk/domain/model/response/paymentToken/errorResponse/FraudMonCheckResult$FormParameters;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getHeader", "getText", "getTextDecline", "getButtonConfirmText", "getButtonDeclineText", "getButtonInformText", "getCybercabinetUrlAndroid", "getCybercabinetUrlIOS", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FormParameters implements Parcelable {
        public static final Parcelable.Creator<FormParameters> CREATOR = new Creator();
        private final String buttonConfirmText;
        private final String buttonDeclineText;
        private final String buttonInformText;
        private final String cybercabinetUrlAndroid;
        private final String cybercabinetUrlIOS;
        private final String header;
        private final String text;
        private final String textDecline;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FormParameters> {
            @Override // android.os.Parcelable.Creator
            public final FormParameters createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new FormParameters(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FormParameters[] newArray(int i13) {
                return new FormParameters[i13];
            }
        }

        public FormParameters(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
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

        public final FormParameters copy(String header, String text, String textDecline, String buttonConfirmText, String buttonDeclineText, String buttonInformText, String cybercabinetUrlAndroid, String cybercabinetUrlIOS) {
            return new FormParameters(header, text, textDecline, buttonConfirmText, buttonDeclineText, buttonInformText, cybercabinetUrlAndroid, cybercabinetUrlIOS);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormParameters)) {
                return false;
            }
            FormParameters formParameters = (FormParameters) other;
            return zdlpuopuiu.eablkybsjg(this.header, formParameters.header) && zdlpuopuiu.eablkybsjg(this.text, formParameters.text) && zdlpuopuiu.eablkybsjg(this.textDecline, formParameters.textDecline) && zdlpuopuiu.eablkybsjg(this.buttonConfirmText, formParameters.buttonConfirmText) && zdlpuopuiu.eablkybsjg(this.buttonDeclineText, formParameters.buttonDeclineText) && zdlpuopuiu.eablkybsjg(this.buttonInformText, formParameters.buttonInformText) && zdlpuopuiu.eablkybsjg(this.cybercabinetUrlAndroid, formParameters.cybercabinetUrlAndroid) && zdlpuopuiu.eablkybsjg(this.cybercabinetUrlIOS, formParameters.cybercabinetUrlIOS);
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
            return "FormParameters(header=" + this.header + ", text=" + this.text + ", textDecline=" + this.textDecline + ", buttonConfirmText=" + this.buttonConfirmText + ", buttonDeclineText=" + this.buttonDeclineText + ", buttonInformText=" + this.buttonInformText + ", cybercabinetUrlAndroid=" + this.cybercabinetUrlAndroid + ", cybercabinetUrlIOS=" + this.cybercabinetUrlIOS + ")";
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
    }

    public FraudMonCheckResult(String actionCode, boolean z13, String str, FormParameters formParameters) {
        zdlpuopuiu.btonecajqb(actionCode, "actionCode");
        zdlpuopuiu.btonecajqb(formParameters, "formParameters");
        this.actionCode = actionCode;
        this.isClientBlock = z13;
        this.confirmMethodFactor = str;
        this.formParameters = formParameters;
    }

    public static /* synthetic */ FraudMonCheckResult copy$default(FraudMonCheckResult fraudMonCheckResult, String str, boolean z13, String str2, FormParameters formParameters, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = fraudMonCheckResult.actionCode;
        }
        if ((i13 & 2) != 0) {
            z13 = fraudMonCheckResult.isClientBlock;
        }
        if ((i13 & 4) != 0) {
            str2 = fraudMonCheckResult.confirmMethodFactor;
        }
        if ((i13 & 8) != 0) {
            formParameters = fraudMonCheckResult.formParameters;
        }
        return fraudMonCheckResult.copy(str, z13, str2, formParameters);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActionCode() {
        return this.actionCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsClientBlock() {
        return this.isClientBlock;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConfirmMethodFactor() {
        return this.confirmMethodFactor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FormParameters getFormParameters() {
        return this.formParameters;
    }

    public final FraudMonCheckResult copy(String actionCode, boolean isClientBlock, String confirmMethodFactor, FormParameters formParameters) {
        zdlpuopuiu.btonecajqb(actionCode, "actionCode");
        zdlpuopuiu.btonecajqb(formParameters, "formParameters");
        return new FraudMonCheckResult(actionCode, isClientBlock, confirmMethodFactor, formParameters);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FraudMonCheckResult)) {
            return false;
        }
        FraudMonCheckResult fraudMonCheckResult = (FraudMonCheckResult) other;
        return zdlpuopuiu.eablkybsjg(this.actionCode, fraudMonCheckResult.actionCode) && this.isClientBlock == fraudMonCheckResult.isClientBlock && zdlpuopuiu.eablkybsjg(this.confirmMethodFactor, fraudMonCheckResult.confirmMethodFactor) && zdlpuopuiu.eablkybsjg(this.formParameters, fraudMonCheckResult.formParameters);
    }

    public final String getActionCode() {
        return this.actionCode;
    }

    public final String getConfirmMethodFactor() {
        return this.confirmMethodFactor;
    }

    public final FormParameters getFormParameters() {
        return this.formParameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = this.actionCode.hashCode() * 31;
        boolean z13 = this.isClientBlock;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = (iHashCode + r13) * 31;
        String str = this.confirmMethodFactor;
        return this.formParameters.hashCode() + ((i13 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final boolean isClientBlock() {
        return this.isClientBlock;
    }

    public String toString() {
        return "FraudMonCheckResult(actionCode=" + this.actionCode + ", isClientBlock=" + this.isClientBlock + ", confirmMethodFactor=" + this.confirmMethodFactor + ", formParameters=" + this.formParameters + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
        parcel.writeString(this.actionCode);
        parcel.writeInt(this.isClientBlock ? 1 : 0);
        parcel.writeString(this.confirmMethodFactor);
        this.formParameters.writeToParcel(parcel, flags);
    }
}
