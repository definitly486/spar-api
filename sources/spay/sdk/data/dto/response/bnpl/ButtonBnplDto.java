package spay.sdk.data.dto.response.bnpl;

import kk.xg;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.pd;
import spay.sdk.data.dto.response.DataDtoInterface;
import spay.sdk.domain.model.response.bnpl.ButtonBnpl;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001b"}, d2 = {"Lspay/sdk/data/dto/response/bnpl/ButtonBnplDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/bnpl/ButtonBnpl;", "activeButtonLogo", "", "inactiveButtonLogo", "header", "content", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActiveButtonLogo", "()Ljava/lang/String;", "getContent", "getHeader", "getInactiveButtonLogo", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ButtonBnplDto implements DataDtoInterface<ButtonBnpl> {

    @ppxfxbqfkf("activeButtonLogo")
    private final String activeButtonLogo;

    @ppxfxbqfkf("content")
    private final String content;

    @ppxfxbqfkf("header")
    private final String header;

    @ppxfxbqfkf("inactiveButtonLogo")
    private final String inactiveButtonLogo;

    public ButtonBnplDto(String activeButtonLogo, String inactiveButtonLogo, String str, String str2) {
        zdlpuopuiu.btonecajqb(activeButtonLogo, "activeButtonLogo");
        zdlpuopuiu.btonecajqb(inactiveButtonLogo, "inactiveButtonLogo");
        this.activeButtonLogo = activeButtonLogo;
        this.inactiveButtonLogo = inactiveButtonLogo;
        this.header = str;
        this.content = str2;
    }

    public static /* synthetic */ ButtonBnplDto copy$default(ButtonBnplDto buttonBnplDto, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = buttonBnplDto.activeButtonLogo;
        }
        if ((i13 & 2) != 0) {
            str2 = buttonBnplDto.inactiveButtonLogo;
        }
        if ((i13 & 4) != 0) {
            str3 = buttonBnplDto.header;
        }
        if ((i13 & 8) != 0) {
            str4 = buttonBnplDto.content;
        }
        return buttonBnplDto.copy(str, str2, str3, str4);
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

    public final ButtonBnplDto copy(String activeButtonLogo, String inactiveButtonLogo, String header, String content) {
        zdlpuopuiu.btonecajqb(activeButtonLogo, "activeButtonLogo");
        zdlpuopuiu.btonecajqb(inactiveButtonLogo, "inactiveButtonLogo");
        return new ButtonBnplDto(activeButtonLogo, inactiveButtonLogo, header, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonBnplDto)) {
            return false;
        }
        ButtonBnplDto buttonBnplDto = (ButtonBnplDto) other;
        return zdlpuopuiu.eablkybsjg(this.activeButtonLogo, buttonBnplDto.activeButtonLogo) && zdlpuopuiu.eablkybsjg(this.inactiveButtonLogo, buttonBnplDto.inactiveButtonLogo) && zdlpuopuiu.eablkybsjg(this.header, buttonBnplDto.header) && zdlpuopuiu.eablkybsjg(this.content, buttonBnplDto.content);
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
        int iIobyxmoadg = xg.iobyxmoadg(this.inactiveButtonLogo, this.activeButtonLogo.hashCode() * 31, 31);
        String str = this.header;
        int iHashCode = (iIobyxmoadg + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.content;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ButtonBnplDto(activeButtonLogo=" + this.activeButtonLogo + ", inactiveButtonLogo=" + this.inactiveButtonLogo + ", header=" + this.header + ", content=" + this.content + ")";
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    public ButtonBnpl toModel() {
        String str = this.activeButtonLogo;
        String str2 = this.inactiveButtonLogo;
        String str3 = this.header;
        if (str3 == null) {
            throw new pd("header");
        }
        String str4 = this.content;
        if (str4 != null) {
            return new ButtonBnpl(str, str2, str3, str4);
        }
        throw new pd("content");
    }
}
