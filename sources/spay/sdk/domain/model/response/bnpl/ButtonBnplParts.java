package spay.sdk.domain.model.response.bnpl;

import android.os.Parcel;
import android.os.Parcelable;
import kk.xg;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\f¨\u0006+"}, d2 = {"Lspay/sdk/domain/model/response/bnpl/ButtonBnplParts;", "Landroid/os/Parcelable;", "", "buttonLogo", "buttonLogoInactive", "header", "headerInactive", "content", "contentInactive", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lspay/sdk/domain/model/response/bnpl/ButtonBnplParts;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getButtonLogo", "getButtonLogoInactive", "getHeader", "getHeaderInactive", "getContent", "getContentInactive", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ButtonBnplParts implements Parcelable {
    public static final Parcelable.Creator<ButtonBnplParts> CREATOR = new Creator();
    private final String buttonLogo;
    private final String buttonLogoInactive;
    private final String content;
    private final String contentInactive;
    private final String header;
    private final String headerInactive;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ButtonBnplParts> {
        @Override // android.os.Parcelable.Creator
        public final ButtonBnplParts createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ButtonBnplParts(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonBnplParts[] newArray(int i13) {
            return new ButtonBnplParts[i13];
        }
    }

    public ButtonBnplParts(String buttonLogo, String buttonLogoInactive, String header, String headerInactive, String content, String contentInactive) {
        zdlpuopuiu.btonecajqb(buttonLogo, "buttonLogo");
        zdlpuopuiu.btonecajqb(buttonLogoInactive, "buttonLogoInactive");
        zdlpuopuiu.btonecajqb(header, "header");
        zdlpuopuiu.btonecajqb(headerInactive, "headerInactive");
        zdlpuopuiu.btonecajqb(content, "content");
        zdlpuopuiu.btonecajqb(contentInactive, "contentInactive");
        this.buttonLogo = buttonLogo;
        this.buttonLogoInactive = buttonLogoInactive;
        this.header = header;
        this.headerInactive = headerInactive;
        this.content = content;
        this.contentInactive = contentInactive;
    }

    public static /* synthetic */ ButtonBnplParts copy$default(ButtonBnplParts buttonBnplParts, String str, String str2, String str3, String str4, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = buttonBnplParts.buttonLogo;
        }
        if ((i13 & 2) != 0) {
            str2 = buttonBnplParts.buttonLogoInactive;
        }
        String str7 = str2;
        if ((i13 & 4) != 0) {
            str3 = buttonBnplParts.header;
        }
        String str8 = str3;
        if ((i13 & 8) != 0) {
            str4 = buttonBnplParts.headerInactive;
        }
        String str9 = str4;
        if ((i13 & 16) != 0) {
            str5 = buttonBnplParts.content;
        }
        String str10 = str5;
        if ((i13 & 32) != 0) {
            str6 = buttonBnplParts.contentInactive;
        }
        return buttonBnplParts.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getButtonLogo() {
        return this.buttonLogo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getButtonLogoInactive() {
        return this.buttonLogoInactive;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHeaderInactive() {
        return this.headerInactive;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getContentInactive() {
        return this.contentInactive;
    }

    public final ButtonBnplParts copy(String buttonLogo, String buttonLogoInactive, String header, String headerInactive, String content, String contentInactive) {
        zdlpuopuiu.btonecajqb(buttonLogo, "buttonLogo");
        zdlpuopuiu.btonecajqb(buttonLogoInactive, "buttonLogoInactive");
        zdlpuopuiu.btonecajqb(header, "header");
        zdlpuopuiu.btonecajqb(headerInactive, "headerInactive");
        zdlpuopuiu.btonecajqb(content, "content");
        zdlpuopuiu.btonecajqb(contentInactive, "contentInactive");
        return new ButtonBnplParts(buttonLogo, buttonLogoInactive, header, headerInactive, content, contentInactive);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonBnplParts)) {
            return false;
        }
        ButtonBnplParts buttonBnplParts = (ButtonBnplParts) other;
        return zdlpuopuiu.eablkybsjg(this.buttonLogo, buttonBnplParts.buttonLogo) && zdlpuopuiu.eablkybsjg(this.buttonLogoInactive, buttonBnplParts.buttonLogoInactive) && zdlpuopuiu.eablkybsjg(this.header, buttonBnplParts.header) && zdlpuopuiu.eablkybsjg(this.headerInactive, buttonBnplParts.headerInactive) && zdlpuopuiu.eablkybsjg(this.content, buttonBnplParts.content) && zdlpuopuiu.eablkybsjg(this.contentInactive, buttonBnplParts.contentInactive);
    }

    public final String getButtonLogo() {
        return this.buttonLogo;
    }

    public final String getButtonLogoInactive() {
        return this.buttonLogoInactive;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getContentInactive() {
        return this.contentInactive;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getHeaderInactive() {
        return this.headerInactive;
    }

    public int hashCode() {
        return this.contentInactive.hashCode() + xg.iobyxmoadg(this.content, xg.iobyxmoadg(this.headerInactive, xg.iobyxmoadg(this.header, xg.iobyxmoadg(this.buttonLogoInactive, this.buttonLogo.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        return "ButtonBnplParts(buttonLogo=" + this.buttonLogo + ", buttonLogoInactive=" + this.buttonLogoInactive + ", header=" + this.header + ", headerInactive=" + this.headerInactive + ", content=" + this.content + ", contentInactive=" + this.contentInactive + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
        parcel.writeString(this.buttonLogo);
        parcel.writeString(this.buttonLogoInactive);
        parcel.writeString(this.header);
        parcel.writeString(this.headerInactive);
        parcel.writeString(this.content);
        parcel.writeString(this.contentInactive);
    }
}
