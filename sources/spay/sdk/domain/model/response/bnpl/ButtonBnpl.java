package spay.sdk.domain.model.response.bnpl;

import android.os.Parcel;
import android.os.Parcelable;
import kk.xg;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lspay/sdk/domain/model/response/bnpl/ButtonBnpl;", "Landroid/os/Parcelable;", "", "activeButtonLogo", "inactiveButtonLogo", "header", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lspay/sdk/domain/model/response/bnpl/ButtonBnpl;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getActiveButtonLogo", "getInactiveButtonLogo", "getHeader", "getContent", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ButtonBnpl implements Parcelable {
    public static final Parcelable.Creator<ButtonBnpl> CREATOR = new Creator();
    private final String activeButtonLogo;
    private final String content;
    private final String header;
    private final String inactiveButtonLogo;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ButtonBnpl> {
        @Override // android.os.Parcelable.Creator
        public final ButtonBnpl createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ButtonBnpl(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonBnpl[] newArray(int i13) {
            return new ButtonBnpl[i13];
        }
    }

    public ButtonBnpl(String activeButtonLogo, String inactiveButtonLogo, String header, String content) {
        zdlpuopuiu.btonecajqb(activeButtonLogo, "activeButtonLogo");
        zdlpuopuiu.btonecajqb(inactiveButtonLogo, "inactiveButtonLogo");
        zdlpuopuiu.btonecajqb(header, "header");
        zdlpuopuiu.btonecajqb(content, "content");
        this.activeButtonLogo = activeButtonLogo;
        this.inactiveButtonLogo = inactiveButtonLogo;
        this.header = header;
        this.content = content;
    }

    public static /* synthetic */ ButtonBnpl copy$default(ButtonBnpl buttonBnpl, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = buttonBnpl.activeButtonLogo;
        }
        if ((i13 & 2) != 0) {
            str2 = buttonBnpl.inactiveButtonLogo;
        }
        if ((i13 & 4) != 0) {
            str3 = buttonBnpl.header;
        }
        if ((i13 & 8) != 0) {
            str4 = buttonBnpl.content;
        }
        return buttonBnpl.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActiveButtonLogo() {
        return this.activeButtonLogo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInactiveButtonLogo() {
        return this.inactiveButtonLogo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final ButtonBnpl copy(String activeButtonLogo, String inactiveButtonLogo, String header, String content) {
        zdlpuopuiu.btonecajqb(activeButtonLogo, "activeButtonLogo");
        zdlpuopuiu.btonecajqb(inactiveButtonLogo, "inactiveButtonLogo");
        zdlpuopuiu.btonecajqb(header, "header");
        zdlpuopuiu.btonecajqb(content, "content");
        return new ButtonBnpl(activeButtonLogo, inactiveButtonLogo, header, content);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonBnpl)) {
            return false;
        }
        ButtonBnpl buttonBnpl = (ButtonBnpl) other;
        return zdlpuopuiu.eablkybsjg(this.activeButtonLogo, buttonBnpl.activeButtonLogo) && zdlpuopuiu.eablkybsjg(this.inactiveButtonLogo, buttonBnpl.inactiveButtonLogo) && zdlpuopuiu.eablkybsjg(this.header, buttonBnpl.header) && zdlpuopuiu.eablkybsjg(this.content, buttonBnpl.content);
    }

    public final String getActiveButtonLogo() {
        return this.activeButtonLogo;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getInactiveButtonLogo() {
        return this.inactiveButtonLogo;
    }

    public int hashCode() {
        return this.content.hashCode() + xg.iobyxmoadg(this.header, xg.iobyxmoadg(this.inactiveButtonLogo, this.activeButtonLogo.hashCode() * 31, 31), 31);
    }

    public String toString() {
        return "ButtonBnpl(activeButtonLogo=" + this.activeButtonLogo + ", inactiveButtonLogo=" + this.inactiveButtonLogo + ", header=" + this.header + ", content=" + this.content + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
        parcel.writeString(this.activeButtonLogo);
        parcel.writeString(this.inactiveButtonLogo);
        parcel.writeString(this.header);
        parcel.writeString(this.content);
    }
}
